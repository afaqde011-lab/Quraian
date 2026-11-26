package g1;

public final class p0 implements z2.g0 {
    @Override
    public final z2.x0 e(z2.y0 y0Var, z2.v0 v0Var, long j9) {
        float f3;
        float fH0 = y0Var.h0(y3.a.g(j9));
        if (y3.f.a(fH0, z7.f6057n) >= 0) {
            f3 = k1.d0.f8590b;
        } else {
            f3 = y3.f.a(fH0, z7.f6058o) >= 0 ? z7.f6059p : z7.f6060q;
        }
        int iR0 = y0Var.R0(f3);
        if (!((iR0 >= 0) & (iR0 >= 0))) {
            y3.i.a("width and height must be >= 0");
        }
        z2.l1 l1VarO = v0Var.O(y3.b.h(iR0, iR0, iR0, iR0));
        return y0Var.o0(l1VarO.A, l1VarO.B, h00.y.A, new a1.q2(l1VarO, 3));
    }
}
