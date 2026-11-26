package kotlinx.coroutines;

import a40.v;
import k00.i;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/DispatchException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DispatchException extends Exception {
    public final Throwable A;

    public DispatchException(Throwable th, v vVar, i iVar) {
        super("Coroutine dispatcher " + vVar + " threw an exception, context = " + iVar, th);
        this.A = th;
    }

    @Override
    public final Throwable getCause() {
        return this.A;
    }
}
