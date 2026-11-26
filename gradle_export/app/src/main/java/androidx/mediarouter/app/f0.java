package androidx.mediarouter.app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
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

public final class f0 extends AsyncTask {

    public final Bitmap f1728a;

    public final Uri f1729b;

    public int f1730c;

    public final q0 f1731d;

    public f0(q0 q0Var) {
        this.f1731d = q0Var;
        MediaDescriptionCompat mediaDescriptionCompat = q0Var.f1779m0;
        Bitmap bitmap = mediaDescriptionCompat == null ? null : mediaDescriptionCompat.E;
        if (bitmap != null && bitmap.isRecycled()) {
            Log.w("MediaRouteCtrlDialog", "Can't fetch the given art bitmap because it's already recycled.");
            bitmap = null;
        }
        this.f1728a = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = q0Var.f1779m0;
        this.f1729b = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.F : null;
    }

    public final BufferedInputStream a(Uri uri) throws IOException {
        InputStream inputStreamOpenInputStream;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            inputStreamOpenInputStream = this.f1731d.O.getContentResolver().openInputStream(uri);
        } else {
            URLConnection uRLConnectionOpenConnection = new URL(uri.toString()).openConnection();
            uRLConnectionOpenConnection.setConnectTimeout(30000);
            uRLConnectionOpenConnection.setReadTimeout(30000);
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
        Bitmap bitmapDecodeStream = this.f1728a;
        if (bitmapDecodeStream == null) {
            Uri uri = this.f1729b;
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
                                    options.inSampleSize = Math.max(1, Integer.highestOneBit(options.outHeight / this.f1731d.O.getResources().getDimensionPixelSize(2131166077)));
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
            this.f1730c = Collections.unmodifiableList(list).isEmpty() ? 0 : ((u9.d) Collections.unmodifiableList(list).get(0)).f15154d;
        }
        return bitmapDecodeStream;
    }

    @Override
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        q0 q0Var = this.f1731d;
        q0Var.f1780n0 = null;
        Bitmap bitmap2 = q0Var.f1781o0;
        Bitmap bitmap3 = this.f1728a;
        boolean zEquals = Objects.equals(bitmap2, bitmap3);
        Uri uri = this.f1729b;
        if (zEquals && Objects.equals(q0Var.f1782p0, uri)) {
            return;
        }
        q0Var.f1781o0 = bitmap3;
        q0Var.f1784r0 = bitmap;
        q0Var.f1782p0 = uri;
        q0Var.f1785s0 = this.f1730c;
        q0Var.f1783q0 = true;
        q0Var.j();
    }

    @Override
    public final void onPreExecute() {
        q0 q0Var = this.f1731d;
        q0Var.f1783q0 = false;
        q0Var.f1784r0 = null;
        q0Var.f1785s0 = 0;
    }
}
