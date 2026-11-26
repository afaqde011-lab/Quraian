package m5;

import ah.d;
import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.google.android.gms.common.internal.d0;
import f5.g;
import f5.n;
import f5.o;
import java.util.List;
import java.util.concurrent.Executor;
import ke.j;
import kotlin.jvm.internal.m;

public final class c extends j5.b {

    public static final int f10560j = 0;

    public final Context f10561e;

    public g f10562f;

    public Executor f10563g;

    public CancellationSignal f10564h;

    public final d f10565i;

    public c(Context context) {
        m.e(context, "context");
        this.f10561e = context;
        this.f10565i = new d(this, new Handler(Looper.getMainLooper()), 3);
    }

    public static ke.g e(n nVar) {
        m.e(nVar, "request");
        List list = nVar.f5484a;
        if (list.size() != 1) {
            throw new GetCredentialUnsupportedException("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        Object obj = list.get(0);
        m.c(obj, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        yf.b bVar = (yf.b) obj;
        String str = bVar.f16864d;
        d0.h(str);
        return new ke.g(str, null, null, bVar.f16865e, false, 0);
    }

    public final o f(j jVar) throws GetCredentialUnknownException {
        String str = jVar.G;
        yf.c cVar = null;
        if (str != null) {
            String str2 = jVar.A;
            m.d(str2, "getId(...)");
            String str3 = jVar.B;
            String str4 = str3 != null ? str3 : null;
            String str5 = jVar.C;
            String str6 = str5 != null ? str5 : null;
            String str7 = jVar.D;
            String str8 = str7 != null ? str7 : null;
            String str9 = jVar.H;
            String str10 = str9 != null ? str9 : null;
            Uri uri = jVar.E;
            cVar = new yf.c(str2, str, str4, str8, str6, uri != null ? uri : null, str10);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
        }
        if (cVar != null) {
            return new o(cVar);
        }
        throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
    }

    public final g g() {
        g gVar = this.f10562f;
        if (gVar != null) {
            return gVar;
        }
        m.k("callback");
        throw null;
    }

    public final Executor h() {
        Executor executor = this.f10563g;
        if (executor != null) {
            return executor;
        }
        m.k("executor");
        throw null;
    }
}
