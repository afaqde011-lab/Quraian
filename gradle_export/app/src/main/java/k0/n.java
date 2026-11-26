package k0;

import java.util.List;
import java.util.Objects;

public final class n {

    public final int f8477a;

    public final int f8478b;

    public final Object f8479c;

    public final Object f8480d;

    public final Object f8481e;

    public final Object f8482f;

    public n(androidx.media3.common.t tVar, androidx.media3.common.t tVar2, int i10, int i11, k7.k kVar, c7.j jVar) {
        this.f8479c = tVar;
        this.f8480d = tVar2;
        this.f8477a = i10;
        this.f8478b = i11;
        this.f8481e = kVar;
        this.f8482f = jVar;
    }

    public n(h7.b bVar, int i10, int i11, m mVar, c50.f fVar) {
        this.f8480d = bVar;
        this.f8479c = bVar;
        this.f8477a = i10;
        this.f8478b = i11;
        this.f8481e = mVar;
        this.f8482f = fVar;
    }

    public static boolean a(n nVar) {
        return Objects.equals(((androidx.media3.common.t) nVar.f8479c).f1594n, "audio/raw");
    }

    public long b(int i10, int i11) {
        int i12;
        h7.b bVar = (h7.b) this.f8479c;
        int[] iArr = (int[]) bVar.A;
        if (i11 == 1) {
            i12 = iArr[i10];
        } else {
            int i13 = (i11 + i10) - 1;
            int[] iArr2 = (int[]) bVar.B;
            i12 = (iArr2[i13] + iArr[i13]) - iArr2[i10];
        }
        if (i12 < 0) {
            i12 = 0;
        }
        if (i12 < 0) {
            y3.i.a("width must be >= 0");
        }
        return y3.b.h(i12, i12, 0, Integer.MAX_VALUE);
    }

    public r c(int i10) {
        v vVarC = ((c50.f) this.f8482f).c(i10);
        int i11 = vVarC.f8540a;
        List list = vVarC.f8541b;
        int size = list.size();
        int i12 = (size == 0 || i11 + size == this.f8477a) ? 0 : this.f8478b;
        q[] qVarArr = new q[size];
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            int i15 = (int) ((d) list.get(i14)).f8459a;
            q qVarW0 = ((m) this.f8481e).W0(i11 + i14, i13, i15, i12, b(i13, i15));
            i13 += i15;
            qVarArr[i14] = qVarW0;
        }
        return new r(i10, qVarArr, (h7.b) this.f8480d, vVarC.f8541b, i12);
    }
}
