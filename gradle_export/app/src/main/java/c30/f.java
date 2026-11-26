package c30;

import java.util.Collection;

public final class f implements u00.a {
    public final int A;
    public final h B;

    public f(h hVar, int i) {
        this.A = i;
        this.B = hVar;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        h hVar = this.B;
        switch (i) {
            case 0:
                x20.f fVar = x20.f.m;
                x20.n.a.getClass();
                x20.k kVar = x20.k.B;
                r10.c cVar = r10.c.A;
                return hVar.i(fVar, kVar);
            default:
                f30.f fVar2 = hVar.g;
                i classDescriptor = hVar.j;
                fVar2.getClass();
                kotlin.jvm.internal.m.e(classDescriptor, "classDescriptor");
                Collection collectionL = ((e30.f) classDescriptor.f()).l();
                kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
                return collectionL;
        }
    }
}
