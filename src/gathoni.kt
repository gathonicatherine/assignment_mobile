fun main() {
fullName()
student("Cate", 23)
school("AkiraChix")
    println(school("AkiraChix"))
name("Cate")
    name("Cathy")

}
fun fullName() {
    var school="AkiraChix"
    println(school[0])
    println(school[2])
    println(school[3])
}
fun student(num1:String, num2:Int){
    var num1="Cate"
    var num2=23
    println("Hi my name is $num1. I am $num2 years old")

}
fun school(name:String,): Int{
var a=name.length
    return(a)
}
fun name(name:String){
    if(name=="Cate"){
        println("That's me!")

    }
else{
    println("i don't know who that is")
}
}
