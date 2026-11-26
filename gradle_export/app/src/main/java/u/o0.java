package u;

import java.util.List;

public abstract class o0 {

    public static final Object[] f14881a = new Object[0];

    public static final d0 f14882b = new d0(0);

    public static final void a(int i10, List list) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            v.a.d("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
            throw null;
        }
    }

    public static final void b(int i10, int i11, List list) {
        int size = list.size();
        if (i10 > i11) {
            v.a.c("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
            throw null;
        }
        if (i10 < 0) {
            v.a.d("fromIndex (" + i10 + ") is less than 0.");
            throw null;
        }
        if (i11 <= size) {
            return;
        }
        v.a.d("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        throw null;
    }
}
