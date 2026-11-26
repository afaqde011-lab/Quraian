package cs;

import android.content.Context;
import android.content.Intent;
import g00.b0;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;

public final class l extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final rr.b C;
    public final u00.a D;
    public final Context E;

    public l(rr.b bVar, u00.a aVar, Context context, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = bVar;
        this.D = aVar;
        this.E = context;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                l lVar = new l(this.C, this.D, this.E, cVar, 0);
                lVar.B = obj;
                return lVar;
            default:
                l lVar2 = new l(this.C, this.D, this.E, cVar, 1);
                lVar2.B = obj;
                return lVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l lVar = (l) create((g) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                lVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                l lVar2 = (l) create((ds.j) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                lVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        Context context = this.E;
        u00.a aVar = this.D;
        rr.b bVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                g gVar = (g) obj2;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (gVar instanceof e) {
                    aVar.invoke();
                } else {
                    if (!(gVar instanceof f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f fVar = (f) gVar;
                    int i2 = fVar.a;
                    boolean z = fVar.b;
                    pm.c cVar = bVar.a;
                    kotlin.jvm.internal.m.e(context, "context");
                    String strA = z ? cVar.a(2131887304, Integer.valueOf(i2)) : cVar.a(2131887303, Integer.valueOf(i2));
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.TEXT", strA);
                    context.startActivity(Intent.createChooser(intent, "Share via"));
                }
                return b0Var;
            default:
                ds.j jVar = (ds.j) obj2;
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (jVar instanceof ds.h) {
                    aVar.invoke();
                } else {
                    if (!(jVar instanceof ds.i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Integer num = ((ds.i) jVar).a;
                    pm.c cVar2 = bVar.a;
                    kotlin.jvm.internal.m.e(context, "context");
                    String strA2 = num == null ? cVar2.a(2131887313, new Object[0]) : cVar2.a(2131887312, NumberFormat.getInstance(Locale.ENGLISH).format(num));
                    Intent intent2 = new Intent("android.intent.action.SEND");
                    intent2.setType("text/plain");
                    intent2.putExtra("android.intent.extra.TEXT", strA2);
                    context.startActivity(Intent.createChooser(intent2, "Share via"));
                }
                return b0Var;
        }
    }
}
