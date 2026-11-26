package b3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import com.amplitude.android.internal.locators.ComposeViewTargetLocator;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.internal.measurement.z3;
import com.google.protobuf.RuntimeVersion;
import g1.b5;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.NoWhenBranchMatchedException;

public final class j0 extends kotlin.jvm.internal.n implements u00.a {
    public final int A;
    public final Object B;

    public j0(Object obj, int i10) {
        super(0);
        this.A = i10;
        this.B = obj;
    }

    public j0(u00.a aVar) {
        super(0);
        this.A = 27;
        this.B = (kotlin.jvm.internal.n) aVar;
    }

    public final Object invoke() {
        int iN0;
        k50.u uVar;
        long j9;
        g00.k kVar;
        g00.k kVar2;
        nb.i iVar;
        int i10;
        int iMin;
        double dMax;
        k50.c0 c0Var;
        Bitmap bitmapCreateBitmap;
        int iE;
        int iE2;
        int i11;
        float fWidth;
        float fHeight;
        int iF;
        int iF2;
        q3.e0 e0Var;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        float fMax;
        int i12 = this.A;
        long j10 = 0;
        int i13 = 4;
        int i14 = 0;
        int i15 = 1;
        g00.b0 b0Var = g00.b0.a;
        Object obj = this.B;
        switch (i12) {
            case 0:
                q0 q0Var = ((l0) obj).f2060h0;
                q0Var.f2122p.Z = true;
                y0 y0Var = q0Var.f2123q;
                if (y0Var != null) {
                    y0Var.T = true;
                }
                return b0Var;
            case 1:
                return (h2.c) obj;
            case 2:
                x40.o oVar = ((b50.m) obj).e;
                kotlin.jvm.internal.m.b(oVar);
                List<Certificate> listA = oVar.a();
                ArrayList arrayList2 = new ArrayList(h00.r.q0(listA, 10));
                for (Certificate certificate : listA) {
                    kotlin.jvm.internal.m.c(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    arrayList2.add((X509Certificate) certificate);
                }
                return arrayList2;
            case 3:
                return Boolean.valueOf(z3.H("androidx.fragment.app.FragmentActivity", ((rc.c) ((a1.u0) obj).B).f()));
            case 4:
                a40.c0.i(((c3.q0) obj).C, (CancellationException) null);
                return b0Var;
            case 5:
                return b0Var;
            case 6:
                View view = ((c3.n1) obj).f2700a;
                return y3.l.b(0L, 0L) ? c3.m0.g(view) : new c3.q1(0L, z3.d(view.getContext()).t(kh.n.m0(0L)));
            case 7:
                w1.c cVar = (w1.c) ((c3.h2) obj).f2675a.B;
                if (!cVar.B) {
                    if (cVar.C) {
                        x1.a.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    cVar.a();
                    cVar.C = true;
                }
                return b0Var;
            case 8:
                c4.z zVar = (c4.z) obj;
                z2.a0 parentLayoutCoordinates = zVar.getParentLayoutCoordinates();
                return Boolean.valueOf((((parentLayoutCoordinates == null || !parentLayoutCoordinates.A()) ? null : parentLayoutCoordinates) == null || zVar.m21getPopupContentSizebOM6tXw() == null) ? false : true);
            case 9:
                return new dd.a((bd.f) obj);
            case 10:
                ((f5.f) obj).a(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
                return b0Var;
            case 11:
                ((g2.a0) obj).D1();
                return b0Var;
            case 12:
                return Float.valueOf(((Number) ((gc.g) obj).getValue()).floatValue());
            case 13:
                b5 b5Var = (b5) obj;
                fd.d dVar = (fd.d) b5Var.f5741g;
                rc.c cVar2 = (rc.c) b5Var.f5737c;
                return dVar.a(b5Var, cVar2.f13151a, (a40.z) b5Var.f5742h, cVar2.f13156f);
            case 14:
                k3.b bVar = (k3.b) obj;
                bVar.f8938h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    bVar.a();
                    return b0Var;
                } finally {
                    Trace.endSection();
                }
            case 15:
                k5.c cVar3 = (k5.c) obj;
                cVar3.g().execute(new androidx.lifecycle.i0(cVar3, 23));
                return b0Var;
            case 16:
                l50.f fVar = (l50.f) obj;
                ClassLoader classLoader = fVar.b;
                k50.o oVar2 = fVar.c;
                Enumeration<URL> resources = classLoader.getResources(RuntimeVersion.SUFFIX);
                kotlin.jvm.internal.m.d(resources, "getResources(...)");
                ArrayList<URL> list = Collections.list(resources);
                kotlin.jvm.internal.m.d(list, "list(...)");
                ArrayList arrayList3 = new ArrayList();
                for (URL url : list) {
                    kotlin.jvm.internal.m.b(url);
                    if (kotlin.jvm.internal.m.a(url.getProtocol(), "file")) {
                        String str = k50.z.B;
                        kVar2 = new g00.k(oVar2, gj.e.j(new File(url.toURI())));
                    } else {
                        kVar2 = null;
                    }
                    if (kVar2 != null) {
                        arrayList3.add(kVar2);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                kotlin.jvm.internal.m.d(resources2, "getResources(...)");
                ArrayList<URL> list2 = Collections.list(resources2);
                kotlin.jvm.internal.m.d(list2, "list(...)");
                ArrayList arrayList4 = new ArrayList();
                for (URL url2 : list2) {
                    kotlin.jvm.internal.m.b(url2);
                    String string = url2.toString();
                    kotlin.jvm.internal.m.d(string, "toString(...)");
                    if (r30.r.x0(string, "jar:file:", false) && (iN0 = r30.k.N0(0, 6, string, "!")) != -1) {
                        String str2 = k50.z.B;
                        String strSubstring = string.substring(i13, iN0);
                        kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                        k50.z zVarJ = gj.e.j(new File(URI.create(strSubstring)));
                        k50.u uVarK = oVar2.k(zVarJ);
                        try {
                            long size = uVarK.size() - ((long) 22);
                            if (size < j10) {
                                throw new IOException("not a zip: size=" + uVarK.size());
                            }
                            long jMax = Math.max(size - MediaStatus.COMMAND_FOLLOW, j10);
                            while (true) {
                                k50.c0 c0VarR = bi.b.r(uVarK.i(size));
                                try {
                                    if (c0VarR.l() == 101010256) {
                                        int iV = c0VarR.v() & 65535;
                                        int iV2 = c0VarR.v() & 65535;
                                        long jV = c0VarR.v() & 65535;
                                        j9 = j10;
                                        if (jV != (c0VarR.v() & 65535) || iV != 0 || iV2 != 0) {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                        uVar = uVarK;
                                        try {
                                            c0VarR.skip(4L);
                                            long jL = ((long) c0VarR.l()) & 4294967295L;
                                            int iV3 = c0VarR.v() & 65535;
                                            l50.d dVar2 = new l50.d(iV3, jV, jL);
                                            c0VarR.x(iV3);
                                            try {
                                                c0VarR.close();
                                                long j11 = size - ((long) 20);
                                                if (j11 > j9) {
                                                    k50.c0 c0VarR2 = bi.b.r(uVar.i(j11));
                                                    try {
                                                        if (c0VarR2.l() == 117853008) {
                                                            int iL = c0VarR2.l();
                                                            long jR = c0VarR2.r();
                                                            if (c0VarR2.l() != 1 || iL != 0) {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                            k50.c0 c0VarR3 = bi.b.r(uVar.i(jR));
                                                            try {
                                                                int iL2 = c0VarR3.l();
                                                                if (iL2 != 101075792) {
                                                                    throw new IOException("bad zip: expected " + l50.b.c(101075792) + " but was " + l50.b.c(iL2));
                                                                }
                                                                c0VarR3.skip(12L);
                                                                int iL3 = c0VarR3.l();
                                                                int iL4 = c0VarR3.l();
                                                                long jR2 = c0VarR3.r();
                                                                if (jR2 != c0VarR3.r() || iL3 != 0 || iL4 != 0) {
                                                                    throw new IOException("unsupported zip: spanned");
                                                                }
                                                                c0VarR3.skip(8L);
                                                                l50.d dVar3 = new l50.d(iV3, jR2, c0VarR3.r());
                                                                c0VarR3.close();
                                                                dVar2 = dVar3;
                                                            } catch (Throwable th2) {
                                                                try {
                                                                    throw th2;
                                                                } catch (Throwable th3) {
                                                                    ta.c0.C(c0VarR3, th2);
                                                                    throw th3;
                                                                }
                                                            }
                                                            th = th;
                                                        }
                                                        c0VarR2.close();
                                                    } catch (Throwable th4) {
                                                        try {
                                                            throw th4;
                                                        } catch (Throwable th5) {
                                                            ta.c0.C(c0VarR2, th4);
                                                            throw th5;
                                                        }
                                                    }
                                                }
                                                l50.d dVar4 = dVar2;
                                                long j12 = dVar4.b;
                                                ArrayList arrayList5 = new ArrayList();
                                                k50.c0 c0VarR4 = bi.b.r(uVar.i(j12));
                                                try {
                                                    long j13 = dVar4.a;
                                                    long j14 = j9;
                                                    while (j14 < j13) {
                                                        l50.g gVarD = l50.b.d(c0VarR4);
                                                        long j15 = j12;
                                                        if (gVarD.g >= j15) {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                        }
                                                        k50.z zVar2 = l50.f.e;
                                                        if (sg.f.D(gVarD.a)) {
                                                            arrayList5.add(gVarD);
                                                        }
                                                        j14++;
                                                        j12 = j15;
                                                        th = th;
                                                    }
                                                    c0VarR4.close();
                                                    k50.l0 l0Var = new k50.l0(zVarJ, oVar2, l50.b.b(arrayList5));
                                                    uVar.close();
                                                    kVar = new g00.k(l0Var, l50.f.e);
                                                } catch (Throwable th6) {
                                                    try {
                                                        throw th6;
                                                    } catch (Throwable th7) {
                                                        ta.c0.C(c0VarR4, th6);
                                                        throw th7;
                                                    }
                                                }
                                            } catch (Throwable th8) {
                                                th = th8;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                        th = th9;
                                    } else {
                                        long j16 = j10;
                                        k50.u uVar2 = uVarK;
                                        c0VarR.close();
                                        size--;
                                        if (size < jMax) {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                        uVarK = uVar2;
                                        j10 = j16;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                }
                                c0VarR.close();
                                throw th;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            uVar = uVarK;
                        }
                        Throwable th12 = th;
                        try {
                            throw th12;
                        } catch (Throwable th13) {
                            ta.c0.C(uVar, th12);
                            throw th13;
                        }
                    }
                    j9 = j10;
                    kVar = null;
                    if (kVar != null) {
                        arrayList4.add(kVar);
                    }
                    j10 = j9;
                    i13 = 4;
                }
                return h00.q.Y0(arrayList4, arrayList3);
            case 17:
                m5.c cVar4 = (m5.c) obj;
                cVar4.h().execute(new androidx.lifecycle.i0(cVar4, 29));
                return b0Var;
            case TYPE_SINT64_VALUE:
                return (wb.i) ((mb.j) obj).R.getValue();
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                nb.d dVar5 = (nb.d) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                wb.l lVar = dVar5.f11201b;
                nb.o oVar3 = dVar5.f11200a;
                l60.v vVar = new l60.v(oVar3.i());
                k50.c0 c0VarR5 = bi.b.r(vVar);
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(new k50.g(bi.b.r(new k50.a0(c0VarR5)), 1), null, options);
                Exception exc = (Exception) vVar.C;
                if (exc != null) {
                    throw exc;
                }
                options.inJustDecodeBounds = false;
                Paint paint = nb.l.f11209a;
                String str3 = options.outMimeType;
                nb.k kVar3 = dVar5.f11203d;
                Set set = nb.m.f11210a;
                int iOrdinal = kVar3.ordinal();
                if (iOrdinal == 0) {
                    iVar = nb.i.f11206c;
                } else {
                    if (iOrdinal != 1) {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (str3 == null || !nb.m.f11210a.contains(str3)) {
                        iVar = nb.i.f11206c;
                    }
                    y5.g gVar = new y5.g(new nb.j(new k50.g(bi.b.r(new k50.a0(c0VarR5)), 1)));
                    y5.c cVarC = gVar.c("Orientation");
                    if (cVarC == null) {
                        iE = 1;
                    } else {
                        try {
                            iE = cVarC.e(gVar.f16634f);
                        } catch (NumberFormatException unused) {
                            iE = 1;
                        }
                    }
                    boolean z12 = iE == 2 || iE == 7 || iE == 4 || iE == 5;
                    y5.c cVarC2 = gVar.c("Orientation");
                    if (cVarC2 == null) {
                        iE2 = 1;
                    } else {
                        try {
                            iE2 = cVarC2.e(gVar.f16634f);
                        } catch (NumberFormatException unused2) {
                            iE2 = 1;
                        }
                    }
                    switch (iE2) {
                        case 3:
                        case 4:
                            i11 = 180;
                            break;
                        case 5:
                        case 8:
                            i11 = 270;
                            break;
                        case 6:
                        case 7:
                            i11 = 90;
                            break;
                        default:
                            i11 = 0;
                            break;
                    }
                    iVar = new nb.i(i11, z12);
                }
                int i16 = iVar.f11208b;
                boolean z13 = iVar.f11207a;
                Exception exc2 = (Exception) vVar.C;
                if (exc2 != null) {
                    throw exc2;
                }
                options.inMutable = false;
                ColorSpace colorSpace = lVar.f15962c;
                Context context = lVar.f15960a;
                xb.g gVar2 = lVar.f15963d;
                if (colorSpace != null) {
                    options.inPreferredColorSpace = colorSpace;
                }
                options.inPremultiplied = lVar.f15967h;
                Bitmap.Config config = lVar.f15961b;
                if ((z13 || i16 > 0) && (config == null || config == Bitmap.Config.HARDWARE)) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (lVar.f15966g && config == Bitmap.Config.ARGB_8888 && kotlin.jvm.internal.m.a(options.outMimeType, "image/jpeg")) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap.Config config2 = options.outConfig;
                Bitmap.Config config3 = Bitmap.Config.RGBA_F16;
                if (config2 == config3 && config != Bitmap.Config.HARDWARE) {
                    config = config3;
                }
                options.inPreferredConfig = config;
                ab.a0 a0VarA = oVar3.a();
                if ((a0VarA instanceof nb.p) && kotlin.jvm.internal.m.a(gVar2, xb.g.f16512c)) {
                    options.inSampleSize = 1;
                    options.inScaled = true;
                    options.inDensity = ((nb.p) a0VarA).f11211a;
                    options.inTargetDensity = context.getResources().getDisplayMetrics().densityDpi;
                    i15 = 1;
                    c0VarR5 = c0VarR5;
                } else {
                    int i17 = options.outWidth;
                    if (i17 <= 0 || (i10 = options.outHeight) <= 0) {
                        options.inSampleSize = i15;
                        options.inScaled = false;
                    } else {
                        int i18 = (i16 == 90 || i16 == 270) ? i10 : i17;
                        if (i16 != 90 && i16 != 270) {
                            i17 = i10;
                        }
                        xb.f fVar2 = lVar.f15964e;
                        xb.g gVar3 = xb.g.f16512c;
                        int iD = kotlin.jvm.internal.m.a(gVar2, gVar3) ? i18 : bc.d.d(gVar2.f16513a, fVar2);
                        int iD2 = kotlin.jvm.internal.m.a(gVar2, gVar3) ? i17 : bc.d.d(gVar2.f16514b, fVar2);
                        int iHighestOneBit = Integer.highestOneBit(i18 / iD);
                        int iHighestOneBit2 = Integer.highestOneBit(i17 / iD2);
                        int iOrdinal2 = fVar2.ordinal();
                        if (iOrdinal2 == 0) {
                            iMin = Math.min(iHighestOneBit, iHighestOneBit2);
                        } else {
                            if (iOrdinal2 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iMin = Math.max(iHighestOneBit, iHighestOneBit2);
                        }
                        if (iMin < 1) {
                            iMin = 1;
                        }
                        options.inSampleSize = iMin;
                        c0VarR5 = c0VarR5;
                        double d3 = iMin;
                        double d5 = ((double) iD) / (((double) i18) / d3);
                        double d10 = ((double) iD2) / (((double) i17) / d3);
                        int iOrdinal3 = fVar2.ordinal();
                        if (iOrdinal3 == 0) {
                            dMax = Math.max(d5, d10);
                        } else {
                            if (iOrdinal3 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            dMax = Math.min(d5, d10);
                        }
                        if (lVar.f15965f && dMax > 1.0d) {
                            dMax = 1.0d;
                        }
                        boolean z14 = dMax == 1.0d;
                        options.inScaled = !z14;
                        if (!z14) {
                            if (dMax > 1.0d) {
                                options.inDensity = w00.a.E(((double) Integer.MAX_VALUE) / dMax);
                                options.inTargetDensity = Integer.MAX_VALUE;
                            } else {
                                options.inDensity = Integer.MAX_VALUE;
                                options.inTargetDensity = w00.a.E(((double) Integer.MAX_VALUE) * dMax);
                            }
                        }
                        i15 = 1;
                    }
                }
                try {
                    c0Var = c0VarR5;
                    try {
                        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(new k50.g(c0Var, i15), null, options);
                        c0Var.close();
                        Exception exc3 = (Exception) vVar.C;
                        if (exc3 != null) {
                            throw exc3;
                        }
                        if (bitmapDecodeStream == null) {
                            throw new IllegalStateException("BitmapFactory returned a null bitmap. Often this means BitmapFactory could not decode the image data read from the input source (e.g. network, disk, or memory) as it's not encoded as a valid image format.");
                        }
                        bitmapDecodeStream.setDensity(context.getResources().getDisplayMetrics().densityDpi);
                        if (z13 || i16 > 0) {
                            Matrix matrix = new Matrix();
                            float width = bitmapDecodeStream.getWidth() / 2.0f;
                            float height = bitmapDecodeStream.getHeight() / 2.0f;
                            if (z13) {
                                matrix.postScale(-1.0f, 1.0f, width, height);
                            }
                            if (i16 > 0) {
                                matrix.postRotate(i16, width, height);
                            }
                            RectF rectF = new RectF(0.0f, 0.0f, bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                            matrix.mapRect(rectF);
                            float f3 = rectF.left;
                            if (f3 != 0.0f || rectF.top != 0.0f) {
                                matrix.postTranslate(-f3, -rectF.top);
                            }
                            if (i16 == 90 || i16 == 270) {
                                int height2 = bitmapDecodeStream.getHeight();
                                int width2 = bitmapDecodeStream.getWidth();
                                Bitmap.Config config4 = bitmapDecodeStream.getConfig();
                                if (config4 == null) {
                                    config4 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(height2, width2, config4);
                            } else {
                                int width3 = bitmapDecodeStream.getWidth();
                                int height3 = bitmapDecodeStream.getHeight();
                                Bitmap.Config config5 = bitmapDecodeStream.getConfig();
                                if (config5 == null) {
                                    config5 = Bitmap.Config.ARGB_8888;
                                }
                                bitmapCreateBitmap = Bitmap.createBitmap(width3, height3, config5);
                            }
                            new Canvas(bitmapCreateBitmap).drawBitmap(bitmapDecodeStream, matrix, nb.l.f11209a);
                            bitmapDecodeStream.recycle();
                            bitmapDecodeStream = bitmapCreateBitmap;
                        }
                        return new nb.f(new BitmapDrawable(context.getResources(), bitmapDecodeStream), options.inSampleSize > 1 || options.inScaled);
                    } catch (Throwable th14) {
                        th = th14;
                        Throwable th15 = th;
                        try {
                            throw th15;
                        } catch (Throwable th16) {
                            ta.c0.C(c0Var, th15);
                            throw th16;
                        }
                    }
                } catch (Throwable th17) {
                    th = th17;
                    c0Var = c0VarR5;
                }
                break;
                break;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                nb.t tVar = (nb.t) obj;
                nb.o oVar4 = tVar.f11214a;
                wb.l lVar2 = tVar.f11215b;
                k50.k kVarI = oVar4.i();
                try {
                    sd.p1 p1VarU = sd.p1.u(kVarI.l0());
                    kVarI.close();
                    sd.r0 r0Var = (sd.r0) p1VarU.B;
                    db.g gVar4 = (db.g) p1VarU.C;
                    if (r0Var == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    h2.a aVar = r0Var.f13962o;
                    RectF rectF2 = aVar == null ? null : new RectF(aVar.f6540b, aVar.f6541c, aVar.c(), aVar.d());
                    if (rectF2 != null) {
                        fWidth = rectF2.width();
                        fHeight = rectF2.height();
                    } else {
                        if (((sd.r0) p1VarU.B) == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        fWidth = p1VarU.s().f6542d;
                        if (((sd.r0) p1VarU.B) == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        fHeight = p1VarU.s().f6543e;
                    }
                    xb.f fVar3 = lVar2.f15964e;
                    xb.g gVar5 = lVar2.f15963d;
                    g00.k kVar4 = kotlin.jvm.internal.m.a(gVar5, xb.g.f16512c) ? new g00.k(Float.valueOf(fWidth > 0.0f ? fWidth : 512.0f), Float.valueOf(fHeight > 0.0f ? fHeight : 512.0f)) : new g00.k(Float.valueOf(c7.i.Y(gVar5.f16513a, fVar3)), Float.valueOf(c7.i.Y(gVar5.f16514b, fVar3)));
                    float fFloatValue = ((Number) kVar4.A).floatValue();
                    float fFloatValue2 = ((Number) kVar4.B).floatValue();
                    if (fWidth <= 0.0f || fHeight <= 0.0f) {
                        iF = w00.a.F(fFloatValue);
                        iF2 = w00.a.F(fFloatValue2);
                    } else {
                        float f10 = fFloatValue / fWidth;
                        float f11 = fFloatValue2 / fHeight;
                        int iOrdinal4 = lVar2.f15964e.ordinal();
                        if (iOrdinal4 == 0) {
                            fMax = Math.max(f10, f11);
                        } else {
                            if (iOrdinal4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            fMax = Math.min(f10, f11);
                        }
                        iF = (int) (fMax * fWidth);
                        iF2 = (int) (fMax * fHeight);
                    }
                    if (rectF2 == null && fWidth > 0.0f && fHeight > 0.0f) {
                        sd.r0 r0Var2 = (sd.r0) p1VarU.B;
                        if (r0Var2 == null) {
                            throw new IllegalArgumentException("SVG document is empty");
                        }
                        r0Var2.f13962o = new h2.a(0.0f, 0.0f, fWidth, fHeight);
                    }
                    sd.r0 r0Var3 = (sd.r0) p1VarU.B;
                    if (r0Var3 == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    r0Var3.f14074r = sd.h2.s("100%");
                    sd.r0 r0Var4 = (sd.r0) p1VarU.B;
                    if (r0Var4 == null) {
                        throw new IllegalArgumentException("SVG document is empty");
                    }
                    r0Var4.f14075s = sd.h2.s("100%");
                    Bitmap.Config config6 = lVar2.f15961b;
                    if (config6 == null || config6 == Bitmap.Config.HARDWARE) {
                        config6 = Bitmap.Config.ARGB_8888;
                    }
                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(iF, iF2, config6);
                    wb.m mVar = (wb.m) lVar2.l.A.get("coil#css");
                    String str4 = (String) (mVar != null ? mVar.f15973a : null);
                    if (str4 != null) {
                        e0Var = new q3.e0(5);
                        c7.g gVar6 = new c7.g(2);
                        sd.c cVar5 = new sd.c(str4);
                        cVar5.c0();
                        e0Var.B = gVar6.h(cVar5);
                    } else {
                        e0Var = null;
                    }
                    Canvas canvas = new Canvas(bitmapCreateBitmap2);
                    if (e0Var == null) {
                        e0Var = new q3.e0(5);
                    }
                    if (((h2.a) e0Var.C) == null) {
                        e0Var.C = new h2.a(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
                    }
                    sd.y1 y1Var = new sd.y1();
                    y1Var.f14132a = canvas;
                    y1Var.f14133b = p1VarU;
                    sd.r0 r0Var5 = (sd.r0) p1VarU.B;
                    if (r0Var5 == null) {
                        Log.w("SVGAndroidRenderer", "Nothing to render. Document is empty.");
                    } else {
                        h2.a aVar2 = r0Var5.f13962o;
                        sd.q qVar = r0Var5.f13946n;
                        db.g gVar7 = (db.g) e0Var.B;
                        if (gVar7 == null) {
                            z10 = false;
                        } else {
                            ArrayList arrayList6 = gVar7.B;
                            if ((arrayList6 != null ? arrayList6.size() : 0) > 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                        }
                        if (z10) {
                            gVar4.d((db.g) e0Var.B);
                        }
                        y1Var.f14134c = new sd.w1();
                        y1Var.f14135d = new Stack();
                        y1Var.d0((sd.w1) y1Var.f14134c, sd.q0.a());
                        sd.w1 w1Var = (sd.w1) y1Var.f14134c;
                        w1Var.f14113f = null;
                        w1Var.f14115h = false;
                        ((Stack) y1Var.f14135d).push(new sd.w1(w1Var));
                        y1Var.f14137f = new Stack();
                        y1Var.f14136e = new Stack();
                        Boolean bool = r0Var5.f14104d;
                        if (bool != null) {
                            ((sd.w1) y1Var.f14134c).f14115h = bool.booleanValue();
                        }
                        y1Var.a0();
                        h2.a aVar3 = new h2.a((h2.a) e0Var.C);
                        sd.c0 c0Var2 = r0Var5.f14074r;
                        if (c0Var2 != null) {
                            aVar3.f6542d = c0Var2.b(y1Var, aVar3.f6542d);
                        }
                        sd.c0 c0Var3 = r0Var5.f14075s;
                        if (c0Var3 != null) {
                            aVar3.f6543e = c0Var3.b(y1Var, aVar3.f6543e);
                        }
                        y1Var.P(r0Var5, aVar3, aVar2, qVar);
                        y1Var.Z();
                        db.g gVar8 = (db.g) e0Var.B;
                        if (gVar8 == null) {
                            z11 = false;
                        } else {
                            ArrayList arrayList7 = gVar8.B;
                            if ((arrayList7 != null ? arrayList7.size() : 0) > 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                        }
                        if (z11 && (arrayList = gVar4.B) != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (((sd.l) it.next()).f14016c == 2) {
                                    it.remove();
                                }
                            }
                        }
                    }
                    return new nb.f(new BitmapDrawable(lVar2.f15960a.getResources(), bitmapCreateBitmap2), true);
                } catch (Throwable th18) {
                    try {
                        throw th18;
                    } catch (Throwable th19) {
                        ta.c0.C(kVarI, th18);
                        throw th19;
                    }
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ((o2.i0) obj).H.setValue(b0Var);
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                Object systemService = ((View) ((k9.x0) obj).B).getContext().getSystemService("input_method");
                kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 23:
                return new BaseInputConnection(((r3.z) obj).f13104a, false);
            case 24:
                return new td.a((td.b) obj, i14);
            case 25:
                return ((u2.d) obj).f14924d;
            case RuntimeVersion.MINOR:
                return ((u2.i) obj).B1();
            case 27:
                try {
                    return (List) ((kotlin.jvm.internal.n) obj).invoke();
                } catch (SSLPeerUnverifiedException unused3) {
                    return h00.x.A;
                }
            default:
                return new defpackage.b(((ComposeViewTargetLocator) obj).f3167a);
        }
    }
}
