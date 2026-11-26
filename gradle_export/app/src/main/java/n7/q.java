package n7;

import android.os.Build;
import java.util.UUID;

public final class q implements h7.a {

    public static final boolean f11178c;

    public final UUID f11179a;

    public final byte[] f11180b;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f11178c = z10;
    }

    public q(UUID uuid, byte[] bArr) {
        this.f11179a = uuid;
        this.f11180b = bArr;
    }
}
