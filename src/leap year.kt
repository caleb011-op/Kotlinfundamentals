fun main() {
    print("Enter a year: ")
    val year = readLine()?.toIntOrNull()

    if (year == null) {
        println("Invalid input. Please enter a valid year.")
        return
    }

    if (isLeapYear(year)) {
        println("$year is a leap year.")
    } else {
        println("$year is not a leap year.")
    }
}

fun isLeapYear(year: Int): Boolean {
    // A year is leap if:
    // divisible by 400 OR (divisible by 4 and not divisible by 100)
    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)
}
