package com.dayuarchi.tool.mybatisgenerator.dao;


import com.dayuarchi.tool.mybatisgenerator.model.UserDomain;

import java.util.List;

public interface UserDao {


    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}