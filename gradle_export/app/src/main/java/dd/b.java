package dd;

import android.util.Log;
import kotlin.jvm.internal.m;

public final class b implements cd.b {

    public static final b f4866c = new b();

    public final cd.a f4867a = cd.a.B;

    public final String f4868b = "Amplitude";

    @Override
    public final void a(String str) {
        m.e(str, "message");
        if (this.f4867a.compareTo(cd.a.D) <= 0) {
            Log.e(this.f4868b, str);
        }
    }

    @Override
    public final void b(String str) {
        m.e(str, "message");
        if (this.f4867a.compareTo(cd.a.A) <= 0) {
            Log.d(this.f4868b, str);
        }
    }

    @Override
    public final void c(String str) {
        m.e(str, "message");
        if (this.f4867a.compareTo(cd.a.C) <= 0) {
            Log.w(this.f4868b, str);
        }
    }
}
