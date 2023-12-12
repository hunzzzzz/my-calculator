package operation

import abstract.AbstractOperation
import resource.Strings

class Calculator {

    fun start() {
        var option: String
        var num1: Int
        var num2: Int

        println(Strings.greeting)
        while (true) {
            println(Strings.chooseOptions)

            option = readln()
            num1 = getTwoNumbers().first
            num2 = getTwoNumbers().second

            when (option) {
                "0" -> return
                "1" -> startOperation(num1, num2, AddOperation())
                "2" -> startOperation(num1, num2, SubtractOperation())
                "3" -> startOperation(num1, num2, MultiplyOperation())
                "4" -> startOperation(num1, num2, DivideOperation())
                else -> println("잘못된 값을 입력하셨습니다. 다시 입력해주세요.")
            }
        }
    }

    private fun startOperation(x: Int, y: Int, operation: AbstractOperation) {
        operation.operate(x, y)
    }

    private fun getTwoNumbers(): Pair<Int, Int> {
        print(Strings.getFirstNum)
        val num1 = readln().toInt()

        print(Strings.getSecondNum)
        val num2 = readln().toInt()

        return Pair(num1, num2)
    }
}

