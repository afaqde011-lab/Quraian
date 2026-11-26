package com.revenuecat.purchases.utils;

import a40.c0;
import android.content.Context;
import android.net.Uri;
import com.revenuecat.purchases.PurchasesOrchestrator;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import lb.g;
import lb.j;
import wb.h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/utils/CoilImageDownloader;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "Lg00/b0;", "downloadImage", "(Landroid/net/Uri;)V", "Landroid/content/Context;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CoilImageDownloader {
    private final Context applicationContext;

    public CoilImageDownloader(Context applicationContext) {
        m.e(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    public final void downloadImage(Uri uri) {
        m.e(uri, "uri");
        j imageLoader = PurchasesOrchestrator.INSTANCE.getImageLoader(this.applicationContext);
        h hVar = new h(this.applicationContext);
        hVar.c = uri;
        j jVar = imageLoader;
        c0.g(jVar.e, null, new g(jVar, hVar.a(), (c) null, 0), 3);
    }
}
