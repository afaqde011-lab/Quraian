package k50;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class o {
    public static final v a;

    static {
        v vVar;
        try {
            Class.forName("java.nio.file.Files");
            vVar = new w();
        } catch (ClassNotFoundException unused) {
            vVar = new v();
        }
        a = vVar;
        String str = z.B;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.m.d(property, "getProperty(...)");
        gj.e.i(property, false);
        ClassLoader classLoader = l50.f.class.getClassLoader();
        kotlin.jvm.internal.m.d(classLoader, "getClassLoader(...)");
        new l50.f(classLoader);
    }

    public abstract g0 a(z zVar);

    public abstract void b(z zVar, z zVar2);

    public final void c(z zVar) {
        h00.m<z> mVar = new h00.m();
        while (zVar != null && !g(zVar)) {
            mVar.addFirst(zVar);
            zVar = zVar.c();
        }
        for (z dir : mVar) {
            kotlin.jvm.internal.m.e(dir, "dir");
            d(dir);
        }
    }

    public abstract void d(z zVar);

    public abstract void e(z zVar);

    public final void f(z path) {
        kotlin.jvm.internal.m.e(path, "path");
        e(path);
    }

    public final boolean g(z path) {
        kotlin.jvm.internal.m.e(path, "path");
        return j(path) != null;
    }

    public abstract List h(z zVar);

    public final ca.p i(z path) throws FileNotFoundException {
        kotlin.jvm.internal.m.e(path, "path");
        ca.p pVarJ = j(path);
        if (pVarJ != null) {
            return pVarJ;
        }
        throw new FileNotFoundException("no such file: " + path);
    }

    public abstract ca.p j(z zVar);

    public abstract u k(z zVar);

    public abstract u l(z zVar);

    public abstract g0 m(z zVar);

    public abstract i0 n(z zVar);
}
