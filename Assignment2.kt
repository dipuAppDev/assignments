import java.util.Scanner

/**
 * Leap Year program using for loop,range and step
 */

fun main(args:Array<String>){

    var sc = Scanner(System.`in`)
    print("Enter starting year : ")
    var startingYear = sc.nextInt()
    print("Enter Ending Year : ")
    var endingYear = sc.nextInt()
    println("Leap year from $startingYear to $endingYear is : \n")
    for(year in startingYear..endingYear step 2){
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            println("$year is a leap year.")
        }
        else{
            println("$year is not a leap year.")
        }
    }