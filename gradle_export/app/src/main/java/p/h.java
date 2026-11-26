package p;

import android.view.View;

public final class h implements Runnable {
    public final f A;
    public final j B;

    public h(j jVar, f fVar) {
        this.B = jVar;
        this.A = fVar;
    }

    @Override
    public final void run() {
        o.j jVar;
        j jVar2 = this.B;
        o.l lVar = jVar2.C;
        if (lVar != null && (jVar = lVar.f11406e) != null) {
            jVar.w(lVar);
        }
        View view = (View) jVar2.H;
        if (view != null && view.getWindowToken() != null) {
            f fVar = this.A;
            if (fVar.b()) {
                jVar2.S = fVar;
            } else if (fVar.f11460e != null) {
                fVar.d(0, 0, false, false);
                jVar2.S = fVar;
            }
        }
        jVar2.U = null;
    }
}
