package ut;

import java.util.UUID;

public final class e extends m00.c {
    public yt.c A;
    public UUID B;
    public String C;
    public String D;
    public String E;
    public Object F;
    public final p G;
    public int H;

    public e(p pVar, m00.c cVar) {
        super(cVar);
        this.G = pVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.g(null, this);
    }
}
