package sn;

import a40.z;
import d6.a1;
import g00.b0;
import java.util.Iterator;
import java.util.Set;
import u00.n;

public final class h extends m00.i implements n {
    public Set A;
    public a1 B;
    public i C;
    public Iterator D;
    public String E;
    public int F;
    public int G;
    public final i H;
    public final long I;

    public h(i iVar, long j, k00.c cVar) {
        super(2, cVar);
        this.H = iVar;
        this.I = j;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new h(this.H, this.I, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: sn.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
