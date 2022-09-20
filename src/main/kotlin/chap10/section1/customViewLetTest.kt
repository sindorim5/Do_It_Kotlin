package chap10.section1
//
//// 1.
//val padding = TypedValue.appleDimension(
//    TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics).toInt()
//
//setPadding(padding, 0, padding, 0)
//
//// 2. val padding을 없애서 효율적으로
//TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics)
//        .toInt().let { padding -> setPadding(padding, 0, padding, 0) }
//
//// 3. 인자가 하나 밖에 없으므로 padding을 it으로
//TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16f, resources.displayMetrics)
//        .toInt().let { setPadding(it, 0, it, 0) }