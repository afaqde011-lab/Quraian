package bd;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;

public final class a {

    public final WeakReference f2491a;

    public final b f2492b;

    public a(WeakReference weakReference, b bVar) {
        this.f2491a = weakReference;
        this.f2492b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return m.a(this.f2491a, aVar.f2491a) && this.f2492b == aVar.f2492b;
    }

    public final int hashCode() {
        return this.f2492b.hashCode() + (this.f2491a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityCallbackEvent(activity=" + this.f2491a + ", type=" + this.f2492b + ')';
    }
}
