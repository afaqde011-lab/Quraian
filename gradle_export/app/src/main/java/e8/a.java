package e8;

import a8.f0;
import a8.q;
import a8.r;
import a8.s;
import a8.u;

public final class a implements q {

    public final int f5213a;

    public final f0 f5214b;

    public a(int i10) {
        this.f5213a = i10;
        switch (i10) {
            case 1:
                this.f5214b = new f0(35152, "image/png", 2);
                break;
            default:
                this.f5214b = new f0(16973, "image/bmp", 2);
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override
    public final void a(s sVar) {
        switch (this.f5213a) {
            case 0:
                this.f5214b.a(sVar);
                break;
            default:
                this.f5214b.a(sVar);
                break;
        }
    }

    @Override
    public final void b(long j9, long j10) {
        switch (this.f5213a) {
            case 0:
                this.f5214b.b(j9, j10);
                break;
            default:
                this.f5214b.b(j9, j10);
                break;
        }
    }

    @Override
    public final int d(r rVar, u uVar) {
        switch (this.f5213a) {
            case 0:
                break;
        }
        return this.f5214b.d(rVar, uVar);
    }

    @Override
    public final boolean e(r rVar) {
        switch (this.f5213a) {
            case 0:
                break;
        }
        return this.f5214b.e(rVar);
    }

    @Override
    public final void release() {
        int i10 = this.f5213a;
    }
}
