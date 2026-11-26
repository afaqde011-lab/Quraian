package p5;

import a5.g;
import android.graphics.Rect;
import gj.e;
import java.util.Comparator;

public final class b implements Comparator {
    public final Rect A = new Rect();
    public final Rect B = new Rect();
    public final boolean C;
    public final e D;

    public b(boolean z10, e eVar) {
        this.C = z10;
        this.D = eVar;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        this.D.getClass();
        Rect rect = this.A;
        ((g) obj).e(rect);
        Rect rect2 = this.B;
        ((g) obj2).e(rect2);
        int i10 = rect.top;
        int i11 = rect2.top;
        if (i10 < i11) {
            return -1;
        }
        if (i10 > i11) {
            return 1;
        }
        int i12 = rect.left;
        int i13 = rect2.left;
        boolean z10 = this.C;
        if (i12 < i13) {
            return z10 ? 1 : -1;
        }
        if (i12 > i13) {
            return z10 ? -1 : 1;
        }
        int i14 = rect.bottom;
        int i15 = rect2.bottom;
        if (i14 < i15) {
            return -1;
        }
        if (i14 > i15) {
            return 1;
        }
        int i16 = rect.right;
        int i17 = rect2.right;
        if (i16 < i17) {
            return z10 ? 1 : -1;
        }
        if (i16 > i17) {
            return z10 ? -1 : 1;
        }
        return 0;
    }
}
