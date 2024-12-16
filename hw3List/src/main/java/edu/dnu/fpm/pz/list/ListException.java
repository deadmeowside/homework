package edu.dnu.fpm.pz.list;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ListException extends Exception {
    private final String type;
    private final String callerClass;
    private final Integer invalidIndex;
    private final String timestamp;

    public ListException(String callerClass, String type, String message, Integer invalidIndex) {
        super(message);
        this.type = type;
        this.callerClass = callerClass;
        this.invalidIndex = invalidIndex;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.timestamp = LocalDateTime.now().format(formatter);
    }

    @Override
    public String toString() {
        String indexInfo = (invalidIndex != null) ? String.format(" [Invalid index: %d]", invalidIndex) : "";
        return String.format("[%s %s] %s %s%s", timestamp, callerClass, type, getMessage(), indexInfo);
    }
}
