package androidx.media3.cast;

import com.google.protobuf.RuntimeVersion;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import o9.a0;
import o9.b0;
import o9.c0;
import o9.v;
import ri.t1;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J/\u0010\u0018\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(¨\u0006)"}, d2 = {"Landroidx/media3/cast/MediaRouterCallback;", "Lo9/v;", "Lkotlin/Function0;", "Lg00/b0;", "onEvent", "La40/j;", RuntimeVersion.SUFFIX, "continuation", "<init>", "(Lu00/a;La40/j;)V", "notifyOnEvent", "()V", "Lo9/c0;", "router", "Lo9/b0;", "info", "onRouteAdded", "(Lo9/c0;Lo9/b0;)V", "onRouteRemoved", "onRouteChanged", "selectedRoute", RuntimeVersion.SUFFIX, "reason", "requestedRoute", "onRouteSelected", "(Lo9/c0;Lo9/b0;ILo9/b0;)V", "route", "onRouteUnselected", "(Lo9/c0;Lo9/b0;I)V", "Lo9/a0;", "provider", "onProviderAdded", "(Lo9/c0;Lo9/a0;)V", "onProviderRemoved", "onProviderChanged", "Lu00/a;", "La40/j;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCancelled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "lib-cast_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class MediaRouterCallback extends v {
    private final a40.j continuation;
    private final AtomicBoolean isCancelled;
    private final u00.a onEvent;

    public MediaRouterCallback(u00.a aVar, a40.j jVar) {
        kotlin.jvm.internal.m.e(aVar, "onEvent");
        kotlin.jvm.internal.m.e(jVar, "continuation");
        this.onEvent = aVar;
        this.continuation = jVar;
        this.isCancelled = new AtomicBoolean(false);
    }

    private final void notifyOnEvent() {
        try {
            if (this.isCancelled.get()) {
                return;
            }
            this.onEvent.invoke();
        } catch (Throwable th2) {
            this.isCancelled.set(true);
            this.continuation.resumeWith(t1.s(th2));
        }
    }

    public final AtomicBoolean getIsCancelled() {
        return this.isCancelled;
    }

    @Override
    public void onProviderAdded(c0 router, a0 provider) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(provider, "provider");
        notifyOnEvent();
    }

    @Override
    public void onProviderChanged(c0 router, a0 provider) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(provider, "provider");
        notifyOnEvent();
    }

    @Override
    public void onProviderRemoved(c0 router, a0 provider) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(provider, "provider");
        notifyOnEvent();
    }

    @Override
    public void onRouteAdded(c0 router, b0 info) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(info, "info");
        notifyOnEvent();
    }

    @Override
    public void onRouteChanged(c0 router, b0 info) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(info, "info");
        notifyOnEvent();
    }

    @Override
    public void onRouteRemoved(c0 router, b0 info) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(info, "info");
        notifyOnEvent();
    }

    @Override
    public void onRouteSelected(c0 router, b0 selectedRoute, int reason, b0 requestedRoute) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(selectedRoute, "selectedRoute");
        kotlin.jvm.internal.m.e(requestedRoute, "requestedRoute");
        notifyOnEvent();
    }

    @Override
    public void onRouteUnselected(c0 router, b0 route, int reason) {
        kotlin.jvm.internal.m.e(router, "router");
        kotlin.jvm.internal.m.e(route, "route");
        notifyOnEvent();
    }
}
