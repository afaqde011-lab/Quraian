package n00;

import h00.f;
import h00.n;
import java.io.Serializable;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;
import w.c;

public final class b extends f implements a, RandomAccess, Serializable {
    public final Enum[] A;

    public b(Enum[] entries) {
        m.e(entries, "entries");
        this.A = entries;
    }

    @Override
    public final int a() {
        return this.A.length;
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) n.I0(r3.ordinal(), this.A)) == r3;
    }

    @Override
    public final Object get(int i) {
        Enum[] enumArr = this.A;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(c.h(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) n.I0(iOrdinal, this.A)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) n.I0(iOrdinal, this.A)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
