package fb;

import android.content.Context;
import kotlin.jvm.internal.m;

public final class g {

    public final Context f5592a;

    public final a f5593b;

    public final a f5594c;

    public final a f5595d;

    public g(Context context, jb.b bVar) {
        Context applicationContext = context.getApplicationContext();
        m.d(applicationContext, "getApplicationContext(...)");
        a aVar = new a(applicationContext, bVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        m.d(applicationContext2, "getApplicationContext(...)");
        a aVar2 = new a(applicationContext2, bVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        m.d(applicationContext3, "getApplicationContext(...)");
        a aVar3 = new a(applicationContext3, bVar, 2);
        this.f5592a = context;
        this.f5593b = aVar;
        this.f5594c = aVar2;
        this.f5595d = aVar3;
    }
}
