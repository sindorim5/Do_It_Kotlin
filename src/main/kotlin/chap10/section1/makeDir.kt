package chap10.section1

// 기존의 디렉터리 생성 함수
//fun makeDir(path: String): File {
//    val result = File(path)
//    result.mkdirs()
//    return result
//}
//
//// let()과 alse()를 통해 개선된 함수
//fun makeDir(path: String) = path.let{ File(it) }.also { it.mkdirs() }