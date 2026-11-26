package yg;

import android.os.Bundle;
import android.os.Process;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dh.v;
import dh.w;
import java.util.Objects;

public final class e extends bh.a implements v {

    public final xf.g f16870f;

    public final g f16871g;

    public final int f16872h;

    public final w f16873i;

    public final g f16874j;

    public e(g gVar, xf.g gVar2, byte b7) {
        super(2);
        Objects.requireNonNull(gVar);
        this.f16871g = gVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f16870f = gVar2;
    }

    public e(g gVar, xf.g gVar2, int i10) {
        this(gVar, gVar2, (byte) 0);
        this.f16872h = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(gVar);
                this.f16874j = gVar;
                this(gVar, gVar2, (byte) 0);
                this.f16873i = new w("OnWarmUpIntegrityTokenCallback");
                break;
            default:
                Objects.requireNonNull(gVar);
                this.f16874j = gVar;
                this.f16873i = new w("OnRequestIntegrityTokenCallback");
                break;
        }
    }

    @Override
    public void i0(Bundle bundle) {
        switch (this.f16872h) {
            case 0:
                k2(bundle);
                this.f16873i.b("onRequestExpressIntegrityToken", new Object[0]);
                this.f16874j.f16878d.getClass();
                int i10 = bundle.getInt("error");
                StandardIntegrityException standardIntegrityException = null;
                if (i10 != 0) {
                    bundle.getBoolean("is.error.remediable");
                    standardIntegrityException = new StandardIntegrityException(i10, null);
                }
                xf.g gVar = this.f16870f;
                if (standardIntegrityException != null) {
                    gVar.c(standardIntegrityException);
                    return;
                }
                bundle.getLong("request.token.sid");
                g4.c.e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat("IntegrityDialogWrapper");
                String string = bundle.getString("token");
                if (string == null) {
                    throw new NullPointerException("Null token");
                }
                gVar.d(new i(string));
                return;
            default:
                k2(bundle);
                return;
        }
    }

    @Override
    public void k1(Bundle bundle) {
        switch (this.f16872h) {
            case 1:
                l2(bundle);
                this.f16873i.b("onWarmUpExpressIntegrityToken", new Object[0]);
                this.f16874j.f16878d.getClass();
                int i10 = bundle.getInt("error");
                StandardIntegrityException standardIntegrityException = null;
                if (i10 != 0) {
                    bundle.getBoolean("is.error.remediable");
                    standardIntegrityException = new StandardIntegrityException(i10, null);
                }
                xf.g gVar = this.f16870f;
                if (standardIntegrityException == null) {
                    gVar.d(Long.valueOf(bundle.getLong("warm.up.sid")));
                } else {
                    gVar.c(standardIntegrityException);
                }
                break;
            default:
                l2(bundle);
                break;
        }
    }

    public final void k2(Bundle bundle) {
        this.f16871g.f16879e.c(this.f16870f);
    }

    public final void l2(Bundle bundle) {
        this.f16871g.f16879e.c(this.f16870f);
    }
}
