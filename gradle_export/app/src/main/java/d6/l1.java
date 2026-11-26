package d6;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public final class l1 {

    public static final a0 f4670g = new a0();

    public final Context f4671a;

    public final LinkedHashMap f4672b;

    public int f4673c;

    public final int f4674d;

    public final LinkedHashSet f4675e;

    public final Set f4676f;

    public l1(Context context, LinkedHashMap linkedHashMap, int i10, int i11, Set set, int i12) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        set = (i12 & 32) != 0 ? new LinkedHashSet() : set;
        this.f4671a = context;
        this.f4672b = linkedHashMap;
        this.f4673c = i10;
        this.f4674d = i11;
        this.f4675e = linkedHashSet;
        this.f4676f = set;
    }

    public final int a(b6.j jVar) {
        f6.w wVarH = w.h(jVar);
        synchronized (this) {
            Integer num = (Integer) this.f4672b.get(wVarH);
            if (num != null) {
                int iIntValue = num.intValue();
                this.f4675e.add(Integer.valueOf(iIntValue));
                return iIntValue;
            }
            int i10 = this.f4673c;
            while (this.f4676f.contains(Integer.valueOf(i10))) {
                i10 = (i10 + 1) % o1.f4680b;
                if (i10 == this.f4673c) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.f4673c = (i10 + 1) % o1.f4680b;
            this.f4675e.add(Integer.valueOf(i10));
            this.f4676f.add(Integer.valueOf(i10));
            this.f4672b.put(wVarH, Integer.valueOf(i10));
            return i10;
        }
    }

    public final Object b(n nVar) throws Throwable {
        Object objD = m6.f.f10566a.d(this.f4671a, r1.f4693a, w.n(this.f4674d), new a1.c0(this, null, 11), nVar);
        return objD == l00.a.A ? objD : g00.b0.a;
    }
}
