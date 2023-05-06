package io.runebox.logger

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ConvertColorTest {


    @Test
    @DisplayName("Should return the original message when no color codes are present")
    fun parseColorWhenNoColorCodesPresent() {
        val message = "This is a test message without any color codes"

        val result = ConvertColor.parseColor(message)

        assertEquals(message, result)
    }

    @Test
    @DisplayName("Should replace paragraph color codes with ANSI color codes")
    fun parseColorWhenParagraphColorCodesPresent() {
        val message = "This is a §1red§r message with §9blue§r text."
        val expected = "This is a \u001B[34mred\u001B[0m message with \u001B[94mblue\u001B[0m text."

        val result = ConvertColor.parseColor(message)

        assertEquals(expected, result)
    }

    @Test
    @DisplayName("Should replace ampersand color codes with ANSI color codes")
    fun parseColorWhenAmpersandColorCodesPresent() {
        val message = "&1This is a test message with &2ampersand &3color codes&0"
        val expected = "\u001B[34mThis is a test message with \u001B[32mampersand \u001B[36mcolor codes\u001B[30m"

        val result = ConvertColor.parseColor(message)

        assertEquals(expected, result)
    }

    @Test
    @DisplayName("Should replace both ampersand and paragraph color codes with ANSI color codes")
    fun parseColorWhenBothAmpersandAndParagraphColorCodesPresent() {
        val message = "&1This is a &2test &3message§4 with &5multiple &6colors§r"
        val expected =
            "\u001B[34mThis is a \u001B[32mtest \u001B[36mmessage\u001B[31m with \u001B[35mmultiple \u001B[33mcolors\u001B[0m"

        val result = ConvertColor.parseColor(message)

        assertEquals(expected, result)
    }

}