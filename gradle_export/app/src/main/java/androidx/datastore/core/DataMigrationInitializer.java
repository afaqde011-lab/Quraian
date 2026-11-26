package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import g00.b0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import qd.s0;
import ri.t1;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0004B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer;", "T", RuntimeVersion.SUFFIX, "()V", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DataMigrationInitializer<T> {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJI\u0010\u000f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\"\u0004\b\u0001\u0010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00060\u0005¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/datastore/core/DataMigrationInitializer$Companion;", RuntimeVersion.SUFFIX, "<init>", "()V", "T", RuntimeVersion.SUFFIX, "Landroidx/datastore/core/DataMigration;", "migrations", "Landroidx/datastore/core/InitializerApi;", "api", "Lg00/b0;", "runMigrations", "(Ljava/util/List;Landroidx/datastore/core/InitializerApi;Lk00/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lk00/c;", "getInitializer", "(Ljava/util/List;)Lu00/n;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final <T> Object runMigrations(List<? extends DataMigration<T>> list, InitializerApi<T> initializerApi, c<? super b0> cVar) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Iterator<T> it;
            z zVar;
            Throwable th2;
            k kVar;
            if (cVar instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) cVar;
                int i10 = dataMigrationInitializer$Companion$runMigrations$1.label;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.label = i10 - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, cVar);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(this, cVar);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
            l00.a aVar = l00.a.A;
            int i11 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if (i11 == 0) {
                t1.O(obj);
                ArrayList arrayList = new ArrayList();
                DataMigrationInitializer$Companion$runMigrations$2 dataMigrationInitializer$Companion$runMigrations$2 = new DataMigrationInitializer$Companion$runMigrations$2(list, arrayList, null);
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                if (initializerApi.updateData(dataMigrationInitializer$Companion$runMigrations$2, dataMigrationInitializer$Companion$runMigrations$1) != aVar) {
                    list2 = arrayList;
                }
                return aVar;
            }
            if (i11 == 1) {
                list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                t1.O(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) dataMigrationInitializer$Companion$runMigrations$1.L$1;
                zVar = (z) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                try {
                    t1.O(obj);
                } catch (Throwable th3) {
                    Object obj2 = zVar.A;
                    if (obj2 == null) {
                        zVar.A = th3;
                    } else {
                        m.b(obj2);
                        s0.V((Throwable) obj2, th3);
                    }
                }
            }
            while (it.hasNext()) {
                kVar = (k) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = zVar;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (kVar.invoke(dataMigrationInitializer$Companion$runMigrations$1) == aVar) {
                    return aVar;
                }
            }
            th2 = (Throwable) zVar.A;
            if (th2 == null) {
                return b0.a;
            }
            throw th2;
            z zVar2 = new z();
            it = list2.iterator();
            zVar = zVar2;
            while (it.hasNext()) {
                kVar = (k) it.next();
                dataMigrationInitializer$Companion$runMigrations$1.L$0 = zVar;
                dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                if (kVar.invoke(dataMigrationInitializer$Companion$runMigrations$1) == aVar) {
                    return aVar;
                }
            }
            th2 = (Throwable) zVar.A;
            if (th2 == null) {
                return b0.a;
            }
            throw th2;
        }

        public final <T> n getInitializer(List<? extends DataMigration<T>> migrations) {
            m.e(migrations, "migrations");
            return new DataMigrationInitializer$Companion$getInitializer$1(migrations, null);
        }
    }
}
