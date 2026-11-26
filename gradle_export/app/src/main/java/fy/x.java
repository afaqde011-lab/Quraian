package fy;

import a40.u1;
import ri.t1;

public final class x extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final c0 C;
    public final int D;

    public x(c0 c0Var, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.C = c0Var;
        this.D = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new x(this.C, this.D, cVar, 0);
            default:
                return new x(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((x) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    c0 c0Var = this.C;
                    cy.a aVar2 = new cy.a(this.D);
                    this.B = 1;
                    if (c0.l(c0Var, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.C.p = "";
                u1 u1Var = this.C.n;
                if (u1Var != null) {
                    u1Var.i(null);
                }
                c0 c0Var2 = this.C;
                c0Var2.i(u.a((u) c0Var2.c.d.getValue(), "", ze.d.E(h00.x.A), null, null, false, false, null, null, null, 508));
                ab.a0.A0(this.C, new m(this.D));
                return g00.b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    c0 c0Var3 = this.C;
                    cy.b bVar = new cy.b(this.D);
                    this.B = 1;
                    if (c0.l(c0Var3, bVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.C.p = "";
                u1 u1Var2 = this.C.n;
                if (u1Var2 != null) {
                    u1Var2.i(null);
                }
                c0 c0Var4 = this.C;
                c0Var4.i(u.a((u) c0Var4.c.d.getValue(), "", ze.d.E(h00.x.A), null, null, false, false, null, null, null, 508));
                ab.a0.A0(this.C, new n(this.D));
                return g00.b0.a;
        }
    }
}
