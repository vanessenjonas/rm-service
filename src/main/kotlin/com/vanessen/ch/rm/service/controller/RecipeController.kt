package com.vanessen.ch.rm.service.controller

import org.springframework.web.bind.annotation.RestController

@RestController
class RecipeController {

    companion object {
        const val PATH_VERSION_V1 = "/v1"
        const val RECIPE_PATH: String = "$PATH_VERSION_V1/recipes"
        const val ID_RECIPE_PATH: String = "$RECIPE_PATH/{id}"
    }



}