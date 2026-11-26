package androidx.datastore.core;

import a40.c0;
import a40.z;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import g00.h;
import j40.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import k00.i;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import m00.c;
import m00.e;
import r30.r;
import ri.t1;
import u00.k;
import u00.n;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\f*\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ<\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102$\b\u0004\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0082H¢\u0006\u0004\b\u0016\u0010\u0017J4\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\u001c\u0010\u0015\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0011H\u0096@¢\u0006\u0004\b\u001c\u0010\u0017J\u0010\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010!R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b#\u0010$R \u0010&\u001a\b\u0012\u0004\u0012\u00020\f0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001b\u00104\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010$R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0012058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00102R\u001b\u0010;\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b7\u00108*\u0004\b9\u0010:¨\u0006="}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator;", "Landroidx/datastore/core/InterProcessCoordinator;", "Lk00/i;", "context", "Ljava/io/File;", "file", "<init>", "(Lk00/i;Ljava/io/File;)V", RuntimeVersion.SUFFIX, "suffix", "fileWithSuffix", "(Ljava/lang/String;)Ljava/io/File;", "Lg00/b0;", "createIfNotExists", "(Ljava/io/File;)V", "createParentDirectories", "T", "Lkotlin/Function2;", "Landroidx/datastore/core/SharedCounter;", "Lk00/c;", RuntimeVersion.SUFFIX, "block", "withLazyCounter", "(Lu00/n;Lk00/c;)Ljava/lang/Object;", "Lkotlin/Function1;", "lock", "(Lu00/k;Lk00/c;)Ljava/lang/Object;", RuntimeVersion.SUFFIX, "tryLock", RuntimeVersion.SUFFIX, "getVersion", "(Lk00/c;)Ljava/lang/Object;", "incrementAndGetVersion", "Lk00/i;", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Ld40/i;", "updateNotifications", "Ld40/i;", "getUpdateNotifications", "()Ld40/i;", "LOCK_SUFFIX", "Ljava/lang/String;", "VERSION_SUFFIX", "LOCK_ERROR_MESSAGE", "Lj40/a;", "inMemoryMutex", "Lj40/a;", "lockFile$delegate", "Lg00/h;", "getLockFile", "lockFile", "Lg00/h;", "lazySharedCounter", "getSharedCounter", "()Landroidx/datastore/core/SharedCounter;", "getSharedCounter$delegate", "(Landroidx/datastore/core/MultiProcessCoordinator;)Ljava/lang/Object;", "sharedCounter", "Companion", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MultiProcessCoordinator implements InterProcessCoordinator {

    public static final Companion INSTANCE = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = 60000;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final i context;
    private final File file;
    private final j40.a inMemoryMutex;
    private final h lazySharedCounter;

    private final h lockFile;
    private final d40.i updateNotifications;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/MultiProcessCoordinator$Companion;", RuntimeVersion.SUFFIX, "<init>", "()V", "Ljava/io/FileOutputStream;", "lockFileStream", "Ljava/nio/channels/FileLock;", "getExclusiveFileLockWithRetryIfDeadlock", "(Ljava/io/FileOutputStream;Lk00/c;)Ljava/lang/Object;", RuntimeVersion.SUFFIX, "DEADLOCK_ERROR_MESSAGE", "Ljava/lang/String;", RuntimeVersion.SUFFIX, "INITIAL_WAIT_MILLIS", "J", "MAX_WAIT_MILLIS", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(f fVar) {
            this();
        }

        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r12, k00.c<? super java.nio.channels.FileLock> r13) throws java.io.IOException {
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, k00.c):java.lang.Object");
        }
    }

    @e(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {211, 47, 48}, m = "lock")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;

        public AnonymousClass1(k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.lock(null, this);
        }
    }

    @e(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 87}, m = "tryLock")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00121<T> extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        Object result;

        public C00121(k00.c<? super C00121> cVar) {
            super(cVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MultiProcessCoordinator.this.tryLock(null, this);
        }
    }

    @e(c = "androidx.datastore.core.MultiProcessCoordinator$withLazyCounter$2", f = "MultiProcessCoordinator.android.kt", l = {163}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "La40/z;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends m00.i implements n {
        final n $block;
        int label;
        final MultiProcessCoordinator this$0;

        public AnonymousClass2(n nVar, MultiProcessCoordinator multiProcessCoordinator, k00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = nVar;
            this.this$0 = multiProcessCoordinator;
        }

        public final k00.c<b0> create(Object obj, k00.c<?> cVar) {
            return new AnonymousClass2(this.$block, this.this$0, cVar);
        }

        public final Object invoke(z zVar, k00.c<? super T> cVar) {
            return create(zVar, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return obj;
            }
            t1.O(obj);
            n nVar = this.$block;
            SharedCounter sharedCounter = this.this$0.getSharedCounter();
            this.label = 1;
            Object objInvoke = nVar.invoke(sharedCounter, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            return this.$block.invoke(this.this$0.getSharedCounter(), this);
        }
    }

    public MultiProcessCoordinator(i iVar, File file) {
        m.e(iVar, "context");
        m.e(file, "file");
        this.context = iVar;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.INSTANCE.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = d.a();
        this.lockFile = rd.a.J(new MultiProcessCoordinator$lockFile$2(this));
        this.lazySharedCounter = rd.a.J(new MultiProcessCoordinator$lazySharedCounter$1(this));
    }

    public final void createIfNotExists(File file) throws IOException {
        createParentDirectories(file);
        if (file.exists()) {
            return;
        }
        file.createNewFile();
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

    public final File fileWithSuffix(String suffix) {
        return new File(this.file.getAbsolutePath() + suffix);
    }

    private final File getLockFile() {
        return (File) this.lockFile.getValue();
    }

    public final SharedCounter getSharedCounter() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(n nVar, k00.c<? super T> cVar) {
        if (this.lazySharedCounter.isInitialized()) {
            return nVar.invoke(getSharedCounter(), cVar);
        }
        return c0.J(new AnonymousClass2(nVar, this, null), this.context, cVar);
    }

    public final File getFile() {
        return this.file;
    }

    @Override
    public d40.i getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override
    public Object getVersion(k00.c<? super Integer> cVar) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().getValue());
        }
        return c0.J(new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), this.context, cVar);
    }

    @Override
    public Object incrementAndGetVersion(k00.c<? super Integer> cVar) {
        if (this.lazySharedCounter.isInitialized()) {
            return new Integer(getSharedCounter().incrementAndGetValue());
        }
        return c0.J(new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), this.context, cVar);
    }

    @Override
    public <T> Object lock(k kVar, k00.c<? super T> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        FileOutputStream fileOutputStream;
        Throwable th2;
        ?? r10;
        ?? r11;
        k kVar2;
        java.io.Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        ?? r4;
        ?? r12;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        ?? r13 = anonymousClass1.result;
        l00.a aVar = l00.a.A;
        int i11 = anonymousClass1.label;
        try {
            try {
                try {
                    if (i11 == 0) {
                        t1.O(r13);
                        j40.a aVar2 = this.inMemoryMutex;
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = kVar;
                        anonymousClass1.L$2 = aVar2;
                        anonymousClass1.label = 1;
                        Object objL = aVar2.l(anonymousClass1);
                        r13 = aVar2;
                        if (objL != aVar) {
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            fileLock = (FileLock) anonymousClass1.L$2;
                            closeable = (java.io.Closeable) anonymousClass1.L$1;
                            j40.a aVar3 = (j40.a) anonymousClass1.L$0;
                            try {
                                t1.O(r13);
                                r4 = aVar3;
                                r12 = r13;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    ta.c0.C(closeable, null);
                                    r4.i((Object) null);
                                    return r12;
                                } catch (Throwable th3) {
                                    th = th3;
                                    r13 = r4;
                                    r13.i((Object) null);
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        }
                        closeable = (java.io.Closeable) anonymousClass1.L$2;
                        r11 = (j40.a) anonymousClass1.L$1;
                        kVar2 = (k) anonymousClass1.L$0;
                        try {
                            t1.O(r13);
                            r11 = r11;
                            r10 = r13;
                            fileLock2 = (FileLock) r10;
                            try {
                                anonymousClass1.L$0 = r11;
                                anonymousClass1.L$1 = closeable;
                                anonymousClass1.L$2 = fileLock2;
                                anonymousClass1.label = 3;
                                objInvoke = kVar2.invoke(anonymousClass1);
                                if (objInvoke != aVar) {
                                    r4 = r11;
                                    fileLock = fileLock2;
                                    r12 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    ta.c0.C(closeable, null);
                                    r4.i((Object) null);
                                    return r12;
                                }
                                return aVar;
                            } catch (Throwable th5) {
                                fileLock = fileLock2;
                                th2 = th5;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th2;
                            }
                        } catch (Throwable th6) {
                            th2 = th6;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th2;
                        }
                    }
                    j40.a aVar4 = (j40.a) anonymousClass1.L$2;
                    kVar = (k) anonymousClass1.L$1;
                    MultiProcessCoordinator multiProcessCoordinator = (MultiProcessCoordinator) anonymousClass1.L$0;
                    t1.O(r13);
                    r13 = aVar4;
                    this = multiProcessCoordinator;
                    Companion companion = INSTANCE;
                    anonymousClass1.L$0 = kVar;
                    anonymousClass1.L$1 = r13;
                    anonymousClass1.L$2 = fileOutputStream;
                    anonymousClass1.label = 2;
                    Object exclusiveFileLockWithRetryIfDeadlock = companion.getExclusiveFileLockWithRetryIfDeadlock(fileOutputStream, anonymousClass1);
                    if (exclusiveFileLockWithRetryIfDeadlock != aVar) {
                        ?? r7 = r13;
                        r10 = exclusiveFileLockWithRetryIfDeadlock;
                        r11 = r7;
                        kVar2 = kVar;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        anonymousClass1.L$0 = r11;
                        anonymousClass1.L$1 = closeable;
                        anonymousClass1.L$2 = fileLock2;
                        anonymousClass1.label = 3;
                        objInvoke = kVar2.invoke(anonymousClass1);
                        if (objInvoke != aVar) {
                            r4 = r11;
                            fileLock = fileLock2;
                            r12 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            ta.c0.C(closeable, null);
                            r4.i((Object) null);
                            return r12;
                        }
                    }
                    return aVar;
                } catch (Throwable th7) {
                    th2 = th7;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th2;
                }
                fileOutputStream = new FileOutputStream(this.getLockFile());
            } catch (Throwable th8) {
                th = th8;
                r13.i((Object) null);
                throw th;
            }
        } catch (Throwable th9) {
            r13 = anonymousClass1;
            try {
                throw th9;
            } catch (Throwable th10) {
                ta.c0.C(kVar, th9);
                throw th10;
            }
        }
    }

    @Override
    public <T> Object tryLock(n nVar, k00.c<? super T> cVar) throws Throwable {
        C00121 c00121;
        ?? r4;
        C00121 c00122;
        FileLock fileLock;
        String message;
        FileLock fileLockTryLock;
        java.io.Closeable closeable;
        ?? r7;
        if (cVar instanceof C00121) {
            c00121 = (C00121) cVar;
            int i10 = c00121.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00121.label = i10 - Integer.MIN_VALUE;
            } else {
                c00121 = new C00121(cVar);
            }
        } else {
            c00121 = new C00121(cVar);
        }
        Object objInvoke = c00121.result;
        l00.a aVar = l00.a.A;
        int i11 = c00121.label;
        try {
            if (i11 == 0) {
                t1.O(objInvoke);
                C00121 c00123 = this.inMemoryMutex;
                boolean zA = c00123.a((Object) null);
                try {
                    if (zA) {
                        FileInputStream fileInputStream = new FileInputStream(getLockFile());
                        try {
                            try {
                                fileLockTryLock = fileInputStream.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (IOException e3) {
                                String message2 = e3.getMessage();
                                if ((message2 == null || !r.x0(message2, this.LOCK_ERROR_MESSAGE, false)) && ((message = e3.getMessage()) == null || !r.x0(message, DEADLOCK_ERROR_MESSAGE, false))) {
                                    throw e3;
                                }
                                fileLockTryLock = null;
                            }
                            try {
                                Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                                c00121.L$0 = c00123;
                                c00121.L$1 = fileInputStream;
                                c00121.L$2 = fileLockTryLock;
                                c00121.Z$0 = zA;
                                c00121.label = 2;
                                objInvoke = nVar.invoke(boolValueOf, c00121);
                                if (objInvoke != aVar) {
                                    fileLock = fileLockTryLock;
                                    c00121 = c00123;
                                    r4 = zA;
                                    closeable = fileInputStream;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    ta.c0.C(closeable, null);
                                    if (r4 != 0) {
                                        c00121.i((Object) null);
                                    }
                                    return objInvoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileLock = fileLockTryLock;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        c00121.L$0 = c00123;
                        c00121.Z$0 = zA;
                        c00121.label = 1;
                        objInvoke = nVar.invoke(bool, c00121);
                        if (objInvoke != aVar) {
                            c00122 = c00123;
                            r7 = zA;
                            if (r7 != 0) {
                                c00122.i((Object) null);
                            }
                            return objInvoke;
                        }
                    }
                    return aVar;
                } catch (Throwable th4) {
                    th = th4;
                    c00122 = c00123;
                    r4 = zA;
                }
            } else if (i11 == 1) {
                r4 = c00121.Z$0;
                c00122 = (j40.a) c00121.L$0;
                try {
                    t1.O(objInvoke);
                    r7 = r4;
                    if (r7 != 0) {
                        c00122.i((Object) null);
                    }
                    return objInvoke;
                } catch (Throwable th5) {
                    th = th5;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z10 = c00121.Z$0;
                fileLock = (FileLock) c00121.L$2;
                closeable = (java.io.Closeable) c00121.L$1;
                c00121 = (j40.a) c00121.L$0;
                try {
                    t1.O(objInvoke);
                    r4 = z10;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        ta.c0.C(closeable, null);
                        if (r4 != 0) {
                            c00121.i((Object) null);
                        }
                        return objInvoke;
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th8) {
            try {
                throw th8;
            } catch (Throwable th9) {
                try {
                    ta.c0.C(aVar, th8);
                    throw th9;
                } catch (Throwable th10) {
                    th = th10;
                    r4 = this;
                }
            }
        }
        c00122 = c00121;
        if (r4 != 0) {
            c00122.i((Object) null);
        }
        throw th;
    }
}
