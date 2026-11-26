package androidx.datastore.core;

import bt.y1;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import d40.j;
import d40.r;
import d40.z;
import g00.b0;
import k00.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m00.e;
import m00.i;
import ri.t1;
import u00.n;
import u00.o;

@e(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {72, 74, 100}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Ld40/j;", "Lg00/b0;", "<anonymous>", "(Ld40/j;)V"}, k = 3, mv = {1, 8, 0})
public final class DataStoreImpl$data$1 extends i implements n {
    private Object L$0;
    Object L$1;
    int label;
    final DataStoreImpl<T> this$0;

    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {MediaError.DetailedErrorCode.MEDIA_DECODE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Ld40/j;", "Landroidx/datastore/core/State;", "Lg00/b0;", "<anonymous>", "(Ld40/j;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends i implements n {
        int label;
        final DataStoreImpl<T> this$0;

        public AnonymousClass1(DataStoreImpl<T> dataStoreImpl, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = dataStoreImpl;
        }

        public final c<b0> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, cVar);
        }

        public final Object invoke(j jVar, c<? super b0> cVar) {
            return create(jVar, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 == 0) {
                t1.O(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.incrementCollector(this) == aVar) {
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

    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", RuntimeVersion.SUFFIX, "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass2 extends i implements n {
        Object L$0;
        int label;

        public AnonymousClass2(c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        public final c<b0> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        public final Object invoke(State<T> state, c<? super Boolean> cVar) {
            return create(state, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return Boolean.valueOf(!(((State) this.L$0) instanceof Final));
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$3", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", RuntimeVersion.SUFFIX, "T", "it", "Landroidx/datastore/core/State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass3 extends i implements n {
        final State<T> $startState;
        Object L$0;
        int label;

        public AnonymousClass3(State<T> state, c<? super AnonymousClass3> cVar) {
            super(2, cVar);
            this.$startState = state;
        }

        public final c<b0> create(Object obj, c<?> cVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$startState, cVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        public final Object invoke(State<T> state, c<? super Boolean> cVar) {
            return create(state, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            State state = (State) this.L$0;
            return Boolean.valueOf((state instanceof Data) && state.getVersion() <= this.$startState.getVersion());
        }
    }

    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$5", f = "DataStoreImpl.kt", l = {116}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Ld40/j;", RuntimeVersion.SUFFIX, "it", "Lg00/b0;", "<anonymous>", "(Ld40/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass5 extends i implements o {
        int label;
        final DataStoreImpl<T> this$0;

        public AnonymousClass5(DataStoreImpl<T> dataStoreImpl, c<? super AnonymousClass5> cVar) {
            super(3, cVar);
            this.this$0 = dataStoreImpl;
        }

        public final Object invoke(j jVar, Throwable th2, c<? super b0> cVar) {
            return new AnonymousClass5(this.this$0, cVar).invokeSuspend(b0.a);
        }

        public final Object invokeSuspend(Object obj) {
            l00.a aVar = l00.a.A;
            int i10 = this.label;
            if (i10 == 0) {
                t1.O(obj);
                DataStoreImpl<T> dataStoreImpl = this.this$0;
                this.label = 1;
                if (dataStoreImpl.decrementCollector(this) == aVar) {
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

    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, c<? super DataStoreImpl$data$1> cVar) {
        super(2, cVar);
        this.this$0 = dataStoreImpl;
    }

    public final c<b0> create(Object obj, c<?> cVar) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, cVar);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    public final Object invoke(j jVar, c<? super b0> cVar) {
        return create(jVar, cVar).invokeSuspend(b0.a);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        j jVar;
        State state;
        j jVar2;
        State state2;
        r rVar;
        l00.a aVar = l00.a.A;
        int i10 = this.label;
        b0 b0Var = b0.a;
        if (i10 == 0) {
            t1.O(obj);
            j jVar3 = (j) this.L$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.L$0 = jVar3;
            this.label = 1;
            Object state3 = dataStoreImpl.readState(false, this);
            if (state3 != aVar) {
                jVar = jVar3;
                obj = state3;
            }
            return aVar;
        }
        if (i10 == 1) {
            jVar = (j) this.L$0;
            t1.O(obj);
        } else {
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
                return b0Var;
            }
            state2 = (State) this.L$1;
            jVar2 = (j) this.L$0;
            t1.O(obj);
        }
        state = state2;
        jVar = jVar2;
        final z zVar = new z(new y1(new y1(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null), 5), new AnonymousClass3(state, null), 0);
        rVar = new r((DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) new d40.i() {

            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lg00/b0;", "emit", "(Ljava/lang/Object;Lk00/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements j {
                final j $this_unsafeFlow;

                @e(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                public static final class AnonymousClass1 extends m00.c {
                    Object L$0;
                    int label;
                    Object result;

                    public AnonymousClass1(c cVar) {
                        super(cVar);
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(j jVar) {
                    this.$this_unsafeFlow = jVar;
                }

                public final Object emit(Object obj, c cVar) throws Throwable {
                    AnonymousClass1 anonymousClass1;
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
                    Object obj2 = anonymousClass1.result;
                    l00.a aVar = l00.a.A;
                    int i11 = anonymousClass1.label;
                    if (i11 == 0) {
                        t1.O(obj2);
                        j jVar = this.$this_unsafeFlow;
                        State state = (State) obj;
                        if (state instanceof ReadException) {
                            throw ((ReadException) state).getReadException();
                        }
                        if (!(state instanceof Data)) {
                            if (state instanceof Final ? true : state instanceof UnInitialized) {
                                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        Object value = ((Data) state).getValue();
                        anonymousClass1.label = 1;
                        if (jVar.emit(value, anonymousClass1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj2);
                    }
                    return b0.a;
                }
            }

            public Object collect(j jVar4, c cVar) {
                Object objCollect = zVar.collect(new AnonymousClass2(jVar4), cVar);
                return objCollect == l00.a.A ? objCollect : b0.a;
            }
        }, new AnonymousClass5(this.this$0, null));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        if (d40.o.q(jVar, rVar, this) != aVar) {
            return aVar;
        }
        return b0Var;
        state = (State) obj;
        if (!(state instanceof Data)) {
            if (state instanceof UnInitialized) {
                throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            }
            if (state instanceof ReadException) {
                throw ((ReadException) state).getReadException();
            }
            if (!(state instanceof Final)) {
                final d40.i zVar2 = new z(new y1(new y1(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null), 5), new AnonymousClass3(state, null), 0);
                rVar = new r((DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) new d40.i() {

                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lg00/b0;", "emit", "(Ljava/lang/Object;Lk00/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                    public static final class AnonymousClass2<T> implements j {
                        final j $this_unsafeFlow;

                        @e(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                        public static final class AnonymousClass1 extends m00.c {
                            Object L$0;
                            int label;
                            Object result;

                            public AnonymousClass1(c cVar) {
                                super(cVar);
                            }

                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        public final Object emit(Object obj, c cVar) throws Throwable {
                            AnonymousClass1 anonymousClass1;
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
                            Object obj2 = anonymousClass1.result;
                            l00.a aVar = l00.a.A;
                            int i11 = anonymousClass1.label;
                            if (i11 == 0) {
                                t1.O(obj2);
                                j jVar = this.$this_unsafeFlow;
                                State state = (State) obj;
                                if (state instanceof ReadException) {
                                    throw ((ReadException) state).getReadException();
                                }
                                if (!(state instanceof Data)) {
                                    if (state instanceof Final ? true : state instanceof UnInitialized) {
                                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                    }
                                    throw new NoWhenBranchMatchedException();
                                }
                                Object value = ((Data) state).getValue();
                                anonymousClass1.label = 1;
                                if (jVar.emit(value, anonymousClass1) == aVar) {
                                    return aVar;
                                }
                            } else {
                                if (i11 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                t1.O(obj2);
                            }
                            return b0.a;
                        }
                    }

                    public Object collect(j jVar4, c cVar) {
                        Object objCollect = zVar2.collect(new AnonymousClass2(jVar4), cVar);
                        return objCollect == l00.a.A ? objCollect : b0.a;
                    }
                }, new AnonymousClass5(this.this$0, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (d40.o.q(jVar, rVar, this) != aVar) {
                    return aVar;
                }
            }
            return b0Var;
        }
        Object value = ((Data) state).getValue();
        this.L$0 = jVar;
        this.L$1 = state;
        this.label = 2;
        if (jVar.emit(value, this) != aVar) {
            jVar2 = jVar;
            state2 = state;
            state = state2;
            jVar = jVar2;
            final d40.i zVar3 = new z(new y1(new y1(((DataStoreImpl) this.this$0).inMemoryCache.getFlow(), new AnonymousClass1(this.this$0, null)), new AnonymousClass2(null), 5), new AnonymousClass3(state, null), 0);
            rVar = new r((DataStoreImpl$data$1$invokeSuspend$$inlined$map$1) new d40.i() {

                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lg00/b0;", "emit", "(Ljava/lang/Object;Lk00/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements j {
                    final j $this_unsafeFlow;

                    @e(c = "androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1$2", f = "DataStoreImpl.kt", l = {223}, m = "emit")
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    public static final class AnonymousClass1 extends m00.c {
                        Object L$0;
                        int label;
                        Object result;

                        public AnonymousClass1(c cVar) {
                            super(cVar);
                        }

                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(j jVar) {
                        this.$this_unsafeFlow = jVar;
                    }

                    public final Object emit(Object obj, c cVar) throws Throwable {
                        AnonymousClass1 anonymousClass1;
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
                        Object obj2 = anonymousClass1.result;
                        l00.a aVar = l00.a.A;
                        int i11 = anonymousClass1.label;
                        if (i11 == 0) {
                            t1.O(obj2);
                            j jVar = this.$this_unsafeFlow;
                            State state = (State) obj;
                            if (state instanceof ReadException) {
                                throw ((ReadException) state).getReadException();
                            }
                            if (!(state instanceof Data)) {
                                if (state instanceof Final ? true : state instanceof UnInitialized) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            Object value = ((Data) state).getValue();
                            anonymousClass1.label = 1;
                            if (jVar.emit(value, anonymousClass1) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t1.O(obj2);
                        }
                        return b0.a;
                    }
                }

                public Object collect(j jVar4, c cVar) {
                    Object objCollect = zVar3.collect(new AnonymousClass2(jVar4), cVar);
                    return objCollect == l00.a.A ? objCollect : b0.a;
                }
            }, new AnonymousClass5(this.this$0, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
            if (d40.o.q(jVar, rVar, this) != aVar) {
                return b0Var;
            }
        }
        return aVar;
    }
}
