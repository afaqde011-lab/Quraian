package androidx.datastore.core;

import a40.c0;
import a40.m0;
import a40.v;
import a40.w1;
import a40.z;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import com.google.protobuf.RuntimeVersion;
import h00.x;
import h40.d;
import h40.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ji\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J[\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00142\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/datastore/core/DataStoreFactory;", RuntimeVersion.SUFFIX, "<init>", "()V", "T", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;", "corruptionHandler", RuntimeVersion.SUFFIX, "Landroidx/datastore/core/DataMigration;", "migrations", "La40/z;", "scope", "Lkotlin/Function0;", "Ljava/io/File;", "produceFile", "Landroidx/datastore/core/DataStore;", "create", "(Landroidx/datastore/core/Serializer;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;La40/z;Lu00/a;)Landroidx/datastore/core/DataStore;", "Landroidx/datastore/core/Storage;", "storage", "(Landroidx/datastore/core/Storage;Landroidx/datastore/core/handlers/ReplaceFileCorruptionHandler;Ljava/util/List;La40/z;)Landroidx/datastore/core/DataStore;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, z zVar, u00.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = replaceFileCorruptionHandler;
        if ((i10 & 4) != 0) {
            list = x.A;
        }
        List list2 = list;
        if ((i10 & 8) != 0) {
            e eVar = m0.a;
            d dVar = d.C;
            w1 w1VarE = c0.e();
            dVar.getClass();
            zVar = c0.c(rd.a.P(dVar, w1VarE));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, zVar, aVar);
    }

    public static DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, z zVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i10 & 4) != 0) {
            list = x.A;
        }
        if ((i10 & 8) != 0) {
            v vVarIoDispatcher = Actual_jvmKt.ioDispatcher();
            w1 w1VarE = c0.e();
            vVarIoDispatcher.getClass();
            zVar = c0.c(rd.a.P(vVarIoDispatcher, w1VarE));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, zVar);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> corruptionHandler, List<? extends DataMigration<T>> migrations, z scope, u00.a produceFile) {
        m.e(serializer, "serializer");
        m.e(migrations, "migrations");
        m.e(scope, "scope");
        m.e(produceFile, "produceFile");
        return create(new FileStorage(serializer, null, produceFile, 2, null), corruptionHandler, migrations, scope);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list, u00.a aVar) {
        m.e(serializer, "serializer");
        m.e(list, "migrations");
        m.e(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, list, null, aVar, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, u00.a aVar) {
        m.e(serializer, "serializer");
        m.e(aVar, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, aVar, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, u00.a aVar) {
        m.e(serializer, "serializer");
        m.e(aVar, "produceFile");
        return create$default(this, serializer, null, null, null, aVar, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        m.e(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        m.e(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> list) {
        m.e(storage, "storage");
        m.e(list, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, list, null, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> corruptionHandler, List<? extends DataMigration<T>> migrations, z scope) {
        m.e(storage, "storage");
        m.e(migrations, "migrations");
        m.e(scope, "scope");
        if (corruptionHandler == null) {
            corruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, va.a.R(DataMigrationInitializer.INSTANCE.getInitializer(migrations)), corruptionHandler, scope);
    }
}
