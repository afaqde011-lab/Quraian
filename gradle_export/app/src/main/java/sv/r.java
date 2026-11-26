package sv;

import androidx.media3.common.q0;
import java.util.List;

public final class r extends m00.c {
    public q0 A;
    public List B;
    public List C;
    public List D;
    public int E;
    public Object F;
    public final p10.a G;
    public int H;

    public r(p10.a aVar, m00.c cVar) {
        super(cVar);
        this.G = aVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.p(null, null, this);
    }
}
