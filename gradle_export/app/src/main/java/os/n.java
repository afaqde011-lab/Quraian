package os;

import a40.z;
import g00.b0;
import ri.t1;

public final class n extends m00.i implements u00.n {
    public Object A;
    public j40.c B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final x I;

    public n(x xVar, k00.c cVar) {
        super(2, cVar);
        this.I = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new n(this.I, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        x xVar;
        j40.c cVar;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Throwable th;
        j40.a aVar;
        l00.a aVar2 = l00.a.A;
        int i6 = this.H;
        try {
            try {
                if (i6 == 0) {
                    t1.O(obj);
                    xVar = this.I;
                    cVar = xVar.q;
                    this.A = xVar;
                    this.B = cVar;
                    i = 0;
                    this.C = 0;
                    this.D = 0;
                    this.E = 0;
                    this.F = 0;
                    this.G = 0;
                    this.H = 1;
                    if (cVar.l(this) != aVar2) {
                        i2 = 0;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                    }
                    return aVar2;
                }
                if (i6 != 1) {
                    if (i6 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (j40.a) this.A;
                    try {
                        t1.O(obj);
                        aVar.i(null);
                        return b0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar.i(null);
                        throw th;
                    }
                }
                i = this.G;
                i2 = this.F;
                i3 = this.E;
                i4 = this.D;
                i5 = this.C;
                j40.c cVar2 = this.B;
                xVar = (x) this.A;
                t1.O(obj);
                cVar = cVar2;
                this.A = cVar;
                this.B = null;
                this.C = i5;
                this.D = i4;
                this.E = i3;
                this.F = i2;
                this.G = i;
                this.H = 2;
                if (x.c(xVar, this) != aVar2) {
                    aVar = cVar;
                    aVar.i(null);
                    return b0.a;
                }
                return aVar2;
            } catch (Throwable th3) {
                j40.c cVar3 = cVar;
                th = th3;
                aVar = cVar3;
                aVar.i(null);
                throw th;
            }
        } catch (Throwable unused) {
        }
    }
}
