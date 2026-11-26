package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

public final class e1 {

    public final LinkedHashMap f998a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.f998a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((a1) it.next()).e();
        }
        linkedHashMap.clear();
    }
}
