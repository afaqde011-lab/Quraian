package x30;

import java.util.Iterator;
import kotlin.jvm.internal.m;

public final class e implements Iterator, v00.a {
    public final int A;
    public final f B;

    public e(d map, int i) {
        this.A = i;
        switch (i) {
            case 1:
                m.e(map, "map");
                this.B = new f(map.B, map);
                break;
            case 2:
                m.e(map, "map");
                this.B = new f(map.B, map);
                break;
            default:
                m.e(map, "map");
                this.B = new f(map.B, map);
                break;
        }
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                f fVar = this.B;
                return new w30.a(fVar.B.D, fVar.C, fVar.next());
            case 1:
                f fVar2 = this.B;
                fVar2.next();
                return fVar2.C;
            default:
                return this.B.next().a;
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                this.B.remove();
                break;
            case 1:
                this.B.remove();
                break;
            default:
                this.B.remove();
                break;
        }
    }
}
