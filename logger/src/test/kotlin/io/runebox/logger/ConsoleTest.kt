package io.runebox.logger

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class ConsoleTest {

    private val console = Console()


    @Test
    @DisplayName("Should start the console thread when the start method is called")
    fun startConsoleThreadWhenStartMethodIsCalled() {
        console.start()
        assertTrue(console.thread.isAlive)
    }

}