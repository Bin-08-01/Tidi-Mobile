package com.example.tidimobile.model


data class UserLoginModel(
    val username: String? = null,
    val password: String? = null
)

data class UserLoginResponseModel(
    val message: String? = null,
    val user: UserLoginObject? = null,
    val token: TokenModel? = null
) {
    data class UserLoginObject(
        val _id: String? = null,
        val firstName: String? = null,
        val lastName: String? = null,
        val username: String? = null,
        val email: String? = null,
        val gender: String? = null,
        val admin: Boolean? = null,
        val avatar: String? = null,
        val birthday: String? = null,
        val bio: String? = null,
        val createdAt: String? = null
    )

}

data class UserRegisterModel(
    val firstName: String? = null,
    val lastName: String? = null,
    val username: String? = null,
    val email: String? = null,
    val gender: String? = null,
    val password: String? = null,
)

data class ResponseMessage(
    val message: String? = null
)

data class UserChangedModel(
    val firstName: String? = null,
    val lastName: String? = null,
    val email: String? = null,
    val gender: String? = null,
    val birthday: String? = null,
    val bio: String? = null,
)

data class UserEditResponse(
    val user: UserModelEdit? = null,
    val message: String? = null,
) {
    data class UserModelEdit(
        val firstName: String? = null,
        val lastName: String? = null,
        val email: String? = null,
        val gender: String? = null,
        val birthday: String? = null,
        val bio: String? = null,
    )
}

data class UserChangePwdModel(
    val oldPassword: String? = null,
    val password: String? = null
)

data class AvatarModel(
    val avatar: String? = null
)

//data class UserSearchModel(
//    val users: ArrayList<UserSearch>? = null
//) {
//    data class UserSearch(
//        val _id: String? = null,
//        val firstName: String? = null,
//        val lastName: String? = null
//    )
//}

data class SearchModel(
    val data: DataModel? = null
) {
    data class DataModel(
        val blogs: ArrayList<BlogSearchModel>? = null,
        val users: ArrayList<UserSearchModel>? = null
    ) {
        data class BlogSearchModel(
            val _id: String? = null,
            val title: String? = null
        )

        data class UserSearchModel(
            val _id: String? = null,
            val firstName: String? = null,
            val lastName: String? = null,
            val avatar: String? = null
        )
    }
}

data class UserInfoModel(
    val user: UserModelEdit? = null,
    val message: String? = null,
) {
    data class UserModelEdit(
        val _id: String? = null,
        val firstName: String? = null,
        val lastName: String? = null,
        val email: String? = null,
        val gender: String? = null,
        val birthday: String? = null,
        val bio: String? = null,
        val avatar: String? = null
    )
}