import java.lang.ThreadLocal
import java.util.concurrent.ThreadLocalRandom
import java.io.File

fun main(args: Array<String>) {

val doIt = 100000000
repeat(doIt) {
            writeSSN()
        }
}

fun getRandomInt():Int {
    return ThreadLocalRandom.current().nextInt(0, 999999999)
}

fun buildString():String {
    val stringLength = ThreadLocalRandom.current().nextInt(8,12)
        val source = "QWERTYUIOPASDFGHJKLZXCVBNM"
        var randInts = IntArray(stringLength) { ThreadLocalRandom.current().nextInt(8,12)}
    return randInts.asSequence().map(source::get).joinToString("")
}

fun writeSSN() {
    File("ssns.txt").appendText(buildString())
        File("ssns.txt").appendText(": ")
        File("ssns.txt").appendText(getRandomInt().toString())
        File("ssns.txt").appendText("\n")
}
