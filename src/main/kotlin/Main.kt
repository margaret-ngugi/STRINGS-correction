fun main() {
    school()
    println(sentence("emma" ,20 ))
    println(name("Margaret"))
    person("Marion")


}
//Q1.
fun school(){
    var school = "akirachix"
    println("${school[0]}${school[2]}${school[3]}")
}
//Q2.
fun sentence(name:String,age:Int): String{
    return "Hi,i am $name and i am $age years old."
}
//Q3.
fun name(name: String):Int{
    return name.length

}
//Q4.
fun person(name: String){
    val me= "Margaret"
    if(name == me){
        println("Thats me.")
    }
    else{
        println("I don't know who that is")}

}


