package c3;

public final class s3 implements l1.m, androidx.lifecycle.u {
    public final z A;
    public final l1.p B;
    public boolean C;
    public androidx.lifecycle.q D;
    public u00.n E = j1.f2686a;

    public s3(z zVar, l1.p pVar) {
        this.A = zVar;
        this.B = pVar;
    }

    @Override
    public final void a(androidx.lifecycle.w wVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            dispose();
        } else {
            if (oVar != androidx.lifecycle.o.ON_CREATE || this.C) {
                return;
            }
            b(this.E);
        }
    }

    public final void b(u00.n nVar) {
        this.A.setOnReadyForComposition(new b2.v(this, nVar, 6));
    }

    @Override
    public final void dispose() {
        if (!this.C) {
            this.C = true;
            this.A.getView().setTag(2131363145, null);
            androidx.lifecycle.q qVar = this.D;
            if (qVar != null) {
                qVar.d(this);
            }
            this.D = null;
        }
        this.B.dispose();
    }
}
