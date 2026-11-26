package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

public final class b implements Runnable {
    public final int A;
    public final ActionBarOverlayLayout B;

    public b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.A = i10;
        this.B = actionBarOverlayLayout;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.B;
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.W = actionBarOverlayLayout.D.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f528a0);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.B;
                actionBarOverlayLayout2.b();
                actionBarOverlayLayout2.W = actionBarOverlayLayout2.D.animate().translationY(-actionBarOverlayLayout2.D.getHeight()).setListener(actionBarOverlayLayout2.f528a0);
                break;
        }
    }
}
