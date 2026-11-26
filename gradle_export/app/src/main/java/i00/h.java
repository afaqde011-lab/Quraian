package i00;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import s1.l;

public final class h extends AbstractCollection implements Collection, v00.b {
    public final int A;
    public final Object B;

    public h(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean addAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                ((f) this.B).clear();
                break;
            case 1:
                ((s1.e) this.B).clear();
                break;
            case 2:
                ((w30.d) this.B).clear();
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
                return ((f) this.B).containsValue(obj);
            case 1:
                return ((s1.e) this.B).containsValue(obj);
            case 2:
                return ((w30.d) this.B).containsValue(obj);
            default:
                return ((x30.d) this.B).containsValue(obj);
        }
    }

    @Override
    public boolean isEmpty() {
        switch (this.A) {
            case 0:
                return ((f) this.B).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                f fVar = (f) this.B;
                fVar.getClass();
                return new c(fVar, 2);
            case 1:
                s1.e eVar = (s1.e) this.B;
                l[] lVarArr = new l[8];
                for (int i = 0; i < 8; i++) {
                    lVarArr[i] = new s1.m(2);
                }
                return new s1.h(eVar, lVarArr);
            case 2:
                w30.d builder = (w30.d) this.B;
                m.e(builder, "builder");
                l[] lVarArr2 = new l[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    lVarArr2[i2] = new w30.l(2);
                }
                return new w30.h(builder, lVarArr2);
            default:
                return new x30.e((x30.d) this.B, 2);
        }
    }

    @Override
    public boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                f fVar = (f) this.B;
                fVar.e();
                int iL = fVar.l(obj);
                if (iL < 0) {
                    return false;
                }
                fVar.o(iL);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override
    public boolean removeAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                ((f) this.B).e();
                break;
        }
        return super.removeAll(elements);
    }

    @Override
    public boolean retainAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                ((f) this.B).e();
                break;
        }
        return super.retainAll(elements);
    }

    @Override
    public final int size() {
        switch (this.A) {
            case 0:
                return ((f) this.B).I;
            case 1:
                return ((s1.e) this.B).e();
            case 2:
                return ((w30.d) this.B).e();
            default:
                return ((x30.d) this.B).e();
        }
    }
}
