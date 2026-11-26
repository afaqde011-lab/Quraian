package k8;

import androidx.media3.common.u0;
import com.google.android.gms.internal.measurement.x5;

public final class a implements u0 {

    public final int f9193a;

    public final String f9194b;

    public a(int i10, String str) {
        this.f9193a = i10;
        this.f9194b = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Ait(controlCode=");
        sb2.append(this.f9193a);
        sb2.append(",url=");
        return x5.n(sb2, this.f9194b, ")");
    }
}
