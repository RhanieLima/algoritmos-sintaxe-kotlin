fun main(){
    println("Digite o valor do lado do quadrado")
    val x = readLine()!!.toInt()
    val area = (x * x) * 2
    println("O dobro do valor da area é $x² * 2: $area")
}   