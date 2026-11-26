package androidx.mediarouter.app;

import android.view.KeyEvent;
import android.widget.SeekBar;
import java.util.Collections;

public final class i0 extends o9.v {

    public final int f1738a;

    public final KeyEvent.Callback f1739b;

    public i0(KeyEvent.Callback callback, int i10) {
        this.f1738a = i10;
        this.f1739b = callback;
    }

    @Override
    public void onProviderAdded(o9.c0 c0Var, o9.a0 a0Var) {
        switch (this.f1738a) {
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            default:
                super.onProviderAdded(c0Var, a0Var);
                break;
        }
    }

    @Override
    public void onProviderChanged(o9.c0 c0Var, o9.a0 a0Var) {
        switch (this.f1738a) {
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            default:
                super.onProviderChanged(c0Var, a0Var);
                break;
        }
    }

    @Override
    public void onProviderRemoved(o9.c0 c0Var, o9.a0 a0Var) {
        switch (this.f1738a) {
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            default:
                super.onProviderRemoved(c0Var, a0Var);
                break;
        }
    }

    @Override
    public void onRouteAdded(o9.c0 c0Var, o9.b0 b0Var) {
        switch (this.f1738a) {
            case 0:
                ((q0) this.f1739b).l();
                break;
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            case 2:
                ((h) this.f1739b).f();
                break;
            case 3:
            default:
                super.onRouteAdded(c0Var, b0Var);
                break;
            case 4:
                ((d0) this.f1739b).e();
                break;
        }
    }

    @Override
    public final void onRouteChanged(o9.c0 c0Var, o9.b0 b0Var) {
        o9.x xVarA;
        switch (this.f1738a) {
            case 0:
                q0 q0Var = (q0) this.f1739b;
                if (b0Var == q0Var.J) {
                    b0Var.getClass();
                    if (o9.b0.b() != null) {
                        o9.a0 a0Var = b0Var.f11737a;
                        a0Var.getClass();
                        o9.c0.b();
                        for (o9.b0 b0Var2 : Collections.unmodifiableList(a0Var.f11730b)) {
                            if (!Collections.unmodifiableList(q0Var.J.f11756v).contains(b0Var2) && (xVarA = q0Var.J.a()) != null && xVarA.o(b0Var2) && !q0Var.L.contains(b0Var2)) {
                                q0Var.m();
                                q0Var.k();
                                break;
                            }
                        }
                    }
                }
                q0Var.l();
                break;
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            case 2:
                ((h) this.f1739b).f();
                break;
            case 3:
                ((v) this.f1739b).o(true);
                break;
            default:
                ((d0) this.f1739b).e();
                break;
        }
    }

    @Override
    public void onRouteRemoved(o9.c0 c0Var, o9.b0 b0Var) {
        switch (this.f1738a) {
            case 0:
                ((q0) this.f1739b).l();
                break;
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            case 2:
                ((h) this.f1739b).f();
                break;
            case 3:
            default:
                super.onRouteRemoved(c0Var, b0Var);
                break;
            case 4:
                ((d0) this.f1739b).e();
                break;
        }
    }

    @Override
    public void onRouteSelected(o9.c0 c0Var, o9.b0 b0Var) {
        switch (this.f1738a) {
            case 0:
                q0 q0Var = (q0) this.f1739b;
                q0Var.J = b0Var;
                q0Var.m();
                q0Var.k();
                break;
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            case 2:
                ((h) this.f1739b).dismiss();
                break;
            case 3:
            default:
                super.onRouteSelected(c0Var, b0Var);
                break;
            case 4:
                ((d0) this.f1739b).dismiss();
                break;
        }
    }

    @Override
    public void onRouteUnselected(o9.c0 c0Var, o9.b0 b0Var) {
        switch (this.f1738a) {
            case 0:
                ((q0) this.f1739b).l();
                break;
            case 1:
                ((MediaRouteButton) this.f1739b).b();
                break;
            case 2:
            default:
                super.onRouteUnselected(c0Var, b0Var);
                break;
            case 3:
                ((v) this.f1739b).o(false);
                break;
        }
    }

    @Override
    public void onRouteVolumeChanged(o9.c0 c0Var, o9.b0 b0Var) {
        h0 h0Var;
        int i10 = this.f1738a;
        KeyEvent.Callback callback = this.f1739b;
        switch (i10) {
            case 0:
                int i11 = b0Var.f11750p;
                int i12 = q0.f1766u0;
                q0 q0Var = (q0) callback;
                if (q0Var.X != b0Var && (h0Var = (h0) q0Var.W.get(b0Var.f11739c)) != null) {
                    int i13 = h0Var.f1734u.f11750p;
                    h0Var.r(i13 == 0);
                    h0Var.f1736w.setProgress(i13);
                    break;
                }
                break;
            case 3:
                v vVar = (v) callback;
                SeekBar seekBar = (SeekBar) vVar.f1828s0.get(b0Var);
                int i14 = b0Var.f11750p;
                int i15 = v.Q0;
                if (seekBar != null && vVar.f1823n0 != b0Var) {
                    seekBar.setProgress(i14);
                    break;
                }
                break;
            default:
                super.onRouteVolumeChanged(c0Var, b0Var);
                break;
        }
    }

    @Override
    public void onRouterParamsChanged(o9.c0 c0Var, o9.e0 e0Var) {
        switch (this.f1738a) {
            case 1:
                boolean z10 = e0Var != null ? e0Var.f11777e.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
                MediaRouteButton mediaRouteButton = (MediaRouteButton) this.f1739b;
                if (mediaRouteButton.F != z10) {
                    mediaRouteButton.F = z10;
                    mediaRouteButton.refreshDrawableState();
                }
                break;
            default:
                super.onRouterParamsChanged(c0Var, e0Var);
                break;
        }
    }
}
