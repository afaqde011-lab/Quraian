package e7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.d1;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

public final class p {

    public final Thread f5156a;

    public final d0 f5157b;

    public final n f5158c;

    public final CopyOnWriteArraySet f5159d;

    public final ArrayDeque f5160e;

    public final ArrayDeque f5161f;

    public final Object f5162g;

    public boolean f5163h;

    public boolean f5164i;

    public p(Looper looper, b0 b0Var, n nVar) {
        this(new CopyOnWriteArraySet(), looper, looper.getThread(), b0Var, nVar, true);
    }

    public p(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }

    public p(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, b0 b0Var, n nVar, boolean z10) {
        this.f5156a = thread;
        this.f5159d = copyOnWriteArraySet;
        this.f5158c = nVar;
        this.f5162g = new Object();
        this.f5160e = new ArrayDeque();
        this.f5161f = new ArrayDeque();
        if (looper == null || b0Var == null || nVar == null) {
            this.f5157b = null;
        } else {
            this.f5157b = b0Var.a(looper, new l(this, 0));
        }
        this.f5164i = z10;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.f5162g) {
            try {
                if (this.f5163h) {
                    return;
                }
                this.f5159d.add(new o(obj));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        g();
        ArrayDeque arrayDeque = this.f5161f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.f5158c != null) {
            d0 d0Var = this.f5157b;
            d0Var.getClass();
            Handler handler = d0Var.f5120a;
            if (!handler.hasMessages(1)) {
                c0 c0VarC = d0.c();
                Message messageObtainMessage = handler.obtainMessage(1);
                c0VarC.f5118a = messageObtainMessage;
                messageObtainMessage.getClass();
                handler.sendMessageAtFrontOfQueue(messageObtainMessage);
                c0VarC.a();
            }
        }
        ArrayDeque arrayDeque2 = this.f5160e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i10, m mVar) {
        g();
        this.f5161f.add(new d.l(new CopyOnWriteArraySet(this.f5159d), i10, mVar, 2));
    }

    public final void d() {
        g();
        synchronized (this.f5162g) {
            this.f5163h = true;
        }
        for (o oVar : this.f5159d) {
            n nVar = this.f5158c;
            oVar.f5155d = true;
            if (nVar != null && oVar.f5154c) {
                oVar.f5154c = false;
                nVar.h(oVar.f5152a, oVar.f5153b.g());
            }
        }
        this.f5159d.clear();
    }

    public final void e(d1 d1Var) {
        g();
        CopyOnWriteArraySet<o> copyOnWriteArraySet = this.f5159d;
        for (o oVar : copyOnWriteArraySet) {
            if (oVar.f5152a.equals(d1Var)) {
                oVar.f5155d = true;
                n nVar = this.f5158c;
                if (nVar != null && oVar.f5154c) {
                    oVar.f5154c = false;
                    nVar.h(oVar.f5152a, oVar.f5153b.g());
                }
                copyOnWriteArraySet.remove(oVar);
            }
        }
    }

    public final void f(int i10, m mVar) {
        c(i10, mVar);
        b();
    }

    public final void g() {
        if (this.f5164i) {
            ta.c0.A(Thread.currentThread() == this.f5156a);
        }
    }
}
