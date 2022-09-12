package chap02.section3

fun main() {
    var a: Any = 1  // Any형 a는 1로 초기화될 때 Int형이 됨
    a = 20L         // Int형인 a는 Long형이 됨
    println("a: $a type: ${a.javaClass}")
    // 출력: a: 20 type: class java.lang.Long
}