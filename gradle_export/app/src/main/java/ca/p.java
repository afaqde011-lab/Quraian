package ca;

import a1.e1;
import a1.u0;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.RuntimeVersion;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import ri.t1;

public final class p {

    public final int f3064a;

    public boolean f3065b;

    public boolean f3066c;

    public Object f3067d;

    public Object f3068e;

    public Object f3069f;

    public Object f3070g;

    public Object f3071h;

    public Object f3072i;

    public p() {
        this.f3064a = 1;
    }

    public p(a aVar, ba.y yVar, av.b bVar) {
        int i10;
        Object fVar;
        this.f3064a = 0;
        s sVar = aVar.f3021g;
        na.b bVar2 = aVar.f3017c;
        ma.b bVar3 = aVar.f3032t;
        String str = aVar.f3016b;
        this.f3067d = aVar;
        this.f3068e = yVar;
        h00.x xVar = aVar.f3019e;
        this.f3069f = xVar == null ? h00.x.A : xVar;
        if (bVar3 != null) {
            this.f3071h = null;
            if (bVar3.q()) {
                fVar = new ea.t(new u0(this, bVar3), str == null ? ":memory:" : str, bVar);
            } else if (str == null) {
                fVar = new ea.f(new u0(this, bVar3));
            } else {
                u0 u0Var = new u0(this, bVar3);
                int iOrdinal = sVar.ordinal();
                if (iOrdinal == 1) {
                    i10 = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + sVar + '\'').toString());
                    }
                    i10 = 4;
                }
                int iOrdinal2 = sVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + sVar + '\'').toString());
                }
                fVar = new ea.f(u0Var, str, i10);
            }
            this.f3070g = fVar;
        } else {
            if (bVar2 == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            Context context = aVar.f3015a;
            kotlin.jvm.internal.m.e(context, "context");
            na.c cVarG = bVar2.g(new e7.l0(context, str, new qd.j0(this, yVar.f2461a), false, false));
            this.f3071h = cVarG;
            this.f3070g = new ea.t(new o10.b(cVarG), str == null ? ":memory:" : str, bVar);
        }
        boolean z10 = sVar == s.C;
        na.c cVar = (na.c) this.f3071h;
        if (cVar != null) {
            cVar.setWriteAheadLoggingEnabled(z10);
        }
    }

    public p(a aVar, bw.b bVar, av.b bVar2) {
        this.f3064a = 0;
        this.f3067d = aVar;
        this.f3068e = new o(RuntimeVersion.SUFFIX, -1, RuntimeVersion.SUFFIX);
        List list = aVar.f3019e;
        List list2 = h00.x.A;
        this.f3069f = list == null ? list2 : list;
        ArrayList arrayListZ0 = h00.q.Z0(new ab.a(new e1(this, 6)), list == null ? list2 : list);
        Context context = aVar.f3015a;
        String str = aVar.f3016b;
        na.b bVar3 = aVar.f3017c;
        me.i iVar = aVar.f3018d;
        boolean z10 = aVar.f3020f;
        s sVar = aVar.f3021g;
        Executor executor = aVar.f3022h;
        Executor executor2 = aVar.f3023i;
        Intent intent = aVar.f3024j;
        boolean z11 = aVar.f3025k;
        boolean z12 = aVar.l;
        Set set = aVar.m;
        String str2 = aVar.f3026n;
        File file = aVar.f3027o;
        Callable callable = aVar.f3028p;
        List list3 = aVar.f3029q;
        List list4 = aVar.f3030r;
        boolean z13 = aVar.f3031s;
        ma.b bVar4 = aVar.f3032t;
        k00.i iVar2 = aVar.f3033u;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(iVar, "migrationContainer");
        kotlin.jvm.internal.m.e(executor, "queryExecutor");
        kotlin.jvm.internal.m.e(executor2, "transactionExecutor");
        kotlin.jvm.internal.m.e(list3, "typeConverters");
        kotlin.jvm.internal.m.e(list4, "autoMigrationSpecs");
        a aVar2 = new a(context, str, bVar3, iVar, arrayListZ0, z10, sVar, executor, executor2, intent, z11, z12, set, str2, file, callable, list3, list4, z13, bVar4, iVar2);
        aVar2.f3034v = aVar.f3034v;
        bVar.invoke(aVar2);
        throw null;
    }

    public p(boolean z10, boolean z11, k50.z zVar, Long l, Long l10, Long l11, Long l12) {
        this(z10, z11, zVar, l, l10, l11, l12, h00.y.A);
        this.f3064a = 2;
    }

    public p(boolean z10, boolean z11, k50.z zVar, Long l, Long l10, Long l11, Long l12, Map map) {
        this.f3064a = 2;
        kotlin.jvm.internal.m.e(map, "extras");
        this.f3065b = z10;
        this.f3066c = z11;
        this.f3067d = zVar;
        this.f3068e = l;
        this.f3069f = l10;
        this.f3070g = l11;
        this.f3071h = l12;
        this.f3072i = h00.d0.Z(map);
    }

    public static final void a(p pVar, ma.a aVar) throws Throwable {
        g00.b0 b0VarS;
        ba.y yVar = (ba.y) pVar.f3068e;
        f(aVar);
        a aVar2 = (a) pVar.f3067d;
        s sVar = aVar2.f3021g;
        s sVar2 = s.C;
        if (sVar == sVar2) {
            a10.h0.v(aVar, "PRAGMA journal_mode = WAL");
        } else {
            a10.h0.v(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.f3021g == sVar2) {
            a10.h0.v(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            a10.h0.v(aVar, "PRAGMA synchronous = FULL");
        }
        ma.c cVarK0 = aVar.k0("PRAGMA user_version");
        try {
            cVarK0.d0();
            int i10 = (int) cVarK0.getLong(0);
            v.s(cVarK0, null);
            int i11 = yVar.f2461a;
            if (i10 != i11) {
                a10.h0.v(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i10 == 0) {
                        pVar.j(aVar);
                    } else {
                        pVar.k(aVar, i10, i11);
                    }
                    a10.h0.v(aVar, "PRAGMA user_version = " + i11);
                    b0VarS = g00.b0.a;
                } catch (Throwable th2) {
                    b0VarS = t1.s(th2);
                }
                if (!(b0VarS instanceof g00.m)) {
                    a10.h0.v(aVar, "END TRANSACTION");
                }
                Throwable thA = g00.n.a(b0VarS);
                if (thA != null) {
                    a10.h0.v(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            pVar.l(aVar);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                v.s(cVarK0, th3);
                throw th4;
            }
        }
    }

    public static void f(ma.a aVar) {
        ma.c cVarK0 = aVar.k0("PRAGMA busy_timeout");
        try {
            cVarK0.d0();
            long j9 = cVarK0.getLong(0);
            v.s(cVarK0, null);
            if (j9 < 3000) {
                a10.h0.v(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                v.s(cVarK0, th2);
                throw th3;
            }
        }
    }

    public void b(h4.e eVar, int i10, ArrayList arrayList, h4.k kVar) {
        h4.n nVar = eVar.f6579d;
        h4.k kVar2 = nVar.f6600c;
        h4.e eVar2 = nVar.f6606i;
        h4.e eVar3 = nVar.f6605h;
        if (kVar2 == null) {
            g4.f fVar = (g4.f) this.f3067d;
            if (nVar == fVar.f6129d || nVar == fVar.f6131e) {
                return;
            }
            if (kVar == null) {
                kVar = new h4.k();
                kVar.f6589a = null;
                kVar.f6590b = new ArrayList();
                kVar.f6589a = nVar;
                arrayList.add(kVar);
            }
            nVar.f6600c = kVar;
            kVar.f6590b.add(nVar);
            for (h4.d dVar : eVar3.f6586k) {
                if (dVar instanceof h4.e) {
                    b((h4.e) dVar, i10, arrayList, kVar);
                }
            }
            for (h4.d dVar2 : eVar2.f6586k) {
                if (dVar2 instanceof h4.e) {
                    b((h4.e) dVar2, i10, arrayList, kVar);
                }
            }
            if (i10 == 1 && (nVar instanceof h4.l)) {
                for (h4.d dVar3 : ((h4.l) nVar).f6591k.f6586k) {
                    if (dVar3 instanceof h4.e) {
                        b((h4.e) dVar3, i10, arrayList, kVar);
                    }
                }
            }
            Iterator it = eVar3.l.iterator();
            while (it.hasNext()) {
                b((h4.e) it.next(), i10, arrayList, kVar);
            }
            Iterator it2 = eVar2.l.iterator();
            while (it2.hasNext()) {
                b((h4.e) it2.next(), i10, arrayList, kVar);
            }
            if (i10 == 1 && (nVar instanceof h4.l)) {
                Iterator it3 = ((h4.l) nVar).f6591k.l.iterator();
                while (it3.hasNext()) {
                    b((h4.e) it3.next(), i10, arrayList, kVar);
                }
            }
        }
    }

    public void c(g4.f fVar) {
        int i10;
        int iN;
        int iK;
        int iK2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        float f3;
        int i23;
        int i24;
        ArrayList<g4.e> arrayList = fVar.f6162p0;
        int[] iArr = fVar.f6150o0;
        for (g4.e eVar : arrayList) {
            int[] iArr2 = eVar.f6150o0;
            g4.d[] dVarArr = eVar.P;
            g4.d dVar = eVar.K;
            g4.d dVar2 = eVar.I;
            g4.d dVar3 = eVar.J;
            g4.d dVar4 = eVar.H;
            int i25 = iArr2[0];
            int i26 = iArr2[1];
            if (eVar.f6134f0 == 8) {
                eVar.f6123a = true;
            } else {
                float f10 = eVar.f6157v;
                if (f10 < 1.0f && i25 == 3) {
                    eVar.f6152q = 2;
                }
                float f11 = eVar.f6160y;
                if (f11 < 1.0f && i26 == 3) {
                    eVar.f6153r = 2;
                }
                if (eVar.V > 0.0f) {
                    if (i25 == 3 && (i26 == 2 || i26 == 1)) {
                        eVar.f6152q = 3;
                    } else if (i26 == 3 && (i25 == 2 || i25 == 1)) {
                        eVar.f6153r = 3;
                    } else if (i25 == 3 && i26 == 3) {
                        if (eVar.f6152q == 0) {
                            eVar.f6152q = 3;
                        }
                        if (eVar.f6153r == 0) {
                            eVar.f6153r = 3;
                        }
                    }
                }
                if (i25 == 3 && eVar.f6152q == 1 && (dVar4.f6119f == null || dVar3.f6119f == null)) {
                    i25 = 2;
                }
                if (i26 == 3 && eVar.f6153r == 1 && (dVar2.f6119f == null || dVar.f6119f == null)) {
                    i26 = 2;
                }
                h4.j jVar = eVar.f6129d;
                jVar.f6601d = i25;
                int i27 = eVar.f6152q;
                jVar.f6598a = i27;
                h4.l lVar = eVar.f6131e;
                lVar.f6601d = i26;
                int i28 = eVar.f6153r;
                lVar.f6598a = i28;
                if (i25 == 4 || i25 == 1) {
                    if (i26 == 4) {
                        if (i26 != 1) {
                            i12 = 2;
                            if (i26 != 2) {
                                if (i25 != 3) {
                                    i13 = i26;
                                    i14 = 1;
                                } else if (i26 == i12 && i26 != 1) {
                                    i13 = i26;
                                    i15 = 3;
                                    i14 = 1;
                                    if (i13 != i15) {
                                        i16 = i13;
                                        i17 = i12;
                                        i18 = 1;
                                        i19 = i25;
                                    } else if (i25 == i12 && i25 != i14) {
                                        i20 = i15;
                                        i16 = i13;
                                        i17 = i12;
                                        i18 = 1;
                                        i19 = i25;
                                        if (i19 != i20 && i16 == i20) {
                                            if (i27 == i18 || i28 == i18) {
                                                h(i17, 0, i17, 0, eVar);
                                                eVar.f6129d.f6602e.m = eVar.n();
                                                eVar.f6131e.f6602e.m = eVar.k();
                                            } else if (i28 == 2 && i27 == 2 && iArr[0] == i14 && iArr[i18] == i14) {
                                                h(i14, (int) ((f10 * fVar.n()) + 0.5f), i14, (int) ((f11 * fVar.k()) + 0.5f), eVar);
                                                eVar.f6129d.f6602e.d(eVar.n());
                                                eVar.f6131e.f6602e.d(eVar.k());
                                                eVar.f6123a = true;
                                            }
                                        }
                                    } else if (i28 == i15) {
                                        if (i25 == i12) {
                                            h(i12, 0, i12, 0, eVar);
                                        }
                                        int iN2 = eVar.n();
                                        f3 = eVar.V;
                                        if (eVar.W == -1) {
                                            f3 = 1.0f / f3;
                                        }
                                        h(i14, iN2, i14, (int) ((iN2 * f3) + 0.5f), eVar);
                                        eVar.f6129d.f6602e.d(eVar.n());
                                        eVar.f6131e.f6602e.d(eVar.k());
                                        eVar.f6123a = true;
                                    } else {
                                        i16 = i13;
                                        i14 = i14;
                                        i21 = i12;
                                        if (i28 == 1) {
                                            h(i25, 0, i21, 0, eVar);
                                            eVar.f6131e.f6602e.m = eVar.k();
                                        } else {
                                            i19 = i25;
                                            if (i28 == 2) {
                                                i22 = iArr[1];
                                                if (i22 != i14 || i22 == 4) {
                                                    h(i19, eVar.n(), i14, (int) ((f11 * fVar.k()) + 0.5f), eVar);
                                                    eVar.f6129d.f6602e.d(eVar.n());
                                                    eVar.f6131e.f6602e.d(eVar.k());
                                                    eVar.f6123a = true;
                                                } else {
                                                    i17 = i21;
                                                    i18 = 1;
                                                }
                                            } else if (dVarArr[2].f6119f != null || dVarArr[3].f6119f == null) {
                                                h(i21, 0, i16, 0, eVar);
                                                eVar.f6129d.f6602e.d(eVar.n());
                                                eVar.f6131e.f6602e.d(eVar.k());
                                                eVar.f6123a = true;
                                            } else {
                                                i17 = i21;
                                                i18 = 1;
                                            }
                                        }
                                    }
                                    i20 = 3;
                                    if (i19 != i20) {
                                    }
                                } else if (i27 == 3) {
                                    if (i26 == i12) {
                                        h(i12, 0, i12, 0, eVar);
                                    }
                                    int iK3 = eVar.k();
                                    h(1, (int) ((iK3 * eVar.V) + 0.5f), 1, iK3, eVar);
                                    eVar.f6129d.f6602e.d(eVar.n());
                                    eVar.f6131e.f6602e.d(eVar.k());
                                    eVar.f6123a = true;
                                } else {
                                    i23 = i12;
                                    if (i27 == 1) {
                                        h(i23, 0, i26, 0, eVar);
                                        eVar.f6129d.f6602e.m = eVar.n();
                                    } else {
                                        i12 = i23;
                                        if (i27 == 2) {
                                            i24 = iArr[0];
                                            if (i24 != 1 || i24 == 4) {
                                                h(1, (int) ((f10 * fVar.n()) + 0.5f), i26, eVar.k(), eVar);
                                                eVar.f6129d.f6602e.d(eVar.n());
                                                eVar.f6131e.f6602e.d(eVar.k());
                                                eVar.f6123a = true;
                                            } else {
                                                i14 = 1;
                                                i13 = i26;
                                            }
                                        } else {
                                            i14 = 1;
                                            i13 = i26;
                                            if (dVarArr[0].f6119f != null || dVarArr[1].f6119f == null) {
                                                h(i12, 0, i13, 0, eVar);
                                                eVar.f6129d.f6602e.d(eVar.n());
                                                eVar.f6131e.f6602e.d(eVar.k());
                                                eVar.f6123a = true;
                                            }
                                        }
                                    }
                                }
                                i15 = 3;
                                if (i13 != i15) {
                                    if (i25 == i12) {
                                    }
                                    if (i28 == i15) {
                                        if (i25 == i12) {
                                            h(i12, 0, i12, 0, eVar);
                                        }
                                        int iN3 = eVar.n();
                                        f3 = eVar.V;
                                        if (eVar.W == -1) {
                                            f3 = 1.0f / f3;
                                        }
                                        h(i14, iN3, i14, (int) ((iN3 * f3) + 0.5f), eVar);
                                        eVar.f6129d.f6602e.d(eVar.n());
                                        eVar.f6131e.f6602e.d(eVar.k());
                                        eVar.f6123a = true;
                                    } else {
                                        i16 = i13;
                                        i14 = i14;
                                        i21 = i12;
                                        if (i28 == 1) {
                                            h(i25, 0, i21, 0, eVar);
                                            eVar.f6131e.f6602e.m = eVar.k();
                                        } else {
                                            i19 = i25;
                                            if (i28 == 2) {
                                                i22 = iArr[1];
                                                if (i22 != i14) {
                                                }
                                                h(i19, eVar.n(), i14, (int) ((f11 * fVar.k()) + 0.5f), eVar);
                                                eVar.f6129d.f6602e.d(eVar.n());
                                                eVar.f6131e.f6602e.d(eVar.k());
                                                eVar.f6123a = true;
                                            } else {
                                                if (dVarArr[2].f6119f != null) {
                                                }
                                                h(i21, 0, i16, 0, eVar);
                                                eVar.f6129d.f6602e.d(eVar.n());
                                                eVar.f6131e.f6602e.d(eVar.k());
                                                eVar.f6123a = true;
                                            }
                                        }
                                    }
                                } else {
                                    i16 = i13;
                                    i17 = i12;
                                    i18 = 1;
                                    i19 = i25;
                                }
                                i20 = 3;
                                if (i19 != i20) {
                                }
                            }
                        } else {
                            i10 = 1;
                        }
                        iN = eVar.n();
                        if (i25 == 4) {
                            iN = (fVar.n() - dVar4.f6120g) - dVar3.f6120g;
                            i25 = i10;
                        }
                        iK = eVar.k();
                        if (i26 == 4) {
                            iK2 = (fVar.k() - dVar2.f6120g) - dVar.f6120g;
                            i11 = i10;
                        } else {
                            iK2 = iK;
                            i11 = i26;
                        }
                        h(i25, iN, i11, iK2, eVar);
                        eVar.f6129d.f6602e.d(eVar.n());
                        eVar.f6131e.f6602e.d(eVar.k());
                        eVar.f6123a = true;
                    }
                    i10 = 1;
                    iN = eVar.n();
                    if (i25 == 4) {
                        iN = (fVar.n() - dVar4.f6120g) - dVar3.f6120g;
                        i25 = i10;
                    }
                    iK = eVar.k();
                    if (i26 == 4) {
                        iK2 = (fVar.k() - dVar2.f6120g) - dVar.f6120g;
                        i11 = i10;
                    } else {
                        iK2 = iK;
                        i11 = i26;
                    }
                    h(i25, iN, i11, iK2, eVar);
                    eVar.f6129d.f6602e.d(eVar.n());
                    eVar.f6131e.f6602e.d(eVar.k());
                    eVar.f6123a = true;
                } else {
                    i12 = 2;
                    if (i25 == 2) {
                        if (i26 == 4) {
                            if (i26 != 1) {
                                i12 = 2;
                                if (i26 != 2) {
                                }
                            } else {
                                i10 = 1;
                            }
                            iN = eVar.n();
                            if (i25 == 4) {
                                iN = (fVar.n() - dVar4.f6120g) - dVar3.f6120g;
                                i25 = i10;
                            }
                            iK = eVar.k();
                            if (i26 == 4) {
                                iK2 = (fVar.k() - dVar2.f6120g) - dVar.f6120g;
                                i11 = i10;
                            } else {
                                iK2 = iK;
                                i11 = i26;
                            }
                            h(i25, iN, i11, iK2, eVar);
                            eVar.f6129d.f6602e.d(eVar.n());
                            eVar.f6131e.f6602e.d(eVar.k());
                            eVar.f6123a = true;
                        }
                        i10 = 1;
                        iN = eVar.n();
                        if (i25 == 4) {
                            iN = (fVar.n() - dVar4.f6120g) - dVar3.f6120g;
                            i25 = i10;
                        }
                        iK = eVar.k();
                        if (i26 == 4) {
                            iK2 = (fVar.k() - dVar2.f6120g) - dVar.f6120g;
                            i11 = i10;
                        } else {
                            iK2 = iK;
                            i11 = i26;
                        }
                        h(i25, iN, i11, iK2, eVar);
                        eVar.f6129d.f6602e.d(eVar.n());
                        eVar.f6131e.f6602e.d(eVar.k());
                        eVar.f6123a = true;
                    }
                    if (i25 != 3) {
                        if (i26 == i12) {
                        }
                        if (i27 == 3) {
                            if (i26 == i12) {
                                h(i12, 0, i12, 0, eVar);
                            }
                            int iK4 = eVar.k();
                            h(1, (int) ((iK4 * eVar.V) + 0.5f), 1, iK4, eVar);
                            eVar.f6129d.f6602e.d(eVar.n());
                            eVar.f6131e.f6602e.d(eVar.k());
                            eVar.f6123a = true;
                        } else {
                            i23 = i12;
                            if (i27 == 1) {
                                h(i23, 0, i26, 0, eVar);
                                eVar.f6129d.f6602e.m = eVar.n();
                            } else {
                                i12 = i23;
                                if (i27 == 2) {
                                    i24 = iArr[0];
                                    if (i24 != 1) {
                                    }
                                    h(1, (int) ((f10 * fVar.n()) + 0.5f), i26, eVar.k(), eVar);
                                    eVar.f6129d.f6602e.d(eVar.n());
                                    eVar.f6131e.f6602e.d(eVar.k());
                                    eVar.f6123a = true;
                                } else {
                                    i14 = 1;
                                    i13 = i26;
                                    if (dVarArr[0].f6119f != null) {
                                    }
                                    h(i12, 0, i13, 0, eVar);
                                    eVar.f6129d.f6602e.d(eVar.n());
                                    eVar.f6131e.f6602e.d(eVar.k());
                                    eVar.f6123a = true;
                                }
                            }
                        }
                    } else {
                        i13 = i26;
                        i14 = 1;
                    }
                    i15 = 3;
                    if (i13 != i15) {
                        if (i25 == i12) {
                        }
                        if (i28 == i15) {
                            if (i25 == i12) {
                                h(i12, 0, i12, 0, eVar);
                            }
                            int iN4 = eVar.n();
                            f3 = eVar.V;
                            if (eVar.W == -1) {
                                f3 = 1.0f / f3;
                            }
                            h(i14, iN4, i14, (int) ((iN4 * f3) + 0.5f), eVar);
                            eVar.f6129d.f6602e.d(eVar.n());
                            eVar.f6131e.f6602e.d(eVar.k());
                            eVar.f6123a = true;
                        } else {
                            i16 = i13;
                            i14 = i14;
                            i21 = i12;
                            if (i28 == 1) {
                                h(i25, 0, i21, 0, eVar);
                                eVar.f6131e.f6602e.m = eVar.k();
                            } else {
                                i19 = i25;
                                if (i28 == 2) {
                                    i22 = iArr[1];
                                    if (i22 != i14) {
                                    }
                                    h(i19, eVar.n(), i14, (int) ((f11 * fVar.k()) + 0.5f), eVar);
                                    eVar.f6129d.f6602e.d(eVar.n());
                                    eVar.f6131e.f6602e.d(eVar.k());
                                    eVar.f6123a = true;
                                } else {
                                    if (dVarArr[2].f6119f != null) {
                                    }
                                    h(i21, 0, i16, 0, eVar);
                                    eVar.f6129d.f6602e.d(eVar.n());
                                    eVar.f6131e.f6602e.d(eVar.k());
                                    eVar.f6123a = true;
                                }
                            }
                        }
                    } else {
                        i16 = i13;
                        i17 = i12;
                        i18 = 1;
                        i19 = i25;
                    }
                    i20 = 3;
                    if (i19 != i20) {
                    }
                }
            }
        }
    }

    public void d() {
        g4.f fVar = (g4.f) this.f3067d;
        ArrayList arrayList = (ArrayList) this.f3072i;
        ArrayList<h4.n> arrayList2 = (ArrayList) this.f3069f;
        arrayList2.clear();
        g4.f fVar2 = (g4.f) this.f3068e;
        fVar2.f6129d.f();
        fVar2.f6131e.f();
        arrayList2.add(fVar2.f6129d);
        arrayList2.add(fVar2.f6131e);
        HashSet hashSet = null;
        for (g4.e eVar : fVar2.f6162p0) {
            if (eVar instanceof g4.i) {
                h4.h hVar = new h4.h(eVar);
                eVar.f6129d.f();
                eVar.f6131e.f();
                hVar.f6603f = ((g4.i) eVar).f6203t0;
                arrayList2.add(hVar);
            } else {
                if (eVar.u()) {
                    if (eVar.f6125b == null) {
                        eVar.f6125b = new h4.c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f6125b);
                } else {
                    arrayList2.add(eVar.f6129d);
                }
                if (eVar.v()) {
                    if (eVar.f6127c == null) {
                        eVar.f6127c = new h4.c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f6127c);
                } else {
                    arrayList2.add(eVar.f6131e);
                }
                if (eVar instanceof g4.j) {
                    arrayList2.add(new h4.i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((h4.n) it.next()).f();
        }
        for (h4.n nVar : arrayList2) {
            if (nVar.f6599b != fVar2) {
                nVar.d();
            }
        }
        arrayList.clear();
        g(fVar.f6129d, 0, arrayList);
        g(fVar.f6131e, 1, arrayList);
        this.f3065b = false;
    }

    public int e(g4.f fVar, int i10) {
        ArrayList arrayList;
        int i11;
        long j9;
        float f3;
        long j10;
        ArrayList arrayList2 = (ArrayList) this.f3072i;
        int size = arrayList2.size();
        long j11 = 0;
        int i12 = 0;
        long jMax = 0;
        while (i12 < size) {
            h4.n nVar = ((h4.k) arrayList2.get(i12)).f6589a;
            if (!(nVar instanceof h4.c) ? !(i10 != 0 ? (nVar instanceof h4.l) : (nVar instanceof h4.j)) : ((h4.c) nVar).f6603f != i10) {
                h4.e eVar = (i10 == 0 ? fVar.f6129d : fVar.f6131e).f6605h;
                h4.e eVar2 = (i10 == 0 ? fVar.f6129d : fVar.f6131e).f6606i;
                h4.e eVar3 = nVar.f6605h;
                h4.e eVar4 = nVar.f6606i;
                boolean zContains = eVar3.l.contains(eVar);
                boolean zContains2 = eVar4.l.contains(eVar2);
                long j12 = nVar.j();
                if (zContains && zContains2) {
                    long jB = h4.k.b(eVar3, j11);
                    arrayList = arrayList2;
                    long jA = h4.k.a(eVar4, j11);
                    long j13 = jB - j12;
                    int i13 = eVar4.f6581f;
                    i11 = i12;
                    if (j13 >= (-i13)) {
                        j13 += (long) i13;
                    }
                    long j14 = eVar3.f6581f;
                    long j15 = ((-jA) - j12) - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    g4.e eVar5 = nVar.f6599b;
                    if (i10 == 0) {
                        f3 = eVar5.f6128c0;
                    } else if (i10 == 1) {
                        f3 = eVar5.f6130d0;
                    } else {
                        eVar5.getClass();
                        f3 = -1.0f;
                    }
                    if (f3 > 0.0f) {
                        j10 = (long) ((j13 / (1.0f - f3)) + (j15 / f3));
                    } else {
                        j10 = 0;
                    }
                    float f10 = j10;
                    j9 = (((long) eVar3.f6581f) + ((((long) ((f10 * f3) + 0.5f)) + j12) + ((long) w.c.b(1.0f, f3, f10, 0.5f)))) - ((long) eVar4.f6581f);
                } else {
                    arrayList = arrayList2;
                    i11 = i12;
                    if (zContains) {
                        j9 = Math.max(h4.k.b(eVar3, eVar3.f6581f), ((long) eVar3.f6581f) + j12);
                    } else if (zContains2) {
                        j9 = Math.max(-h4.k.a(eVar4, eVar4.f6581f), ((long) (-eVar4.f6581f)) + j12);
                    } else {
                        j9 = (nVar.j() + ((long) eVar3.f6581f)) - ((long) eVar4.f6581f);
                    }
                }
            } else {
                arrayList = arrayList2;
                j9 = j11;
                i11 = i12;
            }
            jMax = Math.max(jMax, j9);
            i12 = i11 + 1;
            arrayList2 = arrayList;
            j11 = 0;
        }
        return (int) jMax;
    }

    public void g(h4.n nVar, int i10, ArrayList arrayList) {
        h4.e eVar = nVar.f6605h;
        h4.e eVar2 = nVar.f6606i;
        for (h4.d dVar : eVar.f6586k) {
            if (dVar instanceof h4.e) {
                b((h4.e) dVar, i10, arrayList, null);
            } else if (dVar instanceof h4.n) {
                b(((h4.n) dVar).f6605h, i10, arrayList, null);
            }
        }
        for (h4.d dVar2 : eVar2.f6586k) {
            if (dVar2 instanceof h4.e) {
                b((h4.e) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof h4.n) {
                b(((h4.n) dVar2).f6606i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (h4.d dVar3 : ((h4.l) nVar).f6591k.f6586k) {
                if (dVar3 instanceof h4.e) {
                    b((h4.e) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public void h(int i10, int i11, int i12, int i13, g4.e eVar) {
        h4.b bVar = (h4.b) this.f3071h;
        bVar.f6565a = i10;
        bVar.f6566b = i12;
        bVar.f6567c = i11;
        bVar.f6568d = i13;
        ((j4.f) this.f3070g).b(eVar, bVar);
        eVar.J(bVar.f6569e);
        eVar.G(bVar.f6570f);
        eVar.D = bVar.f6572h;
        eVar.D(bVar.f6571g);
    }

    public void i() {
        p pVar;
        h4.a aVar;
        for (g4.e eVar : ((g4.f) this.f3067d).f6162p0) {
            if (!eVar.f6123a) {
                int[] iArr = eVar.f6150o0;
                boolean z10 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = eVar.f6152q;
                int i13 = eVar.f6153r;
                boolean z11 = i10 == 2 || (i10 == 3 && i12 == 1);
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z10 = true;
                }
                h4.f fVar = eVar.f6129d.f6602e;
                boolean z12 = fVar.f6585j;
                h4.f fVar2 = eVar.f6131e.f6602e;
                boolean z13 = fVar2.f6585j;
                boolean z14 = z11;
                if (z12 && z13) {
                    pVar = this;
                    pVar.h(1, fVar.f6582g, 1, fVar2.f6582g, eVar);
                    eVar.f6123a = true;
                } else if (z12 && z10) {
                    pVar = this;
                    pVar.h(1, fVar.f6582g, 2, fVar2.f6582g, eVar);
                    if (i11 == 3) {
                        eVar.f6131e.f6602e.m = eVar.k();
                    } else {
                        eVar.f6131e.f6602e.d(eVar.k());
                        eVar.f6123a = true;
                    }
                } else {
                    pVar = this;
                    if (z13 && z14) {
                        pVar.h(2, fVar.f6582g, 1, fVar2.f6582g, eVar);
                        if (i10 == 3) {
                            eVar.f6129d.f6602e.m = eVar.n();
                        } else {
                            eVar.f6129d.f6602e.d(eVar.n());
                            eVar.f6123a = true;
                        }
                    }
                }
                if (eVar.f6123a && (aVar = eVar.f6131e.l) != null) {
                    aVar.d(eVar.Z);
                }
                this = pVar;
            }
        }
    }

    public void j(ma.a aVar) {
        ba.y yVar = (ba.y) this.f3068e;
        kotlin.jvm.internal.m.e(aVar, "connection");
        ma.c cVarK0 = aVar.k0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cVarK0.d0() && cVarK0.getLong(0) == 0) {
                z10 = true;
            }
            v.s(cVarK0, null);
            yVar.a(aVar);
            if (!z10) {
                androidx.media3.common.q qVarV = yVar.v(aVar);
                if (!qVarV.B) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) qVarV.C)).toString());
                }
            }
            m(aVar);
            yVar.r(aVar);
            Iterator it = ((List) this.f3069f).iterator();
            while (it.hasNext()) {
                ((ab.a) it.next()).getClass();
                if (aVar instanceof pa.a) {
                    kotlin.jvm.internal.m.e(((pa.a) aVar).A, "db");
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                v.s(cVarK0, th2);
                throw th3;
            }
        }
    }

    public void k(ma.a aVar, int i10, int i11) {
        h00.x xVar;
        TreeMap treeMap;
        g00.k kVar;
        Iterator it;
        boolean z10;
        int iIntValue;
        TreeMap treeMap2;
        ba.y yVar = (ba.y) this.f3068e;
        kotlin.jvm.internal.m.e(aVar, "connection");
        a aVar2 = (a) this.f3067d;
        me.i iVar = aVar2.f3018d;
        kotlin.jvm.internal.m.e(iVar, "<this>");
        LinkedHashMap linkedHashMap = (LinkedHashMap) iVar.B;
        if (i10 == i11) {
            xVar = h00.x.A;
        } else {
            boolean z11 = i11 > i10;
            h00.x arrayList = new ArrayList();
            int i12 = i10;
            while (true) {
                if (z11) {
                    if (i12 < i11) {
                        if (z11) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                            if (treeMap2 == null) {
                                kVar = null;
                            } else {
                                kVar = new g00.k(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                            if (treeMap == null) {
                                kVar = null;
                            } else {
                                kVar = new g00.k(treeMap, treeMap.keySet());
                            }
                        }
                        if (kVar == null) {
                            Map map = (Map) kVar.A;
                            it = ((Iterable) kVar.B).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z10 = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z11) {
                                    if (i11 <= iIntValue && iIntValue < i12) {
                                        Object obj = map.get(Integer.valueOf(iIntValue));
                                        kotlin.jvm.internal.m.b(obj);
                                        arrayList.add(obj);
                                        z10 = true;
                                        i12 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i12 + 1 <= iIntValue && iIntValue <= i11) {
                                    Object obj2 = map.get(Integer.valueOf(iIntValue));
                                    kotlin.jvm.internal.m.b(obj2);
                                    arrayList.add(obj2);
                                    z10 = true;
                                    i12 = iIntValue;
                                    break;
                                }
                            }
                            if (!z10) {
                            }
                        }
                        xVar = null;
                    } else {
                        xVar = arrayList;
                    }
                } else if (i12 > i11) {
                    if (z11) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                        if (treeMap2 == null) {
                            kVar = null;
                        } else {
                            kVar = new g00.k(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i12));
                        if (treeMap == null) {
                            kVar = null;
                        } else {
                            kVar = new g00.k(treeMap, treeMap.keySet());
                        }
                    }
                    if (kVar == null) {
                        Map map2 = (Map) kVar.A;
                        it = ((Iterable) kVar.B).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z10 = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z11) {
                                if (i12 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i11 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z10) {
                        }
                    }
                    xVar = null;
                } else {
                    xVar = arrayList;
                }
            }
        }
        if (xVar != null) {
            yVar.u(aVar);
            Iterator it2 = xVar.iterator();
            while (it2.hasNext()) {
                ((fa.a) it2.next()).a(aVar);
            }
            androidx.media3.common.q qVarV = yVar.v(aVar);
            if (qVarV.B) {
                yVar.t(aVar);
                m(aVar);
                return;
            } else {
                throw new IllegalStateException(("Migration didn't properly handle: " + ((String) qVarV.C)).toString());
            }
        }
        kotlin.jvm.internal.m.e(aVar2, "<this>");
        boolean z12 = false;
        if (i10 <= i11 || !aVar2.l) {
            Set set = aVar2.m;
            if (aVar2.f3025k && (set == null || !set.contains(Integer.valueOf(i10)))) {
                z12 = true;
            }
        }
        if (z12) {
            throw new IllegalStateException(("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (aVar2.f3031s) {
            ma.c cVarK0 = aVar.k0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                i00.b bVarS = va.a.s();
                while (cVarK0.d0()) {
                    String strR = cVarK0.R(0);
                    if (!r30.r.x0(strR, "sqlite_", false) && !strR.equals("android_metadata")) {
                        bVarS.add(new g00.k(strR, Boolean.valueOf(kotlin.jvm.internal.m.a(cVarK0.R(1), "view"))));
                    }
                }
                i00.b bVarK = va.a.k(bVarS);
                v.s(cVarK0, null);
                ListIterator listIterator = bVarK.listIterator(0);
                while (true) {
                    b3.q qVar = (b3.q) listIterator;
                    if (!qVar.hasNext()) {
                        break;
                    }
                    g00.k kVar2 = (g00.k) qVar.next();
                    String str = (String) kVar2.A;
                    if (((Boolean) kVar2.B).booleanValue()) {
                        a10.h0.v(aVar, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        a10.h0.v(aVar, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    v.s(cVarK0, th2);
                    throw th3;
                }
            }
        } else {
            yVar.c(aVar);
        }
        Iterator it3 = ((List) this.f3069f).iterator();
        while (it3.hasNext()) {
            ((ab.a) it3.next()).getClass();
            if (aVar instanceof pa.a) {
                kotlin.jvm.internal.m.e(((pa.a) aVar).A, "db");
            }
        }
        yVar.a(aVar);
    }

    public void l(ma.a aVar) throws Throwable {
        g00.b0 b0VarS;
        kotlin.jvm.internal.m.e(aVar, "connection");
        ba.y yVar = (ba.y) this.f3068e;
        ma.c cVarK0 = aVar.k0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z10 = cVarK0.d0() && cVarK0.getLong(0) != 0;
            v.s(cVarK0, null);
            if (z10) {
                ma.c cVarK1 = aVar.k0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strR = cVarK1.d0() ? cVarK1.R(0) : null;
                    v.s(cVarK1, null);
                    if (!((String) yVar.f2462b).equals(strR) && !((String) yVar.f2463c).equals(strR)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) yVar.f2462b) + ", found: " + strR).toString());
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        v.s(cVarK1, th2);
                        throw th3;
                    }
                }
            } else {
                a10.h0.v(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    androidx.media3.common.q qVarV = yVar.v(aVar);
                    if (!qVarV.B) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) qVarV.C)).toString());
                    }
                    yVar.t(aVar);
                    m(aVar);
                    b0VarS = g00.b0.a;
                    if (!(b0VarS instanceof g00.m)) {
                        a10.h0.v(aVar, "END TRANSACTION");
                    }
                    Throwable thA = g00.n.a(b0VarS);
                    if (thA != null) {
                        a10.h0.v(aVar, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th4) {
                    b0VarS = t1.s(th4);
                }
            }
            yVar.s(aVar);
            for (ab.a aVar2 : (List) this.f3069f) {
                aVar2.getClass();
                if (aVar instanceof pa.a) {
                    na.a aVar3 = ((pa.a) aVar).A;
                    switch (aVar2.f349a) {
                        case 0:
                            kotlin.jvm.internal.m.e(aVar3, "db");
                            aVar3.k();
                            try {
                                StringBuilder sb2 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
                                ((za.i) aVar2.f350b).getClass();
                                sb2.append(System.currentTimeMillis() - ab.s.f410a);
                                sb2.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                                aVar3.o(sb2.toString());
                                aVar3.E();
                                aVar3.P();
                            } catch (Throwable th5) {
                                aVar3.P();
                                throw th5;
                            }
                            break;
                        default:
                            kotlin.jvm.internal.m.e(aVar3, "db");
                            ((e1) aVar2.f350b).invoke(aVar3);
                            break;
                    }
                }
            }
            this.f3065b = true;
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                v.s(cVarK0, th6);
                throw th7;
            }
        }
    }

    public void m(ma.a aVar) {
        a10.h0.v(aVar, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        String str = (String) ((ba.y) this.f3068e).f2462b;
        kotlin.jvm.internal.m.e(str, "hash");
        a10.h0.v(aVar, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + str + "')");
    }

    public String toString() {
        switch (this.f3064a) {
            case 2:
                Map map = (Map) this.f3072i;
                Long l = (Long) this.f3071h;
                Long l10 = (Long) this.f3070g;
                Long l11 = (Long) this.f3069f;
                Long l12 = (Long) this.f3068e;
                ArrayList arrayList = new ArrayList();
                if (this.f3065b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f3066c) {
                    arrayList.add("isDirectory");
                }
                if (l12 != null) {
                    arrayList.add("byteCount=" + l12);
                }
                if (l11 != null) {
                    arrayList.add("createdAt=" + l11);
                }
                if (l10 != null) {
                    arrayList.add("lastModifiedAt=" + l10);
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l);
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return h00.q.R0(arrayList, ", ", "FileMetadata(", ")", (u00.k) null, 56);
            default:
                return super.toString();
        }
    }
}
