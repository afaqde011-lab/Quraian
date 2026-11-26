package l60;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import sd.p1;

public final class y implements d {
    public final a1.b0 A;
    public final Object B;
    public final Object[] C;
    public final x40.e D;
    public final m E;
    public volatile boolean F;
    public b50.j G;
    public Throwable H;
    public boolean I;

    public y(a1.b0 b0Var, Object obj, Object[] objArr, x40.e eVar, m mVar) {
        this.A = b0Var;
        this.B = obj;
        this.C = objArr;
        this.D = eVar;
        this.E = mVar;
    }

    public final b50.j a() {
        x40.q qVarB;
        a1.b0 b0Var = this.A;
        w0[] w0VarArr = (w0[]) b0Var.l;
        Object[] objArr = this.C;
        int length = objArr.length;
        if (length != w0VarArr.length) {
            throw new IllegalArgumentException(g4.c.g(w0VarArr.length, ")", oi.k.q("Argument count (", length, ") doesn't match expected count (")));
        }
        m0 m0Var = new m0((String) b0Var.h, (x40.q) b0Var.g, (String) b0Var.i, (x40.p) b0Var.j, (x40.s) b0Var.k, b0Var.a, b0Var.b, b0Var.c);
        if (b0Var.d) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            w0VarArr[i].a(m0Var, objArr[i]);
        }
        sg.x xVar = m0Var.d;
        if (xVar != null) {
            qVarB = xVar.b();
        } else {
            String link = m0Var.c;
            x40.q qVar = m0Var.b;
            qVar.getClass();
            kotlin.jvm.internal.m.e(link, "link");
            sg.x xVarF = qVar.f(link);
            qVarB = xVarF != null ? xVarF.b() : null;
            if (qVarB == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + qVar + ", Relative: " + m0Var.c);
            }
        }
        x40.z l0Var = m0Var.k;
        if (l0Var == null) {
            s10.t0 t0Var = m0Var.j;
            if (t0Var != null) {
                l0Var = new x40.n(t0Var.a, t0Var.b);
            } else {
                p1 p1Var = m0Var.i;
                if (p1Var != null) {
                    ArrayList arrayList2 = (ArrayList) p1Var.D;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    l0Var = new x40.u((k50.l) p1Var.B, (x40.s) p1Var.C, y40.b.w(arrayList2));
                } else if (m0Var.h) {
                    long j = 0;
                    y40.b.c(j, j, j);
                    l0Var = new x40.y(0, new byte[0]);
                }
            }
        }
        x40.s sVar = m0Var.g;
        db.g gVar = m0Var.f;
        if (sVar != null) {
            if (l0Var != null) {
                l0Var = new l0(l0Var, sVar);
            } else {
                gVar.b("Content-Type", sVar.a);
            }
        }
        ce.c cVar = m0Var.e;
        cVar.getClass();
        cVar.B = qVarB;
        cVar.D = gVar.j().e();
        cVar.B(m0Var.a, l0Var);
        cVar.G(s.class, new s((Class) b0Var.e, this.B, (Method) b0Var.f, arrayList));
        return ((x40.w) this.D).a(cVar.r());
    }

    public final b50.j b() throws IOException {
        b50.j jVar = this.G;
        if (jVar != null) {
            return jVar;
        }
        Throwable th = this.H;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            b50.j jVarA = a();
            this.G = jVarA;
            return jVarA;
        } catch (IOException | Error | RuntimeException e) {
            w0.r(e);
            this.H = e;
            throw e;
        }
    }

    public final o0 c(x40.b0 b0Var) throws IOException {
        x40.d0 d0Var = b0Var.G;
        x40.a0 a0VarL = b0Var.l();
        a0VarL.g = new x(d0Var.r(), d0Var.l());
        x40.b0 b0VarA = a0VarL.a();
        int i = b0VarA.D;
        if (i < 200 || i >= 300) {
            try {
                k50.i iVar = new k50.i();
                d0Var.v().a0(iVar);
                c50.g gVar = new c50.g(d0Var.r(), d0Var.l(), iVar, 1);
                if (b0VarA.i()) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                o0 o0Var = new o0(b0VarA, null, gVar);
                d0Var.close();
                return o0Var;
            } catch (Throwable th) {
                d0Var.close();
                throw th;
            }
        }
        if (i == 204 || i == 205) {
            d0Var.close();
            if (b0VarA.i()) {
                return new o0(b0VarA, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        w wVar = new w(d0Var);
        try {
            Object objConvert = this.E.convert(wVar);
            if (b0VarA.i()) {
                return new o0(b0VarA, objConvert, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = wVar.D;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override
    public final void cancel() {
        b50.j jVar;
        this.F = true;
        synchronized (this) {
            jVar = this.G;
        }
        if (jVar != null) {
            jVar.cancel();
        }
    }

    public final Object clone() {
        return new y(this.A, this.B, this.C, this.D, this.E);
    }

    @Override
    public final d clone() {
        return new y(this.A, this.B, this.C, this.D, this.E);
    }

    @Override
    public final boolean i() {
        boolean z = true;
        if (this.F) {
            return true;
        }
        synchronized (this) {
            try {
                b50.j jVar = this.G;
                if (jVar == null || !jVar.M) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override
    public final void l(g gVar) {
        b50.j jVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.I) {
                    throw new IllegalStateException("Already executed.");
                }
                this.I = true;
                jVar = this.G;
                th = this.H;
                if (jVar == null && th == null) {
                    try {
                        b50.j jVarA = a();
                        this.G = jVarA;
                        jVar = jVarA;
                    } catch (Throwable th2) {
                        th = th2;
                        w0.r(th);
                        this.H = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            gVar.w0(this, th);
            return;
        }
        if (this.F) {
            jVar.cancel();
        }
        jVar.e(new h7.b(this, gVar, false));
    }

    @Override
    public final synchronized th.o r() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().B;
    }
}
