package e40;

import a40.z;
import ca.e0;
import g00.b0;
import ri.t1;

public final class g extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public Object C;
    public final i D;
    public final d40.j E;

    public g(i iVar, d40.j jVar, Object obj, k00.c cVar) {
        super(2, cVar);
        this.D = iVar;
        this.E = jVar;
        this.C = obj;
    }

    public g(i iVar, d40.j jVar, k00.c cVar) {
        super(2, cVar);
        this.D = iVar;
        this.E = jVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g(this.D, this.E, this.C, cVar);
            default:
                g gVar = new g(this.D, this.E, cVar);
                gVar.C = obj;
                return gVar;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((g) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    ?? r8 = this.D.E;
                    Object obj2 = this.C;
                    this.B = 1;
                    if (r8.invoke(this.E, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    z zVar = (z) this.C;
                    kotlin.jvm.internal.z zVar2 = new kotlin.jvm.internal.z();
                    i iVar = this.D;
                    d40.i iVar2 = iVar.D;
                    e0 e0Var = new e0(zVar2, zVar, iVar, this.E);
                    this.B = 1;
                    if (iVar2.collect(e0Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
