package com.john1jan.sslpinning.network

import com.google.gson.annotations.SerializedName

data class GithubUser(

    @SerializedName("login")
    var login: String,
    @SerializedName("avatar_url")
    var avatarUrl: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("bio")
    var bio: String,
    @SerializedName("public_repos")
    var publicRepos: Int,
    @SerializedName("followers")
    var followers: Int,
    @SerializedName("following")
    var following: Int
) {
    fun getfollowers(): String {
        return "Followers " + followers
    }


    fun getfollowing(): String {
        return "Following " + following
    }
}