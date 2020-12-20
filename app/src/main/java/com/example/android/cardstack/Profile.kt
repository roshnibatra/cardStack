package com.example.android.cardstack

import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
data class Profile(
    val age: Int,
    val distance: Int,
    val id: Int,
    val name: String,
    val profile_pic: String
)