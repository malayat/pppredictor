package ec.solmedia.pppredictor

import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun validateLicencePlateNumber(licencePlateNumber: String) =
        "\\b[a-zA-Z]{3}\\d{4}\\b".toRegex().containsMatchIn(licencePlateNumber)

fun validateDate(date: String) =
        try {
            SimpleDateFormat(ConstantsUtil.DATE_PATTERN).apply {
                isLenient = false
                parse(date)
            }
            true
        } catch (exception: ParseException) {
            false
        }

fun validateTime(time: String) =
        try {
            LocalTime.parse(time, DateTimeFormatter.ofPattern(ConstantsUtil.TIME_PATTERN))
            true
        } catch (exception: DateTimeException) {
            false
        }
