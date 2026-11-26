package c5;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

public final class e extends View {
    public final ViewGroup A;
    public final g B;

    public e(g gVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.B = gVar;
        this.A = viewGroup;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.A.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        g gVar = this.B;
        if (gVar.f2886e != color) {
            gVar.f2886e = color;
            for (int size = gVar.f2883b.size() - 1; size >= 0; size--) {
                ((c) gVar.f2883b.get(size)).b(color);
            }
        }
    }
}
