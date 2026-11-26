package w30;

import java.util.Map;
import java.util.NoSuchElementException;

public final class a extends s1.a implements v00.d {
    public final int D = 1;
    public final Object E;
    public Object F;

    public a(Map mutableMap, Object obj, x30.a aVar) {
        super(obj, aVar.a, 2);
        kotlin.jvm.internal.m.e(mutableMap, "mutableMap");
        this.E = mutableMap;
        this.F = aVar;
    }

    public a(n30.g parentIterator, Object obj, Object obj2) {
        super(obj, obj2, 2);
        kotlin.jvm.internal.m.e(parentIterator, "parentIterator");
        this.E = parentIterator;
        this.F = obj2;
    }

    public final Object getValue() {
        switch (this.D) {
            case 0:
                return this.F;
            default:
                return ((x30.a) this.F).a;
        }
    }

    public final Object setValue(Object obj) {
        switch (this.D) {
            case 0:
                Object obj2 = this.F;
                this.F = obj;
                e eVar = (e) ((n30.g) this.E).B;
                d dVar = eVar.E;
                Object obj3 = ((s1.a) this).B;
                if (dVar.containsKey(obj3)) {
                    boolean z = ((s1.d) eVar).C;
                    if (!z) {
                        dVar.put(obj3, obj);
                    } else {
                        if (!z) {
                            throw new NoSuchElementException();
                        }
                        s1.l lVar = ((s1.l[]) ((s1.d) eVar).D)[((s1.d) eVar).B];
                        Object obj4 = lVar.B[lVar.D];
                        dVar.put(obj3, obj);
                        eVar.h(obj4 != null ? obj4.hashCode() : 0, dVar.C, obj4, 0);
                    }
                    eVar.H = dVar.E;
                }
                return obj2;
            default:
                x30.a aVar = (x30.a) this.F;
                Object obj5 = aVar.a;
                x30.a aVar2 = new x30.a(obj, aVar.b, aVar.c);
                this.F = aVar2;
                ((Map) this.E).put(((s1.a) this).B, aVar2);
                return obj5;
        }
    }
}
