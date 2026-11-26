package r0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import g00.b0;
import java.util.List;
import m3.q0;
import pp.d;
import t0.g;
import u00.k;

public abstract class b {

    public static final d f13041a = new d(28);

    public static final a f13042b = new a(0);

    public static final void a(s0.a aVar, final Context context, final boolean z10, final CharSequence charSequence, final long j9) {
        if (q0.d(j9) || charSequence.length() == 0) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        List list = (List) f13041a.invoke(context);
        if (list.isEmpty()) {
            return;
        }
        aVar.a();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            final ResolveInfo resolveInfo = (ResolveInfo) list.get(i10);
            aVar.f13618a.a(new t0.d(new t0.a(i10), resolveInfo.loadLabel(packageManager).toString(), 0, new k() {
                public final Object invoke(Object obj) {
                    b.f13042b.t(context, resolveInfo, Boolean.valueOf(z10), charSequence, new q0(j9));
                    ((g) obj).close();
                    return b0.a;
                }
            }));
        }
        aVar.a();
    }
}
