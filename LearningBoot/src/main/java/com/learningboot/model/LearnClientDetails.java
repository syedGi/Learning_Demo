package com.learningboot.model;

import com.fasterxml.jackson.annotation.JsonProperty;

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

	@JsonProperty("firtNAme")
	private String first_name;
	@JsonProperty("LastNAme")
	private String last_name;
	@JsonProperty("EmAil")
	private String email;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("ipAddress")
	private String ip_address;
}
