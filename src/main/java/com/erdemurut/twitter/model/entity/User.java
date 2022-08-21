package com.erdemurut.twitter.model.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
public class User {

	@Id
	private String userId;

	@Indexed(unique = true)
	private String userName;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private LocalDate createDate;
	private LocalDate updateDate;
	private int friendCount;
	private int followerCount;
}
