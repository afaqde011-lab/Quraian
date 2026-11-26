package androidx.datastore.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m00.c;
import m00.e;
import ri.t1;
import ta.c0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/datastore/core/FileReadScope;", "T", "Landroidx/datastore/core/ReadScope;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "readData", "(Lk00/c;)Ljava/lang/Object;", "Lg00/b0;", "close", "()V", "checkNotClosed", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "Landroidx/datastore/core/Serializer;", "getSerializer", "()Landroidx/datastore/core/Serializer;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "closed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class FileReadScope<T> implements ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    @e(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1<T> extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final FileReadScope<T> this$0;

        public AnonymousClass1(FileReadScope<T> fileReadScope, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = fileReadScope;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FileReadScope.readData$suspendImpl(this.this$0, this);
        }
    }

    public FileReadScope(File file, Serializer<T> serializer) {
        m.e(file, "file");
        m.e(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static <T> Object readData$suspendImpl(FileReadScope<T> fileReadScope, k00.c<? super T> cVar) throws IOException {
        AnonymousClass1 anonymousClass1;
        FileInputStream fileInputStream;
        Throwable th2;
        java.io.Closeable closeable;
        Object from;
        java.io.Closeable closeable2;
        Throwable th3;
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fileReadScope, cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fileReadScope, cVar);
        }
        Object obj = anonymousClass1.result;
        l00.a aVar = l00.a.A;
        ?? r4 = anonymousClass1.label;
        try {
            if (r4 != 0) {
                if (r4 == 1) {
                    closeable2 = (java.io.Closeable) anonymousClass1.L$1;
                    r4 = (FileReadScope) anonymousClass1.L$0;
                    try {
                        t1.O(obj);
                        c0.C(closeable2, null);
                        return obj;
                    } catch (Throwable th4) {
                        th3 = th4;
                        try {
                            throw th3;
                        } catch (Throwable th5) {
                            c0.C(closeable2, th3);
                            throw th5;
                        }
                    }
                }
                if (r4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable = (java.io.Closeable) anonymousClass1.L$0;
                try {
                    t1.O(obj);
                    c0.C(closeable, null);
                    return obj;
                } catch (Throwable th6) {
                    th2 = th6;
                    try {
                        throw th2;
                    } catch (Throwable th7) {
                        c0.C(closeable, th2);
                        throw th7;
                    }
                }
            }
            t1.O(obj);
            fileReadScope.checkNotClosed();
            try {
                FileInputStream fileInputStream2 = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    Serializer<T> serializer = ((FileReadScope) fileReadScope).serializer;
                    anonymousClass1.L$0 = fileReadScope;
                    anonymousClass1.L$1 = fileInputStream2;
                    anonymousClass1.label = 1;
                    Object from2 = serializer.readFrom(fileInputStream2, anonymousClass1);
                    if (from2 != aVar) {
                        closeable2 = fileInputStream2;
                        obj = from2;
                        c0.C(closeable2, null);
                        return obj;
                    }
                    return aVar;
                } catch (Throwable th8) {
                    r4 = fileReadScope;
                    closeable2 = fileInputStream2;
                    th3 = th8;
                    throw th3;
                }
            } catch (FileNotFoundException unused) {
                if (((FileReadScope) fileReadScope).file.exists()) {
                    return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
                }
                fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
                try {
                    Serializer<T> serializer2 = ((FileReadScope) fileReadScope).serializer;
                    anonymousClass1.L$0 = fileInputStream;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    from = serializer2.readFrom(fileInputStream, anonymousClass1);
                    if (from != aVar) {
                        obj = from;
                        closeable = fileInputStream;
                        c0.C(closeable, null);
                        return obj;
                    }
                } catch (Throwable th9) {
                    th2 = th9;
                    closeable = fileInputStream;
                    throw th2;
                }
            }
        } catch (FileNotFoundException unused2) {
            fileReadScope = (FileReadScope<T>) r4;
            if (((FileReadScope) fileReadScope).file.exists()) {
                return ((FileReadScope) fileReadScope).serializer.getDefaultValue();
            }
            fileInputStream = new FileInputStream(((FileReadScope) fileReadScope).file);
            Serializer<T> serializer3 = ((FileReadScope) fileReadScope).serializer;
            anonymousClass1.L$0 = fileInputStream;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
            from = serializer3.readFrom(fileInputStream, anonymousClass1);
            if (from != aVar) {
                obj = from;
                closeable = fileInputStream;
                c0.C(closeable, null);
                return obj;
            }
            return aVar;
        }
    }

    public final void checkNotClosed() {
        if (this.closed.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
    }

    @Override
    public void close() {
        this.closed.set(true);
    }

    public final File getFile() {
        return this.file;
    }

    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override
    public Object readData(k00.c<? super T> cVar) {
        return readData$suspendImpl(this, cVar);
    }
}
