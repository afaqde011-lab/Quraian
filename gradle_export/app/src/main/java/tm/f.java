package tm;

import g00.b0;
import kotlin.jvm.internal.y;
import u00.k;
import u00.n;
import v2.i0;
import v2.s;

public final class f extends m00.h implements n {
    public s B;
    public i0 C;
    public n D;
    public i0 E;
    public y F;
    public long G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int L;
    public int M;
    public Object N;
    public final k O;
    public final n P;
    public final u00.a Q;
    public final k R;

    public f(k kVar, n nVar, u00.a aVar, k kVar2, k00.c cVar) {
        super(2, cVar);
        this.O = kVar;
        this.P = nVar;
        this.Q = aVar;
        this.R = kVar2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        f fVar = new f(this.O, this.P, this.Q, this.R, cVar);
        fVar.N = obj;
        return fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((i0) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        throw new UnsupportedOperationException("Method not decompiled: tm.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
