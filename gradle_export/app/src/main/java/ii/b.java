package ii;

import androidx.media3.common.o0;
import com.google.android.gms.internal.measurement.b5;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class b {

    public final String f7676a;

    public final Set f7677b;

    public final Set f7678c;

    public final int f7679d;

    public final int f7680e;

    public final e f7681f;

    public final Set f7682g;

    public b(String str, Set set, Set set2, int i10, int i11, e eVar, Set set3) {
        this.f7676a = str;
        this.f7677b = Collections.unmodifiableSet(set);
        this.f7678c = Collections.unmodifiableSet(set2);
        this.f7679d = i10;
        this.f7680e = i11;
        this.f7681f = eVar;
        this.f7682g = Collections.unmodifiableSet(set3);
    }

    public static o0 a(p pVar) {
        p[] pVarArr = new p[0];
        o0 o0Var = new o0();
        o0Var.f1358a = null;
        HashSet hashSet = new HashSet();
        o0Var.f1361d = hashSet;
        o0Var.f1362e = new HashSet();
        o0Var.f1359b = 0;
        o0Var.f1360c = 0;
        o0Var.f1364g = new HashSet();
        hashSet.add(pVar);
        for (p pVar2 : pVarArr) {
            b5.m(pVar2, "Null interface");
        }
        Collections.addAll((HashSet) o0Var.f1361d, pVarArr);
        return o0Var;
    }

    public static o0 b(Class cls) {
        return new o0(cls, new Class[0]);
    }

    public static b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(p.a(cls));
        for (Class cls2 : clsArr) {
            b5.m(cls2, "Null interface");
            hashSet.add(p.a(cls2));
        }
        return new b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a(obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f7677b.toArray()) + ">{" + this.f7679d + ", type=" + this.f7680e + ", deps=" + Arrays.toString(this.f7678c.toArray()) + "}";
    }
}
