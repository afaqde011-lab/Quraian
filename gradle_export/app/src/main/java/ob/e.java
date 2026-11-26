package ob;

import a40.c0;
import a40.v;
import ab.a0;
import bt.y0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import k00.i;
import k50.b0;
import k50.o;
import k50.z;
import kotlin.jvm.internal.m;
import oi.k;
import qd.s0;
import r30.j;
import r30.r;

public final class e implements Closeable, Flushable {
    public static final j Q = new j("[a-z0-9_-]{1,120}");
    public final z A;
    public final long B;
    public final z C;
    public final z D;
    public final z E;
    public final LinkedHashMap F;
    public final f40.c G;
    public long H;
    public int I;
    public b0 J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public final d P;

    public e(long j9, v vVar, o oVar, z zVar) {
        this.A = zVar;
        this.B = j9;
        if (j9 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.C = zVar.e("journal");
        this.D = zVar.e("journal.tmp");
        this.E = zVar.e("journal.bkp");
        this.F = new LinkedHashMap(0, 0.75f, true);
        this.G = c0.c(rd.a.P(c0.e(), vVar.q0(1)));
        this.P = new d(oVar);
    }

    public static void S(String str) {
        if (!Q.b(str)) {
            throw new IllegalArgumentException(k.g('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    public static final void a(e eVar, c7.c cVar, boolean z10) {
        synchronized (eVar) {
            b bVar = (b) cVar.B;
            if (!m.a(bVar.f11913g, cVar)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z10 || bVar.f11912f) {
                for (int i10 = 0; i10 < 2; i10++) {
                    eVar.P.f((z) bVar.f11910d.get(i10));
                }
            } else {
                for (int i11 = 0; i11 < 2; i11++) {
                    if (((boolean[]) cVar.C)[i11] && !eVar.P.g((z) bVar.f11910d.get(i11))) {
                        cVar.d(false);
                        return;
                    }
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    z zVar = (z) bVar.f11910d.get(i12);
                    z zVar2 = (z) bVar.f11909c.get(i12);
                    if (eVar.P.g(zVar)) {
                        eVar.P.b(zVar, zVar2);
                    } else {
                        d dVar = eVar.P;
                        z zVar3 = (z) bVar.f11909c.get(i12);
                        if (!dVar.g(zVar3)) {
                            bc.d.a(dVar.m(zVar3));
                        }
                    }
                    long j9 = bVar.f11908b[i12];
                    Long l = (Long) eVar.P.i(zVar2).f3068e;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    bVar.f11908b[i12] = jLongValue;
                    eVar.H = (eVar.H - j9) + jLongValue;
                }
            }
            bVar.f11913g = null;
            if (bVar.f11912f) {
                eVar.I(bVar);
                return;
            }
            eVar.I++;
            b0 b0Var = eVar.J;
            m.b(b0Var);
            if (z10 || bVar.f11911e) {
                bVar.f11911e = true;
                b0Var.K("CLEAN");
                b0Var.writeByte(32);
                b0Var.K(bVar.f11907a);
                for (long j10 : bVar.f11908b) {
                    b0Var.writeByte(32);
                    b0Var.h0(j10);
                }
                b0Var.writeByte(10);
            } else {
                eVar.F.remove(bVar.f11907a);
                b0Var.K("REMOVE");
                b0Var.writeByte(32);
                b0Var.K(bVar.f11907a);
                b0Var.writeByte(10);
            }
            b0Var.flush();
            if (eVar.H > eVar.B) {
                eVar.v();
            } else if (eVar.I >= 2000) {
                eVar.v();
            }
        }
    }

    public final void A() {
        Iterator it = this.F.values().iterator();
        long j9 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i10 = 0;
            if (bVar.f11913g == null) {
                while (i10 < 2) {
                    j9 += bVar.f11908b[i10];
                    i10++;
                }
            } else {
                bVar.f11913g = null;
                while (i10 < 2) {
                    z zVar = (z) bVar.f11909c.get(i10);
                    d dVar = this.P;
                    dVar.f(zVar);
                    dVar.f((z) bVar.f11910d.get(i10));
                    i10++;
                }
                it.remove();
            }
        }
        this.H = j9;
    }

    public final void F() throws Throwable {
        g00.b0 b0Var;
        k50.c0 c0VarR = bi.b.r(this.P.n(this.C));
        Throwable th2 = null;
        try {
            String strZ = c0VarR.z(Long.MAX_VALUE);
            String strZ2 = c0VarR.z(Long.MAX_VALUE);
            String strZ3 = c0VarR.z(Long.MAX_VALUE);
            String strZ4 = c0VarR.z(Long.MAX_VALUE);
            String strZ5 = c0VarR.z(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strZ) || !"1".equals(strZ2) || !m.a(String.valueOf(1), strZ3) || !m.a(String.valueOf(2), strZ4) || strZ5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strZ + ", " + strZ2 + ", " + strZ3 + ", " + strZ4 + ", " + strZ5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    G(c0VarR.z(Long.MAX_VALUE));
                    i10++;
                } catch (EOFException unused) {
                    this.I = i10 - this.F.size();
                    if (c0VarR.a()) {
                        this.J = x();
                    } else {
                        Z();
                    }
                    b0Var = g00.b0.a;
                    try {
                        c0VarR.close();
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    if (th2 == null) {
                        throw th2;
                    }
                    m.b(b0Var);
                }
            }
        } catch (Throwable th4) {
            try {
                c0VarR.close();
            } catch (Throwable th5) {
                s0.V(th4, th5);
            }
            th2 = th4;
            b0Var = null;
            if (th2 == null) {
                throw th2;
            }
            m.b(b0Var);
        }
    }

    public final void G(String str) throws IOException {
        String strSubstring;
        int iI0 = r30.k.I0(str, ' ', 0, 6);
        if (iI0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iI0 + 1;
        int iI1 = r30.k.I0(str, ' ', i10, 4);
        LinkedHashMap linkedHashMap = this.F;
        if (iI1 == -1) {
            strSubstring = str.substring(i10);
            m.d(strSubstring, "substring(...)");
            if (iI0 == 6 && r.x0(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iI1);
            m.d(strSubstring, "substring(...)");
        }
        Object bVar = linkedHashMap.get(strSubstring);
        if (bVar == null) {
            bVar = new b(this, strSubstring);
            linkedHashMap.put(strSubstring, bVar);
        }
        b bVar2 = (b) bVar;
        if (iI1 == -1 || iI0 != 5 || !r.x0(str, "CLEAN", false)) {
            if (iI1 == -1 && iI0 == 5 && r.x0(str, "DIRTY", false)) {
                bVar2.f11913g = new c7.c(this, bVar2);
                return;
            } else {
                if (iI1 != -1 || iI0 != 4 || !r.x0(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iI1 + 1);
        m.d(strSubstring2, "substring(...)");
        List listX0 = r30.k.X0(strSubstring2, new char[]{' '}, 6);
        bVar2.f11911e = true;
        bVar2.f11913g = null;
        if (listX0.size() != 2) {
            throw new IOException("unexpected journal line: " + listX0);
        }
        try {
            int size = listX0.size();
            for (int i11 = 0; i11 < size; i11++) {
                bVar2.f11908b[i11] = Long.parseLong((String) listX0.get(i11));
            }
        } catch (NumberFormatException unused) {
            throw new IOException("unexpected journal line: " + listX0);
        }
    }

    public final void I(b bVar) {
        b0 b0Var;
        int i10 = bVar.f11914h;
        String str = bVar.f11907a;
        if (i10 > 0 && (b0Var = this.J) != null) {
            b0Var.K("DIRTY");
            b0Var.writeByte(32);
            b0Var.K(str);
            b0Var.writeByte(10);
            b0Var.flush();
        }
        if (bVar.f11914h > 0 || bVar.f11913g != null) {
            bVar.f11912f = true;
            return;
        }
        for (int i11 = 0; i11 < 2; i11++) {
            this.P.f((z) bVar.f11909c.get(i11));
            long j9 = this.H;
            long[] jArr = bVar.f11908b;
            this.H = j9 - jArr[i11];
            jArr[i11] = 0;
        }
        this.I++;
        b0 b0Var2 = this.J;
        if (b0Var2 != null) {
            b0Var2.K("REMOVE");
            b0Var2.writeByte(32);
            b0Var2.K(str);
            b0Var2.writeByte(10);
        }
        this.F.remove(str);
        if (this.I >= 2000) {
            v();
        }
    }

    public final void O() {
        while (this.H > this.B) {
            for (b bVar : this.F.values()) {
                if (!bVar.f11912f) {
                    I(bVar);
                }
            }
            return;
        }
        this.N = false;
    }

    public final synchronized void Z() {
        g00.b0 b0Var;
        try {
            b0 b0Var2 = this.J;
            if (b0Var2 != null) {
                b0Var2.close();
            }
            b0 b0VarQ = bi.b.q(this.P.m(this.D));
            Throwable th2 = null;
            try {
                b0VarQ.K("libcore.io.DiskLruCache");
                b0VarQ.writeByte(10);
                b0VarQ.K("1");
                b0VarQ.writeByte(10);
                b0VarQ.h0(1);
                b0VarQ.writeByte(10);
                b0VarQ.h0(2);
                b0VarQ.writeByte(10);
                b0VarQ.writeByte(10);
                for (b bVar : this.F.values()) {
                    if (bVar.f11913g != null) {
                        b0VarQ.K("DIRTY");
                        b0VarQ.writeByte(32);
                        b0VarQ.K(bVar.f11907a);
                        b0VarQ.writeByte(10);
                    } else {
                        b0VarQ.K("CLEAN");
                        b0VarQ.writeByte(32);
                        b0VarQ.K(bVar.f11907a);
                        for (long j9 : bVar.f11908b) {
                            b0VarQ.writeByte(32);
                            b0VarQ.h0(j9);
                        }
                        b0VarQ.writeByte(10);
                    }
                }
                b0Var = g00.b0.a;
                try {
                    b0VarQ.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                try {
                    b0VarQ.close();
                } catch (Throwable th5) {
                    s0.V(th4, th5);
                }
                b0Var = null;
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            m.b(b0Var);
            if (this.P.g(this.C)) {
                this.P.b(this.C, this.E);
                this.P.b(this.D, this.C);
                this.P.f(this.E);
            } else {
                this.P.b(this.D, this.C);
            }
            this.J = x();
            this.I = 0;
            this.K = false;
            this.O = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    @Override
    public final synchronized void close() {
        try {
            if (this.L && !this.M) {
                for (b bVar : (b[]) this.F.values().toArray(new b[0])) {
                    c7.c cVar = bVar.f11913g;
                    if (cVar != null) {
                        b bVar2 = (b) cVar.B;
                        if (m.a(bVar2.f11913g, cVar)) {
                            bVar2.f11912f = true;
                        }
                    }
                }
                O();
                c0.i(this.G, (CancellationException) null);
                b0 b0Var = this.J;
                m.b(b0Var);
                b0Var.close();
                this.J = null;
                this.M = true;
                return;
            }
            this.M = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final synchronized void flush() {
        if (this.L) {
            if (this.M) {
                throw new IllegalStateException("cache is closed");
            }
            O();
            b0 b0Var = this.J;
            m.b(b0Var);
            b0Var.flush();
        }
    }

    public final synchronized c7.c i(String str) {
        if (this.M) {
            throw new IllegalStateException("cache is closed");
        }
        S(str);
        r();
        b bVar = (b) this.F.get(str);
        if ((bVar != null ? bVar.f11913g : null) != null) {
            return null;
        }
        if (bVar != null && bVar.f11914h != 0) {
            return null;
        }
        if (!this.N && !this.O) {
            b0 b0Var = this.J;
            m.b(b0Var);
            b0Var.K("DIRTY");
            b0Var.writeByte(32);
            b0Var.K(str);
            b0Var.writeByte(10);
            b0Var.flush();
            if (this.K) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, str);
                this.F.put(str, bVar);
            }
            c7.c cVar = new c7.c(this, bVar);
            bVar.f11913g = cVar;
            return cVar;
        }
        v();
        return null;
    }

    public final synchronized c l(String str) {
        c cVarA;
        if (this.M) {
            throw new IllegalStateException("cache is closed");
        }
        S(str);
        r();
        b bVar = (b) this.F.get(str);
        if (bVar != null && (cVarA = bVar.a()) != null) {
            boolean z10 = true;
            this.I++;
            b0 b0Var = this.J;
            m.b(b0Var);
            b0Var.K("READ");
            b0Var.writeByte(32);
            b0Var.K(str);
            b0Var.writeByte(10);
            if (this.I < 2000) {
                z10 = false;
            }
            if (z10) {
                v();
            }
            return cVarA;
        }
        return null;
    }

    public final synchronized void r() {
        try {
            if (this.L) {
                return;
            }
            this.P.f(this.D);
            if (this.P.g(this.E)) {
                if (this.P.g(this.C)) {
                    this.P.f(this.E);
                } else {
                    this.P.b(this.E, this.C);
                }
            }
            if (this.P.g(this.C)) {
                try {
                    F();
                    A();
                    this.L = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        a0.V(this.A, this.P);
                        this.M = false;
                        Z();
                        this.L = true;
                    } catch (Throwable th2) {
                        this.M = false;
                        throw th2;
                    }
                }
            }
            Z();
            this.L = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void v() {
        c0.y(this.G, (i) null, (a40.a0) null, new y0(this, (k00.c) null, 7), 3);
    }

    public final b0 x() {
        d dVar = this.P;
        dVar.getClass();
        z zVar = this.C;
        m.e(zVar, "file");
        return bi.b.q(new f(dVar.a(zVar), new b3.a(this, 25)));
    }
}
