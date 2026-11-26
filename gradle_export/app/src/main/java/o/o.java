package o;

import android.view.ActionProvider;

public final class o extends z4.c implements ActionProvider.VisibilityListener {

    public hf.c f11448a;

    public final ActionProvider f11449b;

    public o(s sVar, ActionProvider actionProvider) {
        this.f11449b = actionProvider;
    }

    @Override
    public final void onActionProviderVisibilityChanged(boolean z10) {
        hf.c cVar = this.f11448a;
        if (cVar != null) {
            l lVar = ((n) cVar.B).f11435n;
            lVar.f11409h = true;
            lVar.p(true);
        }
    }
}
