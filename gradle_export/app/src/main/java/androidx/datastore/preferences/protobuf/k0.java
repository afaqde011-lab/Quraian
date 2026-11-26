package androidx.datastore.preferences.protobuf;

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

public abstract class k0 {

    public static final char[] f637a;

    static {
        char[] cArr = new char[80];
        f637a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(f637a, 0, i11);
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
            g gVar = g.C;
            sb2.append(w50.c.B(new g(((String) obj).getBytes(x.f684a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof g) {
            sb2.append(": \"");
            sb2.append(w50.c.B((g) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof v) {
            sb2.append(" {");
            c((v) obj, sb2, i10 + 2);
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

    public static void c(v vVar, StringBuilder sb2, int i10) {
        int i11;
        int i12;
        Method method;
        Method method2;
        Object objE;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = vVar.getClass().getDeclaredMethods();
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
                    b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), v.e(method4, vVar, new Object[0]));
                }
                i11 = i12;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), v.e(method3, vVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objE = v.e(method, vVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objE instanceof Boolean) {
                                    zEquals = !((Boolean) objE).booleanValue();
                                } else if (objE instanceof Integer) {
                                    if (((Integer) objE).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objE).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objE).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objE instanceof String) {
                                    zEquals = objE.equals(RuntimeVersion.SUFFIX);
                                } else if (objE instanceof g) {
                                    zEquals = objE.equals(g.C);
                                } else if ((objE instanceof a) ? !((objE instanceof Enum) && ((Enum) objE).ordinal() == 0) : objE != ((v) ((v) ((a) objE)).c(6))) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) v.e(method2, vVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i10, strSubstring, objE);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objE = v.e(method, vVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objE instanceof Boolean) {
                                zEquals = !((Boolean) objE).booleanValue();
                            } else if (objE instanceof Integer) {
                                if (((Integer) objE).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objE).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objE).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objE instanceof String) {
                                zEquals = objE.equals(RuntimeVersion.SUFFIX);
                            } else if (objE instanceof g) {
                                zEquals = objE.equals(g.C);
                            } else if (objE instanceof a) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) v.e(method2, vVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i10, strSubstring, objE);
                        }
                    }
                }
            }
            i11 = i12;
        }
        b1 b1Var = vVar.unknownFields;
        if (b1Var != null) {
            for (int i14 = 0; i14 < b1Var.f589a; i14++) {
                b(sb2, i10, String.valueOf(b1Var.f590b[i14] >>> 3), b1Var.f591c[i14]);
            }
        }
    }
}
