package qb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import ca.v;
import java.nio.ByteBuffer;
import nb.q;
import ua.o;

public final class c implements g {

    public final int f12807a;

    public final wb.l f12808b;

    public final Object f12809c;

    public c(Object obj, wb.l lVar, int i10) {
        this.f12807a = i10;
        this.f12809c = obj;
        this.f12808b = lVar;
    }

    @Override
    public final Object a(k00.c cVar) {
        int i10 = this.f12807a;
        Object obj = this.f12809c;
        wb.l lVar = this.f12808b;
        switch (i10) {
            case 0:
                return new d(new BitmapDrawable(lVar.f15960a.getResources(), (Bitmap) obj), false, nb.e.B);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    k50.i iVar = new k50.i();
                    iVar.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = lVar.f15960a;
                    return new m(new q(iVar, null), null, nb.e.B);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = bc.d.f2480a;
                boolean z10 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof o);
                if (z10) {
                    bitmapDrawable = new BitmapDrawable(lVar.f15960a.getResources(), v.u(bitmapDrawable, lVar.f15961b, lVar.f15963d, lVar.f15964e, lVar.f15965f));
                }
                return new d(bitmapDrawable, z10, nb.e.B);
        }
    }
}
