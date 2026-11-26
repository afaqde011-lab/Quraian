package sn;

import android.content.ComponentName;
import java.util.Iterator;

public final class a extends m00.c {
    public d A;
    public ComponentName B;
    public int[] C;
    public Iterator D;
    public int E;
    public Object F;
    public final c G;
    public int H;

    public a(c cVar, m00.c cVar2) {
        super(cVar2);
        this.G = cVar;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.F = obj;
        this.H |= Integer.MIN_VALUE;
        return this.G.b(null, null, null, this);
    }
}
