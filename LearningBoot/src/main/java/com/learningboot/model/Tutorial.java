package com.learningboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//import nonapi.io.github.classgraph.json.Id;

//import javax.persistence.*;

//import nonapi.io.github.classgraph.json.Id;

/*
 * @Getter
 * 
 * @Setter
 * 
 * @ToString
 */
/*
 * @AllArgsConstructor
 * 
 * @NoArgsConstructor
 */

@Entity
@Table(name = "tutorials")
public class Tutorial {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(length = 128, nullable = false)
	private String title;

	@Column(length = 256)
	private String description;

	@Column(nullable = false)
	private int level;

	@Column
	private boolean published;

	public Tutorial() {

	}

	public Tutorial(String title, String description, int level, boolean published) {
		this.title = title;
		this.description = description;
		this.level = level;
		this.published = published;
	}

	// getters and setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public boolean isPublished() {
		return published;
	}

	public void setPublished(boolean published) {
		this.published = published;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", description=" + description + ", level=" + level
				+ ", published=" + published + "]";
	}
	
}
