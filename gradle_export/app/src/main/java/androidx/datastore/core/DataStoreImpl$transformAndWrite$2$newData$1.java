package androidx.datastore.core;

import a40.z;
import com.google.android.gms.cast.MediaError;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {MediaError.DetailedErrorCode.SMOOTH_NETWORK}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "La40/z;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$transformAndWrite$2$newData$1 extends i implements n {
    final Data<T> $curData;
    final n $transform;
    int label;

    public DataStoreImpl$transformAndWrite$2$newData$1(n nVar, Data<T> data, c<? super DataStoreImpl$transformAndWrite$2$newData$1> cVar) {
        super(2, cVar);
        this.$transform = nVar;
        this.$curData = data;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, cVar);
    }

    public final Object invoke(z zVar, c<? super T> cVar) {
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
        n nVar = this.$transform;
        Object value = this.$curData.getValue();
        this.label = 1;
        Object objInvoke = nVar.invoke(value, this);
        return objInvoke == aVar ? aVar : objInvoke;
    }
}
