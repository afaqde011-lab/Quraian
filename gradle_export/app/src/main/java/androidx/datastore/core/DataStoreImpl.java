package androidx.datastore.core;

import a40.a0;
import a40.c0;
import a40.e1;
import a40.v;
import a40.w1;
import a40.z;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import bt.a2;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import d40.i;
import g00.b0;
import g00.h;
import h00.q;
import j40.d;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.x;
import m00.c;
import m00.e;
import qd.s0;
import ri.t1;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 ]*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002]^Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u00120\b\u0002\u0010\u000b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00060\u0005\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J4\u0010\u0013\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0080@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001e\u0010\u001dJ\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b!\u0010\"J\u001e\u0010%\u001a\u00020\t2\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0082@¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tH\u0082@¢\u0006\u0004\b'\u0010\u001dJ\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u001f\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b)\u0010\u001dJ<\u0010,\u001a\u00028\u00002\"\u0010\u0012\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00062\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b,\u0010-J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u0010.\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b0\u0010\"JI\u00104\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u0010.\u001a\u00020\u00162\u001c\u00103\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\n02H\u0082@\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b4\u00105R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u00106R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00108R \u0010:\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001e\u0010J\u001a\f0IR\b\u0012\u0004\u0012\u00028\u00000\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000M0L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010O\u001a\u0004\bR\u0010SR \u0010V\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR!\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000M8@X\u0080\u0084\u0002¢\u0006\f\u001a\u0004\bX\u0010Y*\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Landroidx/datastore/core/DataStoreImpl;", "T", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", RuntimeVersion.SUFFIX, "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lk00/c;", "Lg00/b0;", RuntimeVersion.SUFFIX, "initTasksList", "Landroidx/datastore/core/CorruptionHandler;", "corruptionHandler", "La40/z;", "scope", "<init>", "(Landroidx/datastore/core/Storage;Ljava/util/List;Landroidx/datastore/core/CorruptionHandler;La40/z;)V", "transform", "updateData", "(Lu00/n;Lk00/c;)Ljava/lang/Object;", "newData", RuntimeVersion.SUFFIX, "updateCache", RuntimeVersion.SUFFIX, "writeData$datastore_core_release", "(Ljava/lang/Object;ZLk00/c;)Ljava/lang/Object;", "writeData", "incrementCollector", "(Lk00/c;)Ljava/lang/Object;", "decrementCollector", "requireLock", "Landroidx/datastore/core/State;", "readState", "(ZLk00/c;)Ljava/lang/Object;", "Landroidx/datastore/core/Message$Update;", "update", "handleUpdate", "(Landroidx/datastore/core/Message$Update;Lk00/c;)Ljava/lang/Object;", "readAndInitOrPropagateAndThrowFailure", "readDataAndUpdateCache", "readDataFromFileOrDefault", "Lk00/i;", "callerContext", "transformAndWrite", "(Lu00/n;Lk00/i;Lk00/c;)Ljava/lang/Object;", "hasWriteFileLock", "Landroidx/datastore/core/Data;", "readDataOrHandleCorruption", "R", "Lkotlin/Function1;", "block", "doWithWriteFileLock", "(ZLu00/k;Lk00/c;)Ljava/lang/Object;", "Landroidx/datastore/core/Storage;", "Landroidx/datastore/core/CorruptionHandler;", "La40/z;", "Ld40/i;", "data", "Ld40/i;", "getData", "()Ld40/i;", "Lj40/a;", "collectorMutex", "Lj40/a;", "collectorCounter", "I", "La40/e1;", "collectorJob", "La40/e1;", "Landroidx/datastore/core/DataStoreInMemoryCache;", "inMemoryCache", "Landroidx/datastore/core/DataStoreInMemoryCache;", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "readAndInit", "Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Lg00/h;", "Landroidx/datastore/core/StorageConnection;", "storageConnectionDelegate", "Lg00/h;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator$delegate", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Landroidx/datastore/core/SimpleActor;", "writeActor", "Landroidx/datastore/core/SimpleActor;", "getStorageConnection$datastore_core_release", "()Landroidx/datastore/core/StorageConnection;", "getStorageConnection$datastore_core_release$delegate", "(Landroidx/datastore/core/DataStoreImpl;)Ljava/lang/Object;", "storageConnection", "Companion", "InitDataStore", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    private int collectorCounter;
    private e1 collectorJob;
    private final j40.a collectorMutex;

    private final h coordinator;
    private final CorruptionHandler<T> corruptionHandler;
    private final i data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final z scope;
    private final Storage<T> storage;
    private final h storageConnectionDelegate;
    private final SimpleActor<Message.Update<T>> writeActor;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u0001B7\u0012.\u0010\b\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00030\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0094@¢\u0006\u0004\b\u000b\u0010\fR@\u0010\r\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/datastore/core/DataStoreImpl$InitDataStore;", "Landroidx/datastore/core/RunOnce;", RuntimeVersion.SUFFIX, "Lkotlin/Function2;", "Landroidx/datastore/core/InitializerApi;", "Lk00/c;", "Lg00/b0;", RuntimeVersion.SUFFIX, "initTasksList", "<init>", "(Landroidx/datastore/core/DataStoreImpl;Ljava/util/List;)V", "doRun", "(Lk00/c;)Ljava/lang/Object;", "initTasks", "Ljava/util/List;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class InitDataStore extends RunOnce {
        private List<? extends n> initTasks;
        final DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends n> list) {
            m.e(list, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = q.n1(list);
        }

        @Override
        public java.lang.Object doRun(k00.c<? super g00.b0> r7) throws androidx.datastore.core.CorruptionException {
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(k00.c):java.lang.Object");
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final DataStoreImpl<T> this$0;

        public AnonymousClass1(DataStoreImpl<T> dataStoreImpl, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.decrementCollector(this);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$doWithWriteFileLock$3", f = "DataStoreImpl.kt", l = {416}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends m00.i implements k {
        final k $block;
        int label;

        public AnonymousClass3(k kVar, k00.c<? super AnonymousClass3> cVar) {
            super(1, cVar);
            this.$block = kVar;
        }

        public final k00.c<b0> create(k00.c<?> cVar) {
            return new AnonymousClass3(this.$block, cVar);
        }

        public final Object invoke(k00.c<? super R> cVar) {
            return create(cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return obj;
            }
            t1.O(obj);
            k kVar = this.$block;
            this.label = 1;
            Object objInvoke = kVar.invoke(this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00011 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final DataStoreImpl<T> this$0;

        public C00011(DataStoreImpl<T> dataStoreImpl, k00.c<? super C00011> cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.handleUpdate(null, this);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00021 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final DataStoreImpl<T> this$0;

        public C00021(DataStoreImpl<T> dataStoreImpl, k00.c<? super C00021> cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.incrementCollector(this);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00031 extends c {
        int I$0;
        Object L$0;
        int label;
        Object result;
        final DataStoreImpl<T> this$0;

        public C00031(DataStoreImpl<T> dataStoreImpl, k00.c<? super C00031> cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readAndInitOrPropagateAndThrowFailure(this);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00041 extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        Object result;
        final DataStoreImpl<T> this$0;

        public C00041(DataStoreImpl<T> dataStoreImpl, k00.c<? super C00041> cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataAndUpdateCache(false, this);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$3", f = "DataStoreImpl.kt", l = {298, MediaError.DetailedErrorCode.NETWORK_UNKNOWN}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lg00/k;", "Landroidx/datastore/core/State;", RuntimeVersion.SUFFIX, "<anonymous>", "()Lg00/k;"}, k = 3, mv = {1, 8, 0})
    public static final class C00053 extends m00.i implements k {
        Object L$0;
        int label;
        final DataStoreImpl<T> this$0;

        public C00053(DataStoreImpl<T> dataStoreImpl, k00.c<? super C00053> cVar) {
            super(1, cVar);
            this.this$0 = dataStoreImpl;
        }

        public final k00.c<b0> create(k00.c<?> cVar) {
            return new C00053(this.this$0, cVar);
        }

        public final Object invoke(k00.c<? super g00.k> cVar) {
            return create(cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            Throwable th2;
            State readException;
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    t1.O(obj);
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th2 = (Throwable) this.L$0;
                        t1.O(obj);
                        readException = new ReadException(th2, ((Number) obj).intValue());
                        return new g00.k(readException, Boolean.TRUE);
                    }
                    t1.O(obj);
                }
                readException = (State) obj;
            } catch (Throwable th3) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th3;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != aVar) {
                    obj = version;
                    th2 = th3;
                }
                return aVar;
            }
            return new g00.k(readException, Boolean.TRUE);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {306, 309}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0004\u0012\u00020\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", RuntimeVersion.SUFFIX, "locked", "Lg00/k;", "Landroidx/datastore/core/State;", "<anonymous>", "(Z)Lg00/k;"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass4 extends m00.i implements n {
        final int $cachedVersion;
        Object L$0;
        boolean Z$0;
        int label;
        final DataStoreImpl<T> this$0;

        public AnonymousClass4(DataStoreImpl<T> dataStoreImpl, int i10, k00.c<? super AnonymousClass4> cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$cachedVersion = i10;
        }

        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, this.$cachedVersion, cVar);
            anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass4;
        }

        public Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (k00.c<? super g00.k>) obj2);
        }

        public final Object invoke(boolean z10, k00.c<? super g00.k> cVar) {
            return create(Boolean.valueOf(z10), cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            int iIntValue;
            Throwable th2;
            boolean z10;
            State readException;
            ?? r4;
            ?? r7;
            l00.a aVar = l00.a.A;
            ?? r10 = this.label;
            try {
                if (r10 == 0) {
                    t1.O(obj);
                    boolean z11 = this.Z$0;
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.Z$0 = z11;
                    this.label = 1;
                    obj = dataStoreImpl.readDataOrHandleCorruption(z11, this);
                    r10 = z11;
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (r10 != 1) {
                        if (r10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = this.Z$0;
                        th2 = (Throwable) this.L$0;
                        t1.O(obj);
                        iIntValue = ((Number) obj).intValue();
                        r7 = z10;
                        readException = new ReadException(th2, iIntValue);
                        r4 = r7;
                        return new g00.k(readException, Boolean.valueOf((boolean) r4));
                    }
                    boolean z12 = this.Z$0;
                    t1.O(obj);
                    r10 = z12;
                }
                readException = (State) obj;
                r4 = r10;
            } catch (Throwable th3) {
                if (r10 != 0) {
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = th3;
                    this.Z$0 = r10;
                    this.label = 2;
                    Object version = coordinator.getVersion(this);
                    if (version != aVar) {
                        obj = version;
                        th2 = th3;
                        z10 = r10 == true ? 1 : 0;
                    }
                    return aVar;
                }
                iIntValue = this.$cachedVersion;
                th2 = th3;
                r7 = r10;
            }
            return new g00.k(readException, Boolean.valueOf((boolean) r4));
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00061 extends c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        Object result;
        final DataStoreImpl<T> this$0;

        public C00061(DataStoreImpl<T> dataStoreImpl, k00.c<? super C00061> cVar) {
            super(cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readDataOrHandleCorruption(false, this);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T", "locked", RuntimeVersion.SUFFIX}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends m00.i implements n {
        final int $preLockVersion;
        Object L$0;
        boolean Z$0;
        int label;
        final DataStoreImpl<T> this$0;

        public AnonymousClass2(DataStoreImpl<T> dataStoreImpl, int i10, k00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$preLockVersion = i10;
        }

        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$preLockVersion, cVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (k00.c) obj2);
        }

        public final Object invoke(boolean z10, k00.c<? super Data<T>> cVar) {
            return create(Boolean.valueOf(z10), cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            int iIntValue;
            Object obj2;
            int iHashCode;
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 == 0) {
                t1.O(obj);
                z10 = this.Z$0;
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.Z$0 = z10;
                this.label = 1;
                obj = dataStoreImpl.readDataFromFileOrDefault(this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 == 1) {
                z10 = this.Z$0;
                t1.O(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$0;
                t1.O(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
            if (z10) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = obj;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version != aVar) {
                    Object obj3 = obj;
                    obj = version;
                    obj2 = obj3;
                    iIntValue = ((Number) obj).intValue();
                }
                return aVar;
            }
            Object obj4 = obj;
            iIntValue = this.$preLockVersion;
            obj2 = obj4;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new Data(obj2, iHashCode, iIntValue);
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lg00/b0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
    public static final class C00073 extends m00.i implements k {
        final kotlin.jvm.internal.z $newData;
        final x $version;
        Object L$0;
        int label;
        final DataStoreImpl<T> this$0;

        public C00073(kotlin.jvm.internal.z zVar, DataStoreImpl<T> dataStoreImpl, x xVar, k00.c<? super C00073> cVar) {
            super(1, cVar);
            this.$newData = zVar;
            this.this$0 = dataStoreImpl;
            this.$version = xVar;
        }

        public final k00.c<b0> create(k00.c<?> cVar) {
            return new C00073(this.$newData, this.this$0, this.$version, cVar);
        }

        public final Object invoke(k00.c<? super b0> cVar) {
            return create(cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            x xVar;
            kotlin.jvm.internal.z zVar;
            x xVar2;
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    t1.O(obj);
                    zVar = this.$newData;
                    DataStoreImpl<T> dataStoreImpl = this.this$0;
                    this.L$0 = zVar;
                    this.label = 1;
                    obj = dataStoreImpl.readDataFromFileOrDefault(this);
                    if (obj == aVar) {
                    }
                    return aVar;
                }
                if (i10 == 1) {
                    zVar = (kotlin.jvm.internal.z) this.L$0;
                    t1.O(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xVar = (x) this.L$0;
                        t1.O(obj);
                        xVar.A = ((Number) obj).intValue();
                        return b0.a;
                    }
                    xVar2 = (x) this.L$0;
                    t1.O(obj);
                }
                xVar2.A = ((Number) obj).intValue();
                return b0.a;
                zVar.A = obj;
                xVar2 = this.$version;
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = xVar2;
                this.label = 2;
                obj = coordinator.getVersion(this);
                if (obj == aVar) {
                    return aVar;
                }
                xVar2.A = ((Number) obj).intValue();
            } catch (CorruptionException unused) {
                x xVar3 = this.$version;
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                Object obj2 = this.$newData.A;
                this.L$0 = xVar3;
                this.label = 3;
                Object objWriteData$datastore_core_release = dataStoreImpl2.writeData$datastore_core_release((T) obj2, true, (k00.c<? super Integer>) this);
                if (objWriteData$datastore_core_release != aVar) {
                    obj = objWriteData$datastore_core_release;
                    xVar = xVar3;
                }
                return aVar;
            }
            return b0.a;
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "La40/z;", "Landroidx/datastore/core/State;", "<anonymous>", "(La40/z;)Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0})
    public static final class C00082 extends m00.i implements n {
        final boolean $requireLock;
        int label;
        final DataStoreImpl<T> this$0;

        public C00082(DataStoreImpl<T> dataStoreImpl, boolean z10, k00.c<? super C00082> cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$requireLock = z10;
        }

        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            return new C00082(this.this$0, this.$requireLock, cVar);
        }

        public final Object invoke(z zVar, k00.c<? super State<T>> cVar) {
            return create(zVar, cVar).invokeSuspend(b0.a);
        }

        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.C00082.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, MediaError.DetailedErrorCode.SMOOTH_NETWORK, 337}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00092 extends m00.i implements k {
        final k00.i $callerContext;
        final n $transform;
        Object L$0;
        int label;
        final DataStoreImpl<T> this$0;

        public C00092(DataStoreImpl<T> dataStoreImpl, k00.i iVar, n nVar, k00.c<? super C00092> cVar) {
            super(1, cVar);
            this.this$0 = dataStoreImpl;
            this.$callerContext = iVar;
            this.$transform = nVar;
        }

        public final k00.c<b0> create(k00.c<?> cVar) {
            return new C00092(this.this$0, this.$callerContext, this.$transform, cVar);
        }

        public final Object invoke(k00.c<? super T> cVar) {
            return create(cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) throws CorruptionException {
            Data data;
            DataStoreImpl<T> dataStoreImpl;
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 == 0) {
                t1.O(obj);
                DataStoreImpl<T> dataStoreImpl2 = this.this$0;
                this.label = 1;
                obj = dataStoreImpl2.readDataOrHandleCorruption(true, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i10 == 1) {
                t1.O(obj);
            } else {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj2 = this.L$0;
                    t1.O(obj);
                    return obj2;
                }
                data = (Data) this.L$0;
                t1.O(obj);
            }
            data.checkHashCode();
            if (!m.a(data.getValue(), obj)) {
                dataStoreImpl = this.this$0;
                this.L$0 = obj;
                this.label = 3;
                if (dataStoreImpl.writeData$datastore_core_release((T) obj, true, (k00.c<? super Integer>) this) == aVar) {
                    return aVar;
                }
            }
            return obj;
            data = (Data) obj;
            k00.i iVar = this.$callerContext;
            DataStoreImpl$transformAndWrite$2$newData$1 dataStoreImpl$transformAndWrite$2$newData$1 = new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, data, null);
            this.L$0 = data;
            this.label = 2;
            obj = c0.J(dataStoreImpl$transformAndWrite$2$newData$1, iVar, this);
            if (obj != aVar) {
                data.checkHashCode();
                if (!m.a(data.getValue(), obj)) {
                    dataStoreImpl = this.this$0;
                    this.L$0 = obj;
                    this.label = 3;
                    if (dataStoreImpl.writeData$datastore_core_release((T) obj, true, (k00.c<? super Integer>) this) == aVar) {
                    }
                }
                return obj;
            }
            return aVar;
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "La40/z;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class C00102 extends m00.i implements n {
        final n $transform;
        private Object L$0;
        int label;
        final DataStoreImpl<T> this$0;

        public C00102(DataStoreImpl<T> dataStoreImpl, n nVar, k00.c<? super C00102> cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
            this.$transform = nVar;
        }

        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            C00102 c00102 = new C00102(this.this$0, this.$transform, cVar);
            c00102.L$0 = obj;
            return c00102;
        }

        public final Object invoke(z zVar, k00.c<? super T> cVar) {
            return create(zVar, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return obj;
            }
            t1.O(obj);
            z zVar = (z) this.L$0;
            a40.q qVarB = c0.b();
            ((DataStoreImpl) this.this$0).writeActor.offer(new Message.Update(this.$transform, qVarB, ((DataStoreImpl) this.this$0).inMemoryCache.getCurrentState(), zVar.A()));
            this.label = 1;
            Object objP = qVarB.p(this);
            return objP == aVar ? aVar : objP;
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends n> list, CorruptionHandler<T> corruptionHandler, z zVar) {
        m.e(storage, "storage");
        m.e(list, "initTasksList");
        m.e(corruptionHandler, "corruptionHandler");
        m.e(zVar, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = zVar;
        this.data = new a2(new DataStoreImpl$data$1(this, null));
        this.collectorMutex = d.a();
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, list);
        this.storageConnectionDelegate = rd.a.J(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.coordinator = rd.a.J(new DataStoreImpl$coordinator$2(this));
        this.writeActor = new SimpleActor<>(zVar, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.INSTANCE, new DataStoreImpl$writeActor$3(this, null));
    }

    public DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, z zVar, int i10, f fVar) {
        list = (i10 & 2) != 0 ? h00.x.A : list;
        corruptionHandler = (i10 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler;
        if ((i10 & 8) != 0) {
            v vVarIoDispatcher = Actual_jvmKt.ioDispatcher();
            w1 w1VarE = c0.e();
            vVarIoDispatcher.getClass();
            zVar = c0.c(rd.a.P(vVarIoDispatcher, w1VarE));
        }
        this(storage, list, corruptionHandler, zVar);
    }

    public final Object decrementCollector(k00.c<? super b0> cVar) {
        AnonymousClass1 anonymousClass1;
        j40.a aVar;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object obj = anonymousClass1.result;
        l00.a aVar2 = l00.a.A;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t1.O(obj);
            aVar = this.collectorMutex;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = aVar;
            anonymousClass1.label = 1;
            if (aVar.l(anonymousClass1) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = (j40.a) anonymousClass1.L$1;
            DataStoreImpl<T> dataStoreImpl = (DataStoreImpl) anonymousClass1.L$0;
            t1.O(obj);
            aVar = aVar3;
            this = dataStoreImpl;
        }
        try {
            int i12 = this.collectorCounter - 1;
            this.collectorCounter = i12;
            if (i12 == 0) {
                e1 e1Var = this.collectorJob;
                if (e1Var != null) {
                    e1Var.i((CancellationException) null);
                }
                this.collectorJob = null;
            }
            return b0.a;
        } finally {
            aVar.i((Object) null);
        }
    }

    public final <R> Object doWithWriteFileLock(boolean z10, k kVar, k00.c<? super R> cVar) {
        return z10 ? kVar.invoke(cVar) : getCoordinator().lock(new AnonymousClass3(kVar, null), cVar);
    }

    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator.getValue();
    }

    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, k00.c<? super g00.b0> r10) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, k00.c):java.lang.Object");
    }

    public final Object incrementCollector(k00.c<? super b0> cVar) {
        C00021 c00021;
        j40.a aVar;
        if (cVar instanceof C00021) {
            c00021 = (C00021) cVar;
            int i10 = c00021.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00021.label = i10 - Integer.MIN_VALUE;
            } else {
                c00021 = new C00021(this, cVar);
            }
        } else {
            c00021 = new C00021(this, cVar);
        }
        Object obj = c00021.result;
        l00.a aVar2 = l00.a.A;
        int i11 = c00021.label;
        if (i11 == 0) {
            t1.O(obj);
            aVar = this.collectorMutex;
            c00021.L$0 = this;
            c00021.L$1 = aVar;
            c00021.label = 1;
            if (aVar.l(c00021) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j40.a aVar3 = (j40.a) c00021.L$1;
            DataStoreImpl<T> dataStoreImpl = (DataStoreImpl) c00021.L$0;
            t1.O(obj);
            aVar = aVar3;
            this = dataStoreImpl;
        }
        try {
            int i12 = this.collectorCounter + 1;
            this.collectorCounter = i12;
            if (i12 == 1) {
                this.collectorJob = c0.y(this.scope, (k00.i) null, (a0) null, new DataStoreImpl$incrementCollector$2$1(this, null), 3);
            }
            return b0.a;
        } finally {
            aVar.i((Object) null);
        }
    }

    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(k00.c<? super g00.b0> r7) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(k00.c):java.lang.Object");
    }

    public final Object readDataAndUpdateCache(boolean z10, k00.c<? super State<T>> cVar) {
        C00041 c00041;
        DataStoreImpl<T> dataStoreImpl;
        State<T> state;
        DataStoreImpl<T> dataStoreImpl2;
        g00.k kVar;
        State<T> state2;
        if (cVar instanceof C00041) {
            c00041 = (C00041) cVar;
            int i10 = c00041.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00041.label = i10 - Integer.MIN_VALUE;
            } else {
                c00041 = new C00041(this, cVar);
            }
        } else {
            c00041 = new C00041(this, cVar);
        }
        Object objTryLock = c00041.result;
        l00.a aVar = l00.a.A;
        int i11 = c00041.label;
        if (i11 == 0) {
            t1.O(objTryLock);
            State<T> currentState = this.inMemoryCache.getCurrentState();
            if (currentState instanceof UnInitialized) {
                throw new IllegalStateException(BUG_MESSAGE);
            }
            InterProcessCoordinator coordinator = getCoordinator();
            c00041.L$0 = this;
            c00041.L$1 = currentState;
            c00041.Z$0 = z10;
            c00041.label = 1;
            Object version = coordinator.getVersion(c00041);
            if (version != aVar) {
                dataStoreImpl = this;
                state = currentState;
                objTryLock = version;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                dataStoreImpl2 = (DataStoreImpl) c00041.L$0;
                t1.O(objTryLock);
                kVar = (g00.k) objTryLock;
                state2 = (State) kVar.A;
                if (((Boolean) kVar.B).booleanValue()) {
                    dataStoreImpl2.inMemoryCache.tryUpdate(state2);
                }
                return state2;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dataStoreImpl2 = (DataStoreImpl) c00041.L$0;
            t1.O(objTryLock);
            kVar = (g00.k) objTryLock;
            state2 = (State) kVar.A;
            if (((Boolean) kVar.B).booleanValue()) {
                dataStoreImpl2.inMemoryCache.tryUpdate(state2);
            }
            return state2;
        }
        z10 = c00041.Z$0;
        state = (State) c00041.L$1;
        dataStoreImpl = (DataStoreImpl) c00041.L$0;
        t1.O(objTryLock);
        int iIntValue = ((Number) objTryLock).intValue();
        boolean z11 = state instanceof Data;
        int version2 = z11 ? state.getVersion() : -1;
        if (z11 && iIntValue == version2) {
            return state;
        }
        if (z10) {
            InterProcessCoordinator coordinator2 = dataStoreImpl.getCoordinator();
            C00053 c00053 = new C00053(dataStoreImpl, null);
            c00041.L$0 = dataStoreImpl;
            c00041.L$1 = null;
            c00041.label = 2;
            objTryLock = coordinator2.lock(c00053, c00041);
            if (objTryLock != aVar) {
                dataStoreImpl2 = dataStoreImpl;
                kVar = (g00.k) objTryLock;
                state2 = (State) kVar.A;
                if (((Boolean) kVar.B).booleanValue()) {
                    dataStoreImpl2.inMemoryCache.tryUpdate(state2);
                }
                return state2;
            }
        } else {
            InterProcessCoordinator coordinator3 = dataStoreImpl.getCoordinator();
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(dataStoreImpl, version2, null);
            c00041.L$0 = dataStoreImpl;
            c00041.L$1 = null;
            c00041.label = 3;
            objTryLock = coordinator3.tryLock(anonymousClass4, c00041);
            if (objTryLock != aVar) {
                dataStoreImpl2 = dataStoreImpl;
                kVar = (g00.k) objTryLock;
                state2 = (State) kVar.A;
                if (((Boolean) kVar.B).booleanValue()) {
                    dataStoreImpl2.inMemoryCache.tryUpdate(state2);
                }
                return state2;
            }
        }
        return aVar;
    }

    public final Object readDataFromFileOrDefault(k00.c<? super T> cVar) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), cVar);
    }

    public final Object readDataOrHandleCorruption(boolean z10, k00.c<? super Data<T>> cVar) throws CorruptionException {
        C00061 c00061;
        kotlin.jvm.internal.z zVar;
        CorruptionException corruptionException;
        DataStoreImpl<T> dataStoreImpl;
        boolean z11;
        kotlin.jvm.internal.z zVar2;
        x xVar;
        CorruptionException corruptionException2;
        C00073 c00073;
        x xVar2;
        kotlin.jvm.internal.z zVar3;
        int iHashCode;
        Object version;
        DataStoreImpl<T> dataStoreImpl2;
        int i10;
        Object obj;
        if (cVar instanceof C00061) {
            c00061 = (C00061) cVar;
            int i11 = c00061.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c00061.label = i11 - Integer.MIN_VALUE;
            } else {
                c00061 = new C00061(this, cVar);
            }
        } else {
            c00061 = new C00061(this, cVar);
        }
        Object version2 = c00061.result;
        l00.a aVar = l00.a.A;
        try {
            switch (c00061.label) {
                case 0:
                    t1.O(version2);
                    if (z10) {
                        c00061.L$0 = this;
                        c00061.Z$0 = z10;
                        c00061.label = 1;
                        version2 = readDataFromFileOrDefault(c00061);
                        if (version2 != aVar) {
                            if (version2 != null) {
                                iHashCode = version2.hashCode();
                            } else {
                                iHashCode = 0;
                            }
                            InterProcessCoordinator coordinator = this.getCoordinator();
                            c00061.L$0 = this;
                            c00061.L$1 = version2;
                            c00061.Z$0 = z10;
                            c00061.I$0 = iHashCode;
                            c00061.label = 2;
                            version = coordinator.getVersion(c00061);
                            if (version != aVar) {
                                dataStoreImpl2 = this;
                                i10 = iHashCode;
                                obj = version2;
                                version2 = version;
                                return new Data(obj, i10, ((Number) version2).intValue());
                            }
                        }
                    } else {
                        InterProcessCoordinator coordinator2 = getCoordinator();
                        c00061.L$0 = this;
                        c00061.Z$0 = z10;
                        c00061.label = 3;
                        version2 = coordinator2.getVersion(c00061);
                        if (version2 != aVar) {
                            int iIntValue = ((Number) version2).intValue();
                            InterProcessCoordinator coordinator3 = this.getCoordinator();
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this, iIntValue, null);
                            c00061.L$0 = this;
                            c00061.Z$0 = z10;
                            c00061.label = 4;
                            version2 = coordinator3.tryLock(anonymousClass2, c00061);
                            if (version2 == aVar) {
                            }
                            return (Data) version2;
                        }
                    }
                    return aVar;
                case 1:
                    z10 = c00061.Z$0;
                    this = (DataStoreImpl) c00061.L$0;
                    t1.O(version2);
                    if (version2 != null) {
                        iHashCode = version2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator4 = this.getCoordinator();
                    c00061.L$0 = this;
                    c00061.L$1 = version2;
                    c00061.Z$0 = z10;
                    c00061.I$0 = iHashCode;
                    c00061.label = 2;
                    version = coordinator4.getVersion(c00061);
                    if (version != aVar) {
                        dataStoreImpl2 = this;
                        i10 = iHashCode;
                        obj = version2;
                        version2 = version;
                        return new Data(obj, i10, ((Number) version2).intValue());
                    }
                    return aVar;
                case 2:
                    i10 = c00061.I$0;
                    z10 = c00061.Z$0;
                    obj = c00061.L$1;
                    dataStoreImpl2 = (DataStoreImpl) c00061.L$0;
                    try {
                        t1.O(version2);
                        return new Data(obj, i10, ((Number) version2).intValue());
                    } catch (CorruptionException e3) {
                        e = e3;
                        this = dataStoreImpl2;
                        zVar = new kotlin.jvm.internal.z();
                        CorruptionHandler<T> corruptionHandler = this.corruptionHandler;
                        c00061.L$0 = this;
                        c00061.L$1 = e;
                        c00061.L$2 = zVar;
                        c00061.L$3 = zVar;
                        c00061.Z$0 = z10;
                        c00061.label = 5;
                        Object objHandleCorruption = corruptionHandler.handleCorruption(e, c00061);
                        if (objHandleCorruption != aVar) {
                            corruptionException = e;
                            version2 = objHandleCorruption;
                            dataStoreImpl = this;
                            z11 = z10;
                            zVar2 = zVar;
                            zVar2.A = version2;
                            xVar = new x();
                            try {
                                c00073 = new C00073(zVar, dataStoreImpl, xVar, null);
                                c00061.L$0 = corruptionException;
                                c00061.L$1 = zVar;
                                c00061.L$2 = xVar;
                                c00061.L$3 = null;
                                c00061.label = 6;
                                if (dataStoreImpl.doWithWriteFileLock(z11, c00073, c00061) != aVar) {
                                    xVar2 = xVar;
                                    zVar3 = zVar;
                                    Object obj2 = zVar3.A;
                                    return new Data(obj2, obj2 != null ? obj2.hashCode() : 0, xVar2.A);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                corruptionException2 = corruptionException;
                                s0.V(corruptionException2, th);
                                throw corruptionException2;
                            }
                        }
                        return aVar;
                    }
                case 3:
                    z10 = c00061.Z$0;
                    this = (DataStoreImpl) c00061.L$0;
                    t1.O(version2);
                    int iIntValue2 = ((Number) version2).intValue();
                    InterProcessCoordinator coordinator5 = this.getCoordinator();
                    AnonymousClass2 anonymousClass3 = new AnonymousClass2(this, iIntValue2, null);
                    c00061.L$0 = this;
                    c00061.Z$0 = z10;
                    c00061.label = 4;
                    version2 = coordinator5.tryLock(anonymousClass3, c00061);
                    if (version2 == aVar) {
                        return aVar;
                    }
                    return (Data) version2;
                case 4:
                    boolean z12 = c00061.Z$0;
                    t1.O(version2);
                    return (Data) version2;
                case 5:
                    z11 = c00061.Z$0;
                    zVar2 = (kotlin.jvm.internal.z) c00061.L$3;
                    zVar = (kotlin.jvm.internal.z) c00061.L$2;
                    corruptionException = (CorruptionException) c00061.L$1;
                    dataStoreImpl = (DataStoreImpl) c00061.L$0;
                    t1.O(version2);
                    zVar2.A = version2;
                    xVar = new x();
                    c00073 = new C00073(zVar, dataStoreImpl, xVar, null);
                    c00061.L$0 = corruptionException;
                    c00061.L$1 = zVar;
                    c00061.L$2 = xVar;
                    c00061.L$3 = null;
                    c00061.label = 6;
                    if (dataStoreImpl.doWithWriteFileLock(z11, c00073, c00061) != aVar) {
                        xVar2 = xVar;
                        zVar3 = zVar;
                        Object obj3 = zVar3.A;
                        return new Data(obj3, obj3 != null ? obj3.hashCode() : 0, xVar2.A);
                    }
                    return aVar;
                case 6:
                    xVar2 = (x) c00061.L$2;
                    zVar3 = (kotlin.jvm.internal.z) c00061.L$1;
                    corruptionException2 = (CorruptionException) c00061.L$0;
                    try {
                        t1.O(version2);
                        Object obj4 = zVar3.A;
                        return new Data(obj4, obj4 != null ? obj4.hashCode() : 0, xVar2.A);
                    } catch (Throwable th3) {
                        th = th3;
                        s0.V(corruptionException2, th);
                        throw corruptionException2;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CorruptionException e10) {
            e = e10;
        }
    }

    public final Object readState(boolean z10, k00.c<? super State<T>> cVar) {
        return c0.J(new C00082(this, z10, null), this.scope.A(), cVar);
    }

    public final Object transformAndWrite(n nVar, k00.i iVar, k00.c<? super T> cVar) {
        return getCoordinator().lock(new C00092(this, iVar, nVar, null), cVar);
    }

    @Override
    public i getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override
    public Object updateData(n nVar, k00.c<? super T> cVar) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) cVar.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return c0.J(new C00102(this, nVar, null), new UpdatingDataContextElement(updatingDataContextElement, this), cVar);
    }

    public final Object writeData$datastore_core_release(T t4, boolean z10, k00.c<? super Integer> cVar) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        x xVar;
        if (cVar instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) cVar;
            int i10 = dataStoreImpl$writeData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$writeData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, cVar);
            }
        } else {
            dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, cVar);
        }
        Object obj = dataStoreImpl$writeData$1.result;
        l00.a aVar = l00.a.A;
        int i11 = dataStoreImpl$writeData$1.label;
        if (i11 == 0) {
            t1.O(obj);
            x xVar2 = new x();
            StorageConnection<T> storageConnection$datastore_core_release = getStorageConnection$datastore_core_release();
            DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(xVar2, this, t4, z10, null);
            dataStoreImpl$writeData$1.L$0 = xVar2;
            dataStoreImpl$writeData$1.label = 1;
            if (storageConnection$datastore_core_release.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == aVar) {
                return aVar;
            }
            xVar = xVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xVar = (x) dataStoreImpl$writeData$1.L$0;
            t1.O(obj);
        }
        return new Integer(xVar.A);
    }
}
