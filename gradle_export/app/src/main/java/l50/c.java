package l50;

import h00.q;
import h00.v;
import java.io.EOFException;
import java.util.ArrayList;
import k50.l;
import k50.z;
import kotlin.jvm.internal.m;

public abstract class c {
    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;

    static {
        l lVar = l.D;
        a = sg.f.I("/");
        b = sg.f.I("\\");
        c = sg.f.I("/\\");
        d = sg.f.I(".");
        e = sg.f.I("..");
    }

    public static final int a(z zVar) {
        l lVar = zVar.A;
        if (lVar.d() != 0) {
            if (lVar.i(0) != 47) {
                if (lVar.i(0) == 92) {
                    if (lVar.d() > 2 && lVar.i(1) == 92) {
                        l other = b;
                        m.e(other, "other");
                        int iF = lVar.f(2, other.h());
                        return iF == -1 ? lVar.d() : iF;
                    }
                } else if (lVar.d() > 2 && lVar.i(1) == 58 && lVar.i(2) == 92) {
                    char cI = (char) lVar.i(0);
                    if ('a' <= cI && cI < '{') {
                        return 3;
                    }
                    if ('A' <= cI && cI < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public static final z b(z zVar, z child, boolean z) {
        m.e(child, "child");
        if (a(child) != -1 || child.g() != null) {
            return child;
        }
        l lVarC = c(zVar);
        if (lVarC == null && (lVarC = c(child)) == null) {
            lVarC = f(z.B);
        }
        k50.i iVar = new k50.i();
        iVar.o0(zVar.A);
        if (iVar.B > 0) {
            iVar.o0(lVarC);
        }
        iVar.o0(child.A);
        return d(iVar, z);
    }

    public static final l c(z zVar) {
        l lVar = zVar.A;
        l lVar2 = a;
        if (l.g(lVar, lVar2) != -1) {
            return lVar2;
        }
        l lVar3 = zVar.A;
        l lVar4 = b;
        if (l.g(lVar3, lVar4) != -1) {
            return lVar4;
        }
        return null;
    }

    public static final z d(k50.i iVar, boolean z) throws EOFException {
        l lVar;
        long j;
        char cF;
        boolean z2;
        ArrayList arrayList;
        boolean zA;
        l lVar2;
        int size;
        int i;
        long jI;
        l lVarM;
        l lVar3;
        k50.i iVar2 = new k50.i();
        l lVarE = null;
        int i2 = 0;
        while (true) {
            if (!iVar.m0(0L, a)) {
                lVar = b;
                if (!iVar.m0(0L, lVar)) {
                    break;
                }
            }
            byte b2 = iVar.readByte();
            if (lVarE == null) {
                lVarE = e(b2);
            }
            i2++;
        }
        boolean z3 = i2 >= 2 && m.a(lVarE, lVar);
        l lVar4 = c;
        if (z3) {
            m.b(lVarE);
            iVar2.o0(lVarE);
            iVar2.o0(lVarE);
        } else {
            if (i2 <= 0) {
                long jI2 = iVar.I(lVar4);
                if (lVarE == null) {
                    lVarE = jI2 == -1 ? f(z.B) : e(iVar.F(jI2));
                }
                if (m.a(lVarE, lVar) && iVar.B >= 2) {
                    j = -1;
                    if (iVar.F(1L) == 58 && (('a' <= (cF = (char) iVar.F(0L)) && cF < '{') || ('A' <= cF && cF < '['))) {
                        if (jI2 == 2) {
                            iVar2.c0(iVar, 3L);
                        } else {
                            iVar2.c0(iVar, 2L);
                        }
                    }
                }
                if (iVar2.B > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList = new ArrayList();
                while (true) {
                    zA = iVar.A();
                    lVar2 = d;
                    if (!zA) {
                        break;
                    }
                    jI = iVar.I(lVar4);
                    if (jI == j) {
                        lVarM = iVar.m(iVar.B);
                    } else {
                        lVarM = iVar.m(jI);
                        iVar.readByte();
                    }
                    lVar3 = e;
                    if (m.a(lVarM, lVar3)) {
                        if (z2 || !arrayList.isEmpty()) {
                            if (z || (!z2 && (arrayList.isEmpty() || m.a(q.T0(arrayList), lVar3)))) {
                                arrayList.add(lVarM);
                            } else if (!z3 || arrayList.size() != 1) {
                                v.z0(arrayList);
                            }
                        }
                    } else if (m.a(lVarM, lVar2) && !m.a(lVarM, l.D)) {
                        arrayList.add(lVarM);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        iVar2.o0(lVarE);
                    }
                    iVar2.o0((l) arrayList.get(i));
                }
                if (iVar2.B == 0) {
                    iVar2.o0(lVar2);
                }
                return new z(iVar2.m(iVar2.B));
            }
            m.b(lVarE);
            iVar2.o0(lVarE);
        }
        j = -1;
        if (iVar2.B > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        arrayList = new ArrayList();
        while (true) {
            zA = iVar.A();
            lVar2 = d;
            if (!zA) {
                break;
                break;
            }
            jI = iVar.I(lVar4);
            if (jI == j) {
                lVarM = iVar.m(iVar.B);
            } else {
                lVarM = iVar.m(jI);
                iVar.readByte();
            }
            lVar3 = e;
            if (m.a(lVarM, lVar3)) {
                if (z2) {
                }
                if (z) {
                }
                arrayList.add(lVarM);
            } else if (m.a(lVarM, lVar2)) {
            }
        }
        size = arrayList.size();
        while (i < size) {
            if (i > 0) {
                iVar2.o0(lVarE);
            }
            iVar2.o0((l) arrayList.get(i));
        }
        if (iVar2.B == 0) {
            iVar2.o0(lVar2);
        }
        return new z(iVar2.m(iVar2.B));
    }

    public static final l e(byte b2) {
        if (b2 == 47) {
            return a;
        }
        if (b2 == 92) {
            return b;
        }
        throw new IllegalArgumentException(g4.c.f(b2, "not a directory separator: "));
    }

    public static final l f(String str) {
        if (m.a(str, "/")) {
            return a;
        }
        if (m.a(str, "\\")) {
            return b;
        }
        throw new IllegalArgumentException(a1.b.o("not a directory separator: ", str));
    }
}
