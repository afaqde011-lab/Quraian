package kotlinx.coroutines;

import a40.m1;
import a40.q1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JobCancellationException extends CancellationException {
    public final transient m1 A;

    public JobCancellationException(String str, Throwable th, m1 m1Var) {
        super(str);
        this.A = m1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof JobCancellationException)) {
            return false;
        }
        JobCancellationException jobCancellationException = (JobCancellationException) obj;
        if (!m.a(jobCancellationException.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = jobCancellationException.A;
        if (obj2 == null) {
            obj2 = q1.B;
        }
        Object obj3 = this.A;
        if (obj3 == null) {
            obj3 = q1.B;
        }
        return m.a(obj2, obj3) && m.a(jobCancellationException.getCause(), getCause());
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        m.b(message);
        int iHashCode = message.hashCode() * 31;
        Object obj = this.A;
        if (obj == null) {
            obj = q1.B;
        }
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.A;
        if (obj == null) {
            obj = q1.B;
        }
        sb.append(obj);
        return sb.toString();
    }
}
