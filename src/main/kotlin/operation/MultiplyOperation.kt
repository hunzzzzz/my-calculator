package operation

import abstract.AbstractOperation

class MultiplyOperation : AbstractOperation {
    private val operator = 'X'
    override fun getOperator() = operator
    override fun operate(x: Int, y: Int) = (x * y).toDouble()
}