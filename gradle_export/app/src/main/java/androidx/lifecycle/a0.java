package androidx.lifecycle;

import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class a0 {

    public static final HashMap f972a = new HashMap();

    public static final HashMap f973b = new HashMap();

    public static void a(Constructor constructor, v vVar) {
        try {
            kotlin.jvm.internal.m.b(constructor.newInstance(vVar));
            throw new ClassCastException();
        } catch (IllegalAccessException e3) {
            throw new RuntimeException(e3);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        Class<?>[] interfaces;
        int i10;
        boolean z10;
        HashMap map = f972a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i11 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : RuntimeVersion.SUFFIX;
                kotlin.jvm.internal.m.b(name);
                if (name.length() != 0) {
                    kotlin.jvm.internal.m.b(canonicalName);
                    canonicalName = canonicalName.substring(name.length() + 1);
                    kotlin.jvm.internal.m.d(canonicalName, "substring(...)");
                }
                kotlin.jvm.internal.m.b(canonicalName);
                String strConcat = r30.r.v0(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + '.' + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            }
            HashMap map2 = f973b;
            if (declaredConstructor != null) {
                map2.put(cls, va.a.R(declaredConstructor));
            } else {
                d dVar = d.f982c;
                HashMap map3 = dVar.f984b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((h0) declaredMethods[i12].getAnnotation(h0.class)) != null) {
                                dVar.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i12++;
                        }
                    } catch (NoClassDefFoundError e10) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && v.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.m.b(superclass);
                        if (b(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            kotlin.jvm.internal.m.b(obj);
                            arrayList = new ArrayList((Collection) obj);
                            interfaces = cls.getInterfaces();
                            kotlin.jvm.internal.m.d(interfaces, "getInterfaces(...)");
                            for (Class<?> cls2 : interfaces) {
                                if (cls2 == null && v.class.isAssignableFrom(cls2)) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    kotlin.jvm.internal.m.b(cls2);
                                    if (b(cls2) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(cls2);
                                        kotlin.jvm.internal.m.b(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                map2.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        kotlin.jvm.internal.m.d(interfaces, "getInterfaces(...)");
                        while (i10 < r7) {
                            if (cls2 == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                kotlin.jvm.internal.m.b(cls2);
                                if (b(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    Object obj3 = map2.get(cls2);
                                    kotlin.jvm.internal.m.b(obj3);
                                    arrayList.addAll((Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i11 = 2;
        }
        map.put(cls, Integer.valueOf(i11));
        return i11;
    }
}
