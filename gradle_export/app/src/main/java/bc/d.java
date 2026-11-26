package bc;

import ab.a0;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.google.protobuf.RuntimeVersion;
import h00.q;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import r30.k;
import x40.p;

public abstract class d {

    public static final Bitmap.Config[] f2480a = {Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16};

    public static final Bitmap.Config f2481b = Bitmap.Config.HARDWARE;

    public static final p f2482c = new p((String[]) new ArrayList(20).toArray(new String[0]));

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e3) {
            throw e3;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str == null || k.L0(str)) {
            return null;
        }
        String strF1 = k.f1('#', str, str);
        String strF2 = k.f1('?', strF1, strF1);
        return mimeTypeMap.getMimeTypeFromExtension(k.b1('.', k.b1('/', strF2, strF2), RuntimeVersion.SUFFIX));
    }

    public static final boolean c(Uri uri) {
        return m.a(uri.getScheme(), "file") && m.a((String) q.N0(uri.getPathSegments()), "android_asset");
    }

    public static final int d(a0 a0Var, xb.f fVar) throws NoWhenBranchMatchedException {
        if (a0Var instanceof xb.a) {
            return ((xb.a) a0Var).f16510a;
        }
        int iOrdinal = fVar.ordinal();
        if (iOrdinal == 0) {
            return Integer.MIN_VALUE;
        }
        if (iOrdinal == 1) {
            return Integer.MAX_VALUE;
        }
        throw new NoWhenBranchMatchedException();
    }
}
