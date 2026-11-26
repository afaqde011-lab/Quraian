package androidx.media3.datasource;

import com.google.android.gms.cast.CastStatusCodes;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import w00.a;

public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final int C;

    public HttpDataSource$HttpDataSourceException() {
        super(2008);
        this.C = 1;
    }

    public HttpDataSource$HttpDataSourceException(int i10, int i11, IOException iOException) {
        if (i10 == 2000 && i11 == 1) {
            i10 = CastStatusCodes.INVALID_REQUEST;
        }
        super(i10, iOException);
        this.C = i11;
    }

    public HttpDataSource$HttpDataSourceException(String str, IOException iOException, int i10) {
        super(str, iOException, i10 == 2000 ? CastStatusCodes.INVALID_REQUEST : i10);
        this.C = 1;
    }

    public static HttpDataSource$HttpDataSourceException a(int i10, IOException iOException) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = CastStatusCodes.CANCELED;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !a.I(message).matches("cleartext.*not permitted.*")) ? CastStatusCodes.INVALID_REQUEST : 2007;
        }
        return i11 == 2007 ? new HttpDataSource$CleartextNotPermittedException("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, CastStatusCodes.MESSAGE_SEND_BUFFER_TOO_FULL) : new HttpDataSource$HttpDataSourceException(i11, i10, iOException);
    }
}
