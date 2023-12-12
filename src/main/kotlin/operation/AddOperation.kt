package operation

import abstract.AbstractOperation

class AddOperation : AbstractOperation {
    private val operator = '+'
    override fun getOperator() = operator
    override fun operate(x: Int, y: Int): Double = (x + y).toDouble()
}