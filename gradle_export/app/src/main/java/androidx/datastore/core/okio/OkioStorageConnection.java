package androidx.datastore.core.okio;

import androidx.datastore.core.Closeable;
import androidx.datastore.core.InterProcessCoordinator;
import androidx.datastore.core.StorageConnection;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import j40.d;
import java.io.IOException;
import k50.o;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m00.c;
import m00.e;
import qd.s0;
import ri.t1;
import u00.a;
import u00.n;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011JF\u0010\u0019\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00122.\u0010\u0018\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0013H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ:\u0010\u001d\u001a\u00020\f2(\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001bH\u0096@¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001f\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010 R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Landroidx/datastore/core/okio/OkioStorageConnection;", "T", "Landroidx/datastore/core/StorageConnection;", "Lk50/o;", "fileSystem", "Lk50/z;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "Landroidx/datastore/core/InterProcessCoordinator;", "coordinator", "Lkotlin/Function0;", "Lg00/b0;", "onClose", "<init>", "(Lk50/o;Lk50/z;Landroidx/datastore/core/okio/OkioSerializer;Landroidx/datastore/core/InterProcessCoordinator;Lu00/a;)V", "checkNotClosed", "()V", "R", "Lkotlin/Function3;", "Landroidx/datastore/core/ReadScope;", RuntimeVersion.SUFFIX, "Lk00/c;", RuntimeVersion.SUFFIX, "block", "readScope", "(Lu00/o;Lk00/c;)Ljava/lang/Object;", "Lkotlin/Function2;", "Landroidx/datastore/core/WriteScope;", "writeScope", "(Lu00/n;Lk00/c;)Ljava/lang/Object;", "close", "Lk50/o;", "Lk50/z;", "Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/InterProcessCoordinator;", "getCoordinator", "()Landroidx/datastore/core/InterProcessCoordinator;", "Lu00/a;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "Lj40/a;", "transactionMutex", "Lj40/a;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioStorageConnection<T> implements StorageConnection<T> {
    private final AtomicBoolean closed;
    private final InterProcessCoordinator coordinator;
    private final o fileSystem;
    private final a onClose;
    private final z path;
    private final OkioSerializer<T> serializer;
    private final j40.a transactionMutex;

    @e(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {113}, m = "readScope")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<R> extends c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        Object result;
        final OkioStorageConnection<T> this$0;

        public AnonymousClass1(OkioStorageConnection<T> okioStorageConnection, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = okioStorageConnection;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.readScope(null, this);
        }
    }

    @e(c = "androidx.datastore.core.okio.OkioStorageConnection", f = "OkioStorage.kt", l = {236, 137}, m = "writeScope")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class C00151 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        Object result;
        final OkioStorageConnection<T> this$0;

        public C00151(OkioStorageConnection<T> okioStorageConnection, k00.c<? super C00151> cVar) {
            super(cVar);
            this.this$0 = okioStorageConnection;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeScope(null, this);
        }
    }

    public OkioStorageConnection(o oVar, z zVar, OkioSerializer<T> okioSerializer, InterProcessCoordinator interProcessCoordinator, a aVar) {
        m.e(oVar, "fileSystem");
        m.e(zVar, "path");
        m.e(okioSerializer, "serializer");
        m.e(interProcessCoordinator, "coordinator");
        m.e(aVar, "onClose");
        this.fileSystem = oVar;
        this.path = zVar;
        this.serializer = okioSerializer;
        this.coordinator = interProcessCoordinator;
        this.onClose = aVar;
        this.closed = new AtomicBoolean(false);
        this.transactionMutex = d.a();
    }

    private final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("StorageConnection has already been disposed.");
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
    public <R> java.lang.Object readScope(u00.o r10, k00.c<? super R> r11) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioStorageConnection.readScope(u00.o, k00.c):java.lang.Object");
    }

    @Override
    public Object writeScope(n nVar, k00.c<? super b0> cVar) throws Throwable {
        ?? c00151;
        j40.a aVar;
        ?? r4;
        n nVar2;
        z zVar;
        OkioWriteScope okioWriteScope;
        Closeable closeable;
        Throwable th2;
        ?? r7;
        j40.a aVar2 = ".tmp";
        if (cVar instanceof C00151) {
            C00151 c00152 = (C00151) cVar;
            int i10 = c00152.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c00152.label = i10 - Integer.MIN_VALUE;
                c00151 = c00152;
            } else {
                c00151 = new C00151(this, cVar);
            }
        } else {
            c00151 = new C00151(this, cVar);
        }
        Object obj = c00151.result;
        l00.a aVar3 = l00.a.A;
        int i11 = c00151.label;
        try {
            try {
                try {
                    try {
                        if (i11 == 0) {
                            t1.O(obj);
                            checkNotClosed();
                            z zVarC = this.path.c();
                            if (zVarC == null) {
                                throw new IllegalStateException("must have a parent path");
                            }
                            this.fileSystem.c(zVarC);
                            j40.a aVar4 = this.transactionMutex;
                            c00151.L$0 = this;
                            c00151.L$1 = nVar;
                            c00151.L$2 = zVarC;
                            c00151.L$3 = aVar4;
                            c00151.label = 1;
                            if (aVar4.l((k00.c) c00151) != aVar3) {
                                nVar2 = nVar;
                                zVar = zVarC;
                                aVar = aVar4;
                            }
                            return aVar3;
                        }
                        if (i11 != 1) {
                            if (i11 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            closeable = (Closeable) c00151.L$3;
                            nVar = (z) c00151.L$2;
                            aVar2 = (j40.a) c00151.L$1;
                            c00151 = (OkioStorageConnection) c00151.L$0;
                            try {
                                t1.O(obj);
                                r7 = c00151;
                                try {
                                    closeable.close();
                                    th = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                if (th == null) {
                                    throw th;
                                }
                                if (r7.fileSystem.g(nVar)) {
                                    r7.fileSystem.b(nVar, r7.path);
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
                        j40.a aVar5 = (j40.a) c00151.L$3;
                        zVar = (z) c00151.L$2;
                        nVar2 = (n) c00151.L$1;
                        OkioStorageConnection<T> okioStorageConnection = (OkioStorageConnection) c00151.L$0;
                        t1.O(obj);
                        aVar = aVar5;
                        this = okioStorageConnection;
                        c00151.L$0 = this;
                        c00151.L$1 = aVar;
                        c00151.L$2 = nVar;
                        c00151.L$3 = okioWriteScope;
                        c00151.label = 2;
                        if (nVar2.invoke(okioWriteScope, (Object) c00151) != aVar3) {
                            r7 = this;
                            closeable = okioWriteScope;
                            aVar2 = aVar;
                            closeable.close();
                            th = null;
                            if (th == null) {
                                throw th;
                            }
                            if (r7.fileSystem.g(nVar)) {
                                r7.fileSystem.b(nVar, r7.path);
                            }
                            aVar2.i((Object) null);
                            return b0.a;
                        }
                        return aVar3;
                    } catch (Throwable th6) {
                        c00151 = this;
                        closeable = okioWriteScope;
                        aVar2 = aVar;
                        th2 = th6;
                        closeable.close();
                        throw th2;
                    }
                    this.fileSystem.e(nVar);
                    okioWriteScope = new OkioWriteScope(this.fileSystem, nVar, this.serializer);
                } catch (IOException e3) {
                    r4 = this;
                    e = e3;
                    if (r4.fileSystem.g(nVar)) {
                        throw e;
                    }
                    try {
                        o oVar = r4.fileSystem;
                        oVar.getClass();
                        oVar.e(nVar);
                        throw e;
                    } catch (IOException unused) {
                        throw e;
                    }
                }
                nVar = zVar.e(this.path.b().concat(".tmp"));
            } catch (Throwable th7) {
                th = th7;
                aVar.i((Object) null);
                throw th;
            }
        } catch (IOException e10) {
            e = e10;
            aVar = aVar2;
            r4 = c00151;
            if (r4.fileSystem.g(nVar)) {
                throw e;
            }
            o oVar2 = r4.fileSystem;
            oVar2.getClass();
            oVar2.e(nVar);
            throw e;
        } catch (Throwable th8) {
            th = th8;
            aVar = aVar2;
            aVar.i((Object) null);
            throw th;
        }
    }
}
