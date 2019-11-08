package ec.solmedia.pppredictor

import java.time.LocalTime

fun restrictionToCirculateDayOfWeek(date: String, licencePlateNumber: String): Boolean =
        ConstantsUtil.DAY_OF_WEEK_CONFIGURATION[date.toLocalDate().dayOfWeek]
                ?.toList()
                ?.any { it == licencePlateNumber.last() }
                ?: false

fun restrictionToCirculateMorning(time: String) = verifyCirculateMorning(time.toLocalTime())

private fun verifyCirculateMorning(time: LocalTime) =
        ConstantsUtil.MORNING_CONFIGURATION.first.isBefore(time) &&
                ConstantsUtil.MORNING_CONFIGURATION.second.isAfter(time)


fun restrictionToCirculateAfternoon(time: String) = verifyCirculateAfternoon(time.toLocalTime())

private fun verifyCirculateAfternoon(time: LocalTime) =
        ConstantsUtil.AFTERNOON_CONFIGURATION.first.isBefore(time) &&
                ConstantsUtil.AFTERNOON_CONFIGURATION.second.isAfter(time)