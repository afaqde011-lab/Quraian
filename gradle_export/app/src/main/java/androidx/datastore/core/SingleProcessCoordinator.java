package androidx.datastore.core;

import bt.a2;
import com.google.protobuf.RuntimeVersion;
import d40.i;
import j40.d;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m00.c;
import m00.e;
import ri.t1;
import u00.n;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u001c\u0010\n\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0007H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Landroidx/datastore/core/SingleProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", RuntimeVersion.SUFFIX, "filePath", "<init>", "(Ljava/lang/String;)V", "T", "Lkotlin/Function1;", "Lk00/c;", RuntimeVersion.SUFFIX, "block", "lock", "(Lu00/k;Lk00/c;)Ljava/lang/Object;", "Lkotlin/Function2;", RuntimeVersion.SUFFIX, "tryLock", "(Lu00/n;Lk00/c;)Ljava/lang/Object;", RuntimeVersion.SUFFIX, "getVersion", "(Lk00/c;)Ljava/lang/Object;", "incrementAndGetVersion", "Ljava/lang/String;", "Lj40/a;", "mutex", "Lj40/a;", "Landroidx/datastore/core/AtomicInt;", "version", "Landroidx/datastore/core/AtomicInt;", "Ld40/i;", "Lg00/b0;", "updateNotifications", "Ld40/i;", "getUpdateNotifications", "()Ld40/i;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SingleProcessCoordinator implements InterProcessCoordinator {
    private final String filePath;
    private final j40.a mutex;
    private final i updateNotifications;
    private final AtomicInt version;

    @e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {66, 41}, m = "lock")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
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
            return SingleProcessCoordinator.this.lock(null, this);
        }
    }

    @e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00131<T> extends c {
        Object L$0;
        boolean Z$0;
        int label;
        Object result;

        public C00131(k00.c<? super C00131> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SingleProcessCoordinator.this.tryLock(null, this);
        }
    }

    public SingleProcessCoordinator(String str) {
        m.e(str, "filePath");
        this.filePath = str;
        this.mutex = d.a();
        this.version = new AtomicInt(0);
        this.updateNotifications = new a2(new SingleProcessCoordinator$updateNotifications$1(null));
    }

    @Override
    public i getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override
    public Object getVersion(k00.c<? super Integer> cVar) {
        return new Integer(this.version.get());
    }

    @Override
    public Object incrementAndGetVersion(k00.c<? super Integer> cVar) {
        return new Integer(this.version.incrementAndGet());
    }

    @Override
    public <T> java.lang.Object lock(u00.k r7, k00.c<? super T> r8) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SingleProcessCoordinator.lock(u00.k, k00.c):java.lang.Object");
    }

    @Override
    public <T> Object tryLock(n nVar, k00.c<? super T> cVar) throws Throwable {
        C00131 c00131;
        j40.a aVar;
        boolean z10;
        Throwable th2;
        if (cVar instanceof C00131) {
            c00131 = (C00131) cVar;
            int i10 = c00131.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00131.label = i10 - Integer.MIN_VALUE;
            } else {
                c00131 = new C00131(cVar);
            }
        } else {
            c00131 = new C00131(cVar);
        }
        Object obj = c00131.result;
        l00.a aVar2 = l00.a.A;
        int i11 = c00131.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z10 = c00131.Z$0;
            aVar = (j40.a) c00131.L$0;
            try {
                t1.O(obj);
                if (z10) {
                    aVar.i((Object) null);
                }
                return obj;
            } catch (Throwable th3) {
                th2 = th3;
                if (z10) {
                    aVar.i((Object) null);
                }
                throw th2;
            }
        }
        t1.O(obj);
        j40.a aVar3 = this.mutex;
        boolean zA = aVar3.a((Object) null);
        try {
            Boolean boolValueOf = Boolean.valueOf(zA);
            c00131.L$0 = aVar3;
            c00131.Z$0 = zA;
            c00131.label = 1;
            Object objInvoke = nVar.invoke(boolValueOf, c00131);
            if (objInvoke == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            z10 = zA;
            obj = objInvoke;
            if (z10) {
                aVar.i((Object) null);
            }
            return obj;
        } catch (Throwable th4) {
            aVar = aVar3;
            z10 = zA;
            th2 = th4;
            if (z10) {
                aVar.i((Object) null);
            }
            throw th2;
        }
    }
}
