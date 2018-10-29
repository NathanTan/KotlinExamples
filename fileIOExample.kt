import java.lang.ThreadLocal
import java.util.concurrent.ThreadLocalRandom
import java.io.File

fun main(args: Array<String>) {
File("./testFile.txt").appendText("TestText")
}

