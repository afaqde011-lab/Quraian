package qh;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

public abstract class a {

    public static final Logger f13005a = Logger.getLogger(a.class.getName());

    public static final AtomicBoolean f13006b = new AtomicBoolean(false);

    public static boolean a() {
        return f13006b.get();
    }
}
