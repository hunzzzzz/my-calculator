package operation

import abstract.AbstractOperation

class SubtractOperation : AbstractOperation {
    private val operator = '+'
    override fun getOperator() = operator
    override fun operate(x: Int, y: Int) = (x - y).toDouble()
}