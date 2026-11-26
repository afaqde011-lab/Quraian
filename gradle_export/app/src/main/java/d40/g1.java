package d40;

import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;

public final class g1 {
    public static final i1 a = new i1(0);
    public static final i1 b = new i1(1);

    public static m1 a(int i) {
        return new m1((i & 1) != 0 ? 0L : HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS);
    }
}
