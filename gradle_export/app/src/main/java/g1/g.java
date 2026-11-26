package g1;

public final class g extends m00.i implements u00.k {
    public int A;
    public final h B;
    public final float C;
    public final boolean D;
    public final x.i E;

    public g(h hVar, float f3, boolean z10, x.i iVar, k00.c cVar) {
        super(1, cVar);
        this.B = hVar;
        this.C = f3;
        this.D = z10;
        this.E = iVar;
    }

    public final k00.c create(k00.c cVar) {
        return new g(this.B, this.C, this.D, this.E, cVar);
    }

    public final Object invoke(Object obj) {
        return create((k00.c) obj).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: g1.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
