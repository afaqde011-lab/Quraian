package pl;

import a40.z;
import g00.b0;
import java.util.List;
import l1.p2;
import l1.z0;
import ri.t1;
import z1.s;

public final class l extends m00.i implements u00.n {
    public final boolean A;
    public final z0 B;
    public final p2 C;
    public final z0 D;
    public final z1.p E;
    public final float F;
    public final s G;

    public l(boolean z, z0 z0Var, p2 p2Var, z0 z0Var2, z1.p pVar, float f, s sVar, k00.c cVar) {
        super(2, cVar);
        this.A = z;
        this.B = z0Var;
        this.C = p2Var;
        this.D = z0Var2;
        this.E = pVar;
        this.F = f;
        this.G = sVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new l(this.A, this.B, this.C, this.D, this.E, this.F, this.G, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        l lVar = (l) create((z) obj, (k00.c) obj2);
        b0 b0Var = b0.a;
        lVar.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        boolean z = this.A;
        b0 b0Var = b0.a;
        if (z && !((Boolean) this.B.getValue()).booleanValue()) {
            p2 p2Var = this.C;
            if (((String) p2Var.getValue()).length() != 0) {
                z0 z0Var = this.D;
                if (!kotlin.jvm.internal.m.a((String) z0Var.getValue(), (String) p2Var.getValue())) {
                    List listN1 = h00.q.n1(this.G.D);
                    if (!listN1.isEmpty()) {
                        z1.p pVar = this.E;
                        pVar.clear();
                        pVar.addAll(f50.c.Y(this.F, listN1));
                    }
                    z0Var.setValue((String) p2Var.getValue());
                }
            }
        }
        return b0Var;
    }
}
