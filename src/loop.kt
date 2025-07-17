fun main() {
    //While loop

    var count = 45
    while(count <= 50){
        println("Number is $count")
        count++
    }
    println()

    var numeral = 10
    while (numeral >= 5){
       println("Number is $numeral")
       numeral--
    }

    println()

    //Do while Loop
    var x = 1
    do {
        println("Number is $x")
        x++
    }
        while (x <= 5)

    //For Loop
    for (num in 30..40){
        println("Number is $num")
    }

    println()

        for (letter in 'a'..'d'){
            println("Letter is $letter")
        }
    println()
    //Break
    var y = 0
    while (y < 10) {
        println(y)
        y++
        if (y == 4) {
            break
        }
      println()

      //Continue
        var z = 0
        while (z < 10) {
            if (z == 4) {
                z++
                continue
            }
            println(z)
            z++
        }




    }


}