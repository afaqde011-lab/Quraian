package t1;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.d0;

public final class e extends d {
    public final c E;
    public Object F;
    public boolean G;
    public int H;

    public e(c cVar) {
        Object obj = cVar.B;
        s1.e eVar = cVar.D;
        super(obj, eVar, 0);
        this.E = cVar;
        this.H = eVar.E;
    }

    @Override
    public final Object next() {
        if (this.E.D.E != this.H) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.F = next;
        this.G = true;
        return next;
    }

    @Override
    public final void remove() {
        if (!this.G) {
            throw new IllegalStateException();
        }
        Object obj = this.F;
        c cVar = this.E;
        d0.a(cVar).remove(obj);
        this.F = null;
        this.G = false;
        this.H = cVar.D.E;
        this.D--;
    }
}
