package jz;

import com.google.android.gms.internal.measurement.x5;

public final class g implements k {
    public final Object a;

    public g(Object result) {
        kotlin.jvm.internal.m.e(result, "result");
        this.a = result;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && kotlin.jvm.internal.m.a(this.a, ((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x5.l(this.a, "OnNavigationResultReceived(result=", ")");
    }
}
