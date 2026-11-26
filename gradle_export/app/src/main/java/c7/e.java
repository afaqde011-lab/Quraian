package c7;

import android.content.Context;
import eh.x;
import fh.d2;
import java.util.HashMap;

public final class e implements x {
    public final int A;
    public final Context B;

    public e(Context context, int i10) {
        this.A = i10;
        this.B = context;
    }

    @Override
    public final Object get() {
        w7.g gVar;
        int i10 = this.A;
        Context context = this.B;
        switch (i10) {
            case 0:
                return i.C(context);
            case 1:
                return new i7.i(context);
            case 2:
                return new s7.n(context, new a8.o());
            case 3:
                return new v7.p(context);
            case 4:
                d2 d2Var = w7.g.f15854p;
                synchronized (w7.g.class) {
                    try {
                        if (w7.g.f15860v == null) {
                            Context applicationContext = context == null ? null : context.getApplicationContext();
                            HashMap map = new HashMap(8);
                            map.put(0, 1000000L);
                            map.put(2, -9223372036854775807L);
                            map.put(3, -9223372036854775807L);
                            map.put(4, -9223372036854775807L);
                            map.put(5, -9223372036854775807L);
                            map.put(10, -9223372036854775807L);
                            map.put(9, -9223372036854775807L);
                            map.put(7, -9223372036854775807L);
                            w7.g.f15860v = new w7.g(applicationContext, map);
                        }
                        gVar = w7.g.f15860v;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return gVar;
            default:
                return new s7.n(context, new a8.o());
        }
    }
}
