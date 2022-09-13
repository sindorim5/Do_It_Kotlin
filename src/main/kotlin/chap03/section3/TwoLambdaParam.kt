package chap02.section3

fun main() {
    twoLambda({a,b -> "First $a $b"}, {"Second $it"})
    twoLambda({a,b -> "First $a $b"}) {"Second $it"}    // 동일한 표현
}

fun twoLambda(first: (String, String) -> String, second: (String) -> String) {
    println(first("OneParam", "TwoParam"))
    println(second("OneParam"))
}