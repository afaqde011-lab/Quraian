package h9;

import a8.n0;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaStatus;
import g1.c3;

public final class a0 implements a8.q {

    public boolean f6648e;

    public boolean f6649f;

    public boolean f6650g;

    public long f6651h;

    public f8.b f6652i;

    public a8.s f6653j;

    public boolean f6654k;

    public final e7.e0 f6644a = new e7.e0(0);

    public final e7.u f6646c = new e7.u(4096);

    public final SparseArray f6645b = new SparseArray();

    public final y f6647d = new y(0);

    @Override
    public final void a(a8.s sVar) {
        this.f6653j = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        long j11;
        SparseArray sparseArray = this.f6645b;
        e7.e0 e0Var = this.f6644a;
        synchronized (e0Var) {
            j11 = e0Var.f5125b;
        }
        boolean z10 = j11 == -9223372036854775807L;
        if (!z10) {
            long jD = e0Var.d();
            z10 = (jD == -9223372036854775807L || jD == 0 || jD == j10) ? false : true;
        }
        if (z10) {
            e0Var.e(j10);
        }
        f8.b bVar = this.f6652i;
        if (bVar != null) {
            bVar.d(j10);
        }
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            z zVar = (z) sparseArray.valueAt(i10);
            zVar.f6940f = false;
            zVar.f6935a.a();
        }
    }

    @Override
    public final int d(a8.r rVar, a8.u uVar) {
        i kVar;
        long jC;
        long j9;
        this.f6653j.getClass();
        long length = rVar.getLength();
        y yVar = this.f6647d;
        if (length != -1 && !yVar.f6929d) {
            e7.e0 e0Var = yVar.f6927b;
            e7.u uVar2 = yVar.f6928c;
            if (!yVar.f6931f) {
                long length2 = rVar.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j10 = length2 - ((long) iMin);
                if (rVar.getPosition() != j10) {
                    uVar.f307a = j10;
                    return 1;
                }
                uVar2.K(iMin);
                rVar.t();
                rVar.a(0, iMin, uVar2.f5182a);
                int i10 = uVar2.f5183b;
                for (int i11 = uVar2.f5184c - 4; i11 >= i10; i11--) {
                    if (y.b(i11, uVar2.f5182a) == 442) {
                        uVar2.N(i11 + 4);
                        long jC2 = y.c(uVar2);
                        if (jC2 != -9223372036854775807L) {
                            j9 = jC2;
                            yVar.f6933h = j9;
                            yVar.f6931f = true;
                            return 0;
                        }
                    }
                }
                j9 = -9223372036854775807L;
                yVar.f6933h = j9;
                yVar.f6931f = true;
                return 0;
            }
            if (yVar.f6933h == -9223372036854775807L) {
                yVar.a(rVar);
                return 0;
            }
            if (yVar.f6930e) {
                long j11 = yVar.f6932g;
                if (j11 == -9223372036854775807L) {
                    yVar.a(rVar);
                    return 0;
                }
                yVar.f6934i = e0Var.c(yVar.f6933h) - e0Var.b(j11);
                yVar.a(rVar);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, rVar.getLength());
            long j12 = 0;
            if (rVar.getPosition() != j12) {
                uVar.f307a = j12;
                return 1;
            }
            uVar2.K(iMin2);
            rVar.t();
            rVar.a(0, iMin2, uVar2.f5182a);
            int i12 = uVar2.f5184c;
            for (int i13 = uVar2.f5183b; i13 < i12 - 3; i13++) {
                if (y.b(i13, uVar2.f5182a) == 442) {
                    uVar2.N(i13 + 4);
                    jC = y.c(uVar2);
                    if (jC != -9223372036854775807L) {
                        yVar.f6932g = jC;
                        yVar.f6930e = true;
                        return 0;
                    }
                }
            }
            jC = -9223372036854775807L;
            yVar.f6932g = jC;
            yVar.f6930e = true;
            return 0;
        }
        if (!this.f6654k) {
            this.f6654k = true;
            long j13 = yVar.f6934i;
            if (j13 != -9223372036854775807L) {
                e7.e0 e0Var2 = yVar.f6927b;
                hb.f fVar = new hb.f();
                h1.l lVar = new h1.l();
                lVar.A = e0Var2;
                lVar.B = new e7.u();
                f8.b bVar = new f8.b(fVar, lVar, j13, j13 + 1, 0L, length, 188L, 1000);
                this.f6652i = bVar;
                this.f6653j.b(bVar.f5553a);
            } else {
                this.f6653j.b(new a8.v(j13));
            }
        }
        f8.b bVar2 = this.f6652i;
        if (bVar2 != null && bVar2.f5555c != null) {
            return bVar2.b(rVar, uVar);
        }
        rVar.t();
        long j14 = length != -1 ? length - rVar.j() : -1L;
        if (j14 != -1 && j14 < 4) {
            return -1;
        }
        e7.u uVar3 = this.f6646c;
        if (!rVar.i(uVar3.f5182a, 0, 4, true)) {
            return -1;
        }
        uVar3.N(0);
        int iM = uVar3.m();
        if (iM == 441) {
            return -1;
        }
        if (iM == 442) {
            rVar.a(0, 10, uVar3.f5182a);
            uVar3.N(9);
            rVar.u((uVar3.A() & 7) + 14);
            return 0;
        }
        if (iM == 443) {
            rVar.a(0, 2, uVar3.f5182a);
            uVar3.N(0);
            rVar.u(uVar3.H() + 6);
            return 0;
        }
        if (((iM & (-256)) >> 8) != 1) {
            rVar.u(1);
            return 0;
        }
        int i14 = iM & 255;
        SparseArray sparseArray = this.f6645b;
        z zVar = (z) sparseArray.get(i14);
        if (!this.f6648e) {
            if (zVar == null) {
                if (i14 == 189) {
                    kVar = new b("video/mp2p");
                    this.f6649f = true;
                    this.f6651h = rVar.getPosition();
                } else if ((iM & 224) == 192) {
                    kVar = new u(null, 0, "video/mp2p");
                    this.f6649f = true;
                    this.f6651h = rVar.getPosition();
                } else if ((iM & 240) == 224) {
                    kVar = new k(null, "video/mp2p");
                    this.f6650g = true;
                    this.f6651h = rVar.getPosition();
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    kVar.c(this.f6653j, new c3(i14, 256));
                    zVar = new z(kVar, this.f6644a);
                    sparseArray.put(i14, zVar);
                }
            }
            if (rVar.getPosition() > ((this.f6649f && this.f6650g) ? this.f6651h + MediaStatus.COMMAND_PLAYBACK_RATE : 1048576L)) {
                this.f6648e = true;
                this.f6653j.q();
            }
        }
        rVar.a(0, 2, uVar3.f5182a);
        uVar3.N(0);
        int iH = uVar3.H() + 6;
        if (zVar == null) {
            rVar.u(iH);
            return 0;
        }
        uVar3.K(iH);
        rVar.readFully(uVar3.f5182a, 0, iH);
        uVar3.N(6);
        i iVar = zVar.f6935a;
        n0 n0Var = zVar.f6937c;
        uVar3.k(0, 3, n0Var.f300b);
        n0Var.q(0);
        n0Var.t(8);
        zVar.f6938d = n0Var.h();
        zVar.f6939e = n0Var.h();
        n0Var.t(6);
        uVar3.k(0, n0Var.i(8), n0Var.f300b);
        n0Var.q(0);
        e7.e0 e0Var3 = zVar.f6936b;
        zVar.f6941g = 0L;
        if (zVar.f6938d) {
            n0Var.t(4);
            long jI = ((long) n0Var.i(3)) << 30;
            n0Var.t(1);
            long jI2 = jI | ((long) (n0Var.i(15) << 15));
            n0Var.t(1);
            long jI3 = jI2 | ((long) n0Var.i(15));
            n0Var.t(1);
            if (!zVar.f6940f && zVar.f6939e) {
                n0Var.t(4);
                long jI4 = ((long) n0Var.i(3)) << 30;
                n0Var.t(1);
                long jI5 = jI4 | ((long) (n0Var.i(15) << 15));
                n0Var.t(1);
                long jI6 = jI5 | ((long) n0Var.i(15));
                n0Var.t(1);
                e0Var3.b(jI6);
                zVar.f6940f = true;
            }
            zVar.f6941g = e0Var3.b(jI3);
        }
        iVar.e(4, zVar.f6941g);
        iVar.b(uVar3);
        iVar.d(false);
        uVar3.M(uVar3.f5182a.length);
        return 0;
    }

    @Override
    public final boolean e(a8.r rVar) {
        byte[] bArr = new byte[14];
        a8.m mVar = (a8.m) rVar;
        mVar.i(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            mVar.b(bArr[13] & 7, false);
            mVar.i(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void release() {
    }
}
