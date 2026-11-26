package d6;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class h2 {

    public static final AtomicBoolean f4638a = new AtomicBoolean(false);

    public static void a() {
        if (f4638a.get()) {
            Trace.endAsyncSection("GlanceAppWidget::update", 0);
        }
    }
}
