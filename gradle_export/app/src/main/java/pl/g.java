package pl;

import a40.z;
import g00.b0;
import h00.x;
import l1.e1;
import l1.f1;
import l1.y0;
import l1.z0;
import ri.t1;

public final class g extends m00.i implements u00.n {
    public float A;
    public float B;
    public int C;
    public final u00.a D;
    public final z0 E;
    public final z0 F;
    public final e1 G;
    public final z1.p H;
    public final z0 I;
    public final y0 J;

    public g(u00.a aVar, z0 z0Var, z0 z0Var2, e1 e1Var, z1.p pVar, z0 z0Var3, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.D = aVar;
        this.E = z0Var;
        this.F = z0Var2;
        this.G = e1Var;
        this.H = pVar;
        this.I = z0Var3;
        this.J = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new g(this.D, this.E, this.F, this.G, this.H, this.I, this.J, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        final float f;
        final float f2;
        l00.a aVar = l00.a.A;
        int i = this.C;
        b0 b0Var = b0.a;
        e1 e1Var = this.G;
        if (i == 0) {
            t1.O(obj);
            if (((Boolean) this.E.getValue()).booleanValue()) {
                z0 z0Var = this.F;
                if (!y3.l.b(((y3.l) z0Var.getValue()).a, 0L)) {
                    e1Var.i(0.0f);
                    float f3 = (int) (((y3.l) z0Var.getValue()).a >> 32);
                    f = (int) (((y3.l) z0Var.getValue()).a & 4294967295L);
                    f2 = f3;
                }
            }
            return b0Var;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        float f4 = this.B;
        float f5 = this.A;
        t1.O(obj);
        f = f4;
        f2 = f5;
        while (e1Var.h() < 1.0f) {
            final z1.p pVar = this.H;
            final e1 e1Var2 = this.G;
            final z0 z0Var2 = this.I;
            final y0 y0Var = this.J;
            u00.k kVar = new u00.k() {
                @Override
                public final Object invoke(Object obj2) {
                    ((Long) obj2).getClass();
                    e1 e1Var3 = e1Var2;
                    e1Var3.i(e1Var3.h() + 0.028f);
                    float fH = e1Var3.h();
                    z1.p pVar2 = pVar;
                    if (fH >= 1.0f) {
                        e1Var3.i(1.0f);
                        pVar2.clear();
                    } else {
                        z0 z0Var3 = z0Var2;
                        f50.c.e0(pVar2, Float.intBitsToFloat((int) (((h2.b) z0Var3.getValue()).a >> 32)), Float.intBitsToFloat((int) (((h2.b) z0Var3.getValue()).a & 4294967295L)), f2, f, e1Var3.h(), x.A, 1.0f);
                    }
                    f1 f1Var = y0Var;
                    int iH = f1Var.h();
                    f1Var.i(iH + 1);
                    return Integer.valueOf(iH);
                }
            };
            this.A = f2;
            this.B = f;
            this.C = 1;
            if (l1.q.u(getContext()).b0(kVar, this) == aVar) {
                return aVar;
            }
        }
        this.D.invoke();
        return b0Var;
    }
}
