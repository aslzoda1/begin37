import kotlin.math.abs

fun main() {
    val v1 = 60.0
    val v2 = 80.0
    val s = 500.0
    val t = 3.0

    val resultS = abs(s - (v1 + v2) * t)
    println("$t vaqtdan keyin ular orasidagi masofa: $resultS km")
}