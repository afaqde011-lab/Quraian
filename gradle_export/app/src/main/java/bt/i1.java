package bt;

import java.util.List;

public final class i1 extends m00.i implements u00.q {
    public final int A;
    public Object B;
    public final vm.a C;
    public Object D;
    public Object E;
    public Object F;

    public i1(vm.a aVar, k00.c cVar, int i) {
        super(5, cVar);
        this.A = i;
        this.C = aVar;
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        throw new UnsupportedOperationException("Method not decompiled: bt.i1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.A) {
            case 0:
                i1 i1Var = new i1((j2) this.C, (k00.c) obj5, 0);
                i1Var.B = (ys.c) obj;
                i1Var.D = (l2) obj2;
                i1Var.E = (l2) obj3;
                i1Var.F = (List) obj4;
                return i1Var.invokeSuspend(g00.b0.a);
            case 1:
                i1 i1Var2 = new i1((j2) this.C, (k00.c) obj5, 1);
                i1Var2.D = (ss.z) obj;
                i1Var2.E = (m2) obj2;
                i1Var2.F = (g00.k) obj3;
                i1Var2.B = (ys.c) obj4;
                return i1Var2.invokeSuspend(g00.b0.a);
            case 2:
                i1 i1Var3 = new i1((ur.r1) this.C, (k00.c) obj5, 2);
                i1Var3.B = (qr.c) obj;
                i1Var3.D = (qr.t) obj2;
                i1Var3.F = (List) obj3;
                i1Var3.E = (g00.q) obj4;
                return i1Var3.invokeSuspend(g00.b0.a);
            default:
                i1 i1Var4 = new i1((ur.r1) this.C, (k00.c) obj5, 3);
                i1Var4.F = (List) obj;
                i1Var4.B = (bx.c) obj2;
                i1Var4.D = (qr.q) obj3;
                i1Var4.E = (List) obj4;
                return i1Var4.invokeSuspend(g00.b0.a);
        }
    }
}
