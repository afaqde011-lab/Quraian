package com.revenuecat.purchases.storage;

import a40.f0;
import a40.m1;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import u00.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\b¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000eR)\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\t0\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/storage/KeyedDeferredValueStore;", "H", "T", "", "lock", "<init>", "(Ljava/lang/Object;)V", SubscriberAttributeKt.JSON_NAME_KEY, "Lkotlin/Function0;", "La40/f0;", "task", "forgettingFailure", "(Ljava/lang/Object;Lu00/a;)La40/f0;", "getOrPut", "Ljava/lang/Object;", "", "deferred", "Ljava/util/Map;", "getDeferred", "()Ljava/util/Map;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KeyedDeferredValueStore<H, T> {
    private final Map<H, f0> deferred;
    private final Object lock;

    public KeyedDeferredValueStore() {
        f fVar = null;
        this(fVar, 1, fVar);
    }

    public KeyedDeferredValueStore(Object lock) {
        m.e(lock, "lock");
        this.lock = lock;
        this.deferred = new LinkedHashMap();
    }

    public KeyedDeferredValueStore(Object obj, int i, f fVar) {
        this((i & 1) != 0 ? new Object() {
        } : obj);
    }

    private final f0 forgettingFailure(H key, a task) {
        f0 f0Var = (f0) task.invoke();
        ((m1) f0Var).f0(new KeyedDeferredValueStore$forgettingFailure$1$1(this, key));
        return f0Var;
    }

    public final Map<H, f0> getDeferred() {
        return this.deferred;
    }

    public final f0 getOrPut(H key, a task) {
        f0 f0VarForgettingFailure;
        m.e(task, "task");
        synchronized (this.lock) {
            f0VarForgettingFailure = this.deferred.get(key);
            if (f0VarForgettingFailure == null) {
                f0VarForgettingFailure = forgettingFailure(key, task);
                this.deferred.put(key, f0VarForgettingFailure);
            }
        }
        return f0VarForgettingFailure;
    }
}
