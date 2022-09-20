package chap10.section1

fun main() {
    val calc = Calc()
    var result = 0 // 외부의 변수
    calc.addNum(2, 3) { x, y -> result = x + y }
    println(result)

    fun filteredNames(length: Int) {
        val names = arrayListOf("Kim", "Hong", "Go", "Hwang", "Jeon")
        val filterResult = names.filter {
            it.length == length // 바깥의 length에 접근
        }
        println(filterResult)
    }
    filteredNames(4)    // [Hong, Jeon]

}

class Calc {
    fun addNum(a: Int, b: Int, add: (Int, Int) -> Unit) {
        add(a, b)    // 람다식 add에는 변환값이 없다
    }
}


