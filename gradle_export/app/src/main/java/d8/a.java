package d8;

import a8.f0;
import a8.m;
import a8.q;
import a8.r;
import a8.s;
import e7.u;

public final class a implements q {

    public final int f4786a;

    public final u f4787b;

    public final f0 f4788c;

    public a(int i10) {
        this.f4786a = i10;
        switch (i10) {
            case 1:
                this.f4787b = new u(4);
                this.f4788c = new f0(-1, "image/webp", -1);
                break;
            default:
                this.f4787b = new u(4);
                this.f4788c = new f0(-1, "image/avif", -1);
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }

    @Override
    public final void a(s sVar) {
        switch (this.f4786a) {
            case 0:
                this.f4788c.a(sVar);
                break;
            default:
                this.f4788c.a(sVar);
                break;
        }
    }

    @Override
    public final void b(long j9, long j10) {
        switch (this.f4786a) {
            case 0:
                this.f4788c.b(j9, j10);
                break;
            default:
                this.f4788c.b(j9, j10);
                break;
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) {
        switch (this.f4786a) {
            case 0:
                break;
        }
        return this.f4788c.d(rVar, uVar);
    }

    @Override
    public final boolean e(r rVar) {
        switch (this.f4786a) {
            case 0:
                m mVar = (m) rVar;
                mVar.b(4, false);
                u uVar = this.f4787b;
                uVar.K(4);
                mVar.i(uVar.f5182a, 0, 4, false);
                if (uVar.C() != 1718909296) {
                    return false;
                }
                uVar.K(4);
                mVar.i(uVar.f5182a, 0, 4, false);
                return uVar.C() == ((long) 1635150182);
            default:
                u uVar2 = this.f4787b;
                uVar2.K(4);
                m mVar2 = (m) rVar;
                mVar2.i(uVar2.f5182a, 0, 4, false);
                if (uVar2.C() != 1380533830) {
                    return false;
                }
                mVar2.b(4, false);
                uVar2.K(4);
                mVar2.i(uVar2.f5182a, 0, 4, false);
                return uVar2.C() == 1464156752;
        }
    }

    @Override
    public final void release() {
        int i10 = this.f4786a;
    }
}
