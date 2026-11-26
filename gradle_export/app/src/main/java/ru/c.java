package ru;

import android.os.Looper;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.j9;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.z6;
import com.google.android.gms.internal.measurement.z7;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.List;
import tf.b0;
import tf.t;

public final class c implements t {
    public static final c B = new c(3);
    public static final c C = new c(4);
    public static final c D = new c(5);
    public static final c E = new c(6);
    public static final c F = new c(7);
    public static final c G = new c(8);
    public static final c H = new c(9);
    public static final c I = new c(10);
    public static final c J = new c(11);
    public static final c K = new c(12);
    public static final c L = new c(13);
    public static final c M = new c(14);
    public static final c N = new c(15);
    public static final c O = new c(16);
    public static final c P = new c(17);
    public static final c Q = new c(18);
    public static final c R = new c(19);
    public static final c S = new c(20);
    public static final c T = new c(21);
    public static final c U = new c(22);
    public static final c V = new c(23);
    public static final c W = new c(24);
    public static final c X = new c(25);
    public static final c Y = new c(26);
    public static final c Z = new c(27);
    public static final c a0 = new c(28);
    public static final c b0 = new c(29);
    public final int A;

    public c(int i) {
        this.A = i;
    }

    public static final boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public Object zza() {
        switch (this.A) {
            case 3:
                return new Boolean(((Boolean) h7.b.b()).booleanValue());
            case 4:
                return new Boolean(((Boolean) z7.a.b()).booleanValue());
            case 5:
                List list = b0.a;
                Boolean bool = (Boolean) j9.a.b();
                bool.getClass();
                return bool;
            case 6:
                List list2 = b0.a;
                z6.B.a();
                return (String) b7.l.b();
            case 7:
                List list3 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.o0.b()).longValue());
            case 8:
                List list4 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.r.b()).longValue());
            case 9:
                List list5 = b0.a;
                z6.B.a();
                return (String) b7.M.b();
            case 10:
                List list6 = b0.a;
                z6.B.a();
                Long l = (Long) b7.A.b();
                l.getClass();
                return l;
            case 11:
                List list7 = b0.a;
                z6.B.a();
                Long l2 = (Long) b7.L.b();
                l2.getClass();
                return l2;
            case 12:
                List list8 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.O.b()).longValue());
            case 13:
                List list9 = b0.a;
                z6.B.a();
                Long l3 = (Long) b7.Q.b();
                l3.getClass();
                return l3;
            case 14:
                List list10 = b0.a;
                z6.B.a();
                Long l4 = (Long) b7.f0.b();
                l4.getClass();
                return l4;
            case 15:
                List list11 = b0.a;
                z6.B.a();
                Long l5 = (Long) b7.E.b();
                l5.getClass();
                return l5;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                List list12 = b0.a;
                z6.B.a();
                Long l6 = (Long) b7.y.b();
                l6.getClass();
                return l6;
            case 17:
                List list13 = b0.a;
                z6.B.a();
                Long l7 = (Long) b7.g0.b();
                l7.getClass();
                return l7;
            case 18:
                List list14 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.s0.b()).longValue());
            case 19:
                List list15 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.o.b()).longValue());
            case 20:
                List list16 = b0.a;
                z6.B.a();
                Long l8 = (Long) b7.H.b();
                l8.getClass();
                return l8;
            case 21:
                List list17 = b0.a;
                z6.B.a();
                return (String) b7.g.b();
            case 22:
                List list18 = b0.a;
                j8.B.a();
                return Integer.valueOf((int) ((Long) l8.d.b()).longValue());
            case 23:
                List list19 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.u.b()).longValue());
            case 24:
                List list20 = b0.a;
                z6.B.a();
                Long l9 = (Long) b7.d0.b();
                l9.getClass();
                return l9;
            case 25:
                List list21 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.x.b()).longValue());
            case 26:
                List list22 = b0.a;
                z6.B.a();
                return (String) b7.Y.b();
            case 27:
                List list23 = b0.a;
                z6.B.a();
                return (String) b7.D.b();
            case 28:
                List list24 = b0.a;
                z6.B.a();
                return (String) b7.b0.b();
            default:
                List list25 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.W.b()).longValue());
        }
    }
}
