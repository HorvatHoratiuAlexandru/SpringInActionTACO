package com.horatiu.TacoApp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.horatiu.TacoApp.Model.Ingredient;
import com.horatiu.TacoApp.Model.Ingredient.Type;
import com.horatiu.TacoApp.repository.IngredientRepository;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient>{
	
	//private Map<String,Ingredient> ingredientMap = new HashMap<>();
	private IngredientRepository ingredientRepo;
	
	@Autowired
	public IngredientByIdConverter(IngredientRepository ingredientRepo) {
		this.ingredientRepo = ingredientRepo;
		
		/*
		ingredientMap.put("FLTO",
				new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("COTO",
				new Ingredient("COTO", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("GRBF",
				new Ingredient("GRBF", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("CARN",
				new Ingredient("CARN", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("TMTO",
				new Ingredient("TMTO", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("LETC",
				new Ingredient("LETC", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("CHED",
				new Ingredient("CHED", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("JACK",
				new Ingredient("JACK", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("SLSA",
				new Ingredient("SLSA", "Flour Tortilla", Type.WRAP));
		ingredientMap.put("SRCR",
				new Ingredient("SRCR", "Flour Tortilla", Type.WRAP));
				*/
	}

	@Override
	public Ingredient convert(String id) {
		// TODO Auto-generated method stub
		return ingredientRepo.findById(id).orElse(null);
	}

}
