package com.project.cafehub.model

import java.io.Serializable

data class Product (
    var id: String? = null,
    var name: String? = null,
    var price: Long? = null,
    var imageUrl: String? = null,
    var isBestSelling: Boolean? = null,
    var category: String? = null) : Serializable {}
