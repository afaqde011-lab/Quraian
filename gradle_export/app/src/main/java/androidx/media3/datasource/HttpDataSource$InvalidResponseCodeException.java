package androidx.media3.datasource;

import com.google.android.gms.cast.CastStatusCodes;
import g4.c;
import java.util.Map;

public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final int D;
    public final Map E;

    public HttpDataSource$InvalidResponseCodeException(int i10, DataSourceException dataSourceException, Map map) {
        super(c.f(i10, "Response code: "), dataSourceException, CastStatusCodes.APPLICATION_NOT_FOUND);
        this.D = i10;
        this.E = map;
    }
}
