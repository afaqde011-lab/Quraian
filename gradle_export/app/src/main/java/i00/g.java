package i00;

import h00.j;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;

public final class g extends j {
    public final int A;
    public final f B;

    public g(f fVar, int i) {
        this.A = i;
        this.B = fVar;
    }

    @Override
    public final int a() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.I;
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                Map.Entry element = (Map.Entry) obj;
                m.e(element, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final boolean addAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                m.e(elements, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                this.B.clear();
                break;
            default:
                this.B.clear();
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.B.i((Map.Entry) obj);
            default:
                return this.B.containsKey(obj);
        }
    }

    @Override
    public boolean containsAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                return this.B.h(elements);
            default:
                return super.containsAll(elements);
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                f fVar = this.B;
                fVar.getClass();
                return new c(fVar, 0);
            default:
                f fVar2 = this.B;
                fVar2.getClass();
                return new c(fVar2, 1);
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                f fVar = this.B;
                fVar.getClass();
                fVar.e();
                int iK = fVar.k(entry.getKey());
                if (iK < 0) {
                    return false;
                }
                Object[] objArr = fVar.B;
                m.b(objArr);
                if (!m.a(objArr[iK], entry.getValue())) {
                    return false;
                }
                fVar.o(iK);
                return true;
            default:
                f fVar2 = this.B;
                fVar2.e();
                int iK2 = fVar2.k(obj);
                if (iK2 < 0) {
                    return false;
                }
                fVar2.o(iK2);
                return true;
        }
    }

    @Override
    public final boolean removeAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                this.B.e();
                break;
            default:
                m.e(elements, "elements");
                this.B.e();
                break;
        }
        return super.removeAll(elements);
    }

    @Override
    public final boolean retainAll(Collection elements) {
        switch (this.A) {
            case 0:
                m.e(elements, "elements");
                this.B.e();
                break;
            default:
                m.e(elements, "elements");
                this.B.e();
                break;
        }
        return super.retainAll(elements);
    }
}
