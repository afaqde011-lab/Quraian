package v1;

import android.os.Looper;

public abstract class k {

    public static final long f15349a;

    static {
        long id2;
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f15349a = id2;
    }
}
