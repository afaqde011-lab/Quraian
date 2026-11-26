package m2;

import b3.o0;
import hf.c;
import i2.e;
import i2.m;

public abstract class b {
    public e A;
    public m B;
    public float C = 1.0f;
    public y3.m D = y3.m.A;

    public abstract void a(float f3);

    public abstract void e(m mVar);

    public void f(y3.m mVar) {
    }

    public final void g(o0 o0Var, long j9, float f3, m mVar) {
        k2.b bVar = o0Var.A;
        if (this.C != f3) {
            a(f3);
            this.C = f3;
        }
        if (!kotlin.jvm.internal.m.a(this.B, mVar)) {
            e(mVar);
            this.B = mVar;
        }
        y3.m layoutDirection = o0Var.getLayoutDirection();
        if (this.D != layoutDirection) {
            f(layoutDirection);
            this.D = layoutDirection;
        }
        int i10 = (int) (j9 >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.b() >> 32)) - Float.intBitsToFloat(i10);
        int i11 = (int) (j9 & 4294967295L);
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (bVar.b() & 4294967295L)) - Float.intBitsToFloat(i11);
        ((c) bVar.B.B).D(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2);
        if (f3 > 0.0f) {
            try {
                if (Float.intBitsToFloat(i10) > 0.0f && Float.intBitsToFloat(i11) > 0.0f) {
                    i(o0Var);
                }
            } finally {
                ((c) bVar.B.B).D(-0.0f, -0.0f, -fIntBitsToFloat, -fIntBitsToFloat2);
            }
        }
    }

    public abstract long h();

    public abstract void i(o0 o0Var);
}
