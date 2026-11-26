package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class r extends AsyncTask {

    public final Bitmap f1787a;

    public final Uri f1788b;

    public int f1789c;

    public long f1790d;

    public final v f1791e;

    public r(v vVar) {
        this.f1791e = vVar;
        MediaDescriptionCompat mediaDescriptionCompat = vVar.f1832w0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.E;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f1787a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = vVar.f1832w0;
        this.f1788b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.F : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.f1791e.K.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            int i10 = v.Q0;
            uRLConnectionOpenConnection.setConnectTimeout(i10);
            uRLConnectionOpenConnection.setReadTimeout(i10);
            inputStreamOpenInputStream = uRLConnectionOpenConnection.getInputStream();
        }
        if (inputStreamOpenInputStream == null) {
            return null;
        }
        return new BufferedInputStream(inputStreamOpenInputStream);
    }

    @Override
    public final Object doInBackground(Object[] objArr) throws Throwable {
        InputStream inputStream;
        BufferedInputStream bufferedInputStreamA;
        InputStream inputStream2 = null;
        Bitmap bitmapDecodeStream = this.f1787a;
        if (bitmapDecodeStream == null) {
            Uri uri = this.f1788b;
            try {
                if (uri != null) {
                    try {
                        bufferedInputStreamA = a(uri);
                        try {
                            try {
                                if (bufferedInputStreamA == null) {
                                    Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                    if (bufferedInputStreamA != null) {
                                    }
                                    return null;
                                }
                                BitmapFactory.Options options = new BitmapFactory.Options();
                                options.inJustDecodeBounds = true;
                                BitmapFactory.decodeStream(bufferedInputStreamA, null, options);
                                if (options.outWidth != 0 && options.outHeight != 0) {
                                    try {
                                        bufferedInputStreamA.reset();
                                    } catch (IOException unused) {
                                        bufferedInputStreamA.close();
                                        bufferedInputStreamA = a(uri);
                                        if (bufferedInputStreamA == null) {
                                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri);
                                            if (bufferedInputStreamA == null) {
                                                return null;
                                            }
                                        }
                                        bufferedInputStreamA.close();
                                        return null;
                                    }
                                    options.inJustDecodeBounds = false;
                                    options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.f1791e.j(options.outWidth, options.outHeight)));
                                    if (isCancelled()) {
                                        bufferedInputStreamA.close();
                                        return null;
                                    }
                                    bitmapDecodeStream = BitmapFactory.decodeStream(bufferedInputStreamA, null, options);
                                    try {
                                        bufferedInputStreamA.close();
                                    } catch (IOException unused2) {
                                    }
                                }
                                bufferedInputStreamA.close();
                                return null;
                            } catch (IOException unused3) {
                                return null;
                            }
                        } catch (IOException e3) {
                            e = e3;
                            Log.w("MediaRouteCtrlDialog", "Unable to open: " + uri, e);
                            if (bufferedInputStreamA != null) {
                                try {
                                    bufferedInputStreamA.close();
                                } catch (IOException unused4) {
                                }
                            }
                            bitmapDecodeStream = null;
                        }
                    } catch (IOException e10) {
                        e = e10;
                        bufferedInputStreamA = null;
                    } catch (Throwable th2) {
                        th = th2;
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (IOException unused5) {
                            }
                        }
                        throw th;
                    }
                } else {
                    bitmapDecodeStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream2 = inputStream;
            }
        }
        if (bitmapDecodeStream != null && bitmapDecodeStream.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't use recycled bitmap: " + bitmapDecodeStream);
            return null;
        }
        if (bitmapDecodeStream != null && bitmapDecodeStream.getWidth() < bitmapDecodeStream.getHeight()) {
            o9.d dVar = new o9.d(bitmapDecodeStream);
            dVar.f11760a = 1;
            List list = (List) dVar.a().f15146a;
            this.f1789c = Collections.unmodifiableList(list).isEmpty() ? 0 : ((u9.d) Collections.unmodifiableList(list).get(0)).f15154d;
        }
        return bitmapDecodeStream;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        v vVar = this.f1791e;
        vVar.f1833x0 = null;
        Bitmap bitmap2 = vVar.f1834y0;
        Bitmap bitmap3 = this.f1787a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.f1788b;
        if (zEquals && Objects.equals(vVar.f1835z0, uri)) {
            return;
        }
        vVar.f1834y0 = bitmap3;
        vVar.B0 = bitmap;
        vVar.f1835z0 = uri;
        vVar.C0 = this.f1789c;
        vVar.A0 = true;
        vVar.o(SystemClock.uptimeMillis() - this.f1790d > 120);
    }

    @Override
    public final void onPreExecute() {
        this.f1790d = SystemClock.uptimeMillis();
        v vVar = this.f1791e;
        vVar.A0 = false;
        vVar.B0 = null;
        vVar.C0 = 0;
    }
}
