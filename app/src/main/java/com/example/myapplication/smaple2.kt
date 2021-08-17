package com.example.myapplication

fun main() {
    nullcheck()
}
//4. 조건식
fun maxBy(a:Int, b:Int) : Int{
    if(a>b){
        return a
    }else{
        return b
    }

}
fun maxBy2(a:Int, b:Int)= if(a>b) a else b

fun checkNum(score:Int){
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")

    }
    var b = when(score){
        1-> 1
        2-> 2
        else -> 3
    }
    println("b : ${b}")
    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not bad")
        else -> println("okay")
    }
}

//Expression vs Statement -> 뭔가를 만들어 값을 내면 expression 아니면 statement인데 코틀린은 전부 expression이다

//5. Array, List
fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    var arrayList = arrayListOf<Int>()//list의 값은 변경되어도 list의 참조값이 변하지 않기 때문에 val을 써도 무방
    arrayList.add(10)
    arrayList.add(20)

}

//6. 반복문
fun forAndWhile(){
    val student = arrayListOf("joyce", "james", "jenny", "jennifer")

    for(name in student){
        println("${name}")
    }
    var sum : Int = 0
    for( i in 1..100){// step number -> 숫자만큼 띄어가며 반복, downTo 역순, until-> 마지막 숫자를 포함시키지 않음
        sum += i
    }

    for((index, name) in student.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }
    println(sum)

    var index = 0
    while(index <10){
        println("current index: ${index}")
        index++
    }
}

// 7. Nullable / NonNull NonNull타입은 타입을 없애면 안됨
fun nullcheck(){
    //NPE : Null Pointer Exception
    var name: String  = "Ko"

    var nullName : String? = null

    var nameInUpperCase = name.uppercase()

    var nullNameInUpperCase = nullName?.uppercase()//? -> 만약에 null이면 널을 반환 아니면 uppercase를 실행

    //?:
    val lastName :String? = null

    val fullName = name+" " + (lastName?: "NO lastName")
    println(fullName)



}
//!!
fun ignoreNull(str : String?){
    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()

    val email:String? = "tkstjd@naver.com"
    email?.let {//email이 null이면 안의 구문은 실행되지 않는다
        println("my email is ${email}")
    }
}