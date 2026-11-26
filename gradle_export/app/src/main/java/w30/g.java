package w30;

import java.util.Iterator;

public final class g extends h00.j {
    public final int A;
    public final h00.i B;

    public g(h00.i iVar, int i) {
        this.A = i;
        this.B = iVar;
    }

    @Override
    public final int a() {
        switch (this.A) {
            case 0:
                return ((d) this.B).e();
            default:
                return ((x30.d) this.B).e();
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                ((d) this.B).clear();
                break;
            default:
                ((x30.d) this.B).clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                return ((d) this.B).containsKey(obj);
            default:
                return ((x30.d) this.B).D.containsKey(obj);
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                d builder = (d) this.B;
                kotlin.jvm.internal.m.e(builder, "builder");
                s1.l[] lVarArr = new s1.l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new l(1);
                }
                return new h(builder, lVarArr);
            default:
                return new x30.e((x30.d) this.B, 1);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                d dVar = (d) this.B;
                if (!dVar.containsKey(obj)) {
                    return false;
                }
                dVar.remove(obj);
                return true;
            default:
                x30.d dVar2 = (x30.d) this.B;
                if (!dVar2.D.containsKey(obj)) {
                    return false;
                }
                dVar2.remove(obj);
                return true;
        }
    }
}
