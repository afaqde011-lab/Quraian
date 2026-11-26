package mv;

import a40.k;
import android.graphics.Bitmap;
import android.view.PixelCopy;

public final class c implements PixelCopy.OnPixelCopyFinishedListener {
    public final k a;
    public final Bitmap b;

    public c(k kVar, Bitmap bitmap) {
        this.a = kVar;
        this.b = bitmap;
    }

    @Override
    public final void onPixelCopyFinished(int i) {
        this.a.resumeWith(i == 0 ? this.b : null);
    }
}
