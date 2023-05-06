package io.runebox.logger

import org.jline.reader.EndOfFileException
import org.jline.reader.LineReader
import org.jline.reader.LineReaderBuilder
import org.jline.reader.UserInterruptException
import org.jline.terminal.Terminal
import org.jline.terminal.TerminalBuilder
import java.io.IOException
import kotlin.system.exitProcess

class Console {

    companion object {
        private const val CONSOLE_NAME = "RuneBox Console"
    }

    private val terminal: Terminal
    private val lineReader: LineReader
    private val consoleThread: Thread

    init {
        try {
            terminal = TerminalBuilder.builder()
                .system(true)
                .name(CONSOLE_NAME)
                .build()
        } catch(e: IOException) {
            throw IllegalStateException("Terminal could not be created.", e)
        }

        lineReader = LineReaderBuilder.builder()
            .terminal(terminal)
            .appName(CONSOLE_NAME)
            .build()
        lineReader.setOpt(LineReader.Option.DISABLE_EVENT_EXPANSION)
        lineReader.unsetOpt(LineReader.Option.INSERT_TAB)

        consoleThread = Thread {
            try {
                var line: String
                while(true) {
                    try {
                        line = lineReader.readLine()
                    } catch(e: EndOfFileException) {
                        continue
                    }
                }
            } catch(e: UserInterruptException) {
                exitProcess(99)
            } finally {
                terminal.close()
            }
        }
        consoleThread.isDaemon = true
        consoleThread.name = "ConsoleReader"
    }

    fun start() {
        consoleThread.start()
    }

    fun stop() {
        if(consoleThread.isInterrupted) {
            return
        }
        consoleThread.interrupt()
    }
}