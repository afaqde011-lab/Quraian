package k50;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import qd.s0;

public final class l0 extends o {
    public static final z e;
    public final z b;
    public final o c;
    public final LinkedHashMap d;

    static {
        String str = z.B;
        e = gj.e.i("/", false);
    }

    public l0(z zVar, o oVar, LinkedHashMap linkedHashMap) {
        this.b = zVar;
        this.c = oVar;
        this.d = linkedHashMap;
    }

    @Override
    public final g0 a(z file) throws IOException {
        kotlin.jvm.internal.m.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override
    public final void b(z source, z target) throws IOException {
        kotlin.jvm.internal.m.e(source, "source");
        kotlin.jvm.internal.m.e(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override
    public final void d(z zVar) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override
    public final void e(z path) throws IOException {
        kotlin.jvm.internal.m.e(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override
    public final List h(z dir) throws IOException {
        kotlin.jvm.internal.m.e(dir, "dir");
        z zVar = e;
        zVar.getClass();
        l50.g gVar = (l50.g) this.d.get(l50.c.b(zVar, dir, true));
        if (gVar != null) {
            return h00.q.n1(gVar.h);
        }
        throw new IOException("not a directory: " + dir);
    }

    @Override
    public final ca.p j(z path) throws Throwable {
        ca.p pVarF;
        Throwable th;
        kotlin.jvm.internal.m.e(path, "path");
        z zVar = e;
        zVar.getClass();
        l50.g gVar = (l50.g) this.d.get(l50.c.b(zVar, path, true));
        Throwable th2 = null;
        if (gVar == null) {
            return null;
        }
        long j = gVar.g;
        boolean z = gVar.b;
        ca.p pVar = new ca.p(!z, z, (z) null, z ? null : Long.valueOf(gVar.d), (Long) null, gVar.f, (Long) null);
        if (j == -1) {
            return pVar;
        }
        u uVarK = this.c.k(this.b);
        try {
            c0 c0VarR = bi.b.r(uVarK.i(j));
            try {
                pVarF = l50.b.f(c0VarR, pVar);
                kotlin.jvm.internal.m.b(pVarF);
                try {
                    c0VarR.close();
                    th = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                try {
                    c0VarR.close();
                } catch (Throwable th5) {
                    s0.V(th4, th5);
                }
                th = th4;
                pVarF = null;
            }
            if (th != null) {
                throw th;
            }
            kotlin.jvm.internal.m.b(pVarF);
            try {
                uVarK.close();
            } catch (Throwable th6) {
                th2 = th6;
            }
            if (th2 != null) {
                throw th2;
            }
            kotlin.jvm.internal.m.b(pVarF);
            return pVarF;
        } catch (Throwable th7) {
            if (uVarK != null) {
                try {
                    uVarK.close();
                } catch (Throwable th8) {
                    s0.V(th7, th8);
                }
            }
            pVarF = null;
            th2 = th7;
        }
    }

    @Override
    public final u k(z zVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override
    public final u l(z zVar) throws IOException {
        throw new IOException("zip entries are not writable");
    }

    @Override
    public final g0 m(z file) throws IOException {
        kotlin.jvm.internal.m.e(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override
    public final i0 n(z file) throws Throwable {
        Throwable th;
        c0 c0VarR;
        kotlin.jvm.internal.m.e(file, "file");
        z zVar = e;
        zVar.getClass();
        l50.g gVar = (l50.g) this.d.get(l50.c.b(zVar, file, true));
        if (gVar == null) {
            throw new FileNotFoundException("no such file: " + file);
        }
        long j = gVar.d;
        u uVarK = this.c.k(this.b);
        try {
            c0VarR = bi.b.r(uVarK.i(gVar.g));
            try {
                uVarK.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (uVarK != null) {
                try {
                    uVarK.close();
                } catch (Throwable th4) {
                    s0.V(th3, th4);
                }
            }
            th = th3;
            c0VarR = null;
        }
        if (th != null) {
            throw th;
        }
        kotlin.jvm.internal.m.b(c0VarR);
        l50.b.f(c0VarR, null);
        if (gVar.e == 0) {
            return new l50.e(c0VarR, j, true);
        }
        return new l50.e(new t(bi.b.r(new l50.e(c0VarR, gVar.c, true)), new Inflater(true)), j, false);
    }
}
