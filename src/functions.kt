fun main() {
    //Standard Library Functions/Built-in functions
    var result = Math.sqrt(81.0)
    println("The square root is $result")

    var number = Math.round(67.8)
    println(number)

    school()
    divide()
    student("Caleb",37,"Male")
    student("Jane",27,"female")
    student("Ann",17,"Female")
    student("Joe",56,"Male")

}
//User-defined functions
fun school(){
    println("eMobilis")

}
fun divide(){
    var num1 = 56
    var num2 = 7
    println(num1/num2)
}

//Parameter and Arguments
fun student(name:String, age : Int, gender: String){
    println("$name $age $gender")

}
