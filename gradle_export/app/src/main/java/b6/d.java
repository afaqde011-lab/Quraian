package b6;

import android.graphics.Bitmap;

public final class d implements t {

    public final Bitmap f2164a;

    public d(Bitmap bitmap) {
        this.f2164a = bitmap;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BitmapImageProvider(bitmap=Bitmap(");
        Bitmap bitmap = this.f2164a;
        sb2.append(bitmap.getWidth());
        sb2.append("px x ");
        sb2.append(bitmap.getHeight());
        sb2.append("px))");
        return sb2.toString();
    }
}
