package kc;

import java.util.Arrays;
import java.util.List;

public final class m implements b {

    public final String f9635a;

    public final List f9636b;

    public final boolean f9637c;

    public m(String str, List list, boolean z10) {
        this.f9635a = str;
        this.f9636b = list;
        this.f9637c = z10;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        return new ec.d(iVar, bVar, this, aVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.f9635a + "' Shapes: " + Arrays.toString(this.f9636b.toArray()) + '}';
    }
}
