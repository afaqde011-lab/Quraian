package v30;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class e extends r1.a {
    public final Object[] D;
    public final h E;

    public e(int i, int i2, int i3, Object[] root, Object[] tail) {
        super(i, i2, 1);
        m.e(root, "root");
        m.e(tail, "tail");
        this.D = tail;
        int i4 = (i2 - 1) & (-32);
        this.E = new h(root, i > i4 ? i4 : i, i4, i3);
    }

    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        h hVar = this.E;
        if (hVar.hasNext()) {
            ((r1.a) this).B++;
            return hVar.next();
        }
        int i = ((r1.a) this).B;
        ((r1.a) this).B = i + 1;
        return this.D[i - ((r1.a) hVar).C];
    }

    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = ((r1.a) this).B;
        h hVar = this.E;
        int i2 = ((r1.a) hVar).C;
        if (i <= i2) {
            ((r1.a) this).B = i - 1;
            return hVar.previous();
        }
        int i3 = i - 1;
        ((r1.a) this).B = i3;
        return this.D[i3 - i2];
    }
}
