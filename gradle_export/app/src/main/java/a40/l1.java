package a40;

import g1.k8;

public final class l1 extends m00.h implements u00.n {
    public final int B;
    public int C;
    public Object D;
    public Object E;
    public Object F;
    public final Object G;

    public l1(c50.h hVar, e1.m mVar, q0.r1 r1Var, k00.c cVar) {
        super(2, cVar);
        this.B = 2;
        this.E = hVar;
        this.F = mVar;
        this.G = r1Var;
    }

    public l1(Object obj, Object obj2, k00.c cVar, int i) {
        super(2, cVar);
        this.B = i;
        this.F = obj;
        this.G = obj2;
    }

    public l1(Object obj, k00.c cVar, int i) {
        super(2, cVar);
        this.B = i;
        this.G = obj;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                l1 l1Var = new l1((m1) this.G, cVar, 0);
                l1Var.D = obj;
                return l1Var;
            case 1:
                l1 l1Var2 = new l1((androidx.media3.common.q) this.F, (b1.j) this.G, cVar, 1);
                l1Var2.D = obj;
                return l1Var2;
            case 2:
                l1 l1Var3 = new l1((c50.h) this.E, (e1.m) this.F, (q0.r1) this.G, cVar);
                l1Var3.D = obj;
                return l1Var3;
            case 3:
                l1 l1Var4 = new l1((z) this.F, (k8) this.G, cVar, 3);
                l1Var4.D = obj;
                return l1Var4;
            case 4:
                l1 l1Var5 = new l1((m0.w) this.G, cVar, 4);
                l1Var5.D = obj;
                return l1Var5;
            default:
                l1 l1Var6 = new l1((y0.c) this.G, cVar, 5);
                l1Var6.D = obj;
                return l1Var6;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                return ((l1) create((q30.k) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((l1) create((v2.i0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((l1) create((v2.i0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                ((l1) create((v2.i0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 4:
                return ((l1) create((v2.i0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((l1) create((v2.i0) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        throw new UnsupportedOperationException("Method not decompiled: a40.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
