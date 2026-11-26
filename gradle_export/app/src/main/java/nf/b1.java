package nf;

import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;

public final class b1 extends c1 {
    public final String A;

    public b1(String str) {
        this.A = str;
    }

    @Override
    public final int a() {
        return c1.d((byte) 96);
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int iA = c1Var.a();
        int iD = c1.d((byte) 96);
        if (iD != iA) {
            return iD - c1Var.a();
        }
        String str = ((b1) c1Var).A;
        int length = str.length();
        String str2 = this.A;
        if (str2.length() == length) {
            return str2.compareTo(str);
        }
        return str2.length() - str.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b1.class == obj.getClass()) {
            return this.A.equals(((b1) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.d((byte) 96)), this.A});
    }

    public final String toString() {
        return x5.n(new StringBuilder("\""), this.A, "\"");
    }
}
