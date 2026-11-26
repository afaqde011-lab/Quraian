package dn;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import d6.c2;
import d6.d2;
import d6.f2;
import h00.n;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;

public final class l {
    public static final l A;
    public static final l B;
    public static final l C;
    public static final l[] D;

    static {
        l lVar = new l("SMALL", 0);
        A = lVar;
        l lVar2 = new l("MEDIUM", 1);
        B = lVar2;
        l lVar3 = new l("LARGE", 2);
        C = lVar3;
        l[] lVarArr = {lVar, lVar2, lVar3};
        D = lVarArr;
        f50.c.v(lVarArr);
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) D.clone();
    }

    public final b6.m a(l1.j jVar) {
        if (this == A) {
            g0 g0Var = (g0) jVar;
            g0Var.c0(-1441730488);
            b6.m mVarR = ze.d.R(y3.h.b(b(((y3.h) g0Var.k(b6.g.a)).a)));
            g0Var.r(false);
            return mVarR;
        }
        g0 g0Var2 = (g0) jVar;
        g0Var2.c0(-1441643626);
        b6.m mVarD = ze.d.D(ze.d.v(b6.k.a), y3.h.a(b(((y3.h) g0Var2.k(b6.g.a)).a)));
        g0Var2.r(false);
        return mVarD;
    }

    public final long b(long j) {
        float f;
        float f2;
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            float f3 = p30.f.j0(p30.f.j0(new y3.f(y3.h.a(j)), new y3.f(y3.h.b(j))), new y3.f(m.a)).A;
            return f50.c.b(f3, f3);
        }
        if (iOrdinal == 1) {
            float fB = y3.h.b(j);
            int iOrdinal2 = ordinal();
            if (iOrdinal2 == 0) {
                f = m.a;
            } else if (iOrdinal2 == 1) {
                f = 190;
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 340;
            }
            return f50.c.b(fB, f);
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        float fB2 = y3.h.b(j);
        int iOrdinal3 = ordinal();
        if (iOrdinal3 == 0) {
            f2 = m.a;
        } else if (iOrdinal3 == 1) {
            f2 = 190;
        } else {
            if (iOrdinal3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = 340;
        }
        return f50.c.b(fB2, p30.f.j0(new y3.f(y3.h.a(j)), new y3.f(f2)).A);
    }

    public final f2 c() {
        if (k.a[ordinal()] != 3) {
            return c2.a;
        }
        float f = RCHTTPStatusCodes.UNSUCCESSFUL;
        return new d2(n.X0(new y3.h[]{new y3.h(f50.c.b(f, 220)), new y3.h(f50.c.b(f, 260)), new y3.h(f50.c.b(f, f)), new y3.h(f50.c.b(f, 340))}));
    }
}
