package androidx.datastore.core.okio;

import androidx.datastore.core.WriteScope;
import bi.b;
import g00.b0;
import java.io.Closeable;
import k50.o;
import k50.u;
import k50.z;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l00.a;
import m00.c;
import m00.e;
import qd.s0;
import ri.t1;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/datastore/core/okio/OkioWriteScope;", "T", "Landroidx/datastore/core/okio/OkioReadScope;", "Landroidx/datastore/core/WriteScope;", "Lk50/o;", "fileSystem", "Lk50/z;", "path", "Landroidx/datastore/core/okio/OkioSerializer;", "serializer", "<init>", "(Lk50/o;Lk50/z;Landroidx/datastore/core/okio/OkioSerializer;)V", "value", "Lg00/b0;", "writeData", "(Ljava/lang/Object;Lk00/c;)Ljava/lang/Object;", "datastore-core-okio"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkioWriteScope<T> extends OkioReadScope<T> implements WriteScope<T> {

    @e(c = "androidx.datastore.core.okio.OkioWriteScope", f = "OkioStorage.kt", l = {216}, m = "writeData")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        Object result;
        final OkioWriteScope<T> this$0;

        public AnonymousClass1(OkioWriteScope<T> okioWriteScope, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = okioWriteScope;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    public OkioWriteScope(o oVar, z zVar, OkioSerializer<T> okioSerializer) {
        super(oVar, zVar, okioSerializer);
        m.e(oVar, "fileSystem");
        m.e(zVar, "path");
        m.e(okioSerializer, "serializer");
    }

    @Override
    public Object writeData(T t4, k00.c<? super b0> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Closeable closeableL;
        Closeable closeable;
        Closeable closeable2;
        Closeable closeable3;
        b0 b0Var;
        Throwable th2;
        b0 b0Var2;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, cVar);
        }
        Object obj = anonymousClass1.result;
        a aVar = a.A;
        int i11 = anonymousClass1.label;
        b0 b0Var3 = b0.a;
        Throwable th3 = null;
        if (i11 == 0) {
            t1.O(obj);
            checkClose();
            o fileSystem = getFileSystem();
            z path = getPath();
            fileSystem.getClass();
            m.e(path, "file");
            closeableL = fileSystem.l(path);
            try {
                Closeable closeableQ = b.q(u.a(closeableL));
                try {
                    OkioSerializer<T> serializer = getSerializer();
                    anonymousClass1.L$0 = closeableL;
                    anonymousClass1.L$1 = closeableL;
                    anonymousClass1.L$2 = closeableQ;
                    anonymousClass1.label = 1;
                    if (serializer.writeTo(t4, closeableQ, anonymousClass1) == aVar) {
                        return aVar;
                    }
                    closeable3 = closeableL;
                    closeable = closeable3;
                    closeable2 = closeableQ;
                } catch (Throwable th4) {
                    th = th4;
                    closeable = closeableL;
                    closeable2 = closeableQ;
                    if (closeable2 != null) {
                        closeable2.close();
                    }
                    th2 = th;
                    b0Var2 = null;
                }
            } catch (Throwable th5) {
                th = th5;
                if (closeableL != null) {
                    closeableL.close();
                }
                th3 = th;
                b0Var = null;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeable2 = (Closeable) anonymousClass1.L$2;
            closeable3 = (u) anonymousClass1.L$1;
            closeable = (Closeable) anonymousClass1.L$0;
            try {
                t1.O(obj);
            } catch (Throwable th6) {
                th = th6;
                if (closeable2 != null) {
                    try {
                        closeable2.close();
                    } catch (Throwable th7) {
                        try {
                            s0.V(th, th7);
                        } catch (Throwable th8) {
                            th = th8;
                            closeableL = closeable;
                            if (closeableL != null) {
                                try {
                                    closeableL.close();
                                } catch (Throwable th9) {
                                    s0.V(th, th9);
                                }
                            }
                            th3 = th;
                            b0Var = null;
                        }
                    }
                }
                th2 = th;
                b0Var2 = null;
            }
        }
        closeable3.flush();
        if (closeable2 != null) {
            try {
                closeable2.close();
            } catch (Throwable th10) {
                th2 = th10;
            }
        }
        th2 = null;
        b0Var2 = b0Var3;
        Closeable closeable4 = closeable;
        if (th2 != null) {
            throw th2;
        }
        m.b(b0Var2);
        if (closeable4 != null) {
            try {
                closeable4.close();
            } catch (Throwable th11) {
                th3 = th11;
            }
        }
        b0Var = b0Var3;
        if (th3 != null) {
            throw th3;
        }
        m.b(b0Var);
        return b0Var3;
    }
}
