package v1;

import com.google.android.gms.internal.measurement.z3;
import kotlin.jvm.internal.m;

public final class e {

    public int f15334a = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f15334a);
        sb2.append(")@");
        int iHashCode = hashCode();
        z3.r(16);
        String string = Integer.toString(iHashCode, 16);
        m.d(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }
}
