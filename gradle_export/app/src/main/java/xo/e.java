package xo;

import a40.k;
import android.app.Activity;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException;
import dh.o;
import f5.f;
import f5.i;
import f5.l;
import f5.n;
import f5.p;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import qd.s0;
import ri.t1;

public final class e {
    public final Object a(Activity context, p credentialOption, m00.c cVar) throws GoogleIdTokenParsingException {
        b bVar;
        i iVarO;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objQ = bVar.A;
        l00.a aVar = l00.a.A;
        int i2 = bVar.C;
        if (i2 == 0) {
            t1.O(objQ);
            ArrayList arrayList = new ArrayList();
            m.e(credentialOption, "credentialOption");
            arrayList.add(credentialOption);
            List<p> listN1 = q.n1(arrayList);
            n nVar = new n(listN1);
            bVar.C = 1;
            k kVar = new k(1, s0.j0(bVar));
            kVar.r();
            CancellationSignal cancellationSignal = new CancellationSignal();
            kVar.u(new f5.e(cancellationSignal, 0));
            f fVar = new f(kVar, 0);
            f5.d dVar = new f5.d(0);
            m.e(context, "context");
            m.e(context, "context");
            o oVar = new o();
            oVar.A = context;
            if (nVar.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
                iVarO = oVar.o();
            } else {
                for (p pVar : listN1) {
                }
                int i3 = Build.VERSION.SDK_INT;
                i iVar = null;
                if (i3 >= 34) {
                    i lVar = new l(oVar.A);
                    iVar = lVar.isAvailableOnDevice() ? lVar : null;
                    if (iVar == null) {
                        iVarO = oVar.o();
                    } else {
                        iVarO = iVar;
                    }
                } else if (i3 <= 33) {
                    iVarO = oVar.o();
                } else {
                    iVarO = iVar;
                }
            }
            if (iVarO == null) {
                fVar.a(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
            } else {
                iVarO.onGetCredential(context, nVar, cancellationSignal, dVar, fVar);
            }
            objQ = kVar.q();
            l00.a aVar2 = l00.a.A;
            if (objQ == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objQ);
        }
        Bundle data = (Bundle) ((f5.o) objQ).a.B;
        m.e(data, "data");
        try {
            String string = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = (Uri) data.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class);
            String string6 = data.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            m.b(string);
            m.b(string2);
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", string);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", string2);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", string3);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", string4);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", string5);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", string6);
            bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
            if (string.length() <= 0) {
                throw new IllegalArgumentException("id should not be empty");
            }
            if (string2.length() <= 0) {
                throw new IllegalArgumentException("idToken should not be empty");
            }
            if (string5 != null) {
                string3 = string5;
            } else if (string3 == null) {
                string3 = "";
            }
            return new ep.m(string2, string, string3);
        } catch (Exception e) {
            throw new GoogleIdTokenParsingException(e);
        }
    }

    public final Object b(Activity activity, String serverClientId, String str, c cVar) {
        m.e(serverClientId, "serverClientId");
        if (serverClientId.length() > 0) {
            return a(activity, new yf.a(serverClientId, str), cVar);
        }
        throw new IllegalArgumentException("serverClientId should not be empty");
    }

    public final java.lang.Object c(android.app.Activity r11, m00.c r12) throws com.google.android.libraries.identity.googleid.GoogleIdTokenParsingException, java.security.NoSuchAlgorithmException {
        throw new UnsupportedOperationException("Method not decompiled: xo.e.c(android.app.Activity, m00.c):java.lang.Object");
    }

    public final Object d(Activity activity, String serverClientId, String str, m00.c cVar) throws GoogleIdTokenParsingException {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.C = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objA = dVar.A;
        Object obj = l00.a.A;
        int i2 = dVar.C;
        try {
            if (i2 == 0) {
                t1.O(objA);
                m.e(serverClientId, "serverClientId");
                p bVar = new yf.b(serverClientId, str);
                dVar.C = 1;
                objA = a(activity, bVar, dVar);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objA);
            }
            return (ep.m) objA;
        } catch (GetCredentialCancellationException unused) {
            return null;
        }
    }
}
