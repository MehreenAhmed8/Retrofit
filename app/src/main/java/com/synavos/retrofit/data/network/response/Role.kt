package com.synavos.retrofit.data.network.response

data class Role(
    val _id: String,
    val createdAt: String,
    val isPlatformMaster: Boolean,
    val organizationId: String,
    val organizationalMaster: Boolean,
    val permissions: List<Permission>,
    val roleName: String
)