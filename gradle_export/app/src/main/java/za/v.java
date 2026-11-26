package za;

import android.util.Log;

public final class v {

    public static final Object f17401b = new Object();

    public static volatile v f17402c;

    public final int f17403a;

    public v(int i10) {
        this.f17403a = i10;
    }

    public static v d() {
        v vVar;
        synchronized (f17401b) {
            try {
                if (f17402c == null) {
                    f17402c = new v(3);
                }
                vVar = f17402c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return vVar;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        if (length >= 20) {
            sb2.append(str.substring(0, 20));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public final void a(String str, String str2) {
        if (this.f17403a <= 3) {
            Log.d(str, str2);
        }
    }

    public final void b(String str, String str2) {
        if (this.f17403a <= 6) {
            Log.e(str, str2);
        }
    }

    public final void c(String str, String str2, Throwable th2) {
        if (this.f17403a <= 6) {
            Log.e(str, str2, th2);
        }
    }

    public final void e(String str, String str2) {
        if (this.f17403a <= 4) {
            Log.i(str, str2);
        }
    }

    public final void g(String str, String str2) {
        if (this.f17403a <= 5) {
            Log.w(str, str2);
        }
    }
}
