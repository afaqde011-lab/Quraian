package m10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class z implements x8.d {
    public final List A;

    public z(ArrayList arrayList) {
        this.A = Collections.unmodifiableList(arrayList);
    }

    public int d(long j) {
        return j < 0 ? 0 : -1;
    }

    public long e(int i) {
        ta.c0.s(i == 0);
        return 0L;
    }

    public List g(long j) {
        return j >= 0 ? this.A : Collections.EMPTY_LIST;
    }

    public int i() {
        return 1;
    }
}
