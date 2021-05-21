package com.synavos.retrofit.data.network.response

data class Data(
    val _id: String,
    val address: String,
    val cnic: String,
    val contactNumber: String,
    val dateOfJoining: String,
    val dob: String,
    val email: String,
    val eventSlotIds: List<Any>,
    val gender: String,
    val name: String,
    val organizationId: String,
    val organizationName: String,
    val profileImage: ProfileImage,
    val role: Role,
    val username: String,
    val uuid: String
)