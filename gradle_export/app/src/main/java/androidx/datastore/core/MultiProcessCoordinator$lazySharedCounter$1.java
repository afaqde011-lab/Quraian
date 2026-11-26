package androidx.datastore.core;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/datastore/core/SharedCounter;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator$lazySharedCounter$1 extends n implements u00.a {
    final MultiProcessCoordinator this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements u00.a {
        final MultiProcessCoordinator this$0;

        public AnonymousClass1(MultiProcessCoordinator multiProcessCoordinator) {
            super(0);
            this.this$0 = multiProcessCoordinator;
        }

        public final File m4invoke() throws IOException {
            MultiProcessCoordinator multiProcessCoordinator = this.this$0;
            File fileFileWithSuffix = multiProcessCoordinator.fileWithSuffix(multiProcessCoordinator.VERSION_SUFFIX);
            this.this$0.createIfNotExists(fileFileWithSuffix);
            return fileFileWithSuffix;
        }
    }

    public MultiProcessCoordinator$lazySharedCounter$1(MultiProcessCoordinator multiProcessCoordinator) {
        super(0);
        this.this$0 = multiProcessCoordinator;
    }

    public final SharedCounter m3invoke() {
        SharedCounter.Companion companion = SharedCounter.INSTANCE;
        companion.loadLib();
        return companion.create$datastore_core_release(new AnonymousClass1(this.this$0));
    }
}
