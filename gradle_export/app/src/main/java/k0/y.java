package k0;

import b3.l0;
import d0.n2;
import d0.q1;
import java.util.List;
import l0.f0;
import l0.s0;
import l0.u0;
import l0.v0;
import l1.i1;
import l1.z0;
import s10.w0;

public final class y implements n2 {

    public static final w0 f8542w = y1.k.b(new jk.c(5), new hx.t(20));

    public final j0.a f8543a;

    public boolean f8544b;

    public p f8545c;

    public final j0.q f8546d;

    public final i1 f8547e;

    public final f0.i f8548f;

    public float f8549g;

    public final d0.n f8550h;

    public final boolean f8551i;

    public l0 f8552j;

    public final j0.t f8553k;
    public final l0.d l;
    public final f0 m;

    public final hf.c f8554n;

    public final v0 f8555o;

    public final gi.c f8556p;

    public final s0 f8557q;

    public final z0 f8558r;

    public final z0 f8559s;

    public final i1 f8560t;

    public final i1 f8561u;

    public final h1.l f8562v;

    public y(int i10, int i11) {
        j0.a aVar = new j0.a();
        aVar.f7740a = -1;
        aVar.f7744e = new m1.e(0, new u0[16]);
        aVar.f7742c = -1;
        this.f8543a = aVar;
        this.f8546d = new j0.q(i10, i11, 1);
        this.f8547e = new i1(a0.f8456a, l1.c.D);
        this.f8548f = new f0.i();
        this.f8550h = new d0.n(new h00.a(this, 10));
        this.f8551i = true;
        this.f8553k = new j0.t(this, 1);
        this.l = new l0.d();
        this.m = new f0();
        this.f8554n = new hf.c(15);
        this.f8555o = new v0(new w(this, i10));
        this.f8556p = new gi.c(this, 12);
        this.f8557q = new s0();
        this.f8558r = l0.q.h();
        this.f8559s = l0.q.h();
        Boolean bool = Boolean.FALSE;
        this.f8560t = l1.q.z(bool);
        this.f8561u = l1.q.z(bool);
        this.f8562v = new h1.l(9);
    }

