package c3;

public final class f extends b {

    public static f f2654c;

    @Override
    public final int[] g(int i10) {
        int length = k().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && k().charAt(i10) == '\n' && (k().charAt(i10) == '\n' || (i10 != 0 && k().charAt(i10 - 1) != '\n'))) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !s(i11)) {
            i11++;
        }
        return j(i10, i11);
    }

    @Override
    public final int[] o(int i10) {
        int length = k().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && k().charAt(i10 - 1) == '\n' && !s(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && (k().charAt(i11) == '\n' || (i11 != 0 && k().charAt(i11 - 1) != '\n'))) {
            i11--;
        }
        return j(i11, i10);
    }

    public final boolean s(int i10) {
        if (i10 <= 0 || k().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == k().length() || k().charAt(i10) == '\n';
    }
}
