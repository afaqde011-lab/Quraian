package s7;

import androidx.media3.common.h2;
import androidx.media3.common.j2;
import androidx.media3.common.k2;
import java.util.Objects;

public final class t extends p {

    public static final Object f13756d = new Object();

    public final Object f13757b;

    public final Object f13758c;

    public t(k2 k2Var, Object obj, Object obj2) {
        super(k2Var);
        this.f13757b = obj;
        this.f13758c = obj2;
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        Object obj2;
        if (f13756d.equals(obj) && (obj2 = this.f13758c) != null) {
            obj = obj2;
        }
        return this.f13728a.getIndexOfPeriod(obj);
    }

    @Override
    public final h2 getPeriod(int i10, h2 h2Var, boolean z10) {
        this.f13728a.getPeriod(i10, h2Var, z10);
        if (Objects.equals(h2Var.f1232b, this.f13758c) && z10) {
            h2Var.f1232b = f13756d;
        }
        return h2Var;
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        Object uidOfPeriod = this.f13728a.getUidOfPeriod(i10);
        return Objects.equals(uidOfPeriod, this.f13758c) ? f13756d : uidOfPeriod;
    }

    @Override
    public final j2 getWindow(int i10, j2 j2Var, long j9) {
        this.f13728a.getWindow(i10, j2Var, j9);
        if (Objects.equals(j2Var.f1283a, this.f13757b)) {
            j2Var.f1283a = j2.f1273q;
        }
        return j2Var;
    }
}
