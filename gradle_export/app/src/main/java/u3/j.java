package u3;

import l1.p2;

public final class j implements p2 {
    public final boolean A;

    public j(boolean z10) {
        this.A = z10;
    }

    @Override
    public final Object getValue() {
        return Boolean.valueOf(this.A);
    }
}
