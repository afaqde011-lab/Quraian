package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import g00.b0;
import j40.d;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m00.c;
import m00.e;
import qd.s0;
import ri.t1;
import u00.n;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\n2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001f\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroidx/datastore/core/FileStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "Lg00/b0;", "onClose", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;Landroidx/datastore/core/InterProcessCoordinator;Lu00/a;)V", "checkNotClosed", "()V", "createParentDirectories", "(Ljava/io/File;)V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", RuntimeVersion.SUFFIX, "Lk00/c;", RuntimeVersion.SUFFIX, "block", "readScope", "(Lu00/o;Lk00/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lu00/n;Lk00/c;)Ljava/lang/Object;", "close", "Ljava/io/File;", "Landroidx/datastore/core/Serializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lu00/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lj40/a;", "transactionMutex", "Lj40/a;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileStorageConnection<T> implements StorageConnection<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final File file;
    private final u00.a onClose;
    private final Serializer<T> serializer;
    private final j40.a transactionMutex;

    @e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {101}, m = "readScope")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<R> extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        Object result;
        final FileStorageConnection<T> this$0;

        public AnonymousClass1(FileStorageConnection<T> fileStorageConnection, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = fileStorageConnection;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    @e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00111 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;
        final FileStorageConnection<T> this$0;

        public C00111(FileStorageConnection<T> fileStorageConnection, k00.c<? super C00111> cVar) {
            super(cVar);
            this.this$0 = fileStorageConnection;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public FileStorageConnection(File file, Serializer<T> serializer, InterProcessCoordinator interProcessCoordinator, u00.a aVar) {
        m.e(file, "file");
        m.e(serializer, "serializer");
        m.e(interProcessCoordinator, "coordinator");
        m.e(aVar, "onClose");
        this.file = file;
        this.serializer = serializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = aVar;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.transactionMutex = d.a();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
        }
    }

    private final void createParentDirectories(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException("Unable to create parent directories of " + file);
        }
    }

    @Override
    public void close() {
        this.closed.set(true);
        this.onClose.invoke();
    }

    @Override
    public InterProcessCoordinator getCoordinator() {
        return this.coordinator;
    }

    @Override
    public <R> java.lang.Object readScope(u00.o r9, k00.c<? super R> r10) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileStorageConnection.readScope(u00.o, k00.c):java.lang.Object");
    }

    @Override
    public Object writeScope(n nVar, k00.c<? super b0> cVar) throws Throwable {
        C00111 c00111;
        n file;
        j40.a aVar;
        FileWriteScope fileWriteScope;
        Throwable th2;
        Closeable closeable;
        FileStorageConnection<T> fileStorageConnection;
        j40.a aVar2;
        n nVar2;
        if (cVar instanceof C00111) {
            c00111 = (C00111) cVar;
            int i10 = c00111.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00111.label = i10 - Integer.MIN_VALUE;
            } else {
                c00111 = new C00111(this, cVar);
            }
        } else {
            c00111 = new C00111(this, cVar);
        }
        ?? r10 = c00111.result;
        l00.a aVar3 = l00.a.A;
        int i11 = c00111.label;
        try {
            try {
                try {
                    try {
                        if (i11 == 0) {
                            t1.O(r10);
                            checkNotClosed();
                            createParentDirectories(this.file);
                            aVar = this.transactionMutex;
                            c00111.L$0 = this;
                            c00111.L$1 = nVar;
                            c00111.L$2 = aVar;
                            c00111.label = 1;
                            if (aVar.l(c00111) != aVar3) {
                            }
                            return aVar3;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable = (Closeable) c00111.L$3;
                            nVar2 = (File) c00111.L$2;
                            aVar2 = (j40.a) c00111.L$1;
                            fileStorageConnection = (FileStorageConnection) c00111.L$0;
                            try {
                                t1.O(r10);
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (nVar2.exists() && !FileMoves_androidKt.atomicMoveTo(nVar2, fileStorageConnection.file)) {
                                    throw new IOException("Unable to rename " + nVar2 + " to " + fileStorageConnection.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                }
                                aVar2.i((Object) null);
                                return b0.a;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    closeable.close();
                                } catch (Throwable th5) {
                                    s0.V(th2, th5);
                                }
                                throw th2;
                            }
                        }
                        j40.a aVar4 = (j40.a) c00111.L$2;
                        nVar = (n) c00111.L$1;
                        FileStorageConnection<T> fileStorageConnection2 = (FileStorageConnection) c00111.L$0;
                        t1.O(r10);
                        aVar = aVar4;
                        this = fileStorageConnection2;
                        c00111.L$0 = this;
                        c00111.L$1 = aVar;
                        c00111.L$2 = file;
                        c00111.L$3 = fileWriteScope;
                        c00111.label = 2;
                        if (nVar.invoke(fileWriteScope, c00111) != aVar3) {
                            fileStorageConnection = this;
                            aVar2 = aVar;
                            nVar2 = file;
                            closeable = fileWriteScope;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (nVar2.exists()) {
                                throw new IOException("Unable to rename " + nVar2 + " to " + fileStorageConnection.file + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                            }
                            aVar2.i((Object) null);
                            return b0.a;
                        }
                        return aVar3;
                    } catch (Throwable th6) {
                        th2 = th6;
                        closeable = fileWriteScope;
                        closeable.close();
                        throw th2;
                    }
                    fileWriteScope = new FileWriteScope(file, this.serializer);
                } catch (IOException e3) {
                    e = e3;
                    if (file.exists()) {
                        file.delete();
                    }
                    throw e;
                }
                file = new File(this.file.getAbsolutePath() + ".tmp");
            } catch (Throwable th7) {
                th = th7;
                r10.i((Object) null);
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            file = nVar;
        } catch (Throwable th8) {
            th = th8;
            r10 = aVar3;
            r10.i((Object) null);
            throw th;
        }
    }
}
