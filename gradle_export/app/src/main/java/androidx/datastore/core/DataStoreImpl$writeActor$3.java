package androidx.datastore.core;

import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "androidx.datastore.core.DataStoreImpl$writeActor$3", f = "DataStoreImpl.kt", l = {207}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/Message$Update;", "msg", "Lg00/b0;", "<anonymous>", "(Landroidx/datastore/core/Message$Update;)V"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$writeActor$3 extends i implements n {
    Object L$0;
    int label;
    final DataStoreImpl<T> this$0;

    public DataStoreImpl$writeActor$3(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$writeActor$3> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        DataStoreImpl$writeActor$3 dataStoreImpl$writeActor$3 = new DataStoreImpl$writeActor$3(this.this$0, cVar);
        dataStoreImpl$writeActor$3.L$0 = obj;
        return dataStoreImpl$writeActor$3;
    }

    public final Object invoke(Message.Update<T> update, c<? super b0> cVar) {
        return create(update, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.label;
        if (i10 == 0) {
            t1.O(obj);
            Message.Update update = (Message.Update) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.label = 1;
            if (dataStoreImpl.handleUpdate(update, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return b0.a;
    }
}
