package androidx.fragment.app;

import android.util.Log;
import com.google.android.gms.cast.Cast;
import java.io.Writer;

public final class d2 extends Writer {
    public final StringBuilder B = new StringBuilder(Cast.MAX_NAMESPACE_LENGTH);
    public final String A = "FragmentManager";

    public final void a() {
        StringBuilder sb2 = this.B;
        if (sb2.length() > 0) {
            Log.d(this.A, sb2.toString());
            sb2.delete(0, sb2.length());
        }
    }

    @Override
    public final void close() {
        a();
    }

    @Override
    public final void flush() {
        a();
    }

    @Override
    public final void write(char[] cArr, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            char c10 = cArr[i10 + i12];
            if (c10 == '\n') {
                a();
            } else {
                this.B.append(c10);
            }
        }
    }
}
