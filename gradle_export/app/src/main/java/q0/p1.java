package q0;

import android.R;

public final class p1 {
    Cut(t0.e.f14317a, R.string.cut, R.attr.actionModeCutDrawable),
    Copy(t0.e.f14318b, R.string.copy, R.attr.actionModeCopyDrawable),
    Paste(t0.e.f14319c, R.string.paste, R.attr.actionModePasteDrawable),
    SelectAll(t0.e.f14320d, R.string.selectAll, R.attr.actionModeSelectAllDrawable),
    Autofill(t0.e.f14321e, R.string.autofill, 0);

    public final Object A;

    static {
        f50.c.v(p1VarArr);
    }

    public p1(Object obj, int i10, int i11) {
        super(str, i);
        this.A = obj;
    }

    public static p1 valueOf(String str) {
        return (p1) Enum.valueOf(p1.class, str);
    }

    public static p1[] values() {
        return (p1[]) B.clone();
    }
}
