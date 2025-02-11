fun main(){
    println("Quanto você ganha por hora?")
    val x = readLine()!!.toInt()  
    println("Quantas horas você trabalha por dia?")
    val y = readLine()!!.toInt()  
    val salario = (x * y) * 30  
    
    println("Você recebe por mês: $salario")
}