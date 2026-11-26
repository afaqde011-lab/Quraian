package androidx.mediarouter.app;

import a1.u0;
import android.app.PendingIntent;
import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;

public final class q implements View.OnClickListener {
    public final int A;
    public final v B;

    public q(v vVar, int i10) {
        this.A = i10;
        this.B = vVar;
    }

    @Override
    public final void onClick(View view) {
        int i10;
        PlaybackStateCompat playbackStateCompat;
        PendingIntent sessionActivity;
        switch (this.A) {
            case 0:
                v vVar = this.B;
                Context context = vVar.K;
                AccessibilityManager accessibilityManager = vVar.O0;
                int id2 = view.getId();
                if (id2 == 16908313 || id2 == 16908314) {
                    if (vVar.J.g()) {
                        o9.c0 c0Var = vVar.H;
                        i10 = id2 == 16908313 ? 2 : 1;
                        c0Var.getClass();
                        o9.c0.j(i10);
                    }
                    vVar.dismiss();
                    break;
                } else if (id2 != 2131362848) {
                    if (id2 == 2131362846) {
                        vVar.dismiss();
                    }
                    break;
                } else {
                    u0 u0Var = vVar.f1829t0;
                    if (u0Var != null && (playbackStateCompat = vVar.f1831v0) != null) {
                        int i11 = 0;
                        i10 = playbackStateCompat.A != 3 ? 0 : 1;
                        if (i10 != 0 && (playbackStateCompat.E & 514) != 0) {
                            ((android.support.v4.media.session.h) u0Var.B).f496a.getTransportControls().pause();
                            i11 = 2131886826;
                        } else if (i10 != 0 && (playbackStateCompat.E & 1) != 0) {
                            ((android.support.v4.media.session.h) u0Var.B).f496a.getTransportControls().stop();
                            i11 = 2131886828;
                        } else if (i10 == 0 && (playbackStateCompat.E & 516) != 0) {
                            ((android.support.v4.media.session.h) u0Var.B).f496a.getTransportControls().play();
                            i11 = 2131886827;
                        }
                        if (accessibilityManager != null && accessibilityManager.isEnabled() && i11 != 0) {
                            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
                            accessibilityEventObtain.setPackageName(context.getPackageName());
                            accessibilityEventObtain.setClassName(q.class.getName());
                            accessibilityEventObtain.getText().add(context.getString(i11));
                            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain);
                            break;
                        }
                    }
                }
                break;
            case 1:
                v vVar2 = this.B;
                boolean z10 = vVar2.F0;
                vVar2.F0 = !z10;
                if (!z10) {
                    vVar2.f1815f0.setVisibility(0);
                }
                vVar2.L0 = vVar2.F0 ? vVar2.M0 : vVar2.N0;
                vVar2.r(true);
                break;
            case 2:
                this.B.dismiss();
                break;
            default:
                v vVar3 = this.B;
                u0 u0Var2 = vVar3.f1829t0;
                if (u0Var2 != null && (sessionActivity = ((android.support.v4.media.session.h) u0Var2.B).f496a.getSessionActivity()) != null) {
                    try {
                        sessionActivity.send();
                        vVar3.dismiss();
                    } catch (PendingIntent.CanceledException unused) {
                        Log.e("MediaRouteCtrlDialog", sessionActivity + " was not sent, it had been canceled.");
                    }
                    break;
                }
                break;
        }
    }
}
