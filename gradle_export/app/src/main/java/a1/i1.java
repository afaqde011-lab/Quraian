package a1;

import kotlin.NoWhenBranchMatchedException;

public final class i1 implements l1.k2 {
    public final int A;

    public i1(k1 k1Var) {
        this.A = 0;
    }

    public static long b(long j9, c1 c1Var, g1 g1Var) throws NoWhenBranchMatchedException {
        long jB;
        int i10 = m3.q0.f10519c;
        long jA = c1Var.a((int) (j9 >> 32), true);
        long jA2 = m3.q0.d(j9) ? jA : c1Var.a((int) (j9 & 4294967295L), true);
        x2 x2Var = null;
        x2 x2Var2 = g1Var != null ? g1Var.f45a : null;
        if (m3.q0.d(j9)) {
            x2Var = x2Var2;
        } else if (g1Var != null) {
            x2Var = g1Var.f46b;
        }
        if (x2Var2 != null && !m3.q0.d(jA)) {
            int iOrdinal = x2Var2.ordinal();
            if (iOrdinal == 0) {
                int i11 = (int) (jA >> 32);
                jA = m3.h0.b(i11, i11);
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int i12 = (int) (jA & 4294967295L);
                jA = m3.h0.b(i12, i12);
            }
        }
        if (x2Var != null && !m3.q0.d(jA2)) {
            int iOrdinal2 = x2Var.ordinal();
            if (iOrdinal2 == 0) {
                int i13 = (int) (jA2 >> 32);
                jB = m3.h0.b(i13, i13);
            } else {
                if (iOrdinal2 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                int i14 = (int) (jA2 & 4294967295L);
                jB = m3.h0.b(i14, i14);
            }
            jA2 = jB;
        }
        int iMin = Math.min(m3.q0.g(jA), m3.q0.g(jA2));
        int iMax = Math.max(m3.q0.f(jA), m3.q0.f(jA2));
        return m3.q0.h(j9) ? m3.h0.b(iMax, iMin) : m3.h0.b(iMin, iMax);
    }

    @Override
    public boolean a(Object obj, Object obj2) {
        switch (this.A) {
            case 1:
                m2 m2Var = (m2) obj;
                m2 m2Var2 = (m2) obj2;
                if (m2Var == null || m2Var2 == null) {
                    if ((m2Var == null) ^ (m2Var2 == null)) {
                        return false;
                    }
                } else if (m2Var.f104e != m2Var2.f104e || m2Var.f105f != m2Var2.f105f || m2Var.f101b != m2Var2.f101b || !kotlin.jvm.internal.m.a(m2Var.f102c, m2Var2.f102c) || !y3.a.b(m2Var.f103d, m2Var2.f103d)) {
                    return false;
                }
                return true;
            default:
                n2 n2Var = (n2) obj;
                n2 n2Var2 = (n2) obj2;
                if (n2Var == null || n2Var2 == null) {
                    if ((n2Var == null) ^ (n2Var2 == null)) {
                        return false;
                    }
                } else if (n2Var.f107a != n2Var2.f107a || !kotlin.jvm.internal.m.a(n2Var.f108b, n2Var2.f108b) || n2Var.f109c != n2Var2.f109c || n2Var.f110d != n2Var2.f110d || n2Var.f111e != n2Var2.f111e) {
                    return false;
                }
                return true;
        }
    }
}
