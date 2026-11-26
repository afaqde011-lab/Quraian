package ek;

import com.google.gson.reflect.TypeToken;

public final class v0 implements bk.b0 {
    public final Class A;
    public final Class B;
    public final bk.a0 C;

    public v0(Class cls, Class cls2, bk.a0 a0Var) {
        this.A = cls;
        this.B = cls2;
        this.C = a0Var;
    }

    @Override
    public final bk.a0 a(bk.m mVar, TypeToken typeToken) {
        Class rawType = typeToken.getRawType();
        if (rawType == this.A || rawType == this.B) {
            return this.C;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.B.getName() + "+" + this.A.getName() + ",adapter=" + this.C + "]";
    }
}
