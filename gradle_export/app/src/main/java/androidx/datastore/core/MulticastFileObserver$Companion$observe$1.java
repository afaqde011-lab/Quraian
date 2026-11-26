package androidx.datastore.core;

import a40.o0;
import c40.s;
import c40.t;
import g00.b0;
import java.io.File;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "androidx.datastore.core.MulticastFileObserver$Companion$observe$1", f = "MulticastFileObserver.android.kt", l = {84, 85}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc40/t;", "Lg00/b0;", "<anonymous>", "(Lc40/t;)V"}, k = 3, mv = {1, 8, 0})
public final class MulticastFileObserver$Companion$observe$1 extends i implements n {
    final File $file;
    private Object L$0;
    Object L$1;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n implements u00.a {
        final o0 $disposeListener;

        public AnonymousClass1(o0 o0Var) {
            super(0);
            this.$disposeListener = o0Var;
        }

        public Object invoke() {
            m6invoke();
            return b0.a;
        }

        public final void m6invoke() {
            this.$disposeListener.dispose();
        }
    }

    public MulticastFileObserver$Companion$observe$1(File file, c<? super MulticastFileObserver$Companion$observe$1> cVar) {
        super(2, cVar);
        this.$file = file;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        MulticastFileObserver$Companion$observe$1 multicastFileObserver$Companion$observe$1 = new MulticastFileObserver$Companion$observe$1(this.$file, cVar);
        multicastFileObserver$Companion$observe$1.L$0 = obj;
        return multicastFileObserver$Companion$observe$1;
    }

    public final Object invoke(t tVar, c<? super b0> cVar) {
        return create(tVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        o0 o0VarObserve;
        t tVar;
        l00.a aVar = l00.a.A;
        int i10 = this.label;
        b0 b0Var = b0.a;
        if (i10 == 0) {
            t1.O(obj);
            t tVar2 = (t) this.L$0;
            MulticastFileObserver$Companion$observe$1$flowObserver$1 multicastFileObserver$Companion$observe$1$flowObserver$1 = new MulticastFileObserver$Companion$observe$1$flowObserver$1(this.$file, tVar2);
            MulticastFileObserver.Companion companion = MulticastFileObserver.INSTANCE;
            File parentFile = this.$file.getParentFile();
            m.b(parentFile);
            o0VarObserve = companion.observe(parentFile, multicastFileObserver$Companion$observe$1$flowObserver$1);
            this.L$0 = tVar2;
            this.L$1 = o0VarObserve;
            this.label = 1;
            if (((s) tVar2).D.m(b0Var, this) != aVar) {
                tVar = tVar2;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return b0Var;
        }
        o0VarObserve = (o0) this.L$1;
        tVar = (t) this.L$0;
        t1.O(obj);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(o0VarObserve);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        return w00.a.j(tVar, anonymousClass1, this) == aVar ? aVar : b0Var;
    }
}
