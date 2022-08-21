package com.erdemurut.twitter.repositories;

import com.erdemurut.twitter.model.entity.Tweet;
import org.springframework.data.repository.CrudRepository;

public interface TweetRepository extends CrudRepository<Tweet, String> {
}
