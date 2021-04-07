fun main() {
names("Iman","AkiraChix","Collumbia","southAsia")
Numbers()
    Robot(17)
    Robot(5)
    Robot(20)
    Multiples()

}
fun Numbers(){
    for (i in 1..100){
        if (i%2!=0)
            println(i)
    }
}
fun names(a:String,b:String,c:String,d:String):Array<String>{
    var p= arrayOf(a,b,c,d)
    for (y in p){
        if (y.length>5)
            println(y)
    }
    return p
}
fun Robot(age:Int){
    if (age<6){
        println("Milk")
    }
    else if (age<15 && age>6){
        println("Fanta")
    }
    else{
        println("cocacola")
    }
}
fun Multiples(){
   for (i in 1..100) {
       println(i)
   }
    for (i in 1..100){
        if (i%3==0){
            println("Fizz")
        }
        if (i%5==0){
            println("Buzz")
        }
    }
    for (i in 1..100){
        if (i%3==0 && i%5==0){
           println("FizzzBuzzzz")
        }
    }
}
