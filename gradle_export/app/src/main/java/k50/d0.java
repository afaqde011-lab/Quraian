package k50;

public final class d0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public d0 f;
    public d0 g;

    public d0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public d0(byte[] data, int i, int i2, boolean z) {
        kotlin.jvm.internal.m.e(data, "data");
        this.a = data;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final d0 a() {
        d0 d0Var = this.f;
        if (d0Var == this) {
            d0Var = null;
        }
        d0 d0Var2 = this.g;
        kotlin.jvm.internal.m.b(d0Var2);
        d0Var2.f = this.f;
        d0 d0Var3 = this.f;
        kotlin.jvm.internal.m.b(d0Var3);
        d0Var3.g = this.g;
        this.f = null;
        this.g = null;
        return d0Var;
    }

    public final void b(d0 segment) {
        kotlin.jvm.internal.m.e(segment, "segment");
        segment.g = this;
        segment.f = this.f;
        d0 d0Var = this.f;
        kotlin.jvm.internal.m.b(d0Var);
        d0Var.g = segment;
        this.f = segment;
    }

    public final d0 c() {
        this.d = true;
        return new d0(this.a, this.b, this.c, true);
    }

    public final void d(d0 sink, int i) {
        kotlin.jvm.internal.m.e(sink, "sink");
        byte[] bArr = sink.a;
        if (!sink.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = sink.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (sink.d) {
                throw new IllegalArgumentException();
            }
            int i4 = sink.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            h00.n.r0(bArr, 0, bArr, i4, i2);
            sink.c -= sink.b;
            sink.b = 0;
        }
        int i5 = sink.c;
        int i6 = this.b;
        h00.n.r0(this.a, i5, bArr, i6, i6 + i);
        sink.c += i;
        this.b += i;
    }
}
