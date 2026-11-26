package s7;

import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;

public abstract class p extends k2 {

    public final k2 f13728a;

    public p(k2 k2Var) {
        this.f13728a = k2Var;
    }

    @Override
    public final int getFirstWindowIndex(boolean z10) {
        return this.f13728a.getFirstWindowIndex(z10);
    }

    @Override
    public int getIndexOfPeriod(Object obj) {
        return this.f13728a.getIndexOfPeriod(obj);
    }

    @Override
    public final int getLastWindowIndex(boolean z10) {
        return this.f13728a.getLastWindowIndex(z10);
    }

    @Override
    public final int getNextWindowIndex(int i10, int i11, boolean z10) {
        return this.f13728a.getNextWindowIndex(i10, i11, z10);
    }

    @Override
    public h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        return this.f13728a.getPeriod(i10, h2Var, z10);
    }

    @Override
    public final int getPeriodCount() {
        return this.f13728a.getPeriodCount();
    }

    @Override
    public final int getPreviousWindowIndex(int i10, int i11, boolean z10) {
        return this.f13728a.getPreviousWindowIndex(i10, i11, z10);
    }

    @Override
    public Object getUidOfPeriod(int i10) {
        return this.f13728a.getUidOfPeriod(i10);
    }

    @Override
    public j2 getWindow(int i10, j2 j2Var, long j9) {
        return this.f13728a.getWindow(i10, j2Var, j9);
    }

    @Override
    public final int getWindowCount() {
        return this.f13728a.getWindowCount();
    }
}
