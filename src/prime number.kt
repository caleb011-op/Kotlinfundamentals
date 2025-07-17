fun main() {
    print("Enter a number to check if it is prime: ")
    val number = readLine()!!.toInt()

    if (isPrime(number)) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }
}

fun isPrime(num: Int): Boolean {
    if (num <= 1) return false
    if (num == 2) return true
    if (num % 2 == 0) return false

    for (i in 3..Math.sqrt(num.toDouble()).toInt() step 2) {
        if (num % i == 0) return false
    }
    return true
}
