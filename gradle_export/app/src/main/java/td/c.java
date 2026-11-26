package td;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.n;

public final class c extends n implements u00.a {
    public static final c A = new c(0);

    public final Object invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
