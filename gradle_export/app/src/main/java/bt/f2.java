package bt;

import java.util.List;
import java.util.Set;

public final class f2 extends m00.i implements u00.o {
    public final int A;
    public final Object B;
    public Object C;
    public Object D;

    public f2(Object obj, k00.c cVar, int i) {
        super(3, cVar);
        this.A = i;
        this.B = obj;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                f2 f2Var = new f2((j2) this.B, (k00.c) obj3, 0);
                f2Var.C = (ss.v) obj;
                f2Var.D = (List) obj2;
                return f2Var.invokeSuspend(g00.b0.a);
            case 1:
                f2 f2Var2 = new f2((j2) this.B, (k00.c) obj3, 1);
                f2Var2.C = (k2) obj;
                f2Var2.D = (ss.p) obj2;
                return f2Var2.invokeSuspend(g00.b0.a);
            case 2:
                f2 f2Var3 = new f2((dz.s) this.B, (k00.c) obj3, 2);
                f2Var3.D = (List) obj;
                f2Var3.C = (List) obj2;
                return f2Var3.invokeSuspend(g00.b0.a);
            case 3:
                f2 f2Var4 = new f2((fy.c0) this.B, (k00.c) obj3, 3);
                f2Var4.D = (List) obj;
                f2Var4.C = (List) obj2;
                g00.b0 b0Var = g00.b0.a;
                f2Var4.invokeSuspend(b0Var);
                return b0Var;
            case 4:
                f2 f2Var5 = new f2((nx.p0) this.B, (k00.c) obj3, 4);
                f2Var5.D = (List) obj;
                f2Var5.C = (List) obj2;
                return f2Var5.invokeSuspend(g00.b0.a);
            default:
                f2 f2Var6 = new f2((xw.k) this.B, (k00.c) obj3, 5);
                f2Var6.D = (List) obj;
                f2Var6.C = (Set) obj2;
                return f2Var6.invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: bt.f2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
