
import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first number: ")
    val num1 = scanner.nextDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = scanner.next()[0] // Read a single character

    print("Enter second number: ")
    val num2 = scanner.nextDouble()

    val result = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        '*' -> num1 * num2
        '/' -> {
            if (num2 != 0.0) num1 / num2 else {
                println("Error: Division by zero")
                return
            }
        }
        else -> {
            println("Invalid operator")
            return
        }
    }

    println("Result: $result")
}
