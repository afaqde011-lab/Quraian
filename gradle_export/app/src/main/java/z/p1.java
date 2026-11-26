package z;

import d0.n2;

public final class p1 implements n2 {

    public static final s10.w0 f16950j = new s10.w0(new yq.a(10), new y0(3), 15);

    public final l1.f1 f16951a;

    public float f16956f;

    public final l1.w f16958h;

    public final l1.w f16959i;

    public final l1.f1 f16952b = new l1.f1(0);

    public final l1.f1 f16953c = new l1.f1(0);

    public final f0.i f16954d = new f0.i();

    public final l1.f1 f16955e = new l1.f1(Integer.MAX_VALUE);

    public final d0.n f16957g = new d0.n(new q0.a(this, 26));

    public p1(int i10) {
        this.f16951a = new l1.f1(i10);
        final int i11 = 0;
        this.f16958h = l1.q.r(new u00.a(this) {
            public final p1 B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i11) {
                    case 0:
                        p1 p1Var = this.B;
                        return Boolean.valueOf(p1Var.f16951a.h() < p1Var.f16955e.h());
                    default:
                        return Boolean.valueOf(this.B.f16951a.h() > 0);
                }
            }
        });
        final int i12 = 1;
        this.f16959i = l1.q.r(new u00.a(this) {
            public final p1 B;

            {
                this.B = this;
            }

            public final Object invoke() {
                switch (i12) {
                    case 0:
                        p1 p1Var = this.B;
                        return Boolean.valueOf(p1Var.f16951a.h() < p1Var.f16955e.h());
                    default:
                        return Boolean.valueOf(this.B.f16951a.h() > 0);
                }
            }
        });
    }

    @Override
    public final boolean a() {
        return this.f16957g.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.f16959i.getValue()).booleanValue();
    }

    @Override
    public final Object c(b1 b1Var, u00.n nVar, m00.c cVar) {
        Object objC = this.f16957g.c(b1Var, nVar, cVar);
        return objC == l00.a.A ? objC : g00.b0.a;
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.f16958h.getValue()).booleanValue();
    }

    @Override
    public final float e(float f3) {
        return this.f16957g.e(f3);
    }

    public final void f(int i10) {
        l1.f1 f1Var = this.f16951a;
        this.f16955e.i(i10);
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            if (f1Var.h() > i10) {
                f1Var.i(i10);
            }
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }
}
