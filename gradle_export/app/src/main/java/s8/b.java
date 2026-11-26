package s8;

import a8.r;
import java.util.ArrayDeque;
import o9.q;

public final class b {

    public final byte[] f13823a = new byte[8];

    public final ArrayDeque f13824b = new ArrayDeque();

    public final g f13825c = new g();

    public q f13826d;

    public int f13827e;

    public int f13828f;

    public long f13829g;

    public final long a(r rVar, int i10) {
        byte[] bArr = this.f13823a;
        rVar.readFully(bArr, 0, i10);
        long j9 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j9 = (j9 << 8) | ((long) (bArr[i11] & 255));
        }
        return j9;
    }
}
