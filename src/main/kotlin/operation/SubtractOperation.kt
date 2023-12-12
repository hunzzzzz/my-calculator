package operation

import abstract.AbstractOperation

class SubtractOperation : AbstractOperation {
    override fun operate(x: Int, y: Int) = (x - y).toDouble()
}