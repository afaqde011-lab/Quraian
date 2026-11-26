package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import d40.i;
import d40.o;
import d40.p1;
import d40.x0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\t8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u0012\u0004\b\f\u0010\u0004R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/datastore/core/DataStoreInMemoryCache;", "T", RuntimeVersion.SUFFIX, "<init>", "()V", "Landroidx/datastore/core/State;", "newState", "tryUpdate", "(Landroidx/datastore/core/State;)Landroidx/datastore/core/State;", "Ld40/x0;", "cachedValue", "Ld40/x0;", "getCachedValue$annotations", "getCurrentState", "()Landroidx/datastore/core/State;", "currentState", "Ld40/i;", "getFlow", "()Ld40/i;", "flow", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreInMemoryCache<T> {
    private final x0 cachedValue;

    public DataStoreInMemoryCache() {
        UnInitialized unInitialized = UnInitialized.INSTANCE;
        m.c(unInitialized, "null cannot be cast to non-null type androidx.datastore.core.State<T of androidx.datastore.core.DataStoreInMemoryCache>");
        this.cachedValue = o.c(unInitialized);
    }

    private static void getCachedValue$annotations() {
    }

    public final State<T> getCurrentState() {
        return (State) this.cachedValue.getValue();
    }

    public final i getFlow() {
        return this.cachedValue;
    }

    public final State<T> tryUpdate(State<T> newState) {
        p1 p1Var;
        Object value;
        State<T> state;
        m.e(newState, "newState");
        p1 p1Var2 = this.cachedValue;
        do {
            p1Var = p1Var2;
            value = p1Var.getValue();
            state = (State) value;
            if (state instanceof ReadException ? true : m.a(state, UnInitialized.INSTANCE)) {
                state = newState;
            } else if (state instanceof Data) {
                if (newState.getVersion() > state.getVersion()) {
                    state = newState;
                }
            } else if (!(state instanceof Final)) {
                throw new NoWhenBranchMatchedException();
            }
        } while (!p1Var.i(value, state));
        return state;
    }
}
