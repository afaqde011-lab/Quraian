package c50;

import b50.j;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.m;
import okhttp3.internal.http2.ConnectionShutdownException;
import qd.s0;
import th.o;
import x40.a0;
import x40.b0;
import x40.d0;
import x40.p;
import x40.r;
import x40.z;

public final class b implements r {
    public final int b;

    public b(int i) {
        this.b = i;
    }

    @Override
    public final b0 a(f fVar) throws IOException {
        a0 a0VarC;
        IOException iOException;
        switch (this.b) {
            case 0:
                b50.e eVar = (b50.e) fVar.h;
                m.b(eVar);
                j jVar = (j) eVar.b;
                d dVar = (d) eVar.d;
                b50.m mVar = (b50.m) eVar.e;
                o oVar = (o) fVar.i;
                z zVar = (z) oVar.E;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    try {
                        dVar.a(oVar);
                        boolean z = true;
                        try {
                            if (!w50.c.Z((String) oVar.B) || zVar == null) {
                                jVar.j(eVar, true, false, null);
                                a0VarC = null;
                            } else {
                                if ("100-continue".equalsIgnoreCase(((p) oVar.D).a("Expect"))) {
                                    try {
                                        dVar.g();
                                        a0VarC = eVar.c(true);
                                    } catch (IOException e) {
                                        eVar.d(e);
                                        throw e;
                                    }
                                } else {
                                    a0VarC = null;
                                }
                                if (a0VarC == null) {
                                    z zVar2 = (z) oVar.E;
                                    m.b(zVar2);
                                    long jA = zVar2.a();
                                    k50.b0 b0VarQ = bi.b.q(new b50.c(eVar, dVar.c(oVar, jA), jA));
                                    zVar.c(b0VarQ);
                                    b0VarQ.close();
                                } else {
                                    jVar.j(eVar, true, false, null);
                                    if (mVar.g == null) {
                                        z = false;
                                    }
                                    if (!z) {
                                        dVar.e().k();
                                    }
                                }
                            }
                            try {
                                dVar.b();
                                iOException = null;
                            } catch (IOException e2) {
                                eVar.d(e2);
                                throw e2;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            throw e;
                        }
                    } catch (IOException e4) {
                        eVar.d(e4);
                        throw e4;
                    }
                } catch (IOException e5) {
                    e = e5;
                    a0VarC = null;
                    if ((e instanceof ConnectionShutdownException) || !eVar.a) {
                        throw e;
                    }
                    iOException = e;
                }
                if (a0VarC == null) {
                    try {
                        a0VarC = eVar.c(false);
                        m.b(a0VarC);
                    } catch (IOException e6) {
                        if (iOException == null) {
                            throw e6;
                        }
                        s0.V(iOException, e6);
                        throw iOException;
                    }
                }
                a0VarC.a = oVar;
                a0VarC.e = mVar.e;
                a0VarC.k = jCurrentTimeMillis;
                a0VarC.l = System.currentTimeMillis();
                b0 b0VarA = a0VarC.a();
                int i = b0VarA.D;
                if (i == 100 || (102 <= i && i < 200)) {
                    a0 a0VarC2 = eVar.c(false);
                    m.b(a0VarC2);
                    a0VarC2.a = oVar;
                    a0VarC2.e = mVar.e;
                    a0VarC2.k = jCurrentTimeMillis;
                    a0VarC2.l = System.currentTimeMillis();
                    b0VarA = a0VarC2.a();
                    i = b0VarA.D;
                }
                a0 a0VarL = b0VarA.l();
                try {
                    String strA = b0.a("Content-Type", b0VarA);
                    long jH = dVar.h(b0VarA);
                    a0VarL.g = new g(strA, jH, bi.b.r(new b50.d(eVar, dVar.f(b0VarA), jH)), 0);
                    b0 b0VarA2 = a0VarL.a();
                    if ("close".equalsIgnoreCase(((p) b0VarA2.A.D).a("Connection")) || "close".equalsIgnoreCase(b0.a("Connection", b0VarA2))) {
                        dVar.e().k();
                    }
                    if (i == 204 || i == 205) {
                        d0 d0Var = b0VarA2.G;
                        if ((d0Var != null ? d0Var.l() : -1L) > 0) {
                            StringBuilder sb = new StringBuilder("HTTP ");
                            sb.append(i);
                            sb.append(" had non-zero Content-Length: ");
                            d0 d0Var2 = b0VarA2.G;
                            sb.append(d0Var2 != null ? Long.valueOf(d0Var2.l()) : null);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    return b0VarA2;
                } catch (IOException e7) {
                    eVar.d(e7);
                    throw e7;
                }
            default:
                return fVar.f((o) fVar.i);
        }
    }
}
