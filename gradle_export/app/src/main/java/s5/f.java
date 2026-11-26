package s5;

import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.q0;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.v;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.x;
import androidx.datastore.preferences.protobuf.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class f extends v {
    private static final f DEFAULT_INSTANCE;
    private static volatile p0 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private w strings_ = s0.D;

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        v.j(f.class, fVar);
    }

    public static void l(f fVar, Iterable iterable) {
        w wVar = fVar.strings_;
        if (!((androidx.datastore.preferences.protobuf.b) wVar).A) {
            s0 s0Var = (s0) wVar;
            int i10 = s0Var.C;
            fVar.strings_ = s0Var.c(i10 == 0 ? 10 : i10 * 2);
        }
        RandomAccess randomAccess = fVar.strings_;
        Charset charset = x.f684a;
        if (iterable instanceof z) {
            List underlyingElements = ((z) iterable).getUnderlyingElements();
            if (randomAccess != null) {
                throw new ClassCastException();
            }
            ((s0) randomAccess).getClass();
            Iterator it = underlyingElements.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof androidx.datastore.preferences.protobuf.g) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                androidx.datastore.preferences.protobuf.g.c(0, bArr.length, bArr);
                throw null;
            }
            return;
        }
        if (iterable instanceof q0) {
            ((androidx.datastore.preferences.protobuf.b) randomAccess).addAll((Collection) iterable);
            return;
        }
        if ((randomAccess instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) randomAccess).ensureCapacity(((Collection) iterable).size() + ((s0) randomAccess).C);
        }
        s0 s0Var2 = (s0) randomAccess;
        int i11 = s0Var2.C;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (s0Var2.C - i11) + " is null.";
                for (int i12 = s0Var2.C - 1; i12 >= i11; i12--) {
                    s0Var2.remove(i12);
                }
                throw new NullPointerException(str);
            }
            s0Var2.add(obj);
        }
    }

    public static f m() {
        return DEFAULT_INSTANCE;
    }

    public static e o() {
        return (e) ((t) DEFAULT_INSTANCE.c(5));
    }

    @Override
    public final Object c(int i10) {
        p0 uVar;
        switch (e4.f.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new f();
            case 4:
                return new e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p0 p0Var = PARSER;
                if (p0Var != null) {
                    return p0Var;
                }
                synchronized (f.class) {
                    try {
                        uVar = PARSER;
                        if (uVar == null) {
                            uVar = new u();
                            PARSER = uVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return uVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final w n() {
        return this.strings_;
    }
}
