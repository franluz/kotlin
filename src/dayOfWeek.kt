import java.time.LocalDateTime
import java.util.*
import java.util.Calendar.MONDAY

fun main(args: Array<String>) {

    feedTheFish()
}

fun getDirtySensor() = 20
fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensor()
) = when {
    day == "Thusday" -> true
    temperature > 30 -> true
    dirty > 20 -> true
    else -> false
}

fun feedTheFish() {
    var day = randomDay()
    print("${fishFood(day)} this is what fish  eats at ${day}")
    swim(50, "slow")
    if (shouldChangeWater(day, 20, 50)) {
        print("Change the water today")
    }

}

fun swim(time: Int, speed: String = "Fasta") {
    println("swinnming  $speed")
}

fun fitMoreFish(tankSize: Int, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true) {
    var ltankSize: Int = if (hasDecorations) (tankSize * 0.8).toInt() else tankSize
    for (peixeSize in currentFish) {
        ltankSize = ltankSize.minus(peixeSize)
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flackes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "graduled"
        "Friday" -> "Saturday"
        "Sunday" -> "plankton"
        else -> "Food"
    }

}