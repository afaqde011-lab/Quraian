package oh;

import androidx.datastore.preferences.protobuf.j;
import java.security.GeneralSecurityException;
import oi.k;

public final class d extends c3.b {

    public final int f11978c;

    public d(int i10, byte[] bArr) throws GeneralSecurityException {
        this.f11978c = i10;
        if (!k.a(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f2624a = m(1, bArr);
        this.f2625b = m(0, bArr);
    }

    @Override
    public final j m(int i10, byte[] bArr) {
        switch (this.f11978c) {
            case 0:
                return new c(bArr, i10, 0);
            default:
                return new c(bArr, i10, 1);
        }
    }
}
