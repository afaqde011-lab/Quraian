package yw;

import a5.f;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public final class a extends m00.c {
    public OutputStream A;
    public ByteArrayOutputStream B;
    public Object C;
    public final f D;
    public int E;

    public a(f fVar, k00.c cVar) {
        super(cVar);
        this.D = fVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return this.D.writeTo((Object) null, (OutputStream) null, this);
    }
}
