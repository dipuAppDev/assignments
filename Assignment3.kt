/**
 * Leap year program using user-defined function
 */
import java.util.Scanner
fun main(args: Array<String>) {
leapYear() // function calling
}
fun leapYear(){
    var sc = Scanner(System.`in`)
    print("Enter starting year = ")
    var startingYear = sc.nextInt()
    print("Enter ending year = ")
    var endingYear = sc.nextInt()
    println("Leap year between $startingYear - $endingYear is : ")
    for (year in startingYear .. endingYear step 2 ){
       if (year!=0){
           if (year % 4 == 0 && year % 100!=0 || year % 400 == 0){
                println("$year is a leap year.")
           }else{
               println("$year is not a leap year.")
           }
       }else{
           println("Invalid year.")
       }
    }
}



/**
 * Grading system program using user-defined function
 */
import java.util.Scanner
fun main(args:Array<String>){
 grade() //function calling
}
 fun grade(){
 var sc = Scanner(System.`in`)
 print("Enter your marks: ")
 var marks:Int = sc.nextInt() // marks input
 if(marks>=0 && marks<=32){
  println("Your grade is : F")
 }
 else if(marks>=33 && marks<=39 ){
  println("Your grade is : D")
 }
 else if (marks>=40 && marks<=49){
  println("Your grade is : C")
 }
 else if (marks>=50 && marks<=59){
  println("Your grade is : B")
 }
 else if (marks>=60 && marks<=69){
  println("Your grade is : A-")
 }
 else if (marks>=70 && marks<=79){
  println("your grade is : A")
 }
 else if (marks>=80 && marks<=89 && marks<=100){
  println("Your grade is : A+")
 }
 else{
  println("Invalid grade!")
 }

}




/**
 * Fibonacci program using user-defined function
 */
import java.util.Scanner
fun main(args: Array<String>) {
    fibonacci() //function calling
}
fun fibonacci() {
    var sc = Scanner(System.`in`)
    println("Enter Fibonacci number range : ")
    var lastNum = sc.nextInt()
    var firstNum = 0
    var secondNum = 1
    for (fibo in 1..lastNum) {
        println(firstNum)
        var next = firstNum + secondNum
        firstNum = secondNum
        secondNum = next
    }
}