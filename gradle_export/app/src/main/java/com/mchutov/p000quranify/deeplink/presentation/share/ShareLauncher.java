package com.mchutov.p000quranify.deeplink.presentation.share;

import a1.f2;
import a40.c0;
import a40.m0;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.Quranify.R;
import f50.c;
import g00.b0;
import h40.d;
import h40.e;
import kotlin.Metadata;
import l00.a;
import r30.k;
import ri.t1;
import wb.h;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ$\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/mchutov/quranify/deeplink/presentation/share/ShareLauncher;", RuntimeVersion.SUFFIX, "<init>", "()V", "Landroid/content/Context;", "context", RuntimeVersion.SUFFIX, "artworkUrl", "Landroid/net/Uri;", "artworkUri", "(Landroid/content/Context;Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "loadArtwork", "appIcon", "(Landroid/content/Context;)Landroid/graphics/Bitmap;", "Loq/a;", "content", "Lg00/b0;", ShareLauncher.ARTWORK_DIRECTORY, "(Landroid/content/Context;Loq/a;Lk00/c;)Ljava/lang/Object;", "MIME_TYPE_TEXT", "Ljava/lang/String;", "ARTWORK_DIRECTORY", "ARTWORK_FILE", RuntimeVersion.SUFFIX, "ARTWORK_SIDE", "I", "ARTWORK_QUALITY", RuntimeVersion.SUFFIX, "ARTWORK_TIMEOUT_MS", "J", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ShareLauncher {
    public static final int $stable = 0;
    private static final String ARTWORK_DIRECTORY = "share";
    private static final String ARTWORK_FILE = "artwork.png";
    private static final int ARTWORK_QUALITY = 100;
    private static final int ARTWORK_SIDE = 256;
    private static final long ARTWORK_TIMEOUT_MS = 800;
    public static final ShareLauncher INSTANCE = new ShareLauncher();
    private static final String MIME_TYPE_TEXT = "text/plain";

    private ShareLauncher() {
    }

    private final Bitmap appIcon(Context context) {
        Drawable drawable = context.getDrawable(R.mipmap.ic_launcher);
        if (drawable != null) {
            return c.b0(drawable, 4);
        }
        return null;
    }

    public final Object artworkUri(Context context, String str, k00.c<? super Uri> cVar) throws Throwable {
        oq.c cVar2;
        if (cVar instanceof oq.c) {
            cVar2 = (oq.c) cVar;
            int i11 = cVar2.D;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                cVar2.D = i11 - Integer.MIN_VALUE;
            } else {
                cVar2 = new oq.c(this, cVar);
            }
        } else {
            cVar2 = new oq.c(this, cVar);
        }
        Object objLoadArtwork = cVar2.B;
        Object obj = a.A;
        int i12 = cVar2.D;
        if (i12 == 0) {
            t1.O(objLoadArtwork);
            cVar2.A = context;
            cVar2.D = 1;
            objLoadArtwork = loadArtwork(context, str, cVar2);
            if (objLoadArtwork != obj) {
            }
        }
        if (i12 != 1) {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objLoadArtwork);
            return objLoadArtwork;
        }
        context = cVar2.A;
        t1.O(objLoadArtwork);
        Bitmap bitmapAppIcon = (Bitmap) objLoadArtwork;
        k00.c cVar3 = null;
        if (bitmapAppIcon == null && (bitmapAppIcon = appIcon(context)) == null) {
            return null;
        }
        e eVar = m0.f281a;
        d dVar = d.C;
        f2 f2Var = new f2(context, bitmapAppIcon, cVar3, 19);
        cVar2.A = null;
        cVar2.D = 2;
        Object objJ = c0.J(f2Var, dVar, cVar2);
        return objJ == obj ? obj : objJ;
    }

    public final Object loadArtwork(Context context, String str, k00.c<? super Bitmap> cVar) {
        k00.c cVar2 = null;
        if (str == null || k.L0(str)) {
            return null;
        }
        h hVar = new h(context);
        hVar.f22083c = str;
        hVar.c(ARTWORK_SIDE);
        hVar.m = Boolean.FALSE;
        return c0.L(ARTWORK_TIMEOUT_MS, new g6.a(context, hVar.a(), cVar2, 25), cVar);
    }

    public final Object share(Context context, oq.a aVar, k00.c<? super b0> cVar) throws Throwable {
        oq.d dVar;
        Intent intent;
        Context context2;
        Intent intent2;
        if (cVar instanceof oq.d) {
            dVar = (oq.d) cVar;
            int i11 = dVar.G;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.G = i11 - Integer.MIN_VALUE;
            } else {
                dVar = new oq.d(this, cVar);
            }
        } else {
            dVar = new oq.d(this, cVar);
        }
        Object obj = dVar.E;
        a aVar2 = a.A;
        int i12 = dVar.G;
        if (i12 == 0) {
            t1.O(obj);
            Intent intent3 = new Intent("android.intent.action.SEND");
            intent3.setType(MIME_TYPE_TEXT);
            intent3.putExtra("android.intent.extra.TEXT", aVar.f16483b);
            intent3.putExtra("android.intent.extra.TITLE", aVar.f16482a);
            ShareLauncher shareLauncher = INSTANCE;
            String str = aVar.f16484c;
            dVar.A = context;
            dVar.B = aVar;
            dVar.C = intent3;
            dVar.D = intent3;
            dVar.G = 1;
            Object objArtworkUri = shareLauncher.artworkUri(context, str, dVar);
            if (objArtworkUri == aVar2) {
                return aVar2;
            }
            intent = intent3;
            obj = objArtworkUri;
            context2 = context;
            intent2 = intent;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            intent2 = dVar.D;
            Intent intent4 = dVar.C;
            oq.a aVar3 = dVar.B;
            context2 = dVar.A;
            t1.O(obj);
            intent = intent4;
            aVar = aVar3;
        }
        Uri uri = (Uri) obj;
        if (uri != null) {
            intent2.setClipData(ClipData.newUri(context2.getContentResolver(), aVar.f16482a, uri));
            intent2.addFlags(1);
        }
        context2.startActivity(Intent.createChooser(intent, context2.getString(R.string.share_chooser_title)));
        return b0.f7770a;
    }
}
