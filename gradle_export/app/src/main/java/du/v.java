package du;

import com.mchutov.quranify.main.presentation.screen.main.MainActivity;

public final class v implements u00.n {
    public final int A;
    public final MainActivity B;

    public v(MainActivity mainActivity, int i) {
        this.A = i;
        this.B = mainActivity;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        MainActivity mainActivity = this.B;
        int i2 = 2;
        int i3 = 1;
        l1.g0 g0Var = (l1.j) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i4 = MainActivity.R;
                l1.g0 g0Var2 = g0Var;
                if (!g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var2.V();
                } else {
                    dl.e.a(false, v1.d.d(-254619092, new v(mainActivity, i3), g0Var), g0Var, 48);
                }
                break;
            case 1:
                int i5 = MainActivity.R;
                l1.g0 g0Var3 = g0Var;
                if (!g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var3.V();
                } else {
                    al.m.a(v1.d.d(1440791827, new v(mainActivity, i2), g0Var), g0Var, 6);
                }
                break;
            default:
                int i6 = MainActivity.R;
                l1.g0 g0Var4 = g0Var;
                if (!g0Var4.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    g0Var4.V();
                } else {
                    p30.f.M((t0) mainActivity.Q.getValue(), g0Var, 0);
                }
                break;
        }
        return b0Var;
    }
}
