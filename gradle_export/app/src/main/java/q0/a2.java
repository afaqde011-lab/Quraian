package q0;

import d0.n2;

public final class a2 implements n2 {

    public final n2 f12563a;

    public final l1.w f12564b;

    public final l1.w f12565c;

    public a2(n2 n2Var, final b2 b2Var) {
        this.f12563a = n2Var;
        final int i10 = 0;
        this.f12564b = l1.q.r(new u00.a() {
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        b2 b2Var2 = b2Var;
                        return Boolean.valueOf(b2Var2.f12569a.h() < b2Var2.f12570b.h());
                    default:
                        return Boolean.valueOf(b2Var.f12569a.h() > 0.0f);
                }
            }
        });
        final int i11 = 1;
        this.f12565c = l1.q.r(new u00.a() {
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        b2 b2Var2 = b2Var;
                        return Boolean.valueOf(b2Var2.f12569a.h() < b2Var2.f12570b.h());
                    default:
                        return Boolean.valueOf(b2Var.f12569a.h() > 0.0f);
                }
            }
        });
    }

    @Override
    public final boolean a() {
        return this.f12563a.a();
    }

    @Override
    public final boolean b() {
        return ((Boolean) this.f12565c.getValue()).booleanValue();
    }

    @Override
    public final Object c(z.b1 b1Var, u00.n nVar, m00.c cVar) {
        return this.f12563a.c(b1Var, nVar, cVar);
    }

    @Override
    public final boolean d() {
        return ((Boolean) this.f12564b.getValue()).booleanValue();
    }

    @Override
    public final float e(float f3) {
        return this.f12563a.e(f3);
    }
}
