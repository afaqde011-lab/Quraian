package v7;

import android.media.Spatializer;
import fh.b2;

public final class k implements Spatializer.OnSpatializerStateChangedListener {

    public final p f15510a;

    public k(p pVar) {
        this.f15510a = pVar;
    }

    @Override
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z10) {
        b2 b2Var = p.f15511k;
        this.f15510a.w();
    }

    @Override
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z10) {
        b2 b2Var = p.f15511k;
        this.f15510a.w();
    }
}
