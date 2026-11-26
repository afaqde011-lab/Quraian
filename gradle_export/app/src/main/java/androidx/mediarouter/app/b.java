package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.SparseArray;

public final class b extends AsyncTask {

    public final int f1711a;

    public final Context f1712b;

    public final MediaRouteButton f1713c;

    public b(int i10, Context context, MediaRouteButton mediaRouteButton) {
        this.f1713c = mediaRouteButton;
        this.f1711a = i10;
        this.f1712b = context;
    }

    @Override
    public final Object doInBackground(Object[] objArr) {
        SparseArray sparseArray = MediaRouteButton.P;
        int i10 = this.f1711a;
        if (((Drawable.ConstantState) sparseArray.get(i10)) == null) {
            return p30.f.f0(this.f1712b, i10);
        }
        return null;
    }

    @Override
    public final void onCancelled(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            MediaRouteButton.P.put(this.f1711a, drawable.getConstantState());
        }
        this.f1713c.G = null;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Drawable drawableNewDrawable = (Drawable) obj;
        int i10 = this.f1711a;
        MediaRouteButton mediaRouteButton = this.f1713c;
        if (drawableNewDrawable != null) {
            MediaRouteButton.P.put(i10, drawableNewDrawable.getConstantState());
            mediaRouteButton.G = null;
        } else {
            Drawable.ConstantState constantState = (Drawable.ConstantState) MediaRouteButton.P.get(i10);
            if (constantState != null) {
                drawableNewDrawable = constantState.newDrawable();
            }
            mediaRouteButton.G = null;
        }
        mediaRouteButton.setRemoteIndicatorDrawableInternal(drawableNewDrawable);
    }
}
