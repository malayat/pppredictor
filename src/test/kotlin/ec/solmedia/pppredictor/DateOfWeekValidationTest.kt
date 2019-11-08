package ec.solmedia.pppredictor

import org.junit.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class DateOfWeekValidationTest {

    @Test
    fun testRestrictionToCirculateDayOfWeek() {
        assertTrue(restrictionToCirculateDayOfWeek("04/11/2019", "PTR0731"))
        assertTrue(restrictionToCirculateDayOfWeek("04/11/2019", "XBA1512"))
        assertTrue(restrictionToCirculateDayOfWeek("05/11/2019", "PTR0733"))
        assertTrue(restrictionToCirculateDayOfWeek("05/11/2019", "XBA1514"))
        assertTrue(restrictionToCirculateDayOfWeek("06/11/2019", "PTR0735"))
        assertTrue(restrictionToCirculateDayOfWeek("06/11/2019", "XBA1516"))
        assertTrue(restrictionToCirculateDayOfWeek("07/11/2019", "PTR0737"))
        assertTrue(restrictionToCirculateDayOfWeek("07/11/2019", "XBA1518"))
        assertTrue(restrictionToCirculateDayOfWeek("08/11/2019", "PTR0739"))
        assertTrue(restrictionToCirculateDayOfWeek("08/11/2019", "XBA1510"))
        assertFalse(restrictionToCirculateDayOfWeek("09/11/2019", "PTR0734"))
        assertFalse(restrictionToCirculateDayOfWeek("09/11/2019", "XBA1512"))
        assertFalse(restrictionToCirculateDayOfWeek("10/11/2019", "PTR0736"))
        assertFalse(restrictionToCirculateDayOfWeek("10/11/2019", "XBA1515"))
        assertTrue(restrictionToCirculateDayOfWeek("11/11/2019", "PTR0732"))
        assertFalse(restrictionToCirculateDayOfWeek("11/11/2019", "XBA1514"))
    }

    @Test
    fun testRestrictionToCirculateMorning() {
        assertTrue(restrictionToCirculateMorning("07:02"))
        assertTrue(restrictionToCirculateMorning("08:01"))
        assertTrue(restrictionToCirculateMorning("08:47"))
        assertTrue(restrictionToCirculateMorning("09:14"))
        assertFalse(restrictionToCirculateMorning("10:25"))
        assertFalse(restrictionToCirculateMorning("11:38"))
        assertFalse(restrictionToCirculateMorning("04:30"))
    }

    @Test
    fun testRestrictionToCirculateAfternoon() {
        assertTrue(restrictionToCirculateAfternoon("16:01"))
        assertTrue(restrictionToCirculateAfternoon("17:19"))
        assertTrue(restrictionToCirculateAfternoon("18:59"))
        assertFalse(restrictionToCirculateAfternoon("15:14"))
        assertFalse(restrictionToCirculateAfternoon("21:29"))
        assertFalse(restrictionToCirculateAfternoon("22:25"))
        assertFalse(restrictionToCirculateAfternoon("23:38"))
    }
}