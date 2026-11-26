package nf;

import java.util.Iterator;
import java.util.Map;

public final class s extends q {
    public final t D;

    public s(t tVar) {
        this.D = tVar;
    }

    @Override
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.D.get(entry.getKey());
            if (obj2 != null && obj2.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final f0 e() {
        return l().listIterator(0);
    }

    @Override
    public final int hashCode() {
        return b.b(this.D.entrySet());
    }

    @Override
    public final Iterator iterator() {
        return l().listIterator(0);
    }

    @Override
    public final o m() {
        return new r(this);
    }

    @Override
    public final int size() {
        return this.D.D.size();
    }
}
