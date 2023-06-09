package com.example.tidimobile.storage

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import com.example.tidimobile.model.UserEditResponse
import com.example.tidimobile.model.UserLoginResponseModel

class UserPreferences(context: Context) {
    private val sharedPreferences = "UserPref"
    private var preferences: SharedPreferences? = null

    init {
        preferences = context.getSharedPreferences(sharedPreferences, Context.MODE_PRIVATE)
    }

    fun saveInfoUser(userObject: UserLoginResponseModel.UserLoginObject) {
        val editor = preferences!!.edit()
        editor.putString("firstName", userObject.firstName)
        editor.putString("lastName", userObject.lastName)
        editor.putString("email", userObject.email)
        editor.putString("gender", userObject.gender)
        editor.putString("id", userObject._id)
        editor.putString("dayJoined", userObject.createdAt)
        editor.putString("avatar", userObject.avatar)
        editor.putString("username", userObject.username)
        editor.putString("bio", userObject.bio)
        editor.putString("birthday", userObject.birthday)
        userObject.admin?.let { editor.putBoolean("admin", it) }

        editor.apply()
    }

    fun getInfoUser(): UserLoginResponseModel.UserLoginObject {
        return UserLoginResponseModel.UserLoginObject(
            preferences!!.getString("id", ""),
            preferences!!.getString("firstName", ""),
            preferences!!.getString("lastName", ""),
            preferences!!.getString("username", ""),
            preferences!!.getString("email", ""),
            preferences!!.getString("gender", ""),
            preferences!!.getBoolean("admin", false),
            preferences!!.getString("avatar", ""),
            preferences!!.getString("birthday", ""),
            preferences!!.getString("bio", ""),
            preferences!!.getString("dayJoined", ""),
        )
    }

    fun saveInfoEditor(userData: UserEditResponse.UserModelEdit) {
        val editor = preferences!!.edit()

        editor.putString("firstName", userData.firstName)
        editor.putString("lastName", userData.lastName)
        editor.putString("email", userData.email)
        editor.putString("gender", userData.gender)
        editor.putString("bio", userData.bio)
        editor.putString("birthday", userData.birthday)
        editor.apply()

    }

    fun changeAvatar(avatar: String) {
        val editor = preferences!!.edit()
        editor.putString("avatar", avatar)
        editor.apply()
    }

    @SuppressLint("CommitPrefEdits")
    fun clearInfo() {
        preferences!!.edit().clear().apply()
    }
}