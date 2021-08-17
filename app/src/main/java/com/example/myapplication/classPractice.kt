package com.example.myapplication
//코틀린은 파일이름과 클래스 이름과 일치하지 않아도 되고, 여러 클래스를 넣을 수 있다 한파일에
open class Human (val name:String = "Anonymous"){

    constructor(name:String, age: Int) : this(name){
        println("my name is ${name}, ${age}years old")
    }
    init {
     println("New human has been born!")
    }

    fun eatingCake(){
        println("taste good")
    }

    open fun singASong(){
        println("singing")
    }
}
class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("싱잉")
        println("my name is: ${name}")
    }
}

fun main() {
//    val human = Human("minsu")
//
//    val stranger = Human()
//    human.eatingCake()

    val mom = Human("Kuri", 52)
    val korean = Korean()
    korean.singASong()

//    println("this human's name is ${stranger.name}")
}