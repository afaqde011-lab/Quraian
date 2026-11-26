package androidx.datastore.core;

import com.google.protobuf.RuntimeVersion;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;
import u00.o;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Landroidx/datastore/core/StorageConnection;", "readData", "(Landroidx/datastore/core/StorageConnection;Lk00/c;)Ljava/lang/Object;", "value", "Lg00/b0;", "writeData", "(Landroidx/datastore/core/StorageConnection;Ljava/lang/Object;Lk00/c;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StorageConnectionKt {

    @e(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "T", "Landroidx/datastore/core/ReadScope;", "it", RuntimeVersion.SUFFIX}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements o {
        private Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(3, cVar);
        }

        public final Object invoke(ReadScope<T> readScope, boolean z10, c<? super T> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = readScope;
            return anonymousClass2.invokeSuspend(b0.a);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((ReadScope) obj, ((Boolean) obj2).booleanValue(), (c) obj3);
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
            ReadScope readScope = (ReadScope) this.L$0;
            this.label = 1;
            Object data = readScope.readData(this);
            return data == aVar ? aVar : data;
        }
    }

    @e(c = "androidx.datastore.core.StorageConnectionKt$writeData$2", f = "StorageConnection.kt", l = {77}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/datastore/core/WriteScope;", "Lg00/b0;", "<anonymous>", "(Landroidx/datastore/core/WriteScope;)V"}, k = 3, mv = {1, 8, 0})
    public static final class C00142 extends i implements n {
        final T $value;
        private Object L$0;
        int label;

        public C00142(T t4, c<? super C00142> cVar) {
            super(2, cVar);
            this.$value = t4;
        }

        public final c<b0> create(Object obj, c<?> cVar) {
            C00142 c00142 = new C00142(this.$value, cVar);
            c00142.L$0 = obj;
            return c00142;
        }

        public final Object invoke(WriteScope<T> writeScope, c<? super b0> cVar) {
            return create(writeScope, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 == 0) {
                t1.O(obj);
                WriteScope writeScope = (WriteScope) this.L$0;
                T t4 = this.$value;
                this.label = 1;
                if (writeScope.writeData(t4, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            return b0.a;
        }
    }

    public static final <T> Object readData(StorageConnection<T> storageConnection, c<? super T> cVar) {
        return storageConnection.readScope(new AnonymousClass2(null), cVar);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t4, c<? super b0> cVar) {
        Object objWriteScope = storageConnection.writeScope(new C00142(t4, null), cVar);
        return objWriteScope == l00.a.A ? objWriteScope : b0.a;
    }
}
