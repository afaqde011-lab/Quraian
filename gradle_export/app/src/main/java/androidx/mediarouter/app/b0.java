package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ba.f1;

public final class b0 extends f1 {

    public final View f1714u;

    public final ImageView f1715v;

    public final ProgressBar f1716w;

    public final TextView f1717x;

    public final c0 f1718y;

    public b0(c0 c0Var, View view) {
        super(view);
        this.f1718y = c0Var;
        this.f1714u = view;
        this.f1715v = (ImageView) view.findViewById(2131362863);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131362865);
        this.f1716w = progressBar;
        this.f1717x = (TextView) view.findViewById(2131362864);
        f50.c.X(c0Var.f1725g.I, progressBar);
    }
}
