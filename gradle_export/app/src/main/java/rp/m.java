package rp;

import android.graphics.Path;
import com.google.android.gms.internal.measurement.b7;
import com.google.android.gms.internal.measurement.h7;
import com.google.android.gms.internal.measurement.j8;
import com.google.android.gms.internal.measurement.l8;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.o8;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.z6;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import java.util.List;
import tf.b0;
import tf.t;

public final class m implements t {
    public static final m B = new m(3);
    public static final m C = new m(4);
    public static final m D = new m(5);
    public static final m E = new m(6);
    public static final m F = new m(7);
    public static final m G = new m(8);
    public static final m H = new m(9);
    public static final m I = new m(10);
    public static final m J = new m(11);
    public static final m K = new m(12);
    public static final m L = new m(13);
    public static final m M = new m(14);
    public static final m N = new m(15);
    public static final m O = new m(16);
    public static final m P = new m(17);
    public static final m Q = new m(18);
    public static final m R = new m(19);
    public static final m S = new m(20);
    public static final m T = new m(21);
    public static final m U = new m(22);
    public static final m V = new m(23);
    public static final m W = new m(24);
    public static final m X = new m(25);
    public static final m Y = new m(26);
    public static final m Z = new m(27);
    public static final m a0 = new m(28);
    public static final m b0 = new m(29);
    public final int A;

    public m(int i) {
        this.A = i;
    }

    public static Path a(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public Object zza() {
        switch (this.A) {
            case 3:
                return new Boolean(((Boolean) h7.a.b()).booleanValue());
            case 4:
                return new Boolean(((Boolean) w7.a.b()).booleanValue());
            case 5:
                List list = b0.a;
                m8.B.b();
                Boolean bool = (Boolean) o8.c.b();
                bool.getClass();
                return bool;
            case 6:
                List list2 = b0.a;
                z6.B.a();
                return (String) b7.e.b();
            case 7:
                List list3 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.l0.b()).longValue());
            case 8:
                List list4 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.q0.b()).longValue());
            case 9:
                List list5 = b0.a;
                z6.B.a();
                return (String) b7.n.b();
            case 10:
                List list6 = b0.a;
                z6.B.a();
                Long l = (Long) b7.T.b();
                l.getClass();
                return l;
            case 11:
                List list7 = b0.a;
                z6.B.a();
                Long l2 = (Long) b7.J.b();
                l2.getClass();
                return l2;
            case 12:
                List list8 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.P.b()).longValue());
            case 13:
                List list9 = b0.a;
                z6.B.a();
                Long l3 = (Long) b7.R.b();
                l3.getClass();
                return l3;
            case 14:
                List list10 = b0.a;
                z6.B.a();
                Long l4 = (Long) b7.f.b();
                l4.getClass();
                return l4;
            case 15:
                List list11 = b0.a;
                z6.B.a();
                Long l5 = (Long) b7.h0.b();
                l5.getClass();
                return l5;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                List list12 = b0.a;
                z6.B.a();
                Long l6 = (Long) b7.z.b();
                l6.getClass();
                return l6;
            case 17:
                List list13 = b0.a;
                z6.B.a();
                Long l7 = (Long) b7.F.b();
                l7.getClass();
                return l7;
            case 18:
                List list14 = b0.a;
                z6.B.a();
                Long l8 = (Long) b7.t0.b();
                l8.getClass();
                return l8;
            case 19:
                List list15 = b0.a;
                z6.B.a();
                Long l9 = (Long) b7.m.b();
                l9.getClass();
                return l9;
            case 20:
                List list16 = b0.a;
                z6.B.a();
                Long l11 = (Long) b7.G.b();
                l11.getClass();
                return l11;
            case 21:
                List list17 = b0.a;
                j8.B.a();
                return (String) l8.f.b();
            case 22:
                List list18 = b0.a;
                j8.B.a();
                Long l12 = (Long) l8.b.b();
                l12.getClass();
                return l12;
            case 23:
                List list19 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.s.b()).longValue());
            case 24:
                List list20 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.d.b()).longValue());
            case 25:
                List list21 = b0.a;
                z6.B.a();
                return Integer.valueOf((int) ((Long) b7.j0.b()).longValue());
            case 26:
                List list22 = b0.a;
                z6.B.a();
                return (String) b7.c0.b();
            case 27:
                List list23 = b0.a;
                z6.B.a();
                Long l13 = (Long) b7.j.b();
                l13.getClass();
                return l13;
            case 28:
                List list24 = b0.a;
                z6.B.a();
                return (String) b7.k.b();
            default:
                List list25 = b0.a;
                z6.B.a();
                Long l14 = (Long) b7.Z.b();
                l14.getClass();
                return l14;
        }
    }
}
