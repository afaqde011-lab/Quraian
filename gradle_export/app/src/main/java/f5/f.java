package f5;

import androidx.credentials.exceptions.GetCredentialException;
import com.mchutov.quranify.billing.BillingException;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.interfaces.GetStorefrontCallback;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import l60.o0;
import retrofit2.HttpException;
import ri.t1;

public final class f implements g, l60.g, GetStorefrontCallback, LogInCallback, ReceiveCustomerInfoCallback {
    public final int A;
    public final a40.k B;

    public f(a40.k kVar, int i10) {
        this.A = i10;
        this.B = kVar;
    }

    public void a(Object obj) {
        GetCredentialException getCredentialException = (GetCredentialException) obj;
        kotlin.jvm.internal.m.e(getCredentialException, "e");
        a40.k kVar = this.B;
        if (kVar.w()) {
            kVar.resumeWith(t1.s(getCredentialException));
        }
    }

    public void b(Object obj) {
        o oVar = (o) obj;
        kotlin.jvm.internal.m.e(oVar, "result");
        a40.k kVar = this.B;
        if (kVar.w()) {
            kVar.resumeWith(oVar);
        }
    }

    public void l(l60.d dVar, o0 o0Var) {
        boolean zI = o0Var.a.i();
        a40.k kVar = this.B;
        if (zI) {
            kVar.resumeWith(o0Var.b);
        } else {
            kVar.resumeWith(t1.s(new HttpException(o0Var)));
        }
    }

    public void onError(PurchasesError purchasesError) {
        switch (this.A) {
            case 2:
                kotlin.jvm.internal.m.e(purchasesError, "error");
                this.B.resumeWith(new g00.n(t1.s(new BillingException(purchasesError))));
                break;
            case 3:
                kotlin.jvm.internal.m.e(purchasesError, "error");
                this.B.resumeWith(new g00.n(t1.s(new BillingException(purchasesError))));
                break;
            default:
                kotlin.jvm.internal.m.e(purchasesError, "error");
                this.B.resumeWith(new g00.n(t1.s(new BillingException(purchasesError))));
                break;
        }
    }

    public void onReceived(CustomerInfo customerInfo) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        this.B.resumeWith(new g00.n(customerInfo));
    }

    public void onReceived(CustomerInfo customerInfo, boolean z10) {
        kotlin.jvm.internal.m.e(customerInfo, "customerInfo");
        this.B.resumeWith(new g00.n(customerInfo));
    }

    public void onReceived(String str) {
        kotlin.jvm.internal.m.e(str, "storefrontCountryCode");
        this.B.resumeWith(new g00.n(str));
    }

    public void w0(l60.d dVar, Throwable th2) {
        this.B.resumeWith(t1.s(th2));
    }
}
