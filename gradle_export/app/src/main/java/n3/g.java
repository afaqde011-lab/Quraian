package n3;

import android.text.Layout;
import kotlin.jvm.internal.m;

public abstract class g {

    public static final Layout.Alignment f11035a;

    public static final Layout.Alignment f11036b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (m.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (m.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f11035a = alignment;
        f11036b = alignment2;
    }
}
