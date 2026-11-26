package qj;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class b {

    public final String f13032a;

    public final c f13033b;

    public b(Set set, c cVar) {
        this.f13032a = b(set);
        this.f13033b = cVar;
    }

    public static String b(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            sb2.append(aVar.f13030a);
            sb2.append('/');
            sb2.append(aVar.f13031b);
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public final String a() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f13032a;
        c cVar = this.f13033b;
        synchronized (((HashSet) cVar.B)) {
            setUnmodifiableSet = Collections.unmodifiableSet((HashSet) cVar.B);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(' ');
        synchronized (((HashSet) cVar.B)) {
            setUnmodifiableSet2 = Collections.unmodifiableSet((HashSet) cVar.B);
        }
        sb2.append(b(setUnmodifiableSet2));
        return sb2.toString();
    }
}
