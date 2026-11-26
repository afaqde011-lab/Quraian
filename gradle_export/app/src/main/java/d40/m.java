package d40;

public final class m extends m00.c {
    public Object A;
    public final androidx.lifecycle.h B;
    public int C;

    public m(androidx.lifecycle.h hVar, k00.c cVar) {
        super(cVar);
        this.B = hVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.emit((Object) null, this);
    }
}
