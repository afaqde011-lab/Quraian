package mu;

import a1.v2;
import android.database.ContentObserver;
import android.database.SQLException;
import android.graphics.Typeface;
import android.provider.Settings;
import androidx.lifecycle.e1;
import bt.z0;
import com.google.android.gms.internal.measurement.g4;
import com.google.android.gms.internal.measurement.z3;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import java.util.ArrayList;
import java.util.List;
import k9.x0;
import l1.f1;
import l1.i1;
import m3.c0;
import m3.i0;
import m3.n0;
import m3.o0;
import q0.g2;
import q0.j1;
import q0.k1;
import q0.l1;
import q0.o1;
import q3.d0;
import q3.e0;
import q3.f0;
import q3.g0;
import q3.h0;
import qd.s0;
import ur.r1;
import x.m1;
import x.n1;
import x.y0;

public final class q implements u00.k {
    public final int A;
    public final Object B;
    public final Object C;

    public q(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    public q(Object obj, u00.k kVar, int i) {
        this.A = i;
        this.C = obj;
        this.B = kVar;
    }

    public q(g2 g2Var, m3.f fVar, k1 k1Var) {
        this.A = 8;
        this.B = fVar;
        this.C = k1Var;
    }

    @Override
    public final Object invoke(Object obj) {
        o0 o0VarB;
        o0 o0VarB2;
        o0 o0VarB3;
        n0 n0Var;
        i2.g gVarJ;
        g00.k kVar;
        f0 f0Var;
        Object objInvoke;
        Object objInvoke2;
        ArrayList arrayList;
        int size;
        int i;
        q3.u uVar;
        int size2;
        q3.u uVar2;
        q3.u uVar3;
        int i2;
        int size3;
        int i3;
        Object obj2;
        q3.u uVar4;
        int i4;
        Object obj3;
        int size4;
        int i5;
        Object obj4;
        int size5;
        int i6;
        Object obj5;
        Typeface typefaceF;
        g0 g0Var;
        androidx.lifecycle.q lifecycle;
        e1 e1Var;
        switch (this.A) {
            case 0:
                u00.k kVar2 = (u00.k) this.B;
                ju.h hVar = (ju.h) this.C;
                ((Boolean) obj).booleanValue();
                kVar2.invoke(Integer.valueOf(hVar.a));
                return b0.a;
            case 1:
                ArrayList arrayList2 = (ArrayList) this.C;
                u00.k kVar3 = (u00.k) this.B;
                j0.h LazyRow = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyRow, "$this$LazyRow");
                LazyRow.r(arrayList2.size(), new v2(new c0(7), arrayList2, 24), new az.n(1, arrayList2), new v1.c(new iw.e(arrayList2, kVar3, 1), 802480018, true));
                return b0.a;
            case 2:
                final nz.m mVar = (nz.m) this.C;
                final u00.k kVar4 = (u00.k) this.B;
                j0.h LazyColumn = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn, "$this$LazyColumn");
                j0.h.q(LazyColumn, (Object) null, nz.a.b, 3);
                final int i7 = 0;
                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i8 = i7;
                        j0.b item = (j0.b) obj6;
                        l1.g0 g0Var2 = (l1.j) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i8) {
                            case 0:
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                l1.g0 g0Var3 = g0Var2;
                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String strU = z3.U(g0Var2, 2131886369);
                                    m mVar2 = mVar;
                                    String str = mVar2.g;
                                    if (str == null) {
                                        str = "00:00";
                                    }
                                    String str2 = str;
                                    boolean z = mVar2.e;
                                    u00.k kVar5 = kVar4;
                                    boolean zG = g0Var3.g(kVar5);
                                    Object objN = g0Var3.N();
                                    Object obj9 = l1.i.a;
                                    if (zG || objN == obj9) {
                                        objN = new lp.k(8, kVar5);
                                        g0Var3.n0(objN);
                                    }
                                    u00.k kVar6 = (u00.k) objN;
                                    boolean zG2 = g0Var3.g(kVar5);
                                    Object objN2 = g0Var3.N();
                                    if (zG2 || objN2 == obj9) {
                                        objN2 = new k(1, kVar5);
                                        g0Var3.n0(objN2);
                                    }
                                    g4.i(strU, "", str2, z, kVar6, (u00.a) objN2, g0Var2, 0);
                                } else {
                                    g0Var3.V();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                l1.g0 g0Var4 = g0Var2;
                                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String strU2 = z3.U(g0Var2, 2131887355);
                                    m mVar3 = mVar;
                                    String str3 = mVar3.h;
                                    if (str3 == null) {
                                        str3 = "00:00";
                                    }
                                    String strT = z3.T(2131887354, new Object[]{str3}, g0Var2);
                                    String str4 = mVar3.h;
                                    if (str4 == null) {
                                        str4 = "00:00";
                                    }
                                    boolean z2 = mVar3.f;
                                    u00.k kVar7 = kVar4;
                                    boolean zG3 = g0Var4.g(kVar7);
                                    Object objN3 = g0Var4.N();
                                    Object obj10 = l1.i.a;
                                    if (zG3 || objN3 == obj10) {
                                        objN3 = new lp.k(7, kVar7);
                                        g0Var4.n0(objN3);
                                    }
                                    u00.k kVar8 = (u00.k) objN3;
                                    boolean zG4 = g0Var4.g(kVar7);
                                    Object objN4 = g0Var4.N();
                                    if (zG4 || objN4 == obj10) {
                                        objN4 = new k(0, kVar7);
                                        g0Var4.n0(objN4);
                                    }
                                    g4.i(strU2, strT, str4, z2, kVar8, (u00.a) objN4, g0Var2, 0);
                                } else {
                                    g0Var4.V();
                                }
                                break;
                        }
                        return b0.a;
                    }
                }, 1206223775, true), 3);
                final int i8 = 1;
                j0.h.q(LazyColumn, (Object) null, new v1.c(new u00.o() {
                    @Override
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i9 = i8;
                        j0.b item = (j0.b) obj6;
                        l1.g0 g0Var2 = (l1.j) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i9) {
                            case 0:
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                l1.g0 g0Var3 = g0Var2;
                                if (g0Var3.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String strU = z3.U(g0Var2, 2131886369);
                                    m mVar2 = mVar;
                                    String str = mVar2.g;
                                    if (str == null) {
                                        str = "00:00";
                                    }
                                    String str2 = str;
                                    boolean z = mVar2.e;
                                    u00.k kVar5 = kVar4;
                                    boolean zG = g0Var3.g(kVar5);
                                    Object objN = g0Var3.N();
                                    Object obj9 = l1.i.a;
                                    if (zG || objN == obj9) {
                                        objN = new lp.k(8, kVar5);
                                        g0Var3.n0(objN);
                                    }
                                    u00.k kVar6 = (u00.k) objN;
                                    boolean zG2 = g0Var3.g(kVar5);
                                    Object objN2 = g0Var3.N();
                                    if (zG2 || objN2 == obj9) {
                                        objN2 = new k(1, kVar5);
                                        g0Var3.n0(objN2);
                                    }
                                    g4.i(strU, "", str2, z, kVar6, (u00.a) objN2, g0Var2, 0);
                                } else {
                                    g0Var3.V();
                                }
                                break;
                            default:
                                kotlin.jvm.internal.m.e(item, "$this$item");
                                l1.g0 g0Var4 = g0Var2;
                                if (g0Var4.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    String strU2 = z3.U(g0Var2, 2131887355);
                                    m mVar3 = mVar;
                                    String str3 = mVar3.h;
                                    if (str3 == null) {
                                        str3 = "00:00";
                                    }
                                    String strT = z3.T(2131887354, new Object[]{str3}, g0Var2);
                                    String str4 = mVar3.h;
                                    if (str4 == null) {
                                        str4 = "00:00";
                                    }
                                    boolean z2 = mVar3.f;
                                    u00.k kVar7 = kVar4;
                                    boolean zG3 = g0Var4.g(kVar7);
                                    Object objN3 = g0Var4.N();
                                    Object obj10 = l1.i.a;
                                    if (zG3 || objN3 == obj10) {
                                        objN3 = new lp.k(7, kVar7);
                                        g0Var4.n0(objN3);
                                    }
                                    u00.k kVar8 = (u00.k) objN3;
                                    boolean zG4 = g0Var4.g(kVar7);
                                    Object objN4 = g0Var4.N();
                                    if (zG4 || objN4 == obj10) {
                                        objN4 = new k(0, kVar7);
                                        g0Var4.n0(objN4);
                                    }
                                    g4.i(strU2, strT, str4, z2, kVar8, (u00.a) objN4, g0Var2, 0);
                                } else {
                                    g0Var4.V();
                                }
                                break;
                        }
                        return b0.a;
                    }
                }, -1616464928, true), 3);
                return b0.a;
            case 3:
                q0.o oVar = (q0.o) this.B;
                ContentObserver contentObserver = (q0.p) this.C;
                oVar.a.registerContentObserver(Settings.System.getUriFor("show_password"), false, contentObserver);
                return new z0(oVar, contentObserver, 8);
            case 4:
                r3.w wVar = (r3.w) this.C;
                u00.k kVar5 = (u00.k) this.B;
                r3.w wVar2 = (r3.w) obj;
                if (!kotlin.jvm.internal.m.a(wVar, wVar2)) {
                    kVar5.invoke(wVar2);
                }
                return b0.a;
            case 5:
                j1 j1Var = (j1) this.B;
                i2.q qVar = (i2.q) this.C;
                b3.o0 o0Var = (b3.o0) obj;
                o0Var.a();
                if (((Boolean) j1Var.s.getValue()).booleanValue() || ((Boolean) j1Var.t.getValue()).booleanValue()) {
                    k2.d.m0(o0Var, qVar, 0L, 0L, 0.0f, (k2.e) null, 0, 126);
                }
                return b0.a;
            case 6:
                z2.k1 k1Var = (z2.k1) obj;
                ArrayList arrayListQ = q0.q.q((List) this.B, ((l1) this.C).a);
                if (arrayListQ != null) {
                    int size6 = arrayListQ.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        g00.k kVar6 = (g00.k) arrayListQ.get(i9);
                        z2.l1 l1Var = (z2.l1) kVar6.A;
                        u00.a aVar = (u00.a) kVar6.B;
                        z2.k1.j(k1Var, l1Var, aVar != null ? ((y3.j) aVar.invoke()).a : 0L);
                    }
                }
                return b0.a;
            case 7:
                return new z0((l1.z0) this.B, (f0.i) this.C, 9);
            case 8:
                m3.f fVar = (m3.f) this.B;
                f1 f1Var = ((k1) this.C).b;
                o1 o1Var = (o1) obj;
                m3.o oVar2 = (m3.o) fVar.a;
                o0 o0VarB4 = oVar2.b();
                i0 i0VarC = null;
                i0 i0Var = o0VarB4 != null ? o0VarB4.a : null;
                i0 i0VarC2 = ((f1Var.h() & 1) == 0 || (o0VarB3 = oVar2.b()) == null) ? null : o0VarB3.b;
                if (i0Var != null) {
                    i0VarC2 = i0Var.c(i0VarC2);
                }
                i0 i0VarC3 = ((f1Var.h() & 2) == 0 || (o0VarB2 = oVar2.b()) == null) ? null : o0VarB2.c;
                if (i0VarC2 != null) {
                    i0VarC3 = i0VarC2.c(i0VarC3);
                }
                if ((f1Var.h() & 4) != 0 && (o0VarB = oVar2.b()) != null) {
                    i0VarC = o0VarB.d;
                }
                if (i0VarC3 != null) {
                    i0VarC = i0VarC3.c(i0VarC);
                }
                o1Var.b = o1Var.a.b(new b1.l(new kotlin.jvm.internal.v(), fVar, i0VarC, 29));
                return b0.a;
            case 9:
                g2 g2Var = (g2) this.B;
                m3.f fVar2 = (m3.f) this.C;
                i2.c0 c0Var = (i2.c0) obj;
                m3.h hVar2 = g2Var.b;
                i1 i1Var = g2Var.a;
                n0 n0Var2 = (n0) i1Var.getValue();
                if (kotlin.jvm.internal.m.a(hVar2, n0Var2 != null ? n0Var2.a.a : null) && (n0Var = (n0) i1Var.getValue()) != null) {
                    m3.q qVar2 = n0Var.b;
                    m3.f fVarC = g2.c(fVar2, n0Var);
                    if (fVarC == null) {
                        gVarJ = null;
                    } else {
                        int i11 = fVarC.c;
                        int i12 = fVarC.b;
                        gVarJ = n0Var.j(i12, i11);
                        h2.c cVarB = n0Var.b(i12);
                        int i13 = i11 - 1;
                        gVarJ.k(((((long) Float.floatToRawIntBits(cVarB.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(qVar2.d(i12) == qVar2.d(i13) ? Math.min(n0Var.b(i13).a, cVarB.a) : 0.0f)) << 32)) ^ (-9223372034707292160L));
                    }
                } else {
                    gVarJ = null;
                }
                jk.k kVar7 = gVarJ != null ? new jk.k(gVarJ, 1) : null;
                if (kVar7 != null) {
                    c0Var.z0(kVar7);
                    c0Var.L0(true);
                }
                return b0.a;
            case 10:
                List list = (List) this.B;
                List list2 = (List) this.C;
                z2.k1 k1Var2 = (z2.k1) obj;
                if (list != null) {
                    int size7 = list.size();
                    for (int i14 = 0; i14 < size7; i14++) {
                        g00.k kVar8 = (g00.k) list.get(i14);
                        z2.k1.j(k1Var2, (z2.l1) kVar8.A, ((y3.j) kVar8.B).a);
                    }
                }
                if (list2 != null) {
                    int size8 = list2.size();
                    for (int i15 = 0; i15 < size8; i15++) {
                        g00.k kVar9 = (g00.k) list2.get(i15);
                        z2.l1 l1Var2 = (z2.l1) kVar9.A;
                        u00.a aVar2 = (u00.a) kVar9.B;
                        z2.k1.j(k1Var2, l1Var2, aVar2 != null ? ((y3.j) aVar2.invoke()).a : 0L);
                    }
                }
                return b0.a;
            case 11:
                q3.j jVar = (q3.j) this.B;
                d0 d0Var = (d0) this.C;
                u00.k kVar10 = (u00.k) obj;
                q3.n nVar = jVar.d;
                dh.o oVar3 = jVar.a;
                q0.a aVar3 = jVar.f;
                nVar.getClass();
                q3.l lVar = d0Var.a;
                if (lVar instanceof q3.l) {
                    List list3 = lVar.F;
                    q3.u uVar5 = d0Var.b;
                    int i16 = d0Var.c;
                    ArrayList arrayList3 = new ArrayList(list3.size());
                    int size9 = list3.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        Object obj6 = list3.get(i17);
                        q3.a0 a0Var = (q3.a0) obj6;
                        if (kotlin.jvm.internal.m.a(a0Var.b, uVar5) && a0Var.c == i16) {
                            arrayList3.add(obj6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        ArrayList arrayList4 = new ArrayList(list3.size());
                        int size10 = list3.size();
                        for (int i18 = 0; i18 < size10; i18++) {
                            Object obj7 = list3.get(i18);
                            if (((q3.a0) obj7).c == i16) {
                                arrayList4.add(obj7);
                            }
                        }
                        if (!arrayList4.isEmpty()) {
                            list3 = arrayList4;
                        }
                        int iA = uVar5.a(q3.u.B);
                        int i19 = uVar5.A;
                        if (iA < 0) {
                            int size11 = list3.size();
                            q3.u uVar6 = null;
                            q3.u uVar7 = null;
                            for (int i21 = 0; i21 < size11; i21++) {
                                q3.u uVar8 = ((q3.a0) list3.get(i21)).b;
                                int i22 = uVar8.A;
                                if (kotlin.jvm.internal.m.f(i22, i19) < 0) {
                                    if (uVar6 == null || kotlin.jvm.internal.m.f(i22, uVar6.A) > 0) {
                                        uVar6 = uVar8;
                                    }
                                } else if (kotlin.jvm.internal.m.f(i22, i19) <= 0) {
                                    uVar6 = uVar8;
                                    uVar7 = uVar6;
                                    if (uVar6 == null) {
                                        uVar6 = uVar7;
                                    }
                                    arrayList3 = new ArrayList(list3.size());
                                    size5 = list3.size();
                                    for (i6 = 0; i6 < size5; i6++) {
                                        obj5 = list3.get(i6);
                                        if (kotlin.jvm.internal.m.a(((q3.a0) obj5).b, uVar6)) {
                                            arrayList3.add(obj5);
                                        }
                                    }
                                } else if (uVar7 == null || kotlin.jvm.internal.m.f(i22, uVar7.A) < 0) {
                                    uVar7 = uVar8;
                                }
                            }
                            if (uVar6 == null) {
                                uVar6 = uVar7;
                            }
                            arrayList3 = new ArrayList(list3.size());
                            size5 = list3.size();
                            while (i6 < size5) {
                                obj5 = list3.get(i6);
                                if (kotlin.jvm.internal.m.a(((q3.a0) obj5).b, uVar6)) {
                                    arrayList3.add(obj5);
                                }
                            }
                        } else {
                            q3.u uVar9 = q3.u.C;
                            if (uVar5.a(uVar9) > 0) {
                                int size12 = list3.size();
                                q3.u uVar10 = null;
                                q3.u uVar11 = null;
                                for (int i23 = 0; i23 < size12; i23++) {
                                    q3.u uVar12 = ((q3.a0) list3.get(i23)).b;
                                    int i24 = uVar12.A;
                                    if (kotlin.jvm.internal.m.f(i24, i19) < 0) {
                                        if (uVar10 == null || kotlin.jvm.internal.m.f(i24, uVar10.A) > 0) {
                                            uVar10 = uVar12;
                                        }
                                    } else if (kotlin.jvm.internal.m.f(i24, i19) <= 0) {
                                        uVar10 = uVar12;
                                        uVar11 = uVar10;
                                        if (uVar11 != null) {
                                            uVar10 = uVar11;
                                        }
                                        arrayList3 = new ArrayList(list3.size());
                                        size4 = list3.size();
                                        for (i5 = 0; i5 < size4; i5++) {
                                            obj4 = list3.get(i5);
                                            if (kotlin.jvm.internal.m.a(((q3.a0) obj4).b, uVar10)) {
                                                arrayList3.add(obj4);
                                            }
                                        }
                                    } else if (uVar11 == null || kotlin.jvm.internal.m.f(i24, uVar11.A) < 0) {
                                        uVar11 = uVar12;
                                    }
                                }
                                if (uVar11 != null) {
                                    uVar10 = uVar11;
                                }
                                arrayList3 = new ArrayList(list3.size());
                                size4 = list3.size();
                                while (i5 < size4) {
                                    obj4 = list3.get(i5);
                                    if (kotlin.jvm.internal.m.a(((q3.a0) obj4).b, uVar10)) {
                                        arrayList3.add(obj4);
                                    }
                                }
                            } else {
                                int size13 = list3.size();
                                q3.u uVar13 = null;
                                q3.u uVar14 = null;
                                for (int i25 = 0; i25 < size13; i25++) {
                                    q3.u uVar15 = ((q3.a0) list3.get(i25)).b;
                                    if (kotlin.jvm.internal.m.f(uVar15.A, uVar9.A) <= 0) {
                                        int i26 = uVar15.A;
                                        if (kotlin.jvm.internal.m.f(i26, i19) < 0) {
                                            if (uVar13 == null || kotlin.jvm.internal.m.f(i26, uVar13.A) > 0) {
                                                uVar13 = uVar15;
                                            }
                                        } else if (kotlin.jvm.internal.m.f(i26, i19) <= 0) {
                                            uVar13 = uVar15;
                                            uVar14 = uVar13;
                                            if (uVar14 != null) {
                                                uVar13 = uVar14;
                                            }
                                            arrayList = new ArrayList(list3.size());
                                            size = list3.size();
                                            for (i = 0; i < size; i++) {
                                                obj3 = list3.get(i);
                                                if (kotlin.jvm.internal.m.a(((q3.a0) obj3).b, uVar13)) {
                                                    arrayList.add(obj3);
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                uVar = q3.u.C;
                                                size2 = list3.size();
                                                uVar2 = null;
                                                uVar3 = null;
                                                for (i2 = 0; i2 < size2; i2++) {
                                                    uVar4 = ((q3.a0) list3.get(i2)).b;
                                                    if (uVar != null || kotlin.jvm.internal.m.f(uVar4.A, uVar.A) >= 0) {
                                                        i4 = uVar4.A;
                                                        if (kotlin.jvm.internal.m.f(i4, i19) < 0) {
                                                            if (uVar2 != null || kotlin.jvm.internal.m.f(i4, uVar2.A) > 0) {
                                                                uVar2 = uVar4;
                                                            }
                                                        } else if (kotlin.jvm.internal.m.f(i4, i19) <= 0) {
                                                            uVar2 = uVar4;
                                                            uVar3 = uVar2;
                                                            if (uVar3 != null) {
                                                                uVar2 = uVar3;
                                                            }
                                                            arrayList3 = new ArrayList(list3.size());
                                                            size3 = list3.size();
                                                            for (i3 = 0; i3 < size3; i3++) {
                                                                obj2 = list3.get(i3);
                                                                if (kotlin.jvm.internal.m.a(((q3.a0) obj2).b, uVar2)) {
                                                                    arrayList3.add(obj2);
                                                                }
                                                            }
                                                        } else if (uVar3 != null || kotlin.jvm.internal.m.f(i4, uVar3.A) < 0) {
                                                            uVar3 = uVar4;
                                                        }
                                                    }
                                                }
                                                if (uVar3 != null) {
                                                    uVar2 = uVar3;
                                                }
                                                arrayList3 = new ArrayList(list3.size());
                                                size3 = list3.size();
                                                while (i3 < size3) {
                                                    obj2 = list3.get(i3);
                                                    if (kotlin.jvm.internal.m.a(((q3.a0) obj2).b, uVar2)) {
                                                        arrayList3.add(obj2);
                                                    }
                                                }
                                            } else {
                                                arrayList3 = arrayList;
                                            }
                                        } else if (uVar14 == null || kotlin.jvm.internal.m.f(i26, uVar14.A) < 0) {
                                            uVar14 = uVar15;
                                        }
                                    }
                                }
                                if (uVar14 != null) {
                                    uVar13 = uVar14;
                                }
                                arrayList = new ArrayList(list3.size());
                                size = list3.size();
                                while (i < size) {
                                    obj3 = list3.get(i);
                                    if (kotlin.jvm.internal.m.a(((q3.a0) obj3).b, uVar13)) {
                                        arrayList.add(obj3);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    uVar = q3.u.C;
                                    size2 = list3.size();
                                    uVar2 = null;
                                    uVar3 = null;
                                    while (i2 < size2) {
                                        uVar4 = ((q3.a0) list3.get(i2)).b;
                                        if (uVar != null) {
                                            i4 = uVar4.A;
                                            if (kotlin.jvm.internal.m.f(i4, i19) < 0) {
                                                if (uVar2 != null) {
                                                    uVar2 = uVar4;
                                                } else {
                                                    uVar2 = uVar4;
                                                }
                                            } else if (kotlin.jvm.internal.m.f(i4, i19) <= 0) {
                                                uVar2 = uVar4;
                                                uVar3 = uVar2;
                                                if (uVar3 != null) {
                                                    uVar2 = uVar3;
                                                }
                                                arrayList3 = new ArrayList(list3.size());
                                                size3 = list3.size();
                                                while (i3 < size3) {
                                                    obj2 = list3.get(i3);
                                                    if (kotlin.jvm.internal.m.a(((q3.a0) obj2).b, uVar2)) {
                                                        arrayList3.add(obj2);
                                                    }
                                                }
                                            } else if (uVar3 != null) {
                                                uVar3 = uVar4;
                                            } else {
                                                uVar3 = uVar4;
                                            }
                                        } else {
                                            i4 = uVar4.A;
                                            if (kotlin.jvm.internal.m.f(i4, i19) < 0) {
                                                if (uVar2 != null) {
                                                    uVar2 = uVar4;
                                                } else {
                                                    uVar2 = uVar4;
                                                }
                                            } else if (kotlin.jvm.internal.m.f(i4, i19) <= 0) {
                                                uVar2 = uVar4;
                                                uVar3 = uVar2;
                                                if (uVar3 != null) {
                                                    uVar2 = uVar3;
                                                }
                                                arrayList3 = new ArrayList(list3.size());
                                                size3 = list3.size();
                                                while (i3 < size3) {
                                                    obj2 = list3.get(i3);
                                                    if (kotlin.jvm.internal.m.a(((q3.a0) obj2).b, uVar2)) {
                                                        arrayList3.add(obj2);
                                                    }
                                                }
                                            } else if (uVar3 != null) {
                                                uVar3 = uVar4;
                                            } else {
                                                uVar3 = uVar4;
                                            }
                                        }
                                    }
                                    if (uVar3 != null) {
                                        uVar2 = uVar3;
                                    }
                                    arrayList3 = new ArrayList(list3.size());
                                    size3 = list3.size();
                                    while (i3 < size3) {
                                        obj2 = list3.get(i3);
                                        if (kotlin.jvm.internal.m.a(((q3.a0) obj2).b, uVar2)) {
                                            arrayList3.add(obj2);
                                        }
                                    }
                                } else {
                                    arrayList3 = arrayList;
                                }
                            }
                        }
                    }
                    x0 x0Var = nVar.a;
                    if (arrayList3.size() > 0) {
                        q3.a0 a0Var2 = (q3.a0) arrayList3.get(0);
                        a0Var2.getClass();
                        synchronized (((tf.y) x0Var.D)) {
                            try {
                                oVar3.getClass();
                                q3.e eVar = new q3.e(a0Var2);
                                q3.d dVar = (q3.d) ((u.s) x0Var.B).c(eVar);
                                if (dVar == null) {
                                    dVar = (q3.d) ((u.i0) x0Var.C).g(eVar);
                                }
                                if (dVar != null) {
                                    objInvoke2 = dVar.a;
                                } else {
                                    try {
                                        objInvoke = oVar3.h(a0Var2);
                                    } catch (Exception unused) {
                                        objInvoke = aVar3.invoke(d0Var);
                                    }
                                    x0Var.getClass();
                                    oVar3.getClass();
                                    q3.e eVar2 = new q3.e(a0Var2);
                                    synchronized (((tf.y) x0Var.D)) {
                                        try {
                                            if (objInvoke == null) {
                                                ((u.i0) x0Var.C).m(eVar2, new q3.d((Object) null));
                                            } else {
                                                ((u.s) x0Var.B).d(eVar2, new q3.d(objInvoke));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    objInvoke2 = objInvoke;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        if (objInvoke2 == null) {
                            objInvoke2 = aVar3.invoke(d0Var);
                        }
                        kVar = new g00.k(null, p30.f.r0(d0Var.d, objInvoke2, a0Var2, d0Var.b, d0Var.c));
                    } else {
                        kVar = new g00.k(null, aVar3.invoke(d0Var));
                    }
                    List list4 = (List) kVar.A;
                    Object obj8 = kVar.B;
                    if (list4 == null) {
                        f0Var = new g0(obj8, true);
                    } else {
                        q3.c cVar = new q3.c(list4, obj8, d0Var, nVar.a, kVar10, oVar3);
                        a40.c0.y(nVar.b, null, a40.a0.D, new l6.d(cVar, (k00.c) null, 11), 1);
                        f0Var = new f0(cVar);
                    }
                } else {
                    f0Var = null;
                }
                if (f0Var != null) {
                    return f0Var;
                }
                Object obj9 = jVar.e.B;
                q3.w wVar3 = d0Var.a;
                int i27 = d0Var.c;
                q3.u uVar16 = d0Var.b;
                if (wVar3 == null || (wVar3 instanceof q3.f)) {
                    typefaceF = sg.f.F((String) null, uVar16, i27);
                } else {
                    if (!(wVar3 instanceof q3.w)) {
                        if (wVar3 instanceof q3.x) {
                            typefaceF = (Typeface) ((q3.x) wVar3).F.B;
                        } else {
                            g0Var = null;
                        }
                        if (g0Var != null) {
                            return g0Var;
                        }
                        throw new IllegalStateException("Could not load font");
                    }
                    typefaceF = sg.f.F(wVar3.F, uVar16, i27);
                }
                g0Var = new g0(typefaceF, true);
                if (g0Var != null) {
                    return g0Var;
                }
                throw new IllegalStateException("Could not load font");
            case 12:
                e0 e0Var = (e0) this.B;
                d0 d0Var2 = (d0) this.C;
                h0 h0Var = (h0) obj;
                synchronized (((tf.y) e0Var.B)) {
                    try {
                        if (h0Var.b()) {
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return b0.a;
            case 13:
                androidx.lifecycle.w wVar4 = (androidx.lifecycle.w) this.B;
                r6.a aVar4 = (r6.a) this.C;
                androidx.lifecycle.l lVar2 = new androidx.lifecycle.l(aVar4, 7);
                if (wVar4 != null && (lifecycle = wVar4.getLifecycle()) != null) {
                    lifecycle.a(lVar2);
                }
                if (wVar4 == null) {
                    androidx.lifecycle.o oVar4 = androidx.lifecycle.o.ON_RESUME;
                    aVar4.getClass();
                    aVar4.B = oVar4.a();
                    aVar4.a();
                }
                return new gv.k(wVar4, lVar2, aVar4, 4);
            case 14:
                l1.e1 e1Var2 = (l1.e1) this.B;
                l1.z0 z0Var = (l1.z0) this.C;
                float fFloatValue = ((Float) obj).floatValue();
                e1Var2.i(fFloatValue);
                ((u00.k) z0Var.getValue()).invoke(Integer.valueOf(w00.a.F(fFloatValue)));
                return b0.a;
            case 15:
                androidx.lifecycle.w wVar5 = (androidx.lifecycle.w) this.B;
                r1 r1Var = (r1) this.C;
                l1.z DisposableEffect = (l1.z) obj;
                kotlin.jvm.internal.m.e(DisposableEffect, "$this$DisposableEffect");
                androidx.lifecycle.l lVar3 = new androidx.lifecycle.l(r1Var, 8);
                wVar5.getLifecycle().a(lVar3);
                return new z0(wVar5, lVar3, 12);
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                vq.a aVar5 = (vq.a) this.B;
                sq.a aVar6 = (sq.a) this.C;
                ma.a _connection = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection, "_connection");
                aVar5.b.i0(_connection, aVar6);
                return b0.a;
            case 17:
                u00.a aVar7 = (u00.a) this.B;
                e1 e1Var3 = (e1) this.C;
                if (((Boolean) aVar7.invoke()).booleanValue() && (e1Var = (e1) s0.Q(e1Var3).c.remove(obj)) != null) {
                    e1Var.a();
                }
                return b0.a;
            case 18:
                x.g0 g0Var2 = (x.g0) this.B;
                x.e0 e0Var2 = (x.e0) this.C;
                g0Var2.a.b(e0Var2);
                g0Var2.b.setValue(Boolean.TRUE);
                return new z0(g0Var2, e0Var2, 13);
            case 19:
                a40.c0.y((a40.z) this.B, null, a40.a0.D, new f1.g((n1) this.C, (k00.c) null), 1);
                return new cl.c(2);
            case 20:
                n1 n1Var = (n1) this.B;
                n1 n1Var2 = (n1) this.C;
                n1Var.j.add(n1Var2);
                return new z0(n1Var, n1Var2, 14);
            case 21:
                return new z0((n1) this.B, (x.j1) this.C, 15);
            case 22:
                n1 n1Var3 = (n1) this.B;
                m1 m1Var = (m1) this.C;
                n1Var3.i.add(m1Var);
                return new z0(n1Var3, m1Var, 16);
            case 23:
                y0 y0Var = (f5.c) this.B;
                y0Var.g1(new z1.u(new q(Thread.currentThread(), (a40.z) this.C, 24)));
                return new c3.k1(y0Var, 22);
            case 24:
                Object obj10 = this.B;
                a40.z zVar = (a40.z) this.C;
                u00.a aVar8 = (u00.a) obj;
                if (obj10 == Thread.currentThread()) {
                    aVar8.invoke();
                } else {
                    a40.c0.y(zVar, null, null, new bt.y0(aVar8, null, 13), 3);
                }
                return b0.a;
            case 25:
                xn.b bVar = (xn.b) this.B;
                bo.a aVar9 = (bo.a) this.C;
                ma.a _connection2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection2, "_connection");
                l9.f0 f0Var2 = bVar.b;
                f0Var2.getClass();
                try {
                    ((ab.a0) f0Var2.B).i0(_connection2, aVar9);
                    break;
                } catch (SQLException e) {
                    l9.f0.d(e);
                    ((a10.h0) f0Var2.C).C(_connection2, aVar9);
                }
                return b0.a;
            case 26:
                xn.c cVar2 = (xn.c) this.B;
                bo.b bVar2 = (bo.b) this.C;
                ma.a _connection3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection3, "_connection");
                cVar2.b.i0(_connection3, bVar2);
                return b0.a;
            case 27:
                xn.e eVar3 = (xn.e) this.B;
                bo.c cVar3 = (bo.c) this.C;
                ma.a _connection4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection4, "_connection");
                l9.f0 f0Var3 = eVar3.b;
                f0Var3.getClass();
                try {
                    ((ab.a0) f0Var3.B).i0(_connection4, cVar3);
                    break;
                } catch (SQLException e2) {
                    l9.f0.d(e2);
                    ((a10.h0) f0Var3.C).C(_connection4, cVar3);
                }
                return b0.a;
            case 28:
                xn.e eVar4 = (xn.e) this.B;
                List list5 = (List) this.C;
                ma.a _connection5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(_connection5, "_connection");
                l9.f0 f0Var4 = eVar4.b;
                f0Var4.getClass();
                if (list5 != null) {
                    for (Object obj11 : list5) {
                        try {
                            ((ab.a0) f0Var4.B).i0(_connection5, obj11);
                        } catch (SQLException e3) {
                            l9.f0.d(e3);
                            ((a10.h0) f0Var4.C).C(_connection5, obj11);
                        }
                    }
                }
                return b0.a;
            default:
                xy.n nVar2 = (xy.n) this.C;
                u00.k kVar11 = (u00.k) this.B;
                j0.h LazyColumn2 = (j0.h) obj;
                kotlin.jvm.internal.m.e(LazyColumn2, "$this$LazyColumn");
                j0.h.q(LazyColumn2, (Object) null, xy.a.b, 3);
                if (nVar2.i.length() > 0) {
                    j0.h.q(LazyColumn2, (Object) null, new v1.c(new c0.f(nVar2, kVar11, 21), -2131851747, true), 3);
                }
                j0.h.q(LazyColumn2, (Object) null, new v1.c(new a1.w(nVar2, 19), 1878482881, true), 3);
                j0.h.q(LazyColumn2, (Object) null, new v1.c(new d0.y(3, kVar11), -1822995744, true), 3);
                return b0.a;
        }
    }
}
