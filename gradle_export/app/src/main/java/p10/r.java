package p10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;

public final class r extends w implements e20.e {
    public final Constructor a;

    public r(Constructor member) {
        kotlin.jvm.internal.m.e(member, "member");
        this.a = member;
    }

    @Override
    public final Member b() {
        return this.a;
    }

    @Override
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.a.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new c0(typeVariable));
        }
        return arrayList;
    }
}
