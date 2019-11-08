package ec.solmedia.pppredictor

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class InformationValidationTest {

    @Test
    fun testLicencePlateNumber() {
        assertTrue(validateLicencePlateNumber("PTR3431"))
        assertFalse(validateLicencePlateNumber("PTR343"))
        assertFalse(validateLicencePlateNumber("PTR34"))
        assertFalse(validateLicencePlateNumber("PTR3"))
        assertFalse(validateLicencePlateNumber("PTR"))
        assertFalse(validateLicencePlateNumber("PT"))
        assertFalse(validateLicencePlateNumber("P"))
        assertFalse(validateLicencePlateNumber("343PKR"))
        assertFalse(validateLicencePlateNumber("ERTYUI"))
        assertFalse(validateLicencePlateNumber("P2O1P2T"))
        assertFalse(validateLicencePlateNumber("*&@!!:><"))
        assertFalse(validateLicencePlateNumber("4231223"))
        assertFalse(validateLicencePlateNumber(""))
    }

    @Test
    fun testDate() {
        assertTrue(validateDate("02/06/2011"))
        assertTrue(validateDate("15/11/1998"))
        assertTrue(validateDate("30/08/2007"))
        assertFalse(validateDate("29/02/2011"))
        assertFalse(validateDate("31/11/2019"))
        assertFalse(validateDate("43/25/01"))
        assertFalse(validateDate("SASDSDSA"))
        assertFalse(validateDate("12312321"))
        assertFalse(validateDate("4332PSW"))
    }

    @Test
    fun testTime() {
        assertTrue(validateTime("13:32"))
        assertTrue(validateTime("02:18"))
        assertFalse(validateTime("892:2"))
        assertFalse(validateTime("13:62"))
        assertFalse(validateTime("24:07"))
        assertFalse(validateTime("5:9"))
        assertFalse(validateTime("5:921"))
        assertFalse(validateTime("12:32:21"))
        assertFalse(validateTime("98sdas"))
        assertFalse(validateTime("092121"))
        assertFalse(validateTime(""))
    }
}