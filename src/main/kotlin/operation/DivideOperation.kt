package operation

import abstract.AbstractOperation
import resource.Strings

class DivideOperation : AbstractOperation {
    override fun operate(x: Int, y: Int): Double {
        if (y == 0) throw ArithmeticException(Strings.cannotDivideByZero)
        return x.toDouble() / y.toDouble()
    }
}