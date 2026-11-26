package o8;

import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;

public final class b extends j {

    public final byte[] f11688b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f11688b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f11712a.equals(bVar.f11712a) && Arrays.equals(this.f11688b, bVar.f11688b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11688b) + x5.e(527, this.f11712a, 31);
    }
}
