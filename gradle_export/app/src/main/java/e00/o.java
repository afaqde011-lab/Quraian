package e00;

import b3.o0;
import d00.n0;
import d00.r0;
import d00.s0;
import i2.y;

public final class o implements c {
    public final d a;
    public l2.b b;
    public h2.e c;
    public y d;

    public o(d dVar) {
        this.a = dVar;
    }

    @Override
    public final void b(o0 o0Var, r0 context) {
        y yVarW;
        l2.b bVar;
        kotlin.jvm.internal.m.e(context, "context");
        n0 n0Var = context.a;
        s0 s0Var = n0Var.S;
        d dVar = this.a;
        dVar.o(s0Var);
        long jY = kh.n.Y(h2.e.g(1.0f, n0Var.X));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (jY & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jY >> 32))) << 32);
        l2.b bVar2 = this.b;
        if (bVar2 == null || bVar2.s) {
            yVarW = b3.m.w(n0Var);
            this.d = yVarW;
            bVar = this.b;
            if (bVar != null) {
                kotlin.jvm.internal.m.b(yVarW);
                yVarW.a(bVar);
            }
            y yVar = this.d;
            kotlin.jvm.internal.m.b(yVar);
            this.b = yVar.c();
            this.c = new h2.e(jFloatToRawIntBits);
        } else {
            h2.e eVar = this.c;
            if (!(eVar == null ? false : h2.e.a(eVar.a, jFloatToRawIntBits))) {
                yVarW = b3.m.w(n0Var);
                this.d = yVarW;
                bVar = this.b;
                if (bVar != null) {
                    kotlin.jvm.internal.m.b(yVarW);
                    yVarW.a(bVar);
                }
                y yVar2 = this.d;
                kotlin.jvm.internal.m.b(yVar2);
                this.b = yVar2.c();
                this.c = new h2.e(jFloatToRawIntBits);
            }
        }
        l2.b bVar3 = this.b;
        kotlin.jvm.internal.m.b(bVar3);
        l2.b bVarO = w00.a.o(o0Var, context, dVar.j(), 1.0f, n0Var.X, n0Var.Y, bVar3);
        if (bVarO == null) {
            return;
        }
        boolean zF = dVar.f();
        bVarO.h(zF);
        w00.a.p(o0Var, n0Var.Y ^ (-9223372034707292160L), h2.e.g(1.0f, o0Var.A.b()), zF, new b1.l(this, bVar3, context, 6));
    }

    @Override
    public final void c() {
        y yVar;
        l2.b bVar = this.b;
        if (bVar != null && (yVar = this.d) != null) {
            yVar.a(bVar);
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
