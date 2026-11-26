package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;

public final class p extends bk.a0 {

    public static final o f5440b = new o(new p(bk.y.B), 0);

    public final bk.y f5441a;

    public p(bk.y yVar) {
        this.f5441a = yVar;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        int iT0 = aVar.t0();
        int iB = e4.f.b(iT0);
        if (iB == 5 || iB == 6) {
            return this.f5441a.a(aVar);
        }
        if (iB == 8) {
            aVar.p0();
            return null;
        }
        throw new JsonSyntaxException("Expecting number, got: " + g4.c.t(iT0) + "; at path " + aVar.F(false));
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        bVar.n0((Number) obj);
    }
}
