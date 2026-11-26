package qy;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public abstract class b {
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("dd.MM.yy").withZone(ZoneId.systemDefault());
}
