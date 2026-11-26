package x40;

import java.io.Closeable;

public final class b0 implements Closeable {
    public final th.o A;
    public final x B;
    public final String C;
    public final int D;
    public final o E;
    public final p F;
    public final d0 G;
    public final b0 H;
    public final b0 I;
    public final b0 J;
    public final long K;
    public final long L;
    public final b50.e M;
    public d N;

    public b0(th.o request, x protocol, String message, int i, o oVar, p pVar, d0 d0Var, b0 b0Var, b0 b0Var2, b0 b0Var3, long j, long j2, b50.e eVar) {
        kotlin.jvm.internal.m.e(request, "request");
        kotlin.jvm.internal.m.e(protocol, "protocol");
        kotlin.jvm.internal.m.e(message, "message");
        this.A = request;
        this.B = protocol;
        this.C = message;
        this.D = i;
        this.E = oVar;
        this.F = pVar;
        this.G = d0Var;
        this.H = b0Var;
        this.I = b0Var2;
        this.J = b0Var3;
        this.K = j;
        this.L = j2;
        this.M = eVar;
    }

    public static String a(String str, b0 b0Var) {
        b0Var.getClass();
        String strA = b0Var.F.a(str);
        if (strA == null) {
            return null;
        }
        return strA;
    }

    @Override
    public final void close() {
        d0 d0Var = this.G;
        if (d0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        d0Var.close();
    }

    public final boolean i() {
        int i = this.D;
        return 200 <= i && i < 300;
    }

    public final a0 l() {
        a0 a0Var = new a0();
        a0Var.a = this.A;
        a0Var.b = this.B;
        a0Var.c = this.D;
        a0Var.d = this.C;
        a0Var.e = this.E;
        a0Var.f = this.F.e();
        a0Var.g = this.G;
        a0Var.h = this.H;
        a0Var.i = this.I;
        a0Var.j = this.J;
        a0Var.k = this.K;
        a0Var.l = this.L;
        a0Var.m = this.M;
        return a0Var;
    }

    public final String toString() {
        return "Response{protocol=" + this.B + ", code=" + this.D + ", message=" + this.C + ", url=" + ((q) this.A.C) + '}';
    }
}
