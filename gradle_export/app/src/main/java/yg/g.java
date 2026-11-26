package yg;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.b5;
import dh.r;
import dh.w;
import java.util.ArrayList;
import tf.y;

public final class g {

    public final w f16875a;

    public final String f16876b;

    public final xf.g f16877c;

    public final tf.w f16878d;

    public final dh.c f16879e;

    public g(Context context, w wVar, tf.w wVar2) {
        xf.g gVar = new xf.g();
        this.f16877c = gVar;
        this.f16876b = context.getPackageName();
        this.f16875a = wVar;
        this.f16878d = wVar2;
        dh.c cVar = new dh.c(context, wVar, h.f16880a, new y(22));
        this.f16879e = cVar;
        cVar.a().post(new dh.a(this, gVar, context));
    }

    public static Bundle a(g gVar, m mVar, long j9, long j10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", gVar.f16876b);
        bundle.putLong("cloud.prj", j9);
        bundle.putString("nonce", mVar.f16887a);
        bundle.putLong("warm.up.sid", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        bundle.putIntegerArrayList("request.verdict.opt.out", new ArrayList<>(mVar.f16888b));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(b5.j(arrayList)));
        return bundle;
    }

    public static Bundle b(g gVar, long j9) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", gVar.f16876b);
        bundle.putLong("cloud.prj", j9);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 6);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(b5.j(arrayList)));
        return bundle;
    }

    public static boolean c(g gVar) {
        xf.g gVar2 = gVar.f16877c;
        return gVar2.f16565a.o() && ((Integer) gVar2.f16565a.k()).intValue() < 83420000;
    }

    public static boolean d(g gVar) {
        xf.g gVar2 = gVar.f16877c;
        return gVar2.f16565a.o() && ((Integer) gVar2.f16565a.k()).intValue() == 0;
    }
}
