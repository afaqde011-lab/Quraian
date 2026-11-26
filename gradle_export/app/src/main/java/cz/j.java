package cz;

import b2.r;
import bz.p;
import h0.m2;
import h0.n1;
import h0.p1;
import h0.t0;
import h0.z1;
import j0.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import l1.g0;
import l1.r1;

public abstract class j {
    public static final float a = 810;
    public static final float b = 32;
    public static final float c = 16;

    public static final void a(v vVar, p uiState, u00.k onDeviceClicked, u00.a onTerminateOthersClicked, r rVar, l1.j jVar, int i) {
        l1.j jVar2;
        Object next;
        boolean z;
        p1 p1VarG;
        kotlin.jvm.internal.m.e(uiState, "uiState");
        u30.b bVar = uiState.c;
        kotlin.jvm.internal.m.e(onDeviceClicked, "onDeviceClicked");
        kotlin.jvm.internal.m.e(onTerminateOthersClicked, "onTerminateOthersClicked");
        l1.j jVar3 = (g0) jVar;
        jVar3.e0(1810819915);
        int i2 = i | (jVar3.g(vVar) ? 4 : 2) | (jVar3.g(uiState) ? 32 : 16) | (jVar3.i(onDeviceClicked) ? 256 : 128) | (jVar3.i(onTerminateOthersClicked) ? 2048 : 1024) | (jVar3.g(rVar) ? 16384 : 8192);
        if (jVar3.S(i2 & 1, (i2 & 9363) != 9362)) {
            n1 n1Var = (n1) jVar3.k(dq.l.a);
            WeakHashMap weakHashMap = m2.w;
            t0 t0VarL = h0.c.l(h0.b.e(jVar3).g, jVar3);
            gm.a aVar = (gm.a) jVar3.k(dl.e.a);
            gm.a aVar2 = gm.a.B;
            b2.o oVar = b2.o.A;
            r rVarD = aVar == aVar2 ? z1.d(z1.s(h0.c.E(oVar, b, 0.0f, 2), 0.0f, a, 1), 1.0f) : z1.d(h0.c.E(oVar, c, 0.0f, 2), 1.0f);
            Iterator<E> it = bVar.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((ry.a) next).f);
            ry.a aVar3 = (ry.a) next;
            ArrayList arrayList = new ArrayList();
            for (Object obj : bVar) {
                if (!((ry.a) obj).f) {
                    arrayList.add(obj);
                }
            }
            boolean zE = jVar3.e(aVar.ordinal()) | jVar3.g(n1Var) | jVar3.g(t0VarL);
            Object objN = jVar3.N();
            l1.c cVar = l1.i.a;
            if (zE || objN == cVar) {
                float fA = t0VarL.a() + n1Var.a();
                int iOrdinal = aVar.ordinal();
                if (iOrdinal != 0) {
                    z = true;
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    p1VarG = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + 20, 0.0f, fA, 5);
                } else {
                    z = true;
                    p1VarG = h0.c.g(0.0f, t0VarL.c() + n1Var.c() + 44 + 16, 0.0f, fA, 5);
                }
                objN = p1VarG;
                jVar3.n0(objN);
            } else {
                z = true;
            }
            n1 n1Var2 = (n1) objN;
            r rVarV = rVar.V(z1.c);
            boolean z2 = z;
            b2.g gVar = b2.b.N;
            h0.f fVarG = h0.i.g(20);
            boolean zG = jVar3.g(rVarD) | ((i2 & 112) == 32 ? z2 : false) | jVar3.g(aVar3) | jVar3.i(arrayList) | ((i2 & 896) == 256 ? z2 : false);
            if ((i2 & 7168) != 2048) {
                z2 = false;
            }
            boolean z3 = zG | z2;
            Object objN2 = jVar3.N();
            if (z3 || objN2 == cVar) {
                f fVar = new f(uiState, aVar3, rVarD, arrayList, onDeviceClicked, onTerminateOthersClicked, 0);
                jVar3.n0(fVar);
                objN2 = fVar;
            }
            jVar2 = jVar3;
            k00.f.d(rVarV, vVar, n1Var2, fVarG, gVar, null, false, null, (u00.k) objN2, jVar2, ((i2 << 3) & 112) | 221184, 456);
        } else {
            jVar2 = jVar3;
            jVar2.V();
        }
        r1 r1VarT = jVar2.t();
        if (r1VarT != null) {
            r1VarT.d = new g(vVar, uiState, onDeviceClicked, onTerminateOthersClicked, rVar, i, 0);
        }
    }
}
