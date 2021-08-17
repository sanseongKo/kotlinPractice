package com.example.myapplication

fun main(){
    helloWorld()
    println(add(4, 5))

    //3. String Template
    val name = "KO"
    val lastName = "KO"
    println("my name is ${name + lastName}I'm ?")//대괄호 안은 모두 변수로 알고 있음 $를 쓰고 싶을 땐 \를 쓴다


}

fun helloWorld(){
    println("Hello World")
}

fun add(a:Int, b:Int) : Int{
    return a+b
}

//val 과 var
//val = 밸류 (값)
//타입값을 정해주지 않아도 타입값을 알 수 있기 때문에 생략 가능 ex val a = 10
fun hi(){
    val a : Int = 10 // 값 변경 불가
    var b : Int = 9 // 값 변경 가능
}
//리턴할 땐 리턴타입을 지정할 필요가 없지만 리턴할 것이 있으면 리턴값을 써줘야 한다.