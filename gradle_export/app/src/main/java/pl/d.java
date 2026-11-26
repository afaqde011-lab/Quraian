package pl;

import a40.z;
import com.google.android.gms.internal.measurement.g4;
import g00.b0;
import l1.e1;
import l1.z0;
import ri.t1;

public final class d extends m00.i implements u00.n {
    public final boolean A;
    public final z1.p B;
    public final z0 C;
    public final e1 D;
    public final z0 E;
    public final float F;

    public d(boolean z, z1.p pVar, z0 z0Var, e1 e1Var, z0 z0Var2, float f, k00.c cVar) {
        super(2, cVar);
        this.A = z;
        this.B = pVar;
        this.C = z0Var;
        this.D = e1Var;
        this.E = z0Var2;
        this.F = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new d(this.A, this.B, this.C, this.D, this.E, this.F, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        d dVar = (d) create((z) obj, (k00.c) obj2);
        b0 b0Var = b0.a;
        dVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        boolean z = this.A;
        z1.p pVar = this.B;
        e1 e1Var = this.D;
        z0 z0Var = this.C;
        if (z) {
            z0Var.setValue(Boolean.FALSE);
            e1Var.i(0.0f);
            z0 z0Var2 = this.E;
            if (!y3.l.b(g4.l(z0Var2), 0L)) {
                g4.m(pVar, this.F, (int) (((y3.l) z0Var2.getValue()).a >> 32), (int) (((y3.l) z0Var2.getValue()).a & 4294967295L));
            }
        } else {
            z0Var.setValue(Boolean.FALSE);
            e1Var.i(0.0f);
            pVar.clear();
        }
        return b0.a;
    }
}
