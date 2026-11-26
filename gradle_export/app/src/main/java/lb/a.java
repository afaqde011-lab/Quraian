package lb;

import android.content.Context;
import th.o;

public final class a {

    public static final a f10198a = new a();

    public static f f10199b;

    public static final f a(Context context) {
        f fVar = f10199b;
        if (fVar != null) {
            return fVar;
        }
        synchronized (f10198a) {
            f fVar2 = f10199b;
            if (fVar2 != null) {
                return fVar2;
            }
            context.getApplicationContext();
            j jVarP = new o(context).p();
            f10199b = jVarP;
            return jVarP;
        }
    }
}
