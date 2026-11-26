package zb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import xb.g;

public final class a implements c {

    public final String f17405a = a.class.getName();

    @Override
    public final Bitmap a(Bitmap bitmap, g gVar) {
        Paint paint = new Paint(3);
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        float f3 = iMin / 2.0f;
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawCircle(f3, f3, f3, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, f3 - (bitmap.getWidth() / 2.0f), f3 - (bitmap.getHeight() / 2.0f), paint);
        return bitmapCreateBitmap;
    }

    @Override
    public final String b() {
        return this.f17405a;
    }

    public final boolean equals(Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return a.class.hashCode();
    }
}
