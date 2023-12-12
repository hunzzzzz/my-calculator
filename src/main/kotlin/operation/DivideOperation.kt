package operation

import abstract.AbstractOperation
import resource.Strings

class DivideOperation : AbstractOperation {
    private val operator = '÷'
    override fun getOperator() = operator
    override fun operate(x: Int, y: Int): Double {
        if (y == 0) throw ArithmeticException(Strings.cannotDivideByZero)
        return x.toDouble() / y.toDouble()
    }
}