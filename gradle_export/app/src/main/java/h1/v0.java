package h1;

import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import com.google.protobuf.RuntimeVersion;
import d40.p1;
import g1.u6;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import l0.j1;
import l1.v1;
import l1.x1;
import z2.k1;
import z2.l1;

public final class v0 implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;

    public v0(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public final Object invoke(Object obj) throws Exception {
        int i10 = 8;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i11 = 1;
        switch (this.A) {
            case 0:
                i2.b0.n((k2.d) obj, (i2.l0) this.B, ((u6) this.C).a());
                return g00.b0.a;
            case 1:
                hb.c cVar = (hb.c) this.B;
                hb.a aVar = (hb.a) this.C;
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                cVar.f6966b.i0(aVar2, aVar);
                return g00.b0.a;
            case 2:
                hb.e eVar = (hb.e) this.B;
                hb.d dVar = (hb.d) this.C;
                ma.a aVar3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "_connection");
                eVar.f6970b.i0(aVar3, dVar);
                return g00.b0.a;
            case 3:
                hb.h hVar = (hb.h) this.B;
                hb.g gVar = (hb.g) this.C;
                ma.a aVar4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "_connection");
                hVar.f6975b.i0(aVar4, gVar);
                return g00.b0.a;
            case 4:
                hb.k kVar = (hb.k) this.B;
                hb.j jVar = (hb.j) this.C;
                ma.a aVar5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "_connection");
                kVar.f6981b.i0(aVar5, jVar);
                return g00.b0.a;
            case 5:
                hb.m mVar = (hb.m) this.B;
                hb.l lVar = (hb.l) this.C;
                ma.a aVar6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "_connection");
                mVar.f6985b.i0(aVar6, lVar);
                return g00.b0.a;
            case 6:
                za.g0 g0Var = (za.g0) this.B;
                String str = (String) this.C;
                ma.a aVar7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "_connection");
                ma.c cVarK0 = aVar7.k0("UPDATE workspec SET state=? WHERE id=?");
                try {
                    cVarK0.d(1, c7.i.W(g0Var));
                    cVarK0.y(2, str);
                    cVarK0.d0();
                    return Integer.valueOf(w00.a.x(aVar7));
                } finally {
                    cVarK0.close();
                }
            case 7:
                za.g gVar2 = (za.g) this.B;
                String str2 = (String) this.C;
                ma.a aVar8 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar8, "_connection");
                ma.c cVarK1 = aVar8.k0("UPDATE workspec SET output=? WHERE id=?");
                try {
                    za.g gVar3 = za.g.f17367b;
                    cVarK1.e(1, kh.n.f0(gVar2));
                    cVarK1.y(2, str2);
                    cVarK1.d0();
                    return g00.b0.a;
                } finally {
                    cVarK1.close();
                }
            case 8:
                hb.z zVar = (hb.z) this.B;
                hb.y yVar = (hb.y) this.C;
                ma.a aVar9 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar9, "_connection");
                zVar.f7034b.i0(aVar9, yVar);
                return g00.b0.a;
            case 9:
                ((u00.k) this.B).invoke(((u30.b) this.C).get(((Integer) obj).intValue()));
                return g00.b0.a;
            case 10:
                l1 l1Var = (l1) this.B;
                jk.g gVar4 = (jk.g) this.C;
                k1 k1Var = (k1) obj;
                kotlin.jvm.internal.m.e(k1Var, "$this$layout");
                k1.u(k1Var, l1Var, 0L, gVar4.W, 2);
                return g00.b0.a;
            case 11:
                c50.f fVar = (c50.f) this.B;
                k0.n nVar = (k0.n) this.C;
                k0.v vVarC = fVar.c(((Integer) obj).intValue());
                int i12 = vVarC.f8540a;
                List list = vVarC.f8541b;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    int i15 = (int) ((k0.d) list.get(i14)).f8459a;
                    arrayList.add(new g00.k(Integer.valueOf(i12), new y3.a(nVar.b(i13, i15))));
                    i12++;
                    i13 += i15;
                }
                return arrayList;
            case 12:
                k0.n nVar2 = (k0.n) this.B;
                k0.m mVar2 = (k0.m) this.C;
                int iIntValue = ((Integer) obj).intValue();
                c50.f fVar2 = (c50.f) nVar2.f8482f;
                int i16 = fVar2.f;
                int iG = fVar2.g(iIntValue);
                return mVar2.W0(iIntValue, 0, iG, mVar2.E, nVar2.b(0, iG));
            case 13:
                kk.f fVar3 = (kk.f) this.B;
                b3.o0 o0Var = (b3.o0) this.C;
                kotlin.jvm.internal.m.e((k2.d) obj, "$this$recordLayer");
                fVar3.O.getClass();
                o0Var.a();
                return g00.b0.a;
            case 14:
                ks.k kVar2 = (ks.k) this.B;
                gs.e eVar2 = (gs.e) this.C;
                ma.a aVar10 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar10, "_connection");
                kVar2.b.i0(aVar10, eVar2);
                return g00.b0.a;
            case 15:
                ks.l lVar2 = (ks.l) this.B;
                gs.g gVar5 = (gs.g) this.C;
                ma.a aVar11 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar11, "_connection");
                lVar2.b.i0(aVar11, gVar5);
                return g00.b0.a;
            case 16:
                ks.m mVar3 = (ks.m) this.B;
                gs.h hVar2 = (gs.h) this.C;
                ma.a aVar12 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar12, "_connection");
                mVar3.b.i0(aVar12, hVar2);
                return g00.b0.a;
            case 17:
                l0.c cVar2 = (l0.c) this.B;
                l0.d dVar2 = (l0.d) this.C;
                g00.b0 b0Var = g00.b0.a;
                k3.d dVar3 = cVar2.O;
                if (dVar3 != null) {
                    dVar3.b();
                }
                cVar2.O = null;
                a40.q qVar = dVar2.C;
                if (qVar != null) {
                    qVar.S(b0Var);
                }
                dVar2.C = null;
                return b0Var;
            case TYPE_SINT64_VALUE:
                l0.g1 g1Var = (l0.g1) this.B;
                Object obj2 = this.C;
                g1Var.C.i(obj2);
                return new bt.z0(g1Var, obj2, 6);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new l0.g1((y1.f) this.B, (Map) obj, (y1.c) this.C);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ((l1.x0) this.B).D.add(new l1.u0(obj, (c40.w) this.C));
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                Set set = (Set) this.B;
                l1.x0 x0Var = (l1.x0) this.C;
                if (set.contains(obj)) {
                    u.i0 i0Var = x0Var.C;
                    u.j0 j0Var = x0Var.E;
                    Object objG = i0Var.g(obj);
                    if (objG != null) {
                        if (objG instanceof u.j0) {
                            u.j0 j0Var2 = (u.j0) objG;
                            Object[] objArr3 = j0Var2.f14865b;
                            long[] jArr = j0Var2.f14864a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j9 = jArr[i17];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                                        for (int i19 = 0; i19 < i18; i19++) {
                                            if ((255 & j9) < 128) {
                                                j0Var.a((c40.w) objArr3[(i17 << 3) + i19]);
                                            }
                                            j9 >>= 8;
                                        }
                                        if (i18 == 8) {
                                            if (i17 != length) {
                                                i17++;
                                            }
                                        }
                                    } else if (i17 != length) {
                                        i17++;
                                    }
                                }
                            }
                        } else {
                            j0Var.a((c40.w) objG);
                        }
                    }
                }
                return g00.b0.a;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                l1.p pVar = (l1.p) this.B;
                u.j0 j0Var3 = (u.j0) this.C;
                pVar.z(obj);
                if (j0Var3 != null) {
                    j0Var3.a(obj);
                }
                return g00.b0.a;
            case 23:
                x1 x1Var = (x1) this.B;
                Throwable th2 = (Throwable) this.C;
                Throwable th3 = (Throwable) obj;
                synchronized (x1Var.f9952d) {
                    if (th2 == null) {
                        th2 = null;
                    } else if (th3 != null) {
                        try {
                            if (th3 instanceof CancellationException) {
                                th3 = null;
                            }
                            if (th3 != null) {
                                qd.s0.V(th2, th3);
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    x1Var.f9954f = th2;
                    p1 p1Var = x1Var.f9969w;
                    v1 v1Var = v1.A;
                    p1Var.getClass();
                    p1Var.k((Object) null, v1Var);
                }
                return g00.b0.a;
            case 24:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.B;
                c40.h hVar3 = (c40.h) this.C;
                g00.b0 b0Var2 = g00.b0.a;
                if (atomicBoolean.compareAndSet(false, true)) {
                    hVar3.j(b0Var2);
                }
                return b0Var2;
            case 25:
                Bitmap bitmap = (Bitmap) this.B;
                String str3 = (String) this.C;
                n4.j jVar2 = (n4.j) obj;
                kotlin.jvm.internal.m.e(jVar2, "$this$show");
                if (bitmap != null) {
                    IconCompat iconCompat = new IconCompat(1);
                    iconCompat.f569b = bitmap;
                    jVar2.f11072h = iconCompat;
                    n4.h hVar4 = new n4.h(i10, objArr2 == true ? 1 : 0);
                    IconCompat iconCompat2 = new IconCompat(1);
                    iconCompat2.f569b = bitmap;
                    hVar4.C = iconCompat2;
                    hVar4.D = null;
                    hVar4.E = true;
                    jVar2.e(hVar4);
                } else {
                    n4.i iVar = new n4.i(i10, objArr == true ? 1 : 0);
                    iVar.C = n4.j.c(str3);
                    jVar2.e(iVar);
                }
                return g00.b0.a;
            case RuntimeVersion.MINOR:
                a40.z zVar2 = (a40.z) this.B;
                c3.g1 g1Var2 = (c3.g1) this.C;
                j0.h hVar5 = (j0.h) obj;
                kotlin.jvm.internal.m.e(hVar5, "$this$LazyColumn");
                j0.h.q(hVar5, "HEADER_KEY", lz.a.a, 2);
                j0.h.q(hVar5, "EXPLANATION_KEY", lz.a.b, 2);
                j0.h.q(hVar5, "REWARD_KEY", lz.a.c, 2);
                j0.h.q(hVar5, "REDEEM_REWARD_KEY", new v1.c(new c0.f(zVar2, g1Var2, 11), 302688572, true), 2);
                j0.h.q(hVar5, "REMINDER_KEY", lz.a.d, 2);
                j0.h.q(hVar5, "JOURNEY_KEY", lz.a.e, 2);
                return g00.b0.a;
            case 27:
                ((u00.n) this.B).invoke(Integer.valueOf(((j1) obj).f9758a), Integer.valueOf(((k9.x0) this.C).C().f10366b));
                return g00.b0.a;
            case 28:
                l1.z0 z0Var = (l1.z0) this.B;
                k1 k1Var2 = (k1) obj;
                e1.k0 k0Var = new e1.k0(i11, (ArrayList) this.C);
                k1Var2.A = true;
                k0Var.invoke(k1Var2);
                k1Var2.A = false;
                z0Var.getValue();
                return g00.b0.a;
            default:
                x.b bVar = (x.b) this.B;
                x.b bVar2 = (x.b) this.C;
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.s0(((Number) bVar.d()).floatValue());
                c0Var.w(((Number) bVar2.d()).floatValue());
                return g00.b0.a;
        }
    }
}
