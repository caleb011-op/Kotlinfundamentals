fun main() {

    var text = "Hello world"
    var firstname = "Jeff"
    var lastname = "Koinange"

    println(text)
    println(text[1])

    println(firstname +  lastname)
    println(firstname + " " + lastname) //String concatention

    //Modifying a string
   println(text.uppercase())
    println(firstname.lowercase())

      //String Interpolation
      println("My Fullname is $firstname $lastname")


}