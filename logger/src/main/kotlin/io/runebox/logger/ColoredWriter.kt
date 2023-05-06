package io.runebox.logger

import org.fusesource.jansi.Ansi
import org.tinylog.Level
import org.tinylog.core.LogEntry
import org.tinylog.core.LogEntryValue
import org.tinylog.writers.Writer
import java.text.SimpleDateFormat
import java.util.*


class ColoredWriter @Suppress("unused") constructor(properties: Map<String?, String?>?) : Writer {

    override fun getRequiredLogEntryValues(): MutableCollection<LogEntryValue> {
        return EnumSet.of(
            LogEntryValue.DATE, LogEntryValue.LEVEL, LogEntryValue.THREAD, LogEntryValue.CLASS, LogEntryValue.MESSAGE
        )
    }

    override fun write(logEntry: LogEntry) {
        val time = TIME_FORMAT.format(logEntry.timestamp.toDate())
        val packagePath: Array<String> = logEntry.className.split("\\.".toRegex()).dropLastWhile { it.isEmpty() }
            .toTypedArray()
        val clazz = packagePath[packagePath.size - 1]
        val message: String = ConvertColor.parseColor(logEntry.message)
        val hasException = logEntry.exception != null && logEntry.level == Level.ERROR
        var ansi: Ansi = Ansi.ansi()
        ansi = ansi.fgCyan().a("[$time] ").reset()
        ansi = ansi.fgRgb(150, 150, 140).a("[" + logEntry.thread.name + "] ").reset()

        @Suppress("LiftReturnOrAssignment")
        when (logEntry.level) {
            Level.TRACE -> { ansi = ansi.fgBrightCyan().a("[TRACE] ").reset() }
            Level.DEBUG -> { ansi = ansi.fgBrightBlue().a("[DEBUG] ").reset() }
            Level.INFO -> { ansi = ansi.fgRgb(122, 216, 122).a("[INFO] ").reset() }
            Level.WARN -> { ansi = ansi.fgBrightYellow().a("[WARN] ").reset() }
            Level.ERROR -> {
                if(hasException) {
                    ansi = ansi.bgRgb(125, 50, 50).fgDefault().a("[SEVERE]").reset().fgRed().a(" ")
                } else {
                    ansi = ansi.fgRed().a("[ERROR] ").reset()
                }
            }
            else -> return
        }

        ansi = ansi.fgMagenta().a("[$clazz] ").reset()
        ansi = ansi.fgDefault().a(message).reset()
        if(hasException) {
            ansi = ansi.reset().fgBrightBlack().a("\n${logEntry.exception.stackTraceToString()}")
        }

        println(ansi)
    }

    override fun flush() {
        System.out.flush()
    }

    override fun close() {
    }

    companion object {
        private val TIME_FORMAT = SimpleDateFormat("HH:mm:ss")
    }
}