package ek;

import com.google.gson.reflect.TypeToken;
import java.util.concurrent.ConcurrentHashMap;

public final class l implements bk.b0 {
    public static final k C;
    public static final k D;
    public final a1.u0 A;
    public final ConcurrentHashMap B = new ConcurrentHashMap();

    static {
        int i10 = 0;
        C = new k(i10);
        D = new k(i10);
    }

    public l(a1.u0 u0Var) {
        this.A = u0Var;
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        ck.a aVar = (ck.a) typeToken.getRawType().getAnnotation(ck.a.class);
        if (aVar == null) {
            return null;
        }
        return b(this.A, mVar, typeToken, aVar, true);
    }

    public final bk.a0 b(a1.u0 u0Var, bk.m mVar, TypeToken typeToken, ck.a aVar, boolean z10) {
        bk.a0 a0VarA;
        Object objJ = u0Var.C(TypeToken.get(aVar.value()), true).j();
        boolean zNullSafe = aVar.nullSafe();
        if (objJ instanceof bk.a0) {
            a0VarA = (bk.a0) objJ;
        } else if (objJ instanceof bk.b0) {
            bk.b0 b0Var = (bk.b0) objJ;
            if (z10) {
                bk.b0 b0Var2 = (bk.b0) this.B.putIfAbsent(typeToken.getRawType(), b0Var);
                if (b0Var2 != null) {
                    b0Var = b0Var2;
                }
            }
            a0VarA = b0Var.a(mVar, typeToken);
        } else {
            if (!(objJ instanceof bk.p)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objJ.getClass().getName() + " as a @JsonAdapter for " + typeToken.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            z zVar = new z((bk.p) objJ, mVar, typeToken, z10 ? C : D, zNullSafe);
            zNullSafe = false;
            a0VarA = zVar;
        }
        return (a0VarA == null || !zNullSafe) ? a0VarA : a0VarA.a();
    }
}
