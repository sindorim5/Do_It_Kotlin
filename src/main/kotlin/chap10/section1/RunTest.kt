package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    val returnObj = person.apply {
        name = "Sean"   // this는 생략할 수 있음
        skills = "Java" // this 없이 객체의 멤버에 여러 번 접근
        "success"
    }
    val returnObj2 = person.run {
        this.name = "Dooly"
        this.skills = "C#"
        "success"   // 없으면 Unit이 반환됨
    }
    println(person)
    println("returnObj2: $returnObj2")
}
