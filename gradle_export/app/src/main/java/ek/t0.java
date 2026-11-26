package ek;

import com.google.gson.reflect.TypeToken;

public final class t0 implements bk.b0 {
    public final int A;
    public final Object B;
    public final bk.a0 C;

    public t0(Object obj, bk.a0 a0Var, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = a0Var;
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        switch (this.A) {
            case 0:
                if (typeToken.getRawType() == ((Class) this.B)) {
                    return this.C;
                }
                return null;
            case 1:
                Class<?> rawType = typeToken.getRawType();
                if (((Class) this.B).isAssignableFrom(rawType)) {
                    return new c(this, rawType);
                }
                return null;
            default:
                if (typeToken.equals((TypeToken) this.B)) {
                    return this.C;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return "Factory[type=" + ((Class) this.B).getName() + ",adapter=" + this.C + "]";
            case 1:
                return "Factory[typeHierarchy=" + ((Class) this.B).getName() + ",adapter=" + this.C + "]";
            default:
                return super.toString();
        }
    }
}
