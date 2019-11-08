package ec.solmedia.pppredictor

import java.util.*

class App {

    fun enterInformation() =
            Scanner(System.`in`).use {
                print("Enter a licence plate number (ABDC123): ")
                val licencePlateNumber = it.next()

                print("Enter a date (dd/MM/yyyy): ")
                val date = it.next()

                print("Enter a time (17:31): ")
                val time = it.next()

                Information(licencePlateNumber, date, time)
            }
}

fun main() {
    App().enterInformation()
}
