package androidx.media3.cast;

import a40.z;
import android.content.Context;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.tasks.Task;
import g00.b0;
import kotlin.Metadata;
import l1.z0;
import o9.u;
import ri.t1;

@m00.e(c = "androidx.media3.cast.MediaRouteButtonKt$MediaRouteButtonContainer$1$1", f = "MediaRouteButton.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {2, 0, 0})
public final class MediaRouteButtonKt$MediaRouteButtonContainer$1$1 extends m00.i implements u00.n {
    final Context $context;
    final z0 $selector$delegate;
    int label;

    public MediaRouteButtonKt$MediaRouteButtonContainer$1$1(Context context, z0 z0Var, k00.c<? super MediaRouteButtonKt$MediaRouteButtonContainer$1$1> cVar) {
        super(2, cVar);
        this.$context = context;
        this.$selector$delegate = z0Var;
    }

    public static final b0 invokeSuspend$lambda$0(z0 z0Var, CastContext castContext) {
        u mergedSelector = castContext.getMergedSelector();
        if (mergedSelector == null) {
            mergedSelector = u.f11876c;
        }
        z0Var.setValue(mergedSelector);
        return b0.a;
    }

    public static final void invokeSuspend$lambda$2(z0 z0Var, Exception exc) {
        e7.a.n("MediaRouteButton", "Failed to get CastContext", exc);
        z0Var.setValue(u.f11876c);
    }

    public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
        return new MediaRouteButtonKt$MediaRouteButtonContainer$1$1(this.$context, this.$selector$delegate, cVar);
    }

    public final Object invoke(z zVar, k00.c<? super b0> cVar) {
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t1.O(obj);
        Task<CastContext> sharedInstance = CastContext.getSharedInstance(this.$context, e7.a.f());
        final z0 z0Var = this.$selector$delegate;
        sharedInstance.g(new k(new u00.k() {
            public final Object invoke(Object obj2) {
                return MediaRouteButtonKt$MediaRouteButtonContainer$1$1.invokeSuspend$lambda$0(z0Var, (CastContext) obj2);
            }
        }, 0)).e(new k(this.$selector$delegate, 1));
        return b0.a;
    }
}
