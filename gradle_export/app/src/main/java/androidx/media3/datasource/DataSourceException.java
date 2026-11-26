package androidx.media3.datasource;

import java.io.IOException;

public class DataSourceException extends IOException {
    public static final int B = 0;
    public final int A;

    public DataSourceException(int i10) {
        this.A = i10;
    }

    public DataSourceException(int i10, Exception exc) {
        super(exc);
        this.A = i10;
    }

    public DataSourceException(String str, Exception exc, int i10) {
        super(str, exc);
        this.A = i10;
    }
}
