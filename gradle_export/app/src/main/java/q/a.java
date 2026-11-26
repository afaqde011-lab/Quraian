package q;

import f5.d;
import k00.f;

public final class a extends f {

    public static volatile a f12553b;

    public static final d f12554c = new d(1);

    public final c f12555a = new c();

    public static a g0() {
        if (f12553b != null) {
            return f12553b;
        }
        synchronized (a.class) {
            try {
                if (f12553b == null) {
                    f12553b = new a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f12553b;
    }
}
