package androidx.datastore.core;

import g00.b0;
import java.util.List;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import u00.k;
import u00.n;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\u008a@"}, d2 = {"<anonymous>", "T", "startingData"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer$Companion$runMigrations$2 extends i implements n {
    final List<k> $cleanUps;
    final List<DataMigration<T>> $migrations;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    public DataMigrationInitializer$Companion$runMigrations$2(List<? extends DataMigration<T>> list, List<k> list2, c<? super DataMigrationInitializer$Companion$runMigrations$2> cVar) {
        super(2, cVar);
        this.$migrations = list;
        this.$cleanUps = list2;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(this.$migrations, this.$cleanUps, cVar);
        dataMigrationInitializer$Companion$runMigrations$2.L$0 = obj;
        return dataMigrationInitializer$Companion$runMigrations$2;
    }

    public final Object invoke(T t4, c<? super T> cVar) {
        return create(t4, cVar).invokeSuspend(b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
