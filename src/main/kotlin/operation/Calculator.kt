package operation

import abstract.AbstractOperation
import resource.Strings

class Calculator {
    private val numberSequence: Map<Int, String> = mapOf(1 to "첫", 2 to "두")

    fun start() {
        var option: String
        var num1: Int
        var num2: Int

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
                else -> println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.")
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

