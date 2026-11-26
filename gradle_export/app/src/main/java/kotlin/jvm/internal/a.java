package kotlin.jvm.internal;

import com.google.android.gms.internal.measurement.x5;
import java.io.Serializable;

public class a implements h, Serializable {
    public final Object A;
    public final Class B;
    public final String C;
    public final String D;
    public final boolean E;
    public final int F;
    public final int G;

    public a() {
        this(3, 4, g00.k.class, c.NO_RECEIVER, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V");
    }

    public a(int i, int i2, Class cls, Object obj, String str, String str2) {
        this.A = obj;
        this.B = cls;
        this.C = str;
        this.D = str2;
        this.E = false;
        this.F = i;
        this.G = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.E == aVar.E && this.F == aVar.F && this.G == aVar.G && m.a(this.A, aVar.A) && m.a(this.B, aVar.B) && this.C.equals(aVar.C) && this.D.equals(aVar.D);
    }

    @Override
    public final int getArity() {
        return this.F;
    }

    public final int hashCode() {
        Object obj = this.A;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.B;
        return ((((x5.e(x5.e((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, this.C, 31), this.D, 31) + (this.E ? 1231 : 1237)) * 31) + this.F) * 31) + this.G;
    }

    public final String toString() {
        return a0.a.j(this);
    }
}
