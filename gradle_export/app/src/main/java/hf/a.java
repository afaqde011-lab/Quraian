package hf;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Looper;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.RevocationBoundService;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.y0;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.internal.cast.h3;
import com.google.android.gms.internal.measurement.b5;
import org.json.JSONException;

public final class a extends bh.a {

    public final int f7044f;

    public final Object f7045g;

    public a(int i10, xf.g gVar) {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback", 3);
        this.f7044f = i10;
        switch (i10) {
            case 1:
                this.f7045g = gVar;
                super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback", 3);
                break;
            case 2:
                this.f7045g = gVar;
                super("com.google.android.gms.auth.api.identity.internal.IGetSignInIntentCallback", 3);
                break;
            default:
                this.f7045g = gVar;
                break;
        }
    }

    public a(RevocationBoundService revocationBoundService) {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService", 3);
        this.f7044f = 3;
        this.f7045g = revocationBoundService;
    }

    @Override
    public final boolean i2(int i10, Parcel parcel, Parcel parcel2) {
        BasePendingResult basePendingResultDoWrite;
        BasePendingResult basePendingResultDoWrite2;
        String strE;
        int i11 = this.f7044f;
        Object obj = this.f7045g;
        switch (i11) {
            case 0:
                if (i10 != 1) {
                    return false;
                }
                Status status = (Status) h.a(parcel, Status.CREATOR);
                ke.i iVar = (ke.i) h.a(parcel, ke.i.CREATOR);
                h.b(parcel);
                b5.N(status, iVar, (xf.g) obj);
                return true;
            case 1:
                if (i10 != 1) {
                    return false;
                }
                Status status2 = (Status) h.a(parcel, Status.CREATOR);
                ke.f fVar = (ke.f) h.a(parcel, ke.f.CREATOR);
                h.b(parcel);
                b5.N(status2, fVar, (xf.g) obj);
                return true;
            case 2:
                if (i10 != 1) {
                    return false;
                }
                Status status3 = (Status) h.a(parcel, Status.CREATOR);
                PendingIntent pendingIntent = (PendingIntent) h.a(parcel, PendingIntent.CREATOR);
                h.b(parcel);
                b5.N(status3, pendingIntent, (xf.g) obj);
                return true;
            default:
                RevocationBoundService revocationBoundService = (RevocationBoundService) obj;
                if (i10 != 1) {
                    if (i10 != 2) {
                        return false;
                    }
                    k2();
                    me.i.K(revocationBoundService).L();
                    return true;
                }
                k2();
                me.b bVarA = me.b.a(revocationBoundService);
                GoogleSignInAccount googleSignInAccountB = bVarA.b();
                GoogleSignInOptions googleSignInOptionsA = GoogleSignInOptions.K;
                if (googleSignInAccountB != null) {
                    String strE2 = bVarA.e("defaultGoogleSignInAccount");
                    if (TextUtils.isEmpty(strE2) || (strE = bVarA.e(me.b.f("googleSignInOptions", strE2))) == null) {
                        googleSignInOptionsA = null;
                    } else {
                        try {
                            googleSignInOptionsA = GoogleSignInOptions.a(strE);
                        } catch (JSONException unused) {
                            googleSignInOptionsA = null;
                        }
                    }
                }
                GoogleSignInOptions googleSignInOptions = googleSignInOptionsA;
                d0.h(googleSignInOptions);
                h3 h3Var = new h3((RevocationBoundService) obj, null, je.a.f8271a, googleSignInOptions, new m(new gj.e(7), Looper.getMainLooper()));
                if (googleSignInAccountB == null) {
                    q qVarAsGoogleApiClient = h3Var.asGoogleApiClient();
                    Context applicationContext = h3Var.getApplicationContext();
                    boolean z10 = h3Var.c() == 3;
                    me.h.f10895a.g("Signing out", new Object[0]);
                    me.h.a(applicationContext);
                    if (z10) {
                        basePendingResultDoWrite = new s(qVarAsGoogleApiClient, 0);
                        basePendingResultDoWrite.setResult(Status.E);
                    } else {
                        basePendingResultDoWrite = ((c0) qVarAsGoogleApiClient).f3181b.doWrite(new me.g(qVarAsGoogleApiClient, 0));
                    }
                    basePendingResultDoWrite.addStatusListener(new y0(basePendingResultDoWrite, new xf.g(), new hb.f()));
                    return true;
                }
                q qVarAsGoogleApiClient2 = h3Var.asGoogleApiClient();
                Context applicationContext2 = h3Var.getApplicationContext();
                boolean z11 = h3Var.c() == 3;
                me.h.f10895a.g("Revoking access", new Object[0]);
                String strE3 = me.b.a(applicationContext2).e("refreshToken");
                me.h.a(applicationContext2);
                if (!z11) {
                    basePendingResultDoWrite2 = ((c0) qVarAsGoogleApiClient2).f3181b.doWrite(new me.g(qVarAsGoogleApiClient2, 1));
                } else if (strE3 == null) {
                    c50.h hVar = me.c.C;
                    Status status4 = new Status(4, null, null, null);
                    d0.a("Status code must not be SUCCESS", !status4.a());
                    basePendingResultDoWrite2 = new y(status4);
                    basePendingResultDoWrite2.setResult(status4);
                } else {
                    me.c cVar = new me.c(strE3);
                    new Thread(cVar).start();
                    basePendingResultDoWrite2 = cVar.B;
                }
                basePendingResultDoWrite2.addStatusListener(new y0(basePendingResultDoWrite2, new xf.g(), new hb.f()));
                return true;
        }
    }

    public void k2() {
        if (!ve.c.e((RevocationBoundService) this.f7045g, Binder.getCallingUid())) {
            throw new SecurityException(g4.c.i("Calling UID ", Binder.getCallingUid(), " is not Google Play services."));
        }
    }
}
