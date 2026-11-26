package lc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import java.io.IOException;

public final class d extends b {
    public final dc.a A;
    public final Rect B;
    public final Rect C;
    public final cc.j D;

    public d(cc.i iVar, e eVar) {
        super(iVar, eVar);
        this.A = new dc.a(3, 0);
        this.B = new Rect();
        this.C = new Rect();
        String str = eVar.f10245g;
        cc.a aVar = iVar.A;
        this.D = aVar == null ? null : (cc.j) aVar.f3109d.get(str);
    }

    @Override
    public final void c(RectF rectF, Matrix matrix, boolean z10) {
        super.c(rectF, matrix, z10);
        cc.j jVar = this.D;
        if (jVar != null) {
            float fC = oc.e.c();
            rectF.set(0.0f, 0.0f, jVar.f3131a * fC, jVar.f3132b * fC);
            this.f10226n.mapRect(rectF);
        }
    }

    @Override
    public final void i(Canvas canvas, Matrix matrix, int i10) {
        Bitmap bitmapE;
        Rect rect = this.B;
        dc.a aVar = this.A;
        Rect rect2 = this.C;
        cc.j jVar = this.D;
        String str = this.f10228p.f10245g;
        cc.i iVar = this.f10227o;
        hc.a aVar2 = iVar.E;
        Bitmap bitmap = null;
        if (aVar2 != null) {
            Drawable.Callback callback = iVar.getCallback();
            Context context = (callback != null && (callback instanceof View)) ? ((View) callback).getContext() : null;
            Context context2 = aVar2.f7036a;
            if ((context != null || context2 != null) && !context2.equals(context)) {
                iVar.E = null;
            }
        }
        if (iVar.E == null) {
            iVar.E = new hc.a(iVar.getCallback(), iVar.A.f3109d);
        }
        hc.a aVar3 = iVar.E;
        if (aVar3 != null) {
            String str2 = aVar3.f7037b;
            cc.j jVar2 = (cc.j) aVar3.f7038c.get(str);
            if (jVar2 != null) {
                bitmapE = jVar2.f3134d;
                if (bitmapE == null) {
                    Context context3 = aVar3.f7036a;
                    if (context3 == null) {
                        bitmapE = null;
                    } else {
                        String str3 = jVar2.f3133c;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context3.getAssets().open(str2 + str3), null, options);
                                    if (bitmapDecodeStream == null) {
                                        oc.b.a("Decoded image `" + str + "` is null.");
                                        bitmapE = null;
                                    } else {
                                        bitmapE = oc.e.e(bitmapDecodeStream, jVar2.f3131a, jVar2.f3132b);
                                        synchronized (hc.a.f7035d) {
                                            ((cc.j) aVar3.f7038c.get(str)).f3134d = bitmapE;
                                        }
                                    }
                                } catch (IllegalArgumentException e3) {
                                    oc.b.b("Unable to decode image `" + str + "`.", e3);
                                }
                            } catch (IOException e10) {
                                oc.b.b("Unable to open asset.", e10);
                            }
                        } else {
                            try {
                                byte[] bArrDecode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                bitmapE = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                                synchronized (hc.a.f7035d) {
                                    ((cc.j) aVar3.f7038c.get(str)).f3134d = bitmapE;
                                }
                            } catch (IllegalArgumentException e11) {
                                oc.b.b("data URL did not have correct base64 format.", e11);
                                bitmapE = null;
                            }
                        }
                    }
                }
            } else {
                bitmapE = null;
            }
        } else {
            bitmapE = null;
        }
        if (bitmapE != null) {
            bitmap = bitmapE;
        } else if (jVar != null) {
            bitmap = jVar.f3134d;
        }
        if (bitmap == null || bitmap.isRecycled() || jVar == null) {
            return;
        }
        float fC = oc.e.c();
        aVar.setAlpha(i10);
        canvas.save();
        canvas.concat(matrix);
        rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        rect2.set(0, 0, (int) (bitmap.getWidth() * fC), (int) (bitmap.getHeight() * fC));
        canvas.drawBitmap(bitmap, rect, rect2, aVar);
        canvas.restore();
    }
}
