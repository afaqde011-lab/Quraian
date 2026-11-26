package x40;

public final class a0 {
    public th.o a;
    public x b;
    public String d;
    public o e;
    public d0 g;
    public b0 h;
    public b0 i;
    public b0 j;
    public long k;
    public long l;
    public b50.e m;
    public int c = -1;
    public db.g f = new db.g(9, (byte) 0);

    public static void b(String str, b0 b0Var) {
        if (b0Var != null) {
            if (b0Var.G != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (b0Var.H != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (b0Var.I != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (b0Var.J != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final b0 a() {
        int i = this.c;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.c).toString());
        }
        th.o oVar = this.a;
        if (oVar == null) {
            throw new IllegalStateException("request == null");
        }
        x xVar = this.b;
        if (xVar == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.d;
        if (str != null) {
            return new b0(oVar, xVar, str, i, this.e, this.f.j(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        throw new IllegalStateException("message == null");
    }
}
