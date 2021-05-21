package com.synavos.retrofit.data.network.response

data class Permission(
    val _id: String,
    val createdAt: String,
    val createdBy: String,
    val fePermission: String,
    val isAvailableForDisplay: Boolean,
    val moduleName: String,
    val parentId: String,
    val preReqs: List<String>,
    val route: List<String>,
    val updatedAt: Any,
    val updatedBy: Any,
    val url: List<Any>
)