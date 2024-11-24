package edu.dnu.fpm.pz.list;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ListException extends Exception {
    private final String type;
    private final String callerClass;

    public ListException(String callerClass, String type, String message) {
        super(message);
        this.type = type;
        this.callerClass = callerClass;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);
        return String.format("[%s %s] %s %s", timestamp, callerClass, type, getMessage());
    }
}
