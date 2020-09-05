package com.vanessen.ch.rm.service.data.repository

import com.vanessen.ch.rm.service.service.Recipe
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface RecipeRepository: MongoRepository<Recipe,String> {

}