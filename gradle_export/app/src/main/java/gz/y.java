package gz;

import com.google.android.gms.internal.measurement.x5;

public final class y implements m0 {
    public final Object a;

    public y(Object result) {
        kotlin.jvm.internal.m.e(result, "result");
        this.a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.m.a(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x5.l(this.a, "OnNavigationResultReceived(result=", ")");
    }
}