    @Override
    public final boolean a() {
        return this.f8550h.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.f8561u.getValue()).booleanValue();
    }

    @Override
    public final java.lang.Object c(z.b1 r6, u00.n r7, m00.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: k0.y.c(z.b1, u00.n, m00.c):java.lang.Object");
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.f8560t.getValue()).booleanValue();
    }

    @Override
    public final float e(float f3) {
        return this.f8550h.e(f3);
    }

    public final void f(p pVar, boolean z10, boolean z11) {
        q qVar;
        q qVar2;
        q qVar3;
        ?? r4 = pVar.m;
        int i10 = pVar.f8504p;
        r rVar = pVar.f8491a;
        int i11 = pVar.f8492b;
        this.f8555o.f9802e = r4.size();
        Object obj = null;
        obj = null;
        h1.l lVar = this.f8562v;
        j0.q qVar4 = this.f8546d;
        if (!z10 && this.f8544b) {
            this.f8545c = pVar;
            z1.f fVarF = z1.q.f();
            u00.k kVarE = fVarF != null ? fVarF.e() : null;
            z1.f fVarK = z1.q.k(fVarF);
            try {
                if (!(((Number) ((x.j) lVar.B).B.getValue()).floatValue() == 0.0f) && i11 == qVar4.f7809c.h() && rVar != null && (qVar3 = (q) h00.n.E0(rVar.f8530b)) != null && qVar3.f8508a == qVar4.f7808b.h()) {
                    lVar.a1();
                }
                return;
            } finally {
                z1.q.n(fVarF, fVarK, kVarE);
            }
        }
        if (z10) {
            this.f8544b = true;
        }
        this.f8549g -= pVar.f8494d;
        this.f8547e.setValue(pVar);
        this.f8561u.setValue(Boolean.valueOf(((rVar != null ? rVar.f8529a : 0) == 0 && i11 == 0) ? false : true));
        this.f8560t.setValue(Boolean.valueOf(pVar.f8493c));
        if (z11) {
            qVar4.getClass();
            if (!(((float) i11) >= 0.0f)) {
                g0.a.c("scrollOffset should be non-negative");
            }
            qVar4.f7809c.i(i11);
        } else {
            qVar4.getClass();
            if (rVar != null && (qVar2 = (q) h00.n.E0(rVar.f8530b)) != null) {
                obj = qVar2.f8509b;
            }
            qVar4.f7811e = obj;
            if (qVar4.f7810d || i10 > 0) {
                qVar4.f7810d = true;
                if ((((float) i11) >= 0.0f) == false) {
                    g0.a.c("scrollOffset should be non-negative (" + i11 + ')');
                }
                qVar4.a((rVar == null || (qVar = (q) h00.n.E0(rVar.f8530b)) == null) ? 0 : qVar.f8508a, i11);
            }
            if (this.f8551i) {
                j0.a aVar = this.f8543a;
                m1.e eVar = (m1.e) aVar.f7744e;
                int i12 = aVar.f7740a;
                boolean z12 = aVar.f7741b;
                if (i12 != -1 && !r4.isEmpty() && i12 != j0.a.c(pVar, z12)) {
                    aVar.f7740a = -1;
                    Object[] objArr = eVar.A;
                    int i13 = eVar.C;
                    for (int i14 = 0; i14 < i13; i14++) {
                        ((u0) objArr[i14]).cancel();
                    }
                    eVar.g();
                }
                int i15 = aVar.f7742c;
                if (i15 != -1 && aVar.f7743d != 0.0f && i15 != i10 && !r4.isEmpty()) {
                    int iC = j0.a.c(pVar, aVar.f7743d < 0.0f);
                    int iA = j0.a.a(pVar, aVar.f7743d < 0.0f);
                    if (iA >= 0 && iA < i10 && iC != aVar.f7740a && iC >= 0) {
                        aVar.f7740a = iC;
                        eVar.g();
                        eVar.c(eVar.C, this.f8556p.s(iC));
                    }
                }
                aVar.f7742c = i10;
            }
        }
        if (z10) {
            lVar.b1(pVar.f8496f, pVar.f8499i, pVar.f8498h);
        }
    }

    public final p g() {
        return (p) this.f8547e.getValue();
    }

    public final void h(float f3, p pVar) {
        if (this.f8551i) {
            j0.a aVar = this.f8543a;
            m1.e eVar = (m1.e) aVar.f7744e;
            if (!pVar.m.isEmpty()) {
                int i10 = 0;
                boolean z10 = f3 < 0.0f;
                int iC = j0.a.c(pVar, z10);
                int iA = j0.a.a(pVar, z10);
                if (iA >= 0) {
                    q1 q1Var = pVar.f8505q;
                    ?? r7 = pVar.m;
                    if (iA < pVar.f8504p) {
                        if (iC != aVar.f7740a && iC >= 0) {
                            if (aVar.f7741b != z10) {
                                Object[] objArr = eVar.A;
                                int i11 = eVar.C;
                                for (int i12 = 0; i12 < i11; i12++) {
                                    ((u0) objArr[i12]).cancel();
                                }
                            }
                            aVar.f7741b = z10;
                            aVar.f7740a = iC;
                            eVar.g();
                            eVar.c(eVar.C, this.f8556p.s(iC));
                        }
                        if (z10) {
                            q qVar = (q) h00.q.T0((List) r7);
                            if (((rd.a.L(qVar, q1Var) + ((int) (q1Var == q1.A ? qVar.f8524s & 4294967295L : qVar.f8524s >> 32))) + pVar.f8507s) - pVar.f8503o < (-f3)) {
                                Object[] objArr2 = eVar.A;
                                int i13 = eVar.C;
                                while (i10 < i13) {
                                    ((u0) objArr2[i10]).a();
                                    i10++;
                                }
                            }
                        } else if (pVar.f8502n - rd.a.L((q) h00.q.L0((List) r7), q1Var) < f3) {
                            Object[] objArr3 = eVar.A;
                            int i14 = eVar.C;
                            while (i10 < i14) {
                                ((u0) objArr3[i10]).a();
                                i10++;
                            }
                        }
                    }
                }
            }
            aVar.f7743d = f3;
        }
    }
}
