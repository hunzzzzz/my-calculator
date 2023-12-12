package operation

import abstract.AbstractOperation
import resource.Strings

class Calculator {
    private val numberSequence: Map<Int, String> = mapOf(1 to "첫", 2 to "두")

    fun start() {
        var option: String

        println(Strings.greeting)
        while (true) {
            print(Strings.chooseOptions)

            option = readln()
            if (option == "0") return

            when (option) {
                "1" -> startOperation(getNumber(1), getNumber(2), AddOperation())
                "2" -> startOperation(getNumber(1), getNumber(2), SubtractOperation())
                "3" -> startOperation(getNumber(1), getNumber(2), MultiplyOperation())
                "4" -> startOperation(getNumber(1), getNumber(2), DivideOperation())
                else -> println(Strings.wrongOption)
            }
        }
    }

    private fun startOperation(x: Int, y: Int, operation: AbstractOperation) {
        operation.operate(x, y)
    }

    private fun getNumber(sequence: Int): Int {
        print("${numberSequence[sequence]} " + Strings.getNumber)
        return readln().toInt()
    }
}

