package i00;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public final class c extends e implements Iterator, v00.a {
    public final int E;

    public c(f map, int i) {
        this.E = i;
        m.e(map, "map");
        this.D = map;
        this.B = -1;
        this.C = map.H;
        h();
    }

    @Override
    public final Object next() {
        switch (this.E) {
            case 0:
                c();
                int i = this.A;
                f fVar = (f) this.D;
                if (i >= fVar.F) {
                    throw new NoSuchElementException();
                }
                this.A = i + 1;
                this.B = i;
                d dVar = new d(fVar, i);
                h();
                return dVar;
            case 1:
                c();
                int i2 = this.A;
                f fVar2 = (f) this.D;
                if (i2 >= fVar2.F) {
                    throw new NoSuchElementException();
                }
                this.A = i2 + 1;
                this.B = i2;
                Object obj = fVar2.A[i2];
                h();
                return obj;
            default:
                c();
                int i3 = this.A;
                f fVar3 = (f) this.D;
                if (i3 >= fVar3.F) {
                    throw new NoSuchElementException();
                }
                this.A = i3 + 1;
                this.B = i3;
                Object[] objArr = fVar3.B;
                m.b(objArr);
                Object obj2 = objArr[this.B];
                h();
                return obj2;
        }
    }
}
