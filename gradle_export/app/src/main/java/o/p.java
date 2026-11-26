package o;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

public final class p extends FrameLayout implements n.c {
    public final CollapsibleActionView A;

    public p(View view) {
        super(view.getContext());
        this.A = (CollapsibleActionView) view;
        addView(view);
    }
}
