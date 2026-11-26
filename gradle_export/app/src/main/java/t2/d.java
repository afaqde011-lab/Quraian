package t2;

import android.view.KeyEvent;
import b2.r;
import u00.k;

public abstract class d {
    public static final long a(int i10) {
        long j9 = (((long) i10) << 32) | (((long) 0) & 4294967295L);
        int i11 = a.O;
        return j9;
    }

    public static final long b(KeyEvent keyEvent) {
        return a(keyEvent.getKeyCode());
    }

    public static final int c(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final r d(r rVar, k kVar) {
        return rVar.V(new c(kVar, null));
    }

    public static final r e(r rVar, k kVar) {
        return rVar.V(new c(null, kVar));
    }
}
