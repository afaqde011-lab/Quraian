package com.mchutov.quranify.player.presentation.service.auto.art;

import a40.c0;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import g00.m;
import g6.a;
import gj.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import k00.c;
import kotlin.Metadata;
import r00.i;
import r30.r;
import ri.t1;
import wb.j;
import wb.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/mchutov/quranify/player/presentation/service/auto/art/AutoArtContentProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", "gj/e", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AutoArtContentProvider extends ContentProvider {
    public static final int A = 0;

    public static Bitmap a(Context context, String str) {
        Drawable drawable;
        p pVar = (j) c0.C(k00.j.A, new a(context, str, (c) null, 27));
        p pVar2 = pVar instanceof p ? pVar : null;
        if (pVar2 == null || (drawable = pVar2.a) == null) {
            return null;
        }
        return f50.c.b0(drawable, 7);
    }

    public static boolean b(Bitmap bitmap, File file) {
        Object objS;
        if (bitmap == null) {
            return false;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(480, 480, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawColor(-13882322);
            Paint paint = new Paint(3);
            paint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(38, 38, 442, 442), paint);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
            objS = Boolean.valueOf(d(bitmapCreateBitmap, file));
        } catch (Throwable th) {
            objS = t1.s(th);
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof m) {
            objS = obj;
        }
        return ((Boolean) objS).booleanValue();
    }

    public static Bitmap c(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float width = bitmap.getWidth() * 0.2f;
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), width, width, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }

    public static boolean d(Bitmap bitmap, File file) throws IOException {
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        File file2 = new File(file.getParentFile(), w.c.j(file.getName(), ".tmp"));
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            bitmap.compress(compressFormat, 100, fileOutputStream);
            fileOutputStream.close();
            return file2.renameTo(file);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ta.c0.C(fileOutputStream, th);
                throw th2;
            }
        }
    }

    @Override
    public final int delete(Uri uri, String str, String[] strArr) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return 0;
    }

    @Override
    public final String getType(Uri uri) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return "image/png";
    }

    @Override
    public final Uri insert(Uri uri, ContentValues contentValues) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return null;
    }

    @Override
    public final boolean onCreate() {
        return true;
    }

    @Override
    public final ParcelFileDescriptor openFile(Uri uri, String mode) throws IOException {
        File fileE;
        Object objS;
        boolean zBooleanValue;
        boolean z;
        Object objS2;
        boolean zX0;
        Integer numY0;
        Object objS3;
        boolean zBooleanValue2;
        Drawable drawableMutate;
        Object objS4;
        boolean zBooleanValue3;
        kotlin.jvm.internal.m.e(uri, "uri");
        kotlin.jvm.internal.m.e(mode, "mode");
        Context context = getContext();
        if (context != null) {
            String queryParameter = uri.getQueryParameter("res");
            if (queryParameter == null || (numY0 = r.y0(queryParameter)) == null) {
                String queryParameter2 = uri.getQueryParameter("file");
                if (queryParameter2 != null) {
                    File file = new File(queryParameter2);
                    if (file.exists()) {
                        File canonicalFile = new File(context.getFilesDir(), "Downloads/SoundEffectIcons").getCanonicalFile();
                        try {
                            objS2 = file.getCanonicalFile();
                        } catch (Throwable th) {
                            objS2 = t1.s(th);
                        }
                        if (objS2 instanceof m) {
                            objS2 = null;
                        }
                        File file2 = (File) objS2;
                        if (file2 == null) {
                            zX0 = false;
                        } else {
                            String path = file2.getPath();
                            kotlin.jvm.internal.m.d(path, "getPath(...)");
                            zX0 = r.x0(path, canonicalFile.getPath() + File.separator, false);
                        }
                        if (zX0) {
                            File fileE2 = e.e(context, "file_".concat(i.a0(file)));
                            if (fileE2.exists() || b(BitmapFactory.decodeFile(file.getAbsolutePath()), fileE2)) {
                                fileE = fileE2;
                            } else {
                                fileE = null;
                            }
                        } else {
                            fileE = null;
                        }
                    } else {
                        fileE = null;
                    }
                } else {
                    String queryParameter3 = uri.getQueryParameter("url");
                    if (queryParameter3 == null) {
                        fileE = null;
                    } else {
                        if (!r.x0(queryParameter3, "http", false)) {
                            queryParameter3 = null;
                        }
                        if (queryParameter3 == null) {
                            fileE = null;
                        } else if (kotlin.jvm.internal.m.a(uri.getQueryParameter("icon"), "1")) {
                            fileE = e.e(context, "icon_" + queryParameter3.hashCode());
                            if (!(fileE.exists() || b(a(context, queryParameter3), fileE))) {
                                fileE = null;
                            }
                        } else {
                            fileE = e.e(context, "photo_" + queryParameter3.hashCode());
                            if (!fileE.exists()) {
                                try {
                                    Bitmap bitmapA = a(context, queryParameter3);
                                    if (bitmapA == null) {
                                        zBooleanValue = false;
                                    } else {
                                        Bitmap bitmapExtractThumbnail = ThumbnailUtils.extractThumbnail(bitmapA, 480, 480);
                                        kotlin.jvm.internal.m.b(bitmapExtractThumbnail);
                                        Bitmap bitmapC = c(bitmapExtractThumbnail);
                                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
                                        objS = Boolean.valueOf(d(bitmapC, fileE));
                                        Object obj = Boolean.FALSE;
                                        if (objS instanceof m) {
                                            objS = obj;
                                        }
                                        zBooleanValue = ((Boolean) objS).booleanValue();
                                    }
                                } catch (Throwable th2) {
                                    objS = t1.s(th2);
                                }
                                z = zBooleanValue;
                            }
                            if (!z) {
                                fileE = null;
                            }
                        }
                    }
                }
            } else {
                int iIntValue = numY0.intValue();
                if (kotlin.jvm.internal.m.a(uri.getQueryParameter("photo"), "1")) {
                    fileE = e.e(context, "res_photo_" + iIntValue);
                    if (!fileE.exists()) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeResource(context.getResources(), iIntValue, options);
                            int i = 1;
                            while (true) {
                                int i2 = i * 2;
                                if (Math.min(options.outWidth, options.outHeight) / i2 < 480) {
                                    break;
                                }
                                i = i2;
                            }
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inSampleSize = i;
                            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), iIntValue, options2);
                            if (bitmapDecodeResource == null) {
                                zBooleanValue3 = false;
                            } else {
                                Bitmap bitmapExtractThumbnail2 = ThumbnailUtils.extractThumbnail(bitmapDecodeResource, 480, 480);
                                kotlin.jvm.internal.m.b(bitmapExtractThumbnail2);
                                Bitmap bitmapC2 = c(bitmapExtractThumbnail2);
                                Bitmap.CompressFormat compressFormat2 = Bitmap.CompressFormat.PNG;
                                objS4 = Boolean.valueOf(d(bitmapC2, fileE));
                                Object obj2 = Boolean.FALSE;
                                if (objS4 instanceof m) {
                                    objS4 = obj2;
                                }
                                zBooleanValue3 = ((Boolean) objS4).booleanValue();
                            }
                        } catch (Throwable th3) {
                            objS4 = t1.s(th3);
                        }
                        z = zBooleanValue3;
                    }
                    if (!z) {
                        fileE = null;
                    }
                } else {
                    fileE = e.e(context, "res_" + iIntValue);
                    if (!fileE.exists()) {
                        try {
                            Drawable drawable = context.getDrawable(iIntValue);
                            if (drawable == null || (drawableMutate = drawable.mutate()) == null) {
                                zBooleanValue2 = false;
                            } else {
                                drawableMutate.setTint(-1);
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(480, 480, Bitmap.Config.ARGB_8888);
                                Canvas canvas = new Canvas(bitmapCreateBitmap);
                                canvas.drawColor(-13882322);
                                drawableMutate.setBounds(86, 86, 394, 394);
                                drawableMutate.draw(canvas);
                                Bitmap.CompressFormat compressFormat3 = Bitmap.CompressFormat.PNG;
                                objS3 = Boolean.valueOf(d(bitmapCreateBitmap, fileE));
                                Object obj3 = Boolean.FALSE;
                                if (objS3 instanceof m) {
                                    objS3 = obj3;
                                }
                                zBooleanValue2 = ((Boolean) objS3).booleanValue();
                            }
                        } catch (Throwable th4) {
                            objS3 = t1.s(th4);
                        }
                        z = zBooleanValue2;
                    }
                    if (!z) {
                        fileE = null;
                    }
                }
            }
            if (fileE != null) {
                return ParcelFileDescriptor.open(fileE, 268435456);
            }
        }
        return null;
    }

    @Override
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return null;
    }

    @Override
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        kotlin.jvm.internal.m.e(uri, "uri");
        return 0;
    }
}
