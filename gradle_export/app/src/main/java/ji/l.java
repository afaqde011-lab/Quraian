package ji;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class l implements Executor {
    public static final l A;
    public static final Handler B;
    public static final l[] C;

    static {
        l lVar = new l("INSTANCE", 0);
        A = lVar;
        C = new l[]{lVar};
        B = new Handler(Looper.getMainLooper());
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) C.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        B.post(runnable);
    }
}
