package zh;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

public final class m implements n {
    public final int A;
    public final p B;

    public m(p pVar, int i10) {
        this.A = i10;
        this.B = pVar;
    }

    @Override
    public final Object d(String str) throws GeneralSecurityException {
        switch (this.A) {
            case 0:
                String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < 2; i10++) {
                    Provider provider = Security.getProvider(strArr[i10]);
                    if (provider != null) {
                        arrayList.add(provider);
                    }
                }
                Iterator it = arrayList.iterator();
                Exception exc = null;
                while (true) {
                    boolean zHasNext = it.hasNext();
                    p pVar = this.B;
                    if (!zHasNext) {
                        return pVar.b(str, null);
                    }
                    try {
                        return pVar.b(str, (Provider) it.next());
                    } catch (Exception e3) {
                        if (exc == null) {
                            exc = e3;
                        }
                    }
                }
                break;
            default:
                String[] strArr2 = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = 0; i11 < 3; i11++) {
                    Provider provider2 = Security.getProvider(strArr2[i11]);
                    if (provider2 != null) {
                        arrayList2.add(provider2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                Exception exc2 = null;
                while (it2.hasNext()) {
                    try {
                        return this.B.b(str, (Provider) it2.next());
                    } catch (Exception e10) {
                        if (exc2 == null) {
                            exc2 = e10;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc2);
        }
    }
}
