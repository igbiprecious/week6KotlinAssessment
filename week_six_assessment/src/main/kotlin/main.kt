fun main() {
    println(inLove(17, 22))
}
fun inLove(num1:Int, num2:Int): Boolean {
    return ((num1 % 2 == 0) && (num2 % 2 != 0)) || ((num1 % 2 != 0) && (num2 % 2 == 0))
}