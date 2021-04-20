package com.petruciostech.visoreciclavel

class User {
    private var UserName:String

    constructor(UserName: String) {
        this.UserName = UserName
    }

    fun getUserName():String{
        return UserName
    }

}