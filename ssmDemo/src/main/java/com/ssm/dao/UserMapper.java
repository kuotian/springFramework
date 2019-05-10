package com.ssm.dao;

import com.ssm.model.User;

public interface UserMapper {

    User findUserById(int id);
}
