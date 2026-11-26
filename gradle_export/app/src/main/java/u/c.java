package u;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class c implements Iterator, Map.Entry {
    public int A;
    public int B = -1;
    public boolean C;
    public final e D;

    public c(e eVar) {
        this.D = eVar;
        this.A = eVar.C - 1;
    }

    @Override
    public final boolean equals(Object obj) {
        if (!this.C) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i10 = this.B;
        e eVar = this.D;
        return kotlin.jvm.internal.m.a(key, eVar.g(i10)) && kotlin.jvm.internal.m.a(entry.getValue(), eVar.j(this.B));
    }

    @Override
    public final Object getKey() {
        if (this.C) {
            return this.D.g(this.B);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final Object getValue() {
        if (this.C) {
            return this.D.j(this.B);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override
    public final boolean hasNext() {
        return this.B < this.A;
    }

    @Override
    public final int hashCode() {
        if (!this.C) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i10 = this.B;
        e eVar = this.D;
        Object objG = eVar.g(i10);
        Object objJ = eVar.j(this.B);
        return (objG == null ? 0 : objG.hashCode()) ^ (objJ != null ? objJ.hashCode() : 0);
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.B++;
        this.C = true;
        return this;
    }

    @Override
    public final void remove() {
        if (!this.C) {
            throw new IllegalStateException();
        }
        this.D.h(this.B);
        this.B--;
        this.A--;
        this.C = false;
    }

    @Override
    public final Object setValue(Object obj) {
        if (this.C) {
            return this.D.i(this.B, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
