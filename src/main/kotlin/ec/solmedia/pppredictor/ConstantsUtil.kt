package ec.solmedia.pppredictor

import java.time.DayOfWeek
import java.time.LocalTime

class ConstantsUtil {
    companion object {
        const val DATE_PATTERN = "dd/MM/yyyy"
        const val TIME_PATTERN = "HH:mm"

        val DAY_OF_WEEK_CONFIGURATION: Map<DayOfWeek, Pair<Char, Char>> = mapOf(
                DayOfWeek.MONDAY to Pair('1', '2'),
                DayOfWeek.TUESDAY to Pair('3', '4'),
                DayOfWeek.WEDNESDAY to Pair('5', '6'),
                DayOfWeek.THURSDAY to Pair('7', '8'),
                DayOfWeek.FRIDAY to Pair('9', '0')
        )

        val MORNING_CONFIGURATION = Pair(LocalTime.of(7, 0), LocalTime.of(9, 30))
        val AFTERNOON_CONFIGURATION = Pair(LocalTime.of(16, 0), LocalTime.of(19, 30))
    }
}