package ev;

import ri.t1;

public final class b0 extends m00.i implements u00.n {
    public boolean A;
    public int B;
    public final c0 C;
    public final int D;
    public final int E;
    public final boolean F;

    public b0(c0 c0Var, int i, int i2, boolean z, k00.c cVar) {
        super(2, cVar);
        this.C = c0Var;
        this.D = i;
        this.E = i2;
        this.F = z;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new b0(this.C, this.D, this.E, this.F, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        Object objK;
        boolean zBooleanValue;
        Object objQ;
        boolean zBooleanValue2;
        c0 c0Var = this.C;
        uu.a aVar = c0Var.d;
        pm.b bVar = c0Var.c;
        l00.a aVar2 = l00.a.A;
        int i = this.B;
        g00.b0 b0Var = g00.b0.a;
        int i2 = this.E;
        int i3 = this.D;
        if (i == 0) {
            t1.O(obj);
            this.B = 1;
            objK = ((uu.w) aVar).k(i3, i2, this);
            if (objK != aVar2) {
            }
            return aVar2;
        }
        if (i == 1) {
            t1.O(obj);
            objK = obj;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            boolean z = this.A;
            t1.O(obj);
            zBooleanValue = z;
            objQ = obj;
        }
        zBooleanValue2 = ((Boolean) objQ).booleanValue();
        t tVar = (t) bVar.d.getValue();
        if (!zBooleanValue2) {
            i3 = ((t) bVar.d.getValue()).d;
        }
        c0Var.i(t.a(tVar, null, false, null, i3, this.D, null, null, false, false, false, null, false, 3559));
        this.A = zBooleanValue;
        this.B = 3;
        if (bVar.a(k.a, this) != aVar2) {
            return aVar2;
        }
        return b0Var;
        zBooleanValue = ((Boolean) objK).booleanValue();
        if (!this.F && !zBooleanValue) {
            c0Var.i(t.a((t) bVar.d.getValue(), null, false, null, 0, 0, null, null, false, false, true, null, false, 3583));
            return b0Var;
        }
        this.A = zBooleanValue;
        this.B = 2;
        objQ = ((uu.w) aVar).q(i3, i2, this);
        if (objQ != aVar2) {
            zBooleanValue2 = ((Boolean) objQ).booleanValue();
            t tVar2 = (t) bVar.d.getValue();
            if (!zBooleanValue2) {
                i3 = ((t) bVar.d.getValue()).d;
            }
            c0Var.i(t.a(tVar2, null, false, null, i3, this.D, null, null, false, false, false, null, false, 3559));
            this.A = zBooleanValue;
            this.B = 3;
            if (bVar.a(k.a, this) != aVar2) {
                return b0Var;
            }
        }
        return aVar2;
    }
}
