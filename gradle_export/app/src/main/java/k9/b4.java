package k9;

import android.os.Bundle;
import com.google.protobuf.RuntimeVersion;
import java.util.Objects;

public final class b4 {

    public static final String f9235d;

    public static final String f9236e;

    public static final String f9237f;

    public final int f9238a;

    public final String f9239b;

    public final Bundle f9240c;

    static {
        String str = e7.i0.f5136a;
        f9235d = Integer.toString(0, 36);
        f9236e = Integer.toString(1, 36);
        f9237f = Integer.toString(2, 36);
    }

    public b4(int i10) {
        this("no error message provided", i10, Bundle.EMPTY);
    }

    public b4(String str, int i10, Bundle bundle) {
        boolean z10 = true;
        if (i10 >= 0 && i10 != 1) {
            z10 = false;
        }
        ta.c0.s(z10);
        this.f9238a = i10;
        this.f9239b = str;
        this.f9240c = bundle;
    }

    public static b4 a(Bundle bundle) {
        int i10 = bundle.getInt(f9235d, 1000);
        String string = bundle.getString(f9236e, RuntimeVersion.SUFFIX);
        Bundle bundle2 = bundle.getBundle(f9237f);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new b4(string, i10, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9235d, this.f9238a);
        bundle.putString(f9236e, this.f9239b);
        Bundle bundle2 = this.f9240c;
        if (!bundle2.isEmpty()) {
            bundle.putBundle(f9237f, bundle2);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return this.f9238a == b4Var.f9238a && Objects.equals(this.f9239b, b4Var.f9239b);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9238a), this.f9239b);
    }
}
