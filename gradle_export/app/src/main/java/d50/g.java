package d50;

import a8.i0;
import c50.h;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import k50.b0;
import k50.c0;
import k50.g0;
import k50.j;
import k50.k;
import kotlin.jvm.internal.m;
import th.o;
import x40.a0;
import x40.p;
import x40.q;
import x40.w;
import x40.x;

public final class g implements c50.d {
    public final int a = 1;
    public int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public Object h;

    public g(h20.a kind, k20.f fVar, String[] strArr, String[] strArr2, String[] strArr3, String str, int i) {
        m.e(kind, "kind");
        this.c = kind;
        this.d = fVar;
        this.e = strArr;
        this.f = strArr2;
        this.g = strArr3;
        this.h = str;
        this.b = i;
    }

    public g(w wVar, b50.m mVar, c0 source, b0 sink) {
        m.e(source, "source");
        m.e(sink, "sink");
        this.c = wVar;
        this.d = mVar;
        this.e = source;
        this.f = sink;
        this.g = new i0(source);
    }

    @Override
    public void a(o request) {
        m.e(request, "request");
        Proxy.Type type = ((b50.m) this.d).b.b.type();
        m.d(type, "connection.route().proxy.type()");
        StringBuilder sb = new StringBuilder();
        sb.append((String) request.B);
        sb.append(' ');
        q qVar = (q) request.C;
        if (qVar.j || type != Proxy.Type.HTTP) {
            String strB = qVar.b();
            String strD = qVar.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(qVar);
        }
        sb.append(" HTTP/1.1");
        String string = sb.toString();
        m.d(string, "StringBuilder().apply(builderAction).toString()");
        j((p) request.D, string);
    }

    @Override
    public void b() {
        ((j) this.f).flush();
    }

    @Override
    public g0 c(o request, long j) {
        m.e(request, "request");
        if ("chunked".equalsIgnoreCase(((p) request.D).a("Transfer-Encoding"))) {
            if (this.b == 1) {
                this.b = 2;
                return new b(this);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.b == 1) {
            this.b = 2;
            return new e(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    @Override
    public void cancel() {
        Socket socket = ((b50.m) this.d).c;
        if (socket != null) {
            y40.b.e(socket);
        }
    }

    @Override
    public a0 d(boolean z) {
        i0 i0Var = (i0) this.g;
        int i = this.b;
        if (i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        try {
            String strZ = ((k) i0Var.C).z(i0Var.B);
            i0Var.B -= (long) strZ.length();
            h hVarQ = ta.c0.Q(strZ);
            int i2 = hVarQ.B;
            a0 a0Var = new a0();
            a0Var.b = (x) hVarQ.C;
            a0Var.c = i2;
            a0Var.d = (String) hVarQ.D;
            a0Var.f = i0Var.I().e();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.b = 3;
                return a0Var;
            }
            if (102 > i2 || i2 >= 200) {
                this.b = 4;
                return a0Var;
            }
            this.b = 3;
            return a0Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(((b50.m) this.d).b.a.h.g()), e);
        }
    }

    @Override
    public b50.m e() {
        return (b50.m) this.d;
    }

    @Override
    public k50.i0 f(x40.b0 b0Var) {
        if (!c50.e.a(b0Var)) {
            return i(0L);
        }
        if ("chunked".equalsIgnoreCase(x40.b0.a("Transfer-Encoding", b0Var))) {
            q qVar = (q) b0Var.A.C;
            if (this.b == 4) {
                this.b = 5;
                return new c(this, qVar);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        long j = y40.b.j(b0Var);
        if (j != -1) {
            return i(j);
        }
        if (this.b == 4) {
            this.b = 5;
            ((b50.m) this.d).k();
            return new f(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    @Override
    public void g() {
        ((j) this.f).flush();
    }

    @Override
    public long h(x40.b0 b0Var) {
        if (!c50.e.a(b0Var)) {
            return 0L;
        }
        if ("chunked".equalsIgnoreCase(x40.b0.a("Transfer-Encoding", b0Var))) {
            return -1L;
        }
        return y40.b.j(b0Var);
    }

    public d i(long j) {
        if (this.b == 4) {
            this.b = 5;
            return new d(this, j);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    public void j(p pVar, String requestLine) {
        j jVar = (j) this.f;
        m.e(requestLine, "requestLine");
        if (this.b != 0) {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        jVar.K(requestLine).K("\r\n");
        int size = pVar.size();
        for (int i = 0; i < size; i++) {
            jVar.K(pVar.c(i)).K(": ").K(pVar.h(i)).K("\r\n");
        }
        jVar.K("\r\n");
        this.b = 1;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((h20.a) this.c) + " version=" + ((k20.f) this.d);
            default:
                return super.toString();
        }
    }
}
