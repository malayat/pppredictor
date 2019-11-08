package ec.solmedia.pppredictor

import java.util.*

class App {

    fun enterInformation() =
            Scanner(System.`in`).use {
                print("Enter a licence plate number (ABC0123): ")
                val licencePlateNumber = it.next()

                print("Enter a date (dd/MM/yyyy): ")
                val date = it.next()

                print("Enter a time (17:31): ")
                val time = it.next()

                Information(licencePlateNumber, date, time)
            }
}

fun main() {
    val enteredInformation = App().enterInformation()

    val canContinue: Boolean = when (val result = enteredInformation.validate()) {
        is InformationResult.Success -> result.canContinue
        is InformationResult.Error -> {
            println(result.message); false
        }
    }

    if (canContinue) {
        val resultPrediction = restrictionToCirculateDayOfWeek(enteredInformation.date, enteredInformation.licencePlateNumber)
                && (restrictionToCirculateMorning(enteredInformation.time) || restrictionToCirculateAfternoon(enteredInformation.time))

        println("======================================")
        println(if (resultPrediction) "YOU CAN'T BE ON THE ROAD :(" else "YOU CAN BE ON THE ROAD :)")
    }

}
