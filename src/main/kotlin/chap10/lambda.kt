package chap10

val sum: (Int, Int) -> Int = { x, y -> x + y }
val mul = { x: Int, y: Int -> x * y }


val add: (Int) -> Int = {it + 1}
val isPositive: (Int) -> Boolean = {
    val isPositive = it > 0
    isPositive// 마지막 표현식이 반환됨
}

val isPositiveLabel: (Int) -> Boolean = number@ {
    val isPositive = it > 0
    return@number isPositive  // 라벨을 사용해 반환됨
}