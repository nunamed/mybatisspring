package com.mybatisspring;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.pojo.User;
@Repository("userDao")
@Mapper
public interface UserDAO {
    public User SelectUserById(Integer id);
}
