package d30;

import androidx.media3.common.q;

public class h implements u00.a {
    public final l A;
    public final u00.a B;
    public volatile Object C;

    public h(l lVar, u00.a aVar) {
        if (lVar == null) {
            a(0);
            throw null;
        }
        this.C = k.A;
        this.A = lVar;
        this.B = aVar;
    }

    public static void a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "computable";
        } else if (i == 2 || i == 3) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 2) {
            objArr[1] = "recursionDetected";
        } else if (i != 3) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
        } else {
            objArr[1] = "renderDebugInformation";
        }
        if (i != 2 && i != 3) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 2 && i != 3) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public void e(Object obj) {
    }

    public q f(boolean z) {
        q qVarD = this.A.d(null, "in a lazy value");
        if (qVarD != null) {
            return qVarD;
        }
        a(2);
        throw null;
    }

    @Override
    public Object invoke() {
        Object objInvoke;
        q qVarF;
        k kVar = k.C;
        k kVar2 = k.B;
        Object obj = this.C;
        if (!(obj instanceof k)) {
            n30.l.k(obj);
            return obj;
        }
        this.A.a.lock();
        try {
            Object obj2 = this.C;
            if (!(obj2 instanceof k)) {
                n30.l.k(obj2);
                this.A.a.unlock();
                return obj2;
            }
            if (obj2 == kVar2) {
                this.C = kVar;
                q qVarF2 = f(true);
                if (!qVarF2.B) {
                    objInvoke = qVarF2.C;
                } else if (obj2 == kVar) {
                    qVarF = f(false);
                    if (qVarF.B) {
                        this.C = kVar2;
                        try {
                            objInvoke = this.B.invoke();
                            e(objInvoke);
                            this.C = objInvoke;
                        } catch (Throwable th) {
                            if (n30.l.i(th)) {
                                this.C = k.A;
                                throw th;
                            }
                            if (this.C == kVar2) {
                                this.C = new n30.k(th);
                            }
                            this.A.b.getClass();
                            throw th;
                        }
                    } else {
                        objInvoke = qVarF.C;
                    }
                } else {
                    this.C = kVar2;
                    objInvoke = this.B.invoke();
                    e(objInvoke);
                    this.C = objInvoke;
                }
            } else if (obj2 == kVar) {
                qVarF = f(false);
                if (qVarF.B) {
                    objInvoke = qVarF.C;
                } else {
                    this.C = kVar2;
                    objInvoke = this.B.invoke();
                    e(objInvoke);
                    this.C = objInvoke;
                }
            } else {
                this.C = kVar2;
                objInvoke = this.B.invoke();
                e(objInvoke);
                this.C = objInvoke;
            }
            this.A.a.unlock();
            return objInvoke;
        } catch (Throwable th2) {
            this.A.a.unlock();
            throw th2;
        }
    }
}
