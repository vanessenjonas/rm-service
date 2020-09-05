package com.vanessen.ch.rm.service.service

import com.vanessen.ch.rm.service.data.repository.RecipeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

data class Recipe(
        val id: String,
        val title: String,
        val subtitle: String?,
        val timeTotal: Int,
        val recipeYield: Int
        );


@Service
class RecipeService {

    @Autowired
    lateinit var recipeRepository: RecipeRepository;

    fun generateStaticContent() {
        val recipes = generateRecipes();
        recipeRepository.saveAll(recipes)
    }

    private fun generateRecipes(): List<Recipe> {
         val RECIPE_1 = Recipe(
                 "1",
                 "Spaghetti Bolo",
                 "Alla Nonna",
                 40,
                 4
         );
        return listOf(RECIPE_1);
    }
}

