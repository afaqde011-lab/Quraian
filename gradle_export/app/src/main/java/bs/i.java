package bs;

import android.content.res.Configuration;

public final class i implements u00.a {
    public final int A;
    public final Configuration B;

    public i(Configuration configuration, int i) {
        this.A = i;
        this.B = configuration;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        Configuration configuration = this.B;
        switch (i) {
            case 0:
                return new y3.f(configuration.screenHeightDp / 2);
            case 1:
                return y3.f.a((float) configuration.screenWidthDp, (float) 600) > 0 ? gm.a.B : gm.a.A;
            default:
                return new y3.f(configuration.screenHeightDp / 2);
        }
    }
}
