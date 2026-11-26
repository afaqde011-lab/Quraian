package ri;

import android.os.Build;
import com.google.android.gms.internal.measurement.x5;

public final class m1 {

    public final int f13450a;

    public final int f13451b;

    public final long f13452c;

    public final long f13453d;

    public final boolean f13454e;

    public final int f13455f;

    public m1(int i10, int i11, long j9, long j10, boolean z10, int i12) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f13450a = i10;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f13451b = i11;
        this.f13452c = j9;
        this.f13453d = j10;
        this.f13454e = z10;
        this.f13455f = i12;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        if (this.f13450a != m1Var.f13450a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f13451b != m1Var.f13451b || this.f13452c != m1Var.f13452c || this.f13453d != m1Var.f13453d || this.f13454e != m1Var.f13454e || this.f13455f != m1Var.f13455f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13450a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f13451b) * 1000003;
        long j9 = this.f13452c;
        int i10 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f13453d;
        return ((((this.f13455f ^ ((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f13454e ? 1231 : 1237)) * 1000003)) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f13450a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f13451b);
        sb2.append(", totalRam=");
        sb2.append(this.f13452c);
        sb2.append(", diskSpace=");
        sb2.append(this.f13453d);
        sb2.append(", isEmulator=");
        sb2.append(this.f13454e);
        sb2.append(", state=");
        sb2.append(this.f13455f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return x5.n(sb2, Build.PRODUCT, "}");
    }
}
