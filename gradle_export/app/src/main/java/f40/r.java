package f40;

import ri.t1;

public abstract class r {
    public static final int a = 0;

    static {
        Object objS;
        Object objS2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objS = m00.a.class.getCanonicalName();
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        if (g00.n.a(objS) != null) {
            objS = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objS2 = r.class.getCanonicalName();
        } catch (Throwable th2) {
            objS2 = t1.s(th2);
        }
        if (g00.n.a(objS2) != null) {
            objS2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
