package mh;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class h {

    public static final CopyOnWriteArrayList f10913a = new CopyOnWriteArrayList();

    public static sh.c a(String str) throws GeneralSecurityException {
        boolean zStartsWith;
        for (sh.c cVar : f10913a) {
            synchronized (cVar) {
                zStartsWith = str.toLowerCase(Locale.US).startsWith("android-keystore://");
            }
            if (zStartsWith) {
                return cVar;
            }
        }
        throw new GeneralSecurityException(a1.b.o("No KMS client does support: ", str));
    }
}
