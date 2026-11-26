package g1;

public final class h implements b8 {

    public final b8 f5807a;

    public final b3.f2 f5808b;

    public float f5810d;

    public float f5811e;

    public x.b f5812f;

    public final l1.i1 f5809c = l1.q.z(new y3.f(0));

    public final z.e1 f5813g = new z.e1();

    public h(b8 b8Var, b3.f2 f2Var) {
        this.f5807a = b8Var;
        this.f5808b = f2Var;
        this.f5810d = ((b8Var.g() % 12) * 0.5235988f) - 1.5707964f;
        this.f5811e = (b8Var.c() * 0.10471976f) - 1.5707964f;
        this.f5812f = x.c.a(this.f5810d, 0.01f);
    }

    public static float j(float f3) {
        double d3 = ((double) f3) % 6.283185307179586d;
        if (d3 < 0.0d) {
            d3 += 6.283185307179586d;
        }
        return (float) d3;
    }

    @Override
    public final void a(int i10) {
        this.f5810d = ((i10 % 12) * 0.5235988f) - 1.5707964f;
        b8 b8Var = this.f5807a;
        b8Var.a(i10);
        if (b8Var.e() == 0) {
            this.f5812f = x.c.a(this.f5810d, 0.01f);
        }
    }

    @Override
    public final void b(int i10) {
        this.f5811e = (i10 * 0.10471976f) - 1.5707964f;
        b8 b8Var = this.f5807a;
        b8Var.b(i10);
        if (b8Var.e() == 1) {
            this.f5812f = x.c.a(this.f5811e, 0.01f);
        }
        z1.f fVarF = z1.q.f();
        u00.k kVarE = fVarF != null ? fVarF.e() : null;
        z1.f fVarK = z1.q.k(fVarF);
        try {
            b8Var.b(b8Var.c());
        } finally {
            z1.q.n(fVarF, fVarK, kVarE);
        }
    }

    @Override
    public final int c() {
        return this.f5807a.c();
    }

    @Override
    public final void d(int i10) {
        this.f5807a.d(i10);
    }

    @Override
    public final int e() {
        return this.f5807a.e();
    }

    @Override
    public final boolean f() {
        return this.f5807a.f();
    }

    @Override
    public final int g() {
        return this.f5807a.g();
    }

    public final float h(float f3) {
        float fFloatValue = ((Number) this.f5812f.d()).floatValue() - f3;
        while (fFloatValue > 3.1415927f) {
            fFloatValue -= 6.2831855f;
        }
        while (fFloatValue <= -3.1415927f) {
            fFloatValue += 6.2831855f;
        }
        return ((Number) this.f5812f.d()).floatValue() - fFloatValue;
    }

    public final float i() {
        return ((y3.f) this.f5809c.getValue()).A;
    }
}
