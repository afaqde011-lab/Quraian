package sd;

import java.util.ArrayList;
import java.util.Iterator;

public final class m {

    public ArrayList f14022a = null;

    public int f14023b = 0;

    public final void a() {
        this.f14023b += 1000;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f14022a.iterator();
        while (it.hasNext()) {
            sb2.append((n) it.next());
            sb2.append(' ');
        }
        sb2.append('[');
        return oi.k.l(sb2, this.f14023b, ']');
    }
}
