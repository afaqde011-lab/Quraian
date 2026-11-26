package androidx.datastore.core;

import g00.b0;
import java.util.List;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/datastore/core/InitializerApi;", "api", "Lg00/b0;", "<anonymous>", "(Landroidx/datastore/core/InitializerApi;)V"}, k = 3, mv = {1, 8, 0})
public final class DataMigrationInitializer$Companion$getInitializer$1 extends i implements n {
    final List<DataMigration<T>> $migrations;
    Object L$0;
    int label;

    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends DataMigration<T>> list, c<? super DataMigrationInitializer$Companion$getInitializer$1> cVar) {
        super(2, cVar);
        this.$migrations = list;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, cVar);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    public final Object invoke(InitializerApi<T> initializerApi, c<? super b0> cVar) {
        return create(initializerApi, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.label;
        if (i10 == 0) {
            t1.O(obj);
            InitializerApi initializerApi = (InitializerApi) this.L$0;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.INSTANCE;
            List<DataMigration<T>> list = this.$migrations;
            this.label = 1;
            if (companion.runMigrations(list, initializerApi, this) == aVar) {
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
