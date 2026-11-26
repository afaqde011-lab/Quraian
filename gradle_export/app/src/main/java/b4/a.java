package b4;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsSynchronizer;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsTracker;
import com.revenuecat.purchases.common.events.EventsManager;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.deeplinks.WebPurchaseRedemptionHelper;
import com.revenuecat.purchases.identity.IdentityManager;

public final class a implements Runnable {
    public final int A;
    public final u00.a B;

    public a(int i10, u00.a aVar) {
        this.A = i10;
        this.B = aVar;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        u00.a aVar = this.B;
        switch (i10) {
            case 0:
                aVar.invoke();
                break;
            case 1:
                aVar.invoke();
                break;
            case 2:
                aVar.invoke();
                break;
            case 3:
                aVar.invoke();
                break;
            case 4:
                aVar.invoke();
                break;
            case 5:
                DiagnosticsSynchronizer.a(aVar);
                break;
            case 6:
                DiagnosticsTracker.a(aVar);
                break;
            case 7:
                EventsManager.a(aVar);
                break;
            case 8:
                OfferingsManager.a(aVar);
                break;
            case 9:
                WebPurchaseRedemptionHelper.a(aVar);
                break;
            case 10:
                IdentityManager.a(aVar);
                break;
            default:
                aVar.invoke();
                break;
        }
    }
}
