package pro.chandan.practicejava.exercism;

import java.util.Locale;

import static java.lang.String.format;

public class LogLevels {

    public static String message(String logLine) {
        return logLine.split(":")[1].trim();
    }

    public static String logLevel(String logLine) {
//        return logLine.split(":")[0].toLowerCase().substring(1).replace("]","");
        return logLine.split("]:")[0]
                .substring(1)
                .toLowerCase();
    }

    public static String reformat(String logLine) {
        return format("%s (%s)", message(logLine), logLevel(logLine));
    }
}

class LogLevelsTest {
    public static void main(String[] args) {
        String msg1 = "[ERROR]: Invalid operation";
        String msg2 = "[WARNING]:   \tTimezone not set  \r\n";
        String msg3 = "[ERROR]: \t Corrupt disk\t \t \r\n";
        System.out.println(LogLevels.message(msg1));
        System.out.println(LogLevels.message(msg2));
        System.out.println(LogLevels.message(msg3));

        System.out.println(LogLevels.logLevel(msg1));
        System.out.println(LogLevels.logLevel(msg2));
        System.out.println(LogLevels.logLevel(msg3));

        System.out.println(LogLevels.reformat(msg1));
        System.out.println(LogLevels.reformat(msg2));
        System.out.println(LogLevels.reformat(msg3));
    }
}
