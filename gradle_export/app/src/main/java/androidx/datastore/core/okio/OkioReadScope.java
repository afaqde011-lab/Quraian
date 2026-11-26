package androidx.datastore.core.okio;

import androidx.datastore.core.ReadScope;
import bi.b;
import java.io.Closeable;
import java.io.FileNotFoundException;
import k50.o;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l00.a;
import m00.c;
import m00.e;
import qd.s0;
import ri.t1;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0004¢\u0006\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/datastore/core/okio/OkioReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "Lk50/o;", "fileSystem", "Lk50/z;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lk50/o;Lk50/z;Landroidx/datastore/core/okio/OkioSerializer;)V", "readData", "(Lk00/c;)Ljava/lang/Object;", "Lg00/b0;", "close", "()V", "checkClose", "Lk50/o;", "getFileSystem", "()Lk50/o;", "Lk50/z;", "getPath", "()Lk50/z;", "Landroidx/datastore/core/okio/OkioSerializer;", "getSerializer", "()Landroidx/datastore/core/okio/OkioSerializer;", "Landroidx/datastore/core/okio/AtomicBoolean;", "closed", "Landroidx/datastore/core/okio/AtomicBoolean;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final o fileSystem;
    private final z path;
    private final OkioSerializer<T> serializer;

    @e(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {180, 187}, m = "readData$suspendImpl")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final OkioReadScope<T> this$0;

        public AnonymousClass1(OkioReadScope<T> okioReadScope, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = okioReadScope;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkioReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public OkioReadScope(o oVar, z zVar, OkioSerializer<T> okioSerializer) {
        m.e(oVar, "fileSystem");
        m.e(zVar, "path");
        m.e(okioSerializer, "serializer");
        this.fileSystem = oVar;
        this.path = zVar;
        this.serializer = okioSerializer;
        this.closed = new AtomicBoolean(false);
    }

    public static <T> Object readData$suspendImpl(OkioReadScope<T> okioReadScope, k00.c<? super T> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        OkioReadScope<T> okioReadScope2;
        Closeable closeable;
        Throwable th2;
        Closeable closeableR;
        Throwable th3;
        Closeable closeable2;
        Object from;
        Throwable th4;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(okioReadScope, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(okioReadScope, cVar);
        }
        Object obj = anonymousClass1.result;
        a aVar = a.A;
        int i11 = anonymousClass1.label;
        Throwable th5 = null;
        if (i11 == 0) {
            t1.O(obj);
            okioReadScope.checkClose();
            try {
                Closeable closeableR2 = b.r(((OkioReadScope) okioReadScope).fileSystem.n(((OkioReadScope) okioReadScope).path));
                try {
                    OkioSerializer<T> okioSerializer = ((OkioReadScope) okioReadScope).serializer;
                    anonymousClass1.L$0 = okioReadScope;
                    anonymousClass1.L$1 = closeableR2;
                    anonymousClass1.label = 1;
                    Object from2 = okioSerializer.readFrom(closeableR2, anonymousClass1);
                    if (from2 != aVar) {
                        closeable = closeableR2;
                        obj = from2;
                        if (closeable != null) {
                            closeable.close();
                        }
                        th4 = null;
                        if (th4 == null) {
                            throw th4;
                        }
                        m.b(obj);
                        return obj;
                    }
                    return aVar;
                } catch (Throwable th6) {
                    okioReadScope2 = okioReadScope;
                    closeable = closeableR2;
                    th2 = th6;
                    if (closeable != null) {
                        closeable.close();
                    }
                    th4 = th2;
                    obj = null;
                }
            } catch (FileNotFoundException unused) {
                if (((OkioReadScope) okioReadScope).fileSystem.g(((OkioReadScope) okioReadScope).path)) {
                    return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                }
                closeableR = b.r(((OkioReadScope) okioReadScope).fileSystem.n(((OkioReadScope) okioReadScope).path));
                OkioSerializer<T> okioSerializer2 = ((OkioReadScope) okioReadScope).serializer;
                anonymousClass1.L$0 = closeableR;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                from = okioSerializer2.readFrom(closeableR, anonymousClass1);
                if (from != aVar) {
                    obj = from;
                    closeable2 = closeableR;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    if (th5 != null) {
                        throw th5;
                    }
                    m.b(obj);
                    return obj;
                }
            }
        } else {
            if (i11 == 1) {
                closeable = (Closeable) anonymousClass1.L$1;
                okioReadScope2 = (OkioReadScope) anonymousClass1.L$0;
                try {
                    t1.O(obj);
                    if (closeable != null) {
                        try {
                            closeable.close();
                        } catch (Throwable th7) {
                            th4 = th7;
                        }
                    }
                    th4 = null;
                } catch (Throwable th8) {
                    th2 = th8;
                    if (closeable != null) {
                        try {
                            try {
                                closeable.close();
                            } catch (Throwable th9) {
                                s0.V(th2, th9);
                            }
                        } catch (FileNotFoundException unused2) {
                            okioReadScope = okioReadScope2;
                            if (((OkioReadScope) okioReadScope).fileSystem.g(((OkioReadScope) okioReadScope).path)) {
                                return ((OkioReadScope) okioReadScope).serializer.getDefaultValue();
                            }
                            closeableR = b.r(((OkioReadScope) okioReadScope).fileSystem.n(((OkioReadScope) okioReadScope).path));
                            try {
                                OkioSerializer<T> okioSerializer3 = ((OkioReadScope) okioReadScope).serializer;
                                anonymousClass1.L$0 = closeableR;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.label = 2;
                                from = okioSerializer3.readFrom(closeableR, anonymousClass1);
                                if (from != aVar) {
                                    obj = from;
                                    closeable2 = closeableR;
                                    if (closeable2 != null) {
                                        closeable2.close();
                                    }
                                    if (th5 != null) {
                                        throw th5;
                                    }
                                    m.b(obj);
                                    return obj;
                                }
                                return aVar;
                            } catch (Throwable th10) {
                                th3 = th10;
                                closeable2 = closeableR;
                                if (closeable2 != null) {
                                    closeable2.close();
                                }
                                th5 = th3;
                                obj = null;
                            }
                        }
                    }
                    th4 = th2;
                    obj = null;
                }
                if (th4 == null) {
                    throw th4;
                }
                m.b(obj);
                return obj;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) anonymousClass1.L$0;
            try {
                t1.O(obj);
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th11) {
                        th5 = th11;
                    }
                }
            } catch (Throwable th12) {
                th3 = th12;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th13) {
                        s0.V(th3, th13);
                    }
                }
                th5 = th3;
                obj = null;
            }
        }
        if (th5 != null) {
            throw th5;
        }
        m.b(obj);
        return obj;
    }

    public final void checkClose() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override
    public void close() {
        this.closed.set(true);
    }

    public final o getFileSystem() {
        return this.fileSystem;
    }

    public final z getPath() {
        return this.path;
    }

    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override
    public Object readData(k00.c<? super T> cVar) {
        return readData$suspendImpl(this, cVar);
    }
}
