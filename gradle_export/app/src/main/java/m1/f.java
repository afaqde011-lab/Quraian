package m1;

import java.util.List;

public abstract class f {
    public static final void a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            c(i10, size);
        }
    }

    public static final void b(int i10, int i11, List list) {
        if (i10 > i11) {
            f(i10, i11);
        }
        if (i10 < 0) {
            d(i10);
        }
        if (i11 > list.size()) {
            e(i11, list.size());
        }
    }

    private static final void c(int i10, int i11) {
        throw new IndexOutOfBoundsException(g4.c.e(i10, i11, "Index ", " is out of bounds. The list has ", " elements."));
    }

    private static final void d(int i10) {
        throw new IndexOutOfBoundsException(g4.c.i("fromIndex (", i10, ") is less than 0."));
    }

    private static final void e(int i10, int i11) {
        throw new IndexOutOfBoundsException("toIndex (" + i10 + ") is more than than the list size (" + i11 + ')');
    }

    private static final void f(int i10, int i11) {
        throw new IllegalArgumentException(g4.c.e(i10, i11, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
