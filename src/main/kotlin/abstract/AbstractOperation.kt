package abstract

interface AbstractOperation {
    fun getOperator(): Char
    fun operate(x: Int, y: Int): Double
}