package no;

import a40.c0;
import a40.m0;
import a40.z;
import d40.p1;
import g00.b0;
import ri.t1;
import vn.s;

public final class c extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final d C;

    public c(d dVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = dVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c(this.C, cVar, 0);
            default:
                return new c(this.C, cVar, 1);
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
        return ((c) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.A;
        b0 b0Var = b0.a;
        d dVar = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return b0Var;
                }
                t1.O(obj);
                p1 p1Var = dVar.c.c;
                a1.c cVar = new a1.c(dVar, 14);
                this.B = 1;
                p1Var.collect(new b(cVar, 0), this);
                return aVar;
            default:
                s sVar = dVar.b;
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    sVar.getClass();
                    h40.e eVar = m0.a;
                    obj = c0.J(new d6.e(sVar, (k00.c) null, 8), h40.d.C, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    return b0Var;
                }
                sVar.b();
                return b0Var;
        }
    }
}
