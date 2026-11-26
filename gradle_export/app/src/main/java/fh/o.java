package fh;

import java.util.Collection;
import java.util.Set;

public final class o extends l implements Set {
    public final j0 F;

    public o(j0 j0Var, Object obj, Set set) {
        super(j0Var, obj, set, null);
        this.F = j0Var;
    }

    @Override
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zU = w.u((Set) this.B, collection);
        if (zU) {
            this.F.F += this.B.size() - size;
            c();
        }
        return zU;
    }
}
