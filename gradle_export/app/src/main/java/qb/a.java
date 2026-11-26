package qb;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;

public final class a implements f {

    public final int f12803a;

    public a(int i10) {
        this.f12803a = i10;
    }

    @Override
    public final g a(Object obj, wb.l lVar) {
        switch (this.f12803a) {
            case 0:
                Uri uri = (Uri) obj;
                if (bc.d.c(uri)) {
                    return new b(uri, lVar, 0);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, lVar, 0);
            case 2:
                return new c((ByteBuffer) obj, lVar, 1);
            case 3:
                Uri uri2 = (Uri) obj;
                if (kotlin.jvm.internal.m.a(uri2.getScheme(), "content")) {
                    return new b(uri2, lVar, 1);
                }
                return null;
            case 4:
                return new c((Drawable) obj, lVar, 2);
            case 5:
                return new h((File) obj);
            default:
                Uri uri3 = (Uri) obj;
                if (kotlin.jvm.internal.m.a(uri3.getScheme(), "android.resource")) {
                    return new b(uri3, lVar, 2);
                }
                return null;
        }
    }
}
