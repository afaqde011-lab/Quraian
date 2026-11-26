package l60;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class r {
    public final a1.b0 a;
    public final x40.e b;
    public final m c;

    public r(a1.b0 b0Var, x40.e eVar, m mVar) {
        this.a = b0Var;
        this.b = eVar;
        this.c = mVar;
    }

    public static r b(q0 q0Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        w0 w0Var;
        int i;
        int i2;
        w0[] w0VarArr;
        int i3;
        int i4;
        w0 i0Var;
        w0 e0Var;
        z zVar;
        z zVar2;
        n0 n0Var = new n0(q0Var, cls, method);
        Annotation[] annotationArr = n0Var.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str = "HEAD";
            boolean z4 = true;
            w0 w0Var2 = null;
            if (i6 >= length) {
                if (n0Var.o == null) {
                    throw w0.m(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!n0Var.p) {
                    if (n0Var.r) {
                        throw w0.m(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (n0Var.q) {
                        throw w0.m(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = n0Var.e;
                int length2 = annotationArr2.length;
                n0Var.w = new w0[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    w0[] w0VarArr2 = n0Var.w;
                    Type type = n0Var.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        w0Var = w0Var2;
                        int i11 = i5;
                        while (i11 < length3) {
                            Annotation annotation = annotationArr3[i11];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i12 = length2;
                            if (annotation instanceof n60.y) {
                                n0Var.c(i8, type);
                                if (n0Var.n) {
                                    throw w0.n(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (n0Var.j) {
                                    throw w0.n(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (n0Var.k) {
                                    throw w0.n(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (n0Var.l) {
                                    throw w0.n(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (n0Var.m) {
                                    throw w0.n(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (n0Var.s != null) {
                                    throw w0.n(method, i8, "@Url cannot be used with @%s URL", n0Var.o);
                                }
                                n0Var.n = true;
                                if (type != x40.q.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw w0.n(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                i0Var = new d0(method, i8, 1);
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof n60.s;
                                q0 q0Var2 = n0Var.a;
                                if (z5) {
                                    n0Var.c(i8, type);
                                    if (n0Var.k) {
                                        throw w0.n(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (n0Var.l) {
                                        throw w0.n(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (n0Var.m) {
                                        throw w0.n(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (n0Var.n) {
                                        throw w0.n(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (n0Var.s == null) {
                                        throw w0.n(method, i8, "@Path can only be used with relative url on @%s", n0Var.o);
                                    }
                                    n0Var.j = true;
                                    n60.s sVar = (n60.s) annotation;
                                    String strValue = sVar.value();
                                    if (!n0.z.matcher(strValue).matches()) {
                                        throw w0.n(method, i8, "@Path parameter name must match %s. Found: %s", n0.y.pattern(), strValue);
                                    }
                                    if (!n0Var.v.contains(strValue)) {
                                        throw w0.n(method, i8, "URL \"%s\" does not contain \"{%s}\".", n0Var.s, strValue);
                                    }
                                    q0Var2.e(type, annotationArr3);
                                    i0Var = new f0(n0Var.c, i8, strValue, sVar.encoded());
                                } else {
                                    i2 = i11;
                                    w0VarArr = w0VarArr2;
                                    if (annotation instanceof n60.t) {
                                        n0Var.c(i8, type);
                                        n60.t tVar = (n60.t) annotation;
                                        String strValue2 = tVar.value();
                                        boolean zEncoded = tVar.encoded();
                                        i3 = i9;
                                        Class clsH = w0.h(type);
                                        i4 = length3;
                                        n0Var.k = true;
                                        if (!Iterable.class.isAssignableFrom(clsH)) {
                                            if (clsH.isArray()) {
                                                q0Var2.e(n0.a(clsH.getComponentType()), annotationArr3);
                                                zVar2 = new z(new b0(strValue2, 2, zEncoded), 1);
                                            } else {
                                                q0Var2.e(type, annotationArr3);
                                                i0Var = new b0(strValue2, 2, zEncoded);
                                            }
                                            str = str;
                                        } else {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw w0.n(method, i8, clsH.getSimpleName() + " must include generic type (e.g., " + clsH.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            q0Var2.e(w0.g(0, (ParameterizedType) type), annotationArr3);
                                            zVar2 = new z(new b0(strValue2, 2, zEncoded), 0);
                                        }
                                        i0Var = zVar2;
                                        str = str;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof n60.v) {
                                            n0Var.c(i8, type);
                                            boolean zEncoded2 = ((n60.v) annotation).encoded();
                                            Class clsH2 = w0.h(type);
                                            n0Var.l = true;
                                            if (Iterable.class.isAssignableFrom(clsH2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw w0.n(method, i8, clsH2.getSimpleName() + " must include generic type (e.g., " + clsH2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                q0Var2.e(w0.g(0, (ParameterizedType) type), annotationArr3);
                                                zVar2 = new z(new g0(zEncoded2), 0);
                                            } else if (clsH2.isArray()) {
                                                q0Var2.e(n0.a(clsH2.getComponentType()), annotationArr3);
                                                zVar2 = new z(new g0(zEncoded2), 1);
                                            } else {
                                                q0Var2.e(type, annotationArr3);
                                                i0Var = new g0(zEncoded2);
                                            }
                                            i0Var = zVar2;
                                        } else if (annotation instanceof n60.u) {
                                            n0Var.c(i8, type);
                                            Class clsH3 = w0.h(type);
                                            n0Var.m = true;
                                            if (!Map.class.isAssignableFrom(clsH3)) {
                                                throw w0.n(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeI = w0.i(type, clsH3);
                                            if (!(typeI instanceof ParameterizedType)) {
                                                throw w0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeI;
                                            Type typeG = w0.g(0, parameterizedType);
                                            if (String.class != typeG) {
                                                throw w0.n(method, i8, "@QueryMap keys must be of type String: " + typeG, new Object[0]);
                                            }
                                            q0Var2.e(w0.g(1, parameterizedType), annotationArr3);
                                            i0Var = new c0(i8, 2, method, ((n60.u) annotation).encoded());
                                        } else {
                                            str = str;
                                            if (annotation instanceof n60.i) {
                                                n0Var.c(i8, type);
                                                n60.i iVar = (n60.i) annotation;
                                                String strValue3 = iVar.value();
                                                Class clsH4 = w0.h(type);
                                                if (Iterable.class.isAssignableFrom(clsH4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw w0.n(method, i8, clsH4.getSimpleName() + " must include generic type (e.g., " + clsH4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    q0Var2.e(w0.g(0, (ParameterizedType) type), annotationArr3);
                                                    e0Var = new z(new b0(strValue3, 1, iVar.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsH4.isArray()) {
                                                    q0Var2.e(n0.a(clsH4.getComponentType()), annotationArr3);
                                                    e0Var = new z(new b0(strValue3, 1, iVar.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    q0Var2.e(type, annotationArr3);
                                                    i0Var = new b0(strValue3, 1, iVar.allowUnsafeNonAsciiValues());
                                                }
                                                i0Var = e0Var;
                                            } else if (annotation instanceof n60.j) {
                                                if (type == x40.p.class) {
                                                    i0Var = new d0(method, i8, 0);
                                                } else {
                                                    n0Var.c(i8, type);
                                                    Class clsH5 = w0.h(type);
                                                    if (!Map.class.isAssignableFrom(clsH5)) {
                                                        throw w0.n(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeI2 = w0.i(type, clsH5);
                                                    if (!(typeI2 instanceof ParameterizedType)) {
                                                        throw w0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeI2;
                                                    Type typeG2 = w0.g(0, parameterizedType2);
                                                    if (String.class != typeG2) {
                                                        throw w0.n(method, i8, "@HeaderMap keys must be of type String: " + typeG2, new Object[0]);
                                                    }
                                                    q0Var2.e(w0.g(1, parameterizedType2), annotationArr3);
                                                    i0Var = new c0(i8, 1, method, ((n60.j) annotation).allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof n60.c) {
                                                n0Var.c(i8, type);
                                                if (!n0Var.q) {
                                                    throw w0.n(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                n60.c cVar = (n60.c) annotation;
                                                String strValue4 = cVar.value();
                                                boolean zEncoded3 = cVar.encoded();
                                                n0Var.g = true;
                                                Class clsH6 = w0.h(type);
                                                if (Iterable.class.isAssignableFrom(clsH6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw w0.n(method, i8, clsH6.getSimpleName() + " must include generic type (e.g., " + clsH6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    q0Var2.e(w0.g(0, (ParameterizedType) type), annotationArr3);
                                                    e0Var = new z(new b0(strValue4, 0, zEncoded3), 0);
                                                } else if (clsH6.isArray()) {
                                                    q0Var2.e(n0.a(clsH6.getComponentType()), annotationArr3);
                                                    e0Var = new z(new b0(strValue4, 0, zEncoded3), 1);
                                                } else {
                                                    q0Var2.e(type, annotationArr3);
                                                    i0Var = new b0(strValue4, 0, zEncoded3);
                                                }
                                                i0Var = e0Var;
                                            } else if (annotation instanceof n60.d) {
                                                n0Var.c(i8, type);
                                                if (!n0Var.q) {
                                                    throw w0.n(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsH7 = w0.h(type);
                                                if (!Map.class.isAssignableFrom(clsH7)) {
                                                    throw w0.n(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI3 = w0.i(type, clsH7);
                                                if (!(typeI3 instanceof ParameterizedType)) {
                                                    throw w0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeI3;
                                                Type typeG3 = w0.g(0, parameterizedType3);
                                                if (String.class != typeG3) {
                                                    throw w0.n(method, i8, "@FieldMap keys must be of type String: " + typeG3, new Object[0]);
                                                }
                                                q0Var2.e(w0.g(1, parameterizedType3), annotationArr3);
                                                n0Var.g = true;
                                                i0Var = new c0(i8, 0, method, ((n60.d) annotation).encoded());
                                            } else if (annotation instanceof n60.q) {
                                                n0Var.c(i8, type);
                                                if (!n0Var.r) {
                                                    throw w0.n(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                n60.q qVar = (n60.q) annotation;
                                                n0Var.h = true;
                                                String strValue5 = qVar.value();
                                                Class clsH8 = w0.h(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsH8);
                                                    h0 h0Var = h0.d;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw w0.n(method, i8, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!x40.t.class.isAssignableFrom(w0.h(w0.g(0, (ParameterizedType) type)))) {
                                                            throw w0.n(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        i0Var = new z(h0Var, 0);
                                                    } else if (clsH8.isArray()) {
                                                        if (!x40.t.class.isAssignableFrom(clsH8.getComponentType())) {
                                                            throw w0.n(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        i0Var = new z(h0Var, 1);
                                                    } else {
                                                        if (!x40.t.class.isAssignableFrom(clsH8)) {
                                                            throw w0.n(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        i0Var = h0Var;
                                                    }
                                                } else {
                                                    x40.p pVarB = w00.a.B("Content-Disposition", a1.b.p("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qVar.encoding());
                                                    if (Iterable.class.isAssignableFrom(clsH8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw w0.n(method, i8, clsH8.getSimpleName() + " must include generic type (e.g., " + clsH8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeG4 = w0.g(0, (ParameterizedType) type);
                                                        if (x40.t.class.isAssignableFrom(w0.h(typeG4))) {
                                                            throw w0.n(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        zVar = new z(new e0(method, i8, pVarB, q0Var2.c(typeG4, annotationArr3, annotationArr)), 0);
                                                    } else if (clsH8.isArray()) {
                                                        Class clsA = n0.a(clsH8.getComponentType());
                                                        if (x40.t.class.isAssignableFrom(clsA)) {
                                                            throw w0.n(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        zVar = new z(new e0(method, i8, pVarB, q0Var2.c(clsA, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (x40.t.class.isAssignableFrom(clsH8)) {
                                                            throw w0.n(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        e0Var = new e0(method, i8, pVarB, q0Var2.c(type, annotationArr3, annotationArr));
                                                        i0Var = e0Var;
                                                    }
                                                    i0Var = zVar;
                                                }
                                            } else if (annotation instanceof n60.r) {
                                                n0Var.c(i8, type);
                                                if (!n0Var.r) {
                                                    throw w0.n(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                n0Var.h = true;
                                                Class clsH9 = w0.h(type);
                                                if (!Map.class.isAssignableFrom(clsH9)) {
                                                    throw w0.n(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeI4 = w0.i(type, clsH9);
                                                if (!(typeI4 instanceof ParameterizedType)) {
                                                    throw w0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeI4;
                                                Type typeG5 = w0.g(0, parameterizedType4);
                                                if (String.class != typeG5) {
                                                    throw w0.n(method, i8, "@PartMap keys must be of type String: " + typeG5, new Object[0]);
                                                }
                                                Type typeG6 = w0.g(1, parameterizedType4);
                                                if (x40.t.class.isAssignableFrom(w0.h(typeG6))) {
                                                    throw w0.n(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                i0Var = new e0(method, i8, q0Var2.c(typeG6, annotationArr3, annotationArr), ((n60.r) annotation).encoding());
                                            } else if (annotation instanceof n60.a) {
                                                n0Var.c(i8, type);
                                                if (n0Var.q || n0Var.r) {
                                                    throw w0.n(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (n0Var.i) {
                                                    throw w0.n(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    m mVarC = q0Var2.c(type, annotationArr3, annotationArr);
                                                    n0Var.i = true;
                                                    i0Var = new a0(method, i8, mVarC);
                                                } catch (RuntimeException e) {
                                                    throw w0.o(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof n60.x) {
                                                n0Var.c(i8, type);
                                                Class clsA2 = n0.a(w0.h(type));
                                                for (int i13 = i8 - 1; i13 >= 0; i13--) {
                                                    w0 w0Var3 = n0Var.w[i13];
                                                    if ((w0Var3 instanceof i0) && ((i0) w0Var3).d.equals(clsA2)) {
                                                        throw w0.n(method, i8, "@Tag type " + clsA2.getName() + " is duplicate of " + j0.b.c(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                i0Var = new i0(clsA2);
                                            } else {
                                                i0Var = null;
                                            }
                                        }
                                        str = str;
                                    }
                                }
                                if (i0Var != null) {
                                    if (w0Var == null) {
                                        throw w0.n(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    w0Var = i0Var;
                                }
                                i11 = i2 + 1;
                                annotationArr2 = annotationArr4;
                                i7 = i;
                                length2 = i12;
                                i9 = i3;
                                str = str;
                                w0VarArr2 = w0VarArr;
                                length3 = i4;
                            }
                            i2 = i11;
                            w0VarArr = w0VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (i0Var != null) {
                                if (w0Var == null) {
                                    throw w0.n(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                }
                                w0Var = i0Var;
                            }
                            i11 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i12;
                            i9 = i3;
                            str = str;
                            w0VarArr2 = w0VarArr;
                            length3 = i4;
                        }
                    } else {
                        w0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length2;
                    String str2 = str;
                    int i15 = i7;
                    w0[] w0VarArr3 = w0VarArr2;
                    int i16 = i9;
                    if (w0Var == null) {
                        if (i16 != 0) {
                            try {
                                if (w0.h(type) == k00.c.class) {
                                    n0Var.x = true;
                                    w0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw w0.n(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    w0VarArr3[i8] = w0Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i15;
                    length2 = i14;
                    str = str2;
                    i5 = 0;
                    w0Var2 = null;
                }
                String str3 = str;
                if (n0Var.s == null && !n0Var.n) {
                    throw w0.m(method, null, "Missing either @%s URL or @Url parameter.", n0Var.o);
                }
                boolean z6 = n0Var.q;
                if (!z6 && !n0Var.r && !n0Var.p && n0Var.i) {
                    throw w0.m(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !n0Var.g) {
                    throw w0.m(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (n0Var.r && !n0Var.h) {
                    throw w0.m(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                a1.b0 b0Var = new a1.b0(n0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (w0.j(genericReturnType2)) {
                    throw w0.m(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw w0.m(method, null, "Service methods cannot return void.", new Object[0]);
                }
                boolean z7 = b0Var.d;
                Annotation[] annotations = method.getAnnotations();
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeG7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeG7 instanceof WildcardType) {
                        typeG7 = ((WildcardType) typeG7).getLowerBounds()[0];
                    }
                    if (w0.h(typeG7) == o0.class && (typeG7 instanceof ParameterizedType)) {
                        typeG7 = w0.g(0, (ParameterizedType) typeG7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (w0.h(typeG7) == d.class) {
                            throw w0.m(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", w0.g(0, (ParameterizedType) typeG7));
                        }
                        z3 = w0.b && typeG7 == g00.b0.class;
                        z2 = false;
                    }
                    genericReturnType = new u0(null, d.class, typeG7);
                    if (!w0.l(annotations, r0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = s0.a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    f fVarA = q0Var.a(genericReturnType, annotations);
                    Type typeD = fVarA.d();
                    if (typeD == x40.b0.class) {
                        throw w0.m(method, null, "'" + w0.h(typeD).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeD == o0.class) {
                        throw w0.m(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (((String) b0Var.h).equals(str3) && !Void.class.equals(typeD) && (!w0.b || typeD != g00.b0.class)) {
                        throw w0.m(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        m mVarD = q0Var.d(typeD, method.getAnnotations());
                        x40.e eVar = q0Var.b;
                        if (z7) {
                            return z2 ? new p(b0Var, eVar, mVarD, fVarA, 1) : new q(b0Var, eVar, mVarD, fVarA, z);
                        }
                        return new p(b0Var, eVar, mVarD, fVarA, 0);
                    } catch (RuntimeException e2) {
                        throw w0.m(method, e2, "Unable to create converter for %s", typeD);
                    }
                } catch (RuntimeException e3) {
                    throw w0.m(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof n60.b) {
                n0Var.b("DELETE", ((n60.b) annotation2).value(), false);
            } else if (annotation2 instanceof n60.f) {
                n0Var.b("GET", ((n60.f) annotation2).value(), false);
            } else if (annotation2 instanceof n60.g) {
                n0Var.b("HEAD", ((n60.g) annotation2).value(), false);
            } else if (annotation2 instanceof n60.n) {
                n0Var.b("PATCH", ((n60.n) annotation2).value(), true);
            } else if (annotation2 instanceof n60.o) {
                n0Var.b("POST", ((n60.o) annotation2).value(), true);
            } else if (annotation2 instanceof n60.p) {
                n0Var.b("PUT", ((n60.p) annotation2).value(), true);
            } else if (annotation2 instanceof n60.m) {
                n0Var.b("OPTIONS", ((n60.m) annotation2).value(), false);
            } else if (annotation2 instanceof n60.h) {
                n60.h hVar = (n60.h) annotation2;
                n0Var.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof n60.k) {
                n60.k kVar = (n60.k) annotation2;
                String[] strArrValue = kVar.value();
                if (strArrValue.length == 0) {
                    throw w0.m(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                db.g gVar = new db.g(9, (byte) 0);
                int length4 = strArrValue.length;
                int i17 = 0;
                while (i17 < length4) {
                    String str4 = strArrValue[i17];
                    int iIndexOf = str4.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str4.length() - 1) {
                        throw w0.m(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                    }
                    String strSubstring = str4.substring(0, iIndexOf);
                    String strTrim = str4.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Pattern pattern = x40.s.d;
                            n0Var.u = w50.c.H(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw w0.m(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        gVar.g(strSubstring, strTrim);
                    } else {
                        gVar.b(strSubstring, strTrim);
                    }
                    i17++;
                    z4 = z8;
                }
                n0Var.t = gVar.j();
            } else if (annotation2 instanceof n60.l) {
                if (n0Var.q) {
                    throw w0.m(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                n0Var.r = true;
            } else if (!(annotation2 instanceof n60.e)) {
                continue;
            } else {
                if (n0Var.r) {
                    throw w0.m(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                n0Var.q = true;
            }
            i6++;
        }
    }

    public abstract Object a(y yVar, Object[] objArr);
}
