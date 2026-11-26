package l7;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.l2;
import androidx.media3.common.t;
import androidx.media3.common.x0;
import com.google.protobuf.RuntimeVersion;
import e7.i0;
import fh.d2;
import fh.r0;
import fh.t0;
import g7.s;
import i7.m0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k9.b3;
import s7.a0;
import s7.a1;
import s7.b1;
import s7.c1;
import s7.l1;
import s7.x;
import s7.y;
import s7.z0;
import ta.c0;
import tf.w;
import v7.r;

public final class b implements y, b1, t7.g {
    public static final Pattern Z = Pattern.compile("CC([1-4])=(.+)");

    public static final Pattern f10058a0 = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    public final int A;
    public final c50.h B;
    public final s C;
    public final n7.l D;
    public final w E;
    public final oj.q F;
    public final long G;
    public final w7.m H;
    public final a1.i I;
    public final l1 J;
    public final a[] K;
    public final rc.d L;
    public final q M;
    public final c50.h O;
    public final n7.h P;
    public x Q;
    public s7.l T;
    public m7.c U;
    public int V;
    public List W;
    public long Y;
    public boolean X = true;
    public t7.h[] R = new t7.h[0];
    public n[] S = new n[0];
    public final IdentityHashMap N = new IdentityHashMap();

