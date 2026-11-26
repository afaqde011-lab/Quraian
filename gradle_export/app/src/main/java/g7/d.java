package g7;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import e7.i0;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import ta.c0;

public final class d extends b {
    public j E;
    public byte[] F;
    public int G;
    public int H;

    @Override
    public final void close() {
        if (this.F != null) {
            this.F = null;
            c();
        }
        this.E = null;
    }

    @Override
    public final long p(j jVar) throws ParserException, DataSourceException {
        e();
        this.E = jVar;
        Uri uri = jVar.f6218a;
        long j9 = jVar.f6223f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        c0.t("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = i0.f5136a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new ParserException("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.F = Base64.decode(str2, 0);
            } catch (IllegalArgumentException e3) {
                throw new ParserException(a1.b.o("Error while parsing Base64 encoded string: ", str2), e3, true, 0);
            }
        } else {
            this.F = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
        }
        long j10 = jVar.f6222e;
        byte[] bArr = this.F;
        if (j10 > bArr.length) {
            this.F = null;
            throw new DataSourceException(2008);
        }
        int i10 = (int) j10;
        this.G = i10;
        int length = bArr.length - i10;
        this.H = length;
        if (j9 != -1) {
            this.H = (int) Math.min(length, j9);
        }
        h(jVar);
        return j9 != -1 ? j9 : this.H;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.H;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.F;
        String str = i0.f5136a;
        System.arraycopy(bArr2, this.G, bArr, i10, iMin);
        this.G += iMin;
        this.H -= iMin;
        b(iMin);
        return iMin;
    }

    @Override
    public final Uri y() {
        j jVar = this.E;
        if (jVar != null) {
            return jVar.f6218a;
        }
        return null;
    }
}
