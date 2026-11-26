package androidx.media3.cast;

import android.os.Bundle;
import androidx.media3.common.d1;
import androidx.media3.common.e1;
import k9.c1;
import k9.t0;
import k9.v3;
import k9.z3;

public final class n implements e7.m, eh.k, c1, e7.h {
    public final int A;
    public final int B;

    public n(int i10, int i11) {
        this.A = i11;
        this.B = i10;
    }

    public n(int i10, z3 z3Var, Bundle bundle, Bundle bundle2) {
        this.A = 7;
        this.B = i10;
    }

    public n(j7.a aVar, int i10, e1 e1Var, e1 e1Var2) {
        this.A = 5;
        this.B = i10;
    }

    @Override
    public void accept(Object obj) {
        int i10 = this.A;
        int i11 = this.B;
        v3 v3Var = (v3) obj;
        switch (i10) {
            case 8:
                v3Var.decreaseDeviceVolume(i11);
                break;
            case 9:
                v3Var.increaseDeviceVolume(i11);
                break;
            case 10:
                v3Var.setRepeatMode(i11);
                break;
            default:
                v3Var.setDeviceVolume(i11);
                break;
        }
    }

    @Override
    public Object apply(Object obj) {
        return Integer.valueOf(this.B);
    }

    @Override
    public void g(t0 t0Var) {
        if (t0Var.isConnected() && t0Var.l.get(this.B) != null) {
            throw new ClassCastException();
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((d1) obj).r(this.B);
                break;
            case 1:
                ((d1) obj).e(this.B);
                break;
            case 2:
                ((d1) obj).e(this.B);
                break;
            case 3:
                ((d1) obj).p(this.B);
                break;
            case 4:
            default:
                ((d1) obj).e(this.B);
                break;
            case 5:
                j7.i iVar = (j7.i) obj;
                iVar.getClass();
                int i10 = this.B;
                if (i10 == 1) {
                    iVar.f8243v = true;
                }
                iVar.l = i10;
                break;
        }
    }
}
