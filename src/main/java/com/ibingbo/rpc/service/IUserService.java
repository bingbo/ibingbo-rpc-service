package com.ibingbo.rpc.service;

import com.ibingbo.rpc.service.entity.User;

import java.util.List;

/**
 * Created by bing on 17/6/3.
 */
public interface IUserService {
    User getUser(String name);

    List<User> getUsers(int size);

}
