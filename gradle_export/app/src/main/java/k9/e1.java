package k9;

import android.os.Bundle;

public final class e1 {

    public static final String f9272e;

    public static final String f9273f;

    public static final String f9274g;

    public static final String f9275h;

    public final Bundle f9276a;

    public final boolean f9277b;

    public final boolean f9278c;

    public final boolean f9279d;

    static {
        String str = e7.i0.f5136a;
        f9272e = Integer.toString(0, 36);
        f9273f = Integer.toString(1, 36);
        f9274g = Integer.toString(2, 36);
        f9275h = Integer.toString(3, 36);
    }

    public e1(Bundle bundle, boolean z10, boolean z11, boolean z12) {
        this.f9276a = new Bundle(bundle);
        this.f9277b = z10;
        this.f9278c = z11;
        this.f9279d = z12;
    }

    public static e1 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(f9272e);
        boolean z10 = bundle.getBoolean(f9273f, false);
        boolean z11 = bundle.getBoolean(f9274g, false);
        boolean z12 = bundle.getBoolean(f9275h, false);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new e1(bundle2, z10, z11, z12);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f9272e, this.f9276a);
        bundle.putBoolean(f9273f, this.f9277b);
        bundle.putBoolean(f9274g, this.f9278c);
        bundle.putBoolean(f9275h, this.f9279d);
        return bundle;
    }
}
