package com.horatiu.TacoApp.Model;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Taco {
	
	private long id;
	private Date createdAt = new Date();
	@NotNull
	@Size(min=5, message="Name must be at least 5 characters long")
	private String name;
	
	@NotNull
	@Size(min=1, message="You must select at least 1 ingredient")
	private List<Ingredient> ingredients;
}
