package os;

import a40.z;
import g00.b0;
import ri.t1;

public final class j extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x C;
    public final int D;

    public j(x xVar, int i, k00.c cVar, int i2) {
        super(2, cVar);
        this.A = i2;
        this.C = xVar;
        this.D = i;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new j(this.C, this.D, cVar, 0);
            case 1:
                return new j(this.C, this.D, cVar, 1);
            default:
                return new j(this.C, this.D, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((j) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                try {
                    if (i == 0) {
                        t1.O(obj);
                        x xVar = this.C;
                        int i2 = this.D;
                        this.B = 1;
                        if (xVar.n(i2, false, this) == aVar) {
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
                return b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                try {
                    if (i3 == 0) {
                        t1.O(obj);
                        x xVar2 = this.C;
                        int i4 = this.D;
                        this.B = 1;
                        if (xVar2.n(i4, true, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused2) {
                }
                return b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i5 = this.B;
                try {
                    if (i5 == 0) {
                        t1.O(obj);
                        x xVar3 = this.C;
                        int i6 = this.D;
                        this.B = 1;
                        if (xVar3.n(i6, false, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                    }
                    break;
                } catch (Throwable unused3) {
                }
                return b0.a;
        }
    }
}
