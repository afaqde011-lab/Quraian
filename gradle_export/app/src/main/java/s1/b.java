package s1;

import java.util.NoSuchElementException;

public final class b extends a implements v00.d {
    public final n30.g D;
    public Object E;

    public b(n30.g gVar, Object obj, Object obj2) {
        super(obj, obj2, 0);
        this.D = gVar;
        this.E = obj2;
    }

    @Override
    public final Object getValue() {
        return this.E;
    }

    @Override
    public final Object setValue(Object obj) {
        Object obj2 = this.E;
        this.E = obj;
        f fVar = (f) this.D.B;
        e eVar = fVar.E;
        Object obj3 = this.B;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z10 = fVar.C;
        if (!z10) {
            eVar.put(obj3, obj);
        } else {
            if (!z10) {
                throw new NoSuchElementException();
            }
            l lVar = ((l[]) fVar.D)[fVar.B];
            Object obj4 = lVar.B[lVar.D];
            eVar.put(obj3, obj);
            fVar.h(obj4 != null ? obj4.hashCode() : 0, eVar.C, obj4, 0);
        }
        fVar.H = eVar.E;
        return obj2;
    }
}
