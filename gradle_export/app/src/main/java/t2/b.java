package t2;

import android.view.KeyEvent;
import kotlin.jvm.internal.m;

public final class b {

    public final KeyEvent f14351a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return m.a(this.f14351a, ((b) obj).f14351a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14351a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f14351a + ')';
    }
}
