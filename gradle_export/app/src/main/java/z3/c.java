package z3;

import java.util.Arrays;
import kotlin.jvm.internal.m;
import tf.y;

public final class c implements a {

    public final float[] f17172a;

    public final float[] f17173b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f17172a = fArr;
        this.f17173b = fArr2;
    }

    @Override
    public final float a(float f3) {
        return y.c(f3, this.f17173b, this.f17172a);
    }

    @Override
    public final float b(float f3) {
        return y.c(f3, this.f17172a, this.f17173b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f17172a, cVar.f17172a) && Arrays.equals(this.f17173b, cVar.f17173b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17173b) + (Arrays.hashCode(this.f17172a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f17172a);
        m.d(string, "toString(...)");
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f17173b);
        m.d(string2, "toString(...)");
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
