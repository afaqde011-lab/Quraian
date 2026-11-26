package rp;

import com.mchutov.p000quranify.auth.presentation.analytics.AuthAnalytics;
import g00.b0;

public final class g implements u00.a {
    public final int A;
    public final AuthAnalytics B;
    public final hp.b C;

    public g(AuthAnalytics authAnalytics, hp.b bVar, int i11) {
        this.A = i11;
        this.B = authAnalytics;
        this.C = bVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                hp.b bVar = this.C;
                this.B.authorizationDismissed(bVar.f9596c);
                bVar.a();
                break;
            case 1:
                hp.b bVar2 = this.C;
                this.B.authorizationDismissed(bVar2.f9596c);
                bVar2.a();
                break;
            case 2:
                hp.b bVar3 = this.C;
                this.B.authorizationDismissed(bVar3.f9596c);
                bVar3.a();
                break;
            case 3:
                this.B.authorizationDismissed(this.C.f9596c);
                break;
            default:
                this.B.authorizationDismissed(this.C.f9596c);
                break;
        }
        return b0.f7770a;
    }
}
