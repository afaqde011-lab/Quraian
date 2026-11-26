package bq;

import d40.d1;
import d40.o;
import d40.p1;
import g00.b0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.m;
import m00.c;
import m00.i;
import zp.b;

public final class a implements aq.a {
    public final p1 a = o.c(new zp.a(false, b.GENERAL));
    public final d1 b = o.b(0, 7, null);
    public final d1 c = o.b(0, 7, null);
    public final d1 d = o.b(0, 7, null);
    public final d1 e = o.b(0, 7, null);
    public final p1 f = o.c(Boolean.TRUE);
    public final d1 g = o.b(1, 5, null);
    public final AtomicBoolean h = new AtomicBoolean(false);
    public final AtomicBoolean i = new AtomicBoolean(false);

    public final Object c(boolean z, c cVar) throws Throwable {
        Object objEmit = this.d.emit(Boolean.valueOf(z), cVar);
        return objEmit == l00.a.A ? objEmit : b0.a;
    }

    public final b0 d(boolean z, i iVar) {
        this.f.emit(Boolean.valueOf(z), iVar);
        l00.a aVar = l00.a.A;
        return b0.a;
    }

    public final Object e(boolean z, c cVar) throws Throwable {
        Object objEmit = this.c.emit(Boolean.valueOf(z), cVar);
        return objEmit == l00.a.A ? objEmit : b0.a;
    }

    public final void f(boolean z, b source) {
        m.e(source, "source");
        zp.a aVar = new zp.a(z, source);
        p1 p1Var = this.a;
        p1Var.getClass();
        p1Var.k(null, aVar);
    }
}
