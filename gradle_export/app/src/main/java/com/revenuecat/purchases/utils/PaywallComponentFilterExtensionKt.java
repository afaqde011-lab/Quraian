package com.revenuecat.purchases.utils;

import com.revenuecat.purchases.paywalls.components.ButtonComponent;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.HeaderComponent;
import com.revenuecat.purchases.paywalls.components.PackageComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.PurchaseButtonComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabControlButtonComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.TimelineComponent;
import h00.n;
import h00.r;
import h00.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.k;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "Lkotlin/Function1;", "", "predicate", "", "filter", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;Lu00/k;)Ljava/util/List;", "purchases_defaultsBc8Release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PaywallComponentFilterExtensionKt {
    public static final List<PaywallComponent> filter(PaywallComponent paywallComponent, k predicate) {
        m.e(paywallComponent, "<this>");
        m.e(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        h00.m mVar = new h00.m();
        mVar.addLast(paywallComponent);
        while (!mVar.isEmpty()) {
            PaywallComponent paywallComponent2 = (PaywallComponent) mVar.removeFirst();
            if (((Boolean) predicate.invoke(paywallComponent2)).booleanValue()) {
                arrayList.add(paywallComponent2);
            }
            if (paywallComponent2 instanceof StackComponent) {
                mVar.addAll(((StackComponent) paywallComponent2).getComponents());
            } else if (paywallComponent2 instanceof PurchaseButtonComponent) {
                mVar.addLast(((PurchaseButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof ButtonComponent) {
                mVar.addLast(((ButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof PackageComponent) {
                mVar.addLast(((PackageComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof HeaderComponent) {
                mVar.addLast(((HeaderComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof StickyFooterComponent) {
                mVar.addLast(((StickyFooterComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof CarouselComponent) {
                mVar.addAll(((CarouselComponent) paywallComponent2).getPages());
            } else if (paywallComponent2 instanceof TabControlButtonComponent) {
                mVar.addLast(((TabControlButtonComponent) paywallComponent2).getStack());
            } else if (paywallComponent2 instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) paywallComponent2;
                TabsComponent.TabControl control = tabsComponent.getControl();
                if (control instanceof TabsComponent.TabControl.Buttons) {
                    mVar.addLast(((TabsComponent.TabControl.Buttons) control).getStack());
                } else if (control instanceof TabsComponent.TabControl.Toggle) {
                    mVar.addLast(((TabsComponent.TabControl.Toggle) control).getStack());
                }
                List tabs = tabsComponent.getTabs();
                ArrayList arrayList2 = new ArrayList(r.q0(tabs, 10));
                Iterator it = tabs.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((TabsComponent.Tab) it.next()).getStack());
                }
                mVar.addAll(arrayList2);
            } else if (paywallComponent2 instanceof TimelineComponent) {
                List<TimelineComponent.Item> items = ((TimelineComponent) paywallComponent2).getItems();
                ArrayList arrayList3 = new ArrayList();
                for (TimelineComponent.Item item : items) {
                    v.u0(n.C0(new PaywallComponent[]{item.getTitle(), item.getDescription(), item.getIcon()}), arrayList3);
                }
                mVar.addAll(arrayList3);
            } else if (paywallComponent2 instanceof CountdownComponent) {
                CountdownComponent countdownComponent = (CountdownComponent) paywallComponent2;
                mVar.addLast(countdownComponent.getCountdownStack());
                StackComponent endStack = countdownComponent.getEndStack();
                if (endStack != null) {
                    mVar.addLast(endStack);
                }
                StackComponent fallback = countdownComponent.getFallback();
                if (fallback != null) {
                    mVar.addLast(fallback);
                }
            }
        }
        return arrayList;
    }
}
