package k40;

import a40.k;
import com.google.android.gms.tasks.Task;
import com.mchutov.quranify.billing.BillingException;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import g00.n;
import java.util.Map;
import kotlin.KotlinNullPointerException;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.DispatchException;
import l60.d;
import l60.g;
import l60.o0;
import l60.s;
import retrofit2.HttpException;
import ri.t1;
import th.o;
import xf.c;

public final class b implements c, g, ReceiveOfferingsCallback, ReceiveCustomerInfoCallback {
    public final int A;
    public final k B;

    public b(k kVar, int i) {
        this.A = i;
        this.B = kVar;
    }

    @Override
    public void l(d dVar, o0 o0Var) {
        switch (this.A) {
            case 1:
                boolean zI = o0Var.a.i();
                k kVar = this.B;
                if (!zI) {
                    kVar.resumeWith(t1.s(new HttpException(o0Var)));
                } else {
                    Object obj = o0Var.b;
                    if (obj != null) {
                        kVar.resumeWith(obj);
                    } else {
                        o oVarR = dVar.r();
                        oVarR.getClass();
                        Object objCast = s.class.cast(((Map) oVarR.F).get(s.class));
                        m.b(objCast);
                        s sVar = (s) objCast;
                        kVar.resumeWith(t1.s(new KotlinNullPointerException("Response from " + sVar.a.getName() + '.' + sVar.c.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            default:
                this.B.resumeWith(o0Var);
                break;
        }
    }

    public void onComplete(Task task) throws DispatchException {
        Exception excJ = task.j();
        k kVar = this.B;
        if (excJ != null) {
            kVar.resumeWith(t1.s(excJ));
        } else if (task.m()) {
            kVar.h(null);
        } else {
            kVar.resumeWith(task.k());
        }
    }

    @Override
    public void onError(PurchasesError error) {
        switch (this.A) {
            case 3:
                m.e(error, "error");
                this.B.resumeWith(new n(t1.s(new BillingException(error))));
                break;
            case 4:
                m.e(error, "error");
                this.B.resumeWith(new n(t1.s(new BillingException(error))));
                break;
            default:
                m.e(error, "error");
                this.B.resumeWith(new n(t1.s(new BillingException(error))));
                break;
        }
    }

    @Override
    public void onReceived(CustomerInfo customerInfo) {
        switch (this.A) {
            case 4:
                m.e(customerInfo, "customerInfo");
                this.B.resumeWith(new n(customerInfo));
                break;
            default:
                m.e(customerInfo, "customerInfo");
                this.B.resumeWith(new n(customerInfo));
                break;
        }
    }

    @Override
    public void onReceived(Offerings offerings) {
        m.e(offerings, "offerings");
        this.B.resumeWith(new n(offerings));
    }

    @Override
    public void w0(d dVar, Throwable th) {
        switch (this.A) {
            case 1:
                this.B.resumeWith(t1.s(th));
                break;
            default:
                this.B.resumeWith(t1.s(th));
                break;
        }
    }
}
