package k9;

import android.os.Bundle;

public final class g {

    public static final String f9294g;

    public static final String f9295h;

    public static final String f9296i;

    public static final String f9297j;

    public static final String f9298k;
    public static final String l;

    public final int f9299a;

    public final int f9300b;

    public final String f9301c;

    public final int f9302d;

    public final Bundle f9303e;

    public final int f9304f;

    static {
        String str = e7.i0.f5136a;
        f9294g = Integer.toString(0, 36);
        f9295h = Integer.toString(1, 36);
        f9296i = Integer.toString(2, 36);
        f9297j = Integer.toString(3, 36);
        f9298k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public g(int i10, int i11, String str, int i12, Bundle bundle, int i13) {
        this.f9299a = i10;
        this.f9300b = i11;
        this.f9301c = str;
        this.f9302d = i12;
        this.f9303e = bundle;
        this.f9304f = i13;
    }

    public g(String str, int i10, Bundle bundle) {
        this(1009000300, 8, str, i10, new Bundle(bundle), 0);
    }

    public static g a(Bundle bundle) {
        int i10 = bundle.getInt(f9294g, 0);
        int i11 = bundle.getInt(f9298k, 0);
        String string = bundle.getString(f9295h);
        string.getClass();
        String str = f9296i;
        ta.c0.s(bundle.containsKey(str));
        int i12 = bundle.getInt(str);
        Bundle bundle2 = bundle.getBundle(f9297j);
        int i13 = bundle.getInt(l, 0);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new g(i10, i11, string, i12, bundle2, i13);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9294g, this.f9299a);
        bundle.putString(f9295h, this.f9301c);
        bundle.putInt(f9296i, this.f9302d);
        bundle.putBundle(f9297j, this.f9303e);
        bundle.putInt(f9298k, this.f9300b);
        bundle.putInt(l, this.f9304f);
        return bundle;
    }
}
