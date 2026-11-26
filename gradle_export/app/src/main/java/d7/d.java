package d7;

import android.os.Bundle;
import android.text.Spanned;
import e7.i0;

public abstract class d {

    public static final String f4769a;

    public static final String f4770b;

    public static final String f4771c;

    public static final String f4772d;

    public static final String f4773e;

    static {
        String str = i0.f5136a;
        f4769a = Integer.toString(0, 36);
        f4770b = Integer.toString(1, 36);
        f4771c = Integer.toString(2, 36);
        f4772d = Integer.toString(3, 36);
        f4773e = Integer.toString(4, 36);
    }

    public static Bundle a(Spanned spanned, Object obj, int i10, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putInt(f4769a, spanned.getSpanStart(obj));
        bundle2.putInt(f4770b, spanned.getSpanEnd(obj));
        bundle2.putInt(f4771c, spanned.getSpanFlags(obj));
        bundle2.putInt(f4772d, i10);
        if (bundle != null) {
            bundle2.putBundle(f4773e, bundle);
        }
        return bundle2;
    }
}
