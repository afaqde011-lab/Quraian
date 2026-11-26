package g50;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class d extends Handler {
    public static final d a = new d();

    @Override
    public final void close() {
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void publish(LogRecord record) {
        int i;
        int iMin;
        kotlin.jvm.internal.m.e(record, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = c.a;
        String loggerName = record.getLoggerName();
        kotlin.jvm.internal.m.d(loggerName, "record.loggerName");
        int iIntValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (iIntValue > level.intValue()) {
            i = 5;
        } else {
            i = record.getLevel().intValue() == level.intValue() ? 4 : 3;
        }
        String message = record.getMessage();
        kotlin.jvm.internal.m.d(message, "record.message");
        Throwable thrown = record.getThrown();
        String strH1 = (String) c.b.get(loggerName);
        if (strH1 == null) {
            strH1 = r30.k.h1(23, loggerName);
        }
        if (Log.isLoggable(strH1, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int iI0 = r30.k.I0(message, '\n', i2, 4);
                if (iI0 == -1) {
                    iI0 = length;
                }
                while (true) {
                    iMin = Math.min(iI0, i2 + 4000);
                    String strSubstring = message.substring(i2, iMin);
                    kotlin.jvm.internal.m.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    Log.println(i, strH1, strSubstring);
                    if (iMin >= iI0) {
                        break;
                    } else {
                        i2 = iMin;
                    }
                }
                i2 = iMin + 1;
            }
        }
    }
}
