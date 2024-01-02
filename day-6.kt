

fun findWays(input: String): Int {
    val regEx = """Time:[\s]*(?<time>[\d\s]*)Distance:[\s]*(?<distance>[\d\s]*)""".toRegex()
    val groups = regEx.matchEntire(input)?.groups
    val time =  parseGroup(groups?.get("time")!!)
    val distance =  parseGroup(groups?.get("distance")!!)

    return time.foldIndexed(1) { index, acc, t ->
        acc * ((1 until t).map {
            (t - it) * it
        }.count { it > distance[index] })
    }
}

fun parseGroup(matchGroup: MatchGroup): List<Int> {
    return matchGroup.value.trim().split("\\s".toRegex()).filter { it.isNotEmpty() }.map { num -> num.trim().toInt() }
}
fun main() {
    val input = """
    Time:        47     70     75     66
    Distance:   282   1079   1147   1062
""".trimIndent()
    println(findWays(input))
}