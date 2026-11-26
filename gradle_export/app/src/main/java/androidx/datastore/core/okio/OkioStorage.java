package androidx.datastore.core.okio;

import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.Storage;
import androidx.datastore.core.StorageConnection;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import g00.h;
import java.util.LinkedHashSet;
import java.util.Set;
import k50.o;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import u00.a;
import u00.n;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 \u001b*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u001bBG\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u001a\b\u0002\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013R&\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage;", "T", "Landroidx/datastore/core/Storage;", "Lk50/o;", "fileSystem", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Lkotlin/Function2;", "Lk50/z;", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinatorProducer", "Lkotlin/Function0;", "producePath", "<init>", "(Lk50/o;Landroidx/datastore/core/okio/OkioSerializer;Lu00/n;Lu00/a;)V", "Landroidx/datastore/core/StorageConnection;", "createConnection", "()Landroidx/datastore/core/StorageConnection;", "Lk50/o;", "Landroidx/datastore/core/okio/OkioSerializer;", "Lu00/n;", "Lu00/a;", "canonicalPath$delegate", "Lg00/h;", "getCanonicalPath", "()Lk50/z;", "canonicalPath", "Companion", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorage<T> implements Storage<T> {

    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> activeFiles = new LinkedHashSet();
    private static final Synchronizer activeFilesLock = new Synchronizer();

    private final h canonicalPath;
    private final n coordinatorProducer;
    private final o fileSystem;
    private final a producePath;
    private final OkioSerializer<T> serializer;

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "Lk50/z;", "path", "Lk50/o;", "<anonymous parameter 1>", "Landroidx/datastore/core/InterProcessCoordinator;", "invoke", "(Lk50/z;Lk50/o;)Landroidx/datastore/core/InterProcessCoordinator;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n implements n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2);
        }

        public final InterProcessCoordinator invoke(z zVar, o oVar) {
            m.e(zVar, "path");
            m.e(oVar, "<anonymous parameter 1>");
            return OkioStorageKt.createSingleProcessCoordinator(zVar);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/datastore/core/okio/OkioStorage$Companion;", RuntimeVersion.SUFFIX, "()V", "activeFiles", RuntimeVersion.SUFFIX, RuntimeVersion.SUFFIX, "getActiveFiles$datastore_core_okio", "()Ljava/util/Set;", "activeFilesLock", "Landroidx/datastore/core/okio/Synchronizer;", "getActiveFilesLock", "()Landroidx/datastore/core/okio/Synchronizer;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final Set<String> getActiveFiles$datastore_core_okio() {
            return OkioStorage.activeFiles;
        }

        public final Synchronizer getActiveFilesLock() {
            return OkioStorage.activeFilesLock;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.n implements a {
        final OkioStorage<T> this$0;

        public AnonymousClass2(OkioStorage<T> okioStorage) {
            super(0);
            this.this$0 = okioStorage;
        }

        public Object invoke() {
            m8invoke();
            return b0.a;
        }

        public final void m8invoke() {
            Companion companion = OkioStorage.INSTANCE;
            Synchronizer activeFilesLock = companion.getActiveFilesLock();
            OkioStorage<T> okioStorage = this.this$0;
            synchronized (activeFilesLock) {
                companion.getActiveFiles$datastore_core_okio().remove(okioStorage.getCanonicalPath().A.q());
            }
        }
    }

    public OkioStorage(o oVar, OkioSerializer<T> okioSerializer, n nVar, a aVar) {
        m.e(oVar, "fileSystem");
        m.e(okioSerializer, "serializer");
        m.e(nVar, "coordinatorProducer");
        m.e(aVar, "producePath");
        this.fileSystem = oVar;
        this.serializer = okioSerializer;
        this.coordinatorProducer = nVar;
        this.producePath = aVar;
        this.canonicalPath = rd.a.J(new OkioStorage$canonicalPath$2(this));
    }

    public OkioStorage(o oVar, OkioSerializer okioSerializer, n nVar, a aVar, int i10, f fVar) {
        this(oVar, okioSerializer, (i10 & 4) != 0 ? AnonymousClass1.INSTANCE : nVar, aVar);
    }

    public final z getCanonicalPath() {
        return (z) this.canonicalPath.getValue();
    }

    @Override
    public StorageConnection<T> createConnection() {
        String strQ = getCanonicalPath().A.q();
        synchronized (activeFilesLock) {
            Set<String> set = activeFiles;
            if (set.contains(strQ)) {
                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + strQ + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
            }
            set.add(strQ);
        }
        return new OkioStorageConnection(this.fileSystem, getCanonicalPath(), this.serializer, (InterProcessCoordinator) this.coordinatorProducer.invoke(getCanonicalPath(), this.fileSystem), new AnonymousClass2(this));
    }
}
