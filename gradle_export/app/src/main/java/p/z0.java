package p;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class z0 {

    public int f12231a = 0;

    public float f12232b = -1.0f;

    public float f12233c = -1.0f;

    public float f12234d = -1.0f;

    public int[] f12235e = new int[0];

    public boolean f12236f = false;

    public final TextView f12237g;

    public final Context f12238h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public z0(TextView textView) {
        this.f12237g = textView;
        this.f12238h = textView.getContext();
        new x0();
    }

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final boolean b() {
        return !(this.f12237g instanceof t);
    }
}
