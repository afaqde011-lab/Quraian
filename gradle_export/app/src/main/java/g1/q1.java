package g1;

public abstract class q1 {

    public static final h0.p1 f5937a;

    public static final float f5938b;

    public static final float f5939c = 12;

    static {
        float f3 = 8;
        f5937a = h0.c.g(0.0f, 0.0f, 6, f3, 3);
        f5938b = f3;
    }

    public static final void a(final u00.a aVar, final v1.c cVar, b2.r rVar, final u00.n nVar, i2.t0 t0Var, float f3, final h1 h1Var, c4.v vVar, final v1.c cVar2, l1.j jVar, final int i10) {
        u00.a aVar2;
        int i11;
        u00.n nVar2;
        final b2.r rVar2;
        final i2.t0 t0Var2;
        final float f10;
        final c4.v vVar2;
        int i12;
        b2.r rVar3;
        i2.t0 t0Var3;
        float f11;
        c4.v vVar3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(219718641);
        if ((i10 & 6) == 0) {
            aVar2 = aVar;
            i11 = (g0Var.i(aVar2) ? 4 : 2) | i10;
        } else {
            aVar2 = aVar;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i10 & 3072) == 0) {
            nVar2 = nVar;
            i13 |= g0Var.i(nVar2) ? 2048 : 1024;
        } else {
            nVar2 = nVar;
        }
        if ((i10 & 24576) == 0) {
            i13 |= 8192;
        }
        int i14 = i13 | 196608;
        if ((1572864 & i10) == 0) {
            i14 |= g0Var.g(h1Var) ? 1048576 : 524288;
        }
        int i15 = i14 | 12582912;
        if ((100663296 & i10) == 0) {
            i15 |= g0Var.i(cVar2) ? 67108864 : 33554432;
        }
        if (g0Var.S(i15 & 1, (38347923 & i15) != 38347922)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                l1 l1Var = l1.f5852a;
                i2.t0 t0VarA = g6.a(k1.h.f8742c, g0Var);
                i12 = i15 & (-57345);
                float f12 = l1.f5854c;
                c4.v vVar4 = new c4.v(3, false);
                rVar3 = b2.o.A;
                t0Var3 = t0VarA;
                f11 = f12;
                vVar3 = vVar4;
            } else {
                g0Var.V();
                i12 = i15 & (-57345);
                rVar3 = rVar;
                t0Var3 = t0Var;
                f11 = f3;
                vVar3 = vVar;
            }
            g0Var.s();
            int i16 = i12;
            e.b(aVar2, h0.z1.t(rVar3, b2.b.K, false), vVar3, v1.d.d(1108953335, new p1(t0Var3, h1Var, f11, cVar2, nVar2, cVar), g0Var), g0Var, ((i16 >> 15) & 896) | (i16 & 14) | 3072);
            rVar2 = rVar3;
            t0Var2 = t0Var3;
            f10 = f11;
            vVar2 = vVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
            t0Var2 = t0Var;
            f10 = f3;
            vVar2 = vVar;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q1.a(aVar, cVar, rVar2, nVar, t0Var2, f10, h1Var, vVar2, cVar2, (l1.j) obj, l1.q.K(i10 | 1));
                    return g00.b0.a;
                }
            };
        }
    }
}
