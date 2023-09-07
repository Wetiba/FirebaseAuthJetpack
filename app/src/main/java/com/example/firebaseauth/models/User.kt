package com.example.firebaseauth.models

class User{
    var email:String=""
    var pass:String=""
    var confirmpass:String=""
    var userid:String=""

    constructor(email:String,pass:String,confirmpass:String,userid:String){
        this.email=email
        this.pass=pass
        this.confirmpass=confirmpass
        this.userid=userid

    }
}