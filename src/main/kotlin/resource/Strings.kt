package resource

class Strings {
    companion object {
        const val greeting: String = "========== My Calculator 에서 오신 것을 환영합니다. =========="
        const val chooseOptions: String = "원하는 기능을 선택하세요. ([1] 덧셈, [2] 뺄셈, [3] 곱셈, [4] 나눗셈 [0] 계산기 종료) : "
        const val wrongOption: String = "잘못된 값을 입력하셨습니다. 다시 입력해주세요."
        const val getNumber: String = "번째 숫자를 입력하세요 : "
        const val cannotDivideByZero: String = "0으로 나눌 수 없습니다."
    }
}