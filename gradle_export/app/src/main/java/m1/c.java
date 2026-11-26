package m1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import u.o0;

public final class c implements List, v00.c {
    public final int A;
    public final Object B;
    public final int C;
    public int D;

    public c(List list, int i10, int i11, int i12) {
        this.A = i12;
        this.B = list;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final void add(int i10, Object obj) {
        switch (this.A) {
            case 0:
                this.B.add(i10 + this.C, obj);
                this.D++;
                break;
            default:
                this.B.add(i10 + this.C, obj);
                this.D++;
                break;
        }
    }

    @Override
    public final boolean add(Object obj) {
        switch (this.A) {
            case 0:
                int i10 = this.D;
                this.D = i10 + 1;
                this.B.add(i10, obj);
                break;
            default:
                int i11 = this.D;
                this.D = i11 + 1;
                this.B.add(i11, obj);
                break;
        }
        return true;
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        switch (this.A) {
            case 0:
                this.B.addAll(i10 + this.C, collection);
                int size = collection.size();
                this.D += size;
                return size > 0;
            default:
                m.e(collection, "elements");
                this.B.addAll(i10 + this.C, collection);
                this.D = collection.size() + this.D;
                return collection.size() > 0;
        }
    }

    @Override
    public final boolean addAll(Collection collection) {
        switch (this.A) {
            case 0:
                this.B.addAll(this.D, collection);
                int size = collection.size();
                this.D += size;
                return size > 0;
            default:
                m.e(collection, "elements");
                this.B.addAll(this.D, collection);
                this.D = collection.size() + this.D;
                return collection.size() > 0;
        }
    }

    @Override
    public final void clear() {
        switch (this.A) {
            case 0:
                int i10 = this.D - 1;
                int i11 = this.C;
                if (i11 <= i10) {
                    while (true) {
                        this.B.remove(i10);
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                this.D = i11;
                break;
            default:
                int i12 = this.D - 1;
                int i13 = this.C;
                if (i13 <= i12) {
                    while (true) {
                        this.B.remove(i12);
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                this.D = i13;
                break;
        }
    }

    @Override
    public final boolean contains(Object obj) {
        switch (this.A) {
            case 0:
                int i10 = this.D;
                for (int i11 = this.C; i11 < i10; i11++) {
                    if (m.a(this.B.get(i11), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i12 = this.D;
                for (int i13 = this.C; i13 < i12; i13++) {
                    if (m.a(this.B.get(i13), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final boolean containsAll(Collection collection) {
        switch (this.A) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                m.e(collection, "elements");
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override
    public final Object get(int i10) {
        switch (this.A) {
            case 0:
                f.a(i10, this);
                return this.B.get(i10 + this.C);
            default:
                o0.a(i10, this);
                return this.B.get(i10 + this.C);
        }
    }

    @Override
    public final int indexOf(Object obj) {
        switch (this.A) {
            case 0:
                int i10 = this.D;
                int i11 = this.C;
                for (int i12 = i11; i12 < i10; i12++) {
                    if (m.a(this.B.get(i12), obj)) {
                        return i12 - i11;
                    }
                }
                return -1;
            default:
                int i13 = this.D;
                int i14 = this.C;
                for (int i15 = i14; i15 < i13; i15++) {
                    if (m.a(this.B.get(i15), obj)) {
                        return i15 - i14;
                    }
                }
                return -1;
        }
    }

    @Override
    public final boolean isEmpty() {
        switch (this.A) {
            case 0:
                return this.D == this.C;
            default:
                return this.D == this.C;
        }
    }

    @Override
    public final Iterator iterator() {
        switch (this.A) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        switch (this.A) {
            case 0:
                int i10 = this.D - 1;
                int i11 = this.C;
                if (i11 <= i10) {
                    while (!m.a(this.B.get(i10), obj)) {
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                    return i10 - i11;
                }
                return -1;
            default:
                int i12 = this.D - 1;
                int i13 = this.C;
                if (i13 <= i12) {
                    while (!m.a(this.B.get(i12), obj)) {
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                    return i12 - i13;
                }
                return -1;
        }
    }

    @Override
    public final ListIterator listIterator() {
        switch (this.A) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override
    public final ListIterator listIterator(int i10) {
        switch (this.A) {
            case 0:
                return new d(i10, 0, this);
            default:
                return new d(i10, 1, this);
        }
    }

    @Override
    public final Object remove(int i10) {
        switch (this.A) {
            case 0:
                f.a(i10, this);
                Object objRemove = this.B.remove(i10 + this.C);
                this.D--;
                return objRemove;
            default:
                o0.a(i10, this);
                Object objRemove2 = this.B.remove(i10 + this.C);
                this.D--;
                return objRemove2;
        }
    }

    @Override
    public final boolean remove(Object obj) {
        switch (this.A) {
            case 0:
                int i10 = this.D;
                for (int i11 = this.C; i11 < i10; i11++) {
                    ?? r4 = this.B;
                    if (m.a(r4.get(i11), obj)) {
                        r4.remove(i11);
                        this.D--;
                        return true;
                    }
                }
                return false;
            default:
                int i12 = this.D;
                for (int i13 = this.C; i13 < i12; i13++) {
                    ?? r7 = this.B;
                    if (m.a(r7.get(i13), obj)) {
                        r7.remove(i13);
                        this.D--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final boolean removeAll(Collection collection) {
        switch (this.A) {
            case 0:
                int i10 = this.D;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                return i10 != this.D;
            default:
                m.e(collection, "elements");
                int i11 = this.D;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                return i11 != this.D;
        }
    }

    @Override
    public final boolean retainAll(Collection collection) {
        switch (this.A) {
            case 0:
                int i10 = this.D;
                int i11 = i10 - 1;
                int i12 = this.C;
                if (i12 <= i11) {
                    while (true) {
                        ?? r4 = this.B;
                        if (!collection.contains(r4.get(i11))) {
                            r4.remove(i11);
                            this.D--;
                        }
                        if (i11 != i12) {
                            i11--;
                        }
                    }
                }
                return i10 != this.D;
            default:
                m.e(collection, "elements");
                int i13 = this.D;
                int i14 = i13 - 1;
                int i15 = this.C;
                if (i15 <= i14) {
                    while (true) {
                        ?? r7 = this.B;
                        if (!collection.contains(r7.get(i14))) {
                            r7.remove(i14);
                            this.D--;
                        }
                        if (i14 != i15) {
                            i14--;
                        }
                    }
                }
                return i13 != this.D;
        }
    }

    @Override
    public final Object set(int i10, Object obj) {
        switch (this.A) {
            case 0:
                f.a(i10, this);
                return this.B.set(i10 + this.C, obj);
            default:
                o0.a(i10, this);
                return this.B.set(i10 + this.C, obj);
        }
    }

    @Override
    public final int size() {
        int i10;
        int i11;
        switch (this.A) {
            case 0:
                i10 = this.D;
                i11 = this.C;
                break;
            default:
                i10 = this.D;
                i11 = this.C;
                break;
        }
        return i10 - i11;
    }

    @Override
    public final List subList(int i10, int i11) {
        switch (this.A) {
            case 0:
                f.b(i10, i11, this);
                return new c(this, i10, i11, 0);
            default:
                o0.b(i10, i11, this);
                return new c(this, i10, i11, 1);
        }
    }

    @Override
    public final Object[] toArray() {
        switch (this.A) {
            case 0:
                break;
        }
        return l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        switch (this.A) {
            case 0:
                break;
            default:
                m.e(objArr, "array");
                break;
        }
        return l.c(this, objArr);
    }
}
