package q0;

public final class b2 {

    public static final s10.w0 f12568g = y1.k.b(new ou.a(17), new pp.d(12));

    public final l1.e1 f12569a;

    public final l1.e1 f12570b = new l1.e1(0.0f);

    public final l1.f1 f12571c = new l1.f1(0);

    public h2.c f12572d = h2.c.f6545e;

    public long f12573e = m3.q0.f10518b;

    public final l1.i1 f12574f;

    public b2(d0.q1 q1Var, float f3) {
        this.f12569a = new l1.e1(f3);
        this.f12574f = new l1.i1(q1Var, l1.c.G);
    }

    public final void a(d0.q1 q1Var, h2.c cVar, int i10, int i11) {
        float f3;
        float f10 = i11 - i10;
        this.f12570b.i(f10);
        float f11 = cVar.f6546a;
        float f12 = cVar.f6547b;
        h2.c cVar2 = this.f12572d;
        float f13 = cVar2.f6546a;
        l1.e1 e1Var = this.f12569a;
        if (f11 != f13 || f12 != cVar2.f6547b) {
            boolean z10 = q1Var == d0.q1.A;
            if (z10) {
                f11 = f12;
            }
            float f14 = z10 ? cVar.f6549d : cVar.f6548c;
            float fH = e1Var.h();
            float f15 = i10;
            float f16 = fH + f15;
            if (f14 <= f16 && (f11 >= fH || f14 - f11 <= f15)) {
                f3 = (f11 >= fH || f14 - f11 > f15) ? 0.0f : f11 - fH;
            } else {
                f3 = f14 - f16;
            }
            e1Var.i(e1Var.h() + f3);
            this.f12572d = cVar;
        }
        e1Var.i(ab.a0.x(e1Var.h(), 0.0f, f10));
        this.f12571c.i(i10);
    }
}
