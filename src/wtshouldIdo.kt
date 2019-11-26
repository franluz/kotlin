import java.util.*

fun main() {
 //   print(whatShouldIDoToday("sad", "rainy", 0, true))
    valores(34)
}


fun getSexo(): String {
    return "F"
}

fun valores(idade: Int, nome: String = "Fran", sexo: String = getSexo()) {
 print("Eu sou ${nome} eu tenho ${idade} meu sexo é ${sexo}")
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "sunny",
    temperature: Int = 24,
    isGirlFriendAtHome: Boolean = false
) =
    when {
        mood == "happy" && weather == "sunny" && !isGirlFriendAtHome -> "go for a walk"
        isGirlFriendAtHome -> "Stay with  Jess"
        mood == "sad" && weather == "rainy" && temperature == 0 && !isGirlFriendAtHome -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "Stay home and read."
    }