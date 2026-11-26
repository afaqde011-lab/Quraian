package bk;

import a1.u0;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.MalformedJsonException;
import ek.d1;
import ek.t0;
import ek.v0;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class m {

    public static final i f2558k = i.f2550d;
    public static final a l = h.A;
    public static final u m = y.A;

    public static final v f2559n = y.B;

    public final ThreadLocal f2560a;

    public final ConcurrentHashMap f2561b;

    public final u0 f2562c;

    public final ek.l f2563d;

    public final List f2564e;

    public final boolean f2565f;

    public final i f2566g;

    public final List f2567h;

    public final List f2568i;

    public final List f2569j;

    public m() {
        dk.d dVar = dk.d.C;
        Map map = Collections.EMPTY_MAP;
        List list = Collections.EMPTY_LIST;
        this(dVar, l, map, f2558k, list, list, list, m, f2559n, list);
    }

    public m(dk.d dVar, h hVar, Map map, i iVar, List list, List list2, List list3, y yVar, y yVar2, List list4) {
        this.f2560a = new ThreadLocal();
        this.f2561b = new ConcurrentHashMap();
        u0 u0Var = new u0(map, list4);
        this.f2562c = u0Var;
        this.f2565f = true;
        this.f2566g = iVar;
        this.f2567h = list;
        this.f2568i = list2;
        this.f2569j = list4;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d1.A);
        arrayList.add(yVar == y.A ? ek.q.f5442c : new ek.o(yVar, 1));
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(d1.f5416p);
        arrayList.add(d1.f5409g);
        arrayList.add(d1.f5406d);
        arrayList.add(d1.f5407e);
        arrayList.add(d1.f5408f);
        ek.b0 b0Var = d1.f5413k;
        arrayList.add(new v0(Long.TYPE, Long.class, b0Var));
        arrayList.add(new v0(Double.TYPE, Double.class, new j(0)));
        arrayList.add(new v0(Float.TYPE, Float.class, new j(1)));
        arrayList.add(yVar2 == y.B ? ek.p.f5440b : new ek.o(new ek.p(yVar2), 0));
        arrayList.add(d1.f5410h);
        arrayList.add(d1.f5411i);
        arrayList.add(new t0(AtomicLong.class, new k(b0Var, 0).a(), 0));
        int i10 = 0;
        arrayList.add(new t0(AtomicLongArray.class, new k(b0Var, 1).a(), i10));
        arrayList.add(d1.f5412j);
        arrayList.add(d1.l);
        arrayList.add(d1.f5417q);
        arrayList.add(d1.f5418r);
        arrayList.add(new t0(BigDecimal.class, d1.m, i10));
        arrayList.add(new t0(BigInteger.class, d1.f5414n, i10));
        arrayList.add(new t0(dk.j.class, d1.f5415o, i10));
        arrayList.add(d1.f5419s);
        arrayList.add(d1.f5420t);
        arrayList.add(d1.f5422v);
        arrayList.add(d1.f5423w);
        arrayList.add(d1.f5425y);
        arrayList.add(d1.f5421u);
        arrayList.add(d1.f5404b);
        arrayList.add(ek.h.f5428c);
        arrayList.add(d1.f5424x);
        if (hk.f.f7076a) {
            arrayList.add(hk.f.f7078c);
            arrayList.add(hk.f.f7077b);
            arrayList.add(hk.f.f7079d);
        }
        arrayList.add(ek.b.f5397c);
        arrayList.add(d1.f5403a);
        arrayList.add(new ek.d(u0Var, 0));
        arrayList.add(new ek.d(u0Var, 1));
        ek.l lVar = new ek.l(u0Var);
        this.f2563d = lVar;
        arrayList.add(lVar);
        arrayList.add(d1.B);
        arrayList.add(new ek.w(u0Var, hVar, dVar, lVar, list4));
        this.f2564e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d3) {
        if (Double.isNaN(d3) || Double.isInfinite(d3)) {
            throw new IllegalArgumentException(d3 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(ik.a aVar, TypeToken typeToken) {
        int i10 = aVar.O;
        boolean z10 = true;
        if (i10 == 2) {
            aVar.O = 1;
        }
        try {
            try {
                try {
                    aVar.t0();
                    z10 = false;
                    a0 a0VarF = f(typeToken);
                    Object objB = a0VarF.b(aVar);
                    Class clsL = dk.h.l(typeToken.getRawType());
                    if (objB != null && !clsL.isInstance(objB)) {
                        throw new ClassCastException("Type adapter '" + a0VarF + "' returned wrong type; requested " + typeToken.getRawType() + " but got instance of " + objB.getClass() + "\nVerify that the adapter was registered for the correct type.");
                    }
                    if (i10 == 0) {
                        throw null;
                    }
                    aVar.O = i10;
                    return objB;
                } catch (AssertionError e3) {
                    throw new AssertionError("AssertionError (GSON 2.13.1): " + e3.getMessage(), e3);
                } catch (IllegalStateException e10) {
                    throw new JsonSyntaxException(e10);
                }
            } catch (EOFException e11) {
                if (!z10) {
                    throw new JsonSyntaxException(e11);
                }
                if (i10 == 0) {
                    throw null;
                }
                aVar.O = i10;
                return null;
            } catch (IOException e12) {
                throw new JsonSyntaxException(e12);
            }
        } catch (Throwable th2) {
            if (i10 == 0) {
                throw null;
            }
            aVar.O = i10;
            throw th2;
        }
    }

    public final Object c(Reader reader, TypeToken typeToken) {
        ik.a aVar = new ik.a(reader);
        aVar.O = 2;
        Object objB = b(aVar, typeToken);
        if (objB != null) {
            try {
                if (aVar.t0() != 10) {
                    throw new JsonSyntaxException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e3) {
                throw new JsonSyntaxException(e3);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            }
        }
        return objB;
    }

    public final Object d(Class cls, String str) {
        TypeToken typeToken = TypeToken.get(cls);
        if (str == null) {
            return null;
        }
        return c(new StringReader(str), typeToken);
    }

    public final Object e(String str, Type type) {
        TypeToken<?> typeToken = TypeToken.get(type);
        if (str == null) {
            return null;
        }
        return c(new StringReader(str), typeToken);
    }

    public final a0 f(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f2561b;
        a0 a0Var = (a0) concurrentHashMap.get(typeToken);
        if (a0Var != null) {
            return a0Var;
        }
        ThreadLocal threadLocal = this.f2560a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            a0 a0Var2 = (a0) map.get(typeToken);
            if (a0Var2 != null) {
                return a0Var2;
            }
            z10 = false;
        }
        try {
            l lVar = new l();
            map.put(typeToken, lVar);
            Iterator it = this.f2564e.iterator();
            a0 a0VarA = null;
            while (it.hasNext()) {
                a0VarA = ((b0) it.next()).a(this, typeToken);
                if (a0VarA != null) {
                    if (lVar.f2557a != null) {
                        throw new AssertionError("Delegate is already set");
                    }
                    lVar.f2557a = a0VarA;
                    map.put(typeToken, a0VarA);
                    break;
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (a0VarA != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return a0VarA;
            }
            throw new IllegalArgumentException("GSON (2.13.1) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final a0 g(b0 b0Var, TypeToken typeToken) {
        Objects.requireNonNull(b0Var, "skipPast must not be null");
        Objects.requireNonNull(typeToken, "type must not be null");
        ek.l lVar = this.f2563d;
        lVar.getClass();
        ConcurrentHashMap concurrentHashMap = lVar.B;
        if (b0Var == ek.l.C) {
            b0Var = lVar;
        } else {
            Class rawType = typeToken.getRawType();
            b0 b0Var2 = (b0) concurrentHashMap.get(rawType);
            if (b0Var2 == null) {
                ck.a aVar = (ck.a) rawType.getAnnotation(ck.a.class);
                if (aVar != null) {
                    Class clsValue = aVar.value();
                    if (b0.class.isAssignableFrom(clsValue)) {
                        b0 b0Var3 = (b0) lVar.A.C(TypeToken.get(clsValue), true).j();
                        b0 b0Var4 = (b0) concurrentHashMap.putIfAbsent(rawType, b0Var3);
                        if (b0Var4 != null) {
                            b0Var3 = b0Var4;
                        }
                        if (b0Var3 == b0Var) {
                            b0Var = lVar;
                        }
                    }
                }
            } else if (b0Var2 == b0Var) {
                b0Var = lVar;
            }
        }
        boolean z10 = false;
        for (b0 b0Var5 : this.f2564e) {
            if (z10) {
                a0 a0VarA = b0Var5.a(this, typeToken);
                if (a0VarA != null) {
                    return a0VarA;
                }
            } else if (b0Var5 == b0Var) {
                z10 = true;
            }
        }
        if (!z10) {
            return f(typeToken);
        }
        throw new IllegalArgumentException("GSON cannot serialize or deserialize " + typeToken);
    }

    public final ik.b h(Writer writer) {
        ik.b bVar = new ik.b(writer);
        bVar.O(this.f2566g);
        bVar.I = this.f2565f;
        bVar.S(2);
        bVar.K = false;
        return bVar;
    }

    public final String i(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                j(h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            k(obj, cls, h(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final void j(ik.b bVar) {
        r rVar = r.A;
        int i10 = bVar.H;
        boolean z10 = bVar.I;
        boolean z11 = bVar.K;
        bVar.I = this.f2565f;
        bVar.K = false;
        if (i10 == 2) {
            bVar.H = 1;
        }
        try {
            try {
                d1.f5426z.getClass();
                ek.m.e(bVar, rVar);
                bVar.S(i10);
                bVar.I = z10;
                bVar.K = z11;
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            bVar.S(i10);
            bVar.I = z10;
            bVar.K = z11;
            throw th2;
        }
    }

    public final void k(Object obj, Class cls, ik.b bVar) {
        a0 a0VarF = f(TypeToken.get((Type) cls));
        int i10 = bVar.H;
        if (i10 == 2) {
            bVar.H = 1;
        }
        boolean z10 = bVar.I;
        boolean z11 = bVar.K;
        bVar.I = this.f2565f;
        bVar.K = false;
        try {
            try {
                a0VarF.c(bVar, obj);
                bVar.S(i10);
                bVar.I = z10;
                bVar.K = z11;
            } catch (IOException e3) {
                throw new JsonIOException(e3);
            } catch (AssertionError e10) {
                throw new AssertionError("AssertionError (GSON 2.13.1): " + e10.getMessage(), e10);
            }
        } catch (Throwable th2) {
            bVar.S(i10);
            bVar.I = z10;
            bVar.K = z11;
            throw th2;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f2564e + ",instanceCreators:" + this.f2562c + "}";
    }
}
