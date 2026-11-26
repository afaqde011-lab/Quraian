package g1;

import java.util.WeakHashMap;

public final class s0 implements u00.n {
    public static final s0 B = new s0(0);
    public static final s0 C = new s0(1);
    public static final s0 D = new s0(2);
    public static final s0 E = new s0(3);
    public final int A;

    public s0(int i10) {
        this.A = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                l1.g0 g0Var = (l1.g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p.f5897a.a(null, 0.0f, 0.0f, null, 0L, jVar, 196608);
                } else {
                    g0Var.V();
                }
                return b0Var;
            case 1:
                l1.j jVar2 = (l1.j) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1.g0 g0Var2 = (l1.g0) jVar2;
                if (g0Var2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p.f5897a.a(null, 0.0f, 0.0f, null, 0L, jVar2, 196608);
                } else {
                    g0Var2.V();
                }
                return b0Var;
            case 2:
                l1.j jVar3 = (l1.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l1.g0 g0Var3 = (l1.g0) jVar3;
                if (!g0Var3.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g0Var3.V();
                }
                return b0Var;
            default:
                ((Number) obj2).intValue();
                l1.g0 g0Var4 = (l1.g0) ((l1.j) obj);
                g0Var4.c0(-511854661);
                p pVar = p.f5897a;
                WeakHashMap weakHashMap = h0.m2.f6423w;
                h0.e1 e1Var = new h0.e1(h0.b.e(g0Var4).l, 48);
                g0Var4.r(false);
                return e1Var;
        }
    }
}
