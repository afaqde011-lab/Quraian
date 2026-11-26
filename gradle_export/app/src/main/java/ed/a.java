package ed;

import cd.b;
import kotlin.jvm.internal.m;

public final class a implements b {

    public static final a f5355b = new a();

    public final cd.a f5356a = cd.a.B;

    @Override
    public final void a(String str) {
        m.e(str, "message");
        d(cd.a.D, str);
    }

    @Override
    public final void b(String str) {
        m.e(str, "message");
        d(cd.a.A, str);
    }

    @Override
    public final void c(String str) {
        m.e(str, "message");
        d(cd.a.C, str);
    }

    public final void d(cd.a aVar, String str) {
        if (this.f5356a.compareTo(aVar) <= 0) {
            System.out.println((Object) str);
        }
    }
}
