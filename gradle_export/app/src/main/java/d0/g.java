package d0;

import androidx.work.impl.WorkDatabase;
import g1.k8;
import g1.m4;
import g1.m6;
import g1.n6;
import g1.z7;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;

public final class g implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public g(Object obj, Object obj2, Object obj3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public final Object invoke() {
        g00.b0 b0Var;
        int i10;
        switch (this.A) {
            case 0:
                i iVar = (i) this.B;
                n3 n3Var = (n3) this.C;
                c cVar = (c) this.D;
                me.i iVar2 = iVar.T;
                while (true) {
                    m1.e eVar = (m1.e) iVar2.B;
                    int i11 = eVar.C;
                    b0Var = g00.b0.a;
                    if (i11 != 0) {
                        if (i11 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        h2.c cVar2 = (h2.c) ((f) eVar.A[i11 - 1]).f4427a.invoke();
                        if (cVar2 == null ? true : i.D1(iVar, cVar2, 0L, 0L, 3)) {
                            m1.e eVar2 = (m1.e) iVar2.B;
                            ((f) eVar2.k(eVar2.C - 1)).f4428b.resumeWith(b0Var);
                        }
                    }
                }
                if (iVar.U) {
                    h2.c cVar3 = (h2.c) iVar.S.invoke();
                    if (cVar3 != null && i.D1(iVar, cVar3, 0L, 0L, 3)) {
                        iVar.U = false;
                    }
                }
                n3Var.f4475e = i.B1(iVar, cVar, 0L);
                return b0Var;
            case 1:
                m6 m6Var = (m6) this.B;
                a40.z zVar = (a40.z) this.C;
                m6 m6Var2 = (m6) this.D;
                if (((Boolean) ((u00.k) m6Var.f5887d.f5629d).invoke(n6.B)).booleanValue()) {
                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new m4(m6Var2, null, 6), 3);
                }
                return Boolean.TRUE;
            case 2:
                g1.h hVar = (g1.h) this.B;
                y3.c cVar4 = (y3.c) this.C;
                l1.z0 z0Var = (l1.z0) this.D;
                long jV = z7.v(hVar);
                return Boolean.valueOf(((h2.c) z0Var.getValue()).a((((long) Float.floatToRawIntBits(cVar4.A0(y3.g.b(jV)))) & 4294967295L) | (((long) Float.floatToRawIntBits(cVar4.A0(y3.g.a(jV)))) << 32)));
            case 3:
                k8 k8Var = (k8) this.B;
                a40.z zVar2 = (a40.z) this.C;
                l1.z0 z0Var2 = (l1.z0) this.D;
                if (k8Var.b()) {
                    a40.c0.y(zVar2, (k00.i) null, (a40.a0) null, new bt.y0(k8Var, (k00.c) null, 6), 3);
                    z0Var2.setValue(Boolean.FALSE);
                }
                return g00.b0.a;
            case 4:
                ib.o oVar = (ib.o) this.B;
                UUID uuid = (UUID) this.C;
                za.g gVar = (za.g) this.D;
                oVar.getClass();
                String string = uuid.toString();
                za.v vVarD = za.v.d();
                String str = ib.o.f7580c;
                vVarD.a(str, "Updating progress for " + uuid + " (" + gVar + ")");
                WorkDatabase workDatabase = oVar.f7581a;
                workDatabase.b();
                try {
                    hb.p pVarE = workDatabase.w().e(string);
                    if (pVarE == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (pVarE.f7005b == za.g0.B) {
                        hb.l lVar = new hb.l(string, gVar);
                        hb.m mVarV = workDatabase.v();
                        mVarV.getClass();
                        rd.a.M(mVarV.f6984a, false, true, new h1.v0(mVarV, lVar, 5));
                    } else {
                        za.v.d().g(str, "Ignoring setProgressAsync(...). WorkSpec (" + string + ") is not in a RUNNING state.");
                    }
                    workDatabase.p();
                    workDatabase.f();
                    return null;
                } catch (Throwable th2) {
                    try {
                        za.v.d().c(str, "Error updating Worker progress", th2);
                        throw th2;
                    } catch (Throwable th3) {
                        workDatabase.f();
                        throw th3;
                    }
                }
            case 5:
                ta.c0.M((a40.z) this.B, null, null, null, new g6.a((c3.g1) this.C, (String) this.D, null, 9), 31);
                return g00.b0.a;
            case 6:
                l1.w wVar = (l1.w) this.B;
                j0.v vVar = (j0.v) this.C;
                j0.b bVar = (j0.b) this.D;
                j0.h hVar2 = (j0.h) wVar.getValue();
                return new j0.i(vVar, hVar2, bVar, new c50.h((z00.e) vVar.f7821e.f7812f.getValue(), hVar2));
            case 7:
                return new m0.n((u00.p) ((l1.z0) this.B).getValue(), (u00.k) ((l1.z0) this.C).getValue(), ((Number) ((u00.a) this.D).invoke()).intValue());
            case 8:
                n0.g gVar2 = (n0.g) this.B;
                h2.c cVarB1 = n0.g.B1(gVar2, (b3.p1) this.C, (b3.k0) this.D);
                if (cVarB1 == null) {
                    return null;
                }
                i iVar3 = gVar2.O;
                if (y3.l.b(iVar3.V, j.f4440a)) {
                    g0.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarB1.j(iVar3.F1(cVarB1, iVar3.C1(), 0L) ^ (-9223372034707292160L));
            case 9:
                o1.b bVar2 = (o1.b) this.B;
                o1.k kVar = (o1.k) this.C;
                p1.k0 k0Var = (p1.k0) this.D;
                if (bVar2 != null) {
                    kVar.a(kVar.c(bVar2) - kVar.f11507t);
                }
                List listL = a10.h0.l(kVar, (Integer) null, kVar.f11507t, (Integer) null);
                a2.c cVar5 = (a2.c) h00.q.U0(listL);
                Integer num = cVar5 != null ? cVar5.f159c : null;
                List listA0 = k0Var.a0(num);
                if (num != null && !listA0.isEmpty()) {
                    a2.c cVar6 = (a2.c) h00.q.L0(listA0);
                    List listH0 = h00.q.H0(listA0, 1);
                    int i12 = cVar6.f157a;
                    a2.o oVar2 = cVar6.f158b;
                    cVar6.getClass();
                    listA0 = h00.q.Y0(listH0, va.a.R(new a2.c(i12, oVar2, num)));
                }
                return new a2.a(h00.q.Y0(listA0, listL), k0Var.u0());
            case 10:
                g1.b3 b3Var = (g1.b3) this.B;
                u00.k kVar2 = (u00.k) this.C;
                u00.a aVar = (u00.a) this.D;
                Long lB = b3Var.b();
                if (lB != null) {
                    LocalDate localDate = Instant.ofEpochMilli(lB.longValue()).atZone(ZoneOffset.UTC).toLocalDate();
                    kotlin.jvm.internal.m.d(localDate, "toLocalDate(...)");
                    kVar2.invoke(localDate);
                    aVar.invoke();
                }
                return g00.b0.a;
            case 11:
                ArrayList arrayList = (ArrayList) this.B;
                q9.c cVar7 = (q9.c) this.C;
                u00.a aVar2 = (u00.a) this.D;
                int size = arrayList.size() - cVar7.a().size();
                for (int i13 = 0; i13 < size; i13++) {
                    aVar2.invoke();
                }
                return g00.b0.a;
            case 12:
                x.b bVar3 = (x.b) this.B;
                h0.t tVar = (h0.t) this.C;
                y3.c cVar8 = (y3.c) this.D;
                float fFloatValue = ((Number) bVar3.d()).floatValue() / y3.a.h(tVar.f6461b);
                if (fFloatValue < -1.0f) {
                    fFloatValue = -1.0f;
                }
                if (fFloatValue > 1.0f) {
                    fFloatValue = 1.0f;
                }
                return Float.valueOf(x.w.f16377a.b(Math.abs(fFloatValue)) * Math.signum(fFloatValue) * cVar8.A0(4.0f));
            default:
                v1.b bVar4 = (v1.b) this.B;
                ce.c cVar9 = (ce.c) this.C;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.D;
                bVar4.a();
                v1.a aVar3 = (v1.a) cVar9.D;
                int i14 = xVar.A;
                do {
                    i10 = aVar3.get();
                } while (!aVar3.compareAndSet(i10, ((i10 >>> 27) & 15) == i14 ? i10 - 1 : i10));
                return g00.b0.a;
        }
    }
}
