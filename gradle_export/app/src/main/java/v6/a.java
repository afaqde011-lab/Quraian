package v6;

import a40.c0;
import a40.z;
import java.util.concurrent.CancellationException;
import k00.i;
import kotlin.jvm.internal.m;

public final class a implements AutoCloseable, z {
    public final i A;

    public a(i iVar) {
        m.e(iVar, "coroutineContext");
        this.A = iVar;
    }

    public final i A() {
        return this.A;
    }

    @Override
    public final void close() {
        c0.j(this.A, (CancellationException) null);
    }
}
