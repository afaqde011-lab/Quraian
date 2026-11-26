package androidx.glance.appwidget;

import a40.c0;
import a40.m0;
import a40.v;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b40.c;
import d0.i2;
import f40.m;
import f6.n;
import h40.e;
import kotlin.Metadata;
import za.g;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/glance/appwidget/AsyncRequestWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "d6/a0", "glance-appwidget"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AsyncRequestWorker extends CoroutineWorker {

    public final c f864h;

    public final n f865i;

    public AsyncRequestWorker(Context context, WorkerParameters workerParameters) {
        byte[] bArr;
        super(context, workerParameters);
        e eVar = m0.a;
        this.f864h = m.a;
        g gVar = workerParameters.f1903b;
        gVar.getClass();
        Object obj = gVar.f17368a.get("request");
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Byte");
                }
                bArr[i10] = ((Byte) obj2).byteValue();
            }
        } else {
            bArr = null;
        }
        this.f865i = n.F(bArr);
    }

    @Override
    public final Object e(k00.c cVar) {
        return c0.k(new i2(this, (k00.c) null, 6), cVar);
    }

    @Override
    public final v getF971k() {
        return this.f864h;
    }
}
