package w;

import java.util.ArrayList;
import l1.p2;

public final class g extends kotlin.jvm.internal.n implements u00.k {
    public final int A;
    public final Object B;

    public g(b3.o0 o0Var, h2.c cVar, j1 j1Var) {
        super(1);
        this.A = 6;
        this.B = o0Var;
    }

    public g(Object obj, int i10) {
        super(1);
        this.A = i10;
        this.B = obj;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return Boolean.valueOf(kotlin.jvm.internal.m.a(obj, this.B));
            case 1:
                z2.k1 k1Var = (z2.k1) obj;
                ArrayList arrayList = (ArrayList) this.B;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    k1Var.h((z2.l1) arrayList.get(i10), 0, 0, 0.0f);
                }
                return g00.b0.a;
            case 2:
                return ((g0) this.B).f15763f;
            case 3:
                x.n nVar = (x.n) obj;
                float f3 = nVar.f16318b;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                float f10 = nVar.f16319c;
                if (f10 < -0.5f) {
                    f10 = -0.5f;
                }
                if (f10 > 0.5f) {
                    f10 = 0.5f;
                }
                float f11 = nVar.f16320d;
                float f12 = f11 >= -0.5f ? f11 : -0.5f;
                float f13 = f12 <= 0.5f ? f12 : 0.5f;
                float f14 = nVar.f16317a;
                float f15 = f14 >= 0.0f ? f14 : 0.0f;
                return new i2.t(i2.t.a(i2.b0.b(f3, f10, f13, f15 <= 1.0f ? f15 : 1.0f, j2.d.f7884x), (j2.c) this.B));
            case 4:
                return Boolean.valueOf(!kotlin.jvm.internal.m.a(obj, ((x.n1) this.B).f16326d.getValue()));
            case 5:
                ((i2.c0) obj).s0(((Number) ((p2) this.B).getValue()).floatValue());
                return g00.b0.a;
            default:
                ((b3.o0) this.B).a();
                return g00.b0.a;
        }
    }
}
