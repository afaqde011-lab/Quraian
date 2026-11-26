package androidx.mediarouter.app;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import ba.f1;

public final class j0 extends f1 {
    public final o0 A;

    public final View f1740u;

    public final ImageView f1741v;

    public final ProgressBar f1742w;

    public final TextView f1743x;

    public final float f1744y;

    public o9.b0 f1745z;

    public j0(o0 o0Var, View view) {
        super(view);
        this.A = o0Var;
        this.f1740u = view;
        this.f1741v = (ImageView) view.findViewById(2131362815);
        ProgressBar progressBar = (ProgressBar) view.findViewById(2131362817);
        this.f1742w = progressBar;
        this.f1743x = (TextView) view.findViewById(2131362816);
        q0 q0Var = o0Var.f1762j;
        this.f1744y = f50.c.C(q0Var.O);
        f50.c.X(q0Var.O, progressBar);
    }
}
