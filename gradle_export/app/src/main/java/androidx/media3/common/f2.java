package androidx.media3.common;

import android.os.Bundle;
import java.util.Objects;

public final class f2 extends g1 {

    public static final String f1206d;

    public static final String f1207e;

    public final boolean f1208b;

    public final boolean f1209c;

    static {
        String str = e7.i0.f5136a;
        f1206d = Integer.toString(1, 36);
        f1207e = Integer.toString(2, 36);
    }

    public f2() {
        this.f1208b = false;
        this.f1209c = false;
    }

    public f2(boolean z10) {
        this.f1208b = true;
        this.f1209c = z10;
    }

    @Override
    public final boolean b() {
        return this.f1208b;
    }

    @Override
    public final Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(g1.f1213a, 3);
        bundle.putBoolean(f1206d, this.f1208b);
        bundle.putBoolean(f1207e, this.f1209c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f2)) {
            return false;
        }
        f2 f2Var = (f2) obj;
        return this.f1209c == f2Var.f1209c && this.f1208b == f2Var.f1208b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f1208b), Boolean.valueOf(this.f1209c));
    }
}
