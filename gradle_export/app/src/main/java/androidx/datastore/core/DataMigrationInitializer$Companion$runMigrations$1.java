package androidx.datastore.core;

import kotlin.Metadata;
import m00.c;
import m00.e;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer$Companion$runMigrations$1<T> extends c {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final DataMigrationInitializer.Companion this$0;

    public DataMigrationInitializer$Companion$runMigrations$1(DataMigrationInitializer.Companion companion, k00.c<? super DataMigrationInitializer$Companion$runMigrations$1> cVar) {
        super(cVar);
        this.this$0 = companion;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.runMigrations(null, null, this);
    }
}
