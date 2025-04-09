package jlin2.examples.localtestinggroup6

import jlin2.examples.localtesting.EmailValidator
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import org.junit.Test

class EmailValidatorTest {

    @Test
    fun testValidEmailAddressFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))

    }
    @Test
    fun testValidSubdomainFormat() {
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }
    @Test
    fun testIncorrectDomain() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
    }

    @Test
    fun testIncorrectEmailFormat() {
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
    }

    @Test
    fun testEmailWithoutUsername() {
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
    }

    @Test
    fun testEmailWithoutDomain() {
        assertFalse(EmailValidator.isValidEmail("testing123"))
    }

    @Test
    fun testEmailEmpty() {
        assertFalse(EmailValidator.isValidEmail(""))
    }

    @Test
    fun testEmailNull() {
        assertFalse(EmailValidator.isValidEmail(null))
    }

}