package bt;

import java.util.List;

public final class q1 extends m00.i implements u00.r {
    public final int A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final vm.a G;

    public q1(vm.a aVar, k00.c cVar, int i) {
        super(6, cVar);
        this.A = i;
        this.G = aVar;
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: bt.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.A) {
            case 0:
                q1 q1Var = new q1((j2) this.G, (k00.c) obj6, 0);
                q1Var.B = (ss.z) obj;
                q1Var.C = (ss.v) obj2;
                q1Var.D = (List) obj3;
                q1Var.E = (List) obj4;
                q1Var.F = (Boolean) obj5;
                return q1Var.invokeSuspend(g00.b0.a);
            default:
                q1 q1Var2 = new q1((ur.r1) this.G, (k00.c) obj6, 1);
                q1Var2.B = (qr.f) obj;
                q1Var2.C = (qr.m) obj2;
                q1Var2.D = (qr.e) obj3;
                q1Var2.E = (qr.d) obj4;
                q1Var2.F = (u30.b) obj5;
                return q1Var2.invokeSuspend(g00.b0.a);
        }
    }
}
