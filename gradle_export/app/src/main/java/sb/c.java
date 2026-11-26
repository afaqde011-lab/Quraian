package sb;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import bc.d;
import kotlin.jvm.internal.m;
import wb.l;

public final class c implements b {
    @Override
    public final String a(Object obj, l lVar) {
        Uri uri = (Uri) obj;
        if (!m.a(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(uri);
        sb2.append('-');
        Configuration configuration = lVar.f15960a.getResources().getConfiguration();
        Bitmap.Config[] configArr = d.f2480a;
        sb2.append(configuration.uiMode & 48);
        return sb2.toString();
    }
}
