package f8;

import a8.i;
import a8.j;
import a8.r;
import a8.u;
import a8.w;
import java.nio.ByteOrder;

public final class a implements j {
    public final w A;
    public final int B;
    public final u C = new u();

    public a(w wVar, int i10) {
        this.A = wVar;
        this.B = i10;
    }

    @Override
    public final i H0(r rVar, long j9) {
        long position = rVar.getPosition();
        long jA = a(rVar);
        long j10 = rVar.j();
        rVar.m(Math.max(6, this.A.f313c));
        long jA2 = a(rVar);
        long j11 = rVar.j();
        if (jA > j9 || jA2 <= j9) {
            return jA2 <= j9 ? new i(-2, jA2, j11) : new i(-1, jA, position);
        }
        return new i(0, -9223372036854775807L, j10);
    }

    public final long a(r rVar) {
        u uVar;
        w wVar;
        int iF;
        while (true) {
            long j9 = rVar.j();
            long length = rVar.getLength() - 6;
            uVar = this.C;
            wVar = this.A;
            if (j9 >= length) {
                break;
            }
            long j10 = rVar.j();
            e7.u uVar2 = new e7.u(17);
            int i10 = 0;
            boolean zB = false;
            rVar.a(0, 2, uVar2.f5182a);
            char cG = uVar2.g(0, ByteOrder.BIG_ENDIAN);
            int i11 = this.B;
            if (cG != i11) {
                rVar.t();
                rVar.m((int) (j10 - rVar.getPosition()));
            } else {
                byte[] bArr = uVar2.f5182a;
                while (i10 < 15 && (iF = rVar.f(2 + i10, 15 - i10, bArr)) != -1) {
                    i10 += iF;
                }
                uVar2.M(i10 + 2);
                rVar.t();
                rVar.m((int) (j10 - rVar.getPosition()));
                zB = a8.b.b(uVar2, wVar, i11, uVar);
            }
            if (zB) {
                break;
            }
            rVar.m(1);
        }
        if (rVar.j() < rVar.getLength() - 6) {
            return uVar.f307a;
        }
        rVar.m((int) (rVar.getLength() - rVar.j()));
        return wVar.f320j;
    }
}
