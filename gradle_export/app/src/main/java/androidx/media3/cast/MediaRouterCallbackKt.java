package androidx.media3.cast;

import a40.z;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import o9.c0;
import o9.u;
import qd.s0;
import ri.t1;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a*\u0010\t\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0082@¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lo9/c0;", "Lo9/u;", "selector", "Lkotlin/Function0;", "Lg00/b0;", "onEvent", RuntimeVersion.SUFFIX, "observeCallback", "(Lo9/c0;Lo9/u;Lu00/a;Lk00/c;)Ljava/lang/Object;", "observeCallbackImpl", "lib-cast_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MediaRouterCallbackKt {

    @m00.e(c = "androidx.media3.cast.MediaRouterCallbackKt", f = "MediaRouterCallback.kt", l = {45, 47}, m = "observeCallback")
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
            return MediaRouterCallbackKt.observeCallback(null, null, null, this);
        }
    }

    @m00.e(c = "androidx.media3.cast.MediaRouterCallbackKt$observeCallback$2", f = "MediaRouterCallback.kt", l = {48}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"La40/z;", RuntimeVersion.SUFFIX, "<anonymous>", "(La40/z;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
    public static final class AnonymousClass2 extends m00.i implements u00.n {
        final u00.a $onEvent;
        final u $selector;
        final c0 $this_observeCallback;
        int label;

        public AnonymousClass2(c0 c0Var, u uVar, u00.a aVar, k00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$this_observeCallback = c0Var;
            this.$selector = uVar;
            this.$onEvent = aVar;
        }

        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            return new AnonymousClass2(this.$this_observeCallback, this.$selector, this.$onEvent, cVar);
        }

        public final Object invoke(z zVar, k00.c<?> cVar) {
            return create(zVar, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 == 0) {
                t1.O(obj);
                c0 c0Var = this.$this_observeCallback;
                u uVar = this.$selector;
                u00.a aVar2 = this.$onEvent;
                this.label = 1;
                if (MediaRouterCallbackKt.observeCallbackImpl(c0Var, uVar, aVar2, this) == aVar) {
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

    @m00.e(c = "androidx.media3.cast.MediaRouterCallbackKt", f = "MediaRouterCallback.kt", l = {142}, m = "observeCallbackImpl")
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class C00161 extends m00.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;

        public C00161(k00.c<? super C00161> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaRouterCallbackKt.observeCallbackImpl(null, null, null, this);
        }
    }

    public static final java.lang.Object observeCallback(o9.c0 r6, o9.u r7, u00.a r8, k00.c<?> r9) throws kotlin.KotlinNothingValueException {
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.cast.MediaRouterCallbackKt.observeCallback(o9.c0, o9.u, u00.a, k00.c):java.lang.Object");
    }

    public static final Object observeCallbackImpl(c0 c0Var, u uVar, u00.a aVar, k00.c<?> cVar) throws Throwable {
        C00161 c00161;
        final kotlin.jvm.internal.z zVar;
        Throwable th2;
        Object obj;
        if (cVar instanceof C00161) {
            c00161 = (C00161) cVar;
            int i10 = c00161.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00161.label = i10 - Integer.MIN_VALUE;
            } else {
                c00161 = new C00161(cVar);
            }
        } else {
            c00161 = new C00161(cVar);
        }
        Object obj2 = c00161.result;
        l00.a aVar2 = l00.a.A;
        int i11 = c00161.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.jvm.internal.z zVar2 = (kotlin.jvm.internal.z) c00161.L$3;
            c0 c0Var2 = (c0) c00161.L$0;
            try {
                t1.O(obj2);
                zVar = zVar2;
                c0Var = c0Var2;
                throw new KotlinNothingValueException();
            } catch (Throwable th3) {
                th2 = th3;
                zVar = zVar2;
                c0Var = c0Var2;
                obj = zVar.A;
                if (obj == null) {
                    kotlin.jvm.internal.m.k("callback");
                    throw null;
                }
                c0Var.h((MediaRouterCallback) obj);
                throw th2;
            }
        }
        t1.O(obj2);
        zVar = new kotlin.jvm.internal.z();
        try {
            c00161.L$0 = c0Var;
            c00161.L$1 = uVar;
            c00161.L$2 = aVar;
            c00161.L$3 = zVar;
            c00161.label = 1;
            a40.k kVar = new a40.k(1, s0.j0(c00161));
            kVar.r();
            zVar.A = new MediaRouterCallback(aVar, kVar);
            kVar.u(new u00.k() {
                public Object invoke(Object obj3) {
                    invoke((Throwable) obj3);
                    return b0.a;
                }

                public final void invoke(Throwable th4) {
                    Object obj3 = zVar.A;
                    if (obj3 != null) {
                        ((MediaRouterCallback) obj3).getIsCancelled().set(true);
                    } else {
                        kotlin.jvm.internal.m.k("callback");
                        throw null;
                    }
                }
            });
            Object obj3 = zVar.A;
            if (obj3 != null) {
                c0Var.a(uVar, (MediaRouterCallback) obj3, 0);
                if (kVar.q() == aVar2) {
                    return aVar2;
                }
                throw new KotlinNothingValueException();
            }
            try {
                kotlin.jvm.internal.m.k("callback");
                throw null;
            } catch (Throwable th4) {
                th2 = th4;
                obj = zVar.A;
                if (obj == null) {
                    kotlin.jvm.internal.m.k("callback");
                    throw null;
                }
                c0Var.h((MediaRouterCallback) obj);
                throw th2;
            }
        } catch (Throwable th5) {
            th2 = th5;
        }
    }
}
