package androidx.datastore.core;

import com.google.android.gms.cast.MediaError;
import g00.b0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import m00.c;
import m00.e;
import ri.t1;
import ta.c0;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/datastore/core/FileWriteScope;", "T", "Landroidx/datastore/core/FileReadScope;", "Landroidx/datastore/core/WriteScope;", "Ljava/io/File;", "file", "Landroidx/datastore/core/Serializer;", "serializer", "<init>", "(Ljava/io/File;Landroidx/datastore/core/Serializer;)V", "value", "Lg00/b0;", "writeData", "(Ljava/lang/Object;Lk00/c;)Ljava/lang/Object;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FileWriteScope<T> extends FileReadScope<T> implements WriteScope<T> {

    @e(c = "androidx.datastore.core.FileWriteScope", f = "FileStorage.kt", l = {MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK}, m = "writeData")
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        int label;
        Object result;
        final FileWriteScope<T> this$0;

        public AnonymousClass1(FileWriteScope<T> fileWriteScope, k00.c<? super AnonymousClass1> cVar) {
            super(cVar);
            this.this$0 = fileWriteScope;
        }

        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.writeData(null, this);
        }
    }

    public FileWriteScope(File file, Serializer<T> serializer) {
        super(file, serializer);
        m.e(file, "file");
        m.e(serializer, "serializer");
    }

    @Override
    public Object writeData(T t4, k00.c<? super b0> cVar) throws IOException {
        AnonymousClass1 anonymousClass1;
        java.io.Closeable closeable;
        FileOutputStream fileOutputStream;
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
        l00.a aVar = l00.a.A;
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t1.O(obj);
            checkNotClosed();
            FileOutputStream fileOutputStream2 = new FileOutputStream(getFile());
            try {
                Serializer<T> serializer = getSerializer();
                UncloseableOutputStream uncloseableOutputStream = new UncloseableOutputStream(fileOutputStream2);
                anonymousClass1.L$0 = fileOutputStream2;
                anonymousClass1.L$1 = fileOutputStream2;
                anonymousClass1.label = 1;
                if (serializer.writeTo(t4, uncloseableOutputStream, anonymousClass1) == aVar) {
                    return aVar;
                }
                fileOutputStream = fileOutputStream2;
                closeable = fileOutputStream;
            } catch (Throwable th2) {
                th = th2;
                closeable = fileOutputStream2;
                throw th;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fileOutputStream = (FileOutputStream) anonymousClass1.L$1;
            closeable = (java.io.Closeable) anonymousClass1.L$0;
            try {
                t1.O(obj);
            } catch (Throwable th3) {
                th = th3;
                try {
                    throw th;
                } catch (Throwable th4) {
                    c0.C(closeable, th);
                    throw th4;
                }
            }
        }
        fileOutputStream.getFD().sync();
        c0.C(closeable, null);
        return b0.a;
    }
}
