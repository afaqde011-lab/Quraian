package c3;

import java.text.BreakIterator;

public final class c extends b {

    public static c f2632e;

    public static c f2633f;

    public final int f2634c;

    public BreakIterator f2635d;

    @Override
    public final int[] g(int i10) {
        switch (this.f2634c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i10 >= length) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                do {
                    BreakIterator breakIterator = this.f2635d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f2635d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.k("impl");
                            throw null;
                        }
                        int iFollowing = breakIterator2.following(i10);
                        if (iFollowing == -1) {
                            return null;
                        }
                        return j(i10, iFollowing);
                    }
                    BreakIterator breakIterator3 = this.f2635d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.following(i10);
                } while (i10 != -1);
                return null;
            default:
                if (k().length() <= 0 || i10 >= k().length()) {
                    return null;
                }
                if (i10 < 0) {
                    i10 = 0;
                }
                while (!u(i10) && (!u(i10) || (i10 != 0 && u(i10 - 1)))) {
                    BreakIterator breakIterator4 = this.f2635d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.following(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f2635d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
                int iFollowing2 = breakIterator5.following(i10);
                if (iFollowing2 == -1 || !t(iFollowing2)) {
                    return null;
                }
                return j(i10, iFollowing2);
        }
    }

    @Override
    public final int[] o(int i10) {
        switch (this.f2634c) {
            case 0:
                int length = k().length();
                if (length <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length) {
                    i10 = length;
                }
                do {
                    BreakIterator breakIterator = this.f2635d;
                    if (breakIterator == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    if (breakIterator.isBoundary(i10)) {
                        BreakIterator breakIterator2 = this.f2635d;
                        if (breakIterator2 == null) {
                            kotlin.jvm.internal.m.k("impl");
                            throw null;
                        }
                        int iPreceding = breakIterator2.preceding(i10);
                        if (iPreceding == -1) {
                            return null;
                        }
                        return j(iPreceding, i10);
                    }
                    BreakIterator breakIterator3 = this.f2635d;
                    if (breakIterator3 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i10 = breakIterator3.preceding(i10);
                } while (i10 != -1);
                return null;
            default:
                int length2 = k().length();
                if (length2 <= 0 || i10 <= 0) {
                    return null;
                }
                if (i10 > length2) {
                    i10 = length2;
                }
                while (i10 > 0 && !u(i10 - 1) && !t(i10)) {
                    BreakIterator breakIterator4 = this.f2635d;
                    if (breakIterator4 == null) {
                        kotlin.jvm.internal.m.k("impl");
                        throw null;
                    }
                    i10 = breakIterator4.preceding(i10);
                    if (i10 == -1) {
                        return null;
                    }
                }
                BreakIterator breakIterator5 = this.f2635d;
                if (breakIterator5 == null) {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
                int iPreceding2 = breakIterator5.preceding(i10);
                if (iPreceding2 == -1 || !u(iPreceding2)) {
                    return null;
                }
                if (iPreceding2 == 0 || !u(iPreceding2 - 1)) {
                    return j(iPreceding2, i10);
                }
                return null;
        }
    }

    public final void s(String str) {
        switch (this.f2634c) {
            case 0:
                this.f2624a = str;
                BreakIterator breakIterator = this.f2635d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
            default:
                this.f2624a = str;
                BreakIterator breakIterator2 = this.f2635d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    kotlin.jvm.internal.m.k("impl");
                    throw null;
                }
        }
    }

    public boolean t(int i10) {
        if (i10 <= 0 || !u(i10 - 1)) {
            return false;
        }
        return i10 == k().length() || !u(i10);
    }

    public boolean u(int i10) {
        if (i10 < 0 || i10 >= k().length()) {
            return false;
        }
        return Character.isLetterOrDigit(k().codePointAt(i10));
    }
}
