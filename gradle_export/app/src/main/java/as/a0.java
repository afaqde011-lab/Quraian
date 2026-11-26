package as;

public final class a0 implements u00.o {
    public final int A;
    public final Object B;
    public final Object C;
    public final float D;

    public a0(float f, u0 u0Var, u00.k kVar) {
        this.A = 0;
        this.D = f;
        this.B = u0Var;
        this.C = kVar;
    }

    public a0(float f, Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                u0 u0Var = (u0) this.B;
                u00.k kVar = (u00.k) this.C;
                j0.b item = (j0.b) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item, "$this$item");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    b2.r rVarG = h0.c.G(h0.c.E(b2.o.A, this.D, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12, 7);
                    int iA = ((h00.b) u0Var.c).a();
                    int iA2 = ((h00.b) u0Var.e).a();
                    int i = u0Var.f;
                    u30.b bVar = u0Var.p;
                    boolean z = u0Var.g;
                    boolean zG = g0Var2.g(kVar);
                    Object objN = g0Var2.N();
                    Object obj4 = l1.i.a;
                    if (zG || objN == obj4) {
                        objN = new e0(4, kVar);
                        g0Var2.n0(objN);
                    }
                    u00.a aVar = (u00.a) objN;
                    boolean zG2 = g0Var2.g(kVar);
                    Object objN2 = g0Var2.N();
                    if (zG2 || objN2 == obj4) {
                        objN2 = new e0(5, kVar);
                        g0Var2.n0(objN2);
                    }
                    u00.a aVar2 = (u00.a) objN2;
                    boolean zG3 = g0Var2.g(kVar);
                    Object objN3 = g0Var2.N();
                    if (zG3 || objN3 == obj4) {
                        objN3 = new e0(6, kVar);
                        g0Var2.n0(objN3);
                    }
                    ox.a.k(iA, i, bVar, aVar, aVar2, (u00.a) objN3, rVarG, z, iA2, g0Var, 512, 0);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                u0 u0Var2 = (u0) this.B;
                u00.k kVar2 = (u00.k) this.C;
                j0.b item2 = (j0.b) obj;
                l1.g0 g0Var3 = (l1.j) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item2, "$this$item");
                l1.g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    b2.r rVarG2 = h0.c.G(b2.o.A, 0.0f, 0.0f, 0.0f, 12, 7);
                    qr.r rVar = u0Var2.j;
                    boolean zG4 = g0Var4.g(kVar2);
                    Object objN4 = g0Var4.N();
                    if (zG4 || objN4 == l1.i.a) {
                        objN4 = new d0(2, kVar2);
                        g0Var4.n0(objN4);
                    }
                    bs.a.j(rVar, (u00.k) objN4, this.D, rVarG2, g0Var3, 3072);
                } else {
                    g0Var4.V();
                }
                break;
            default:
                ys.a aVar3 = (ys.a) this.B;
                bt.a1 a1Var = (bt.a1) this.C;
                j0.b item3 = (j0.b) obj;
                l1.g0 g0Var5 = (l1.j) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(item3, "$this$item");
                l1.g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    bt.a.a(aVar3, a1Var.t, this.D, h0.c.G(b2.o.A, 0.0f, 16, 0.0f, 0.0f, 13), g0Var5, 3072, 0);
                } else {
                    g0Var6.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
