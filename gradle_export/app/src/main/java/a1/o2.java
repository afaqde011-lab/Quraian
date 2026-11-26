package a1;

import android.icu.text.DecimalFormatSymbols;
import java.util.List;

public final class o2 implements l1.p2, z1.z {
    public m3.p0 C;
    public final l1.i1 A = new l1.i1(null, n2.f106f);
    public final l1.i1 B = new l1.i1(null, m2.f99g);
    public l2 D = new l2();

    @Override
    public final z1.b0 a() {
        return this.D;
    }

    @Override
    public final z1.b0 c(z1.b0 b0Var, z1.b0 b0Var2, z1.b0 b0Var3) {
        return b0Var3;
    }

    @Override
    public final void e(z1.b0 b0Var) {
        kotlin.jvm.internal.m.c(b0Var, "null cannot be cast to non-null type androidx.compose.foundation.text.input.internal.TextFieldLayoutStateCache.CacheRecord");
        this.D = (l2) b0Var;
    }

    public final m3.n0 f(n2 n2Var, m2 m2Var) {
        t3.a aVar;
        CharSequence charSequence;
        m3.r0 r0Var;
        z0.b bVarD = n2Var.f107a.d();
        i00.b bVarK = bVarD.A;
        i00.b bVar = bVarD.B;
        if ((bVarK == null || bVarK.isEmpty()) && (bVar == null || bVar.isEmpty())) {
            bVarK = null;
        } else if (bVarK == null || bVarK.isEmpty()) {
            bVarK = bVar;
        } else if (bVar != null && !bVar.isEmpty()) {
            i00.b bVarS = va.a.s();
            bVarS.addAll(bVarK);
            bVarS.addAll(bVar);
            bVarK = va.a.k(bVarS);
        }
        l2 l2Var = (l2) z1.l.h(this.D);
        m3.n0 n0Var = l2Var.f95n;
        if (n0Var != null && (charSequence = l2Var.f86c) != null && r30.r.n0(charSequence, bVarD) && kotlin.jvm.internal.m.a(l2Var.f87d, bVarK) && kotlin.jvm.internal.m.a(l2Var.f88e, bVarD.E) && l2Var.f90g == n2Var.f109c && l2Var.f91h == n2Var.f110d && l2Var.f94k == m2Var.f101b && l2Var.f92i == m2Var.f100a.c() && l2Var.f93j == m2Var.f100a.t0() && y3.a.b(l2Var.m, m2Var.f103d) && kotlin.jvm.internal.m.a(l2Var.l, m2Var.f102c) && !n0Var.f10497b.f10510a.b()) {
            m3.r0 r0Var2 = l2Var.f89f;
            boolean zD = r0Var2 != null ? r0Var2.d(n2Var.f108b) : false;
            m3.r0 r0Var3 = l2Var.f89f;
            boolean z10 = r0Var3 != null && (r0Var3 == (r0Var = n2Var.f108b) || r0Var3.f10522a.b(r0Var.f10522a));
            if (zD && z10) {
                return n0Var;
            }
            if (zD) {
                m3.m0 m0Var = n0Var.f10496a;
                return new m3.n0(new m3.m0(m0Var.f10483a, n2Var.f108b, m0Var.f10485c, m0Var.f10486d, m0Var.f10487e, m0Var.f10488f, m0Var.f10489g, m0Var.f10490h, m0Var.f10491i, m0Var.f10492j), n0Var.f10497b, n0Var.f10498c);
            }
        }
        m3.p0 p0Var = this.C;
        if (p0Var == null) {
            p0Var = new m3.p0(m2Var.f102c, m2Var.f100a, m2Var.f101b, 1);
            this.C = p0Var;
        }
        m3.p0 p0Var2 = p0Var;
        boolean z11 = n2Var.f111e;
        m3.r0 r0VarE = n2Var.f108b;
        if (z11) {
            t3.b bVar2 = r0VarE.f10522a.f10467k;
            if (bVar2 == null || (aVar = (t3.a) bVar2.A.get(0)) == null) {
                aVar = (t3.a) t3.c.f14353a.q().A.get(0);
            }
            byte directionality = Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(aVar.f14352a).getDigitStrings()[0], 0));
            r0VarE = r0VarE.e(new m3.r0(0L, 0L, null, null, 0L, 0L, 0, (directionality == 1 || directionality == 2) ? 2 : 1, 0L, null, 16711679));
        }
        m3.n0 n0VarB = m3.p0.b(p0Var2, new m3.h(bVarD.C.toString(), (List) (bVarK == null ? h00.x.A : bVarK)), r0VarE, n2Var.f110d, n2Var.f109c ? 1 : Integer.MAX_VALUE, m2Var.f103d, m2Var.f101b, m2Var.f100a, m2Var.f102c, 1060);
        if (!n0VarB.equals(n0Var)) {
            z1.f fVarJ = z1.l.j();
            if (!fVarJ.f()) {
                l2 l2Var2 = this.D;
                synchronized (z1.l.f17038c) {
                    l2 l2Var3 = (l2) z1.l.w(l2Var2, this, fVarJ);
                    l2Var3.f86c = bVarD;
                    l2Var3.f87d = bVarK;
                    l2Var3.f88e = bVarD.E;
                    l2Var3.f90g = n2Var.f109c;
                    l2Var3.f91h = n2Var.f110d;
                    l2Var3.f89f = n2Var.f108b;
                    l2Var3.f94k = m2Var.f101b;
                    l2Var3.f92i = m2Var.f104e;
                    l2Var3.f93j = m2Var.f105f;
                    l2Var3.m = m2Var.f103d;
                    l2Var3.l = m2Var.f102c;
                    l2Var3.f95n = n0VarB;
                }
                z1.l.n(fVarJ, this);
                return n0VarB;
            }
        }
        return n0VarB;
    }

    @Override
    public final Object getValue() {
        m2 m2Var;
        n2 n2Var = (n2) this.A.getValue();
        if (n2Var == null || (m2Var = (m2) this.B.getValue()) == null) {
            return null;
        }
        return f(n2Var, m2Var);
    }
}
