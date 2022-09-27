package chap10.section3

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.lang.Exception

fun main() {
    val outString: String = "안녕하세요!\tHello\r\nWorld!."  // CR LF
    val path = "D:\\test\\testfile.txt"

    val file = File(path)
    val printWriter = PrintWriter(file)

    printWriter.println(outString)  // 파일에 출력
    printWriter.close()

    // File(path).printWriter().use { it.println(outString) }
    // File(path).bufferedWriter().use { it.println(outString) }
}