package p10;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.TypeVariable;
import java.util.Collection;

public final class c0 extends s implements e20.b {
    public final TypeVariable a;

    public c0(TypeVariable typeVariable) {
        kotlin.jvm.internal.m.e(typeVariable, "typeVariable");
        this.a = typeVariable;
    }

    @Override
    public final e a(n20.c fqName) {
        Annotation[] declaredAnnotations;
        kotlin.jvm.internal.m.e(fqName, "fqName");
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        if (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) {
            return null;
        }
        return rd.a.B(declaredAnnotations, fqName);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c0) {
            return kotlin.jvm.internal.m.a(this.a, ((c0) obj).a);
        }
        return false;
    }

    @Override
    public final Collection getAnnotations() {
        Annotation[] declaredAnnotations;
        TypeVariable typeVariable = this.a;
        AnnotatedElement annotatedElement = typeVariable instanceof AnnotatedElement ? (AnnotatedElement) typeVariable : null;
        return (annotatedElement == null || (declaredAnnotations = annotatedElement.getDeclaredAnnotations()) == null) ? h00.x.A : rd.a.E(declaredAnnotations);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return c0.class.getName() + ": " + this.a;
    }
}
