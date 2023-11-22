import java.util.Scanner
fun main(args:Array<String>) {
    /**
     * Program -1 : Grade calculation program
     */
    /*   var sc = Scanner(System.`in`)
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
       }*/


    /**
     * Program -2: Leap Year program
     */
    val sc = Scanner(System.`in`)
    val year:Int = sc.nextInt()
    if((year%4==0)&&(year%100!=0)||(year%400==0)){
        println("$year is a Leap Year.")
    }
    else{
        println("$year is not a Leap Year.")
    }

}