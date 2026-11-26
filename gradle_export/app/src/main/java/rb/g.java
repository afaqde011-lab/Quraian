package rb;

import a40.c0;
import a40.v;
import android.graphics.Bitmap;
import c3.o3;
import g00.k;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.m;
import lb.j;
import ri.t1;
import wb.l;
import wb.o;

public final class g {

    public final j f13139a;

    public final bc.g f13140b;

    public final o f13141c;

    public final o10.b f13142d;

    public g(j jVar, bc.g gVar, o oVar) {
        this.f13139a = jVar;
        this.f13140b = gVar;
        this.f13141c = oVar;
        this.f13142d = new o10.b(jVar, oVar);
    }

    public static final java.lang.Object a(rb.g r8, qb.m r9, lb.b r10, wb.i r11, java.lang.Object r12, wb.l r13, lb.c r14, m00.c r15) {
        throw new UnsupportedOperationException("Method not decompiled: rb.g.a(rb.g, qb.m, lb.b, wb.i, java.lang.Object, wb.l, lb.c, m00.c):java.lang.Object");
    }

    public static final java.lang.Object b(rb.g r24, wb.i r25, java.lang.Object r26, wb.l r27, lb.c r28, m00.c r29) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: rb.g.b(rb.g, wb.i, java.lang.Object, wb.l, lb.c, m00.c):java.lang.Object");
    }

    public final java.lang.Object c(lb.b r18, wb.i r19, java.lang.Object r20, wb.l r21, lb.c r22, m00.c r23) {
        throw new UnsupportedOperationException("Method not decompiled: rb.g.c(lb.b, wb.i, java.lang.Object, wb.l, lb.c, m00.c):java.lang.Object");
    }

    public final Object d(i iVar, m00.c cVar) throws Throwable {
        e eVar;
        g gVar = this;
        i iVar2 = iVar;
        o10.b bVar = gVar.f13142d;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.E = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(gVar, cVar);
            }
        } else {
            eVar = new e(gVar, cVar);
        }
        e eVar2 = eVar;
        Object obj = eVar2.C;
        l00.a aVar = l00.a.A;
        int i11 = eVar2.E;
        if (i11 == 0) {
            t1.O(obj);
            try {
                wb.i iVar3 = iVar2.f13146d;
                Object obj2 = iVar3.f15936b;
                xb.g gVar2 = iVar2.f13147e;
                Bitmap.Config[] configArr = bc.d.f2480a;
                lb.c cVar2 = iVar2.f13148f;
                l lVarG = gVar.f13141c.g(iVar3, gVar2);
                xb.f fVar = lVarG.f15964e;
                List list = gVar.f13139a.f10212g.f10201b;
                int size = list.size();
                for (int i12 = 0; i12 < size; i12++) {
                    try {
                        k kVar = (k) list.get(i12);
                        tb.a aVar2 = (tb.a) kVar.A;
                        if (((Class) kVar.B).isAssignableFrom(obj2.getClass())) {
                            m.c(aVar2, "null cannot be cast to non-null type coil.map.Mapper<kotlin.Any, *>");
                            Object objA = aVar2.a(obj2, lVarG);
                            if (objA != null) {
                                obj2 = objA;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        gVar = this;
                    }
                }
                ub.b bVarS = bVar.s(iVar3, obj2, lVarG, cVar2);
                ub.c cVarR = bVarS != null ? bVar.r(iVar3, bVarS, gVar2, fVar) : null;
                if (cVarR != null) {
                    return o10.b.t(iVar2, iVar3, bVarS, cVarR);
                }
                v vVar = iVar3.f15952t;
                gVar = this;
                o3 o3Var = new o3(gVar, iVar3, obj2, lVarG, cVar2, bVarS, iVar2, (k00.c) null);
                eVar2.A = gVar;
                eVar2.B = iVar2;
                eVar2.E = 1;
                Object objJ = c0.J(o3Var, vVar, eVar2);
                return objJ == aVar ? aVar : objJ;
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i iVar4 = eVar2.B;
            g gVar3 = eVar2.A;
            try {
                t1.O(obj);
                return obj;
            } catch (Throwable th4) {
                th = th4;
                iVar2 = iVar4;
                gVar = gVar3;
            }
        }
        if (th instanceof CancellationException) {
            throw th;
        }
        o oVar = gVar.f13141c;
        return o.f(iVar2.f13146d, th);
    }
}
