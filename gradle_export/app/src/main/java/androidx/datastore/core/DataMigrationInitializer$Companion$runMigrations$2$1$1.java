package androidx.datastore.core;

import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.k;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lg00/b0;", "<anonymous>", "()V"}, k = 3, mv = {1, 8, 0})
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends i implements k {
    final DataMigration<T> $migration;
    int label;

    public DataMigrationInitializer$Companion$runMigrations$2$1$1(DataMigration<T> dataMigration, c<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> cVar) {
        super(1, cVar);
        this.$migration = dataMigration;
    }

    public final c<b0> create(c<?> cVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, cVar);
    }

    public final Object invoke(c<? super b0> cVar) {
        return create(cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.label;
        if (i10 == 0) {
            t1.O(obj);
            DataMigration<T> dataMigration = this.$migration;
            this.label = 1;
            if (dataMigration.cleanUp((c<? super b0>) this) == aVar) {
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
