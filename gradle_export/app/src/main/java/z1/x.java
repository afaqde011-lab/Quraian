package z1;

import java.util.ConcurrentModificationException;
import java.util.Map;

public final class x implements Map.Entry, v00.d {
    public final Object A;
    public Object B;
    public final y C;

    public x(y yVar) {
        this.C = yVar;
        Map.Entry entry = yVar.D;
        kotlin.jvm.internal.m.b(entry);
        this.A = entry.getKey();
        Map.Entry entry2 = yVar.D;
        kotlin.jvm.internal.m.b(entry2);
        this.B = entry2.getValue();
    }

    @Override
    public final Object getKey() {
        return this.A;
    }

    @Override
    public final Object getValue() {
        return this.B;
    }

    @Override
    public final Object setValue(Object obj) {
        y yVar = this.C;
        if (yVar.A.h().f17052d != yVar.C) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.B;
        yVar.A.put(this.A, obj);
        this.B = obj;
        return obj2;
    }
}
