package d00;

import android.view.WindowId;
import l1.e1;
import l1.i1;

public final class c {
    public WindowId d;
    public boolean g;
    public final i1 a = l1.q.z(new h2.b(9205357640488583168L));
    public final i1 b = l1.q.z(new h2.e(9205357640488583168L));
    public final e1 c = new e1(0.0f);
    public final z1.v e = new z1.v();
    public final i1 f = l1.q.z((Object) null);

    public final l2.b a() {
        return (l2.b) this.f.getValue();
    }

    public final long b() {
        return ((h2.b) this.a.getValue()).a;
    }

    public final void c(long j) {
        this.a.setValue(new h2.b(j));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HazeArea(");
        sb.append("position=" + h2.b.h(b()) + ", ");
        sb.append("size=" + h2.e.h(((h2.e) this.b.getValue()).a) + ", ");
        sb.append("zIndex=" + this.c.h());
        sb.append(")");
        return sb.toString();
    }
}
