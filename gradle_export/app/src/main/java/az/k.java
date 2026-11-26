package az;

import a1.s0;
import a1.v2;
import a40.c0;
import ab.a0;
import android.text.Layout;
import androidx.lifecycle.u;
import as.r0;
import b1.e0;
import b1.k0;
import bv.i2;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d0.m1;
import d0.n1;
import d0.q1;
import d0.s2;
import g00.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.x;
import l0.j1;
import l1.e1;
import l1.i1;
import l1.p2;
import l1.y0;
import l1.z0;
import lu.z;
import m3.h0;
import m3.n0;
import m3.s;
import q0.t0;
import su.t;
import x.g0;
import z2.t1;

public final class k implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public k(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    public k(String str, u30.b bVar, u00.a aVar, u00.k kVar) {
        this.A = 5;
        this.C = str;
        this.B = bVar;
        this.D = aVar;
        this.E = kVar;
    }

    public k(ArrayList arrayList, x xVar, List list, int i, k0.p pVar) {
        this.A = 6;
        this.B = arrayList;
        this.C = xVar;
        this.D = list;
        this.E = pVar;
    }

    public k(u00.k kVar, Object obj, z0 z0Var, z0 z0Var2, int i) {
        this.A = i;
        this.E = kVar;
        this.B = obj;
        this.C = z0Var;
        this.D = z0Var2;
    }

    public k(x.b bVar, x.j jVar, u00.k kVar, v vVar) {
        this.A = 16;
        this.B = bVar;
        this.C = jVar;
        this.E = kVar;
        this.D = vVar;
    }

    @Override
    public final Object invoke(Object obj) {
        Object obj2;
        long jLongValue;
        long jB;
        int[] iArr;
        Integer num;
        float fH;
        long j;
        float fH2;
        float fC;
        int i = 18;
        int i2 = 3;
        final int i3 = 0;
        switch (this.A) {
            case 0:
                u30.b bVar = (u30.b) this.B;
                ArrayList arrayList = (ArrayList) this.C;
                q qVar = (q) this.D;
                u00.k kVar = (u00.k) this.E;
                j0.h LazyColumn = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                j0.h.q(LazyColumn, "TITLE_KEY", a.a, 2);
                j0.h.q(LazyColumn, "SUBTITLE_KEY", a.b, 2);
                if (!bVar.isEmpty()) {
                    j0.h.q(LazyColumn, "REASON_CARD_WIDGET_KEY", new v1.c(new j(bVar, qVar, kVar, i3), 823355231, true), 2);
                }
                LazyColumn.r(arrayList.size(), new v2(new s0(18), arrayList, 3), new n(0, arrayList), new v1.c(new o(arrayList, qVar, kVar, i3), 802480018, true));
                return b0.a;
            case 1:
                u00.a aVar = (u00.a) this.B;
                u00.a aVar2 = (u00.a) this.C;
                e0 e0Var = (e0) this.D;
                k0 k0Var = (k0) this.E;
                t0.g gVar = (t0.g) obj;
                aVar.invoke();
                if (aVar2 != null ? ((Boolean) aVar2.invoke()).booleanValue() : true) {
                    gVar.close();
                }
                e0Var.x(k0Var);
                return b0.a;
            case 2:
                w wVar = (w) this.B;
                m1 m1Var = (m1) this.C;
                s2 s2Var = (s2) this.D;
                a1.a aVar3 = (a1.a) this.E;
                x.h hVar = (x.h) obj;
                float fFloatValue = ((Number) hVar.e.getValue()).floatValue() - wVar.A;
                if (n1.a(fFloatValue)) {
                    if (((Boolean) aVar3.invoke(Float.valueOf(wVar.A))).booleanValue()) {
                        hVar.a();
                    }
                } else if (n1.a(fFloatValue - m1Var.e(s2Var, fFloatValue))) {
                    wVar.A += fFloatValue;
                    if (((Boolean) aVar3.invoke(Float.valueOf(wVar.A))).booleanValue()) {
                        hVar.a();
                    }
                } else {
                    hVar.a();
                }
                return b0.a;
            case 3:
                gj.i iVar = (gj.i) this.B;
                String str = (String) this.C;
                String str2 = (String) this.D;
                t5.d dVar = (t5.d) this.E;
                t5.b bVar2 = (t5.b) obj;
                if (((String) a.a.E(bVar2, gj.i.d, "")).equals(str)) {
                    t5.d dVarC = iVar.c(bVar2, str);
                    if (dVarC != null && !dVarC.a.equals(str2)) {
                        synchronized (iVar) {
                            iVar.d(bVar2, str);
                            HashSet hashSet = new HashSet((Collection) a.a.E(bVar2, dVar, new HashSet()));
                            hashSet.add(str);
                            bVar2.f(dVar, hashSet);
                        }
                    }
                    return null;
                }
                t5.d dVar2 = gj.i.c;
                long jLongValue2 = ((Long) a.a.E(bVar2, dVar2, 0L)).longValue();
                if (jLongValue2 + 1 == 30) {
                    synchronized (iVar) {
                        try {
                            long jLongValue3 = ((Long) a.a.E(bVar2, dVar2, 0L)).longValue();
                            String str3 = "";
                            Set hashSet2 = new HashSet();
                            String str4 = null;
                            for (Map.Entry entry : bVar2.a().entrySet()) {
                                if (entry.getValue() instanceof Set) {
                                    Set<String> set = (Set) entry.getValue();
                                    for (String str5 : set) {
                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                            str3 = ((t5.d) entry.getKey()).a;
                                            str4 = str5;
                                            hashSet2 = set;
                                        }
                                    }
                                }
                            }
                            obj2 = null;
                            HashSet hashSet3 = new HashSet(hashSet2);
                            hashSet3.remove(str4);
                            bVar2.f(va.a.i0(str3), hashSet3);
                            jLongValue2 = jLongValue3 - 1;
                            bVar2.e(gj.i.c, Long.valueOf(jLongValue2));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    obj2 = null;
                }
                HashSet hashSet4 = new HashSet((Collection) a.a.E(bVar2, dVar, new HashSet()));
                hashSet4.add(str);
                bVar2.f(dVar, hashSet4);
                bVar2.e(gj.i.c, Long.valueOf(jLongValue2 + 1));
                bVar2.e(gj.i.d, str);
                return obj2;
            case 4:
                uu.a aVar4 = (uu.a) this.B;
                t tVar = (t) this.C;
                e1 e1Var = (e1) this.D;
                z0 z0Var = (z0) this.E;
                float fFloatValue2 = ((Float) obj).floatValue();
                e1Var.i(fFloatValue2);
                if (tVar != null) {
                    long j2 = tVar.a;
                    jLongValue = j2 + ((long) (a0.x(fFloatValue2, 0.0f, 1.0f) * (tVar.b - j2)));
                } else {
                    jLongValue = (long) (((Number) z0Var.getValue()).longValue() * fFloatValue2);
                }
                ((uu.w) aVar4).z(jLongValue);
                return b0.a;
            case 5:
                String str6 = (String) this.C;
                u30.b bVar3 = (u30.b) this.B;
                u00.a aVar5 = (u00.a) this.D;
                u00.k kVar2 = (u00.k) this.E;
                j0.h LazyColumn2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn2, "$this$LazyColumn");
                j0.h.q(LazyColumn2, str6, new v1.c(new ix.n(str6, aVar5, i3), 503643480, true), 2);
                LazyColumn2.r(((h00.b) bVar3).a(), new v2(new ir.b(11), bVar3, 18), new r0(9, bVar3), new v1.c(new o(bVar3, bVar3, kVar2, i2), 2039820996, true));
                return b0.a;
            case 6:
                List list = (List) this.B;
                x xVar = (x) this.C;
                List list2 = (List) this.D;
                k0.p pVar = (k0.p) this.E;
                j1 j1Var = (j1) obj;
                t1 t1Var = j1Var.e;
                int iA = t1Var != null ? t1Var.a() : 0;
                int i4 = 0;
                while (i3 < iA) {
                    if (pVar.q == q1.A) {
                        t1 t1Var2 = j1Var.e;
                        jB = (t1Var2 != null ? t1Var2.b(i3) : 0L) & 4294967295L;
                    } else {
                        t1 t1Var3 = j1Var.e;
                        jB = (t1Var3 != null ? t1Var3.b(i3) : 0L) >> 32;
                    }
                    i4 += (int) jB;
                    i3++;
                }
                if (list != null) {
                    list.add(Integer.valueOf(i4));
                }
                if (xVar.A != list2.size()) {
                    xVar.A++;
                }
                return b0.a;
            case 7:
                kk.a aVar6 = (kk.a) this.B;
                y3.c cVar = (y3.c) this.C;
                z2.a0 a0Var = (z2.a0) this.D;
                u00.k kVar3 = (u00.k) this.E;
                k2.d onDraw = (k2.d) obj;
                kotlin.jvm.internal.m.e(onDraw, "$this$onDraw");
                aVar6.a.b(onDraw, cVar, a0Var, kVar3);
                return b0.a;
            case 8:
                androidx.lifecycle.w wVar2 = (androidx.lifecycle.w) this.B;
                final String str7 = (String) this.C;
                final z zVar = (z) this.D;
                final lu.e0 e0Var2 = (lu.e0) this.E;
                l1.z DisposableEffect = (l1.z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                u uVar = new u() {
                    public final void a(androidx.lifecycle.w wVar3, androidx.lifecycle.o oVar) {
                        androidx.lifecycle.o oVar2;
                        switch (i3) {
                            case 0:
                                String str8 = (String) str7;
                                z zVar2 = (z) zVar;
                                e0 e0Var3 = (e0) e0Var2;
                                if (str8.equals("ambient_sounds")) {
                                    if ((zVar2 != null ? zVar2.h : null) != null) {
                                        int i5 = x.a[oVar.ordinal()];
                                        if (i5 == 1 || i5 == 2) {
                                            e0Var3.k(d.a);
                                            break;
                                        } else if (i5 == 3) {
                                            e0Var3.k(e.a);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 1:
                                r6.c cVar2 = (r6.c) str7;
                                kotlin.jvm.internal.z zVar3 = (kotlin.jvm.internal.z) zVar;
                                u00.k kVar4 = (u00.k) e0Var2;
                                int i6 = r6.b.a[oVar.ordinal()];
                                if (i6 == 1) {
                                    zVar3.A = kVar4.invoke(cVar2);
                                    break;
                                } else if (i6 == 2) {
                                    e.d dVar3 = (e.d) zVar3.A;
                                    if (dVar3 != null) {
                                        dVar3.a();
                                    }
                                    zVar3.A = null;
                                    break;
                                }
                                break;
                            default:
                                z4.m mVar = (z4.m) str7;
                                androidx.lifecycle.p pVar2 = (androidx.lifecycle.p) zVar;
                                z4.n nVar = (z4.n) e0Var2;
                                mVar.getClass();
                                Runnable runnable = mVar.a;
                                CopyOnWriteArrayList copyOnWriteArrayList = mVar.b;
                                androidx.lifecycle.o.Companion.getClass();
                                int iOrdinal = pVar2.ordinal();
                                if (iOrdinal == 2) {
                                    oVar2 = androidx.lifecycle.o.ON_CREATE;
                                } else if (iOrdinal != 3) {
                                    oVar2 = iOrdinal != 4 ? null : androidx.lifecycle.o.ON_RESUME;
                                } else {
                                    oVar2 = androidx.lifecycle.o.ON_START;
                                }
                                if (oVar == oVar2) {
                                    copyOnWriteArrayList.add(nVar);
                                    runnable.run();
                                } else if (oVar == androidx.lifecycle.o.ON_DESTROY) {
                                    mVar.b(nVar);
                                } else if (oVar == androidx.lifecycle.m.a(pVar2)) {
                                    copyOnWriteArrayList.remove(nVar);
                                    runnable.run();
                                }
                                break;
                        }
                    }
                };
                wVar2.getLifecycle().a(uVar);
                return new bt.z0(wVar2, uVar, 7);
            case 9:
                u00.k kVar4 = (u00.k) this.E;
                z0 z0Var2 = (z0) this.B;
                z0 z0Var3 = (z0) this.C;
                z0 z0Var4 = (z0) this.D;
                r3.w tf = (r3.w) obj;
                kotlin.jvm.internal.m.e(tf, "tf");
                String str8 = (String) z0Var2.getValue();
                StringBuilder sb = new StringBuilder();
                int length = str8.length();
                for (int i5 = 0; i5 < length; i5++) {
                    char cCharAt = str8.charAt(i5);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                String string = sb.toString();
                String str9 = tf.a.B;
                StringBuilder sb2 = new StringBuilder();
                int length2 = str9.length();
                for (int i6 = 0; i6 < length2; i6++) {
                    char cCharAt2 = str9.charAt(i6);
                    if (Character.isDigit(cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                }
                String string2 = sb2.toString();
                z0Var2.setValue(string2);
                if (((Boolean) z0Var3.getValue()).booleanValue()) {
                    if (string2.length() == string.length() + 1 && r30.r.x0(string2, string, false)) {
                        Character chValueOf = string2.length() == 0 ? null : Character.valueOf(string2.charAt(string2.length() - 1));
                        if (chValueOf != null) {
                            int iDigit = Character.digit((int) chValueOf.charValue(), 10);
                            Integer numValueOf = Integer.valueOf(iDigit);
                            if (iDigit >= 0) {
                                num = numValueOf;
                            } else {
                                num = null;
                            }
                        } else {
                            num = null;
                        }
                        iArr = num == null ? (int[]) z0Var4.getValue() : new int[]{((int[]) z0Var4.getValue())[1], ((int[]) z0Var4.getValue())[2], ((int[]) z0Var4.getValue())[3], num.intValue()};
                    } else {
                        iArr = new int[]{0, 0, 0, 0};
                        StringBuilder sb3 = new StringBuilder();
                        int length3 = string2.length();
                        for (int i7 = 0; i7 < length3; i7++) {
                            char cCharAt3 = string2.charAt(i7);
                            if (Character.isDigit(cCharAt3)) {
                                sb3.append(cCharAt3);
                            }
                        }
                        String string3 = sb3.toString();
                        for (int i8 = 0; i8 < string3.length(); i8++) {
                            int iDigit2 = Character.digit((int) string3.charAt(i8), 10);
                            Integer numValueOf2 = Integer.valueOf(iDigit2);
                            if (iDigit2 < 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                iArr = new int[]{iArr[1], iArr[2], iArr[3], numValueOf2.intValue()};
                            }
                        }
                    }
                    z0Var4.setValue(iArr);
                    kVar4.invoke(Integer.valueOf(mu.d.D((int[]) z0Var4.getValue())));
                }
                return b0.a;
            case 10:
                Set set2 = (Set) this.B;
                Object obj3 = this.C;
                Set set3 = (Set) this.D;
                z0 z0Var5 = (z0) this.E;
                set2.add(obj3);
                return new p9.b(set2, obj3, set3, z0Var5);
            case 11:
                u30.b bVar4 = (u30.b) this.B;
                ArrayList arrayList2 = (ArrayList) this.C;
                pz.j jVar = (pz.j) this.D;
                u00.k kVar5 = (u00.k) this.E;
                j0.h LazyColumn3 = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn3, "$this$LazyColumn");
                j0.h.q(LazyColumn3, "TITLE_KEY", pz.n.a, 2);
                j0.h.q(LazyColumn3, "SUBTITLE_KEY", pz.n.b, 2);
                if (!bVar4.isEmpty()) {
                    j0.h.q(LazyColumn3, "REASON_CARD_WIDGET_KEY", new v1.c(new j(bVar4, jVar, kVar5, i), 1983547105, true), 2);
                }
                LazyColumn3.r(arrayList2.size(), new v2(new pp.d(true ? 1 : 0), arrayList2, 29), new n(2, arrayList2), new v1.c(new o(arrayList2, jVar, kVar5, 6), 802480018, true));
                return b0.a;
            case 12:
                q0.j1 j1Var2 = (q0.j1) this.B;
                r3.x xVar2 = (r3.x) this.C;
                r3.w wVar3 = (r3.w) this.D;
                r3.j jVar2 = (r3.j) this.E;
                if (j1Var2.b()) {
                    q3.e0 e0Var3 = j1Var2.d;
                    q0.r0 r0Var = j1Var2.v;
                    q0.r0 r0Var2 = j1Var2.w;
                    kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                    q0.t1 t1Var4 = new q0.t1(e0Var3, r0Var, zVar2, 0);
                    r3.r rVar = xVar2.a;
                    rVar.e(wVar3, jVar2, t1Var4, r0Var2);
                    r3.b0 b0Var = new r3.b0(xVar2, rVar);
                    xVar2.b.set(b0Var);
                    zVar2.A = b0Var;
                    j1Var2.e = b0Var;
                }
                return new t0();
            case 13:
                y3.c cVar2 = (y3.c) this.B;
                z0 z0Var6 = (z0) this.C;
                z0 z0Var7 = (z0) this.D;
                e1 e1Var2 = (e1) this.E;
                n0 result = (n0) obj;
                kotlin.jvm.internal.m.e(result, "result");
                m3.q qVar2 = result.b;
                if (!qVar2.c) {
                    qVar2.m(0);
                    ArrayList arrayList3 = qVar2.h;
                    Layout layout = ((s) arrayList3.get(h0.e(0, arrayList3))).a.d.f;
                    ThreadLocal threadLocal = n3.j.a;
                    if (layout.getEllipsisCount(0) > 0) {
                        if (((Boolean) z0Var6.getValue()).booleanValue()) {
                            ((u00.k) z0Var7.getValue()).invoke(new y3.f(cVar2.k0((float) Math.ceil(qVar2.a.l()))));
                        } else {
                            fH = e1Var2.h();
                            j = rl.d.o;
                            if (fH > y3.o.c(j)) {
                                fH2 = e1Var2.h() - y3.o.c(rl.d.p);
                                fC = y3.o.c(j);
                                if (fH2 < fC) {
                                    fH2 = fC;
                                }
                                e1Var2.i(fH2);
                            }
                        }
                    }
                } else if (((Boolean) z0Var6.getValue()).booleanValue()) {
                    ((u00.k) z0Var7.getValue()).invoke(new y3.f(cVar2.k0((float) Math.ceil(qVar2.a.l()))));
                } else {
                    fH = e1Var2.h();
                    j = rl.d.o;
                    if (fH > y3.o.c(j)) {
                        fH2 = e1Var2.h() - y3.o.c(rl.d.p);
                        fC = y3.o.c(j);
                        if (fH2 < fC) {
                            fH2 = fC;
                        }
                        e1Var2.i(fH2);
                    }
                }
                return b0.a;
            case 14:
                u00.k kVar6 = (u00.k) this.E;
                u00.a aVar7 = (u00.a) this.B;
                z0 z0Var8 = (z0) this.C;
                e1 e1Var3 = (e1) this.D;
                tm.e DampedDragAnimation = (tm.e) obj;
                kotlin.jvm.internal.m.e(DampedDragAnimation, "$this$DampedDragAnimation");
                if (((Boolean) z0Var8.getValue()).booleanValue()) {
                    e1Var3.i(DampedDragAnimation.d() >= 0.5f ? 1.0f : 0.0f);
                    kVar6.invoke(Boolean.valueOf(e1Var3.h() == 1.0f));
                    z0Var8.setValue(Boolean.FALSE);
                } else {
                    e1Var3.i(((Boolean) aVar7.invoke()).booleanValue() ? 0.0f : 1.0f);
                    kVar6.invoke(Boolean.valueOf(e1Var3.h() == 1.0f));
                }
                return b0.a;
            case 15:
                a40.z zVar3 = (a40.z) this.B;
                z0 z0Var9 = (z0) this.C;
                z0 z0Var10 = (z0) this.D;
                y0 y0Var = (y0) this.E;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (zBooleanValue != ((Boolean) z0Var9.getValue()).booleanValue()) {
                    ((u00.a) z0Var10.getValue()).invoke();
                }
                c0.y(zVar3, null, null, new i2(zBooleanValue, z0Var9, y0Var, (k00.c) null, 8), 3);
                return b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                x.b bVar5 = (x.b) this.B;
                x.j jVar3 = (x.j) this.C;
                u00.k kVar7 = (u00.k) this.E;
                v vVar = (v) this.D;
                x.h hVar2 = (x.h) obj;
                x.c.x(hVar2, bVar5.c);
                i1 i1Var = hVar2.e;
                Object objA = x.b.a(bVar5, i1Var.getValue());
                if (!kotlin.jvm.internal.m.a(objA, i1Var.getValue())) {
                    bVar5.c.B.setValue(objA);
                    jVar3.B.setValue(objA);
                    if (kVar7 != null) {
                        kVar7.invoke(bVar5);
                    }
                    hVar2.a();
                    vVar.A = true;
                } else if (kVar7 != null) {
                    kVar7.invoke(bVar5);
                }
                return b0.a;
            default:
                z0 z0Var11 = (z0) this.B;
                g0 g0Var = (g0) this.C;
                w wVar4 = (w) this.D;
                a40.z zVar4 = (a40.z) this.E;
                long jLongValue4 = ((Long) obj).longValue();
                p2 p2Var = (p2) z0Var11.getValue();
                long jLongValue5 = p2Var != null ? ((Number) p2Var.getValue()).longValue() : jLongValue4;
                long j3 = g0Var.c;
                m1.e eVar = g0Var.a;
                if (j3 == Long.MIN_VALUE || wVar4.A != x.c.q(zVar4.A())) {
                    g0Var.c = jLongValue4;
                    Object[] objArr = eVar.A;
                    int i9 = eVar.C;
                    for (int i11 = 0; i11 < i9; i11++) {
                        ((x.e0) objArr[i11]).F = true;
                    }
                    wVar4.A = x.c.q(zVar4.A());
                }
                float f = wVar4.A;
                if (f == 0.0f) {
                    Object[] objArr2 = eVar.A;
                    int i12 = eVar.C;
                    while (i3 < i12) {
                        x.e0 e0Var4 = (x.e0) objArr2[i3];
                        e0Var4.C.setValue(e0Var4.D.c);
                        e0Var4.F = true;
                        i3++;
                    }
                } else {
                    long j4 = (long) ((jLongValue5 - g0Var.c) / f);
                    Object[] objArr3 = eVar.A;
                    int i13 = eVar.C;
                    boolean z = true;
                    for (int i14 = 0; i14 < i13; i14++) {
                        x.e0 e0Var5 = (x.e0) objArr3[i14];
                        if (!e0Var5.E) {
                            e0Var5.H.b.setValue(Boolean.FALSE);
                            if (e0Var5.F) {
                                e0Var5.F = false;
                                e0Var5.G = j4;
                            }
                            long j5 = j4 - e0Var5.G;
                            e0Var5.C.setValue(e0Var5.D.f(j5));
                            e0Var5.E = e0Var5.D.e(j5);
                        }
                        if (!e0Var5.E) {
                            z = false;
                        }
                    }
                    g0Var.d.setValue(Boolean.valueOf(!z));
                }
                return b0.a;
        }
    }
}
