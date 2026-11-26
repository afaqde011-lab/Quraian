package u8;

import a8.h0;

public final class i implements h0 {
    public static final i B = new i(true);
    public static final i C = new i(false);
    public final boolean A;

    public i(boolean z10) {
        this.A = z10;
    }

    public final String toString() {
        return g4.c.l(new StringBuilder("IncorrectFragmentation{expected="), !this.A, "}");
    }
}
