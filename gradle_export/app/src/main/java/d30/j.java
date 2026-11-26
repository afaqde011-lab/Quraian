package d30;

import androidx.media3.common.q;
import java.util.concurrent.ConcurrentHashMap;

public class j implements u00.k {
    public final l A;
    public final ConcurrentHashMap B;
    public final u00.k C;

    public j(l lVar, ConcurrentHashMap concurrentHashMap, u00.k kVar) {
        this.A = lVar;
        this.B = concurrentHashMap;
        this.C = kVar;
    }

    public static void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 3 || i == 4) ? 2 : 3];
        if (i == 1) {
            objArr[0] = "map";
        } else if (i == 2) {
            objArr[0] = "compute";
        } else if (i == 3 || i == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 3) {
            objArr[1] = "recursionDetected";
        } else if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
        } else {
            objArr[1] = "raceCondition";
        }
        if (i != 3 && i != 4) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i != 3 && i != 4) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public final AssertionError e(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Inconsistent key detected. " + k.B + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.A);
        l.e(assertionError);
        return assertionError;
    }

    public final AssertionError f(Object obj, Object obj2) {
        AssertionError assertionError = new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.A);
        l.e(assertionError);
        return assertionError;
    }

    public final AssertionError g(Object obj, Throwable th) {
        AssertionError assertionError = new AssertionError("Unable to remove " + obj + " under " + this.A, th);
        l.e(assertionError);
        return assertionError;
    }

    @Override
    public Object invoke(Object obj) {
        l lVar = this.A;
        a aVar = lVar.b;
        n nVar = lVar.a;
        ConcurrentHashMap concurrentHashMap = this.B;
        Object obj2 = concurrentHashMap.get(obj);
        Object obj3 = n30.l.a;
        AssertionError assertionErrorF = null;
        k kVar = k.B;
        if (obj2 != null && obj2 != kVar) {
            n30.l.k(obj2);
            if (obj2 == obj3) {
                return null;
            }
            return obj2;
        }
        nVar.lock();
        try {
            Object obj4 = concurrentHashMap.get(obj);
            k kVar2 = k.C;
            if (obj4 == kVar) {
                q qVarD = lVar.d(obj, "");
                if (qVarD == null) {
                    a(3);
                    throw null;
                }
                if (!qVarD.B) {
                    Object obj5 = qVarD.C;
                    nVar.unlock();
                    return obj5;
                }
                obj4 = kVar2;
            }
            if (obj4 == kVar2) {
                q qVarD2 = lVar.d(obj, "");
                if (qVarD2 == null) {
                    a(3);
                    throw null;
                }
                if (!qVarD2.B) {
                    Object obj6 = qVarD2.C;
                    nVar.unlock();
                    return obj6;
                }
            }
            if (obj4 != null) {
                n30.l.k(obj4);
                assertionErrorF = obj4 != obj3 ? obj4 : null;
                nVar.unlock();
                return assertionErrorF;
            }
            try {
                concurrentHashMap.put(obj, kVar);
                Object objInvoke = this.C.invoke(obj);
                if (objInvoke != null) {
                    obj3 = objInvoke;
                }
                Object objPut = concurrentHashMap.put(obj, obj3);
                if (objPut == kVar) {
                    nVar.unlock();
                    return objInvoke;
                }
                assertionErrorF = f(obj, objPut);
                throw assertionErrorF;
            } catch (Throwable th) {
                if (n30.l.i(th)) {
                    try {
                        Object objRemove = concurrentHashMap.remove(obj);
                        if (objRemove != kVar) {
                            throw e(obj, objRemove);
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw g(obj, th2);
                    }
                }
                if (th != assertionErrorF) {
                    Object objPut2 = concurrentHashMap.put(obj, new n30.k(th));
                    if (objPut2 != kVar) {
                        throw f(obj, objPut2);
                    }
                    aVar.getClass();
                    throw th;
                }
                try {
                    concurrentHashMap.remove(obj);
                    aVar.getClass();
                    throw th;
                } catch (Throwable th3) {
                    throw g(obj, th3);
                }
            }
            nVar.unlock();
            throw th;
        } catch (Throwable th4) {
            nVar.unlock();
            throw th4;
        }
    }
}
