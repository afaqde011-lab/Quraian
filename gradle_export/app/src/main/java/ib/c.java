package ib;

import a1.z;
import ab.q;
import ab.y;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import h1.v0;
import hb.p;
import hb.t;
import hb.x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import za.g0;
import za.k0;
import za.v;

public abstract class c {

    public static final String f7567a = v.f("EnqueueRunnable");

    public static void a(q qVar) {
        boolean z10;
        y yVar = qVar.f402a;
        HashSet hashSet = new HashSet();
        hashSet.addAll(qVar.f406e);
        HashSet hashSetO0 = q.o0(qVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                hashSet.removeAll(qVar.f406e);
                z10 = false;
                break;
            } else if (hashSetO0.contains((String) it.next())) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            throw new IllegalStateException("WorkContinuation has cycles (" + qVar + ")");
        }
        WorkDatabase workDatabase = yVar.f420c;
        za.b bVar = yVar.f419b;
        workDatabase.b();
        try {
            g.b(workDatabase, bVar, qVar);
            boolean zB = b(qVar);
            workDatabase.p();
            workDatabase.f();
            if (zB) {
                ab.l.b(bVar, yVar.f420c, yVar.f422e);
            }
        } catch (Throwable th2) {
            workDatabase.f();
            throw th2;
        }
    }

    public static boolean b(q qVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        List list;
        boolean z13;
        WorkDatabase workDatabase;
        boolean z14;
        boolean z15;
        boolean z16;
        HashSet hashSetO0 = q.o0(qVar);
        y yVar = qVar.f402a;
        List list2 = qVar.f405d;
        String[] strArr = (String[]) hashSetO0.toArray(new String[0]);
        String str = qVar.f403b;
        za.l lVar = qVar.f404c;
        yVar.f419b.f17340d.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = yVar.f420c;
        boolean z17 = strArr != null && strArr.length > 0;
        if (z17) {
            int length = strArr.length;
            int i10 = 0;
            z11 = false;
            z12 = false;
            z10 = true;
            while (true) {
                if (i10 < length) {
                    String str2 = strArr[i10];
                    p pVarE = workDatabase2.w().e(str2);
                    if (pVarE == null) {
                        v.d().b(f7567a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    } else {
                        g0 g0Var = pVarE.f7005b;
                        z10 &= g0Var == g0.C;
                        if (g0Var == g0.D) {
                            z12 = true;
                        } else if (g0Var == g0.F) {
                            z11 = true;
                        }
                        i10++;
                    }
                }
                z16 = false;
                z15 = true;
                qVar.f408g = z15;
                return z16;
            }
        }
        z10 = true;
        z11 = false;
        z12 = false;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (zIsEmpty || z17) {
            list = list2;
            z13 = zIsEmpty;
            workDatabase = workDatabase2;
            z14 = false;
        } else {
            List listF = workDatabase2.w().f(str);
            if (listF.isEmpty()) {
                list = list2;
                z13 = zIsEmpty;
                workDatabase = workDatabase2;
            } else if (lVar == za.l.C || lVar == za.l.D) {
                hb.c cVarR = workDatabase2.r();
                ArrayList arrayList = new ArrayList();
                Iterator it = listF.iterator();
                while (it.hasNext()) {
                    hb.n nVar = (hb.n) it.next();
                    List list3 = list2;
                    String str3 = nVar.f6986a;
                    cVarR.getClass();
                    boolean z18 = zIsEmpty;
                    kotlin.jvm.internal.m.e(str3, "id");
                    WorkDatabase workDatabase3 = workDatabase2;
                    Iterator it2 = it;
                    if (!((Boolean) rd.a.M(cVarR.f6965a, true, false, new b6.o(str3, 18))).booleanValue()) {
                        g0 g0Var2 = nVar.f6987b;
                        boolean z19 = (g0Var2 == g0.C) & z10;
                        if (g0Var2 == g0.D) {
                            z12 = true;
                        } else if (g0Var2 == g0.F) {
                            z11 = true;
                        }
                        arrayList.add(nVar.f6986a);
                        z10 = z19;
                    }
                    list2 = list3;
                    zIsEmpty = z18;
                    workDatabase2 = workDatabase3;
                    it = it2;
                }
                list = list2;
                z13 = zIsEmpty;
                workDatabase = workDatabase2;
                List list4 = arrayList;
                list4 = arrayList;
                if (lVar == za.l.D && (z11 || z12)) {
                    x xVarW = workDatabase.w();
                    Iterator it3 = xVarW.f(str).iterator();
                    while (it3.hasNext()) {
                        xVarW.c(((hb.n) it3.next()).f6986a);
                    }
                    z11 = false;
                    z12 = false;
                    list4 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) list4.toArray(strArr);
                z17 = strArr.length > 0;
            } else {
                if (lVar == za.l.B) {
                    Iterator it4 = listF.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            g0 g0Var3 = ((hb.n) it4.next()).f6987b;
                            if (g0Var3 == g0.A || g0Var3 == g0.B) {
                                z16 = false;
                                z15 = true;
                                qVar.f408g = z15;
                                return z16;
                            }
                        }
                    }
                }
                kotlin.jvm.internal.m.d(workDatabase2, "getWorkDatabase(...)");
                workDatabase2.o(new z(new a(workDatabase2, str, yVar, 0), 14));
                x xVarW2 = workDatabase2.w();
                Iterator it5 = listF.iterator();
                while (it5.hasNext()) {
                    xVarW2.c(((hb.n) it5.next()).f6986a);
                }
                list = list2;
                z13 = zIsEmpty;
                workDatabase = workDatabase2;
                z14 = true;
            }
            z14 = false;
        }
        Iterator it6 = list.iterator();
        boolean z20 = z14;
        while (it6.hasNext()) {
            k0 k0Var = (k0) it6.next();
            p pVar = k0Var.f17388b;
            UUID uuid = k0Var.f17387a;
            if (!z17 || z10) {
                pVar.f7015n = jCurrentTimeMillis;
            } else if (z12) {
                pVar.f7005b = g0.D;
            } else if (z11) {
                pVar.f7005b = g0.F;
            } else {
                pVar.f7005b = g0.E;
            }
            if (pVar.f7005b == g0.A) {
                z20 = true;
            }
            x xVarW3 = workDatabase.w();
            p pVarD = g.d(yVar.f422e, pVar);
            xVarW3.getClass();
            y yVar2 = yVar;
            Iterator it7 = it6;
            rd.a.M(xVarW3.f7028a, false, true, new t(xVarW3, pVarD, 0));
            if (z17) {
                int i11 = 0;
                for (int length2 = strArr.length; i11 < length2; length2 = length2) {
                    String str4 = strArr[i11];
                    String[] strArr2 = strArr;
                    String string = uuid.toString();
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    hb.a aVar = new hb.a(string, str4);
                    hb.c cVarR2 = workDatabase.r();
                    cVarR2.getClass();
                    rd.a.M(cVarR2.f6965a, false, true, new v0(cVarR2, aVar, 1));
                    i11++;
                    strArr = strArr2;
                }
            }
            String[] strArr3 = strArr;
            hb.z zVarX = workDatabase.x();
            String string2 = uuid.toString();
            kotlin.jvm.internal.m.d(string2, "toString(...)");
            zVarX.a(string2, k0Var.f17389c);
            if (!z13) {
                hb.k kVarU = workDatabase.u();
                String string3 = uuid.toString();
                kotlin.jvm.internal.m.d(string3, "toString(...)");
                hb.j jVar = new hb.j(str, string3);
                kVarU.getClass();
                rd.a.M(kVarU.f6980a, false, true, new v0(kVarU, jVar, 4));
            }
            yVar = yVar2;
            it6 = it7;
            strArr = strArr3;
        }
        z15 = true;
        z16 = z20;
        qVar.f408g = z15;
        return z16;
    }
}
