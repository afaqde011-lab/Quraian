package du;

import c3.w2;

public final class h0 implements u00.a {
    public final int A;
    public final w2 B;

    public h0(w2 w2Var, int i) {
        this.A = i;
        this.B = w2Var;
    }

    @Override
    public final Object invoke() {
        int i = this.A;
        w2 w2Var = this.B;
        switch (i) {
            case 0:
                w2Var.a("https://play.google.com/intl/en-US_us/about/play-terms/index.html");
                break;
            case 1:
                w2Var.a("https://www.freeprivacypolicy.com/live/f4411ff9-69da-46b1-a5f8-bd695c67ceb1");
                break;
            default:
                w2Var.a("https://www.instagram.com/quranify_app");
                break;
        }
        return g00.b0.a;
    }
}
