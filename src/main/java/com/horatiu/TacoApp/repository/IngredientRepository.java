package com.horatiu.TacoApp.repository;

import java.util.Optional;

import com.horatiu.TacoApp.Model.Ingredient;

public interface IngredientRepository {
	
	Iterable<Ingredient> findAll();
	
	Optional<Ingredient> findById(String id);
	
	Ingredient save(Ingredient ingredient);
}
