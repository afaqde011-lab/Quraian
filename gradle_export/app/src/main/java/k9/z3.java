package k9;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.protobuf.RuntimeVersion;
import java.util.Objects;

public final class z3 {

    public static final fh.d2 f9573d = fh.t0.s(40010);

    public static final fh.d2 f9574e;

    public static final String f9575f;

    public static final String f9576g;

    public static final String f9577h;

    public final int f9578a;

    public final String f9579b;

    public final Bundle f9580c;

    static {
        Object[] objArr = {50000, 50001, 50002, 50003, 50004, 50005, 50006};
        fh.w.e(7, objArr);
        f9574e = fh.t0.l(7, objArr);
        String str = e7.i0.f5136a;
        f9575f = Integer.toString(0, 36);
        f9576g = Integer.toString(1, 36);
        f9577h = Integer.toString(2, 36);
    }

    public z3(int i10) {
        ta.c0.r("commandCode shouldn't be COMMAND_CODE_CUSTOM", i10 != 0);
        this.f9578a = i10;
        this.f9579b = RuntimeVersion.SUFFIX;
        this.f9580c = Bundle.EMPTY;
    }

    public z3(String str, Bundle bundle) {
        this.f9578a = 0;
        str.getClass();
        this.f9579b = str;
        bundle.getClass();
        this.f9580c = new Bundle(bundle);
    }

    public static z3 a(Bundle bundle) {
        int i10 = bundle.getInt(f9575f, 0);
        if (i10 != 0) {
            return new z3(i10);
        }
        String string = bundle.getString(f9576g);
        string.getClass();
        Bundle bundle2 = bundle.getBundle(f9577h);
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        return new z3(string, bundle2);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(f9575f, this.f9578a);
        bundle.putString(f9576g, this.f9579b);
        bundle.putBundle(f9577h, this.f9580c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.f9578a == z3Var.f9578a && TextUtils.equals(this.f9579b, z3Var.f9579b);
    }

    public final int hashCode() {
        return Objects.hash(this.f9579b, Integer.valueOf(this.f9578a));
    }
}
