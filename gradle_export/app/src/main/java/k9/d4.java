package k9;

import android.os.Bundle;
import android.os.SystemClock;

public final class d4 {

    public static final String f9264e;

    public static final String f9265f;

    public static final String f9266g;

    public static final String f9267h;

    public final int f9268a;

    public final Bundle f9269b;

    public final long f9270c;

    public final b4 f9271d;

    static {
        String str = e7.i0.f5136a;
        f9264e = Integer.toString(0, 36);
        f9265f = Integer.toString(1, 36);
        f9266g = Integer.toString(2, 36);
        f9267h = Integer.toString(3, 36);
    }

    public d4(int i10) {
        this(i10, Bundle.EMPTY, SystemClock.elapsedRealtime(), null);
    }

    public d4(int i10, Bundle bundle, long j9, b4 b4Var) {
        ta.c0.s(b4Var == null || i10 < 0);
        this.f9268a = i10;
        this.f9269b = new Bundle(bundle);
        this.f9270c = j9;
        if (b4Var == null && i10 < 0) {
            b4Var = new b4(i10);
        }
        this.f9271d = b4Var;
    }

    public static d4 a(Bundle bundle) {
        b4 b4Var;
        int i10 = bundle.getInt(f9264e, -1);
        Bundle bundle2 = bundle.getBundle(f9265f);
        long j9 = bundle.getLong(f9266g, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f9267h);
        if (bundle3 != null) {
            b4Var = b4.a(bundle3);
        } else {
            b4Var = i10 != 0 ? new b4(i10) : null;
        }
        b4 b4Var2 = b4Var;
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new d4(i10, bundle2, j9, b4Var2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9264e, this.f9268a);
        bundle.putBundle(f9265f, this.f9269b);
        bundle.putLong(f9266g, this.f9270c);
        b4 b4Var = this.f9271d;
        if (b4Var != null) {
            bundle.putBundle(f9267h, b4Var.b());
        }
        return bundle;
    }
}
