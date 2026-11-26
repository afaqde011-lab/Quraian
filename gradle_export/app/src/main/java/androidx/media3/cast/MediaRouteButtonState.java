package androidx.media3.cast;

import android.content.Context;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import l1.f1;
import l1.y0;
import l1.z0;
import o9.c0;
import o9.u;
import ri.t1;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u0000 )2\u00020\u0001:\u0001)B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010(\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020!8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006*"}, d2 = {"Landroidx/media3/cast/MediaRouteButtonState;", RuntimeVersion.SUFFIX, "Landroid/content/Context;", "context", "Lo9/u;", "selector", "<init>", "(Landroid/content/Context;Lo9/u;)V", "Lg00/b0;", "updateMediaRouteState", "()V", RuntimeVersion.SUFFIX, "observe", "(Lk00/c;)Ljava/lang/Object;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lo9/u;", "getSelector", "()Lo9/u;", "Lo9/c0;", "mediaRouter", "Lo9/c0;", "getMediaRouter", "()Lo9/c0;", RuntimeVersion.SUFFIX, "<set-?>", "isConnectedToRemote$delegate", "Ll1/z0;", "isConnectedToRemote", "()Z", "setConnectedToRemote", "(Z)V", RuntimeVersion.SUFFIX, "connectionState$delegate", "Ll1/y0;", "getConnectionState", "()I", "setConnectionState", "(I)V", "connectionState", "Companion", "lib-cast_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaRouteButtonState {
    private static final String TAG = "MediaRouteButtonState";

    private final y0 connectionState;
    private final Context context;

    private final z0 isConnectedToRemote;
    private final c0 mediaRouter;
    private final u selector;

    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/media3/cast/MediaRouteButtonState$Companion;", RuntimeVersion.SUFFIX, "<init>", "()V", "Lo9/c0;", "mediaRouter", RuntimeVersion.SUFFIX, "isConnectedToRemote", "(Lo9/c0;)Z", RuntimeVersion.SUFFIX, "getConnectionState", "(Lo9/c0;Z)I", RuntimeVersion.SUFFIX, "TAG", "Ljava/lang/String;", "lib-cast_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(kotlin.jvm.internal.f fVar) {
            this();
        }

        public final int getConnectionState(c0 mediaRouter, boolean isConnectedToRemote) {
            if (!isConnectedToRemote) {
                return 0;
            }
            mediaRouter.getClass();
            return c0.f().f11745i;
        }

        public final boolean isConnectedToRemote(c0 mediaRouter) {
            mediaRouter.getClass();
            return !c0.f().f11744h;
        }
    }

    @m00.e(c = "androidx.media3.cast.MediaRouteButtonState", f = "MediaRouteButtonState.kt", l = {79}, m = "observe")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends m00.c {
        int label;
        Object result;

        public AnonymousClass1(k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaRouteButtonState.this.observe(this);
        }
    }

    public MediaRouteButtonState(Context context, u uVar) {
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(uVar, "selector");
        this.context = context;
        this.selector = uVar;
        c0 c0VarD = c0.d(context);
        this.mediaRouter = c0VarD;
        Companion companion = INSTANCE;
        this.isConnectedToRemote = l1.q.z(Boolean.valueOf(companion.isConnectedToRemote(c0VarD)));
        this.connectionState = new f1(companion.getConnectionState(c0VarD, isConnectedToRemote()));
    }

    public static final b0 observe$lambda$0(MediaRouteButtonState mediaRouteButtonState) {
        mediaRouteButtonState.updateMediaRouteState();
        return b0.a;
    }

    private final void setConnectedToRemote(boolean z10) {
        this.isConnectedToRemote.setValue(Boolean.valueOf(z10));
    }

    private final void setConnectionState(int i10) {
        ((f1) this.connectionState).i(i10);
    }

    private final void updateMediaRouteState() {
        Companion companion = INSTANCE;
        setConnectedToRemote(companion.isConnectedToRemote(this.mediaRouter));
        setConnectionState(companion.getConnectionState(this.mediaRouter, isConnectedToRemote()));
    }

    public final int getConnectionState() {
        return ((f1) this.connectionState).h();
    }

    public final Context getContext() {
        return this.context;
    }

    public final c0 getMediaRouter() {
        return this.mediaRouter;
    }

    public final u getSelector() {
        return this.selector;
    }

    public final boolean isConnectedToRemote() {
        return ((Boolean) this.isConnectedToRemote.getValue()).booleanValue();
    }

    public final Object observe(k00.c<?> cVar) throws KotlinNothingValueException {
        AnonymousClass1 anonymousClass1;
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
        l00.a aVar = l00.a.A;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t1.O(obj);
            updateMediaRouteState();
            c0 c0Var = this.mediaRouter;
            u uVar = this.selector;
            i iVar = new i(this, 2);
            anonymousClass1.label = 1;
            if (MediaRouterCallbackKt.observeCallback(c0Var, uVar, iVar, anonymousClass1) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }
}
