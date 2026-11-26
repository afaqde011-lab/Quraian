package com.revenuecat.purchases.utils;

import android.content.Context;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import com.revenuecat.purchases.paywalls.components.common.ComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData;
import com.revenuecat.purchases.storage.DefaultFileRepository;
import com.revenuecat.purchases.storage.FileRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/utils/OfferingVideoPredownloader;", "", "Landroid/content/Context;", "context", "", "canShowPaywalls", "Lcom/revenuecat/purchases/storage/FileRepository;", "fileRepository", "<init>", "(Landroid/content/Context;ZLcom/revenuecat/purchases/storage/FileRepository;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Lg00/b0;", "downloadVideos", "(Lcom/revenuecat/purchases/Offering;)V", "Lcom/revenuecat/purchases/storage/FileRepository;", "shouldPredownload", "Z", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingVideoPredownloader {
    private final FileRepository fileRepository;
    private final boolean shouldPredownload;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "invoke", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final Boolean invoke(PaywallComponent it) {
            m.e(it, "it");
            return Boolean.valueOf(it instanceof VideoComponent);
        }
    }

    public OfferingVideoPredownloader(Context context, boolean z, FileRepository fileRepository) {
        m.e(context, "context");
        m.e(fileRepository, "fileRepository");
        this.fileRepository = fileRepository;
        this.shouldPredownload = z;
    }

    public OfferingVideoPredownloader(Context context, boolean z, FileRepository fileRepository, int i, f fVar) {
        this(context, (i & 2) != 0 ? UtilsKt.getCanUsePaywallUI() : z, (i & 4) != 0 ? new DefaultFileRepository(context) : fileRepository);
    }

    public final void downloadVideos(Offering offering) {
        Offering.PaywallComponents paywallComponents;
        PaywallComponentsData data;
        ComponentsConfig componentsConfig;
        PaywallComponentsConfig base;
        StackComponent stack;
        List<PaywallComponent> listFilter;
        m.e(offering, "offering");
        if (!this.shouldPredownload || (paywallComponents = offering.getPaywallComponents()) == null || (data = paywallComponents.getData()) == null || (componentsConfig = data.getComponentsConfig()) == null || (base = componentsConfig.getBase()) == null || (stack = base.getStack()) == null || (listFilter = PaywallComponentFilterExtensionKt.filter(stack, AnonymousClass1.INSTANCE)) == null) {
            return;
        }
        for (PaywallComponent paywallComponent : listFilter) {
            if (paywallComponent instanceof VideoComponent) {
                this.fileRepository.prefetch(OfferingVideoPredownloaderKt.checkedUrls(((VideoComponent) paywallComponent).getSource()));
            }
        }
    }
}
