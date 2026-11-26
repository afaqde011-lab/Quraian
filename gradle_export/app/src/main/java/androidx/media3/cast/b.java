package androidx.media3.cast;

import android.view.MenuItem;

public final class b implements xf.e, xf.d {
    public final int A;
    public final d4.h B;

    public b(d4.h hVar, int i10) {
        this.A = i10;
        this.B = hVar;
    }

    @Override
    public void onFailure(Exception exc) {
        int i10 = this.A;
        d4.h hVar = this.B;
        switch (i10) {
            case 1:
                hVar.c(exc);
                break;
            default:
                hVar.c(exc);
                break;
        }
    }

    @Override
    public void onSuccess(Object obj) {
        int i10 = this.A;
        d4.h hVar = this.B;
        switch (i10) {
            case 0:
                hVar.a((MenuItem) obj);
                break;
            default:
                hVar.a(null);
                break;
        }
    }
}
