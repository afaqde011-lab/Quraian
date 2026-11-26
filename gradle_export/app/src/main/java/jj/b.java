package jj;

import android.text.TextUtils;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;
import java.util.Iterator;

public final class b implements Runnable {
    public final int A;
    public final c B;

    public b(c cVar, int i10) {
        this.A = i10;
        this.B = cVar;
    }

    @Override
    public final void run() {
        kj.b bVarW0;
        kj.b bVarG;
        int i10 = this.A;
        c cVar = this.B;
        switch (i10) {
            case 0:
                cVar.a();
                return;
            case 1:
                cVar.a();
                return;
            default:
                Object obj = c.m;
                synchronized (obj) {
                    try {
                        bi.g gVar = cVar.f8293a;
                        gVar.a();
                        h7.b bVarI = h7.b.i(gVar.f2531a);
                        try {
                            bVarW0 = cVar.f8295c.W0();
                            if (bVarI != null) {
                                bVarI.y();
                            }
                        } catch (Throwable th2) {
                            if (bVarI != null) {
                                bVarI.y();
                            }
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                try {
                    int i11 = bVarW0.f9693b;
                    if (i11 == 5) {
                        bVarG = cVar.g(bVarW0);
                    } else {
                        if (i11 == 3) {
                            bVarG = cVar.g(bVarW0);
                        } else if (!cVar.f8296d.a(bVarW0)) {
                            return;
                        } else {
                            bVarG = cVar.b(bVarW0);
                        }
                    }
                    synchronized (obj) {
                        try {
                            bi.g gVar2 = cVar.f8293a;
                            gVar2.a();
                            h7.b bVarI2 = h7.b.i(gVar2.f2531a);
                            try {
                                cVar.f8295c.R0(bVarG);
                                if (bVarI2 != null) {
                                    bVarI2.y();
                                }
                            } catch (Throwable th4) {
                                if (bVarI2 != null) {
                                    bVarI2.y();
                                }
                                throw th4;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    synchronized (cVar) {
                        try {
                            if (cVar.f8303k.size() != 0 && !TextUtils.equals(bVarW0.f9692a, bVarG.f9692a)) {
                                Iterator it = cVar.f8303k.iterator();
                                if (it.hasNext()) {
                                    if (it.next() != null) {
                                        throw new ClassCastException();
                                    }
                                    throw null;
                                }
                            }
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                    if (bVarG.f9693b == 4) {
                        String str = bVarG.f9692a;
                        synchronized (cVar) {
                            cVar.f8302j = str;
                        }
                    }
                    int i12 = bVarG.f9693b;
                    if (i12 == 5) {
                        cVar.h(new FirebaseInstallationsException());
                        return;
                    } else if (i12 == 2 || i12 == 1) {
                        cVar.h(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        cVar.i(bVarG);
                        return;
                    }
                } catch (FirebaseInstallationsException e3) {
                    cVar.h(e3);
                    return;
                }
        }
    }
}
