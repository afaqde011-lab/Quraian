package androidx.glance.session;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import oi.k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/glance/session/TimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "glance"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TimeoutCancellationException extends CancellationException {
    public final String A;
    public final int B;

    public TimeoutCancellationException(String str, int i10) {
        super(str);
        this.A = str;
        this.B = i10;
    }

    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public final String getMessage() {
        return this.A;
    }

    @Override
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TimeoutCancellationException(");
        sb2.append(this.A);
        sb2.append(", ");
        return k.l(sb2, this.B, ')');
    }
}
