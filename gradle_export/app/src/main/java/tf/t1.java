package tf;

import android.os.Bundle;
import com.google.protobuf.RuntimeVersion;
import java.util.EnumMap;
import java.util.Iterator;

public final class t1 {

    public static final t1 f14700c = new t1(100);

    public final EnumMap f14701a;

    public final int f14702b;

    public t1(int i10) {
        EnumMap enumMap = new EnumMap(s1.class);
        this.f14701a = enumMap;
        s1 s1Var = s1.AD_STORAGE;
        q1 q1Var = q1.UNINITIALIZED;
        enumMap.put(s1Var, q1Var);
        enumMap.put(s1.ANALYTICS_STORAGE, q1Var);
        this.f14702b = i10;
    }

    public t1(EnumMap enumMap, int i10) {
        EnumMap enumMap2 = new EnumMap(s1.class);
        this.f14701a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f14702b = i10;
    }

    public static String a(int i10) {
        if (i10 == -30) {
            return "TCF";
        }
        if (i10 == -20) {
            return "API";
        }
        if (i10 == -10) {
            return "MANIFEST";
        }
        if (i10 == 0) {
            return "1P_API";
        }
        if (i10 == 30) {
            return "1P_INIT";
        }
        if (i10 != 90) {
            return i10 != 100 ? "OTHER" : "UNKNOWN";
        }
        return "REMOTE_CONFIG";
    }

    public static t1 b(int i10, Bundle bundle) {
        if (bundle == null) {
            return new t1(i10);
        }
        EnumMap enumMap = new EnumMap(s1.class);
        for (s1 s1Var : r1.STORAGE.A) {
            enumMap.put(s1Var, d(bundle.getString(s1Var.A)));
        }
        return new t1(enumMap, i10);
    }

    public static t1 c(int i10, String str) {
        EnumMap enumMap = new EnumMap(s1.class);
        s1[] s1VarArr = r1.STORAGE.A;
        for (int i11 = 0; i11 < s1VarArr.length; i11++) {
            String str2 = str == null ? RuntimeVersion.SUFFIX : str;
            s1 s1Var = s1VarArr[i11];
            int i12 = i11 + 2;
            if (i12 < str2.length()) {
                enumMap.put(s1Var, e(str2.charAt(i12)));
            } else {
                enumMap.put(s1Var, q1.UNINITIALIZED);
            }
        }
        return new t1(enumMap, i10);
    }

    public static q1 d(String str) {
        q1 q1Var = q1.UNINITIALIZED;
        if (str == null) {
            return q1Var;
        }
        if (str.equals("granted")) {
            return q1.GRANTED;
        }
        return str.equals("denied") ? q1.DENIED : q1Var;
    }

    public static q1 e(char c10) {
        if (c10 == '+') {
            return q1.POLICY;
        }
        if (c10 != '0') {
            return c10 != '1' ? q1.UNINITIALIZED : q1.GRANTED;
        }
        return q1.DENIED;
    }

    public static char h(q1 q1Var) {
        if (q1Var == null) {
            return '-';
        }
        int iOrdinal = q1Var.ordinal();
        if (iOrdinal == 1) {
            return '+';
        }
        if (iOrdinal != 2) {
            return iOrdinal != 3 ? '-' : '1';
        }
        return '0';
    }

    public static boolean l(int i10, int i11) {
        int i12 = -30;
        if (i10 == -20) {
            if (i11 == -30) {
                return true;
            }
            i10 = -20;
        }
        if (i10 != -30) {
            i12 = i10;
        } else if (i11 == -20) {
            return true;
        }
        return i12 == i11 || i10 < i11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        for (s1 s1Var : r1.STORAGE.A) {
            if (this.f14701a.get(s1Var) != t1Var.f14701a.get(s1Var)) {
                return false;
            }
        }
        return this.f14702b == t1Var.f14702b;
    }

    public final String f() {
        int iOrdinal;
        StringBuilder sb2 = new StringBuilder("G1");
        for (s1 s1Var : r1.STORAGE.A) {
            q1 q1Var = (q1) this.f14701a.get(s1Var);
            char c10 = '-';
            if (q1Var != null && (iOrdinal = q1Var.ordinal()) != 0) {
                if (iOrdinal == 1) {
                    c10 = '1';
                } else if (iOrdinal == 2) {
                    c10 = '0';
                } else if (iOrdinal == 3) {
                    c10 = '1';
                }
            }
            sb2.append(c10);
        }
        return sb2.toString();
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder("G1");
        for (s1 s1Var : r1.STORAGE.A) {
            sb2.append(h((q1) this.f14701a.get(s1Var)));
        }
        return sb2.toString();
    }

    public final int hashCode() {
        Iterator it = this.f14701a.values().iterator();
        int iHashCode = this.f14702b * 17;
        while (it.hasNext()) {
            iHashCode = (iHashCode * 31) + ((q1) it.next()).hashCode();
        }
        return iHashCode;
    }

    public final boolean i(s1 s1Var) {
        return ((q1) this.f14701a.get(s1Var)) != q1.DENIED;
    }

    public final t1 j(t1 t1Var) {
        EnumMap enumMap = new EnumMap(s1.class);
        for (s1 s1Var : r1.STORAGE.A) {
            q1 q1Var = (q1) this.f14701a.get(s1Var);
            q1 q1Var2 = (q1) t1Var.f14701a.get(s1Var);
            if (q1Var == null) {
                q1Var = q1Var2;
            } else if (q1Var2 != null) {
                q1 q1Var3 = q1.UNINITIALIZED;
                if (q1Var == q1Var3) {
                    q1Var = q1Var2;
                } else if (q1Var2 != q1Var3) {
                    q1 q1Var4 = q1.POLICY;
                    if (q1Var == q1Var4) {
                        q1Var = q1Var2;
                    } else if (q1Var2 != q1Var4) {
                        q1 q1Var5 = q1.DENIED;
                        q1Var = (q1Var == q1Var5 || q1Var2 == q1Var5) ? q1Var5 : q1.GRANTED;
                    }
                }
            }
            if (q1Var != null) {
                enumMap.put(s1Var, q1Var);
            }
        }
        return new t1(enumMap, 100);
    }

    public final t1 k(t1 t1Var) {
        EnumMap enumMap = new EnumMap(s1.class);
        for (s1 s1Var : r1.STORAGE.A) {
            q1 q1Var = (q1) this.f14701a.get(s1Var);
            if (q1Var == q1.UNINITIALIZED) {
                q1Var = (q1) t1Var.f14701a.get(s1Var);
            }
            if (q1Var != null) {
                enumMap.put(s1Var, q1Var);
            }
        }
        return new t1(enumMap, this.f14702b);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("source=");
        sb2.append(a(this.f14702b));
        for (s1 s1Var : r1.STORAGE.A) {
            sb2.append(",");
            sb2.append(s1Var.A);
            sb2.append("=");
            q1 q1Var = (q1) this.f14701a.get(s1Var);
            if (q1Var == null) {
                q1Var = q1.UNINITIALIZED;
            }
            sb2.append(q1Var);
        }
        return sb2.toString();
    }
}
