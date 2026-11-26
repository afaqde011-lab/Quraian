package as;

import bt.j2;
import java.util.List;
import ur.r1;

public final class z0 extends m00.i implements u00.r {
    public final int A;
    public boolean B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public final Object G;

    public z0(Object obj, k00.c cVar, int i) {
        super(6, cVar);
        this.A = i;
        this.G = obj;
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        throw new UnsupportedOperationException("Method not decompiled: as.z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.A) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj5).booleanValue();
                z0 z0Var = new z0((b1) this.G, (k00.c) obj6, 0);
                z0Var.C = (List) obj;
                z0Var.D = (List) obj2;
                z0Var.E = (List) obj3;
                z0Var.F = (List) obj4;
                z0Var.B = zBooleanValue;
                return z0Var.invokeSuspend(g00.b0.a);
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                z0 z0Var2 = new z0((j2) this.G, (k00.c) obj6, 1);
                z0Var2.B = zBooleanValue2;
                z0Var2.C = (bt.x) obj2;
                z0Var2.D = (bt.y) obj3;
                z0Var2.E = (g00.k) obj4;
                z0Var2.F = (bt.h0) obj5;
                return z0Var2.invokeSuspend(g00.b0.a);
            case 2:
                boolean zBooleanValue3 = ((Boolean) obj5).booleanValue();
                z0 z0Var3 = new z0((qo.y) this.G, (k00.c) obj6, 2);
                z0Var3.E = (ho.a) obj;
                z0Var3.F = (Integer) obj2;
                z0Var3.C = (List) obj3;
                z0Var3.D = (List) obj4;
                z0Var3.B = zBooleanValue3;
                return z0Var3.invokeSuspend(g00.b0.a);
            case 3:
                boolean zBooleanValue4 = ((Boolean) obj4).booleanValue();
                z0 z0Var4 = new z0((r1) this.G, (k00.c) obj6, 3);
                z0Var4.D = (ss.v) obj;
                z0Var4.C = (List) obj2;
                z0Var4.E = (mr.g) obj3;
                z0Var4.B = zBooleanValue4;
                z0Var4.F = (ss.p) obj5;
                return z0Var4.invokeSuspend(g00.b0.a);
            default:
                boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                z0 z0Var5 = new z0((vr.c) this.G, (k00.c) obj6, 4);
                z0Var5.C = (List) obj;
                z0Var5.F = (Integer) obj2;
                z0Var5.B = zBooleanValue5;
                z0Var5.D = (List) obj4;
                z0Var5.E = (List) obj5;
                return z0Var5.invokeSuspend(g00.b0.a);
        }
    }
}
