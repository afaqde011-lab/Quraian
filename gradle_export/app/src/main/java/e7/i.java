package e7;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class i implements Iterable {
    public final Object A = new Object();
    public final HashMap B = new HashMap();
    public Set C = Collections.EMPTY_SET;
    public List D = Collections.EMPTY_LIST;

    public final int a(n7.h hVar) {
        int iIntValue;
        synchronized (this.A) {
            try {
                iIntValue = this.B.containsKey(hVar) ? ((Integer) this.B.get(hVar)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    @Override
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.A) {
            it = this.D.iterator();
        }
        return it;
    }
}
