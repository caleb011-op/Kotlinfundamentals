import java.util.Scanner

fun main() {
    println("Enter a number : ")
    val number = readln()?.toIntOrNull()

    if (number !=null) {
        if (number % 2 == 0) {
            println("$number is even")
        } else {
            println("$number is odd")
        }
   

    }







}