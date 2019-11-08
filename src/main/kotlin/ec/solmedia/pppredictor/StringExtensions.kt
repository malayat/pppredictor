package ec.solmedia.pppredictor

import java.time.LocalDate
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun String.toLocalDate(): LocalDate = LocalDate.parse(this, DateTimeFormatter.ofPattern(ConstantsUtil.DATE_PATTERN))

fun String.toLocalTime(): LocalTime = LocalTime.parse(this, DateTimeFormatter.ofPattern(ConstantsUtil.TIME_PATTERN))