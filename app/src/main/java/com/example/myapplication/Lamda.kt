package com.example.myapplication

//1. Lamda
//람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수이다.
// 1) 메소드의 파라미터롤 넘겨줄 수 있다.
// 2) return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lamdaName : Type = {argumentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}

val nameAge = {name : String, age : Int ->
    "my name is ${name} I'm ${age}"
}

fun main() {
    println(square(12))
    println(nameAge("Ko", 23))
    var a = "joyce said "
    var b = "mac said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("ariana", 27))
    println(calculateGrade(971))

    val lamda = {number : Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({it >3.22}))
}

//확장함수

var pizzaIsGreat : String.() -> String = {
    this +"Pizza is the best"
}

fun extendString(name:String, age:Int) :String {
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

//람다의 Return
val calculateGrade : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70->"pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 2가지 방법
fun invokeLamda(lamda : (Double) -> Boolean) : Boolean{
    return lamda(5.2343)
}

//pojo