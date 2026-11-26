package xk;

import a40.z;
import g00.b0;
import m00.i;
import u00.n;

public final class a extends i implements n {
    public int A;
    public int B;
    public int C;
    public int D;
    public x.b E;
    public int F;
    public final boolean G;
    public final x.b H;

    public a(boolean z, x.b bVar, k00.c cVar) {
        super(2, cVar);
        this.G = z;
        this.H = bVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new a(this.G, this.H, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        throw new UnsupportedOperationException("Method not decompiled: xk.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
