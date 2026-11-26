package h8;

import a8.i0;
import a8.l0;
import a8.m;
import a8.q;
import a8.r;
import a8.s;
import a8.v;
import androidx.media3.common.ParserException;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import e7.u;
import kh.o;
import oi.k;
import u8.l;
import x8.i;

public final class a implements q {

    public s f6630b;

    public r f6631c;

    public i0 f6632d;

    public l f6633e;

    public int f6635g;

    public long f6636h;

    public int f6637i;

    public final u f6629a = new u(16);

    public long f6638j = -1;

    public int f6634f = 0;

    @Override
    public final void a(s sVar) {
        this.f6630b = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        if (j9 != 0) {
            if (this.f6634f == 3) {
                l lVar = this.f6633e;
                lVar.getClass();
                lVar.b(j9, j10);
                return;
            }
            return;
        }
        this.f6634f = 0;
        this.f6637i = 0;
        this.f6638j = -1L;
        if (this.f6633e != null) {
            this.f6633e = null;
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        while (true) {
            int i10 = this.f6634f;
            if (i10 == 0) {
                int i11 = this.f6637i;
                u uVar2 = this.f6629a;
                if (i11 == 0) {
                    if (!rVar.d(uVar2.f5182a, 0, 8, true)) {
                        s sVar = this.f6630b;
                        sVar.getClass();
                        sVar.q();
                        this.f6630b.b(new v(-9223372036854775807L));
                        this.f6634f = 4;
                        return -1;
                    }
                    this.f6637i = 8;
                    uVar2.N(0);
                    this.f6636h = uVar2.C();
                    this.f6635g = uVar2.m();
                }
                if (this.f6636h == 1) {
                    rVar.readFully(uVar2.f5182a, 8, 8);
                    this.f6637i += 8;
                    this.f6636h = uVar2.G();
                }
                if (this.f6635g == 1836086884) {
                    long position = rVar.getPosition();
                    this.f6638j = position;
                    long j9 = this.f6637i;
                    j8.b bVar = new j8.b(0L, position - j9, -9223372036854775807L, position, this.f6636h - j9);
                    s sVar2 = this.f6630b;
                    sVar2.getClass();
                    l0 l0VarW = sVar2.w(1024, 4);
                    androidx.media3.common.s sVar3 = new androidx.media3.common.s();
                    sVar3.l = x0.n("image/heic");
                    sVar3.f1501k = new v0(bVar);
                    k.w(sVar3, l0VarW);
                    this.f6634f = 2;
                } else {
                    this.f6634f = 1;
                }
            } else if (i10 == 1) {
                rVar.u((int) (this.f6636h - ((long) this.f6637i)));
                this.f6637i = 0;
                this.f6634f = 0;
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.f6632d == null || rVar != this.f6631c) {
                        this.f6631c = rVar;
                        this.f6632d = new i0(rVar, this.f6638j);
                    }
                    l lVar = this.f6633e;
                    lVar.getClass();
                    int iD = lVar.d(this.f6632d, uVar);
                    if (iD == 1) {
                        uVar.f307a += this.f6638j;
                    }
                    return iD;
                }
                if (this.f6633e == null) {
                    this.f6633e = new l(i.f16490z, 8);
                }
                i0 i0Var = new i0(rVar, this.f6638j);
                this.f6632d = i0Var;
                if (this.f6633e.e(i0Var)) {
                    l lVar2 = this.f6633e;
                    long j10 = this.f6638j;
                    s sVar4 = this.f6630b;
                    sVar4.getClass();
                    lVar2.a(new i0(j10, sVar4, 1));
                    this.f6634f = 3;
                } else {
                    s sVar5 = this.f6630b;
                    sVar5.getClass();
                    sVar5.q();
                    this.f6630b.b(new v(-9223372036854775807L));
                    this.f6634f = 4;
                }
            }
        }
    }

    @Override
    public final boolean e(r rVar) {
        return o.P((m) rVar, true);
    }

    @Override
    public final void release() {
        l lVar = this.f6633e;
        if (lVar != null) {
            lVar.getClass();
            this.f6633e = null;
        }
    }
}
