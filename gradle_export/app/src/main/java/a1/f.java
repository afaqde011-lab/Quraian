package a1;

import android.content.Context;
import android.graphics.Bitmap;
import d0.k3;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k9.b3;

public final class f extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final Object G;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.E = obj2;
        this.D = obj3;
        this.F = obj4;
        this.G = obj5;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.E = obj;
        this.D = obj2;
        this.F = obj3;
        this.G = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
        this.F = obj2;
        this.G = obj3;
    }

    public f(no.n nVar, ho.n nVar2, k00.c cVar) {
        super(2, cVar);
        this.A = 9;
        this.F = nVar;
        this.G = nVar2;
    }

    public f(u00.a aVar, k00.c cVar) {
        super(2, cVar);
        this.A = 5;
        this.G = aVar;
    }

    public f(v2.v vVar, u00.o oVar, u00.k kVar, d0.t1 t1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 1;
        this.E = vVar;
        this.F = (m00.i) oVar;
        this.D = kVar;
        this.G = t1Var;
    }

    public f(x.y0 y0Var, Object obj, x.n1 n1Var, k00.c cVar) {
        super(2, cVar);
        this.A = 14;
        this.F = y0Var;
        this.C = obj;
        this.G = n1Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                f fVar = new f((c3.q0) this.E, (u00.k) this.D, (h) this.F, (w0) this.G, cVar, 0);
                fVar.C = obj;
                return fVar;
            case 1:
                f fVar2 = new f((v2.v) this.E, (u00.o) this.F, (u00.k) this.D, (d0.t1) this.G, cVar);
                fVar2.C = obj;
                return fVar2;
            case 2:
                f fVar3 = new f((k3) this.D, (d0.u2) this.F, (kotlin.jvm.internal.z) this.G, cVar, 2);
                fVar3.C = obj;
                return fVar3;
            case 3:
                return new f((e00.t) this.C, (l2.b) this.E, (kotlin.jvm.internal.w) this.D, (d00.r0) this.F, (y3.c) this.G, cVar, 3);
            case 4:
                f fVar4 = new f((l1.x1) this.D, (l1.w1) this.F, (l1.q0) this.G, cVar, 4);
                fVar4.C = obj;
                return fVar4;
            case 5:
                f fVar5 = new f((u00.a) this.G, cVar);
                fVar5.F = obj;
                return fVar5;
            case 6:
                f fVar6 = new f((u00.n) this.E, (b3) this.D, (a40.z) this.F, (AtomicReference) this.G, cVar, 6);
                fVar6.C = obj;
                return fVar6;
            case 7:
                return new f((wb.i) this.C, (lb.j) this.E, (xb.g) this.D, (lb.c) this.F, (Bitmap) this.G, cVar, 7);
            case 8:
                f fVar7 = new f((mw.a) this.E, (String) this.D, (String) this.F, (String) this.G, cVar, 8);
                fVar7.C = obj;
                return fVar7;
            case 9:
                return new f((no.n) this.F, (ho.n) this.G, cVar);
            case 10:
                return new f((pz.l) this.C, (u00.a) this.E, (sy.c) this.D, (ol.b) this.F, (Context) this.G, cVar, 10);
            case 11:
                return new f((q0.j1) this.C, (l1.z0) this.E, (r3.x) this.D, (e1.v0) this.F, (r3.j) this.G, cVar, 11);
            case 12:
                return new f((n0.c) this.C, (r3.w) this.E, (q0.j1) this.D, (q0.e2) this.F, (r3.p) this.G, cVar, 12);
            case 13:
                return new f((kotlin.jvm.internal.z) this.C, (List) this.E, (l1.z0) this.D, (l1.z0) this.F, (l1.z0) this.G, cVar, 13);
            default:
                return new f((x.y0) this.F, this.C, (x.n1) this.G, cVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((d0.s2) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                create((d40.j) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 11:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 13:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        throw new UnsupportedOperationException("Method not decompiled: a1.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
