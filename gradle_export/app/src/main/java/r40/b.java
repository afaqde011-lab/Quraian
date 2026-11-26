package r40;

import qd.s0;

public final class b extends s0 {
    public final int b = 1;
    public final m c;
    public final String d;
    public final Object e;

    public b(m mVar, String str) {
        this.c = mVar;
        this.d = str;
        this.e = mVar.b.b;
    }

    public b(m mVar, String str, n40.e eVar) {
        this.c = mVar;
        this.d = str;
        this.e = eVar;
    }

    public void D(String value) {
        switch (this.b) {
            case 0:
                kotlin.jvm.internal.m.e(value, "value");
                this.c.L(this.d, new q40.r(value, false, (n40.e) this.e));
                break;
            default:
                super.D(value);
                break;
        }
    }

    public final ce.c b() {
        switch (this.b) {
            case 0:
                return this.c.b.b;
            default:
                return (ce.c) this.e;
        }
    }

    public void f(short s) {
        switch (this.b) {
            case 1:
                x0(String.valueOf(s & 65535));
                break;
            default:
                super.f(s);
                break;
        }
    }

    public void g(byte b) {
        switch (this.b) {
            case 1:
                x0(String.valueOf(b & 255));
                break;
            default:
                super.g(b);
                break;
        }
    }

    public void v(int i) {
        switch (this.b) {
            case 1:
                x0(Integer.toUnsignedString(i));
                break;
            default:
                super.v(i);
                break;
        }
    }

    public void x0(String s) {
        kotlin.jvm.internal.m.e(s, "s");
        this.c.L(this.d, new q40.r(s, false, null));
    }

    public void z(long j) {
        switch (this.b) {
            case 1:
                x0(Long.toUnsignedString(j));
                break;
            default:
                super.z(j);
                break;
        }
    }
}
