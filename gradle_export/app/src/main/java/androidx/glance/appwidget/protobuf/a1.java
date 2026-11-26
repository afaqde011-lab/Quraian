package androidx.glance.appwidget.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public abstract class a1 {

    public static final Class f870a;

    public static final b1 f871b;

    public static final d1 f872c;

    static {
        Class<?> cls;
        Class<?> cls2;
        w0 w0Var = w0.f961c;
        b1 b1Var = null;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f870a = cls;
        try {
            w0 w0Var2 = w0.f961c;
            try {
                cls2 = Class.forName("androidx.glance.appwidget.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                b1Var = (b1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f871b = b1Var;
        f872c = new d1();
    }

    public static int a(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += o.k0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iK0;
        }
        a0 a0Var = (a0) list;
        int iK1 = 0;
        while (i10 < size) {
            iK1 += o.k0(a0Var.getInt(i10));
            i10++;
        }
        return iK1;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o.i0(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (o.i0(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += o.k0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iK0;
        }
        a0 a0Var = (a0) list;
        int iK1 = 0;
        while (i10 < size) {
            iK1 += o.k0(a0Var.getInt(i10));
            i10++;
        }
        return iK1;
    }

    public static int e(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += o.k0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iK0;
        }
        i0 i0Var = (i0) list;
        int iK1 = 0;
        while (i10 < size) {
            iK1 += o.k0(i0Var.getLong(i10));
            i10++;
        }
        return iK1;
    }

    public static int f(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iF0 = 0;
            while (i10 < size) {
                iF0 += o.f0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iF0;
        }
        a0 a0Var = (a0) list;
        int iF1 = 0;
        while (i10 < size) {
            iF1 += o.f0(a0Var.getInt(i10));
            i10++;
        }
        return iF1;
    }

    public static int g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iG0 = 0;
            while (i10 < size) {
                iG0 += o.g0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iG0;
        }
        i0 i0Var = (i0) list;
        int iG1 = 0;
        while (i10 < size) {
            iG1 += o.g0(i0Var.getLong(i10));
            i10++;
        }
        return iG1;
    }

    public static int h(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof a0)) {
            int iJ0 = 0;
            while (i10 < size) {
                iJ0 += o.j0(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iJ0;
        }
        a0 a0Var = (a0) list;
        int iJ1 = 0;
        while (i10 < size) {
            iJ1 += o.j0(a0Var.getInt(i10));
            i10++;
        }
        return iJ1;
    }

    public static int i(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iK0 = 0;
            while (i10 < size) {
                iK0 += o.k0(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iK0;
        }
        i0 i0Var = (i0) list;
        int iK1 = 0;
        while (i10 < size) {
            iK1 += o.k0(i0Var.getLong(i10));
            i10++;
        }
        return iK1;
    }

    public static Object j(Object obj, int i10, d0 d0Var, Object obj2, b1 b1Var) {
        return obj2;
    }

    public static void k(b1 b1Var, Object obj, Object obj2) {
        ((d1) b1Var).getClass();
        z zVar = (z) obj;
        c1 c1Var = zVar.unknownFields;
        c1 c1Var2 = ((z) obj2).unknownFields;
        c1 c1Var3 = c1.f875f;
        if (!c1Var3.equals(c1Var2)) {
            if (c1Var3.equals(c1Var)) {
                int i10 = c1Var.f876a + c1Var2.f876a;
                int[] iArrCopyOf = Arrays.copyOf(c1Var.f877b, i10);
                System.arraycopy(c1Var2.f877b, 0, iArrCopyOf, c1Var.f876a, c1Var2.f876a);
                Object[] objArrCopyOf = Arrays.copyOf(c1Var.f878c, i10);
                System.arraycopy(c1Var2.f878c, 0, objArrCopyOf, c1Var.f876a, c1Var2.f876a);
                c1Var = new c1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                c1Var.getClass();
                if (!c1Var2.equals(c1Var3)) {
                    if (!c1Var.f880e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = c1Var.f876a + c1Var2.f876a;
                    c1Var.a(i11);
                    System.arraycopy(c1Var2.f877b, 0, c1Var.f877b, c1Var.f876a, c1Var2.f876a);
                    System.arraycopy(c1Var2.f878c, 0, c1Var.f878c, c1Var.f876a, c1Var2.f876a);
                    c1Var.f876a = i11;
                }
            }
        }
        zVar.unknownFields = c1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (list instanceof e) {
            if (z10) {
                oVar.x0(i10, 2);
                oVar.z0(0);
                return;
            }
            return;
        }
        if (!z10) {
            while (i11 < list.size()) {
                oVar.n0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = o.f932c;
            i12++;
        }
        oVar.z0(i12);
        while (i11 < list.size()) {
            oVar.m0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void n(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (list instanceof p) {
            if (z10) {
                oVar.x0(i10, 2);
                oVar.z0(0);
                return;
            }
            return;
        }
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                oVar.getClass();
                oVar.r0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = o.f932c;
            i12 += 8;
        }
        oVar.z0(i12);
        while (i11 < list.size()) {
            oVar.s0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void o(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.t0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += o.k0(((Integer) list.get(i12)).intValue());
            }
            oVar.z0(iK0);
            while (i11 < list.size()) {
                oVar.u0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.C) {
                oVar.t0(i10, a0Var.getInt(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iK1 = 0;
        for (int i13 = 0; i13 < a0Var.C; i13++) {
            iK1 += o.k0(a0Var.getInt(i13));
        }
        oVar.z0(iK1);
        while (i11 < a0Var.C) {
            oVar.u0(a0Var.getInt(i11));
            i11++;
        }
    }

    public static void p(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.p0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                Logger logger = o.f932c;
                i12 += 4;
            }
            oVar.z0(i12);
            while (i11 < list.size()) {
                oVar.q0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.C) {
                oVar.p0(i10, a0Var.getInt(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < a0Var.C; i15++) {
            a0Var.getInt(i15);
            Logger logger2 = o.f932c;
            i14 += 4;
        }
        oVar.z0(i14);
        while (i11 < a0Var.C) {
            oVar.q0(a0Var.getInt(i11));
            i11++;
        }
    }

    public static void q(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.r0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                Logger logger = o.f932c;
                i12 += 8;
            }
            oVar.z0(i12);
            while (i11 < list.size()) {
                oVar.s0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                oVar.r0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            i0Var.getLong(i15);
            Logger logger2 = o.f932c;
            i14 += 8;
        }
        oVar.z0(i14);
        while (i11 < 0) {
            oVar.s0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static void r(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (list instanceof v) {
            if (z10) {
                oVar.x0(i10, 2);
                oVar.z0(0);
                return;
            }
            return;
        }
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                oVar.getClass();
                oVar.p0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = o.f932c;
            i12 += 4;
        }
        oVar.z0(i12);
        while (i11 < list.size()) {
            oVar.q0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.t0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += o.k0(((Integer) list.get(i12)).intValue());
            }
            oVar.z0(iK0);
            while (i11 < list.size()) {
                oVar.u0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.C) {
                oVar.t0(i10, a0Var.getInt(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iK1 = 0;
        for (int i13 = 0; i13 < a0Var.C; i13++) {
            iK1 += o.k0(a0Var.getInt(i13));
        }
        oVar.z0(iK1);
        while (i11 < a0Var.C) {
            oVar.u0(a0Var.getInt(i11));
            i11++;
        }
    }

    public static void t(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.A0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += o.k0(((Long) list.get(i12)).longValue());
            }
            oVar.z0(iK0);
            while (i11 < list.size()) {
                oVar.B0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                oVar.A0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iK1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iK1 += o.k0(i0Var.getLong(i13));
        }
        oVar.z0(iK1);
        while (i11 < 0) {
            oVar.B0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static void u(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.p0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).getClass();
                Logger logger = o.f932c;
                i12 += 4;
            }
            oVar.z0(i12);
            while (i11 < list.size()) {
                oVar.q0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.C) {
                oVar.p0(i10, a0Var.getInt(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < a0Var.C; i15++) {
            a0Var.getInt(i15);
            Logger logger2 = o.f932c;
            i14 += 4;
        }
        oVar.z0(i14);
        while (i11 < a0Var.C) {
            oVar.q0(a0Var.getInt(i11));
            i11++;
        }
    }

    public static void v(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.r0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).getClass();
                Logger logger = o.f932c;
                i12 += 8;
            }
            oVar.z0(i12);
            while (i11 < list.size()) {
                oVar.s0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                oVar.r0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < 0; i15++) {
            i0Var.getLong(i15);
            Logger logger2 = o.f932c;
            i14 += 8;
        }
        oVar.z0(i14);
        while (i11 < 0) {
            oVar.s0(i0Var.getLong(i11));
            i11++;
        }
    }

    public static void w(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    oVar.y0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iF0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iF0 += o.f0(((Integer) list.get(i12)).intValue());
            }
            oVar.z0(iF0);
            while (i11 < list.size()) {
                int iIntValue2 = ((Integer) list.get(i11)).intValue();
                oVar.z0((iIntValue2 >> 31) ^ (iIntValue2 << 1));
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.C) {
                int i13 = a0Var.getInt(i11);
                oVar.y0(i10, (i13 >> 31) ^ (i13 << 1));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iF1 = 0;
        for (int i14 = 0; i14 < a0Var.C; i14++) {
            iF1 += o.f0(a0Var.getInt(i14));
        }
        oVar.z0(iF1);
        while (i11 < a0Var.C) {
            int i15 = a0Var.getInt(i11);
            oVar.z0((i15 >> 31) ^ (i15 << 1));
            i11++;
        }
    }

    public static void x(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    oVar.A0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iG0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iG0 += o.g0(((Long) list.get(i12)).longValue());
            }
            oVar.z0(iG0);
            while (i11 < list.size()) {
                long jLongValue2 = ((Long) list.get(i11)).longValue();
                oVar.B0((jLongValue2 >> 63) ^ (jLongValue2 << 1));
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                long j9 = i0Var.getLong(i11);
                oVar.A0(i10, (j9 >> 63) ^ (j9 << 1));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iG1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iG1 += o.g0(i0Var.getLong(i13));
        }
        oVar.z0(iG1);
        while (i11 < 0) {
            long j10 = i0Var.getLong(i11);
            oVar.B0((j10 >> 63) ^ (j10 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof a0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.y0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iJ0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iJ0 += o.j0(((Integer) list.get(i12)).intValue());
            }
            oVar.z0(iJ0);
            while (i11 < list.size()) {
                oVar.z0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        a0 a0Var = (a0) list;
        if (!z10) {
            while (i11 < a0Var.C) {
                oVar.y0(i10, a0Var.getInt(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iJ1 = 0;
        for (int i13 = 0; i13 < a0Var.C; i13++) {
            iJ1 += o.j0(a0Var.getInt(i13));
        }
        oVar.z0(iJ1);
        while (i11 < a0Var.C) {
            oVar.z0(a0Var.getInt(i11));
            i11++;
        }
    }

    public static void z(int i10, List list, k0 k0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        o oVar = (o) k0Var.f917a;
        int i11 = 0;
        if (!(list instanceof i0)) {
            if (!z10) {
                while (i11 < list.size()) {
                    oVar.A0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            oVar.x0(i10, 2);
            int iK0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iK0 += o.k0(((Long) list.get(i12)).longValue());
            }
            oVar.z0(iK0);
            while (i11 < list.size()) {
                oVar.B0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        i0 i0Var = (i0) list;
        if (!z10) {
            while (i11 < 0) {
                oVar.A0(i10, i0Var.getLong(i11));
                i11++;
            }
            return;
        }
        oVar.x0(i10, 2);
        int iK1 = 0;
        for (int i13 = 0; i13 < 0; i13++) {
            iK1 += o.k0(i0Var.getLong(i13));
        }
        oVar.z0(iK1);
        while (i11 < 0) {
            oVar.B0(i0Var.getLong(i11));
            i11++;
        }
    }
}
