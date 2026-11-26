package h0;

public final class u1 implements u00.k {
    public final int A;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;

    public u1(int i10, int i11, Object obj, Object obj2, Object obj3) {
        this.A = i11;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.B = i10;
    }

    public u1(z2.l1[] l1VarArr, v1 v1Var, int i10, int[] iArr) {
        this.A = 0;
        this.C = l1VarArr;
        this.D = v1Var;
        this.B = i10;
        this.E = iArr;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z2.l1[] l1VarArr = (z2.l1[]) this.C;
                v1 v1Var = (v1) this.D;
                int[] iArr = (int[]) this.E;
                z2.k1 k1Var = (z2.k1) obj;
                int length = l1VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    z2.l1 l1Var = l1VarArr[i10];
                    int i12 = i11 + 1;
                    kotlin.jvm.internal.m.b(l1Var);
                    Object objU = l1Var.U();
                    s1 s1Var = objU instanceof s1 ? (s1) objU : null;
                    c cVar = s1Var != null ? s1Var.f6459c : null;
                    int i13 = this.B;
                    k1Var.h(l1Var, iArr[i11], cVar != null ? cVar.k(i13, l1Var.B, y3.m.A) : v1Var.f6473b.a(l1Var.B, i13), 0.0f);
                    i10++;
                    i11 = i12;
                }
                return g00.b0.a;
            case 1:
                l1.w wVar = (l1.w) this.C;
                v1.e eVar = (v1.e) this.D;
                u.c0 c0Var = (u.c0) this.E;
                if (obj == wVar) {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                if (obj instanceof z1.z) {
                    int i14 = eVar.f15334a - this.B;
                    int iD = c0Var.d(obj);
                    c0Var.g(Math.min(i14, iD >= 0 ? c0Var.f14833c[iD] : Integer.MAX_VALUE), obj);
                }
                return g00.b0.a;
            default:
                q0.d1 d1Var = (q0.d1) this.C;
                z2.y0 y0Var = (z2.y0) this.D;
                z2.l1 l1Var2 = (z2.l1) this.E;
                z2.k1 k1Var2 = (z2.k1) obj;
                int i15 = d1Var.B;
                q0.b2 b2Var = d1Var.A;
                r3.c0 c0Var2 = d1Var.C;
                q0.e2 e2Var = (q0.e2) d1Var.D.invoke();
                b2Var.a(d0.q1.B, q0.q.o(k1Var2, i15, c0Var2, e2Var != null ? e2Var.f12608a : null, y0Var.getLayoutDirection() == y3.m.B, l1Var2.A), this.B, l1Var2.A);
                z2.k1.k(k1Var2, l1Var2, Math.round(-b2Var.f12569a.h()), 0);
                return g00.b0.a;
        }
    }
}
