package androidx.datastore.core;

import a40.c0;
import a40.p;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import j40.d;
import kotlin.Metadata;
import m00.c;
import m00.e;
import ri.t1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H¤@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/RunOnce;", RuntimeVersion.SUFFIX, "<init>", "()V", "Lg00/b0;", "doRun", "(Lk00/c;)Ljava/lang/Object;", "awaitComplete", "runIfNeeded", "Lj40/a;", "runMutex", "Lj40/a;", "La40/p;", "didRun", "La40/p;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class RunOnce {
    private final j40.a runMutex = d.a();
    private final p didRun = c0.b();

    @e(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;

        public AnonymousClass1(k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RunOnce.this.runIfNeeded(this);
        }
    }

    public final Object awaitComplete(k00.c<? super b0> cVar) {
        Object objP = this.didRun.p(cVar);
        return objP == l00.a.A ? objP : b0.a;
    }

    public abstract Object doRun(k00.c<? super b0> cVar);

    public final Object runIfNeeded(k00.c<? super b0> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        j40.a aVar;
        Throwable th2;
        j40.a aVar2;
        RunOnce runOnce;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        l00.a aVar3 = l00.a.A;
        int i11 = anonymousClass1.label;
        b0 b0Var = b0.a;
        try {
            if (i11 == 0) {
                t1.O(obj);
                if (this.didRun.Q()) {
                    return b0Var;
                }
                aVar = this.runMutex;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = aVar;
                anonymousClass1.label = 1;
                if (aVar.l(anonymousClass1) != aVar3) {
                }
                return aVar3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (j40.a) anonymousClass1.L$1;
                runOnce = (RunOnce) anonymousClass1.L$0;
                try {
                    t1.O(obj);
                    runOnce.didRun.S(b0Var);
                    aVar2.i((Object) null);
                    return b0Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar2.i((Object) null);
                    throw th2;
                }
            }
            j40.a aVar4 = (j40.a) anonymousClass1.L$1;
            RunOnce runOnce2 = (RunOnce) anonymousClass1.L$0;
            t1.O(obj);
            aVar = aVar4;
            this = runOnce2;
            if (this.didRun.Q()) {
                aVar.i((Object) null);
                return b0Var;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = aVar;
            anonymousClass1.label = 2;
            if (this.doRun(anonymousClass1) != aVar3) {
                runOnce = this;
                aVar2 = aVar;
                runOnce.didRun.S(b0Var);
                aVar2.i((Object) null);
                return b0Var;
            }
            return aVar3;
        } catch (Throwable th4) {
            j40.a aVar5 = aVar;
            th2 = th4;
            aVar2 = aVar5;
            aVar2.i((Object) null);
            throw th2;
        }
    }
}
