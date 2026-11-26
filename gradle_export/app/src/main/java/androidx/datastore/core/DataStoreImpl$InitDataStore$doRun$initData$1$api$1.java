package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.z;
import ri.t1;
import u00.n;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J4\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/datastore/core/DataStoreImpl$InitDataStore$doRun$initData$1$api$1", "Landroidx/datastore/core/InitializerApi;", "Lkotlin/Function2;", "Lk00/c;", RuntimeVersion.SUFFIX, "transform", "updateData", "(Lu00/n;Lk00/c;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1<T> implements InitializerApi<T> {
    final z $currentData;
    final v $initializationComplete;
    final j40.a $updateLock;
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(j40.a aVar, v vVar, z zVar, DataStoreImpl<T> dataStoreImpl) {
        this.$updateLock = aVar;
        this.$initializationComplete = vVar;
        this.$currentData = zVar;
        this.this$0 = dataStoreImpl;
    }

    @Override
    public Object updateData(n nVar, c<? super T> cVar) throws Throwable {
        c<? super Integer> dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        j40.a aVar;
        v vVar;
        z zVar;
        DataStoreImpl dataStoreImpl;
        j40.a aVar2;
        j40.a aVar3;
        z zVar2;
        DataStoreImpl dataStoreImpl2;
        Object obj;
        if (cVar instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) cVar;
            int i10 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i10 - Integer.MIN_VALUE;
            } else {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, cVar);
            }
        } else {
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, cVar);
        }
        Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        Object obj3 = l00.a.A;
        int i11 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        try {
            if (i11 == 0) {
                t1.O(obj2);
                aVar = this.$updateLock;
                vVar = this.$initializationComplete;
                zVar = this.$currentData;
                DataStoreImpl dataStoreImpl3 = (DataStoreImpl<T>) this.this$0;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = nVar;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = aVar;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = vVar;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = zVar;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl3;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                dataStoreImpl = dataStoreImpl3;
                if (aVar.l(dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                }
                return obj3;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                    zVar2 = (z) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                    aVar2 = (j40.a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                    try {
                        t1.O(obj2);
                        zVar2.A = obj;
                        Object obj4 = zVar2.A;
                        aVar2.i((Object) null);
                        return obj4;
                    } catch (Throwable th2) {
                        th = th2;
                        aVar2.i((Object) null);
                        throw th;
                    }
                }
                DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                zVar2 = (z) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                aVar3 = (j40.a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                try {
                    t1.O(obj2);
                    dataStoreImpl2 = dataStoreImpl4;
                    if (!m.a(obj2, zVar2.A)) {
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = aVar3;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = zVar2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                        if (dataStoreImpl2.writeData$datastore_core_release(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                            obj = obj2;
                            aVar2 = aVar3;
                            zVar2.A = obj;
                        }
                        return obj3;
                    }
                    aVar2 = aVar3;
                    Object obj5 = zVar2.A;
                    aVar2.i((Object) null);
                    return obj5;
                } catch (Throwable th3) {
                    th = th3;
                    aVar2 = aVar3;
                    aVar2.i((Object) null);
                    throw th;
                }
            }
            DataStoreImpl dataStoreImpl5 = (DataStoreImpl<T>) ((DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4);
            z zVar3 = (z) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
            vVar = (v) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
            j40.a aVar4 = (j40.a) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
            n nVar2 = (n) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
            t1.O(obj2);
            zVar = zVar3;
            nVar = nVar2;
            aVar = aVar4;
            dataStoreImpl = dataStoreImpl5;
            if (vVar.A) {
                throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
            }
            Object obj6 = zVar.A;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = aVar;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = zVar;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
            Object objInvoke = nVar.invoke(obj6, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
            if (objInvoke != obj3) {
                aVar3 = aVar;
                obj2 = objInvoke;
                zVar2 = zVar;
                dataStoreImpl2 = dataStoreImpl;
                if (!m.a(obj2, zVar2.A)) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = aVar3;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = zVar2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                    if (dataStoreImpl2.writeData$datastore_core_release(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != obj3) {
                        obj = obj2;
                        aVar2 = aVar3;
                        zVar2.A = obj;
                    }
                } else {
                    aVar2 = aVar3;
                }
                Object obj7 = zVar2.A;
                aVar2.i((Object) null);
                return obj7;
            }
            return obj3;
        } catch (Throwable th4) {
            th = th4;
            aVar2 = aVar;
            aVar2.i((Object) null);
            throw th;
        }
    }
}
