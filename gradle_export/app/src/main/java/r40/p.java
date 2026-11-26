package r40;

import h00.d0;
import java.util.List;

public final class p extends n {
    public final q40.x j;
    public final List k;
    public final int l;
    public int m;

    public p(q40.c json, q40.x xVar) {
        super(json, xVar, (String) null, 12);
        kotlin.jvm.internal.m.e(json, "json");
        this.j = xVar;
        List listN1 = h00.q.n1(xVar.A.keySet());
        this.k = listN1;
        this.l = listN1.size() * 2;
        this.m = -1;
    }

    @Override
    public final q40.l F(String tag) {
        kotlin.jvm.internal.m.e(tag, "tag");
        return this.m % 2 == 0 ? q40.m.b(tag) : (q40.l) d0.O(this.j, tag);
    }

    @Override
    public final String R(n40.e descriptor, int i) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        return (String) this.k.get(i / 2);
    }

    @Override
    public final q40.l T() {
        return this.j;
    }

    @Override
    public final q40.x T() {
        return this.j;
    }

    @Override
    public final void a(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
    }

    @Override
    public final int l(n40.e descriptor) {
        kotlin.jvm.internal.m.e(descriptor, "descriptor");
        int i = this.m;
        if (i >= this.l - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.m = i2;
        return i2;
    }
}
