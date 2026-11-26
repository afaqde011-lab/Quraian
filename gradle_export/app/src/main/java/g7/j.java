package g7;

import android.net.Uri;
import androidx.media3.common.r0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ta.c0;

public final class j {

    public static final int f6217i = 0;

    public final Uri f6218a;

    public final int f6219b;

    public final byte[] f6220c;

    public final Map f6221d;

    public final long f6222e;

    public final long f6223f;

    public final String f6224g;

    public final int f6225h;

    static {
        r0.a("media3.datasource");
    }

    public j(Uri uri, int i10, byte[] bArr, Map map, long j9, long j10, String str, int i11) {
        c0.s(j9 >= 0);
        c0.s(j9 >= 0);
        c0.s(j10 > 0 || j10 == -1);
        uri.getClass();
        this.f6218a = uri;
        this.f6219b = i10;
        this.f6220c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f6221d = Collections.unmodifiableMap(new HashMap(map));
        this.f6222e = j9;
        this.f6223f = j10;
        this.f6224g = str;
        this.f6225h = i11;
    }

    public final i a() {
        i iVar = new i();
        iVar.f6213e = this.f6218a;
        iVar.f6209a = this.f6219b;
        iVar.f6214f = this.f6220c;
        iVar.f6215g = this.f6221d;
        iVar.f6210b = this.f6222e;
        iVar.f6212d = this.f6223f;
        iVar.f6216h = this.f6224g;
        iVar.f6211c = this.f6225h;
        return iVar;
    }

    public final j b(long j9) {
        long j10 = this.f6223f;
        long j11 = j10 != -1 ? j10 - j9 : -1L;
        if (j9 == 0 && j10 == j11) {
            return this;
        }
        return new j(this.f6218a, this.f6219b, this.f6220c, this.f6221d, this.f6222e + j9, j11, this.f6224g, this.f6225h);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DataSpec[");
        int i10 = this.f6219b;
        if (i10 == 1) {
            str = "GET";
        } else if (i10 == 2) {
            str = "POST";
        } else {
            if (i10 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb2.append(str);
        sb2.append(" ");
        sb2.append(this.f6218a);
        sb2.append(", ");
        sb2.append(this.f6222e);
        sb2.append(", ");
        sb2.append(this.f6223f);
        sb2.append(", ");
        sb2.append(this.f6224g);
        sb2.append(", ");
        return g4.c.g(this.f6225h, "]", sb2);
    }
}
