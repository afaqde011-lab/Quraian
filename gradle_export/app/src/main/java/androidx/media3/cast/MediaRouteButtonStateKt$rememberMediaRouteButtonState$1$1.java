package androidx.media3.cast;

import a40.z;
import g00.b0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import ri.t1;

@m00.e(c = "androidx.media3.cast.MediaRouteButtonStateKt$rememberMediaRouteButtonState$1$1", f = "MediaRouteButtonState.kt", l = {48}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {2, 0, 0})
public final class MediaRouteButtonStateKt$rememberMediaRouteButtonState$1$1 extends m00.i implements u00.n {
    final MediaRouteButtonState $mediaRouteButtonState;
    int label;

    public MediaRouteButtonStateKt$rememberMediaRouteButtonState$1$1(MediaRouteButtonState mediaRouteButtonState, k00.c<? super MediaRouteButtonStateKt$rememberMediaRouteButtonState$1$1> cVar) {
        super(2, cVar);
        this.$mediaRouteButtonState = mediaRouteButtonState;
    }

    public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
        return new MediaRouteButtonStateKt$rememberMediaRouteButtonState$1$1(this.$mediaRouteButtonState, cVar);
    }

    public final Object invoke(z zVar, k00.c<? super b0> cVar) {
        return create(zVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        l00.a aVar = l00.a.A;
        int i10 = this.label;
        if (i10 == 0) {
            t1.O(obj);
            MediaRouteButtonState mediaRouteButtonState = this.$mediaRouteButtonState;
            this.label = 1;
            if (mediaRouteButtonState.observe(this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        throw new KotlinNothingValueException();
    }
}
