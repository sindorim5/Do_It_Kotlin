package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")
        person.apply { this.skills = "Swift" }  // this는 person 객체
    println(person)

    val returnObj = person.apply {
        name = "Sean"   // this는 생략할 수 있음
        skills = "Java" // this 없이 객체의 멤버에 여러 번 접근
    }
    println(person)
    println(returnObj)
}
/*
출력
Person(name=Kildong, skills=Swift)
Person(name=Sean, skills=Java)
Person(name=Sean, skills=Java)
 */