package com.revenuecat.purchases.customercenter;

import h00.d0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import u00.a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$VariableName;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 extends n implements a {
    public static final CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2 INSTANCE = new CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2();

    public CustomerCenterConfigData$Localization$VariableName$Companion$valueMap$2() {
        super(0);
    }

    @Override
    public final Map<String, CustomerCenterConfigData.Localization.VariableName> invoke() {
        CustomerCenterConfigData.Localization.VariableName[] variableNameArrValues = CustomerCenterConfigData.Localization.VariableName.values();
        int iP = d0.P(variableNameArrValues.length);
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (CustomerCenterConfigData.Localization.VariableName variableName : variableNameArrValues) {
            linkedHashMap.put(variableName.getIdentifier(), variableName);
        }
        return linkedHashMap;
    }
}
