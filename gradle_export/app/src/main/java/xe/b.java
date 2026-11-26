package xe;

import android.content.Context;
import tf.z3;

public final class b {

    public static final b f16563b;

    public z3 f16564a;

    static {
        b bVar = new b();
        bVar.f16564a = null;
        f16563b = bVar;
    }

    public static z3 a(Context context) {
        z3 z3Var;
        b bVar = f16563b;
        synchronized (bVar) {
            try {
                if (bVar.f16564a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f16564a = new z3(context, 1);
                }
                z3Var = bVar.f16564a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z3Var;
    }
}
