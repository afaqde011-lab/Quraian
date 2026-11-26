package d40;

import ri.t1;

public final class z implements i {
    public final int A;
    public final i B;
    public final m00.i C;

    public z(i iVar, u00.n nVar, int i) {
        this.A = i;
        switch (i) {
            case 1:
                this.B = iVar;
                this.C = (m00.i) nVar;
                break;
            default:
                this.B = iVar;
                this.C = (m00.i) nVar;
                break;
        }
    }

    public z(i iVar, u00.o oVar) {
        this.A = 2;
        this.B = iVar;
        this.C = (m00.i) oVar;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) {
        q0 q0Var;
        kotlin.jvm.internal.z zVar;
        switch (this.A) {
            case 0:
                Object objCollect = this.B.collect(new g(new kotlin.jvm.internal.v(), jVar, (u00.n) this.C), cVar);
                return objCollect == l00.a.A ? objCollect : g00.b0.a;
            case 1:
                Object objCollect2 = this.B.collect(new b1.g(jVar, (u00.n) this.C), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : g00.b0.a;
            default:
                if (cVar instanceof q0) {
                    q0Var = (q0) cVar;
                    int i = q0Var.B;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        q0Var.B = i - Integer.MIN_VALUE;
                    } else {
                        q0Var = new q0(this, cVar);
                    }
                } else {
                    q0Var = new q0(this, cVar);
                }
                Object obj = q0Var.A;
                l00.a aVar = l00.a.A;
                int i2 = q0Var.B;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.jvm.internal.z zVar2 = q0Var.F;
                        jVar = q0Var.E;
                        z zVar3 = q0Var.D;
                        t1.O(obj);
                        zVar = zVar2;
                        this = zVar3;
                    } else {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    return g00.b0.a;
                }
                t1.O(obj);
                zVar = new kotlin.jvm.internal.z();
                zVar.A = null;
                q0Var.D = this;
                q0Var.E = jVar;
                q0Var.F = zVar;
                q0Var.B = 1;
                if (jVar.emit(null, q0Var) == aVar) {
                    return aVar;
                }
                i iVar = this.B;
                g gVar = new g(zVar, (u00.o) this.C, jVar);
                q0Var.D = null;
                q0Var.E = null;
                q0Var.F = null;
                q0Var.B = 2;
                if (iVar.collect(gVar, q0Var) == aVar) {
                    return aVar;
                }
                return g00.b0.a;
        }
    }
}
