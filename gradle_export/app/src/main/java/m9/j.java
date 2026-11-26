package m9;

import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import androidx.media3.common.c1;
import androidx.media3.common.d1;
import androidx.media3.common.f1;

public final class j implements d1, View.OnClickListener, PopupWindow.OnDismissListener {
    public final u A;

    public j(u uVar) {
        this.A = uVar;
    }

    @Override
    public final void l(f1 f1Var, c1 c1Var) {
        androidx.media3.common.r rVar = c1Var.f1141a;
        boolean zA = rVar.a(4, 5, 13);
        u uVar = this.A;
        if (zA) {
            uVar.q();
        }
        if (rVar.a(4, 5, 7, 13)) {
            uVar.s();
        }
        if (rVar.a(8, 13)) {
            uVar.t();
        }
        if (rVar.a(9, 13)) {
            uVar.v();
        }
        if (rVar.a(8, 9, 11, 0, 16, 17, 13)) {
            uVar.p();
        }
        if (rVar.a(11, 0, 13)) {
            uVar.w();
        }
        if (rVar.a(12, 13)) {
            uVar.r();
        }
        if (rVar.a(2, 13)) {
            uVar.x();
        }
    }

    @Override
    public final void onClick(View view) {
        u uVar = this.A;
        ImageView imageView = uVar.f10748g0;
        View view2 = uVar.f10754l0;
        View view3 = uVar.f10753k0;
        View view4 = uVar.f10752j0;
        z zVar = uVar.A;
        f1 f1Var = uVar.Q0;
        if (f1Var == null) {
            return;
        }
        zVar.g();
        if (uVar.U == view) {
            if (f1Var.isCommandAvailable(9)) {
                f1Var.seekToNext();
                return;
            }
            return;
        }
        if (uVar.T == view) {
            if (f1Var.isCommandAvailable(7)) {
                f1Var.seekToPrevious();
                return;
            }
            return;
        }
        if (uVar.W == view) {
            if (f1Var.getPlaybackState() == 4 || !f1Var.isCommandAvailable(12)) {
                return;
            }
            f1Var.seekForward();
            return;
        }
        if (uVar.f10736a0 == view) {
            if (f1Var.isCommandAvailable(11)) {
                f1Var.seekBack();
                return;
            }
            return;
        }
        if (uVar.V == view) {
            if (e7.i0.S(f1Var, uVar.U0)) {
                e7.i0.A(f1Var);
                return;
            } else {
                if (f1Var.isCommandAvailable(1)) {
                    f1Var.pause();
                    return;
                }
                return;
            }
        }
        if (uVar.f10742d0 == view) {
            if (f1Var.isCommandAvailable(15)) {
                int repeatMode = f1Var.getRepeatMode();
                int i10 = uVar.f10737a1;
                for (int i11 = 1; i11 <= 2; i11++) {
                    int i12 = (repeatMode + i11) % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2 || (i10 & 2) == 0) {
                            }
                        } else if ((i10 & 1) == 0) {
                        }
                    }
                    repeatMode = i12;
                }
                f1Var.setRepeatMode(repeatMode);
                return;
            }
            return;
        }
        if (uVar.f10744e0 == view) {
            if (f1Var.isCommandAvailable(14)) {
                f1Var.setShuffleModeEnabled(!f1Var.getShuffleModeEnabled());
                return;
            }
            return;
        }
        if (view4 == view) {
            zVar.f();
            uVar.e(uVar.M, view4);
            return;
        }
        if (view3 == view) {
            zVar.f();
            uVar.e(uVar.N, view3);
        } else if (view2 == view) {
            zVar.f();
            uVar.e(uVar.P, view2);
        } else if (imageView == view) {
            zVar.f();
            uVar.e(uVar.O, imageView);
        }
    }

    @Override
    public final void onDismiss() {
        u uVar = this.A;
        if (uVar.f10749g1) {
            uVar.A.g();
        }
    }
}
