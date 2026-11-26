package com.revenuecat.purchases.utils;

import android.net.Uri;
import com.google.android.gms.internal.measurement.x5;
import com.revenuecat.purchases.LogHandler;
import com.revenuecat.purchases.LogLevel;
import com.revenuecat.purchases.Offering;
import com.revenuecat.purchases.common.Config;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.paywalls.PaywallData;
import com.revenuecat.purchases.paywalls.components.CarouselComponent;
import com.revenuecat.purchases.paywalls.components.CountdownComponent;
import com.revenuecat.purchases.paywalls.components.IconComponent;
import com.revenuecat.purchases.paywalls.components.ImageComponent;
import com.revenuecat.purchases.paywalls.components.PartialCarouselComponent;
import com.revenuecat.purchases.paywalls.components.PartialImageComponent;
import com.revenuecat.purchases.paywalls.components.PartialStackComponent;
import com.revenuecat.purchases.paywalls.components.PartialTabsComponent;
import com.revenuecat.purchases.paywalls.components.PaywallComponent;
import com.revenuecat.purchases.paywalls.components.StackComponent;
import com.revenuecat.purchases.paywalls.components.StickyFooterComponent;
import com.revenuecat.purchases.paywalls.components.TabsComponent;
import com.revenuecat.purchases.paywalls.components.VideoComponent;
import com.revenuecat.purchases.paywalls.components.common.Background;
import com.revenuecat.purchases.paywalls.components.common.ComponentOverride;
import com.revenuecat.purchases.paywalls.components.common.PaywallComponentsConfig;
import com.revenuecat.purchases.paywalls.components.properties.ImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import h00.j0;
import h00.r;
import h00.v;
import h00.z;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import u00.k;
import w50.c;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u0014H\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0012\u0010\u0017J\u0019\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u0018H\u0002¢\u0006\u0004\b\u0012\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/utils/OfferingImagePreDownloader;", "", "", "shouldPredownloadImages", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "coilImageDownloader", "<init>", "(ZLcom/revenuecat/purchases/utils/CoilImageDownloader;)V", "Lcom/revenuecat/purchases/Offering;", "offering", "Lg00/b0;", "downloadV1Images", "(Lcom/revenuecat/purchases/Offering;)V", "downloadV2Images", "Lcom/revenuecat/purchases/Offering$PaywallComponents;", "paywallComponents", "", "Landroid/net/Uri;", "findImageUrisToDownload", "(Lcom/revenuecat/purchases/Offering$PaywallComponents;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/StackComponent;", "(Lcom/revenuecat/purchases/paywalls/components/StackComponent;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/common/Background;", "(Lcom/revenuecat/purchases/paywalls/components/common/Background;)Ljava/util/Set;", "Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;", "(Lcom/revenuecat/purchases/paywalls/components/properties/ThemeImageUrls;)Ljava/util/Set;", "preDownloadOfferingImages", "Z", "Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OfferingImagePreDownloader {
    private final CoilImageDownloader coilImageDownloader;
    private final boolean shouldPredownloadImages;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;", "invoke", "(Lcom/revenuecat/purchases/paywalls/components/PaywallComponent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 extends n implements k {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override
        public final Boolean invoke(PaywallComponent it) {
            m.e(it, "it");
            return Boolean.valueOf((it instanceof StackComponent) || (it instanceof IconComponent) || (it instanceof CarouselComponent) || (it instanceof TabsComponent) || (it instanceof ImageComponent) || (it instanceof CountdownComponent));
        }
    }

    public OfferingImagePreDownloader(boolean z, CoilImageDownloader coilImageDownloader) {
        m.e(coilImageDownloader, "coilImageDownloader");
        this.shouldPredownloadImages = z;
        this.coilImageDownloader = coilImageDownloader;
    }

    public OfferingImagePreDownloader(boolean z, CoilImageDownloader coilImageDownloader, int i, f fVar) {
        this((i & 1) != 0 ? UtilsKt.getCanUsePaywallUI() : z, coilImageDownloader);
    }

    private final void downloadV1Images(Offering offering) {
        PaywallData paywall = offering.getPaywall();
        if (paywall != null) {
            List<String> all$purchases_defaultsBc8Release = paywall.getConfig().getImages().getAll$purchases_defaultsBc8Release();
            ArrayList<Uri> arrayList = new ArrayList(r.q0(all$purchases_defaultsBc8Release, 10));
            Iterator<T> it = all$purchases_defaultsBc8Release.iterator();
            while (it.hasNext()) {
                arrayList.add(Uri.parse(paywall.getAssetBaseURL().toString()).buildUpon().path((String) it.next()).build());
            }
            for (Uri it2 : arrayList) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Pre-downloading Paywall V1 image: " + it2);
                }
                CoilImageDownloader coilImageDownloader = this.coilImageDownloader;
                m.d(it2, "it");
                coilImageDownloader.downloadImage(it2);
            }
        }
    }

    private final void downloadV2Images(Offering offering) {
        Offering.PaywallComponents paywallComponents = offering.getPaywallComponents();
        if (paywallComponents != null) {
            for (Uri uri : findImageUrisToDownload(paywallComponents)) {
                LogLevel logLevel = LogLevel.DEBUG;
                LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
                if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                    currentLogHandler.d(x5.k(logLevel, new StringBuilder("[Purchases] - ")), "Pre-downloading Paywall V2 image: " + uri);
                }
                this.coilImageDownloader.downloadImage(uri);
            }
        }
    }

    private final Set<Uri> findImageUrisToDownload(Offering.PaywallComponents paywallComponents) {
        StackComponent stack;
        PaywallComponentsConfig base = paywallComponents.getData().getComponentsConfig().getBase();
        Set<Uri> setFindImageUrisToDownload = findImageUrisToDownload(base.getStack());
        StickyFooterComponent stickyFooter = base.getStickyFooter();
        Set<Uri> setFindImageUrisToDownload2 = (stickyFooter == null || (stack = stickyFooter.getStack()) == null) ? null : findImageUrisToDownload(stack);
        if (setFindImageUrisToDownload2 == null) {
            setFindImageUrisToDownload2 = z.A;
        }
        return j0.q0(j0.q0(setFindImageUrisToDownload, setFindImageUrisToDownload2), findImageUrisToDownload(base.getBackground()));
    }

    private final Set<Uri> findImageUrisToDownload(StackComponent stackComponent) {
        Set<Uri> setQ0;
        List<PaywallComponent> listFilter = PaywallComponentFilterExtensionKt.filter(stackComponent, AnonymousClass1.INSTANCE);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (PaywallComponent paywallComponent : listFilter) {
            if (paywallComponent instanceof StackComponent) {
                StackComponent stackComponent2 = (StackComponent) paywallComponent;
                Set<Uri> setFindImageUrisToDownload = findImageUrisToDownload(stackComponent2.getBackground());
                List overrides = stackComponent2.getOverrides();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Iterator it = overrides.iterator();
                while (it.hasNext()) {
                    v.u0(findImageUrisToDownload(((PartialStackComponent) ((ComponentOverride) it.next()).getProperties()).getBackground()), linkedHashSet2);
                }
                setQ0 = j0.q0(setFindImageUrisToDownload, linkedHashSet2);
            } else if (paywallComponent instanceof IconComponent) {
                IconComponent iconComponent = (IconComponent) paywallComponent;
                setQ0 = c.g0(Uri.parse(iconComponent.getBaseUrl()).buildUpon().path(iconComponent.getFormats().getWebp()).build());
            } else if (paywallComponent instanceof CarouselComponent) {
                CarouselComponent carouselComponent = (CarouselComponent) paywallComponent;
                Set<Uri> setFindImageUrisToDownload2 = findImageUrisToDownload(carouselComponent.getBackground());
                List overrides2 = carouselComponent.getOverrides();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                Iterator it2 = overrides2.iterator();
                while (it2.hasNext()) {
                    v.u0(findImageUrisToDownload(((PartialCarouselComponent) ((ComponentOverride) it2.next()).getProperties()).getBackground()), linkedHashSet3);
                }
                setQ0 = j0.q0(setFindImageUrisToDownload2, linkedHashSet3);
            } else if (paywallComponent instanceof TabsComponent) {
                TabsComponent tabsComponent = (TabsComponent) paywallComponent;
                Set<Uri> setFindImageUrisToDownload3 = findImageUrisToDownload(tabsComponent.getBackground());
                List overrides3 = tabsComponent.getOverrides();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet();
                Iterator it3 = overrides3.iterator();
                while (it3.hasNext()) {
                    v.u0(findImageUrisToDownload(((PartialTabsComponent) ((ComponentOverride) it3.next()).getProperties()).getBackground()), linkedHashSet4);
                }
                setQ0 = j0.q0(setFindImageUrisToDownload3, linkedHashSet4);
            } else {
                boolean z = paywallComponent instanceof ImageComponent;
                Set<Uri> set = z.A;
                if (z) {
                    ImageComponent imageComponent = (ImageComponent) paywallComponent;
                    Set<Uri> setFindImageUrisToDownload4 = findImageUrisToDownload(imageComponent.getSource());
                    List overrides4 = imageComponent.getOverrides();
                    LinkedHashSet linkedHashSet5 = new LinkedHashSet();
                    Iterator it4 = overrides4.iterator();
                    while (it4.hasNext()) {
                        ThemeImageUrls source = ((PartialImageComponent) ((ComponentOverride) it4.next()).getProperties()).getSource();
                        Set<Uri> setFindImageUrisToDownload5 = source != null ? findImageUrisToDownload(source) : null;
                        if (setFindImageUrisToDownload5 == null) {
                            setFindImageUrisToDownload5 = set;
                        }
                        v.u0(setFindImageUrisToDownload5, linkedHashSet5);
                    }
                    setQ0 = j0.q0(setFindImageUrisToDownload4, linkedHashSet5);
                } else if (paywallComponent instanceof VideoComponent) {
                    ThemeImageUrls fallbackSource = ((VideoComponent) paywallComponent).getFallbackSource();
                    setQ0 = fallbackSource != null ? findImageUrisToDownload(fallbackSource) : null;
                    if (setQ0 == null) {
                        setQ0 = set;
                    }
                } else if (paywallComponent instanceof CountdownComponent) {
                    CountdownComponent countdownComponent = (CountdownComponent) paywallComponent;
                    Set<Uri> setFindImageUrisToDownload6 = findImageUrisToDownload(countdownComponent.getCountdownStack());
                    StackComponent endStack = countdownComponent.getEndStack();
                    Set<Uri> setFindImageUrisToDownload7 = endStack != null ? findImageUrisToDownload(endStack) : null;
                    if (setFindImageUrisToDownload7 == null) {
                        setFindImageUrisToDownload7 = set;
                    }
                    LinkedHashSet linkedHashSetQ0 = j0.q0(setFindImageUrisToDownload6, setFindImageUrisToDownload7);
                    StackComponent fallback = countdownComponent.getFallback();
                    Set<Uri> setFindImageUrisToDownload8 = fallback != null ? findImageUrisToDownload(fallback) : null;
                    if (setFindImageUrisToDownload8 != null) {
                        set = setFindImageUrisToDownload8;
                    }
                    setQ0 = j0.q0(linkedHashSetQ0, set);
                } else {
                    setQ0 = set;
                }
            }
            v.u0(setQ0, linkedHashSet);
        }
        return linkedHashSet;
    }

    private final Set<Uri> findImageUrisToDownload(Background background) {
        URL webpLowRes;
        String string;
        URL webpLowRes2;
        String string2;
        int i = 0;
        Uri uri = null;
        if (background instanceof Background.Image) {
            Background.Image image = (Background.Image) background;
            Uri uri2 = Uri.parse(image.getValue().getLight().getWebpLowRes().toString());
            ImageUrls dark = image.getValue().getDark();
            if (dark != null && (webpLowRes2 = dark.getWebpLowRes()) != null && (string2 = webpLowRes2.toString()) != null) {
                uri = Uri.parse(string2);
            }
            Uri[] uriArr = {uri2, uri};
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (i < 2) {
                Uri uri3 = uriArr[i];
                if (uri3 != null) {
                    linkedHashSet.add(uri3);
                }
                i++;
            }
            return linkedHashSet;
        }
        if (!(background instanceof Background.Video)) {
            if ((((background instanceof Background.Color ? true : background instanceof Background.Unknown) || background == null) ? 1 : 0) != 0) {
                return z.A;
            }
            throw new NoWhenBranchMatchedException();
        }
        Background.Video video = (Background.Video) background;
        Uri uri4 = Uri.parse(video.getFallbackImage().getLight().getWebpLowRes().toString());
        ImageUrls dark2 = video.getFallbackImage().getDark();
        if (dark2 != null && (webpLowRes = dark2.getWebpLowRes()) != null && (string = webpLowRes.toString()) != null) {
            uri = Uri.parse(string);
        }
        Uri[] uriArr2 = {uri4, uri};
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        while (i < 2) {
            Uri uri5 = uriArr2[i];
            if (uri5 != null) {
                linkedHashSet2.add(uri5);
            }
            i++;
        }
        return linkedHashSet2;
    }

    private final Set<Uri> findImageUrisToDownload(ThemeImageUrls themeImageUrls) {
        URL webpLowRes;
        String string;
        Uri uri = Uri.parse(themeImageUrls.getLight().getWebpLowRes().toString());
        ImageUrls dark = themeImageUrls.getDark();
        Uri[] uriArr = {uri, (dark == null || (webpLowRes = dark.getWebpLowRes()) == null || (string = webpLowRes.toString()) == null) ? null : Uri.parse(string)};
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i = 0; i < 2; i++) {
            Uri uri2 = uriArr[i];
            if (uri2 != null) {
                linkedHashSet.add(uri2);
            }
        }
        return linkedHashSet;
    }

    public final void preDownloadOfferingImages(Offering offering) {
        m.e(offering, "offering");
        if (this.shouldPredownloadImages) {
            LogLevel logLevel = LogLevel.DEBUG;
            LogHandler currentLogHandler = LogWrapperKt.getCurrentLogHandler();
            if (Config.INSTANCE.getLogLevel().compareTo(logLevel) <= 0) {
                x5.w(logLevel, new StringBuilder("[Purchases] - "), currentLogHandler, "OfferingImagePreDownloader: starting image download");
            }
            downloadV1Images(offering);
            downloadV2Images(offering);
            return;
        }
        LogLevel logLevel2 = LogLevel.VERBOSE;
        LogHandler currentLogHandler2 = LogWrapperKt.getCurrentLogHandler();
        if (Config.INSTANCE.getLogLevel().compareTo(logLevel2) <= 0) {
            currentLogHandler2.v("[Purchases] - " + logLevel2.name(), "OfferingImagePreDownloader won't pre-download images");
        }
    }
}
