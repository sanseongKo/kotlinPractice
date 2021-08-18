package com.example.myapplication

data class Ticket(val airlineName : String, val name : String, var flightDate : String, var seatNumber : Int)
//toString(), hashcode(), equals(), copy()
class TicketNormal(val airlineName : String, val name : String, var flightDate : String, var seatNumber : Int)

fun main() {
    val ticketA = Ticket("koreanAir", "KO", "2020-02-16", 14)
    val ticketB = TicketNormal("koreanAir", "KO", "2020-02-16", 14)

    println(ticketA)
    println(ticketB)
}