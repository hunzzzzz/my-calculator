package operation

import abstract.AbstractOperation

class MultiplyOperation : AbstractOperation {
    override fun operate(x: Int, y: Int) = (x * y).toDouble()
}