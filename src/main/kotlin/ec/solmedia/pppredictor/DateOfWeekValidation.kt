package ec.solmedia.pppredictor

fun restrictionToCirculateDayOfWeek(date: String, licencePlateNumber: String): Boolean =
        ConstantsUtil.DAY_OF_WEEK_CONFIGURATION[date.toLocalDate().dayOfWeek]
                ?.toList()
                ?.any { it == licencePlateNumber.last() }
                ?: false
