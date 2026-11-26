package u;

import androidx.datastore.preferences.protobuf.z0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class e extends s0 implements Map {
    public z0 D;
    public b E;
    public d F;

    public e() {
        super(0);
    }

    public e(s0 s0Var) {
        super(0);
        int i10 = s0Var.C;
        c(this.C + i10);
        if (this.C != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(s0Var.g(i11), s0Var.j(i11));
            }
        } else if (i10 > 0) {
            h00.n.p0(0, 0, i10, s0Var.A, this.A);
            h00.n.q0(0, 0, i10 << 1, s0Var.B, this.B);
            this.C = i10;
        }
    }

    @Override
    public final Set entrySet() {
        z0 z0Var = this.D;
        if (z0Var != null) {
            return z0Var;
        }
        z0 z0Var2 = new z0(this, 4);
        this.D = z0Var2;
        return z0Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Set keySet() {
        b bVar = this.E;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.E = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i10 = this.C;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.C;
    }

    public final boolean m(Collection collection) {
        int i10 = this.C;
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (!collection.contains(g(i11))) {
                h(i11);
            }
        }
        return i10 != this.C;
    }

    @Override
    public final void putAll(Map map) {
        c(map.size() + this.C);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public final Collection values() {
        d dVar = this.F;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.F = dVar2;
        return dVar2;
    }
}
