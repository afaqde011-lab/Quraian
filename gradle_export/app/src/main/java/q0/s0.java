package q0;

import com.google.android.gms.internal.measurement.g4;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

public final class s0 implements z2.w0 {

    public final j1 f12694a;

    public final u00.k f12695b;

    public final r3.w f12696c;

    public final r3.p f12697d;

    public final y3.c f12698e;

    public final int f12699f;

    public s0(j1 j1Var, u00.k kVar, r3.w wVar, r3.p pVar, y3.c cVar, int i10) {
        this.f12694a = j1Var;
        this.f12695b = kVar;
        this.f12696c = wVar;
        this.f12697d = pVar;
        this.f12698e = cVar;
        this.f12699f = i10;
    }

    @Override
    public final int i(z2.w wVar, List list, int i10) throws NoWhenBranchMatchedException {
        j1 j1Var = this.f12694a;
        j1Var.f12638a.a(wVar.getLayoutDirection());
        ce.c cVar = j1Var.f12638a.f12692j;
        if (cVar != null) {
            return q.r(cVar.l());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, long j9) throws NoWhenBranchMatchedException {
        m3.n0 n0Var;
        y3.m mVar;
        m3.n0 n0Var2;
        int i10;
        s0 s0Var;
        int iR;
        z2.a0 a0Var;
        j1 j1Var = this.f12694a;
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            e2 e2VarD = j1Var.d();
            z1.q.n(fVarF, fVarK, kVarE);
            m3.n0 n0Var3 = e2VarD != null ? e2VarD.f12608a : null;
            q1 q1Var = j1Var.f12638a;
            y3.m layoutDirection = y0Var.getLayoutDirection();
            int i11 = q1Var.f12688f;
            boolean z10 = q1Var.f12687e;
            int i12 = q1Var.f12685c;
            if (n0Var3 != null) {
                m3.q qVar = n0Var3.f10497b;
                m3.m0 m0Var = n0Var3.f10496a;
                m3.h hVar = q1Var.f12683a;
                m3.r0 r0Var = q1Var.f12684b;
                List list2 = q1Var.f12691i;
                y3.c cVar = q1Var.f12689g;
                q3.h hVar2 = q1Var.f12690h;
                m3.n0 n0Var4 = n0Var3;
                if (!qVar.f10510a.b()) {
                    m3.h hVar3 = m0Var.f10483a;
                    long j10 = m0Var.f10492j;
                    if (kotlin.jvm.internal.m.a(hVar3, hVar) && m0Var.f10484b.d(r0Var) && kotlin.jvm.internal.m.a(m0Var.f10485c, list2) && m0Var.f10486d == i12 && m0Var.f10487e == z10 && m0Var.f10488f == i11 && kotlin.jvm.internal.m.a(m0Var.f10489g, cVar)) {
                        mVar = layoutDirection;
                        if (m0Var.f10490h == mVar && kotlin.jvm.internal.m.a(m0Var.f10491i, hVar2) && y3.a.j(j9) == y3.a.j(j10) && ((!z10 && i11 != 2) || (y3.a.h(j9) == y3.a.h(j10) && y3.a.g(j9) == y3.a.g(j10)))) {
                            n0Var = n0Var4;
                            n0Var2 = new m3.n0(new m3.m0(m0Var.f10483a, q1Var.f12684b, m0Var.f10485c, m0Var.f10486d, m0Var.f10487e, m0Var.f10488f, m0Var.f10489g, m0Var.f10490h, m0Var.f10491i, j9), qVar, y3.b.d(j9, (((long) q.r(qVar.f10514e)) & 4294967295L) | (((long) q.r(qVar.f10513d)) << 32)));
                        }
                    } else {
                        j9 = j9;
                        n0Var = n0Var4;
                        mVar = layoutDirection;
                    }
                    long j11 = n0Var2.f10498c;
                    Integer numValueOf = Integer.valueOf((int) (j11 >> 32));
                    Integer numValueOf2 = Integer.valueOf((int) (j11 & 4294967295L));
                    int iIntValue = numValueOf.intValue();
                    int iIntValue2 = numValueOf2.intValue();
                    if (kotlin.jvm.internal.m.a(n0Var, n0Var2)) {
                        i10 = 0;
                        s0Var = this;
                    } else {
                        if (e2VarD != null) {
                            a0Var = e2VarD.f12610c;
                        } else {
                            a0Var = null;
                        }
                        j1Var.f12646i.setValue(new e2(n0Var2, a0Var));
                        i10 = 0;
                        j1Var.f12651p = false;
                        s0Var = this;
                        s0Var.f12695b.invoke(n0Var2);
                        q.B(j1Var, s0Var.f12696c, s0Var.f12697d);
                    }
                    if (s0Var.f12699f == 1) {
                        iR = q.r(n0Var2.f10497b.b(i10));
                    } else {
                        iR = i10;
                    }
                    j1Var.f12644g.setValue(new y3.f(s0Var.f12698e.h0(iR)));
                    return y0Var.o0(iIntValue, iIntValue2, h00.d0.R(new g00.k[]{new g00.k(z2.d.f17096a, Integer.valueOf(Math.round(n0Var2.f10499d))), new g00.k(z2.d.f17097b, Integer.valueOf(Math.round(n0Var2.f10500e)))}), new xn.a(29));
                }
                mVar = layoutDirection;
                n0Var = n0Var4;
            } else {
                j9 = j9;
                n0Var = n0Var3;
                mVar = layoutDirection;
            }
            q1Var.a(mVar);
            int iJ = y3.a.j(j9);
            int iH = ((z10 || i11 == 2) && y3.a.d(j9)) ? y3.a.h(j9) : Integer.MAX_VALUE;
            int i13 = (z10 || i11 != 2) ? i12 : 1;
            if (iJ != iH) {
                ce.c cVar2 = q1Var.f12692j;
                if (cVar2 == null) {
                    throw new IllegalStateException("layoutIntrinsics must be called first");
                }
                iH = ab.a0.y(q.r(cVar2.l()), iJ, iH);
            }
            ce.c cVar3 = q1Var.f12692j;
            if (cVar3 == null) {
                throw new IllegalStateException("layoutIntrinsics must be called first");
            }
            m3.q qVar2 = new m3.q(cVar3, g4.G(0, iH, 0, y3.a.g(j9)), i13, q1Var.f12688f);
            n0Var2 = new m3.n0(new m3.m0(q1Var.f12683a, q1Var.f12684b, q1Var.f12691i, q1Var.f12685c, q1Var.f12687e, q1Var.f12688f, q1Var.f12689g, mVar, q1Var.f12690h, j9), qVar2, y3.b.d(j9, (((long) q.r(qVar2.f10513d)) << 32) | (((long) q.r(qVar2.f10514e)) & 4294967295L)));
            long j12 = n0Var2.f10498c;
            Integer numValueOf3 = Integer.valueOf((int) (j12 >> 32));
            Integer numValueOf4 = Integer.valueOf((int) (j12 & 4294967295L));
            int iIntValue3 = numValueOf3.intValue();
            int iIntValue4 = numValueOf4.intValue();
            if (kotlin.jvm.internal.m.a(n0Var, n0Var2)) {
                if (e2VarD != null) {
                    a0Var = e2VarD.f12610c;
                } else {
                    a0Var = null;
                }
                j1Var.f12646i.setValue(new e2(n0Var2, a0Var));
                i10 = 0;
                j1Var.f12651p = false;
                s0Var = this;
                s0Var.f12695b.invoke(n0Var2);
                q.B(j1Var, s0Var.f12696c, s0Var.f12697d);
            } else {
                i10 = 0;
                s0Var = this;
            }
            if (s0Var.f12699f == 1) {
                iR = q.r(n0Var2.f10497b.b(i10));
            } else {
                iR = i10;
            }
            j1Var.f12644g.setValue(new y3.f(s0Var.f12698e.h0(iR)));
            return y0Var.o0(iIntValue3, iIntValue4, h00.d0.R(new g00.k[]{new g00.k(z2.d.f17096a, Integer.valueOf(Math.round(n0Var2.f10499d))), new g00.k(z2.d.f17097b, Integer.valueOf(Math.round(n0Var2.f10500e)))}), new xn.a(29));
        } catch (Throwable th2) {
            z1.q.n(fVarF, fVarK, kVarE);
            throw th2;
        }
    }
}
