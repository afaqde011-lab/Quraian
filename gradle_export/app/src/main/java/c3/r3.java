package c3;

import kotlin.NoWhenBranchMatchedException;

public final class r3 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final s3 C;

    public r3(s3 s3Var, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = s3Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new r3(this.C, cVar, 0);
            default:
                return new r3(this.C, cVar, 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return create(zVar, cVar).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i10 = this.B;
                g00.b0 b0Var = g00.b0.a;
                if (i10 == 0) {
                    ri.t1.O(obj);
                    z zVar = this.C.A;
                    this.B = 1;
                    Object objL = zVar.f2787c0.l(this);
                    if (objL != aVar) {
                        objL = b0Var;
                    }
                    if (objL == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i11 = this.B;
                g00.b0 b0Var2 = g00.b0.a;
                if (i11 == 0) {
                    ri.t1.O(obj);
                    z zVar2 = this.C.A;
                    this.B = 1;
                    Object objB = zVar2.f2789d0.b(this);
                    if (objB != aVar2) {
                        objB = b0Var2;
                    }
                    if (objB == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ri.t1.O(obj);
                }
                return b0Var2;
        }
    }
}
