package operation

import abstract.AbstractOperation

class AddOperation : AbstractOperation {
    override fun operate(x: Int, y: Int): Double = (x + y).toDouble()
}