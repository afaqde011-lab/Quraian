package com.revenuecat.purchases.google.usecase;

import com.revenuecat.purchases.models.StoreTransaction;
import g00.b0;
import h00.d0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0000\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u001e\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0007\u0012*\u0010\u0011\u001a&\u0012\u0004\u0012\u00020\u000f\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000ej\u0002`\u0010¢\u0006\u0004\b\u0012\u0010\u0013JC\u0010\u0016\u001a\u00020\b2\u001e\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001a\u001a\u00020\b2\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 R/\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b$\u0010#R/\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b%\u0010#R\u0014\u0010(\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCase;", "Lcom/revenuecat/purchases/google/usecase/BillingClientUseCase;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "useCaseParams", "Lkotlin/Function1;", "Lg00/b0;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lqd/a;", "withConnectedClient", "Lkotlin/Function2;", "", "Lcom/revenuecat/purchases/google/usecase/ExecuteRequestOnUIThreadFunction;", "executeRequestOnUIThread", "<init>", "(Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;Lu00/k;Lu00/k;Lu00/k;Lu00/n;)V", "onQueryInAppsSuccess", "onQueryInAppsError", "queryInApps", "(Lu00/k;Lu00/k;)V", "onQuerySubscriptionsSuccess", "onQuerySubscriptionsError", "querySubscriptions", "executeAsync", "()V", "received", "onOk", "(Ljava/util/Map;)V", "Lcom/revenuecat/purchases/google/usecase/QueryPurchasesUseCaseParams;", "Lu00/k;", "getOnSuccess", "()Lu00/k;", "getOnError", "getWithConnectedClient", "getErrorMessage", "()Ljava/lang/String;", "errorMessage", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class QueryPurchasesUseCase extends BillingClientUseCase<Map<String, ? extends StoreTransaction>> {
    private final k onError;
    private final k onSuccess;
    private final QueryPurchasesUseCaseParams useCaseParams;
    private final k withConnectedClient;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqd/a;", "Lg00/b0;", "invoke", "(Lqd/a;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "activeSubs", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        public static final class C00181 extends n implements k {
            final QueryPurchasesUseCase this$0;

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "unconsumedInApps", "Lg00/b0;", "invoke", "(Ljava/util/Map;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class C00191 extends n implements k {
                final Map<String, StoreTransaction> $activeSubs;
                final QueryPurchasesUseCase this$0;

                public C00191(QueryPurchasesUseCase queryPurchasesUseCase, Map<String, StoreTransaction> map) {
                    super(1);
                    this.this$0 = queryPurchasesUseCase;
                    this.$activeSubs = map;
                }

                @Override
                public Object invoke(Object obj) {
                    invoke((Map<String, StoreTransaction>) obj);
                    return b0.a;
                }

                public final void invoke(Map<String, StoreTransaction> unconsumedInApps) {
                    m.e(unconsumedInApps, "unconsumedInApps");
                    this.this$0.onOk2((Map<String, StoreTransaction>) d0.U(this.$activeSubs, unconsumedInApps));
                }
            }

            public C00181(QueryPurchasesUseCase queryPurchasesUseCase) {
                super(1);
                this.this$0 = queryPurchasesUseCase;
            }

            @Override
            public Object invoke(Object obj) {
                invoke((Map<String, StoreTransaction>) obj);
                return b0.a;
            }

            public final void invoke(Map<String, StoreTransaction> activeSubs) {
                m.e(activeSubs, "activeSubs");
                QueryPurchasesUseCase queryPurchasesUseCase = this.this$0;
                queryPurchasesUseCase.queryInApps(new C00191(queryPurchasesUseCase, activeSubs), this.this$0.getOnError());
            }
        }

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public Object invoke(Object obj) {
            invoke((qd.a) obj);
            return b0.a;
        }

        public final void invoke(qd.a invoke) {
            m.e(invoke, "$this$invoke");
            QueryPurchasesUseCase queryPurchasesUseCase = QueryPurchasesUseCase.this;
            queryPurchasesUseCase.querySubscriptions(new C00181(queryPurchasesUseCase), QueryPurchasesUseCase.this.getOnError());
        }
    }

    public QueryPurchasesUseCase(QueryPurchasesUseCaseParams useCaseParams, k onSuccess, k onError, k withConnectedClient, u00.n executeRequestOnUIThread) {
        super(useCaseParams, onError, executeRequestOnUIThread);
        m.e(useCaseParams, "useCaseParams");
        m.e(onSuccess, "onSuccess");
        m.e(onError, "onError");
        m.e(withConnectedClient, "withConnectedClient");
        m.e(executeRequestOnUIThread, "executeRequestOnUIThread");
        this.useCaseParams = useCaseParams;
        this.onSuccess = onSuccess;
        this.onError = onError;
        this.withConnectedClient = withConnectedClient;
    }

    public final void queryInApps(k onQueryInAppsSuccess, k onQueryInAppsError) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "inapp"), onQueryInAppsSuccess, onQueryInAppsError, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    public final void querySubscriptions(k onQuerySubscriptionsSuccess, k onQuerySubscriptionsError) {
        BillingClientUseCase.run$default(new QueryPurchasesByTypeUseCase(new QueryPurchasesByTypeUseCaseParams(this.useCaseParams.getDateProvider(), this.useCaseParams.getDiagnosticsTrackerIfEnabled(), this.useCaseParams.getAppInBackground(), "subs"), onQuerySubscriptionsSuccess, onQuerySubscriptionsError, this.withConnectedClient, getExecuteRequestOnUIThread()), 0L, 1, null);
    }

    @Override
    public void executeAsync() {
        this.withConnectedClient.invoke(new AnonymousClass1());
    }

    @Override
    public String getErrorMessage() {
        return "Error when querying purchases";
    }

    public final k getOnError() {
        return this.onError;
    }

    public final k getOnSuccess() {
        return this.onSuccess;
    }

    public final k getWithConnectedClient() {
        return this.withConnectedClient;
    }

    @Override
    public void onOk(Map<String, ? extends StoreTransaction> map) {
        onOk2((Map<String, StoreTransaction>) map);
    }

    public void onOk2(Map<String, StoreTransaction> received) {
        m.e(received, "received");
        this.onSuccess.invoke(received);
    }
}
