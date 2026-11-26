package br;

import a40.q;
import a40.z;
import g00.b0;
import ri.t1;
import u00.n;

public final class a extends m00.i implements n {
    public final int A;
    public int B;
    public final i C;

    public a(i iVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = iVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a(this.C, cVar, 0);
            default:
                return new a(this.C, cVar, 1);
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
        return ((a) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                i iVar = this.C;
                try {
                    if (i == 0) {
                        t1.O(obj);
                        this.B = 1;
                        if (i.c(iVar, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused) {
                }
                q qVar = iVar.k;
                b0 b0Var = b0.a;
                qVar.S(b0Var);
                iVar.f();
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (i.a(this.C, this) == aVar2) {
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
