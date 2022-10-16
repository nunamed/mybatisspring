package com.Jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy implements InvocationHandler{
    private TestDao testDao;
    private Object createProxy(TestDao testDao){
        this.testDao=testDao;
        return Proxy.newProxyInstance(JDKDynamicProxy.class.getClassLoader(),testDao.getClass().getInterfaces(), this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object obj = method.invoke(testDao, args);
        return obj;
    }
    public static void main(String[] args) {
        JDKDynamicProxy jdkpProxy=new JDKDynamicProxy();
        TestDao testDao =new TestDaoImpl();
        TestDao testDaoAdvice=(TestDao)jdkpProxy.createProxy(testDao);
        testDaoAdvice.save();
    }
}