    public b(int i10, m7.c cVar, oj.q qVar, int i11, c50.h hVar, s sVar, n7.l lVar, n7.h hVar2, w wVar, c50.h hVar3, long j9, w7.m mVar, a1.i iVar, rc.d dVar, f fVar, j7.j jVar) {
        int i12;
        int i13;
        int[][] iArr;
        boolean[] zArr;
        t[][] tVarArr;
        t[] tVarArrN;
        m7.f fVarF;
        Integer num;
        this.A = i10;
        this.U = cVar;
        this.F = qVar;
        this.V = i11;
        this.B = hVar;
        this.C = sVar;
        this.D = lVar;
        this.P = hVar2;
        this.E = wVar;
        this.O = hVar3;
        this.G = j9;
        this.H = mVar;
        this.I = iVar;
        this.L = dVar;
        boolean z10 = true;
        this.M = new q(cVar, fVar, iVar);
        int i14 = 0;
        dVar.getClass();
        r0 r0Var = t0.B;
        d2 d2Var = d2.E;
        this.T = new s7.l(d2Var, d2Var);
        m7.h hVarA = cVar.a(i11);
        List list = hVarA.f10609d;
        this.W = list;
        List list2 = hVarA.f10608c;
        int size = list2.size();
        HashMap map = new HashMap(fh.w.d(size));
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i15 = 0; i15 < size; i15++) {
            map.put(Long.valueOf(((m7.a) list2.get(i15)).f10570a), Integer.valueOf(i15));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i15));
            arrayList.add(arrayList2);
            sparseArray.put(i15, arrayList2);
        }
        int i16 = 0;
        while (i16 < size) {
            m7.a aVar = (m7.a) list2.get(i16);
            List list3 = aVar.f10574e;
            List list4 = aVar.f10575f;
            boolean z11 = z10;
            m7.f fVarF2 = f("http://dashif.org/guidelines/trickmode", list3);
            fVarF2 = fVarF2 == null ? f("http://dashif.org/guidelines/trickmode", list4) : fVarF2;
            int iIntValue = (fVarF2 == null || (num = (Integer) map.get(Long.valueOf(Long.parseLong(fVarF2.f10600b)))) == null || !b(aVar, (m7.a) list2.get(num.intValue()))) ? i16 : num.intValue();
            if (iIntValue == i16 && (fVarF = f("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                String str = fVarF.f10600b;
                String str2 = i0.f5136a;
                String[] strArrSplit = str.split(",", -1);
                int length = strArrSplit.length;
                for (int i17 = i14; i17 < length; i17++) {
                    Integer num2 = (Integer) map.get(Long.valueOf(Long.parseLong(strArrSplit[i17])));
                    if (num2 != null && b(aVar, (m7.a) list2.get(num2.intValue()))) {
                        iIntValue = Math.min(iIntValue, num2.intValue());
                    }
                }
            }
            if (iIntValue != i16) {
                List list5 = (List) sparseArray.get(i16);
                List list6 = (List) sparseArray.get(iIntValue);
                list6.addAll(list5);
                sparseArray.put(i16, list6);
                arrayList.remove(list5);
            }
            i16++;
            z10 = z11;
            i14 = 0;
        }
        boolean z12 = z10;
        int size2 = arrayList.size();
        int[][] iArr2 = new int[size2][];
        for (int i18 = 0; i18 < size2; i18++) {
            int[] iArrU = bi.b.U((Collection) arrayList.get(i18));
            iArr2[i18] = iArrU;
            Arrays.sort(iArrU);
        }
        boolean[] zArr2 = new boolean[size2];
        t[][] tVarArr2 = new t[size2][];
        int i19 = 0;
        int i20 = 0;
        while (i19 < size2) {
            int[] iArr3 = iArr2[i19];
            int length2 = iArr3.length;
            int i21 = 0;
            while (true) {
                if (i21 >= length2) {
                    iArr = iArr2;
                    break;
                }
                List list7 = ((m7.a) list2.get(iArr3[i21])).f10572c;
                iArr = iArr2;
                for (int i22 = 0; i22 < list7.size(); i22++) {
                    if (!((m7.m) list7.get(i22)).D.isEmpty()) {
                        zArr2[i19] = z12;
                        i20++;
                        break;
                    }
                }
                i21++;
                iArr2 = iArr;
            }
            int[] iArr4 = iArr[i19];
            int length3 = iArr4.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length3) {
                    zArr = zArr2;
                    tVarArr = tVarArr2;
                    tVarArrN = new t[0];
                    break;
                }
                int i24 = iArr4[i23];
                m7.a aVar2 = (m7.a) list2.get(i24);
                List list8 = ((m7.a) list2.get(i24)).f10573d;
                int[] iArr5 = iArr4;
                int i25 = 0;
                while (i25 < list8.size()) {
                    m7.f fVar2 = (m7.f) list8.get(i25);
                    zArr = zArr2;
                    tVarArr = tVarArr2;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar2.f10599a)) {
                        androidx.media3.common.s sVar2 = new androidx.media3.common.s();
                        sVar2.m = x0.n("application/cea-608");
                        sVar2.f1491a = a1.b.k(aVar2.f10570a, ":cea608", new StringBuilder());
                        tVarArrN = n(fVar2, Z, new t(sVar2));
                        break;
                    }
                    if ("urn:scte:dash:cc:cea-708:2015".equals(fVar2.f10599a)) {
                        androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                        sVar3.m = x0.n("application/cea-708");
                        sVar3.f1491a = a1.b.k(aVar2.f10570a, ":cea708", new StringBuilder());
                        tVarArrN = n(fVar2, f10058a0, new t(sVar3));
                        break;
                    }
                    i25++;
                    tVarArr2 = tVarArr;
                    zArr2 = zArr;
                }
                i23++;
                iArr4 = iArr5;
            }
            tVarArr[i19] = tVarArrN;
            if (tVarArrN.length != 0) {
                i20++;
            }
            i19++;
            tVarArr2 = tVarArr;
            iArr2 = iArr;
            zArr2 = zArr;
        }
        int[][] iArr6 = iArr2;
        boolean[] zArr3 = zArr2;
        t[][] tVarArr3 = tVarArr2;
        int size3 = list.size() + i20 + size2;
        l2[] l2VarArr = new l2[size3];
        a[] aVarArr = new a[size3];
        int i26 = 0;
        int i27 = 0;
        while (i26 < size2) {
            int[] iArr7 = iArr6[i26];
            ArrayList arrayList3 = new ArrayList();
            for (int i28 : iArr7) {
                arrayList3.addAll(((m7.a) list2.get(i28)).f10572c);
            }
            int size4 = arrayList3.size();
            t[] tVarArr4 = new t[size4];
            int i29 = 0;
            while (i29 < size4) {
                int i30 = size2;
                t tVar = ((m7.m) arrayList3.get(i29)).A;
                int i31 = i27;
                androidx.media3.common.s sVarA = tVar.a();
                sVarA.N = lVar.d(tVar);
                tVarArr4[i29] = new t(sVarA);
                i29++;
                size2 = i30;
                i27 = i31;
            }
            int i32 = size2;
            int i33 = i27;
            m7.a aVar3 = (m7.a) list2.get(iArr7[0]);
            long j10 = aVar3.f10570a;
            String string = j10 != -1 ? Long.toString(j10) : g4.c.f(i26, "unset:");
            int i34 = i33 + 1;
            if (zArr3[i26]) {
                i12 = i33 + 2;
            } else {
                i12 = i34;
                i34 = -1;
            }
            if (tVarArr3[i26].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            l(hVar, tVarArr4);
            List list9 = list2;
            l2VarArr[i33] = new l2(string, tVarArr4);
            int i35 = aVar3.f10571b;
            r0 r0Var2 = t0.B;
            d2 d2Var2 = d2.E;
            a aVar4 = new a(i35, 0, iArr7, i33, i34, i12, -1, d2Var2);
            int i36 = i33;
            aVarArr[i36] = aVar4;
            int i37 = -1;
            if (i34 != -1) {
                String strJ = w.c.j(string, ":emsg");
                androidx.media3.common.s sVar4 = new androidx.media3.common.s();
                sVar4.f1491a = strJ;
                sVar4.m = x0.n("application/x-emsg");
                l2VarArr[i34] = new l2(strJ, new t(sVar4));
                a aVar5 = new a(5, 1, iArr7, i36, -1, -1, -1, d2Var2);
                i36 = i36;
                aVarArr[i34] = aVar5;
                i37 = -1;
            }
            if (i12 != i37) {
                String strJ2 = w.c.j(string, ":cc");
                aVarArr[i12] = new a(3, 1, iArr7, i36, -1, -1, -1, t0.p(tVarArr3[i26]));
                l(hVar, tVarArr3[i26]);
                l2VarArr[i12] = new l2(strJ2, tVarArr3[i26]);
            }
            i26++;
            size2 = i32;
            i27 = i13;
            list2 = list9;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            m7.g gVar = (m7.g) list.get(i38);
            androidx.media3.common.s sVar5 = new androidx.media3.common.s();
            sVar5.f1491a = gVar.a();
            sVar5.m = x0.n("application/x-emsg");
            l2VarArr[i27] = new l2(gVar.a() + ":" + i38, new t(sVar5));
            r0 r0Var3 = t0.B;
            aVarArr[i27] = new a(5, 2, new int[0], -1, -1, -1, i38, d2.E);
            i38++;
            i27++;
        }
        Pair pairCreate = Pair.create(new l1(l2VarArr), aVarArr);
        this.J = (l1) pairCreate.first;
        this.K = (a[]) pairCreate.second;
    }

    public static boolean b(m7.a aVar, m7.a aVar2) {
        int i10 = aVar.f10571b;
        List list = aVar.f10572c;
        int i11 = aVar2.f10571b;
        List list2 = aVar2.f10572c;
        if (i10 == i11) {
            if (list.isEmpty() || list2.isEmpty()) {
                return true;
            }
            t tVar = ((m7.m) list.get(0)).A;
            t tVar2 = ((m7.m) list2.get(0)).A;
            int i12 = tVar.f1588f & (-16385);
            int i13 = tVar2.f1588f & (-16385);
            if (Objects.equals(tVar.f1586d, tVar2.f1586d) && i12 == i13) {
                return true;
            }
        }
        return false;
    }

    public static m7.f f(String str, List list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            m7.f fVar = (m7.f) list.get(i10);
            if (str.equals(fVar.f10599a)) {
                return fVar;
            }
        }
        return null;
    }

    public static void l(c50.h hVar, t[] tVarArr) {
        for (int i10 = 0; i10 < tVarArr.length; i10++) {
            t tVar = tVarArr[i10];
            androidx.media3.common.q qVar = (androidx.media3.common.q) hVar.D;
            if (qVar.B && ((w) qVar.C).m(tVar)) {
                androidx.media3.common.s sVarA = tVar.a();
                String str = tVar.f1593k;
                sVarA.m = x0.n("application/x-media3-cues");
                sVarA.K = ((w) qVar.C).c(tVar);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(tVar.f1594n);
                sb2.append(str != null ? " ".concat(str) : RuntimeVersion.SUFFIX);
                sVarA.f1500j = sb2.toString();
                sVarA.f1506r = Long.MAX_VALUE;
                tVar = new t(sVarA);
            }
            tVarArr[i10] = tVar;
        }
    }

    public static t[] n(m7.f fVar, Pattern pattern, t tVar) {
        String str = fVar.f10600b;
        if (str == null) {
            return new t[]{tVar};
        }
        String str2 = i0.f5136a;
        String[] strArrSplit = str.split(";", -1);
        t[] tVarArr = new t[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            Matcher matcher = pattern.matcher(strArrSplit[i10]);
            if (!matcher.matches()) {
                return new t[]{tVar};
            }
            int i11 = Integer.parseInt(matcher.group(1));
            androidx.media3.common.s sVarA = tVar.a();
            sVarA.f1491a = tVar.f1583a + ":" + i11;
            sVarA.J = i11;
            sVarA.f1494d = matcher.group(2);
            tVarArr[i10] = new t(sVarA);
        }
        return tVarArr;
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        long jE;
        int i10 = 0;
        for (t7.h hVar : this.R) {
            if (hVar.A == 2) {
                k[] kVarArr = hVar.E.f10102i;
                int length = kVarArr.length;
                while (i10 < length) {
                    k kVar = kVarArr[i10];
                    j jVar = (j) kVar.f10093g;
                    long j10 = kVar.f10089c;
                    j jVar2 = (j) kVar.f10093g;
                    if (jVar != null) {
                        long jC = kVar.c();
                        if (jC != 0) {
                            jVar2.getClass();
                            long jO = jVar2.o(j9, kVar.f10088b) + j10;
                            long jE2 = kVar.e(jO);
                            if (jE2 >= j9) {
                                jE = jE2;
                            } else {
                                if (jC != -1) {
                                    jVar2.getClass();
                                    if (jO >= ((jVar2.x() + j10) + jC) - 1) {
                                        jE = jE2;
                                    }
                                }
                                jE = kVar.e(jO + 1);
                            }
                            return l1Var.a(j9, jE2, jE);
                        }
                    }
                    i10++;
                    j9 = j9;
                }
                break;
            }
        }
        return j9;
    }

    @Override
    public final void d(c1 c1Var) {
        this.Q.d(this);
    }

    @Override
    public final boolean e(m0 m0Var) {
        return this.T.e(m0Var);
    }

    @Override
    public final long g() {
        return this.T.g();
    }

    public final int h(int[] iArr, int i10) {
        int i11 = iArr[i10];
        if (i11 != -1) {
            a[] aVarArr = this.K;
            int i12 = aVarArr[i11].f10054e;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                int i14 = iArr[i13];
                if (i14 == i12 && aVarArr[i14].f10052c == 0) {
                    return i13;
                }
            }
        }
        return -1;
    }

    @Override
    public final long i(r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) throws Throwable {
        int i10;
        l2 l2Var;
        boolean z10;
        int[] iArr;
        int[] iArr2;
        int i11;
        int i12;
        int i13;
        l2 l2VarA;
        t0 t0Var;
        int i14;
        p pVar;
        boolean z11;
        r[] rVarArr2 = rVarArr;
        int[] iArr3 = new int[rVarArr2.length];
        int i15 = 0;
        int i16 = 0;
        while (true) {
            i10 = -1;
            if (i16 >= rVarArr2.length) {
                break;
            }
            r rVar = rVarArr2[i16];
            if (rVar != null) {
                int iIndexOf = this.J.f13711b.indexOf(rVar.d());
                iArr3[i16] = iIndexOf >= 0 ? iIndexOf : -1;
            } else {
                iArr3[i16] = -1;
            }
            i16++;
        }
        int i17 = 0;
        while (true) {
            l2Var = null;
            if (i17 >= rVarArr2.length) {
                break;
            }
            if (rVarArr2[i17] == null || !zArr[i17]) {
                a1 a1Var = a1VarArr[i17];
                if (a1Var instanceof t7.h) {
                    ((t7.h) a1Var).B(this);
                } else if (a1Var instanceof t7.f) {
                    t7.f fVar = (t7.f) a1Var;
                    t7.h hVar = fVar.E;
                    boolean[] zArr3 = hVar.D;
                    int i18 = fVar.C;
                    c0.A(zArr3[i18]);
                    hVar.D[i18] = false;
                }
                a1VarArr[i17] = null;
            }
            i17++;
        }
        int i19 = 0;
        while (true) {
            z10 = true;
            if (i19 >= rVarArr2.length) {
                break;
            }
            a1 a1Var2 = a1VarArr[i19];
            if ((a1Var2 instanceof s7.o) || (a1Var2 instanceof t7.f)) {
                int iH = h(iArr3, i19);
                if (iH == -1) {
                    z11 = a1VarArr[i19] instanceof s7.o;
                } else {
                    a1 a1Var3 = a1VarArr[i19];
                    z11 = (a1Var3 instanceof t7.f) && ((t7.f) a1Var3).A == a1VarArr[iH];
                }
                if (!z11) {
                    a1 a1Var4 = a1VarArr[i19];
                    if (a1Var4 instanceof t7.f) {
                        t7.f fVar2 = (t7.f) a1Var4;
                        t7.h hVar2 = fVar2.E;
                        boolean[] zArr4 = hVar2.D;
                        int i20 = fVar2.C;
                        c0.A(zArr4[i20]);
                        hVar2.D[i20] = false;
                    }
                    a1VarArr[i19] = null;
                }
            }
            i19++;
        }
        int i21 = 0;
        while (i21 < rVarArr2.length) {
            r rVar2 = rVarArr2[i21];
            if (rVar2 == null) {
                iArr2 = iArr3;
                i11 = i15;
                i12 = i21;
            } else {
                a1 a1Var5 = a1VarArr[i21];
                if (a1Var5 == null) {
                    zArr2[i21] = z10;
                    a aVar = this.K[iArr3[i21]];
                    int i22 = aVar.f10052c;
                    if (i22 == 0) {
                        int i23 = aVar.f10055f;
                        boolean z12 = i23 != i10 ? z10 ? 1 : 0 : i15;
                        if (z12 != 0) {
                            l2VarA = this.J.a(i23);
                            i13 = z10 ? 1 : 0;
                        } else {
                            i13 = i15;
                            l2VarA = l2Var;
                        }
                        int i24 = aVar.f10056g;
                        if (i24 != i10) {
                            t0Var = this.K[i24].f10057h;
                        } else {
                            r0 r0Var = t0.B;
                            t0Var = d2.E;
                        }
                        int size = t0Var.size() + i13;
                        t[] tVarArr = new t[size];
                        int[] iArr4 = new int[size];
                        if (z12 != 0) {
                            tVarArr[i15] = l2VarA.f1341d[i15];
                            iArr4[i15] = 5;
                            i14 = z10 ? 1 : 0;
                        } else {
                            i14 = i15;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i25 = i15; i25 < t0Var.size(); i25++) {
                            t tVar = (t) t0Var.get(i25);
                            tVarArr[i14] = tVar;
                            iArr4[i14] = 3;
                            arrayList.add(tVar);
                            i14 += z10 ? 1 : 0;
                        }
                        if (!this.U.f10583d || z12 == 0) {
                            pVar = l2Var;
                        } else {
                            q qVar = this.M;
                            pVar = new p(qVar, qVar.A);
                        }
                        c50.h hVar3 = this.B;
                        w7.m mVar = this.H;
                        m7.c cVar = this.U;
                        oj.q qVar2 = this.F;
                        int i26 = this.V;
                        int[] iArr5 = aVar.f10050a;
                        int i27 = aVar.f10051b;
                        long j10 = this.G;
                        int[] iArr6 = iArr3;
                        s sVar = this.C;
                        g7.f fVarT = ((g7.e) hVar3.C).t();
                        if (sVar != null) {
                            fVarT.s(sVar);
                        }
                        m mVar2 = new m((androidx.media3.common.q) hVar3.D, mVar, cVar, qVar2, i26, iArr5, rVar2, i27, fVarT, j10, hVar3.B, z12, arrayList, pVar);
                        Object obj = pVar;
                        iArr2 = iArr6;
                        l2Var = null;
                        i12 = i21;
                        t7.h hVar4 = new t7.h(aVar.f10051b, iArr4, tVarArr, mVar2, this, this.I, j9, this.D, this.P, this.E, this.O, this.X, null);
                        synchronized (this) {
                            this.N.put(hVar4, obj);
                        }
                        a1VarArr[i12] = hVar4;
                    } else {
                        iArr2 = iArr3;
                        i12 = i21;
                        if (i22 == 2) {
                            i11 = 0;
                            a1VarArr[i12] = new n((m7.g) this.W.get(aVar.f10053d), rVar2.d().f1341d[0], this.U.f10583d);
                        }
                    }
                    i11 = 0;
                } else {
                    iArr2 = iArr3;
                    i11 = i15;
                    i12 = i21;
                    if (a1Var5 instanceof t7.h) {
                        ((t7.h) a1Var5).E.f10103j = rVar2;
                    }
                }
            }
            i21 = i12 + 1;
            rVarArr2 = rVarArr;
            i15 = i11;
            iArr3 = iArr2;
            i10 = -1;
            z10 = true;
        }
        int[] iArr7 = iArr3;
        boolean z13 = i15;
        int i28 = z13 ? 1 : 0;
        while (i28 < rVarArr.length) {
            if (a1VarArr[i28] != null || rVarArr[i28] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                a aVar2 = this.K[iArr[i28]];
                if (aVar2.f10052c == 1) {
                    int iH2 = h(iArr, i28);
                    if (iH2 == -1) {
                        a1VarArr[i28] = new s7.o();
                    } else {
                        t7.h hVar5 = (t7.h) a1VarArr[iH2];
                        int i29 = aVar2.f10051b;
                        boolean[] zArr5 = hVar5.D;
                        z0[] z0VarArr = hVar5.N;
                        int i30 = z13 ? 1 : 0;
                        while (true) {
                            if (i30 >= z0VarArr.length) {
                                throw new IllegalStateException();
                            }
                            if (hVar5.B[i30] == i29) {
                                c0.A(!zArr5[i30]);
                                zArr5[i30] = true;
                                z0VarArr[i30].y(true, j9);
                                a1VarArr[i28] = new t7.f(hVar5, hVar5, z0VarArr[i30], i30);
                                break;
                            }
                            i30++;
                        }
                    }
                }
                i28++;
                iArr7 = iArr;
            }
            i28++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = a1VarArr.length;
        for (int i31 = z13 ? 1 : 0; i31 < length; i31++) {
            a1 a1Var6 = a1VarArr[i31];
            if (a1Var6 instanceof t7.h) {
                arrayList2.add((t7.h) a1Var6);
            } else if (a1Var6 instanceof n) {
                arrayList3.add((n) a1Var6);
            }
        }
        t7.h[] hVarArr = new t7.h[arrayList2.size()];
        this.R = hVarArr;
        arrayList2.toArray(hVarArr);
        n[] nVarArr = new n[arrayList3.size()];
        this.S = nVarArr;
        arrayList3.toArray(nVarArr);
        rc.d dVar = this.L;
        AbstractList abstractListA = fh.w.A(new b3(14), arrayList2);
        dVar.getClass();
        this.T = new s7.l(arrayList2, abstractListA);
        if (this.X) {
            this.X = z13;
            this.Y = j9;
        }
        return j9;
    }

    @Override
    public final boolean isLoading() {
        return this.T.isLoading();
    }

    @Override
    public final void j() {
        this.H.a();
    }

    @Override
    public final long k(long j9) throws Throwable {
        int i10;
        t7.a aVar;
        boolean zY;
        boolean z10;
        t7.h[] hVarArr = this.R;
        int length = hVarArr.length;
        boolean z11 = false;
        int i11 = 0;
        while (i11 < length) {
            t7.h hVar = hVarArr[i11];
            z0[] z0VarArr = hVar.N;
            z0 z0Var = hVar.M;
            w7.l lVar = hVar.I;
            ?? r14 = hVar.K;
            hVar.T = j9;
            hVar.W = z11;
            if (hVar.y()) {
                hVar.S = j9;
                z10 = z11;
                i10 = i11;
            } else {
                ?? r15 = z11;
                while (true) {
                    if (r15 < r14.size()) {
                        aVar = (t7.a) r14.get(r15);
                        long j10 = aVar.G;
                        i10 = i11;
                        if (j10 == j9 && aVar.K == -9223372036854775807L) {
                            break;
                        }
                        if (j10 <= j9) {
                            i11 = i10;
                            r15++;
                        }
                    } else {
                        i10 = i11;
                    }
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    zY = z0Var.x(aVar.a(0));
                } else {
                    long jG = hVar.g();
                    zY = z0Var.y(jG == Long.MIN_VALUE || j9 < jG, j9);
                }
                if (zY) {
                    hVar.U = hVar.A(z0Var.p(), 0);
                    for (z0 z0Var2 : z0VarArr) {
                        z0Var2.y(true, j9);
                    }
                    z10 = false;
                } else {
                    hVar.S = j9;
                    hVar.Y = false;
                    r14.clear();
                    hVar.U = 0;
                    if (lVar.b()) {
                        z0Var.j();
                        for (z0 z0Var3 : z0VarArr) {
                            z0Var3.j();
                        }
                        w7.i iVar = lVar.f15877b;
                        iVar.getClass();
                        z10 = false;
                        iVar.a(false);
                    } else {
                        z10 = false;
                        lVar.f15878c = null;
                        z0Var.w(false);
                        for (z0 z0Var4 : hVar.N) {
                            z0Var4.w(false);
                        }
                    }
                }
            }
            i11 = i10 + 1;
            z11 = z10;
        }
        n[] nVarArr = this.S;
        int length2 = nVarArr.length;
        for (?? r7 = z11; r7 < length2; r7++) {
            n nVar = nVarArr[r7];
            int iB = i0.b(nVar.C, j9, true);
            nVar.G = iB;
            nVar.H = (nVar.D && iB == nVar.C.length) ? j9 : -9223372036854775807L;
        }
        return j9;
    }

    @Override
    public final void m(x xVar, long j9) {
        this.Q = xVar;
        xVar.a(this);
    }

    @Override
    public final void o(boolean z10, long j9) throws Throwable {
        long j10;
        for (t7.h hVar : this.R) {
            if (!hVar.y()) {
                z0 z0Var = hVar.M;
                int i10 = z0Var.f13811q;
                z0Var.i(j9, z10, true);
                z0 z0Var2 = hVar.M;
                int i11 = z0Var2.f13811q;
                if (i11 > i10) {
                    synchronized (z0Var2) {
                        j10 = z0Var2.f13810p == 0 ? Long.MIN_VALUE : z0Var2.f13808n[z0Var2.f13812r];
                    }
                    int i12 = 0;
                    while (true) {
                        z0[] z0VarArr = hVar.N;
                        if (i12 >= z0VarArr.length) {
                            break;
                        }
                        z0VarArr[i12].i(j10, z10, hVar.D[i12]);
                        i12++;
                    }
                }
                int iMin = Math.min(hVar.A(i11, 0), hVar.U);
                if (iMin > 0) {
                    i0.N(hVar.K, 0, iMin);
                    hVar.U -= iMin;
                }
            }
        }
    }

    @Override
    public final long p() {
        for (t7.h hVar : this.R) {
            hVar.getClass();
            try {
                boolean z10 = hVar.X;
                hVar.X = false;
                if (z10) {
                    return this.Y;
                }
            } catch (Throwable th2) {
                hVar.X = false;
                throw th2;
            }
        }
        return -9223372036854775807L;
    }

    @Override
    public final l1 s() {
        return this.J;
    }

    @Override
    public final long t() {
        return this.T.t();
    }

    @Override
    public final void v(long j9) {
        int i10;
        long j10;
        t7.h[] hVarArr = this.R;
        int length = hVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            t7.h hVar = hVarArr[i11];
            if (hVar.I.b()) {
                i10 = i11;
            } else {
                long jC = this.U.c(this.V);
                z0 z0Var = hVar.M;
                c0.A(!hVar.I.b());
                if (hVar.y() || jC == -9223372036854775807L || hVar.K.isEmpty()) {
                    i10 = i11;
                } else {
                    t7.a aVarW = hVar.w();
                    long j11 = aVarW.L;
                    if (j11 == -9223372036854775807L) {
                        j11 = aVarW.H;
                    }
                    if (j11 <= jC) {
                        i10 = i11;
                    } else {
                        synchronized (z0Var) {
                            j10 = z0Var.f13816v;
                        }
                        if (j10 <= jC) {
                            i10 = i11;
                        } else {
                            z0Var.k(Math.max(jC, z0Var.n() + 1));
                            z0[] z0VarArr = hVar.N;
                            int length2 = z0VarArr.length;
                            int i12 = 0;
                            while (i12 < length2) {
                                z0 z0Var2 = z0VarArr[i12];
                                z0Var2.k(Math.max(jC, z0Var2.n() + 1));
                                i12++;
                                i11 = i11;
                            }
                            i10 = i11;
                            c50.h hVar2 = hVar.G;
                            s7.w wVar = new s7.w(1, hVar.A, null, 3, null, i0.W(jC), i0.W(j10));
                            a0 a0Var = (a0) hVar2.C;
                            a0Var.getClass();
                            hVar2.h(new ce.a(hVar2, a0Var, wVar, 11));
                        }
                    }
                }
            }
            i11 = i10 + 1;
        }
        this.T.v(j9);
    }
}
