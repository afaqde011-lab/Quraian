package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;

public final class u extends ArrayAdapter {
    public final float A;
    public final v B;

    public u(v vVar, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.B = vVar;
        this.A = f50.c.C(context);
    }

    @Override
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z10;
        v vVar = this.B;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(2131559097, viewGroup, false);
        } else {
            v.m((LinearLayout) view.findViewById(2131363135), vVar.f1825p0);
            View viewFindViewById = view.findViewById(2131362870);
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            int i11 = vVar.f1824o0;
            layoutParams.width = i11;
            layoutParams.height = i11;
            viewFindViewById.setLayoutParams(layoutParams);
        }
        o9.b0 b0Var = (o9.b0) getItem(i10);
        if (b0Var != null) {
            boolean z11 = b0Var.f11743g;
            TextView textView = (TextView) view.findViewById(2131362859);
            textView.setEnabled(z11);
            textView.setText(b0Var.f11740d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(2131362871);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = vVar.f1815f0;
            int iB = f50.c.B(context);
            if (Color.alpha(iB) != 255) {
                iB = q4.a.f(iB, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(iB, iB);
            mediaRouteVolumeSlider.setTag(b0Var);
            vVar.f1828s0.put(b0Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z11);
            mediaRouteVolumeSlider.setEnabled(z11);
            if (z11) {
                if (vVar.Z) {
                    if (((!b0Var.e() || o9.c0.g()) ? b0Var.f11749o : 0) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    mediaRouteVolumeSlider.setMax(b0Var.f11751q);
                    mediaRouteVolumeSlider.setProgress(b0Var.f11750p);
                    mediaRouteVolumeSlider.setOnSeekBarChangeListener(vVar.f1822m0);
                } else {
                    mediaRouteVolumeSlider.setMax(100);
                    mediaRouteVolumeSlider.setProgress(100);
                    mediaRouteVolumeSlider.setEnabled(false);
                }
            }
            ((ImageView) view.findViewById(2131362870)).setAlpha(z11 ? 255 : (int) (this.A * 255.0f));
            ((LinearLayout) view.findViewById(2131363135)).setVisibility(vVar.f1820k0.contains(b0Var) ? 4 : 0);
            HashSet hashSet = vVar.f1818i0;
            if (hashSet != null && hashSet.contains(b0Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override
    public final boolean isEnabled(int i10) {
        return false;
    }
}
