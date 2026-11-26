package i2;

import android.content.Context;
import c3.j3;
import d00.a1;

public final class c implements y {

    public final c3.z f7112a;

    public final Object f7113b = new Object();

    public boolean f7114c;

    public h1.l f7115d;

    public final a1 f7116e;

    public c(c3.z zVar) {
        this.f7112a = zVar;
        a1 a1Var = new a1(this, 1);
        this.f7116e = a1Var;
        if (zVar.isAttachedToWindow()) {
            Context context = zVar.getContext();
            if (!this.f7114c) {
                context.getApplicationContext().registerComponentCallbacks(a1Var);
                this.f7114c = true;
            }
        }
        zVar.addOnAttachStateChangeListener(new j3(this, 3));
    }

    @Override
    public final void a(l2.b bVar) {
        synchronized (this.f7113b) {
            if (!bVar.f9989s) {
                bVar.f9989s = true;
                bVar.b();
            }
        }
    }

    @Override
    public final h1.l b() {
        h1.l lVar = this.f7115d;
        if (lVar != null) {
            return lVar;
        }
        h1.l lVar2 = new h1.l();
        this.f7115d = lVar2;
        return lVar2;
    }

    @Override
    public final l2.b c() {
        l2.b bVar;
        synchronized (this.f7113b) {
            this.f7112a.getUniqueDrawingId();
            bVar = new l2.b(new l2.c());
        }
        return bVar;
    }
}
