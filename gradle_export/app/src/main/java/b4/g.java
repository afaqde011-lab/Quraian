package b4;

import g00.b0;

public final class g extends m00.i implements u00.n {
    public int A;
    public final boolean B;
    public final j C;
    public final long D;

    public g(boolean z10, j jVar, long j9, k00.c cVar) {
        super(2, cVar);
        this.B = z10;
        this.C = jVar;
        this.D = j9;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        return new g(this.B, this.C, this.D, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((a40.z) obj, (k00.c) obj2).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: b4.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
