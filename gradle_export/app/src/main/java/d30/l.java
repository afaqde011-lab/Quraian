package d30;

import androidx.media3.common.q;
import com.google.android.gms.internal.measurement.x5;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class l implements o {
    public static final String d = r30.k.g1(l.class.getCanonicalName(), "");
    public static final b e = new b("NO_LOCKS", a.A);
    public final n a;
    public final a b;
    public final String c;

    public l(String str) {
        this(str, new me.i(new ReentrantLock(), 18));
    }

    public l(String str, n nVar) {
        a aVar = a.B;
        this.a = nVar;
        this.b = aVar;
        this.c = str;
    }

    public static void e(AssertionError assertionError) {
        StackTraceElement[] stackTrace = assertionError.getStackTrace();
        int length = stackTrace.length;
        int i = 0;
        while (i < length) {
            if (!stackTrace[i].getClassName().startsWith(d)) {
                List listSubList = Arrays.asList(stackTrace).subList(i, length);
                assertionError.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
            }
            i++;
        }
        i = -1;
        List listSubList2 = Arrays.asList(stackTrace).subList(i, length);
        assertionError.setStackTrace((StackTraceElement[]) listSubList2.toArray(new StackTraceElement[listSubList2.size()]));
    }

    public final i a(u00.a aVar) {
        return new i(this, aVar);
    }

    public final e b(u00.k kVar) {
        return new e(this, new ConcurrentHashMap(3, 1.0f, 2), kVar, 1);
    }

    public final j c(u00.k kVar) {
        return new j(this, new ConcurrentHashMap(3, 1.0f, 2), kVar);
    }

    public q d(Object obj, String str) {
        StringBuilder sb = new StringBuilder("Recursion detected ");
        sb.append(str);
        sb.append(obj == null ? "" : g4.c.h(obj, "on input: "));
        sb.append(" under ");
        sb.append(this);
        AssertionError assertionError = new AssertionError(sb.toString());
        e(assertionError);
        throw assertionError;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" (");
        return x5.n(sb, this.c, ")");
    }
}
