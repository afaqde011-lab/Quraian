package rv;

import java.util.ArrayList;
import java.util.List;

public final class q {
    public final ArrayList a;
    public final int b;
    public final List c;

    public q(ArrayList arrayList, int i, List playerItems) {
        kotlin.jvm.internal.m.e(playerItems, "playerItems");
        this.a = arrayList;
        this.b = i;
        this.c = playerItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.a.equals(qVar.a) && this.b == qVar.b && kotlin.jvm.internal.m.a(this.c, qVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + w.c.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "QueueWithPosition(mediaItems=" + this.a + ", startIndex=" + this.b + ", playerItems=" + this.c + ")";
    }
}
