package z4;

import android.text.TextUtils;
import android.view.View;

public final class a0 extends i00.e {
    public final int E;

    public a0(int i10, Class cls, int i11, int i12, int i13) {
        this.E = i13;
        ((i00.e) this).A = i10;
        ((i00.e) this).D = cls;
        ((i00.e) this).C = i11;
        ((i00.e) this).B = i12;
    }

    public final Object e(View view) {
        switch (this.E) {
            case 0:
                return g0.a(view);
            default:
                return Boolean.valueOf(g0.b(view));
        }
    }

    public final void g(View view, Object obj) {
        switch (this.E) {
            case 0:
                g0.e(view, (CharSequence) obj);
                break;
            default:
                g0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    public final boolean j(Object obj, Object obj2) {
        switch (this.E) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}
