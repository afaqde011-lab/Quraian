package i7;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import androidx.media3.common.k2;
import androidx.media3.common.l2;
import androidx.media3.common.m2;
import androidx.media3.common.o2;
import androidx.media3.common.r2;
import androidx.media3.common.s2;
import fh.d2;
import fh.u1;
import fh.v1;
import fh.y1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public final class o0 {

    public final Object f7424a;

    public final Object f7425b;

    public final s7.a1[] f7426c;

    public boolean f7427d;

    public boolean f7428e;

    public boolean f7429f;

    public p0 f7430g;

    public boolean f7431h;

    public final boolean[] f7432i;

    public final a[] f7433j;

    public final c3.b f7434k;
    public final b1 l;
    public o0 m;

    public s7.l1 f7435n;

    public v7.u f7436o;

    public long f7437p;

    public o0(a[] aVarArr, long j9, c3.b bVar, a1.i iVar, b1 b1Var, p0 p0Var, v7.u uVar) {
        this.f7433j = aVarArr;
        this.f7437p = j9;
        this.f7434k = bVar;
        this.l = b1Var;
        s7.a0 a0Var = p0Var.f7438a;
        this.f7425b = a0Var.f13644a;
        this.f7430g = p0Var;
        this.f7435n = s7.l1.f13708d;
        this.f7436o = uVar;
        this.f7426c = new s7.a1[aVarArr.length];
        this.f7432i = new boolean[aVarArr.length];
        long j10 = p0Var.f7439b;
        long j11 = p0Var.f7441d;
        boolean z10 = p0Var.f7443f;
        b1Var.getClass();
        Object obj = a0Var.f13644a;
        int i10 = h1.f7333j;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        s7.a0 a0VarA = a0Var.a(pair.second);
        a1 a1Var = (a1) ((HashMap) b1Var.f7227e).get(obj2);
        a1Var.getClass();
        ((HashSet) b1Var.f7230h).add(a1Var);
        z0 z0Var = (z0) ((HashMap) b1Var.f7228f).get(a1Var);
        if (z0Var != null) {
            z0Var.f7512a.e(z0Var.f7513b);
        }
        a1Var.f7218c.add(a0VarA);
        s7.y yVarB = a1Var.f7216a.b(a0VarA, iVar, j10);
        ((IdentityHashMap) b1Var.f7226d).put(yVarB, a1Var);
        b1Var.d();
        this.f7424a = j11 != -9223372036854775807L ? new s7.c(yVarB, !z10, 0L, j11) : yVarB;
    }

    public final long a(v7.u uVar, long j9, boolean z10, boolean[] zArr) {
        a[] aVarArr;
        s7.a1[] a1VarArr;
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= uVar.f15528a) {
                break;
            }
            if (z10 || !uVar.a(this.f7436o, i10)) {
                z11 = false;
            }
            this.f7432i[i10] = z11;
            i10++;
        }
        int i11 = 0;
        while (true) {
            aVarArr = this.f7433j;
            int length = aVarArr.length;
            a1VarArr = this.f7426c;
            if (i11 >= length) {
                break;
            }
            if (aVarArr[i11].B == -2) {
                a1VarArr[i11] = null;
            }
            i11++;
        }
        b();
        this.f7436o = uVar;
        c();
        long jI = this.f7424a.i(uVar.f15530c, this.f7432i, this.f7426c, zArr, j9);
        for (int i12 = 0; i12 < aVarArr.length; i12++) {
            if (aVarArr[i12].B == -2 && this.f7436o.b(i12)) {
                a1VarArr[i12] = new s7.o();
            }
        }
        this.f7429f = false;
        for (int i13 = 0; i13 < a1VarArr.length; i13++) {
            if (a1VarArr[i13] != null) {
                ta.c0.A(uVar.b(i13));
                if (aVarArr[i13].B != -2) {
                    this.f7429f = true;
                }
            } else {
                ta.c0.A(uVar.f15530c[i13] == null);
            }
        }
        return jI;
    }

    public final void b() {
        if (this.m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            v7.u uVar = this.f7436o;
            if (i10 >= uVar.f15528a) {
                return;
            }
            boolean zB = uVar.b(i10);
            v7.r rVar = this.f7436o.f15530c[i10];
            if (zB && rVar != null) {
                rVar.l();
            }
            i10++;
        }
    }

    public final void c() {
        if (this.m != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            v7.u uVar = this.f7436o;
            if (i10 >= uVar.f15528a) {
                return;
            }
            boolean zB = uVar.b(i10);
            v7.r rVar = this.f7436o.f15530c[i10];
            if (zB && rVar != null) {
                rVar.i();
            }
            i10++;
        }
    }

    public final long d() {
        if (!this.f7428e) {
            return this.f7430g.f7439b;
        }
        long jT = this.f7429f ? this.f7424a.t() : Long.MIN_VALUE;
        return jT == Long.MIN_VALUE ? this.f7430g.f7442e : jT;
    }

    public final long e() {
        return this.f7430g.f7439b + this.f7437p;
    }

    public final void f(float f3, k2 k2Var, boolean z10) {
        this.f7428e = true;
        this.f7435n = this.f7424a.s();
        v7.u uVarJ = j(f3, k2Var, z10);
        p0 p0Var = this.f7430g;
        long jMax = p0Var.f7439b;
        long j9 = p0Var.f7442e;
        if (j9 != -9223372036854775807L && jMax >= j9) {
            jMax = Math.max(0L, j9 - 1);
        }
        long jA = a(uVarJ, jMax, false, new boolean[this.f7433j.length]);
        long j10 = this.f7437p;
        p0 p0Var2 = this.f7430g;
        this.f7437p = (p0Var2.f7439b - jA) + j10;
        this.f7430g = p0Var2.b(jA);
    }

    public final boolean g() {
        if (this.f7428e) {
            return !this.f7429f || this.f7424a.t() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean h() {
        if (this.f7428e) {
            return g() || d() - this.f7430g.f7439b >= -9223372036854775807L;
        }
        return false;
    }

    public final void i() {
        b();
        ?? r4 = this.f7424a;
        try {
            boolean z10 = r4 instanceof s7.c;
            b1 b1Var = this.l;
            if (z10) {
                b1Var.h(((s7.c) r4).A);
            } else {
                b1Var.h(r4);
            }
        } catch (RuntimeException e3) {
            e7.a.e("MediaPeriodHolder", "Period release failed.", e3);
        }
    }

    public final v7.u j(float f3, k2 k2Var, boolean z10) {
        v7.j jVar;
        ?? r7;
        String str;
        Point pointQ;
        l2 l2Var;
        Object languageTag;
        CaptioningManager captioningManager;
        Locale locale;
        ?? Z;
        long j9;
        boolean z11;
        d2 d2VarS;
        v7.r bVar;
        long j10;
        int i10;
        int[] iArr;
        long[][] jArr;
        l2 l2Var2;
        Object qVar;
        int i11;
        o2 o2Var;
        Object qVar2;
        o2 o2Var2;
        Context context;
        int[] iArr2;
        c3.b bVar2 = this.f7434k;
        a[] aVarArr = this.f7433j;
        s7.l1 l1Var = this.f7435n;
        bVar2.getClass();
        int i12 = 1;
        int[] iArr3 = new int[aVarArr.length + 1];
        int length = aVarArr.length + 1;
        l2[][] l2VarArr = new l2[length][];
        int[][][] iArr4 = new int[aVarArr.length + 1][][];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = l1Var.f13710a;
            l2VarArr[i13] = new l2[i14];
            iArr4[i13] = new int[i14][];
        }
        int length2 = aVarArr.length;
        int[] iArr5 = new int[length2];
        for (int i15 = 0; i15 < length2; i15++) {
            iArr5[i15] = aVarArr[i15].C();
        }
        int i16 = 0;
        while (i16 < l1Var.f13710a) {
            l2 l2VarA = l1Var.a(i16);
            int i17 = l2VarA.f1340c == 5 ? i12 : 0;
            int length3 = aVarArr.length;
            int i18 = i12;
            int i19 = i18;
            int i20 = 0;
            int i21 = 0;
            while (i20 < aVarArr.length) {
                a aVar = aVarArr[i20];
                c3.b bVar3 = bVar2;
                s7.l1 l1Var2 = l1Var;
                int iMax = 0;
                for (int i22 = 0; i22 < l2VarA.f1338a; i22++) {
                    iMax = Math.max(iMax, aVar.B(l2VarA.f1341d[i22]) & 7);
                }
                int i23 = iArr3[i20] == 0 ? i18 : 0;
                if (iMax > i21 || (iMax == i21 && i17 != 0 && i19 == 0 && i23 != 0)) {
                    i21 = iMax;
                    i19 = i23;
                    length3 = i20;
                }
                i20++;
                bVar2 = bVar3;
                l1Var = l1Var2;
            }
            c3.b bVar4 = bVar2;
            s7.l1 l1Var3 = l1Var;
            if (length3 == aVarArr.length) {
                iArr2 = new int[l2VarA.f1338a];
            } else {
                a aVar2 = aVarArr[length3];
                int[] iArr6 = new int[l2VarA.f1338a];
                for (int i24 = 0; i24 < l2VarA.f1338a; i24++) {
                    iArr6[i24] = aVar2.B(l2VarA.f1341d[i24]);
                }
                iArr2 = iArr6;
            }
            int i25 = iArr3[length3];
            l2VarArr[length3][i25] = l2VarA;
            iArr4[length3][i25] = iArr2;
            iArr3[length3] = i25 + 1;
            i16++;
            i12 = i18;
            bVar2 = bVar4;
            l1Var = l1Var3;
        }
        c3.b bVar5 = bVar2;
        int i26 = i12;
        s7.l1[] l1VarArr = new s7.l1[aVarArr.length];
        String[] strArr = new String[aVarArr.length];
        int[] iArr7 = new int[aVarArr.length];
        for (int i27 = 0; i27 < aVarArr.length; i27++) {
            int i28 = iArr3[i27];
            l1VarArr[i27] = new s7.l1((l2[]) e7.i0.J(i28, l2VarArr[i27]));
            iArr4[i27] = (int[][]) e7.i0.J(i28, iArr4[i27]);
            strArr[i27] = aVarArr[i27].i();
            iArr7[i27] = aVarArr[i27].B;
        }
        v7.t tVar = new v7.t(iArr7, l1VarArr, iArr5, iArr4, new s7.l1((l2[]) e7.i0.J(iArr3[aVarArr.length], l2VarArr[aVarArr.length])));
        v7.p pVar = (v7.p) bVar5;
        synchronized (pVar.f15512c) {
            pVar.f15516g = Thread.currentThread();
            jVar = pVar.f15515f;
        }
        if (pVar.f15519j == null && (context = pVar.f15513d) != null) {
            pVar.f15519j = Boolean.valueOf(e7.i0.F(context));
        }
        Pair pairZ = null;
        if (jVar.A0 && pVar.f15517h == null) {
            Context context2 = pVar.f15513d;
            Boolean bool = pVar.f15519j;
            c7.c cVar = new c7.c();
            AudioManager audioManagerC = context2 == null ? null : c7.i.C(context2);
            if (audioManagerC == null || (bool != null && bool.booleanValue())) {
                cVar.B = null;
                cVar.A = false;
                cVar.C = null;
                cVar.D = null;
            } else {
                Spatializer spatializer = audioManagerC.getSpatializer();
                cVar.B = spatializer;
                cVar.A = spatializer.getImmersiveAudioLevel() != 0 ? i26 : 0;
                v7.k kVar = new v7.k(pVar);
                cVar.D = kVar;
                Looper looperMyLooper = Looper.myLooper();
                looperMyLooper.getClass();
                Handler handler = new Handler(looperMyLooper);
                cVar.C = handler;
                spatializer.addOnSpatializerStateChangedListener(new androidx.media3.cast.s(handler), kVar);
            }
            pVar.f15517h = cVar;
        }
        int i29 = tVar.f15522a;
        Context context3 = pVar.f15513d;
        ?? r10 = new v7.q[i29];
        int i30 = 0;
        while (true) {
            if (i30 >= tVar.f15522a) {
                r7 = 0;
                break;
            }
            if (2 == iArr7[i30] && l1VarArr[i30].f13710a > 0) {
                r7 = i26;
                break;
            }
            i30++;
        }
        Pair pairZ2 = v7.p.z(i26, tVar, iArr4, new v7.d(r7, pVar, jVar, iArr5), new b3.c0(19));
        if (pairZ2 != null) {
            r10[((Integer) pairZ2.second).intValue()] = (v7.q) pairZ2.first;
        }
        if (pairZ2 == null) {
            str = null;
        } else {
            v7.q qVar3 = (v7.q) pairZ2.first;
            str = qVar3.f15520a.f1341d[qVar3.f15521b[0]].f1586d;
        }
        o2 o2Var3 = jVar.f1461w;
        if (o2Var3.f1369a == 2) {
            l2Var = null;
        } else {
            if (!jVar.f1451k || context3 == null) {
                pointQ = null;
                l2Var = null;
            } else {
                pointQ = e7.i0.q(context3);
                l2Var = null;
            }
            pairZ = v7.p.z(2, tVar, iArr4, new k9.f1(jVar, str, iArr5, pointQ), new b3.c0(18));
        }
        int i31 = 4;
        ?? Z2 = ((jVar.E || pairZ == null) && o2Var3.f1369a != 2) ? v7.p.z(4, tVar, iArr4, new k7.t(jVar, 24), new b3.c0(17)) : l2Var;
        if (Z2 != 0) {
            r10[((Integer) ((Pair) Z2).second).intValue()] = (v7.q) ((Pair) Z2).first;
        } else if (pairZ != null) {
            r10[((Integer) pairZ.second).intValue()] = (v7.q) pairZ.first;
        }
        int i32 = 3;
        if (o2Var3.f1369a == 2) {
            Z = l2Var;
        } else {
            if (!jVar.B || context3 == null || (captioningManager = (CaptioningManager) context3.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
                languageTag = l2Var;
            } else {
                String str2 = e7.i0.f5136a;
                languageTag = locale.toLanguageTag();
            }
            Z = v7.p.z(3, tVar, iArr4, new ce.a(jVar, str, languageTag, 15), new b3.c0(20));
        }
        if (Z != 0) {
            r10[((Integer) ((Pair) Z).second).intValue()] = (v7.q) ((Pair) Z).first;
        }
        int i33 = 0;
        while (i33 < i29) {
            int i34 = iArr7[i33];
            if (i34 == 2 || i34 == 1 || i34 == i32 || i34 == i31) {
                i11 = i33;
                o2Var = o2Var3;
            } else {
                s7.l1 l1Var4 = l1VarArr[i33];
                int[][] iArr8 = iArr4[i33];
                if (o2Var3.f1369a == 2) {
                    i11 = i33;
                    o2Var = o2Var3;
                } else {
                    l2 l2Var3 = l2Var;
                    ?? r22 = l2Var3;
                    int i35 = 0;
                    int i36 = 0;
                    while (i35 < l1Var4.f13710a) {
                        l2 l2VarA2 = l1Var4.a(i35);
                        int[] iArr9 = iArr8[i35];
                        s7.l1 l1Var5 = l1Var4;
                        int[][] iArr10 = iArr8;
                        ?? r11 = r22;
                        int i37 = i33;
                        int i38 = 0;
                        while (i38 < l2VarA2.f1338a) {
                            int i39 = i38;
                            if (a.l(iArr9[i38], jVar.B0)) {
                                o2Var2 = o2Var3;
                                v7.h hVar = new v7.h(l2VarA2.f1341d[i39], iArr9[i39]);
                                if (r11 == 0 || fh.g0.f5672a.c(hVar.B, r11.B).c(hVar.A, r11.A).e() > 0) {
                                    r11 = hVar;
                                    l2Var3 = l2VarA2;
                                    i36 = i39;
                                }
                                i38 = i39 + 1;
                                o2Var3 = o2Var2;
                                r11 = r11;
                            } else {
                                o2Var2 = o2Var3;
                            }
                            l2Var3 = l2Var3;
                            i38 = i39 + 1;
                            o2Var3 = o2Var2;
                            r11 = r11;
                        }
                        i35++;
                        i33 = i37;
                        iArr8 = iArr10;
                        r22 = r11;
                        l1Var4 = l1Var5;
                    }
                    i11 = i33;
                    o2Var = o2Var3;
                    if (l2Var3 != null) {
                        qVar2 = new v7.q(0, l2Var3, new int[]{i36});
                    }
                    r10[i11] = qVar2;
                }
                qVar2 = l2Var;
                r10[i11] = qVar2;
            }
            i33 = i11 + 1;
            o2Var3 = o2Var;
            i32 = 3;
            i31 = 4;
        }
        int i40 = tVar.f15522a;
        s7.l1[] l1VarArr2 = tVar.f15524c;
        HashMap map = new HashMap();
        for (int i41 = 0; i41 < i40; i41++) {
            v7.p.t(l1VarArr2[i41], jVar, map);
        }
        v7.p.t(tVar.f15527f, jVar, map);
        for (int i42 = 0; i42 < i40; i42++) {
            m2 m2Var = (m2) map.get(Integer.valueOf(tVar.f15523b[i42]));
            if (m2Var != null) {
                l2 l2Var4 = m2Var.f1353a;
                fh.t0 t0Var = m2Var.f1354b;
                if (t0Var.isEmpty()) {
                    qVar = l2Var;
                } else {
                    int iIndexOf = l1VarArr2[i42].f13711b.indexOf(l2Var4);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        qVar = new v7.q(0, l2Var4, bi.b.U(t0Var));
                    } else {
                        qVar = l2Var;
                    }
                }
                r10[i42] = qVar;
            }
        }
        int i43 = tVar.f15522a;
        for (int i44 = 0; i44 < i43; i44++) {
            s7.l1 l1Var6 = tVar.f15524c[i44];
            Map map2 = (Map) jVar.D0.get(i44);
            if (map2 != null && map2.containsKey(l1Var6)) {
                Map map3 = (Map) jVar.D0.get(i44);
                if (map3 != null && map3.get(l1Var6) != null) {
                    throw new ClassCastException();
                }
                r10[i44] = l2Var;
            }
        }
        for (int i45 = 0; i45 < i29; i45++) {
            int i46 = tVar.f15523b[i45];
            if (jVar.E0.get(i45) || jVar.I.contains(Integer.valueOf(i46))) {
                r10[i45] = l2Var;
            }
        }
        tf.w wVar = pVar.f15514e;
        w7.d dVar = (w7.d) pVar.f2625b;
        dVar.getClass();
        wVar.getClass();
        ArrayList arrayList = new ArrayList();
        int i47 = 0;
        while (i47 < r10.length) {
            ?? r12 = r10[i47];
            if (r12 == 0 || r12.f15521b.length <= 1) {
                l2Var2 = l2Var;
                arrayList.add(l2Var2);
            } else {
                fh.q0 q0VarM = fh.t0.m();
                q0VarM.c(new v7.a(0L, 0L));
                arrayList.add(q0VarM);
                l2Var2 = l2Var;
            }
            i47++;
            l2Var = l2Var2;
        }
        int length4 = r10.length;
        long[][] jArr2 = new long[length4][];
        int i48 = 0;
        while (true) {
            j9 = -1;
            if (i48 >= r10.length) {
                break;
            }
            ?? r14 = r10[i48];
            if (r14 == 0) {
                jArr2[i48] = new long[0];
                jArr = jArr2;
            } else {
                int[] iArr11 = r14.f15521b;
                jArr2[i48] = new long[iArr11.length];
                int i49 = 0;
                while (i49 < iArr11.length) {
                    long[][] jArr3 = jArr2;
                    long j11 = r14.f15520a.f1341d[iArr11[i49]].f1592j;
                    long[] jArr4 = jArr3[i48];
                    if (j11 == -1) {
                        j11 = 0;
                    }
                    jArr4[i49] = j11;
                    i49++;
                    jArr2 = jArr3;
                }
                jArr = jArr2;
                Arrays.sort(jArr[i48]);
            }
            i48++;
            jArr2 = jArr;
        }
        long[][] jArr5 = jArr2;
        int[] iArr12 = new int[length4];
        long[] jArr6 = new long[length4];
        for (int i50 = 0; i50 < length4; i50++) {
            long[] jArr7 = jArr5[i50];
            jArr6[i50] = jArr7.length == 0 ? 0L : jArr7[0];
        }
        v7.b.v(arrayList, jArr6);
        fh.w.g(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(y1.B);
        u1 u1Var = new u1();
        v1 v1Var = new v1(treeMap);
        v1Var.G = u1Var;
        int i51 = 0;
        while (i51 < length4) {
            long[] jArr8 = jArr5[i51];
            if (jArr8.length <= 1) {
                iArr = iArr12;
                j10 = j9;
                i10 = length4;
            } else {
                int length5 = jArr8.length;
                double[] dArr = new double[length5];
                j10 = j9;
                int i52 = 0;
                while (true) {
                    long[] jArr9 = jArr5[i51];
                    i10 = length4;
                    double dLog = 0.0d;
                    if (i52 >= jArr9.length) {
                        break;
                    }
                    int[] iArr13 = iArr12;
                    long j12 = jArr9[i52];
                    if (j12 != j10) {
                        dLog = Math.log(j12);
                    }
                    dArr[i52] = dLog;
                    i52++;
                    length4 = i10;
                    iArr12 = iArr13;
                }
                iArr = iArr12;
                int i53 = length5 - 1;
                double d3 = dArr[i53] - dArr[0];
                int i54 = 0;
                while (i54 < i53) {
                    double d5 = dArr[i54];
                    i54++;
                    v1Var.j(Double.valueOf(d3 == 0.0d ? 1.0d : (((d5 + dArr[i54]) * 0.5d) - dArr[0]) / d3), Integer.valueOf(i51));
                    d3 = d3;
                }
            }
            i51++;
            length4 = i10;
            j9 = j10;
            iArr12 = iArr;
        }
        int[] iArr14 = iArr12;
        Collection rVar = v1Var.C;
        if (rVar == null) {
            rVar = new fh.r(v1Var, 1);
            v1Var.C = rVar;
        }
        fh.t0 t0VarO = fh.t0.o(rVar);
        for (int i55 = 0; i55 < t0VarO.size(); i55++) {
            int iIntValue = ((Integer) t0VarO.get(i55)).intValue();
            int i56 = iArr14[iIntValue] + 1;
            iArr14[iIntValue] = i56;
            jArr6[iIntValue] = jArr5[iIntValue][i56];
            v7.b.v(arrayList, jArr6);
        }
        for (int i57 = 0; i57 < r10.length; i57++) {
            if (arrayList.get(i57) != null) {
                jArr6[i57] = jArr6[i57] * 2;
            }
        }
        v7.b.v(arrayList, jArr6);
        fh.q0 q0VarM2 = fh.t0.m();
        for (int i58 = 0; i58 < arrayList.size(); i58++) {
            fh.q0 q0Var = (fh.q0) arrayList.get(i58);
            q0VarM2.c(q0Var == null ? d2.E : q0Var.g());
        }
        d2 d2VarG = q0VarM2.g();
        v7.r[] rVarArr = new v7.r[r10.length];
        for (int i59 = 0; i59 < r10.length; i59++) {
            ?? r13 = r10[i59];
            if (r13 != 0) {
                int[] iArr15 = r13.f15521b;
                if (iArr15.length != 0) {
                    if (iArr15.length == 1) {
                        bVar = new v7.s(r13.f15520a, new int[]{iArr15[0]});
                    } else {
                        long j13 = 25000;
                        bVar = new v7.b(r13.f15520a, iArr15, dVar, 10000, j13, j13, (fh.t0) d2VarG.get(i59));
                    }
                    rVarArr[i59] = bVar;
                }
            }
        }
        i1[] i1VarArr = new i1[i29];
        for (int i60 = 0; i60 < i29; i60++) {
            i1VarArr[i60] = (jVar.E0.get(i60) || jVar.I.contains(Integer.valueOf(tVar.f15523b[i60])) || (tVar.f15523b[i60] != -2 && rVarArr[i60] == null)) ? null : i1.f7372c;
        }
        if (jVar.f1461w.f1369a != 0) {
            int i61 = 0;
            int i62 = 0;
            int i63 = -1;
            while (true) {
                if (i62 >= tVar.f15522a) {
                    if (i61 != 1) {
                        break;
                    }
                    int i64 = jVar.f1461w.f1370b ? 1 : 2;
                    i1 i1Var = i1VarArr[i63];
                    i1VarArr[i63] = new i1(i64, i1Var != null && i1Var.f7374b);
                    break;
                }
                int i65 = tVar.f15523b[i62];
                v7.r rVar2 = rVarArr[i62];
                if (i65 != 1 && rVar2 != null) {
                    break;
                }
                if (i65 == 1 && rVar2 != null && rVar2.length() == 1) {
                    int iIndexOf2 = tVar.f15524c[i62].f13711b.indexOf(rVar2.d());
                    if (iIndexOf2 < 0) {
                        iIndexOf2 = -1;
                    }
                    if (v7.p.y(jVar, iArr4[i62][iIndexOf2][rVar2.j(0)], rVar2.n())) {
                        i61++;
                        i63 = i62;
                    }
                }
                i62++;
            }
        }
        Pair pairCreate = Pair.create(i1VarArr, rVarArr);
        v7.r[] rVarArr2 = (v7.r[]) pairCreate.second;
        List[] listArr = new List[rVarArr2.length];
        for (int i66 = 0; i66 < rVarArr2.length; i66++) {
            v7.r rVar3 = rVarArr2[i66];
            if (rVar3 != null) {
                d2VarS = fh.t0.s(rVar3);
            } else {
                fh.r0 r0Var = fh.t0.B;
                d2VarS = d2.E;
            }
            listArr[i66] = d2VarS;
        }
        fh.q0 q0Var2 = new fh.q0(4);
        int i67 = 0;
        while (true) {
            int i68 = tVar.f15522a;
            s7.l1[] l1VarArr3 = tVar.f15524c;
            if (i67 >= i68) {
                break;
            }
            s7.l1 l1Var7 = l1VarArr3[i67];
            List list = listArr[i67];
            int i69 = 0;
            while (i69 < l1Var7.f13710a) {
                l2 l2VarA3 = l1Var7.a(i69);
                int i70 = l1VarArr3[i67].a(i69).f1338a;
                int[] iArr16 = new int[i70];
                int i71 = 0;
                int i72 = 0;
                while (i71 < i70) {
                    List[] listArr2 = listArr;
                    if ((tVar.f15526e[i67][i69][i71] & 7) == 4) {
                        iArr16[i72] = i71;
                        i72++;
                    }
                    i71++;
                    listArr = listArr2;
                }
                List[] listArr3 = listArr;
                int[] iArrCopyOf = Arrays.copyOf(iArr16, i72);
                s7.l1 l1Var8 = l1Var7;
                int iMin = 16;
                String str3 = null;
                int i73 = 0;
                boolean z12 = false;
                int i74 = 0;
                while (i73 < iArrCopyOf.length) {
                    String str4 = l1VarArr3[i67].a(i69).f1341d[iArrCopyOf[i73]].f1594n;
                    int i75 = i74 + 1;
                    if (i74 == 0) {
                        str3 = str4;
                    } else {
                        z12 = (!Objects.equals(str3, str4)) | z12;
                    }
                    iMin = Math.min(iMin, tVar.f15526e[i67][i69][i73] & 24);
                    i73++;
                    i74 = i75;
                }
                if (z12) {
                    iMin = Math.min(iMin, tVar.f15525d[i67]);
                }
                boolean z13 = iMin != 0;
                int i76 = l2VarA3.f1338a;
                int[] iArr17 = new int[i76];
                boolean[] zArr = new boolean[i76];
                for (int i77 = 0; i77 < l2VarA3.f1338a; i77++) {
                    iArr17[i77] = tVar.f15526e[i67][i69][i77] & 7;
                    int i78 = 0;
                    while (true) {
                        if (i78 >= list.size()) {
                            z11 = false;
                            break;
                        }
                        v7.r rVar4 = (v7.r) list.get(i78);
                        if (rVar4.d().equals(l2VarA3) && rVar4.u(i77) != -1) {
                            z11 = true;
                            break;
                        }
                        i78++;
                    }
                    zArr[i77] = z11;
                }
                q0Var2.c(new r2(l2VarA3, z13, iArr17, zArr));
                i69++;
                listArr = listArr3;
                l1Var7 = l1Var8;
            }
            i67++;
        }
        s7.l1 l1Var9 = tVar.f15527f;
        for (int i79 = 0; i79 < l1Var9.f13710a; i79++) {
            l2 l2VarA4 = l1Var9.a(i79);
            int[] iArr18 = new int[l2VarA4.f1338a];
            Arrays.fill(iArr18, 0);
            q0Var2.c(new r2(l2VarA4, false, iArr18, new boolean[l2VarA4.f1338a]));
        }
        v7.u uVar = new v7.u((i1[]) pairCreate.first, (v7.r[]) pairCreate.second, new s2(q0Var2.g()), tVar);
        for (int i80 = 0; i80 < uVar.f15528a; i80++) {
            if (uVar.b(i80)) {
                ta.c0.A(uVar.f15530c[i80] != null || this.f7433j[i80].B == -2);
            } else {
                ta.c0.A(uVar.f15530c[i80] == null);
            }
        }
        for (v7.r rVar5 : uVar.f15530c) {
            if (rVar5 != null) {
                rVar5.q(f3);
                rVar5.g(z10);
            }
        }
        return uVar;
    }

    public final void k() {
        Object obj = this.f7424a;
        if (obj instanceof s7.c) {
            long j9 = this.f7430g.f7441d;
            if (j9 == -9223372036854775807L) {
                j9 = Long.MIN_VALUE;
            }
            s7.c cVar = (s7.c) obj;
            cVar.E = 0L;
            cVar.F = j9;
        }
    }
}
