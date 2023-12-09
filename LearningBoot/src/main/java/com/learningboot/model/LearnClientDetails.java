package com.learningboot.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class LearnClientDetails {

	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String ip_address;
}
