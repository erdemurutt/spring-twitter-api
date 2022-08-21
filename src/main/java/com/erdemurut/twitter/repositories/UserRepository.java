package com.erdemurut.twitter.repositories;

import com.erdemurut.twitter.model.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
