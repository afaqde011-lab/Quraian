package androidx.glance.appwidget.protobuf;

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

public abstract class p0 {

    public static final char[] f935a;

    static {
        char[] cArr = new char[80];
        f935a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f935a, 0, i11);
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
            sb2.append(c7.i.A(new h(((String) obj).getBytes(e0.f885a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof i) {
            sb2.append(": \"");
            sb2.append(c7.i.A((i) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof z) {
            sb2.append(" {");
            c((z) obj, sb2, i10 + 2);
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

    public static void c(z zVar, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objF;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zVar.getClass().getDeclaredMethods();
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
                    b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), z.f(method4, zVar, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), z.f(method3, zVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objF = z.f(method, zVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objF instanceof Boolean) {
                                    zEquals = !((Boolean) objF).booleanValue();
                                } else if (objF instanceof Integer) {
                                    if (((Integer) objF).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objF).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objF).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objF instanceof String) {
                                    zEquals = objF.equals(RuntimeVersion.SUFFIX);
                                } else if (objF instanceof i) {
                                    zEquals = objF.equals(i.B);
                                } else if ((objF instanceof a) ? !((objF instanceof Enum) && ((Enum) objF).ordinal() == 0) : objF != ((z) ((z) ((a) objF)).d(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) z.f(method2, zVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i10, strSubstring, objF);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objF = z.f(method, zVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objF instanceof Boolean) {
                                zEquals = !((Boolean) objF).booleanValue();
                            } else if (objF instanceof Integer) {
                                if (((Integer) objF).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objF).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objF).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objF instanceof String) {
                                zEquals = objF.equals(RuntimeVersion.SUFFIX);
                            } else if (objF instanceof i) {
                                zEquals = objF.equals(i.B);
                            } else if (objF instanceof a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) z.f(method2, zVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i10, strSubstring, objF);
                        }
                    }
                }
            }
            i11 = i12;
        }
        c1 c1Var = zVar.unknownFields;
        if (c1Var != null) {
            for (int i14 = 0; i14 < c1Var.f876a; i14++) {
                b(sb2, i10, String.valueOf(c1Var.f877b[i14] >>> 3), c1Var.f878c[i14]);
            }
        }
    }
}
