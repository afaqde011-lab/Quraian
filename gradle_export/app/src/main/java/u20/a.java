package u20;

import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import m10.r0;

public final class a implements n30.a {
    public static final a B = new a(0);
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Iterable b(Object obj) {
        Collection collectionM;
        switch (this.A) {
            case 0:
                int i = d.a;
                Collection collectionM2 = ((r0) obj).m();
                ArrayList arrayList = new ArrayList(r.q0(collectionM2, 10));
                Iterator it = ((ArrayList) collectionM2).iterator();
                while (it.hasNext()) {
                    arrayList.add(((r0) it.next()).a());
                }
                return arrayList;
            default:
                j10.c cVar = (j10.c) obj;
                return (cVar == null || (collectionM = cVar.m()) == null) ? x.A : collectionM;
        }
    }
}
