package androidx.media3.common;

public final class i2 extends k2 {

    public final fh.t0 f1264a;

    public final fh.t0 f1265b;

    public final int[] f1266c;

    public final int[] f1267d;

    public i2(fh.d2 d2Var, fh.d2 d2Var2, int[] iArr) {
        ta.c0.s(d2Var.D == iArr.length);
        this.f1264a = d2Var;
        this.f1265b = d2Var2;
        this.f1266c = iArr;
        this.f1267d = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f1267d[iArr[i10]] = i10;
        }
    }

    @Override
    public final int getFirstWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        if (z10) {
            return this.f1266c[0];
        }
        return 0;
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int getLastWindowIndex(boolean z10) {
        if (isEmpty()) {
            return -1;
        }
        fh.t0 t0Var = this.f1264a;
        if (!z10) {
            return t0Var.size() - 1;
        }
        return this.f1266c[t0Var.size() - 1];
    }

    @Override
    public final int getNextWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == getLastWindowIndex(z10)) {
            if (i11 == 2) {
                return getFirstWindowIndex(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 + 1;
        }
        return this.f1266c[this.f1267d[i10] + 1];
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        h2 h2Var2 = (h2) this.f1265b.get(i10);
        h2Var.j(h2Var2.f1231a, h2Var2.f1232b, h2Var2.f1233c, h2Var2.f1234d, h2Var2.f1235e, h2Var2.f1237g, h2Var2.f1236f);
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return this.f1265b.size();
    }

    @Override
    public final int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        if (i11 == 1) {
            return i10;
        }
        if (i10 == getFirstWindowIndex(z10)) {
            if (i11 == 2) {
                return getLastWindowIndex(z10);
            }
            return -1;
        }
        if (!z10) {
            return i10 - 1;
        }
        return this.f1266c[this.f1267d[i10] - 1];
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        j2 j2Var2 = (j2) this.f1264a.get(i10);
        j2Var.b(j2Var2.f1283a, j2Var2.f1285c, j2Var2.f1286d, j2Var2.f1287e, j2Var2.f1288f, j2Var2.f1289g, j2Var2.f1290h, j2Var2.f1291i, j2Var2.f1292j, j2Var2.l, j2Var2.m, j2Var2.f1294n, j2Var2.f1295o, j2Var2.f1296p);
        j2Var.f1293k = j2Var2.f1293k;
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return this.f1264a.size();
    }
}
