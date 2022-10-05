package com.horatiu.TacoApp.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.horatiu.TacoApp.Model.Ingredient;

@Repository
public class JdbcIngredientRepository implements IngredientRepository {

	@Override
	public Iterable<Ingredient> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Ingredient> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ingredient save(Ingredient ingredient) {
		// TODO Auto-generated method stub
		return null;
	}

}
