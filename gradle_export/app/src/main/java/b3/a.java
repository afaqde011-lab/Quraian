package b3;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.inputmethod.InputConnection;
import androidx.credentials.exceptions.GetCredentialException;
import com.google.protobuf.RuntimeVersion;
import g1.b5;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public final class a extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final Object B;

    public a(Object obj, int i10) {
        super(1);
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj) throws Exception {
        int i10 = this.A;
        k00.c cVar = null;
        int i11 = 0;
        g00.b0 b0Var = g00.b0.a;
        Object obj2 = this.B;
        switch (i10) {
            case 0:
                b bVar = (b) obj;
                m0 m0Var = (m0) obj2;
                if (bVar.z() != Integer.MAX_VALUE) {
                    if (bVar.a().f2073b) {
                        bVar.a0();
                    }
                    for (Map.Entry entry : bVar.a().f2080i.entrySet()) {
                        m0.a(m0Var, (z2.a) entry.getKey(), ((Number) entry.getValue()).intValue(), bVar.g());
                    }
                    p1 p1Var = bVar.g().S;
                    kotlin.jvm.internal.m.b(p1Var);
                    while (!p1Var.equals(m0Var.f2072a.g())) {
                        for (z2.a aVar : m0Var.b(p1Var).keySet()) {
                            m0.a(m0Var, aVar, m0Var.c(p1Var, aVar), p1Var);
                        }
                        p1Var = p1Var.S;
                        kotlin.jvm.internal.m.b(p1Var);
                    }
                }
                return b0Var;
            case 1:
                ((m1.e) obj2).b((b2.p) obj);
                return Boolean.TRUE;
            case 2:
                ((l0) obj2).b0((y3.c) obj);
                return b0Var;
            case 3:
                h2.c cVar2 = (h2.c) obj;
                b4.r rVar = (b4.r) obj2;
                if (rVar.N) {
                    a40.c0.y(rVar.p1(), (k00.i) null, (a40.a0) null, new a1.d(rVar, cVar2, cVar, 12), 3);
                }
                return b0Var;
            case 4:
                return Boolean.valueOf(((g2.a0) obj).I1(((g2.f) obj2).f6063a));
            case 5:
                r0 r0Var = (r0) obj;
                c3.z zVar = ((c3.n) obj2).P;
                if (zVar.getInsetsListener().G.h() > 0) {
                    u.w wVar = z2.d2.f17100a;
                    r0Var.A = true;
                    u0 u0Var = r0Var.D;
                    z2.a0 a0VarO0 = u0Var.O0();
                    if (y3.j.b(r0Var.B, 9223372034707292159L)) {
                        r0Var.B = f50.k.C(a0VarO0.G(0L));
                        r0Var.C = a0VarO0.p();
                    }
                    u0Var.W0().f2060h0.b();
                    long jP = a0VarO0.p();
                    u.i0 i0Var = zVar.getInsetsListener().F;
                    int i12 = (int) (jP >> 32);
                    int i13 = (int) (jP & 4294967295L);
                    for (z2.b2 b2Var : z2.d2.f17101b) {
                        Object objG = i0Var.g(b2Var);
                        kotlin.jvm.internal.m.b(objG);
                        z2.e2 e2Var = (z2.e2) objG;
                        z2.c2 c2Var = (z2.c2) b2Var;
                        z2.d2.a(r0Var, c2Var.f17094c, e2Var.f17109h, i12, i13);
                        if (((Boolean) e2Var.f17103b.getValue()).booleanValue()) {
                            z2.d2.a(r0Var, e2Var.f17107f, e2Var.f17111j, i12, i13);
                            z2.d2.a(r0Var, e2Var.f17108g, e2Var.f17112k, i12, i13);
                        }
                        z2.d2.a(r0Var, c2Var.f17095d, e2Var.f17110i, i12, i13);
                    }
                    u.d0 d0Var = zVar.getInsetsListener().H;
                    if (d0Var.i()) {
                        z1.p pVar = zVar.getInsetsListener().I;
                        Object[] objArr = d0Var.f14837a;
                        int i14 = d0Var.f14838b;
                        while (i11 < i14) {
                            l1.z0 z0Var = (l1.z0) objArr[i11];
                            z2.u uVar = (z2.u) pVar.get(i11);
                            Rect rect = (Rect) z0Var.getValue();
                            r0Var.a(uVar.b(), rect.left);
                            r0Var.a(uVar.d(), rect.top);
                            r0Var.a(uVar.c(), rect.right);
                            r0Var.a(uVar.a(), rect.bottom);
                            i11++;
                        }
                    }
                }
                return b0Var;
            case 6:
                return Boolean.valueOf(((u.l) obj2).a(((j3.s) obj).f7970f));
            case 7:
                return Boolean.valueOf(c3.m0.d((j3.s) obj, (Resources) obj2));
            case 8:
                return new c3.k1((c3.r1) obj2, i11);
            case 9:
                if (c3.u1.f2763b.compareAndSet(false, true)) {
                    ((c40.h) obj2).j(b0Var);
                }
                return b0Var;
            case 10:
                k2.d dVar = (k2.d) obj;
                i2.s sVarN = dVar.G0().n();
                u00.n nVar = ((c3.v1) obj2).D;
                if (nVar != null) {
                    nVar.invoke(sVarN, (l2.b) dVar.G0().C);
                }
                return b0Var;
            case 11:
                r3.m mVar = (r3.m) obj;
                InputConnection inputConnection = mVar.f13082b;
                if (inputConnection != null) {
                    mVar.a(inputConnection);
                    mVar.f13082b = null;
                }
                c3.z1 z1Var = (c3.z1) obj2;
                m1.e eVar = z1Var.f2824d;
                Object[] objArr2 = eVar.A;
                int i15 = eVar.C;
                while (true) {
                    if (i11 >= i15) {
                        i11 = -1;
                    } else if (!kotlin.jvm.internal.m.a((q2) objArr2[i11], mVar)) {
                        i11++;
                    }
                }
                if (i11 >= 0) {
                    eVar.k(i11);
                }
                if (eVar.C == 0) {
                    z1Var.f2822b.invoke();
                }
                return b0Var;
            case 12:
                ((kh.v) obj2).cancel(false);
                return b0Var;
            case 13:
                e2.g gVar = (e2.g) obj;
                if (!gVar.A.N) {
                    return n2.B;
                }
                e2.h hVar = gVar.Q;
                if (hVar != null) {
                    hVar.l1((e2.d) obj2);
                }
                gVar.Q = null;
                gVar.P = null;
                return n2.A;
            case 14:
                o0 o0Var = (o0) obj;
                ((h1.v0) obj2).invoke(o0Var);
                o0Var.a();
                return b0Var;
            case 15:
                i2.c0 c0Var = (i2.c0) obj;
                f2.o oVar = (f2.o) obj2;
                c0Var.n(c0Var.c() * oVar.B);
                c0Var.z0(oVar.C);
                c0Var.L0(oVar.D);
                c0Var.D0(oVar.E);
                c0Var.U0(oVar.F);
                return b0Var;
            case 16:
                ((c40.l) ((b5) obj2).f5744j).j(((Boolean) obj).booleanValue() ? "#!upload" : "#!maxRetryAttemptReached");
                return b0Var;
            case 17:
                i2.c0 c0Var2 = (i2.c0) obj;
                i2.u0 u0Var2 = (i2.u0) obj2;
                c0Var2.I0(u0Var2.O);
                c0Var2.N(u0Var2.P);
                c0Var2.s0(u0Var2.Q);
                c0Var2.T0(0.0f);
                c0Var2.w(0.0f);
                c0Var2.n(u0Var2.R);
                c0Var2.p0();
                c0Var2.B0();
                c0Var2.v(u0Var2.S);
                c0Var2.g1(u0Var2.T);
                c0Var2.S0(u0Var2.U);
                c0Var2.z0(u0Var2.V);
                c0Var2.L0(u0Var2.W);
                c0Var2.I(null);
                c0Var2.D0(u0Var2.X);
                c0Var2.U0(u0Var2.Y);
                c0Var2.Q(0);
                c0Var2.C(u0Var2.Z);
                c0Var2.K(u0Var2.f7170a0);
                return b0Var;
            case TYPE_SINT64_VALUE:
                j3.y.k((j3.a0) obj, ((j3.k) obj2).f7937a);
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                j3.y.e((j3.a0) obj, (String) obj2);
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((List) obj).add((Float) ((l0.e1) obj2).invoke());
                return true;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                GetCredentialException getCredentialException = (GetCredentialException) obj;
                kotlin.jvm.internal.m.e(getCredentialException, "e");
                k5.c cVar3 = (k5.c) obj2;
                cVar3.g().execute(new k5.b(cVar3, getCredentialException, i11));
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                k2.d dVar2 = (k2.d) obj;
                l2.b bVar2 = (l2.b) obj2;
                i2.g gVar2 = bVar2.l;
                if (bVar2.f9984n && bVar2.f9993w && gVar2 != null) {
                    a1.i iVarG0 = dVar2.G0();
                    long jQ = iVarG0.q();
                    iVarG0.n().i();
                    try {
                        ((a1.i) ((hf.c) iVarG0.B).B).n().e(gVar2);
                        bVar2.c(dVar2);
                    } finally {
                        w.c.t(iVarG0, jQ);
                    }
                } else {
                    bVar2.c(dVar2);
                }
                return b0Var;
            case 23:
                GetCredentialException getCredentialException2 = (GetCredentialException) obj;
                kotlin.jvm.internal.m.e(getCredentialException2, "e");
                m5.c cVar4 = (m5.c) obj2;
                cVar4.h().execute(new m5.b(cVar4, getCredentialException2, i11));
                return b0Var;
            case 24:
                o2.c0 c0Var3 = (o2.c0) obj;
                o2.c cVar5 = (o2.c) obj2;
                cVar5.g(c0Var3);
                u00.k kVar = cVar5.f11529i;
                if (kVar != null) {
                    kVar.invoke(c0Var3);
                }
                return b0Var;
            case 25:
                ((ob.e) obj2).K = true;
                return b0Var;
            case RuntimeVersion.MINOR:
                rc.i iVar = (rc.i) obj;
                kotlin.jvm.internal.m.e(iVar, "$this$$receiver");
                rc.g gVar3 = (rc.g) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                if (iVar.f13190a) {
                    linkedHashSet.add(rc.e.C);
                }
                if (iVar.f13191b) {
                    linkedHashSet.add(rc.e.D);
                }
                if (iVar.f13192c) {
                    linkedHashSet.add(rc.e.E);
                }
                if (iVar.f13193d) {
                    linkedHashSet.add(rc.e.F);
                }
                gVar3.f13189t = linkedHashSet;
                return b0Var;
            case 27:
                if (!((v2.e) obj).Q) {
                    return n2.A;
                }
                ((kotlin.jvm.internal.v) obj2).A = false;
                return n2.C;
            case 28:
                Throwable th2 = (Throwable) obj;
                v2.i0 i0Var2 = (v2.i0) obj2;
                a40.k kVar2 = i0Var2.C;
                if (kVar2 != null) {
                    kVar2.h(th2);
                }
                i0Var2.C = null;
                return b0Var;
            default:
                tc.c cVar6 = (tc.c) obj;
                kotlin.jvm.internal.m.e(cVar6, "it");
                ((wc.b) obj2).G = cVar6;
                return b0Var;
        }
    }
}
