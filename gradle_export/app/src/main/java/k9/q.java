package k9;

import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Iterator;

public final class q {

    public static final String f9389g;

    public static final String f9390h;

    public static final String f9391i;

    public static final String f9392j;

    public static final String f9393k;
    public static final String l;

    public final int f9394a;

    public final long f9395b;

    public final Object f9396c;

    public final int f9397d;

    public final e1 f9398e;

    public final b4 f9399f;

    static {
        String str = e7.i0.f5136a;
        f9389g = Integer.toString(0, 36);
        f9390h = Integer.toString(1, 36);
        f9391i = Integer.toString(2, 36);
        f9392j = Integer.toString(3, 36);
        f9393k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public q(int i10, long j9, e1 e1Var, b4 b4Var, Object obj, int i11) {
        this.f9394a = i10;
        this.f9395b = j9;
        this.f9398e = e1Var;
        this.f9399f = b4Var;
        this.f9396c = obj;
        this.f9397d = i11;
    }

    public static q a(Bundle bundle) {
        b4 b4Var;
        b4 b4Var2;
        int i10;
        String str;
        Bundle bundle2;
        IBinder binder;
        fh.t0 t0VarA;
        fh.q0 q0VarM;
        int i11 = bundle.getInt(f9389g, 0);
        long j9 = bundle.getLong(f9390h, SystemClock.elapsedRealtime());
        Bundle bundle3 = bundle.getBundle(f9391i);
        Object objA = null;
        e1 e1VarA = bundle3 == null ? null : e1.a(bundle3);
        Bundle bundle4 = bundle.getBundle(l);
        if (bundle4 == null) {
            if (i11 != 0) {
                b4Var2 = new b4(i11);
            } else {
                b4Var = null;
            }
            i10 = bundle.getInt(f9393k);
            if (i10 != 1) {
                str = f9392j;
                if (i10 != 2) {
                    bundle2 = bundle.getBundle(str);
                    if (bundle2 != null) {
                        objA = androidx.media3.common.q0.a(bundle2);
                    }
                } else if (i10 != 3) {
                    binder = bundle.getBinder(str);
                    if (binder != null) {
                        t0VarA = androidx.media3.common.g.a(binder);
                        q0VarM = fh.t0.m();
                        for (int i12 = 0; i12 < t0VarA.size(); i12++) {
                            Bundle bundle5 = (Bundle) t0VarA.get(i12);
                            bundle5.getClass();
                            q0VarM.c(androidx.media3.common.q0.a(bundle5));
                        }
                        objA = q0VarM.g();
                    }
                } else if (i10 != 4) {
                    throw new IllegalStateException();
                }
            }
            return new q(i11, j9, e1VarA, b4Var, objA, i10);
        }
        b4Var2 = b4.a(bundle4);
        b4Var = b4Var2;
        i10 = bundle.getInt(f9393k);
        if (i10 != 1) {
            str = f9392j;
            if (i10 != 2) {
                bundle2 = bundle.getBundle(str);
                if (bundle2 != null) {
                    objA = androidx.media3.common.q0.a(bundle2);
                }
            } else if (i10 != 3) {
                binder = bundle.getBinder(str);
                if (binder != null) {
                    t0VarA = androidx.media3.common.g.a(binder);
                    q0VarM = fh.t0.m();
                    while (i12 < t0VarA.size()) {
                        Bundle bundle6 = (Bundle) t0VarA.get(i12);
                        bundle6.getClass();
                        q0VarM.c(androidx.media3.common.q0.a(bundle6));
                    }
                    objA = q0VarM.g();
                }
            } else if (i10 != 4) {
                throw new IllegalStateException();
            }
        }
        return new q(i11, j9, e1VarA, b4Var, objA, i10);
    }

    public static q b(int i10) {
        b4 b4Var = new b4("no error message provided", i10, Bundle.EMPTY);
        return new q(b4Var.f9238a, SystemClock.elapsedRealtime(), null, b4Var, null, 4);
    }

    public static q c(fh.t0 t0Var, e1 e1Var) {
        Iterator it = t0Var.iterator();
        while (it.hasNext()) {
            e((androidx.media3.common.q0) it.next());
        }
        return new q(0, SystemClock.elapsedRealtime(), e1Var, null, fh.t0.o(t0Var), 3);
    }

    public static q d() {
        return new q(0, SystemClock.elapsedRealtime(), null, null, null, 1);
    }

    public static void e(androidx.media3.common.q0 q0Var) {
        ta.c0.r("mediaId must not be empty", !TextUtils.isEmpty(q0Var.f1413a));
        androidx.media3.common.t0 t0Var = q0Var.f1416d;
        ta.c0.r("mediaMetadata must specify isBrowsable", t0Var.f1641q != null);
        ta.c0.r("mediaMetadata must specify isPlayable", t0Var.f1642r != null);
    }
}
