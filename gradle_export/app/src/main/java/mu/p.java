package mu;

import android.content.Context;
import c3.w2;
import g00.b0;

public final class p implements u00.a {
    public final int A;
    public final w2 B;
    public final Context C;

    public p(w2 w2Var, Context context, int i) {
        this.A = i;
        this.B = w2Var;
        this.C = context;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                this.B.a("https://play.google.com/store/apps/details?id=" + this.C.getPackageName());
                break;
            default:
                this.B.a("https://play.google.com/store/apps/details?id=" + this.C.getPackageName());
                break;
        }
        return b0.a;
    }
}
