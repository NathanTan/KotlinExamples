import java.lang.ThreadLocal
import java.util.concurrent.ThreadLocalRandom

fun main(args: Array<String>) {
testFun()
testFun()
testFun()
testFun()
}


fun testFun() {
val randomInteger = ThreadLocalRandom.current().nextInt(0, 999999999)
println(randomInteger)
buildString()
}

fun buildString() {
val stringLength = ThreadLocalRandom.current().nextInt(8,12)
val source = "QWERTYUIOPASDFGHJKLZXCVBNM"
var randInts = IntArray(stringLength) { ThreadLocalRandom.current().nextInt(8,12)}
println(randInts.asSequence().map(source::get).joinToString(""))
}

