package a1;

import android.net.ConnectivityManager;
import android.view.accessibility.AccessibilityManager;
import androidx.work.impl.WorkDatabase;
import c3.g3;
import com.google.android.gms.internal.measurement.x5;
import com.google.protobuf.RuntimeVersion;
import g1.k8;
import g1.m4;
import g1.m6;
import g1.n6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;

public final class o1 implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;

    public o1(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke() {
        ArrayList arrayListY0;
        o1.g gVarI;
        final boolean z10;
        long j9;
        q0.e2 e2VarD;
        q0.j1 j1Var;
        m3.h hVar;
        int i10 = 14;
        int i11 = 7;
        int i12 = 2;
        k00.c jVar = null;
        int i13 = 0;
        switch (this.A) {
            case 0:
                t1 t1Var = (t1) this.B;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.C;
                t1Var.T.d();
                if (t1Var.N && ((c3.f2) ((g3) b3.m.h(t1Var, c3.o1.f2745u))).b()) {
                    i12 = 1;
                }
                int i14 = xVar.A;
                int i15 = i12 * i14;
                xVar.A = i14 * (-1);
                return Integer.valueOf(i15);
            case 1:
                b1.e0 e0Var = (b1.e0) this.B;
                j2 j2Var = (j2) this.C;
                if (!e0Var.f1943d) {
                    z.g0 g0Var = j2Var.f60b0;
                    if (g0Var.N) {
                        g0Var.V.I1(7);
                    }
                }
                return g00.b0.a;
            case 2:
                w2 w2Var = (w2) this.B;
                r rVar = (r) this.C;
                z0.b bVarD = w2Var.f135a.d();
                g1 g1Var = (g1) w2Var.f139e.getValue();
                c1 c1Var = new c1(0, false);
                StringBuilder sb2 = new StringBuilder();
                boolean z11 = false;
                int i16 = 0;
                while (i13 < bVarD.C.length()) {
                    int iCodePointAt = Character.codePointAt(bVarD, i13);
                    int iA = rVar.a(i16, iCodePointAt);
                    int iCharCount = Character.charCount(iCodePointAt);
                    if (iA != iCodePointAt) {
                        c1Var.i(sb2.length(), sb2.length() + iCharCount, Character.charCount(iA));
                        z11 = true;
                    }
                    sb2.appendCodePoint(iA);
                    i13 += iCharCount;
                    i16++;
                }
                CharSequence string = z11 ? sb2.toString() : bVarD;
                if (string == bVarD) {
                    return null;
                }
                long jB = i1.b(bVarD.D, c1Var, g1Var);
                m3.q0 q0Var = bVarD.E;
                return new t2(new z0.b(string, jB, q0Var != null ? new m3.q0(i1.b(q0Var.f10520a, c1Var, g1Var)) : null, null, null, null, 56), c1Var);
            case 3:
                a2.e eVar = (a2.e) this.B;
                Object obj = this.C;
                l1.g0 g0Var2 = eVar.A;
                o1.h hVar2 = g0Var2.f9844c;
                o1.g gVarI2 = hVar2.i();
                int i17 = 0;
                while (true) {
                    try {
                        if (i17 < hVar2.B) {
                            if (gVarI2.l(i17)) {
                                Object objN = gVarI2.n(i17);
                                if (objN != obj) {
                                    l1.z1 z1Var = objN instanceof l1.z1 ? (l1.z1) objN : null;
                                    if ((z1Var != null ? z1Var.a() : null) == obj) {
                                    }
                                }
                                k00.c jVar2 = new a2.j(i17, null);
                                gVarI2.c();
                                jVar = jVar2;
                                if (jVar != null) {
                                    int i18 = jVar.f163a;
                                    Integer num = jVar.f164b;
                                    gVarI = hVar2.i();
                                    try {
                                        ArrayList arrayListV = a10.h0.V(gVarI, i18, num);
                                        gVarI.c();
                                        arrayListY0 = h00.q.Y0(g0Var2.G(), arrayListV);
                                    } catch (Throwable th2) {
                                        gVarI.c();
                                        throw th2;
                                    }
                                } else {
                                    arrayListY0 = h00.x.A;
                                }
                                return new a2.a(arrayListY0, g0Var2.C);
                            }
                            int[] iArr = gVarI2.f11479b;
                            int i19 = i17 + 1;
                            int iB = (i19 < gVarI2.f11480c ? iArr[(i19 * 5) + 4] : gVarI2.f11482e) - o1.j.b(iArr, i17);
                            int i20 = 0;
                            while (true) {
                                if (i20 >= iB) {
                                    i17 = i19;
                                } else {
                                    Object objH = gVarI2.h(i17, i20);
                                    if (objH != obj) {
                                        l1.z1 z1Var2 = objH instanceof l1.z1 ? (l1.z1) objH : null;
                                        if ((z1Var2 != null ? z1Var2.a() : null) != obj) {
                                            i20++;
                                        }
                                    }
                                    jVar = new a2.j(i17, Integer.valueOf(i20));
                                }
                            }
                        }
                        gVarI2.c();
                        if (jVar != null) {
                            int i110 = jVar.f163a;
                            Integer num2 = jVar.f164b;
                            gVarI = hVar2.i();
                            ArrayList arrayListV2 = a10.h0.V(gVarI, i110, num2);
                            gVarI.c();
                            arrayListY0 = h00.q.Y0(g0Var2.G(), arrayListV2);
                        } else {
                            arrayListY0 = h00.x.A;
                        }
                        return new a2.a(arrayListY0, g0Var2.C);
                    } catch (Throwable th3) {
                        gVarI2.c();
                        throw th3;
                    }
                }
            case 4:
                ab.y yVar = (ab.y) this.B;
                za.e0 e0Var2 = (za.e0) this.C;
                hb.x xVarW = yVar.f420c.w();
                List listF = xVarW.f("daily_push_notification_work");
                if (listF.size() > 1) {
                    throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
                }
                hb.n nVar = (hb.n) h00.q.N0(listF);
                if (nVar == null) {
                    ib.c.a(new ab.q(yVar, "daily_push_notification_work", za.l.B, va.a.R(e0Var2), 0));
                } else {
                    String str = nVar.f6986a;
                    hb.p pVarE = xVarW.e(str);
                    if (pVarE == null) {
                        throw new IllegalStateException(b.p("WorkSpec with ", str, ", that matches a name \"daily_push_notification_work\", wasn't found"));
                    }
                    if (!pVarE.c()) {
                        throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                    }
                    if (nVar.f6987b == za.g0.F) {
                        xVarW.c(str);
                        ib.c.a(new ab.q(yVar, "daily_push_notification_work", za.l.B, va.a.R(e0Var2), 0));
                    } else {
                        final hb.p pVarB = hb.p.b(e0Var2.f17388b, nVar.f6986a, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        ab.g gVar = yVar.f423f;
                        kotlin.jvm.internal.m.d(gVar, "getProcessor(...)");
                        final WorkDatabase workDatabase = yVar.f420c;
                        kotlin.jvm.internal.m.d(workDatabase, "getWorkDatabase(...)");
                        za.b bVar = yVar.f419b;
                        kotlin.jvm.internal.m.d(bVar, "<get-configuration>(...)");
                        final List list = yVar.f422e;
                        kotlin.jvm.internal.m.d(list, "getSchedulers(...)");
                        final Set set = e0Var2.f17389c;
                        final String str2 = pVarB.f7004a;
                        final hb.p pVarE2 = workDatabase.w().e(str2);
                        if (pVarE2 == null) {
                            throw new IllegalArgumentException(b.p("Worker with ", str2, " doesn't exist"));
                        }
                        if (pVarE2.f7005b.a()) {
                            za.i0[] i0VarArr = za.i0.A;
                        } else {
                            if (pVarE2.c() ^ pVarB.c()) {
                                StringBuilder sb3 = new StringBuilder("Can't update ");
                                sb3.append(pVarE2.c() ? "Periodic" : "OneTime");
                                sb3.append(" Worker to ");
                                throw new UnsupportedOperationException(x5.n(sb3, pVarB.c() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            synchronized (gVar.f378k) {
                                z10 = gVar.c(str2) != null;
                                break;
                            }
                            if (!z10) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((ab.i) it.next()).c(str2);
                                }
                            }
                            workDatabase.o(new z(new Runnable() {
                                @Override
                                public final void run() {
                                    WorkDatabase workDatabase2 = workDatabase;
                                    hb.x xVarW2 = workDatabase2.w();
                                    hb.z zVarX = workDatabase2.x();
                                    hb.p pVar = pVarE2;
                                    za.g0 g0Var3 = pVar.f7005b;
                                    int i21 = pVar.f7014k;
                                    long j10 = pVar.f7015n;
                                    int i22 = pVar.f7021t + 1;
                                    int i23 = pVar.f7020s;
                                    long j11 = pVar.f7022u;
                                    int i24 = pVar.f7023v;
                                    hb.p pVar2 = pVarB;
                                    hb.p pVarB2 = hb.p.b(pVar2, null, g0Var3, null, null, i21, j10, i23, i22, j11, i24, 29613053);
                                    if (pVar2.f7023v == 1) {
                                        pVarB2.f7022u = pVar2.f7022u;
                                        pVarB2.f7023v++;
                                    }
                                    hb.p pVarD = ib.g.d(list, pVarB2);
                                    xVarW2.getClass();
                                    rd.a.M(xVarW2.f7028a, false, true, new hb.t(xVarW2, pVarD, 1));
                                    zVarX.getClass();
                                    String str3 = str2;
                                    kotlin.jvm.internal.m.e(str3, "id");
                                    rd.a.M(zVarX.f7033a, false, true, new hb.u(str3, 7));
                                    zVarX.a(str3, set);
                                    if (z10) {
                                        return;
                                    }
                                    xVarW2.g(-1L, str3);
                                    hb.m mVarV = workDatabase2.v();
                                    mVarV.getClass();
                                    rd.a.M(mVarV.f6984a, false, true, new b6.o(str3, 24));
                                }
                            }, i10));
                            if (!z10) {
                                ab.l.b(bVar, workDatabase, list);
                            }
                            za.i0[] i0VarArr2 = za.i0.A;
                        }
                    }
                }
                return g00.b0.a;
            case 5:
                ry.a aVar = (ry.a) this.B;
                bz.s sVar = (bz.s) this.C;
                if (aVar != null) {
                    sVar.l(new bz.h(aVar.a));
                }
                return g00.b0.a;
            case 6:
                p9.g gVar2 = (p9.g) this.B;
                cq.a aVar2 = (cq.a) this.C;
                if (gVar2 != null) {
                    aVar2.getClass();
                    z1.p pVarB2 = aVar2.a((cq.i) aVar2.a.b.getValue()).b();
                    if (!pVarB2.contains(gVar2) || kotlin.jvm.internal.m.a(h00.q.U0(pVarB2), gVar2)) {
                        aVar2.b();
                    }
                } else {
                    aVar2.b();
                }
                return g00.b0.a;
            case 7:
                al.l lVar = (al.l) this.B;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.C;
                synchronized (db.f.f4848b) {
                    LinkedHashMap linkedHashMap = db.f.f4849c;
                    linkedHashMap.remove(lVar);
                    if (linkedHashMap.isEmpty()) {
                        za.v.d().a(db.h.f4853a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(db.f.f4847a);
                        db.f.f4852f = null;
                        db.f.f4850d = null;
                        db.f.f4851e = false;
                    }
                    break;
                }
                return g00.b0.a;
            case 8:
                ((e.f) this.B).f4936c = (u00.a) this.C;
                return g00.b0.a;
            case 9:
                e1.v0 v0Var = (e1.v0) this.B;
                long j10 = ((y3.l) ((l1.z0) this.C).getValue()).f16596a;
                h2.b bVarI = v0Var.i();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (bVarI != null) {
                    long j11 = bVarI.f6544a;
                    m3.h hVarM = v0Var.m();
                    if (hVarM != null && hVarM.B.length() != 0) {
                        q0.y0 y0Var = (q0.y0) v0Var.f5030r.getValue();
                        int i21 = y0Var == null ? -1 : e1.x0.f5041a[y0Var.ordinal()];
                        if (i21 != -1) {
                            if (i21 == 1 || i21 == 2) {
                                long j12 = v0Var.n().f13100b;
                                int i22 = m3.q0.f10519c;
                                j9 = j12 >> 32;
                            } else {
                                if (i21 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                long j13 = v0Var.n().f13100b;
                                int i23 = m3.q0.f10519c;
                                j9 = j13 & 4294967295L;
                            }
                            int i24 = (int) j9;
                            q0.j1 j1Var2 = v0Var.f5018d;
                            if (j1Var2 != null && (e2VarD = j1Var2.d()) != null && (j1Var = v0Var.f5018d) != null && (hVar = j1Var.f12638a.f12683a) != null) {
                                int iY = ab.a0.y(v0Var.f5016b.z(i24), 0, hVar.B.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (e2VarD.d(j11) >> 32));
                                m3.n0 n0Var = e2VarD.f12608a;
                                m3.q qVar = n0Var.f10497b;
                                int iD = qVar.d(iY);
                                float f3 = n0Var.f(iD);
                                float fG = n0Var.g(iD);
                                float fX = ab.a0.x(fIntBitsToFloat, Math.min(f3, fG), Math.max(f3, fG));
                                if (y3.l.b(j10, 0L) || Math.abs(fIntBitsToFloat - fX) <= ((int) (j10 >> 32)) / 2) {
                                    float f10 = qVar.f(iD);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fX)) << 32) | (((long) Float.floatToRawIntBits(((qVar.b(iD) - f10) / 2) + f10)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new h2.b(jFloatToRawIntBits);
            case 10:
                eb.b bVar2 = (eb.b) this.B;
                eb.a aVar3 = (eb.a) this.C;
                fb.a aVar4 = bVar2.f5239a;
                aVar4.getClass();
                synchronized (aVar4.f5582c) {
                    if (aVar4.f5583d.remove(aVar3) && aVar4.f5583d.isEmpty()) {
                        aVar4.getClass();
                        za.v.d().a(fb.d.f5589a, aVar4.getClass().getSimpleName().concat(": unregistering receiver"));
                        aVar4.f5581b.unregisterReceiver(aVar4.f5585f);
                    }
                    break;
                }
                return g00.b0.a;
            case 11:
                m6 m6Var = (m6) this.B;
                a40.z zVar = (a40.z) this.C;
                if (((Boolean) ((u00.k) m6Var.f5887d.f5629d).invoke(n6.C)).booleanValue()) {
                    a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new m4(m6Var, jVar, i11), 3);
                }
                return Boolean.TRUE;
            case 12:
                ((u00.k) this.B).invoke(Float.valueOf(((yu.f) this.C).A));
                return g00.b0.a;
            case 13:
                ((u00.k) this.B).invoke((ru.d) this.C);
                return g00.b0.a;
            case 14:
                h1.m0 m0Var = (h1.m0) this.B;
                AccessibilityManager accessibilityManager = (AccessibilityManager) this.C;
                m0Var.getClass();
                accessibilityManager.removeAccessibilityStateChangeListener(m0Var);
                h1.l0 l0Var = m0Var.D;
                if (l0Var != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(l0Var);
                }
                h1.k0 k0Var = m0Var.E;
                if (k0Var != null) {
                    accessibilityManager.removeAccessibilityServicesStateChangeListener(k0Var);
                }
                return g00.b0.a;
            case 15:
                a40.c0.y((a40.z) this.B, (k00.i) null, (a40.a0) null, new h1.o((k8) this.C, jVar, i13), 3);
                return Boolean.TRUE;
            case 16:
                ((u00.k) this.B).invoke(Integer.valueOf(((qr.s) this.C).a));
                return g00.b0.a;
            case 17:
                ab.y yVar2 = (ab.y) this.B;
                UUID uuid = (UUID) this.C;
                WorkDatabase workDatabase2 = yVar2.f420c;
                kotlin.jvm.internal.m.d(workDatabase2, "getWorkDatabase(...)");
                workDatabase2.o(new z(new ab.f(yVar2, uuid, 20), i10));
                ab.l.b(yVar2.f419b, workDatabase2, yVar2.f422e);
                return g00.b0.a;
            case TYPE_SINT64_VALUE:
                return ((hb.u) this.B).invoke((WorkDatabase) this.C);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                su.e eVar2 = (su.e) this.B;
                u00.k kVar = (u00.k) this.C;
                if (eVar2 != null) {
                    kVar.invoke(eVar2);
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                yu.a aVar5 = (yu.a) this.B;
                iv.m mVar = (iv.m) this.C;
                if (aVar5.e != null) {
                    mVar.d.invoke(yu.b.a);
                } else {
                    mVar.e.invoke();
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                yu.e eVar3 = (yu.e) this.B;
                iv.m mVar2 = (iv.m) this.C;
                if (eVar3 != null) {
                    mVar2.d.invoke(eVar3);
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ((u00.k) this.B).invoke((String) this.C);
                return g00.b0.a;
            case 23:
                l1.w wVar = (l1.w) this.B;
                k0.y yVar3 = (k0.y) this.C;
                k0.i iVar = (k0.i) wVar.getValue();
                return new k0.j(yVar3, iVar, new c50.h((z00.e) yVar3.f8546d.f7812f.getValue(), iVar));
            case 24:
                ((u00.k) this.B).invoke(new jx.c(((fx.b) this.C).a));
                return g00.b0.a;
            case 25:
                return new l0.g1((y1.f) this.B, h00.y.A, (y1.c) this.C);
            case RuntimeVersion.MINOR:
                l1.g0 g0Var3 = (l1.g0) this.B;
                l1.t0 t0Var = (l1.t0) this.C;
                g0Var3.E(t0Var.f9930a, t0Var.f9936g, t0Var.f9931b, true);
                return g00.b0.a;
            case 27:
                k9.x0 x0Var = (k9.x0) this.B;
                l1.t1 t1Var2 = (l1.t1) this.C;
                if (((v1.a) x0Var.B).get() == 0) {
                    t1Var2.invoke();
                }
                return g00.b0.a;
            default:
                u.j0 j0Var = (u.j0) this.B;
                l1.p pVar = (l1.p) this.C;
                Object[] objArr = j0Var.f14865b;
                long[] jArr = j0Var.f14864a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i25 = 0;
                    while (true) {
                        long j14 = jArr[i25];
                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i26 = 8 - ((~(i25 - length)) >>> 31);
                            for (int i27 = 0; i27 < i26; i27++) {
                                if ((255 & j14) < 128) {
                                    pVar.z(objArr[(i25 << 3) + i27]);
                                }
                                j14 >>= 8;
                            }
                            if (i26 == 8) {
                                if (i25 != length) {
                                    i25++;
                                }
                            }
                        } else if (i25 != length) {
                            i25++;
                        }
                    }
                }
                return g00.b0.a;
        }
    }
}
