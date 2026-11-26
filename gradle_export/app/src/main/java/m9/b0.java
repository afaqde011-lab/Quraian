package m9;

import android.os.Build;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.media3.common.d1;
import androidx.media3.common.e1;
import androidx.media3.common.f1;
import androidx.media3.common.h2;
import androidx.media3.common.k2;
import androidx.media3.common.s2;
import androidx.media3.common.w2;
import androidx.media3.ui.PlayerView;
import androidx.media3.ui.SubtitleView;

public final class b0 implements d1, View.OnClickListener, t, k {
    public final h2 A = new h2();
    public Object B;
    public final PlayerView C;

    public b0(PlayerView playerView) {
        this.C = playerView;
    }

    @Override
    public final void I() {
        PlayerView playerView = this.C;
        View view = playerView.C;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.b()) {
                playerView.c();
                return;
            }
            ImageView imageView = playerView.G;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override
    public final void K(s2 s2Var) {
        PlayerView playerView = this.C;
        f1 f1Var = playerView.S;
        f1Var.getClass();
        k2 currentTimeline = f1Var.isCommandAvailable(17) ? f1Var.getCurrentTimeline() : k2.EMPTY;
        if (currentTimeline.isEmpty()) {
            this.B = null;
        } else {
            boolean zIsCommandAvailable = f1Var.isCommandAvailable(30);
            h2 h2Var = this.A;
            if (!zIsCommandAvailable || f1Var.getCurrentTracks().f1556a.isEmpty()) {
                Object obj = this.B;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod != -1) {
                        if (f1Var.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, h2Var).f1233c) {
                            return;
                        }
                    }
                    this.B = null;
                }
            } else {
                this.B = currentTimeline.getPeriod(f1Var.getCurrentPeriodIndex(), h2Var, true).f1232b;
            }
        }
        playerView.n(false);
    }

    @Override
    public final void S(int i10, int i11) {
        PlayerView playerView = this.C;
        View view = playerView.D;
        if (Build.VERSION.SDK_INT == 34 && (view instanceof SurfaceView) && playerView.f1710i0) {
            hf.c cVar = playerView.F;
            cVar.getClass();
            playerView.O.post(new ab.e(cVar, (SurfaceView) view, new f(playerView, 2), 20));
        }
    }

    @Override
    public final void U(e1 e1Var, e1 e1Var2, int i10) {
        u uVar;
        int i11 = PlayerView.f1701j0;
        PlayerView playerView = this.C;
        if (playerView.d() && playerView.f1708g0 && (uVar = playerView.L) != null) {
            uVar.g();
        }
    }

    @Override
    public final void a(w2 w2Var) {
        PlayerView playerView;
        f1 f1Var;
        if (w2Var.equals(w2.f1669d) || (f1Var = (playerView = this.C).S) == null || f1Var.getPlaybackState() == 1) {
            return;
        }
        playerView.j();
    }

    @Override
    public final void m(int i10, boolean z10) {
        int i11 = PlayerView.f1701j0;
        PlayerView playerView = this.C;
        playerView.k();
        if (!playerView.d() || !playerView.f1708g0) {
            playerView.e(false);
            return;
        }
        u uVar = playerView.L;
        if (uVar != null) {
            uVar.g();
        }
    }

    @Override
    public final void onClick(View view) {
        int i10 = PlayerView.f1701j0;
        this.C.i();
    }

    @Override
    public final void r(int i10) {
        int i11 = PlayerView.f1701j0;
        PlayerView playerView = this.C;
        playerView.k();
        playerView.m();
        if (!playerView.d() || !playerView.f1708g0) {
            playerView.e(false);
            return;
        }
        u uVar = playerView.L;
        if (uVar != null) {
            uVar.g();
        }
    }

    @Override
    public final void t(d7.c cVar) {
        SubtitleView subtitleView = this.C.I;
        if (subtitleView != null) {
            subtitleView.setCues(cVar.f4767a);
        }
    }
}
