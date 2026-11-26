package ii;

public final class p {

    public final Class f7714a;

    public final Class f7715b;

    public p(Class cls, Class cls2) {
        this.f7714a = cls;
        this.f7715b = cls2;
    }

    public static p a(Class cls) {
        return new p(o.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f7715b.equals(pVar.f7715b)) {
            return this.f7714a.equals(pVar.f7714a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7714a.hashCode() + (this.f7715b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f7715b;
        Class cls2 = this.f7714a;
        if (cls2 == o.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
