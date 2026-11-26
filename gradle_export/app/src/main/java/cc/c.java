package cc;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class c implements k {

    public final int f3119a;

    public final String f3120b;

    public final AtomicBoolean f3121c;

    public c(String str, AtomicBoolean atomicBoolean, int i10) {
        this.f3119a = i10;
        this.f3120b = str;
        this.f3121c = atomicBoolean;
    }

    @Override
    public final void onResult(Object obj) {
        switch (this.f3119a) {
            case 0:
                HashMap map = d.f3122a;
                map.remove(this.f3120b);
                this.f3121c.set(true);
                if (map.size() == 0) {
                    d.c();
                }
                break;
            default:
                HashMap map2 = d.f3122a;
                map2.remove(this.f3120b);
                this.f3121c.set(true);
                if (map2.size() == 0) {
                    d.c();
                }
                break;
        }
    }
}
