package r1;

import java.util.Collection;
import java.util.List;
import u00.k;

public final class b implements k {
    public final int A;
    public final Collection B;

    public b(int i10, Collection collection) {
        this.A = i10;
        this.B = collection;
    }

    public final Object invoke(Object obj) {
        boolean zContains;
        int i10 = this.A;
        Collection<?> collection = this.B;
        switch (i10) {
            case 0:
                zContains = collection.contains(obj);
                break;
            case 1:
                zContains = collection.contains(obj);
                break;
            default:
                zContains = ((List) obj).retainAll(collection);
                break;
        }
        return Boolean.valueOf(zContains);
    }
}
