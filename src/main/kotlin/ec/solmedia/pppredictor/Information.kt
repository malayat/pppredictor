package ec.solmedia.pppredictor

class Information(
        val licencePlateNumber: String,
        val date: String,
        val time: String
) {


    fun validate(): InformationResult {
        if (!validateLicencePlateNumber(licencePlateNumber))
            return InformationResult.Error(ConstantsUtil.MSG_ERR_LICENCE_PLATE_NUMBER)

        if (!validateDate(date))
            return InformationResult.Error(ConstantsUtil.MSG_DATE)

        if (!validateTime(time))
            return InformationResult.Error(ConstantsUtil.MSG_TIME)

        return InformationResult.Success(true)
    }
}

sealed class InformationResult {
    data class Success(val canContinue: Boolean) : InformationResult()
    data class Error(val message: String) : InformationResult()
}