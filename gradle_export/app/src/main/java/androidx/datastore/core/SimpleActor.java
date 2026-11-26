package androidx.datastore.core;

import a40.a0;
import a40.c0;
import a40.e1;
import a40.w;
import a40.z;
import c40.l;
import c40.o;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import m00.e;
import m00.i;
import ri.t1;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", RuntimeVersion.SUFFIX, "La40/z;", "scope", "Lkotlin/Function1;", RuntimeVersion.SUFFIX, "Lg00/b0;", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lk00/c;", "consumeMessage", "<init>", "(La40/z;Lu00/k;Lu00/n;Lu00/n;)V", "msg", "offer", "(Ljava/lang/Object;)V", "La40/z;", "Lu00/n;", "Lc40/l;", "messageQueue", "Lc40/l;", "Landroidx/datastore/core/AtomicInt;", "remainingMessages", "Landroidx/datastore/core/AtomicInt;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleActor<T> {
    private final n consumeMessage;
    private final l messageQueue;
    private final AtomicInt remainingMessages;
    private final z scope;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", RuntimeVersion.SUFFIX, "ex", "Lg00/b0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n implements k {
        final k $onComplete;
        final n $onUndeliveredElement;
        final SimpleActor<T> this$0;

        public AnonymousClass1(k kVar, SimpleActor<T> simpleActor, n nVar) {
            super(1);
            this.$onComplete = kVar;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = nVar;
        }

        public Object invoke(Object obj) {
            invoke((Throwable) obj);
            return b0.a;
        }

        public final void invoke(Throwable th2) {
            b0 b0Var;
            this.$onComplete.invoke(th2);
            ((SimpleActor) this.this$0).messageQueue.f(th2);
            do {
                Object objA = o.a(((SimpleActor) this.this$0).messageQueue.c());
                if (objA != null) {
                    this.$onUndeliveredElement.invoke(objA, th2);
                    b0Var = b0.a;
                } else {
                    b0Var = null;
                }
            } while (b0Var != null);
        }
    }

    @e(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "La40/z;", "Lg00/b0;", "<anonymous>", "(La40/z;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends i implements n {
        Object L$0;
        int label;
        final SimpleActor<T> this$0;

        public AnonymousClass2(SimpleActor<T> simpleActor, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = simpleActor;
        }

        public final c<b0> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.this$0, cVar);
        }

        public final Object invoke(z zVar, c<? super b0> cVar) {
            return create(zVar, cVar).invokeSuspend(b0.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.SimpleActor.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SimpleActor(z zVar, k kVar, n nVar, n nVar2) {
        m.e(zVar, "scope");
        m.e(kVar, "onComplete");
        m.e(nVar, "onUndeliveredElement");
        m.e(nVar2, "consumeMessage");
        this.scope = zVar;
        this.consumeMessage = nVar2;
        this.messageQueue = t1.b(Integer.MAX_VALUE, 6, null);
        this.remainingMessages = new AtomicInt(0);
        e1 e1Var = zVar.A().get(w.B);
        if (e1Var != null) {
            e1Var.f0(new AnonymousClass1(kVar, this, nVar));
        }
    }

    public final void offer(T msg) {
        Object objJ = this.messageQueue.j(msg);
        if (objJ instanceof c40.m) {
            Throwable th2 = ((c40.m) objJ).a;
            if (th2 != null) {
                throw th2;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (objJ instanceof c40.n) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            c0.y(this.scope, (k00.i) null, (a0) null, new AnonymousClass2(this, null), 3);
        }
    }
}
