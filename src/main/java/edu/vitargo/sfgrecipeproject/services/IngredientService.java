package edu.vitargo.sfgrecipeproject.services;

import edu.vitargo.sfgrecipeproject.commands.IngredientCommand;

public interface IngredientService {

    IngredientCommand getIngredientByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);
}
