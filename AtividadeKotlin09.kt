fun main(){
    println("Digite a temperatura em fahrenheit")
    val x = readLine()!!.toFloat()  
    val fah =  5 * ((x-32) / 9)
    
    println("A temperature em Celsius é : $fah")
}