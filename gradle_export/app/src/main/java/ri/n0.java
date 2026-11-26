package ri;

import com.google.android.gms.internal.measurement.x5;

public final class n0 extends v1 {

    public final int f13462a;

    public final String f13463b;

    public final int f13464c;

    public final long f13465d;

    public final long f13466e;

    public final boolean f13467f;

    public final int f13468g;

    public final String f13469h;

    public final String f13470i;

    public n0(int i10, String str, int i11, long j9, long j10, boolean z10, int i12, String str2, String str3) {
        this.f13462a = i10;
        this.f13463b = str;
        this.f13464c = i11;
        this.f13465d = j9;
        this.f13466e = j10;
        this.f13467f = z10;
        this.f13468g = i12;
        this.f13469h = str2;
        this.f13470i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v1) {
            n0 n0Var = (n0) ((v1) obj);
            if (this.f13462a == n0Var.f13462a && this.f13463b.equals(n0Var.f13463b) && this.f13464c == n0Var.f13464c && this.f13465d == n0Var.f13465d && this.f13466e == n0Var.f13466e && this.f13467f == n0Var.f13467f && this.f13468g == n0Var.f13468g && this.f13469h.equals(n0Var.f13469h) && this.f13470i.equals(n0Var.f13470i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f13462a ^ 1000003) * 1000003) ^ this.f13463b.hashCode()) * 1000003) ^ this.f13464c) * 1000003;
        long j9 = this.f13465d;
        int i10 = (iHashCode ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003;
        long j10 = this.f13466e;
        return this.f13470i.hashCode() ^ ((((((((i10 ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f13467f ? 1231 : 1237)) * 1000003) ^ this.f13468g) * 1000003) ^ this.f13469h.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f13462a);
        sb2.append(", model=");
        sb2.append(this.f13463b);
        sb2.append(", cores=");
        sb2.append(this.f13464c);
        sb2.append(", ram=");
        sb2.append(this.f13465d);
        sb2.append(", diskSpace=");
        sb2.append(this.f13466e);
        sb2.append(", simulator=");
        sb2.append(this.f13467f);
        sb2.append(", state=");
        sb2.append(this.f13468g);
        sb2.append(", manufacturer=");
        sb2.append(this.f13469h);
        sb2.append(", modelClass=");
        return x5.n(sb2, this.f13470i, "}");
    }
}
