package com.erdemurut.twitter.model.entity;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@Document
public class Tweet {
	private String tweetId;
	private String context;
	private LocalDate createDate;
	private long userId;
	private User user;

	private List<Tweet> tweets;
}
