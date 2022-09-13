package chap02.section3

fun main() {
    val res1 = funcParam(3, 2, ::sum)
    println(res1)   // 5

    hello(::text)   // Hi! Hello World

    val likeLambda = ::sum
    println(likeLambda(6, 6))   // 12
}

fun sum(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("Hello", "World"))
}