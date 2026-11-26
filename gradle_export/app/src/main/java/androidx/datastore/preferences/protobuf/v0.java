package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public abstract class v0 {

    public static final Class f681a;

    public static final a1 f682b;

    public static final c1 f683c;

    static {
        Class<?> cls;
        Class<?> cls2;
        r0 r0Var = r0.f672c;
        a1 a1Var = null;
        try {
            cls = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f681a = cls;
        try {
            r0 r0Var2 = r0.f672c;
            try {
                cls2 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                a1Var = (a1) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        f682b = a1Var;
        f683c = new c1();
    }

    public static int a(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += l.X(((Integer) list.get(i10)).intValue());
        }
        return iX;
    }

    public static int b(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.V(i10) + 4) * size;
    }

    public static int c(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (l.V(i10) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += l.X(((Integer) list.get(i10)).intValue());
        }
        return iX;
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += l.X(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static int f(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            int iIntValue = ((Integer) list.get(i10)).intValue();
            iW += l.W((iIntValue >> 31) ^ (iIntValue << 1));
        }
        return iW;
    }

    public static int g(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            long jLongValue = ((Long) list.get(i10)).longValue();
            iX += l.X((jLongValue >> 63) ^ (jLongValue << 1));
        }
        return iX;
    }

    public static int h(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iW += l.W(((Integer) list.get(i10)).intValue());
        }
        return iW;
    }

    public static int i(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iX = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iX += l.X(((Long) list.get(i10)).longValue());
        }
        return iX;
    }

    public static Object j(Object obj, int i10, w wVar, Object obj2, a1 a1Var) {
        return obj2;
    }

    public static void k(a1 a1Var, Object obj, Object obj2) {
        ((c1) a1Var).getClass();
        v vVar = (v) obj;
        b1 b1Var = vVar.unknownFields;
        b1 b1Var2 = ((v) obj2).unknownFields;
        b1 b1Var3 = b1.f588f;
        if (!b1Var3.equals(b1Var2)) {
            if (b1Var3.equals(b1Var)) {
                int i10 = b1Var.f589a + b1Var2.f589a;
                int[] iArrCopyOf = Arrays.copyOf(b1Var.f590b, i10);
                System.arraycopy(b1Var2.f590b, 0, iArrCopyOf, b1Var.f589a, b1Var2.f589a);
                Object[] objArrCopyOf = Arrays.copyOf(b1Var.f591c, i10);
                System.arraycopy(b1Var2.f591c, 0, objArrCopyOf, b1Var.f589a, b1Var2.f589a);
                b1Var = new b1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                b1Var.getClass();
                if (!b1Var2.equals(b1Var3)) {
                    if (!b1Var.f593e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = b1Var.f589a + b1Var2.f589a;
                    b1Var.a(i11);
                    System.arraycopy(b1Var2.f590b, 0, b1Var.f590b, b1Var.f589a, b1Var2.f589a);
                    System.arraycopy(b1Var2.f591c, 0, b1Var.f591c, b1Var.f589a, b1Var2.f589a);
                    b1Var.f589a = i11;
                }
            }
        }
        vVar.unknownFields = b1Var;
    }

    public static boolean l(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void m(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.c0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12++;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.a0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void n(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                double dDoubleValue = ((Double) list.get(i11)).doubleValue();
                lVar.getClass();
                lVar.h0(i10, Double.doubleToRawLongBits(dDoubleValue));
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12 += 8;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.i0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void o(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += l.X(((Integer) list.get(i12)).intValue());
        }
        lVar.q0(iX);
        while (i11 < list.size()) {
            lVar.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void p(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12 += 4;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void q(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12 += 8;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void r(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                float fFloatValue = ((Float) list.get(i11)).floatValue();
                lVar.getClass();
                lVar.f0(i10, Float.floatToRawIntBits(fFloatValue));
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12 += 4;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.g0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void s(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.j0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += l.X(((Integer) list.get(i12)).intValue());
        }
        lVar.q0(iX);
        while (i11 < list.size()) {
            lVar.k0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void t(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += l.X(((Long) list.get(i12)).longValue());
        }
        lVar.q0(iX);
        while (i11 < list.size()) {
            lVar.s0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void u(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.f0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Integer) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12 += 4;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.g0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void v(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.h0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Long) list.get(i13)).getClass();
            Logger logger = l.f639g;
            i12 += 8;
        }
        lVar.q0(i12);
        while (i11 < list.size()) {
            lVar.i0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }

    public static void w(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                int iIntValue = ((Integer) list.get(i11)).intValue();
                lVar.p0(i10, (iIntValue >> 31) ^ (iIntValue << 1));
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue2 = ((Integer) list.get(i12)).intValue();
            iW += l.W((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        lVar.q0(iW);
        while (i11 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i11)).intValue();
            lVar.q0((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i11++;
        }
    }

    public static void x(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                long jLongValue = ((Long) list.get(i11)).longValue();
                lVar.r0(i10, (jLongValue >> 63) ^ (jLongValue << 1));
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            long jLongValue2 = ((Long) list.get(i12)).longValue();
            iX += l.X((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        lVar.q0(iX);
        while (i11 < list.size()) {
            long jLongValue3 = ((Long) list.get(i11)).longValue();
            lVar.s0((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i11++;
        }
    }

    public static void y(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.p0(i10, ((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += l.W(((Integer) list.get(i12)).intValue());
        }
        lVar.q0(iW);
        while (i11 < list.size()) {
            lVar.q0(((Integer) list.get(i11)).intValue());
            i11++;
        }
    }

    public static void z(int i10, List list, d0 d0Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l lVar = (l) d0Var.f598a;
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                lVar.r0(i10, ((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        lVar.o0(i10, 2);
        int iX = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iX += l.X(((Long) list.get(i12)).longValue());
        }
        lVar.q0(iX);
        while (i11 < list.size()) {
            lVar.s0(((Long) list.get(i11)).longValue());
            i11++;
        }
    }
}
