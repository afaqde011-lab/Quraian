package t1;

import com.google.android.gms.internal.measurement.x5;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.m;

public class d implements Iterator, v00.a {
    public final int A;
    public Object B;
    public final Map C;
    public int D;

    public d(Object obj, Map map, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                m.e(map, "hashMap");
                this.B = obj;
                this.C = map;
                break;
            case 2:
                m.e(map, "map");
                this.B = obj;
                this.C = map;
                break;
            default:
                this.B = obj;
                this.C = map;
                break;
        }
    }

    public x30.a a() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.C.get(this.B);
        if (obj != null) {
            x30.a aVar = (x30.a) obj;
            this.D++;
            this.B = aVar.c;
            return aVar;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.B + ") has changed after it was added to the persistent map.");
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.D < this.C.size();
            case 1:
                return this.D < this.C.size();
            default:
                return this.D < this.C.size();
        }
    }

    @Override
    public Object next() {
        switch (this.A) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.B;
                this.D++;
                Object obj2 = this.C.get(obj);
                if (obj2 == null) {
                    throw new ConcurrentModificationException(x5.l(obj, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                }
                this.B = ((a) obj2).f14326b;
                return obj;
            case 1:
                return a();
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.B;
                this.D++;
                Object obj4 = this.C.get(obj3);
                if (obj4 == null) {
                    throw new ConcurrentModificationException(x5.l(obj3, "Hash code of an element (", ") has changed after it was added to the persistent set."));
                }
                this.B = ((y30.a) obj4).b;
                return obj3;
        }
    }

    @Override
    public void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
