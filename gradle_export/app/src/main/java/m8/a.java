package m8;

import androidx.media3.common.s0;
import androidx.media3.common.u0;
import androidx.media3.common.x0;
import com.google.android.gms.internal.measurement.x5;
import e7.u;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public final class a implements u0 {

    public final int f10635a;

    public final String f10636b;

    public final String f10637c;

    public final int f10638d;

    public final int f10639e;

    public final int f10640f;

    public final int f10641g;

    public final byte[] f10642h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f10635a = i10;
        this.f10636b = str;
        this.f10637c = str2;
        this.f10638d = i11;
        this.f10639e = i12;
        this.f10640f = i13;
        this.f10641g = i14;
        this.f10642h = bArr;
    }

    public static a d(u uVar) {
        int iM = uVar.m();
        String strN = x0.n(uVar.y(uVar.m(), StandardCharsets.US_ASCII));
        String strY = uVar.y(uVar.m(), StandardCharsets.UTF_8);
        int iM2 = uVar.m();
        int iM3 = uVar.m();
        int iM4 = uVar.m();
        int iM5 = uVar.m();
        int iM6 = uVar.m();
        byte[] bArr = new byte[iM6];
        uVar.k(0, iM6, bArr);
        return new a(iM, strN, strY, iM2, iM3, iM4, iM5, bArr);
    }

    @Override
    public final void b(s0 s0Var) {
        s0Var.a(this.f10635a, this.f10642h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f10635a == aVar.f10635a && this.f10636b.equals(aVar.f10636b) && this.f10637c.equals(aVar.f10637c) && this.f10638d == aVar.f10638d && this.f10639e == aVar.f10639e && this.f10640f == aVar.f10640f && this.f10641g == aVar.f10641g && Arrays.equals(this.f10642h, aVar.f10642h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10642h) + ((((((((x5.e(x5.e((527 + this.f10635a) * 31, this.f10636b, 31), this.f10637c, 31) + this.f10638d) * 31) + this.f10639e) * 31) + this.f10640f) * 31) + this.f10641g) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f10636b + ", description=" + this.f10637c;
    }
}
