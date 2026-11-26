package androidx.datastore.core;

import g00.b0;
import j40.d;
import java.util.Iterator;
import java.util.List;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.z;
import m00.e;
import m00.i;
import ri.t1;
import u00.k;
import u00.n;

@e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1", f = "DataStoreImpl.kt", l = {437, 458, 546, 468}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/Data;", "T"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$InitDataStore$doRun$initData$1 extends i implements k {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final DataStoreImpl<T> this$0;
    final DataStoreImpl<T>.InitDataStore this$1;

    public DataStoreImpl$InitDataStore$doRun$initData$1(DataStoreImpl<T> dataStoreImpl, DataStoreImpl<T>.InitDataStore initDataStore, c<? super DataStoreImpl$InitDataStore$doRun$initData$1> cVar) {
        super(1, cVar);
        this.this$0 = dataStoreImpl;
        this.this$1 = initDataStore;
    }

    public final c<b0> create(c<?> cVar) {
        return new DataStoreImpl$InitDataStore$doRun$initData$1(this.this$0, this.this$1, cVar);
    }

    public final Object invoke(c<? super Data<T>> cVar) {
        return create(cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) throws CorruptionException {
        j40.a aVarA;
        v vVar;
        z zVar;
        z zVar2;
        v vVar2;
        j40.a aVar;
        Iterator it;
        j40.a aVar2;
        v vVar3;
        z zVar3;
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
        z zVar4;
        n nVar;
        Object obj2;
        int iHashCode;
        Object version;
        Object obj3;
        int i10;
        l00.a aVar3 = l00.a.A;
        int i11 = this.label;
        if (i11 == 0) {
            t1.O(obj);
            aVarA = d.a();
            vVar = new v();
            zVar = new z();
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = aVarA;
            this.L$1 = vVar;
            this.L$2 = zVar;
            this.L$3 = zVar;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(true, this);
            if (obj != aVar3) {
                zVar2 = zVar;
            }
            return aVar3;
        }
        if (i11 == 1) {
            zVar = (z) this.L$3;
            zVar2 = (z) this.L$2;
            vVar = (v) this.L$1;
            aVarA = (j40.a) this.L$0;
            t1.O(obj);
        } else {
            if (i11 == 2) {
                it = (Iterator) this.L$4;
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1) this.L$3;
                zVar3 = (z) this.L$2;
                vVar3 = (v) this.L$1;
                aVar2 = (j40.a) this.L$0;
                t1.O(obj);
                while (it.hasNext()) {
                    nVar = (n) it.next();
                    this.L$0 = aVar2;
                    this.L$1 = vVar3;
                    this.L$2 = zVar3;
                    this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                    this.L$4 = it;
                    this.label = 2;
                    if (nVar.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == aVar3) {
                        return aVar3;
                    }
                }
                zVar2 = zVar3;
                vVar2 = vVar3;
                aVar = aVar2;
                ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
                this.L$0 = vVar2;
                this.L$1 = zVar2;
                this.L$2 = aVar;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 3;
                if (aVar.l(this) != aVar3) {
                    zVar4 = zVar2;
                    vVar2.A = true;
                    aVar.i((Object) null);
                    obj2 = zVar4.A;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = coordinator.getVersion(this);
                    if (version != aVar3) {
                        obj = version;
                        obj3 = obj2;
                        i10 = iHashCode;
                    }
                }
                return aVar3;
            }
            if (i11 == 3) {
                aVar = (j40.a) this.L$2;
                zVar4 = (z) this.L$1;
                vVar2 = (v) this.L$0;
                t1.O(obj);
                try {
                    vVar2.A = true;
                    aVar.i((Object) null);
                    obj2 = zVar4.A;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    InterProcessCoordinator coordinator2 = this.this$0.getCoordinator();
                    this.L$0 = obj2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.I$0 = iHashCode;
                    this.label = 4;
                    version = coordinator2.getVersion(this);
                    if (version != aVar3) {
                        obj = version;
                        obj3 = obj2;
                        i10 = iHashCode;
                    }
                    return aVar3;
                } catch (Throwable th2) {
                    aVar.i((Object) null);
                    throw th2;
                }
            }
            if (i11 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.I$0;
            obj3 = this.L$0;
            t1.O(obj);
        }
        return new Data(obj3, i10, ((Number) obj).intValue());
        zVar.A = ((Data) obj).getValue();
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$2 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1(aVarA, vVar, zVar2, this.this$0);
        List list = ((DataStoreImpl.InitDataStore) this.this$1).initTasks;
        if (list != null) {
            it = list.iterator();
            aVar2 = aVarA;
            vVar3 = vVar;
            zVar3 = zVar2;
            dataStoreImpl$InitDataStore$doRun$initData$1$api$1 = dataStoreImpl$InitDataStore$doRun$initData$1$api$2;
            while (it.hasNext()) {
                nVar = (n) it.next();
                this.L$0 = aVar2;
                this.L$1 = vVar3;
                this.L$2 = zVar3;
                this.L$3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1;
                this.L$4 = it;
                this.label = 2;
                if (nVar.invoke(dataStoreImpl$InitDataStore$doRun$initData$1$api$1, this) == aVar3) {
                    return aVar3;
                }
            }
            zVar2 = zVar3;
            vVar2 = vVar3;
            aVar = aVar2;
        } else {
            vVar2 = vVar;
            aVar = aVarA;
        }
        ((DataStoreImpl.InitDataStore) this.this$1).initTasks = null;
        this.L$0 = vVar2;
        this.L$1 = zVar2;
        this.L$2 = aVar;
        this.L$3 = null;
        this.L$4 = null;
        this.label = 3;
        if (aVar.l(this) != aVar3) {
            zVar4 = zVar2;
            vVar2.A = true;
            aVar.i((Object) null);
            obj2 = zVar4.A;
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            InterProcessCoordinator coordinator3 = this.this$0.getCoordinator();
            this.L$0 = obj2;
            this.L$1 = null;
            this.L$2 = null;
            this.I$0 = iHashCode;
            this.label = 4;
            version = coordinator3.getVersion(this);
            if (version != aVar3) {
                obj = version;
                obj3 = obj2;
                i10 = iHashCode;
                return new Data(obj3, i10, ((Number) obj).intValue());
            }
        }
        return aVar3;
    }
}
