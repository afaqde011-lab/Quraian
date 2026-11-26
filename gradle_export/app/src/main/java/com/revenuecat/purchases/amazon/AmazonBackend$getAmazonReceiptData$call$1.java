package com.revenuecat.purchases.amazon;

import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.Delay;
import com.revenuecat.purchases.common.networking.Endpoint;
import g00.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import u00.a;
import u00.k;
import u00.o;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg00/b0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
public final class AmazonBackend$getAmazonReceiptData$call$1 extends n implements a {
    final List<String> $cacheKey;
    final String $receiptId;
    final String $storeUserID;
    final AmazonBackend this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass1 extends n implements k {
        final List<String> $cacheKey;
        final AmazonBackend this$0;

        public AnonymousClass1(AmazonBackend amazonBackend, List<String> list) {
            super(1);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override
        public Object invoke(Object obj) {
            invoke((PurchasesError) obj);
            return b0.a;
        }

        public final void invoke(PurchasesError error) {
            List<g00.k> listRemove;
            m.e(error, "error");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                Iterator<T> it = listRemove.iterator();
                while (it.hasNext()) {
                    ((k) ((g00.k) it.next()).B).invoke(error);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "", "<anonymous parameter 1>", "Lorg/json/JSONObject;", "body", "Lg00/b0;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;ILorg/json/JSONObject;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class AnonymousClass2 extends n implements o {
        final List<String> $cacheKey;
        final AmazonBackend this$0;

        public AnonymousClass2(AmazonBackend amazonBackend, List<String> list) {
            super(3);
            this.this$0 = amazonBackend;
            this.$cacheKey = list;
        }

        @Override
        public Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((PurchasesError) obj, ((Number) obj2).intValue(), (JSONObject) obj3);
            return b0.a;
        }

        public final void invoke(PurchasesError purchasesError, int i, JSONObject body) {
            List<g00.k> listRemove;
            m.e(body, "body");
            AmazonBackend amazonBackend = this.this$0;
            List<String> list = this.$cacheKey;
            synchronized (amazonBackend) {
                listRemove = amazonBackend.getPostAmazonReceiptCallbacks().remove(list);
            }
            if (listRemove != null) {
                for (g00.k kVar : listRemove) {
                    k kVar2 = (k) kVar.A;
                    k kVar3 = (k) kVar.B;
                    if (purchasesError != null) {
                        kVar3.invoke(purchasesError);
                    } else {
                        kVar2.invoke(body);
                    }
                }
            }
        }
    }

    public AmazonBackend$getAmazonReceiptData$call$1(AmazonBackend amazonBackend, String str, String str2, List<String> list) {
        super(0);
        this.this$0 = amazonBackend;
        this.$storeUserID = str;
        this.$receiptId = str2;
        this.$cacheKey = list;
    }

    @Override
    public Object invoke() {
        m108invoke();
        return b0.a;
    }

    public final void m108invoke() {
        this.this$0.backendHelper.performRequest(new Endpoint.GetAmazonReceipt(this.$storeUserID, this.$receiptId), null, null, Delay.NONE, new AnonymousClass1(this.this$0, this.$cacheKey), new AnonymousClass2(this.this$0, this.$cacheKey));
    }
}
