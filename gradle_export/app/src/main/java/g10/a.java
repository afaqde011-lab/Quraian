package g10;

import java.util.ServiceLoader;

public final class a implements u00.a {
    public static final a B = new a(0);
    public static final a C = new a(1);
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                b bVar = b.a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
                kotlin.jvm.internal.m.b(serviceLoaderLoad);
                c cVar = (c) h00.q.M0(serviceLoaderLoad);
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                e eVar = new e(new d30.l("DefaultBuiltIns"));
                eVar.c();
                return eVar;
        }
    }
}
