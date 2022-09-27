package chap10.section3

import java.io.*

fun main() {
    val path = "D:\\test\\Over the Rainbow.txt"

// 1. FileReader의 이용
    try {
        val read = FileReader(path)
        println(read.readText())
    } catch (e: Exception) {
        println(e.message)
    }
}
