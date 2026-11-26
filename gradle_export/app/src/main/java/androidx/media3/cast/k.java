package androidx.media3.cast;

import androidx.media3.common.d1;
import androidx.media3.common.k2;
import androidx.media3.common.q0;
import androidx.media3.common.z0;

public final class k implements xf.e, xf.d, e7.m {
    public final int A;
    public final Object B;

    public k(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        Object obj2 = this.B;
        switch (i10) {
            case 2:
                ((d1) obj).M((androidx.media3.common.l) obj2);
                break;
            case 3:
                ((d1) obj).x((z0) obj2);
                break;
            case 4:
                ((d1) obj).u(2, (q0) obj2);
                break;
            default:
                ((d1) obj).v((k2) obj2, 1);
                break;
        }
    }

    @Override
    public void onFailure(Exception exc) {
        MediaRouteButtonKt$MediaRouteButtonContainer$1$1.invokeSuspend$lambda$2((l1.z0) this.B, exc);
    }

    @Override
    public void onSuccess(Object obj) {
        ((j) this.B).invoke(obj);
    }
}
