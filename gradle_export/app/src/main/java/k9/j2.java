package k9;

import com.google.android.gms.internal.measurement.b5;

public final class j2 implements s2 {
    public final int A;
    public final t2 B;

    public j2(t2 t2Var, int i10) {
        this.A = i10;
        this.B = t2Var;
    }

    public j2(t2 t2Var, androidx.media3.common.g1 g1Var) {
        this.A = 1;
        this.B = t2Var;
    }

    @Override
    public final void a(a2 a2Var) {
        int i10 = this.A;
        t2 t2Var = this.B;
        switch (i10) {
            case 0:
                t2Var.f9463f.f9430t.seekForward();
                break;
            case 1:
                s1 s1Var = t2Var.f9463f;
                if (s1Var.f9430t.c() != null) {
                    nv.p pVar = s1Var.f9417e;
                    s1Var.F(a2Var);
                    pVar.getClass();
                    b5.x(new d4(-6));
                    break;
                }
                break;
            case 2:
                t2Var.f9463f.f9430t.seekToPrevious();
                break;
            case 3:
                t2Var.f9463f.f9430t.seekToPreviousMediaItem();
                break;
            case 4:
                t2Var.f9463f.f9430t.seekBack();
                break;
            case 5:
                t2Var.f9463f.l(a2Var, true);
                break;
            case 6:
                t2Var.f9463f.f9430t.prepare();
                break;
            case 7:
                t2Var.f9463f.f9430t.stop();
                break;
            case 8:
                s1 s1Var2 = t2Var.f9463f;
                v3 v3Var = s1Var2.f9430t;
                if (!e7.i0.S(v3Var, s1Var2.f9426p)) {
                    if (v3Var != null && v3Var.isCommandAvailable(1)) {
                        v3Var.pause();
                        break;
                    }
                } else {
                    e7.i0.A(v3Var);
                    break;
                }
                break;
            case 9:
                t2Var.f9463f.f9430t.seekToNext();
                break;
            case 10:
                t2Var.f9463f.f9430t.seekToNextMediaItem();
                break;
            default:
                v3 v3Var2 = t2Var.f9463f.f9430t;
                String str = e7.i0.f5136a;
                if (v3Var2 != null && v3Var2.isCommandAvailable(1)) {
                    v3Var2.pause();
                    break;
                }
                break;
        }
    }
}
