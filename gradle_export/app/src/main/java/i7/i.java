package i7;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

public final class i {

    public final Context f7343a;

    public final sg.f f7344b = new sg.f();

    public boolean f7345c;

    public i(Context context) {
        this.f7343a = context;
    }

    public final a[] a(Handler handler, v vVar, v vVar2, v vVar3, v vVar4) {
        ArrayList arrayList = new ArrayList();
        boolean z10 = this.f7345c;
        Context context = this.f7343a;
        y7.g gVar = new y7.g(context);
        sg.f fVar = this.f7344b;
        gVar.f16667c = fVar;
        gVar.f16668d = 5000L;
        gVar.f16669e = z10;
        gVar.f16670f = handler;
        gVar.f16671g = vVar;
        gVar.f16672h = 50;
        ta.c0.A(!gVar.f16666b);
        Handler handler2 = gVar.f16670f;
        ta.c0.A((handler2 == null && gVar.f16671g == null) || !(handler2 == null || gVar.f16671g == null));
        gVar.f16666b = true;
        arrayList.add(new y7.h(gVar));
        k7.z zVar = new k7.z(context);
        ta.c0.A(!zVar.f9187b);
        zVar.f9187b = true;
        if (((a1.i) zVar.f9189d) == null) {
            zVar.f9189d = new a1.i(new c7.m[0]);
        }
        if (((k7.u) zVar.f9191f) == null) {
            if (((h7.b) zVar.f9192g) == null) {
                zVar.f9192g = new h7.b(context, 7);
            }
            if (((k7.d0) zVar.f9190e) == null) {
                zVar.f9190e = k7.d0.f9022a;
            }
            oj.q qVar = new oj.q(context);
            k7.b bVar = context != null ? null : (k7.b) zVar.f9188c;
            Context context2 = (Context) qVar.B;
            if (context2 == null) {
                qVar.E = bVar;
            }
            h7.b bVar2 = (h7.b) zVar.f9192g;
            qVar.C = bVar2;
            qVar.D = (k7.d0) zVar.f9190e;
            if (bVar2 == null) {
                qVar.C = new h7.b(context2, 7);
            }
            zVar.f9191f = new k7.u(qVar);
        } else {
            ta.c0.A(((h7.b) zVar.f9192g) == null);
            ta.c0.A(((k7.d0) zVar.f9190e) == null);
        }
        arrayList.add(new k7.e0(this.f7343a, fVar, this.f7345c, handler, vVar2, new k7.c0(zVar)));
        arrayList.add(new u7.e(vVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new q7.b(vVar4, looper));
        arrayList.add(new q7.b(vVar4, looper));
        arrayList.add(new z7.b());
        arrayList.add(new o7.e(new dh.o(context, 2)));
        return (a[]) arrayList.toArray(new a[0]);
    }
}
