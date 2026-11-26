package l50;

import b3.j0;
import g00.k;
import g00.p;
import h00.q;
import h00.r;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import k50.g0;
import k50.i0;
import k50.o;
import k50.u;
import k50.v;
import k50.z;
import kotlin.jvm.internal.m;

public final class f extends o {
    public static final z e;
    public final ClassLoader b;
    public final o c;
    public final p d;

    static {
        String str = z.B;
        e = gj.e.i("/", false);
    }

    public f(ClassLoader classLoader) {
        v systemFileSystem = o.a;
        m.e(systemFileSystem, "systemFileSystem");
        this.b = classLoader;
        this.c = systemFileSystem;
        this.d = rd.a.J(new j0(this, 16));
    }

    @Override
    public final g0 a(z file) throws IOException {
        m.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override
    public final void b(z source, z target) throws IOException {
        m.e(source, "source");
        m.e(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override
    public final void d(z zVar) throws IOException {
        throw new IOException(this + " is read-only");
    }

    @Override
    public final void e(z path) throws IOException {
        m.e(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override
    public final List h(z dir) throws FileNotFoundException {
        m.e(dir, "dir");
        z zVar = e;
        zVar.getClass();
        String strQ = c.b(zVar, dir, true).d(zVar).A.q();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (k kVar : (List) this.d.getValue()) {
            o oVar = (o) kVar.A;
            z zVar2 = (z) kVar.B;
            try {
                List listH = oVar.h(zVar2.e(strQ));
                ArrayList<z> arrayList = new ArrayList();
                for (Object obj : listH) {
                    if (sg.f.D((z) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(r.q0(arrayList, 10));
                for (z zVar3 : arrayList) {
                    m.e(zVar3, "<this>");
                    arrayList2.add(zVar.e(r30.r.u0(r30.k.R0(zVar3.A.q(), zVar2.A.q()), '\\', '/')));
                }
                h00.v.u0(arrayList2, linkedHashSet);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return q.n1(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override
    public final ca.p j(z path) {
        m.e(path, "path");
        if (!sg.f.D(path)) {
            return null;
        }
        z zVar = e;
        zVar.getClass();
        String strQ = c.b(zVar, path, true).d(zVar).A.q();
        for (k kVar : (List) this.d.getValue()) {
            ca.p pVarJ = ((o) kVar.A).j(((z) kVar.B).e(strQ));
            if (pVarJ != null) {
                return pVarJ;
            }
        }
        return null;
    }

    @Override
    public final u k(z zVar) throws FileNotFoundException {
        if (!sg.f.D(zVar)) {
            throw new FileNotFoundException("file not found: " + zVar);
        }
        z zVar2 = e;
        zVar2.getClass();
        String strQ = c.b(zVar2, zVar, true).d(zVar2).A.q();
        Iterator it = ((List) this.d.getValue()).iterator();
        while (it.hasNext()) {
            k kVar = (k) it.next();
            try {
                return ((o) kVar.A).k(((z) kVar.B).e(strQ));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + zVar);
    }

    @Override
    public final u l(z zVar) throws IOException {
        throw new IOException("resources are not writable");
    }

    @Override
    public final g0 m(z file) throws IOException {
        m.e(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override
    public final i0 n(z file) throws FileNotFoundException {
        m.e(file, "file");
        if (!sg.f.D(file)) {
            throw new FileNotFoundException("file not found: " + file);
        }
        z zVar = e;
        zVar.getClass();
        InputStream resourceAsStream = this.b.getResourceAsStream(c.b(zVar, file, false).d(zVar).A.q());
        if (resourceAsStream != null) {
            return bi.b.S(resourceAsStream);
        }
        throw new FileNotFoundException("file not found: " + file);
    }
}
