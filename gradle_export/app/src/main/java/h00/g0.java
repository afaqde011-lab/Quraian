package h00;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class g0 extends f {
    public final int A = 0;
    public final Object B;

    public g0(List delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.B = delegate;
    }

    public g0(r30.h hVar) {
        this.B = hVar;
    }

    @Override
    public final int a() {
        switch (this.A) {
            case 0:
                return ((List) this.B).size();
            default:
                return ((r30.h) this.B).a.groupCount() + 1;
        }
    }

    @Override
    public boolean contains(Object obj) {
        switch (this.A) {
            case 1:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override
    public final Object get(int i) {
        switch (this.A) {
            case 0:
                return ((List) this.B).get(q.A0(i, this));
            default:
                String strGroup = ((r30.h) this.B).a.group(i);
                return strGroup == null ? "" : strGroup;
        }
    }

    @Override
    public int indexOf(Object obj) {
        switch (this.A) {
            case 1:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override
    public Iterator iterator() {
        switch (this.A) {
            case 0:
                return new e0(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override
    public int lastIndexOf(Object obj) {
        switch (this.A) {
            case 1:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override
    public ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new e0(this, 0);
            default:
                return super.listIterator();
        }
    }

    @Override
    public ListIterator listIterator(int i) {
        switch (this.A) {
            case 0:
                return new e0(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
