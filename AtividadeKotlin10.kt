fun main(){
    println("Digite a temperatura em Celsius")
    val x = readLine()!!.toFloat()  
    val fah = (x * 9/5) + 32
    
    println("A temperature em fahrenheit é : $fah")
}