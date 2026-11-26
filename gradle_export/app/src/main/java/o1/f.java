package o1;

import com.google.android.gms.internal.measurement.b5;

public final class f extends b5 {

    public final b5 f11476b;

    public final int f11477c;

    public f(b5 b5Var, int i10) {
        this.f11476b = b5Var;
        this.f11477c = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.m.a(fVar.f11476b, this.f11476b) && fVar.f11477c == this.f11477c;
    }

    public final int hashCode() {
        return this.f11476b.hashCode() + (this.f11477c * 31);
    }
}
