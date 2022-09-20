package chap10.section1

fun main() {
    data class Person(var name: String, var skills: String)
    var person = Person("Kildong", "Kotlin")
    val a = person.let {
        it.skills = "Android"
        "success"
    }
    println(person)
    println("a: $a")    // String
    val b = person.also {
        it.skills = "Java"
        "success"
    }
    println(person)
    println("b: $b")    // Person의 객체 b
}
/*
출력
Person(name=Kildong, skills=Android)
a: success
Person(name=Kildong, skills=Java)
b: Person(name=Kildong, skills=Java)
*/