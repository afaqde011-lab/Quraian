package com.revenuecat.purchases;

import h00.q;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import p30.f;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/util/Date;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class CustomerInfo$latestExpirationDate$2 extends n implements u00.a {
    final CustomerInfo this$0;

    public CustomerInfo$latestExpirationDate$2(CustomerInfo customerInfo) {
        super(0);
        this.this$0 = customerInfo;
    }

    @Override
    public final Date invoke() {
        List listI1 = q.i1(this.this$0.getAllExpirationDatesByProduct().values(), new Comparator() {
            @Override
            public final int compare(T t, T t2) {
                return f.Z((Date) t, (Date) t2);
            }
        });
        if (listI1.isEmpty()) {
            listI1 = null;
        }
        if (listI1 != null) {
            return (Date) q.T0(listI1);
        }
        return null;
    }
}
