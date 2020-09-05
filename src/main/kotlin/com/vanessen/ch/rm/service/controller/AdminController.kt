package com.vanessen.ch.rm.service.controller

import com.vanessen.ch.rm.service.service.RecipeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AdminController {

    @Autowired
    lateinit var recipeService: RecipeService;

    companion object {
        const val PATH_VERSION_V1 = "/v1"
        const val ADMIN_PATH: String = "$PATH_VERSION_V1/admin"
        const val CREATE_PATH: String = "$ADMIN_PATH/create-data"
    }


    @GetMapping(path = [CREATE_PATH])
    fun generateStaticRecipes(){
        recipeService.generateStaticContent();
    }
    
}