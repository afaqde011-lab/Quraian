package b30;

import kotlin.jvm.internal.m;
import o20.h;
import o20.n;
import r30.r;

public final class a extends z20.a {
    public static final a m;

    static {
        h hVar = new h();
        j20.b.a(hVar);
        n packageFqName = j20.b.a;
        m.d(packageFqName, "packageFqName");
        n constructorAnnotation = j20.b.c;
        m.d(constructorAnnotation, "constructorAnnotation");
        n classAnnotation = j20.b.b;
        m.d(classAnnotation, "classAnnotation");
        n functionAnnotation = j20.b.d;
        m.d(functionAnnotation, "functionAnnotation");
        n propertyAnnotation = j20.b.e;
        m.d(propertyAnnotation, "propertyAnnotation");
        n propertyGetterAnnotation = j20.b.f;
        m.d(propertyGetterAnnotation, "propertyGetterAnnotation");
        n propertySetterAnnotation = j20.b.g;
        m.d(propertySetterAnnotation, "propertySetterAnnotation");
        n enumEntryAnnotation = j20.b.i;
        m.d(enumEntryAnnotation, "enumEntryAnnotation");
        n compileTimeValue = j20.b.h;
        m.d(compileTimeValue, "compileTimeValue");
        n parameterAnnotation = j20.b.j;
        m.d(parameterAnnotation, "parameterAnnotation");
        n typeAnnotation = j20.b.k;
        m.d(typeAnnotation, "typeAnnotation");
        n typeParameterAnnotation = j20.b.l;
        m.d(typeParameterAnnotation, "typeParameterAnnotation");
        m = new a(hVar, packageFqName, constructorAnnotation, classAnnotation, functionAnnotation, propertyAnnotation, propertyGetterAnnotation, propertySetterAnnotation, enumEntryAnnotation, compileTimeValue, parameterAnnotation, typeAnnotation, typeParameterAnnotation);
    }

    public static String a(n20.c fqName) {
        String strB;
        m.e(fqName, "fqName");
        StringBuilder sb = new StringBuilder();
        n20.d dVar = fqName.a;
        sb.append(r.u0(dVar.a, '.', '/'));
        sb.append('/');
        if (dVar.c()) {
            strB = "default-package";
        } else {
            strB = dVar.g().b();
            m.d(strB, "asString(...)");
        }
        sb.append(strB.concat(".kotlin_builtins"));
        return sb.toString();
    }
}
