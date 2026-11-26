package v7;

import android.content.Context;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import androidx.media3.common.b0;
import androidx.media3.common.l2;
import androidx.media3.common.m2;
import androidx.media3.common.o2;
import androidx.media3.common.q2;
import b3.c0;
import e7.i0;
import fh.b2;
import fh.d0;
import fh.d2;
import fh.t0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import s7.l1;
import tf.w;

public final class p extends c3.b {

    public static final b2 f15511k = new d0(new c0(16));

    public final Object f15512c;

    public final Context f15513d;

    public final w f15514e;

    public j f15515f;

    public Thread f15516g;

    public c7.c f15517h;

    public androidx.media3.common.d f15518i;

    public Boolean f15519j;

    public p(Context context) {
        w wVar = new w(15);
        j jVar = j.F0;
        this.f15512c = new Object();
        this.f15513d = context != null ? context.getApplicationContext() : null;
        this.f15514e = wVar;
        if (jVar != null) {
            this.f15515f = jVar;
        } else {
            jVar.getClass();
            i iVar = new i(jVar);
            iVar.e(jVar);
            this.f15515f = new j(iVar);
        }
        this.f15518i = androidx.media3.common.d.f1142i;
        if (this.f15515f.A0 && context == null) {
            e7.a.m("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static int s(androidx.media3.common.t tVar, t0 t0Var) {
        for (int i10 = 0; i10 < t0Var.size(); i10++) {
            for (int i11 = 0; i11 < tVar.f1585c.size(); i11++) {
                if (((b0) tVar.f1585c.get(i11)).f1100b.equals(t0Var.get(i10))) {
                    return i10;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static void t(l1 l1Var, j jVar, HashMap map) {
        for (int i10 = 0; i10 < l1Var.f13710a; i10++) {
            m2 m2Var = (m2) jVar.H.get(l1Var.a(i10));
            if (m2Var != null) {
                l2 l2Var = m2Var.f1353a;
                m2 m2Var2 = (m2) map.get(Integer.valueOf(l2Var.f1340c));
                if (m2Var2 == null || (m2Var2.f1354b.isEmpty() && !m2Var.f1354b.isEmpty())) {
                    map.put(Integer.valueOf(l2Var.f1340c), m2Var);
                }
            }
        }
    }

    public static int u(androidx.media3.common.t tVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(tVar.f1586d)) {
            return 4;
        }
        String strX = x(str);
        String strX2 = x(tVar.f1586d);
        if (strX2 == null || strX == null) {
            return (z10 && strX2 == null) ? 1 : 0;
        }
        if (strX2.startsWith(strX) || strX.startsWith(strX2)) {
            return 3;
        }
        String str2 = i0.f5136a;
        return strX2.split("-", 2)[0].equals(strX.split("-", 2)[0]) ? 2 : 0;
    }

    public static String x(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean y(j jVar, int i10, androidx.media3.common.t tVar) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        o2 o2Var = jVar.f1461w;
        if (o2Var.f1371c && (i10 & 2048) == 0) {
            return false;
        }
        if (o2Var.f1370b) {
            boolean z10 = (tVar.I == 0 && tVar.J == 0) ? false : true;
            boolean z11 = (i10 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static Pair z(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessS;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.f15522a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.f15523b[i13]) {
                l1 l1Var = tVar2.f15524c[i13];
                for (int i14 = 0; i14 < l1Var.f13710a; i14++) {
                    l2 l2VarA = l1Var.a(i14);
                    d2 d2VarB = mVar.b(i13, l2VarA, iArr[i13][i14]);
                    int i15 = l2VarA.f1338a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) d2VarB.get(i16);
                        int iA = nVar.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                randomAccessS = t0.s(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) d2VarB.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccessS = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccessS);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            tVar2 = tVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).C;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.B, iArr2), Integer.valueOf(nVar3.A));
    }

    public final void A(j jVar) {
        boolean zEquals;
        synchronized (this.f15512c) {
            zEquals = this.f15515f.equals(jVar);
            this.f15515f = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.A0 && this.f15513d == null) {
            e7.a.m("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        i7.i0 i0Var = (i7.i0) this.f2624a;
        if (i0Var != null) {
            i0Var.H.f(10);
        }
    }

    @Override
    public final void p() {
        k kVar;
        synchronized (this.f15512c) {
            try {
                Thread thread = this.f15516g;
                if (thread != null) {
                    ta.c0.z("DefaultTrackSelector is accessed on the wrong thread.", thread == Thread.currentThread());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        c7.c cVar = this.f15517h;
        if (cVar != null) {
            Handler handler = (Handler) cVar.C;
            Spatializer spatializer = (Spatializer) cVar.B;
            if (spatializer != null && (kVar = (k) cVar.D) != null && handler != null) {
                spatializer.removeOnSpatializerStateChangedListener(kVar);
                handler.removeCallbacksAndMessages(null);
            }
            this.f15517h = null;
        }
        this.f2624a = null;
        this.f2625b = null;
    }

    @Override
    public final void q(q2 q2Var) {
        if (q2Var instanceof j) {
            A((j) q2Var);
        }
        i iVar = new i(v());
        iVar.e(q2Var);
        A(new j(iVar));
    }

    public final j v() {
        j jVar;
        synchronized (this.f15512c) {
            jVar = this.f15515f;
        }
        return jVar;
    }

    public final void w() {
        boolean z10;
        i7.i0 i0Var;
        c7.c cVar;
        synchronized (this.f15512c) {
            try {
                z10 = this.f15515f.A0 && (cVar = this.f15517h) != null && cVar.A;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (i0Var = (i7.i0) this.f2624a) == null) {
            return;
        }
        i0Var.H.f(10);
    }
}
