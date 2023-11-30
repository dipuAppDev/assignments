fun main(args:Array<String>){
    pattern90Deg()
    println()
    pattern90DegTop()
    println()
    pyramid()
}
fun pattern90Deg(){
    for(i in 1..7){
        for (j in 1..i){
            print("*"+"  ")
        }
        println()
    }
}
fun pattern90DegTop(){
    for (r in 7 downTo 1){
        for(i in 1..r){
            print("*"+"  ")
        }
        println()
    }
}
fun pyramid(){
    for (r in 1..5){
        for (s in 4 downTo r){
            print(" ")
        }
        for (c in 1..r){
            print(" *")
        }
        println()
    }
}