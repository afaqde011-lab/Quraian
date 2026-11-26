package com.google.crypto.tink.shaded.protobuf;

import com.google.protobuf.RuntimeVersion;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class q0 {

    public static final char[] f4309a;

    static {
        char[] cArr = new char[80];
        f4309a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f4309a, 0, i11);
            i10 -= i11;
        }
    }

    public static void b(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            h hVar = i.B;
            sb2.append(w50.c.C(new h(((String) obj).getBytes(b0.f4244a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof i) {
            sb2.append(": \"");
            sb2.append(w50.c.C((i) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof x) {
            sb2.append(" {");
            c((x) obj, sb2, i10 + 2);
            sb2.append("\n");
            a(i10, sb2);
            sb2.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i12 = i10 + 2;
        b(sb2, i12, "key", entry.getKey());
        b(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        a(i10, sb2);
        sb2.append("}");
    }

    public static void c(x xVar, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objK;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = xVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i11 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null) {
                i12 = i11;
            } else {
                i12 = i11;
                if (method4.getReturnType().equals(List.class)) {
                    b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), x.k(method4, xVar, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), x.k(method3, xVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objK = x.k(method, xVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objK instanceof Boolean) {
                                    zEquals = !((Boolean) objK).booleanValue();
                                } else if (objK instanceof Integer) {
                                    if (((Integer) objK).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objK instanceof String) {
                                    zEquals = objK.equals(RuntimeVersion.SUFFIX);
                                } else if (objK instanceof i) {
                                    zEquals = objK.equals(i.B);
                                } else if ((objK instanceof a) ? !((objK instanceof Enum) && ((Enum) objK).ordinal() == 0) : objK != ((a) objK).getDefaultInstanceForType()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) x.k(method2, xVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i10, strSubstring, objK);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objK = x.k(method, xVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objK instanceof Boolean) {
                                zEquals = !((Boolean) objK).booleanValue();
                            } else if (objK instanceof Integer) {
                                if (((Integer) objK).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objK instanceof String) {
                                zEquals = objK.equals(RuntimeVersion.SUFFIX);
                            } else if (objK instanceof i) {
                                zEquals = objK.equals(i.B);
                            } else if (objK instanceof a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) x.k(method2, xVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i10, strSubstring, objK);
                        }
                    }
                }
            }
            i11 = i12;
        }
        d1 d1Var = xVar.unknownFields;
        if (d1Var != null) {
            for (int i14 = 0; i14 < d1Var.f4256a; i14++) {
                b(sb2, i10, String.valueOf(d1Var.f4257b[i14] >>> 3), d1Var.f4258c[i14]);
            }
        }
    }
}
