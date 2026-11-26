package f8;

import a8.f;
import a8.g;
import a8.h;
import a8.i;
import a8.j;
import a8.r;
import a8.u;
import com.google.android.gms.cast.MediaStatus;

public final class b {

    public final f f5553a;

    public final j f5554b;

    public g f5555c;

    public final int f5556d;

    public b(h hVar, j jVar, long j9, long j10, long j11, long j12, long j13, int i10) {
        this.f5554b = jVar;
        this.f5556d = i10;
        this.f5553a = new f(hVar, j9, j10, j11, j12, j13);
    }

    public static int a(int i10, byte[] bArr) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public static int c(r rVar, long j9, u uVar) {
        if (j9 == rVar.getPosition()) {
            return 0;
        }
        uVar.f307a = j9;
        return 1;
    }

    public final int b(r rVar, u uVar) {
        while (true) {
            g gVar = this.f5555c;
            gVar.getClass();
            long j9 = gVar.f273f;
            long j10 = gVar.f274g;
            long j11 = gVar.f275h;
            long j12 = j10 - j9;
            long j13 = this.f5556d;
            j jVar = this.f5554b;
            if (j12 <= j13) {
                this.f5555c = null;
                jVar.z0();
                return c(rVar, j9, uVar);
            }
            long position = j11 - rVar.getPosition();
            if (position < 0 || position > MediaStatus.COMMAND_STREAM_TRANSFER) {
                return c(rVar, j11, uVar);
            }
            rVar.u((int) position);
            rVar.t();
            i iVarH0 = jVar.H0(rVar, gVar.f269b);
            int i10 = iVarH0.f277a;
            long j14 = iVarH0.f278b;
            long j15 = iVarH0.f279c;
            if (i10 == -3) {
                this.f5555c = null;
                jVar.z0();
                return c(rVar, j11, uVar);
            }
            if (i10 == -2) {
                gVar.f271d = j14;
                gVar.f273f = j15;
                gVar.f275h = g.a(gVar.f269b, j14, gVar.f272e, j15, gVar.f274g, gVar.f270c);
            } else {
                if (i10 != -1) {
                    if (i10 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    long position2 = j15 - rVar.getPosition();
                    if (position2 >= 0 && position2 <= MediaStatus.COMMAND_STREAM_TRANSFER) {
                        rVar.u((int) position2);
                    }
                    this.f5555c = null;
                    jVar.z0();
                    return c(rVar, j15, uVar);
                }
                gVar.f272e = j14;
                gVar.f274g = j15;
                gVar.f275h = g.a(gVar.f269b, gVar.f271d, j14, gVar.f273f, j15, gVar.f270c);
            }
        }
    }

    public final void d(long j9) {
        g gVar = this.f5555c;
        if (gVar == null || gVar.f268a != j9) {
            f fVar = this.f5553a;
            this.f5555c = new g(j9, fVar.f255a.b(j9), fVar.f257c, fVar.f258d, fVar.f259e, fVar.f260f);
        }
    }
}
