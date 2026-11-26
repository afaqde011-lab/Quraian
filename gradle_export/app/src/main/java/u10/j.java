package u10;

import h00.q;
import java.util.List;
import java.util.ServiceLoader;
import kotlin.jvm.internal.m;

public final class j implements u00.a {
    public static final j A = new j();

    @Override
    public final Object invoke() {
        k kVar = k.a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(l.class, l.class.getClassLoader());
        m.d(serviceLoaderLoad, "load(...)");
        List listN1 = q.n1(serviceLoaderLoad);
        if (listN1.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listN1;
    }
}
