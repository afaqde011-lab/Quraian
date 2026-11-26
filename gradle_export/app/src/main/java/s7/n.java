package s7;

import android.content.Context;
import android.net.Uri;
import com.google.protobuf.RuntimeVersion;
import fh.d2;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class n implements z {

    public final a2.o f13715a;

    public final a1.u0 f13716b;

    public tf.w f13717c;

    public final long f13718d;

    public final long f13719e;

    public final long f13720f;

    public final float f13721g;

    public final float f13722h;

    public boolean f13723i;

    public n(Context context, a8.o oVar) {
        a1.u0 u0Var = new a1.u0(context, 27);
        this.f13716b = u0Var;
        tf.w wVar = new tf.w(20);
        this.f13717c = wVar;
        a2.o oVar2 = new a2.o(oVar, wVar);
        this.f13715a = oVar2;
        if (u0Var != ((a1.u0) oVar2.E)) {
            oVar2.E = u0Var;
            ((HashMap) oVar2.B).clear();
            ((HashMap) oVar2.D).clear();
        }
        this.f13718d = -9223372036854775807L;
        this.f13719e = -9223372036854775807L;
        this.f13720f = -9223372036854775807L;
        this.f13721g = -3.4028235E38f;
        this.f13722h = -3.4028235E38f;
        this.f13723i = true;
    }

    public static z e(Class cls, g7.e eVar) {
        try {
            return (z) cls.getConstructor(g7.e.class).newInstance(eVar);
        } catch (Exception e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override
    public final a a(androidx.media3.common.q0 q0Var) {
        boolean z10;
        n7.d dVarQ;
        n7.l lVar;
        long j9;
        Uri uri;
        String str;
        androidx.media3.common.c0 c0Var;
        String str2;
        androidx.media3.common.q0 q0Var2 = q0Var;
        q0Var2.f1414b.getClass();
        String scheme = q0Var2.f1414b.f1328a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(q0Var2.f1414b.f1329b, "application/x-image-uri")) {
            long j10 = q0Var2.f1414b.f1335h;
            String str3 = e7.i0.f5136a;
            throw null;
        }
        androidx.media3.common.l0 l0Var = q0Var2.f1414b;
        int iB = e7.i0.B(l0Var.f1328a, l0Var.f1329b);
        boolean z11 = true;
        if (q0Var2.f1414b.f1335h != -9223372036854775807L) {
            a8.o oVar = (a8.o) this.f13715a.A;
            synchronized (oVar) {
                oVar.D = 1;
            }
            a8.o oVar2 = (a8.o) this.f13715a.A;
            synchronized (oVar2) {
                oVar2.E = 1;
            }
        }
        try {
            a2.o oVar3 = this.f13715a;
            HashMap map = (HashMap) oVar3.D;
            z zVar = (z) map.get(Integer.valueOf(iB));
            if (zVar == null) {
                zVar = (z) oVar3.d(iB).get();
                zVar.b((tf.w) oVar3.F);
                zVar.d(oVar3.C);
                zVar.c();
                map.put(Integer.valueOf(iB), zVar);
            }
            androidx.media3.common.j0 j0VarA = q0Var2.f1415c.a();
            androidx.media3.common.k0 k0Var = q0Var2.f1415c;
            if (k0Var.f1308a == -9223372036854775807L) {
                j0VarA.f1268a = this.f13718d;
            }
            if (k0Var.f1311d == -3.4028235E38f) {
                j0VarA.f1271d = this.f13721g;
            }
            if (k0Var.f1312e == -3.4028235E38f) {
                j0VarA.f1272e = this.f13722h;
            }
            if (k0Var.f1309b == -9223372036854775807L) {
                j0VarA.f1269b = this.f13719e;
            }
            if (k0Var.f1310c == -9223372036854775807L) {
                j0VarA.f1270c = this.f13720f;
            }
            androidx.media3.common.k0 k0Var2 = new androidx.media3.common.k0(j0VarA);
            if (k0Var2.equals(q0Var2.f1415c)) {
                z11 = true;
                z10 = false;
            } else {
                androidx.media3.common.h0 h0Var = new androidx.media3.common.h0();
                List list = Collections.EMPTY_LIST;
                fh.t0 t0Var = d2.E;
                androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
                androidx.media3.common.g0 g0Var = q0Var2.f1417e;
                androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
                e0Var.f1171a = g0Var.f1199b;
                e0Var.f1172b = g0Var.f1201d;
                e0Var.f1173c = g0Var.f1202e;
                e0Var.f1174d = g0Var.f1203f;
                e0Var.f1175e = g0Var.f1204g;
                e0Var.f1176f = g0Var.f1205h;
                String str4 = q0Var2.f1413a;
                androidx.media3.common.t0 t0Var2 = q0Var2.f1416d;
                q0Var2.f1415c.a();
                androidx.media3.common.m0 m0Var2 = q0Var2.f1418f;
                androidx.media3.common.l0 l0Var2 = q0Var2.f1414b;
                if (l0Var2 != null) {
                    String str5 = l0Var2.f1333f;
                    String str6 = l0Var2.f1329b;
                    Uri uri2 = l0Var2.f1328a;
                    list = l0Var2.f1332e;
                    t0Var = l0Var2.f1334g;
                    z10 = false;
                    androidx.media3.common.i0 i0Var = l0Var2.f1330c;
                    androidx.media3.common.h0 h0VarA = i0Var != null ? i0Var.a() : new androidx.media3.common.h0();
                    androidx.media3.common.c0 c0Var2 = l0Var2.f1331d;
                    str2 = str5;
                    j9 = l0Var2.f1335h;
                    c0Var = c0Var2;
                    str = str6;
                    uri = uri2;
                    h0Var = h0VarA;
                } else {
                    z10 = false;
                    j9 = -9223372036854775807L;
                    uri = null;
                    str = null;
                    c0Var = null;
                    str2 = null;
                }
                List list2 = list;
                fh.t0 t0Var3 = t0Var;
                androidx.media3.common.j0 j0VarA2 = k0Var2.a();
                ta.c0.A((((Uri) h0Var.f1223e) == null || ((UUID) h0Var.f1222d) != null) ? z11 : z10 ? 1 : 0);
                androidx.media3.common.l0 l0Var3 = uri != null ? new androidx.media3.common.l0(uri, str, ((UUID) h0Var.f1222d) != null ? new androidx.media3.common.i0(h0Var) : null, c0Var, list2, str2, t0Var3, j9) : null;
                if (str4 == null) {
                    str4 = RuntimeVersion.SUFFIX;
                }
                String str7 = str4;
                androidx.media3.common.g0 g0Var2 = new androidx.media3.common.g0(e0Var);
                androidx.media3.common.k0 k0Var3 = new androidx.media3.common.k0(j0VarA2);
                if (t0Var2 == null) {
                    t0Var2 = androidx.media3.common.t0.K;
                }
                q0Var2 = new androidx.media3.common.q0(str7, g0Var2, l0Var3, k0Var3, t0Var2, m0Var2);
            }
            a aVarA = zVar.a(q0Var2);
            fh.t0 t0Var4 = q0Var2.f1414b.f1334g;
            if (!t0Var4.isEmpty()) {
                a[] aVarArr = new a[t0Var4.size() + 1];
                aVarArr[z10 ? 1 : 0] = aVarA;
                for (int i10 = z10 ? 1 : 0; i10 < t0Var4.size(); i10++) {
                    if (this.f13723i) {
                        androidx.media3.common.s sVar = new androidx.media3.common.s();
                        sVar.m = androidx.media3.common.x0.n(((androidx.media3.common.p0) t0Var4.get(i10)).f1378b);
                        sVar.f1494d = ((androidx.media3.common.p0) t0Var4.get(i10)).f1379c;
                        sVar.f1495e = ((androidx.media3.common.p0) t0Var4.get(i10)).f1380d;
                        sVar.f1496f = ((androidx.media3.common.p0) t0Var4.get(i10)).f1381e;
                        sVar.f1492b = ((androidx.media3.common.p0) t0Var4.get(i10)).f1382f;
                        sVar.f1491a = ((androidx.media3.common.p0) t0Var4.get(i10)).f1383g;
                        androidx.media3.common.t tVar = new androidx.media3.common.t(sVar);
                        ak.a aVar = new ak.a(this, tVar, 29);
                        a1.u0 u0Var = this.f13716b;
                        k7.t tVar2 = new k7.t(aVar, 20);
                        Object obj = new Object();
                        tf.w wVar = new tf.w(17);
                        if (this.f13717c.m(tVar)) {
                            androidx.media3.common.s sVarA = tVar.a();
                            sVarA.m = androidx.media3.common.x0.n("application/x-media3-cues");
                            sVarA.f1500j = tVar.f1594n;
                            sVarA.K = this.f13717c.c(tVar);
                            tVar = new androidx.media3.common.t(sVarA);
                        }
                        androidx.media3.common.t tVar3 = tVar;
                        int i11 = i10 + 1;
                        String string = ((androidx.media3.common.p0) t0Var4.get(i10)).f1377a.toString();
                        androidx.media3.common.e0 e0Var2 = new androidx.media3.common.e0();
                        androidx.media3.common.h0 h0Var2 = new androidx.media3.common.h0();
                        List list3 = Collections.EMPTY_LIST;
                        d2 d2Var = d2.E;
                        androidx.media3.common.j0 j0Var = new androidx.media3.common.j0();
                        androidx.media3.common.m0 m0Var3 = androidx.media3.common.m0.f1344d;
                        Uri uri3 = string == null ? null : Uri.parse(string);
                        ta.c0.A((((Uri) h0Var2.f1223e) == null || ((UUID) h0Var2.f1222d) != null) ? z11 : z10 ? 1 : 0);
                        androidx.media3.common.l0 l0Var4 = uri3 != null ? new androidx.media3.common.l0(uri3, null, ((UUID) h0Var2.f1222d) != null ? new androidx.media3.common.i0(h0Var2) : null, null, list3, null, d2Var, -9223372036854775807L) : null;
                        androidx.media3.common.q0 q0Var3 = new androidx.media3.common.q0(RuntimeVersion.SUFFIX, new androidx.media3.common.g0(e0Var2), l0Var4, new androidx.media3.common.k0(j0Var), androidx.media3.common.t0.K, m0Var3);
                        l0Var4.getClass();
                        q0Var3.f1414b.getClass();
                        androidx.media3.common.i0 i0Var2 = q0Var3.f1414b.f1330c;
                        if (i0Var2 == null) {
                            lVar = n7.l.f11172a;
                        } else {
                            synchronized (obj) {
                                try {
                                    dVarQ = !i0Var2.equals(null) ? k9.x0.q(i0Var2) : null;
                                    dVarQ.getClass();
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            lVar = dVarQ;
                        }
                        aVarArr[i11] = new v0(q0Var3, u0Var, tVar2, lVar, wVar, 1048576, tVar3);
                    } else {
                        a1.u0 u0Var2 = this.f13716b;
                        u0Var2.getClass();
                        aVarArr[i10 + 1] = new i1((androidx.media3.common.p0) t0Var4.get(i10), u0Var2, new tf.w(17));
                    }
                }
                aVarA = new k0(aVarArr);
            }
            androidx.media3.common.g0 g0Var3 = q0Var2.f1417e;
            if (g0Var3.f1199b != 0 || g0Var3.f1201d != Long.MIN_VALUE || g0Var3.f1203f) {
                d dVar = new d(aVarA);
                long j11 = g0Var3.f1199b;
                if (j11 >= 0) {
                    z10 = z11;
                }
                ta.c0.s(z10);
                ta.c0.A(!dVar.f13656h);
                dVar.f13650b = j11;
                long j12 = g0Var3.f1201d;
                ta.c0.A(!dVar.f13656h);
                dVar.f13651c = j12;
                boolean z12 = !g0Var3.f1204g;
                ta.c0.A(!dVar.f13656h);
                dVar.f13652d = z12;
                boolean z13 = g0Var3.f1202e;
                ta.c0.A(!dVar.f13656h);
                dVar.f13653e = z13;
                boolean z14 = g0Var3.f1203f;
                ta.c0.A(!dVar.f13656h);
                dVar.f13654f = z14;
                boolean z15 = g0Var3.f1205h;
                ta.c0.A(!dVar.f13656h);
                dVar.f13655g = z15;
                dVar.f13656h = z11;
                aVarA = new f(dVar);
            }
            q0Var2.f1414b.getClass();
            if (q0Var2.f1414b.f1331d == null) {
                return aVarA;
            }
            e7.a.m("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return aVarA;
        } catch (ClassNotFoundException e3) {
            throw new IllegalStateException(e3);
        }
    }

    @Override
    public final void b(tf.w wVar) {
        this.f13717c = wVar;
        a2.o oVar = this.f13715a;
        oVar.F = wVar;
        a8.o oVar2 = (a8.o) oVar.A;
        synchronized (oVar2) {
            oVar2.C = wVar;
        }
        Iterator it = ((HashMap) oVar.D).values().iterator();
        while (it.hasNext()) {
            ((z) it.next()).b(wVar);
        }
    }

    @Override
    public final void c() {
        a2.o oVar = this.f13715a;
        oVar.getClass();
        synchronized (((a8.o) oVar.A)) {
        }
    }

    @Override
    public final void d(boolean z10) {
        this.f13723i = z10;
        a2.o oVar = this.f13715a;
        oVar.C = z10;
        a8.o oVar2 = (a8.o) oVar.A;
        synchronized (oVar2) {
            oVar2.B = z10;
        }
        Iterator it = ((HashMap) oVar.D).values().iterator();
        while (it.hasNext()) {
            ((z) it.next()).d(z10);
        }
    }
}
