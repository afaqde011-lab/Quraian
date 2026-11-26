package ss;

import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;

public final class h {
    public static boolean a(int i, long j) {
        long j2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j <= 0) {
            return false;
        }
        if (i != 7) {
            j2 = i != 366 ? HTTPTimeoutManager.TIMEOUT_RESET_INTERVAL_MS : 3600000L;
        } else {
            j2 = 60000;
        }
        return jCurrentTimeMillis - j < j2;
    }
}
