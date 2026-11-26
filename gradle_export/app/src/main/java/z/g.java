package z;

public final class g extends m00.i implements u00.n {
    public final int A;
    public final h B;

    public g(h hVar, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.B = hVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g(this.B, cVar, 0);
            default:
                return new g(this.B, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                g gVarCreate = create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                gVarCreate.invokeSuspend(b0Var);
                return b0Var;
            default:
                g gVarCreate2 = create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                gVarCreate2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    public final Object invokeSuspend(Object obj) {
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        k00.c cVar = null;
        h hVar = this.B;
        switch (i10) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                if (hVar.f16919c0 == null) {
                    f0.f fVar = new f0.f();
                    f0.i iVar = hVar.Q;
                    if (iVar != null) {
                        a40.c0.y(hVar.p1(), (k00.i) null, (a40.a0) null, new b(iVar, fVar, cVar, 0), 3);
                    }
                    hVar.f16919c0 = fVar;
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                f0.f fVar2 = hVar.f16919c0;
                if (fVar2 != null) {
                    f0.g gVar = new f0.g(fVar2);
                    f0.i iVar2 = hVar.Q;
                    if (iVar2 != null) {
                        a40.c0.y(hVar.p1(), (k00.i) null, (a40.a0) null, new b(iVar2, gVar, cVar, 1), 3);
                    }
                    hVar.f16919c0 = null;
                }
                break;
        }
        return b0Var;
    }
}
