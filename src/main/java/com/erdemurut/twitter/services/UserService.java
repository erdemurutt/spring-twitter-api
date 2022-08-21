package com.erdemurut.twitter.services;

import com.erdemurut.twitter.model.entity.User;

import java.util.Set;

public interface UserService {
	Set<User> getAllUsers();
}
