package h0;

public final class e1 implements l2 {

    public final l2 f6400a;

    public final int f6401b;

    public e1(l2 l2Var, int i10) {
        this.f6400a = l2Var;
        this.f6401b = i10;
    }

    @Override
    public final int a(y3.c cVar, y3.m mVar) {
        if (((mVar == y3.m.A ? 4 : 1) & this.f6401b) != 0) {
            return this.f6400a.a(cVar, mVar);
        }
        return 0;
    }

    @Override
    public final int b(y3.c cVar) {
        if ((this.f6401b & 32) != 0) {
            return this.f6400a.b(cVar);
        }
        return 0;
    }

    @Override
    public final int c(y3.c cVar) {
        if ((this.f6401b & 16) != 0) {
            return this.f6400a.c(cVar);
        }
        return 0;
    }

    @Override
    public final int d(y3.c cVar, y3.m mVar) {
        if (((mVar == y3.m.A ? 8 : 2) & this.f6401b) != 0) {
            return this.f6400a.d(cVar, mVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return kotlin.jvm.internal.m.a(this.f6400a, e1Var.f6400a) && this.f6401b == e1Var.f6401b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6401b) + (this.f6400a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f6400a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = c.f6389h;
        int i11 = this.f6401b;
        if ((i11 & i10) == i10) {
            c.J("Start", sb4);
        }
        int i12 = c.f6391j;
        if ((i11 & i12) == i12) {
            c.J("Left", sb4);
        }
        if ((i11 & 16) == 16) {
            c.J("Top", sb4);
        }
        int i13 = c.f6390i;
        if ((i11 & i13) == i13) {
            c.J("End", sb4);
        }
        int i14 = c.f6392k;
        if ((i11 & i14) == i14) {
            c.J("Right", sb4);
        }
        if ((i11 & 32) == 32) {
            c.J("Bottom", sb4);
        }
        sb3.append(sb4.toString());
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
