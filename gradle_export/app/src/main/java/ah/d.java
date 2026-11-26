package ah;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import b3.k0;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.play_billing.q;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l9.b0;
import l9.e0;
import l9.v;
import qd.j;
import qd.k;

public final class d extends ResultReceiver {
    public final int A;
    public final Object B;

    public d(Handler handler, xf.g gVar) {
        super(handler);
        this.A = 0;
        this.B = gVar;
    }

    public d(j5.b bVar, Handler handler, int i10) {
        super(handler);
        this.A = i10;
        this.B = bVar;
    }

    public d(v vVar) {
        super(null);
        this.A = 2;
        this.B = new WeakReference(vVar);
    }

    public d(qd.b bVar, Handler handler, j jVar) {
        super(handler);
        this.A = 4;
        this.B = jVar;
    }

    @Override
    public final void onReceiveResult(int i10, Bundle bundle) {
        k kVar;
        l9.d dVar = null;
        int i11 = 16;
        switch (this.A) {
            case 0:
                ((xf.g) this.B).d(null);
                return;
            case 1:
                m.e(bundle, "resultData");
                av.b bVar = new av.b(2, j5.b.f8166a, j5.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 6);
                k5.c cVar = (k5.c) this.B;
                if (j5.b.c(bundle, bVar, cVar.g(), cVar.f(), cVar.f8970h)) {
                    return;
                }
                int i12 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent = (Intent) bundle.getParcelable("RESULT_DATA");
                int i13 = j5.b.f8168c;
                if (i12 != i13) {
                    Log.w("BeginSignIn", "Returned request code " + i13 + " which  does not match what was given " + i12);
                    return;
                }
                if (j5.b.d(i10, k5.a.A, new b3.a(cVar, 21), cVar.f8970h)) {
                    return;
                }
                try {
                    Context context = cVar.f8967e;
                    d0.h(context);
                    j5.b.a(cVar.f8970h, new k0(cVar, cVar.e(new hf.d(context, new ke.m()).c(intent)), 11));
                    return;
                } catch (GetCredentialException e3) {
                    j5.b.a(cVar.f8970h, new k0(cVar, e3, 13));
                    return;
                } catch (ApiException e10) {
                    z zVar = new z();
                    zVar.A = new GetCredentialUnknownException(e10.getMessage());
                    int i14 = e10.A.A;
                    if (i14 == 16) {
                        zVar.A = new GetCredentialCancellationException(e10.getMessage());
                    } else if (j5.b.f8167b.contains(Integer.valueOf(i14))) {
                        zVar.A = new GetCredentialInterruptedException(e10.getMessage());
                    }
                    j5.b.a(cVar.f8970h, new k0(cVar, zVar, 12));
                    return;
                } catch (Throwable th2) {
                    j5.b.a(cVar.f8970h, new k0(cVar, new GetCredentialUnknownException(th2.getMessage()), 14));
                    return;
                }
            case 2:
                v vVar = (v) ((WeakReference) this.B).get();
                if (vVar == null || bundle == null) {
                    return;
                }
                synchronized (vVar.f10184b) {
                    e0 e0Var = vVar.f10187e;
                    IBinder binder = bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER");
                    int i15 = b0.f10123f;
                    if (binder != null) {
                        IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof l9.d)) {
                            l9.c cVar2 = new l9.c();
                            cVar2.f10125e = binder;
                            dVar = cVar2;
                        } else {
                            dVar = (l9.d) iInterfaceQueryLocalInterface;
                        }
                    }
                    synchronized (e0Var.A) {
                        e0Var.C = dVar;
                        break;
                    }
                    e0 e0Var2 = vVar.f10187e;
                    va.d dVarO = va.a.O(bundle);
                    synchronized (e0Var2.A) {
                        e0Var2.D = dVarO;
                        break;
                    }
                    vVar.a();
                }
                return;
            case 3:
                m.e(bundle, "resultData");
                av.b bVar2 = new av.b(2, j5.b.f8166a, j5.a.class, "getCredentialExceptionTypeToException", "getCredentialExceptionTypeToException$credentials_play_services_auth_release(Ljava/lang/String;Ljava/lang/String;)Landroidx/credentials/exceptions/GetCredentialException;", 0, 7);
                m5.c cVar3 = (m5.c) this.B;
                if (j5.b.c(bundle, bVar2, cVar3.h(), cVar3.g(), cVar3.f10564h)) {
                    return;
                }
                int i16 = bundle.getInt("ACTIVITY_REQUEST_CODE");
                Intent intent2 = (Intent) bundle.getParcelable("RESULT_DATA");
                int i17 = j5.b.f8168c;
                if (i16 != i17) {
                    Log.w("GetSignInIntent", "Returned request code " + i17 + " which  does not match what was given " + i16);
                    return;
                }
                if (j5.b.d(i10, m5.a.A, new b3.a(cVar3, 23), cVar3.f10564h)) {
                    return;
                }
                try {
                    Context context2 = cVar3.f10561e;
                    d0.h(context2);
                    j5.b.a(cVar3.f10564h, new k0(cVar3, cVar3.f(new hf.d(context2, new ke.m()).c(intent2)), 15));
                    return;
                } catch (GetCredentialException e11) {
                    j5.b.a(cVar3.f10564h, new k0(cVar3, e11, 17));
                    return;
                } catch (ApiException e12) {
                    z zVar2 = new z();
                    zVar2.A = new GetCredentialUnknownException(e12.getMessage());
                    int i18 = e12.A.A;
                    if (i18 == 16) {
                        zVar2.A = new GetCredentialCancellationException(e12.getMessage());
                    } else if (j5.b.f8167b.contains(Integer.valueOf(i18))) {
                        zVar2.A = new GetCredentialInterruptedException(e12.getMessage());
                    }
                    j5.b.a(cVar3.f10564h, new k0(cVar3, zVar2, i11));
                    return;
                } catch (Throwable th3) {
                    j5.b.a(cVar3.f10564h, new k0(cVar3, new GetCredentialUnknownException(th3.getMessage()), 18));
                    return;
                }
            default:
                j jVar = (j) this.B;
                if (bundle == null) {
                    kVar = new k();
                } else {
                    int i19 = q.f4028a;
                    int i20 = bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
                    bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
                    bundle.getString("IN_APP_MESSAGE_PURCHASE_ID");
                    kVar = new k(i20);
                }
                jVar.a(kVar);
                return;
        }
    }
}
