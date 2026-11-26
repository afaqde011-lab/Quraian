package y30;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.d0;

public final class e extends t1.d {
    public final d E;
    public Object F;
    public boolean G;
    public int H;

    public e(d dVar) {
        Object obj = dVar.B;
        w30.d dVar2 = dVar.D;
        super(obj, dVar2, 2);
        this.E = dVar;
        this.H = dVar2.E;
    }

    public final Object next() {
        if (this.E.D.E != this.H) {
            throw new ConcurrentModificationException();
        }
        Object next = super.next();
        this.F = next;
        this.G = true;
        return next;
    }

    public final void remove() {
        if (!this.G) {
            throw new IllegalStateException();
        }
        Object obj = this.F;
        d dVar = this.E;
        d0.a(dVar).remove(obj);
        this.F = null;
        this.G = false;
        this.H = dVar.D.E;
        ((t1.d) this).D--;
    }
}
