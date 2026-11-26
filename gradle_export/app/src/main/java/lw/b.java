package lw;

import a40.c0;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.internal.measurement.g4;
import com.revenuecat.purchases.common.networking.HTTPTimeoutManager;
import g00.b0;
import h1.v0;
import lb.f;
import m00.c;
import ri.t1;
import s30.d;
import wb.h;
import wb.i;

public final class b {
    public final Context a;
    public final f b;
    public final fu.a c;

    public b(Context context, f fVar, fu.a aVar) {
        this.a = context;
        this.b = fVar;
        this.c = aVar;
    }

    public final Object a(String str, String str2, Uri uri, c cVar) throws Throwable {
        a aVar;
        Bitmap bitmap;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.E = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objL = aVar.C;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.E;
        if (i2 == 0) {
            t1.O(objL);
            bitmap = null;
            if (uri != null) {
                aVar.A = str;
                aVar.B = str2;
                aVar.E = 1;
                h hVar = new h(this.a);
                hVar.c = uri;
                hVar.m = Boolean.FALSE;
                i iVarA = hVar.a();
                s30.a aVar3 = s30.b.B;
                long jC0 = g4.c0(HTTPTimeoutManager.SUPPORTED_FALLBACK_TIMEOUT_MS, d.MILLISECONDS);
                objL = c0.L(c0.G(jC0), new g6.a(this, iVarA, (k00.c) null, 15), aVar);
                if (objL == aVar2) {
                    return aVar2;
                }
            }
            String str3 = str2;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            this.c.a("push_channel", iCurrentTimeMillis, str, str3, new v0(bitmap, str3, 25));
            return b0.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = aVar.B;
        str = aVar.A;
        t1.O(objL);
        bitmap = (Bitmap) objL;
        String str4 = str2;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        this.c.a("push_channel", iCurrentTimeMillis2, str, str4, new v0(bitmap, str4, 25));
        return b0.a;
    }
}
