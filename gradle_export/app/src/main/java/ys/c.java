package ys;

import kotlin.NoWhenBranchMatchedException;

public final class c {
    DAY(2131886605),
    WEEK(2131886603),
    MONTH(2131886601),
    THREE_MONTHS(2131886602),
    YEAR(2131886604);

    public static final n00.b E;
    public final int A;

    static {
        E = f50.c.v(cVarArr);
    }

    public c(int i) {
        super(str, i);
        this.A = i;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) D.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "Day";
        }
        if (iOrdinal == 1) {
            return "Week";
        }
        if (iOrdinal == 2) {
            return "Month";
        }
        if (iOrdinal == 3) {
            return "3 Months";
        }
        if (iOrdinal == 4) {
            return "Year";
        }
        throw new NoWhenBranchMatchedException();
    }

    public final int b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return 7;
        }
        if (iOrdinal == 2) {
            return 30;
        }
        if (iOrdinal == 3) {
            return 90;
        }
        if (iOrdinal == 4) {
            return 366;
        }
        throw new NoWhenBranchMatchedException();
    }
}
