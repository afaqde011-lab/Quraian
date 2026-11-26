package k50;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public final class z implements Comparable {
    public static final String B;
    public final l A;

    static {
        String separator = File.separator;
        kotlin.jvm.internal.m.d(separator, "separator");
        B = separator;
    }

    public z(l bytes) {
        kotlin.jvm.internal.m.e(bytes, "bytes");
        this.A = bytes;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int iA = l50.c.a(this);
        l lVar = this.A;
        if (iA == -1) {
            iA = 0;
        } else if (iA < lVar.d() && lVar.i(iA) == 92) {
            iA++;
        }
        int iD = lVar.d();
        int i = iA;
        while (iA < iD) {
            if (lVar.i(iA) == 47 || lVar.i(iA) == 92) {
                arrayList.add(lVar.n(i, iA));
                i = iA + 1;
            }
            iA++;
        }
        if (i < lVar.d()) {
            arrayList.add(lVar.n(i, lVar.d()));
        }
        return arrayList;
    }

    public final String b() {
        l lVar = l50.c.a;
        l lVarO = this.A;
        int iK = l.k(lVarO, lVar);
        if (iK == -1) {
            iK = l.k(lVarO, l50.c.b);
        }
        if (iK != -1) {
            lVarO = l.o(lVarO, iK + 1, 0, 2);
        } else if (g() != null && lVarO.d() == 2) {
            lVarO = l.D;
        }
        return lVarO.q();
    }

    public final z c() {
        l lVar = l50.c.d;
        l lVar2 = this.A;
        if (kotlin.jvm.internal.m.a(lVar2, lVar)) {
            return null;
        }
        l lVar3 = l50.c.a;
        if (kotlin.jvm.internal.m.a(lVar2, lVar3)) {
            return null;
        }
        l prefix = l50.c.b;
        if (kotlin.jvm.internal.m.a(lVar2, prefix)) {
            return null;
        }
        l suffix = l50.c.e;
        lVar2.getClass();
        kotlin.jvm.internal.m.e(suffix, "suffix");
        int iD = lVar2.d();
        byte[] bArr = suffix.A;
        if (lVar2.l(iD - bArr.length, suffix, bArr.length) && (lVar2.d() == 2 || lVar2.l(lVar2.d() - 3, lVar3, 1) || lVar2.l(lVar2.d() - 3, prefix, 1))) {
            return null;
        }
        int iK = l.k(lVar2, lVar3);
        if (iK == -1) {
            iK = l.k(lVar2, prefix);
        }
        if (iK == 2 && g() != null) {
            if (lVar2.d() == 3) {
                return null;
            }
            return new z(l.o(lVar2, 0, 3, 1));
        }
        if (iK == 1) {
            kotlin.jvm.internal.m.e(prefix, "prefix");
            if (lVar2.l(0, prefix, prefix.d())) {
                return null;
            }
        }
        if (iK != -1 || g() == null) {
            if (iK == -1) {
                return new z(lVar);
            }
            return iK == 0 ? new z(l.o(lVar2, 0, 1, 1)) : new z(l.o(lVar2, 0, iK, 1));
        }
        if (lVar2.d() == 2) {
            return null;
        }
        return new z(l.o(lVar2, 0, 2, 1));
    }

    @Override
    public final int compareTo(Object obj) {
        z other = (z) obj;
        kotlin.jvm.internal.m.e(other, "other");
        return this.A.compareTo(other.A);
    }

    public final z d(z other) {
        kotlin.jvm.internal.m.e(other, "other");
        l lVar = other.A;
        int iA = l50.c.a(this);
        l lVar2 = this.A;
        z zVar = iA == -1 ? null : new z(lVar2.n(0, iA));
        int iA2 = l50.c.a(other);
        if (!kotlin.jvm.internal.m.a(zVar, iA2 != -1 ? new z(lVar.n(0, iA2)) : null)) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
        }
        ArrayList arrayListA = a();
        ArrayList arrayListA2 = other.a();
        int iMin = Math.min(arrayListA.size(), arrayListA2.size());
        int i = 0;
        while (i < iMin && kotlin.jvm.internal.m.a(arrayListA.get(i), arrayListA2.get(i))) {
            i++;
        }
        if (i == iMin && lVar2.d() == lVar.d()) {
            return gj.e.i(".", false);
        }
        if (arrayListA2.subList(i, arrayListA2.size()).indexOf(l50.c.e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        i iVar = new i();
        l lVarC = l50.c.c(other);
        if (lVarC == null && (lVarC = l50.c.c(this)) == null) {
            lVarC = l50.c.f(B);
        }
        int size = arrayListA2.size();
        for (int i2 = i; i2 < size; i2++) {
            iVar.o0(l50.c.e);
            iVar.o0(lVarC);
        }
        int size2 = arrayListA.size();
        while (i < size2) {
            iVar.o0((l) arrayListA.get(i));
            iVar.o0(lVarC);
            i++;
        }
        return l50.c.d(iVar, false);
    }

    public final z e(String child) {
        kotlin.jvm.internal.m.e(child, "child");
        i iVar = new i();
        iVar.w0(child);
        return l50.c.b(this, l50.c.d(iVar, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z) && kotlin.jvm.internal.m.a(((z) obj).A, this.A);
    }

    public final Path f() {
        Path path = Paths.get(this.A.q(), new String[0]);
        kotlin.jvm.internal.m.d(path, "get(...)");
        return path;
    }

    public final Character g() {
        l lVar = l50.c.a;
        l lVar2 = this.A;
        if (l.g(lVar2, lVar) != -1 || lVar2.d() < 2 || lVar2.i(1) != 58) {
            return null;
        }
        char cI = (char) lVar2.i(0);
        if (('a' > cI || cI >= '{') && ('A' > cI || cI >= '[')) {
            return null;
        }
        return Character.valueOf(cI);
    }

    public final int hashCode() {
        return this.A.hashCode();
    }

    public final File toFile() {
        return new File(this.A.q());
    }

    public final String toString() {
        return this.A.q();
    }
}
