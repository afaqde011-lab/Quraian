package mv;

import a40.c0;
import a40.m0;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import lu.w;
import ri.t1;

public final class e {
    public static final e a = new e();

    public final Object a(Context context, Bitmap bitmap, String str, m00.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.E = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objJ = dVar.C;
        l00.a aVar = l00.a.A;
        int i2 = dVar.E;
        if (i2 == 0) {
            t1.O(objJ);
            h40.e eVar = m0.a;
            h40.d dVar2 = h40.d.C;
            w wVar = new w(context, bitmap, (k00.c) null, 5);
            dVar.A = context;
            dVar.B = str;
            dVar.E = 1;
            objJ = c0.J(wVar, dVar2, dVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = dVar.B;
            context = dVar.A;
            t1.O(objJ);
        }
        File file = (File) objJ;
        if (file == null) {
            return Boolean.FALSE;
        }
        Uri uriD = FileProvider.d(context, context.getPackageName() + ".share", file);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/png");
        intent.putExtra("android.intent.extra.STREAM", uriD);
        intent.putExtra("android.intent.extra.TITLE", str);
        intent.setClipData(ClipData.newRawUri(str, uriD));
        intent.addFlags(1);
        context.startActivity(Intent.createChooser(intent, str));
        return Boolean.TRUE;
    }
}
