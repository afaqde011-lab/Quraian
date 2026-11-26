package w;

import java.util.List;

public final class i1 extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final j1 B;

    public i1(j1 j1Var, int i10) {
        super(0);
        this.A = i10;
        this.B = j1Var;
    }

    public final Object invoke() {
        Object obj;
        switch (this.A) {
            case 0:
                j1 j1Var = this.B;
                boolean z10 = j1Var.f15786g;
                x.b bVar = j1Var.f15785f;
                u1 u1Var = j1Var.f15781b;
                if (!z10 && u1Var.b() && bVar.e()) {
                    List listC = j1Var.c();
                    int size = listC.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 < size) {
                            obj = listC.get(i10);
                            if (!((k1) obj).a().b()) {
                                i10++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    k1 k1Var = (k1) obj;
                    if (k1Var != null) {
                        x.y yVar = k1Var.a().f15763f;
                        if (yVar instanceof x.b1) {
                            x.b1 b1Var = (x.b1) yVar;
                            a40.c0.y(u1Var.B, (k00.i) null, (a40.a0) null, new rm.c(j1Var, new x.b1(b1Var.f16245a, b1Var.f16246b, new h2.b((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L))), (k00.c) null, 20), 3);
                        }
                        j1Var.f15786g = true;
                    }
                }
                return new h2.b(((h2.b) bVar.d()).f6544a);
            default:
                List listB = this.B.b();
                int size2 = listB.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    k1 k1Var2 = (k1) listB.get(i11);
                    if (k1Var2.a().b() && k1Var2.h()) {
                        return g00.b0.a;
                    }
                }
                return g00.b0.a;
        }
    }
}
