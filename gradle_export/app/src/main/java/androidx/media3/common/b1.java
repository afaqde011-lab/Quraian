package androidx.media3.common;

import android.os.Bundle;
import android.util.SparseBooleanArray;
import java.util.ArrayList;

public final class b1 {

    public static final b1 f1101b;

    public static final String f1102c;

    public final r f1103a;

    static {
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        ta.c0.A(!false);
        f1101b = new b1(new r(sparseBooleanArray));
        String str = e7.i0.f5136a;
        f1102c = Integer.toString(0, 36);
    }

    public b1(r rVar) {
        this.f1103a = rVar;
    }

    public static b1 b(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f1102c);
        if (integerArrayList == null) {
            return f1101b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            int iIntValue = integerArrayList.get(i10).intValue();
            ta.c0.A(!false);
            sparseBooleanArray.append(iIntValue, true);
        }
        ta.c0.A(!false);
        return new b1(new r(sparseBooleanArray));
    }

    public final boolean a(int i10) {
        return this.f1103a.f1465a.get(i10);
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i10 = 0;
        while (true) {
            r rVar = this.f1103a;
            if (i10 >= rVar.f1465a.size()) {
                bundle.putIntegerArrayList(f1102c, arrayList);
                return bundle;
            }
            arrayList.add(Integer.valueOf(rVar.b(i10)));
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b1) {
            return this.f1103a.equals(((b1) obj).f1103a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1103a.f1465a.hashCode();
    }
}
