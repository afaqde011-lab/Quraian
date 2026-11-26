package ml;

import a40.c0;
import a40.z;
import g00.b0;
import k00.c;
import l1.z0;
import m00.i;
import ri.t1;
import u00.n;

public final class a extends i implements n {
    public final int A;
    public int B;
    public final boolean C;
    public final z0 D;

    public a(boolean z, z0 z0Var, c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = z;
        this.D = z0Var;
    }

    @Override
    public final c create(Object obj, c cVar) {
        switch (this.A) {
            case 0:
                return new a(this.C, this.D, cVar, 0);
            default:
                return new a(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        c cVar = (c) obj2;
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
                boolean z = this.C;
                if (i == 0) {
                    t1.O(obj);
                    if (z) {
                        this.B = 1;
                        if (c0.l(200L, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.setValue(Boolean.valueOf(z));
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                z0 z0Var = this.D;
                boolean z2 = this.C;
                if (i2 == 0) {
                    t1.O(obj);
                    if (z2 != ((Boolean) z0Var.getValue()).booleanValue()) {
                        this.B = 1;
                        if (c0.l(150L, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                z0Var.setValue(Boolean.valueOf(z2));
                return b0.a;
        }
    }
}
