package b6;

import java.util.ArrayList;

public abstract class j implements h {

    public int f2177a;

    public final ArrayList f2178b;

    public j(int i10, int i11) {
        this.f2177a = (i11 & 1) != 0 ? Integer.MAX_VALUE : i10;
        this.f2178b = new ArrayList();
    }

    public final String d() {
        return r30.l.i0(h00.q.R0(this.f2178b, ",\n", (String) null, (String) null, (u00.k) null, 62), "  ");
    }
}
