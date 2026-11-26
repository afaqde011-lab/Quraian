package o9;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.common.ParserException;
import com.google.android.gms.cast.MediaError;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revenuecat.purchases.Offerings;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.interfaces.SyncAttributesAndOfferingsCallback;
import d40.p1;
import fh.d2;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import l1.i1;
import l1.p2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import tf.d4;
import tf.h1;
import tf.i2;
import tf.j3;
import tf.q1;
import tf.t1;
import tf.y3;

public final class q implements xf.f, o.w, p.m, j10.m, p7.j, com.google.android.gms.common.api.internal.q, d4, tf.r0, u7.a, ub.g, SyncAttributesAndOfferingsCallback {
    public final int A;
    public Object B;

    public q(int i10) {
        this.A = i10;
        switch (i10) {
            case 23:
                this.B = new ArrayList();
                break;
            case 28:
                this.B = new e5.g();
                break;
            default:
                this.B = null;
                break;
        }
    }

    public q(int i10, boolean z10) {
        this.A = i10;
    }

    public q(Bundle bundle) {
        this.A = 3;
        this.B = new Bundle(bundle);
    }

    public q(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public q(oi.l lVar, String str) {
        this.A = 2;
        this.B = lVar;
    }

    public q(ui.b bVar) {
        this.A = 29;
        this.B = new File((File) bVar.D, "com.crashlytics.settings.json");
    }

    public q(boolean z10) {
        this.A = 16;
        this.B = new AtomicBoolean(z10);
    }

    public static boolean P(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String W(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static q b0(String str) {
        return new q((TextUtils.isEmpty(str) || str.length() > 1) ? q1.UNINITIALIZED : t1.e(str.charAt(0)), 17);
    }

    public Object A(m10.k0 k0Var, Object obj) throws NoWhenBranchMatchedException {
        Y(k0Var, (StringBuilder) obj, "setter");
        return g00.b0.a;
    }

    @Override
    public void B(long j9) {
        ArrayList arrayList = (ArrayList) this.B;
        int iJ = J(j9);
        if (iJ == 0) {
            return;
        }
        long j10 = ((x8.a) arrayList.get(iJ - 1)).f16479d;
        if (j10 == -9223372036854775807L || j10 >= j9) {
            iJ--;
        }
        arrayList.subList(0, iJ).clear();
    }

    public Object C(m10.r0 r0Var, Object obj) {
        ((p20.h) this.B).e0(r0Var, true, (StringBuilder) obj, true);
        return g00.b0.a;
    }

    public sg.d D(sg.d dVar) {
        return dVar instanceof sg.j ? dVar : new sg.b(-((sg.i) this.B).h(), dVar);
    }

    public Object E(m10.w wVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        p20.h hVar = (p20.h) this.B;
        hVar.getClass();
        n20.c cVar = wVar.E;
        sb2.append(hVar.I("package"));
        n20.d dVar = cVar.a;
        kotlin.jvm.internal.m.e(dVar, "fqName");
        String strO = hVar.o(va.a.f0(n20.d.f(dVar)));
        if (strO.length() > 0) {
            sb2.append(" ");
            sb2.append(strO);
        }
        if (hVar.a.n()) {
            sb2.append(" in context of ");
            hVar.P(wVar.D, sb2, false);
        }
        return g00.b0.a;
    }

    public void F(int i10, int i11, a8.r rVar) throws ParserException {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j9;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        s8.f fVar = (s8.f) this.B;
        s8.g gVar = fVar.f13869b;
        SparseArray sparseArray = fVar.f13871c;
        e7.u uVar = fVar.f13887k;
        e7.u uVar2 = fVar.f13883i;
        int i23 = 2;
        int i24 = 0;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (fVar.O != 2) {
                    return;
                }
                s8.e eVar = (s8.e) sparseArray.get(fVar.U);
                int i25 = fVar.X;
                e7.u uVar3 = fVar.f13890p;
                if (i25 != 4 || !"V_VP9".equals(eVar.f13838c)) {
                    rVar.u(i11);
                    return;
                } else {
                    uVar3.K(i11);
                    rVar.readFully(uVar3.f5182a, 0, i11);
                    return;
                }
            }
            if (i10 == 16877) {
                fVar.g(i10);
                s8.e eVar2 = fVar.f13899y;
                int i26 = eVar2.f13844h;
                if (i26 != 1685485123 && i26 != 1685480259) {
                    rVar.u(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                eVar2.P = bArr;
                rVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 16981) {
                fVar.g(i10);
                byte[] bArr2 = new byte[i11];
                fVar.f13899y.f13846j = bArr2;
                rVar.readFully(bArr2, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr3 = new byte[i11];
                rVar.readFully(bArr3, 0, i11);
                fVar.g(i10);
                fVar.f13899y.f13847k = new a8.k0(1, bArr3, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(uVar.f5182a, (byte) 0);
                rVar.readFully(uVar.f5182a, 4 - i11, i11);
                uVar.N(0);
                fVar.A = (int) uVar.C();
                return;
            }
            if (i10 == 25506) {
                fVar.g(i10);
                byte[] bArr4 = new byte[i11];
                fVar.f13899y.l = bArr4;
                rVar.readFully(bArr4, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw ParserException.a(null, "Unexpected id: " + i10);
            }
            fVar.g(i10);
            byte[] bArr5 = new byte[i11];
            fVar.f13899y.f13858x = bArr5;
            rVar.readFully(bArr5, 0, i11);
            return;
        }
        int i27 = 8;
        if (fVar.O == 0) {
            fVar.U = (int) gVar.b(rVar, false, true, 8);
            fVar.V = gVar.f13904c;
            fVar.Q = -9223372036854775807L;
            fVar.O = 1;
            uVar2.K(0);
        }
        s8.e eVar3 = (s8.e) sparseArray.get(fVar.U);
        if (eVar3 == null) {
            rVar.u(i11 - fVar.V);
            fVar.O = 0;
            return;
        }
        eVar3.f13835a0.getClass();
        if (fVar.O == 1) {
            fVar.k(rVar, 3);
            int i28 = (uVar2.f5182a[2] & 6) >> 1;
            if (i28 == 0) {
                fVar.S = 1;
                int[] iArr = fVar.T;
                if (iArr == null) {
                    iArr = new int[1];
                } else if (iArr.length < 1) {
                    iArr = new int[Math.max(iArr.length * 2, 1)];
                }
                fVar.T = iArr;
                iArr[0] = (i11 - fVar.V) - 3;
            } else {
                fVar.k(rVar, 4);
                int i29 = (uVar2.f5182a[3] & 255) + 1;
                fVar.S = i29;
                int[] iArr2 = fVar.T;
                if (iArr2 == null) {
                    iArr2 = new int[i29];
                    i12 = 4;
                } else {
                    i12 = 4;
                    if (iArr2.length < i29) {
                        iArr2 = new int[Math.max(iArr2.length * 2, i29)];
                    }
                }
                fVar.T = iArr2;
                if (i28 == 2) {
                    int i30 = (i11 - fVar.V) - 4;
                    int i31 = fVar.S;
                    Arrays.fill(iArr2, 0, i31, i30 / i31);
                } else {
                    if (i28 == 1) {
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = i12;
                        while (true) {
                            i19 = fVar.S - 1;
                            if (i32 >= i19) {
                                break;
                            }
                            fVar.T[i32] = 0;
                            while (true) {
                                i20 = i34 + 1;
                                fVar.k(rVar, i20);
                                int i35 = uVar2.f5182a[i34] & 255;
                                int[] iArr3 = fVar.T;
                                i21 = iArr3[i32] + i35;
                                iArr3[i32] = i21;
                                if (i35 != 255) {
                                    break;
                                } else {
                                    i34 = i20;
                                }
                            }
                            i33 += i21;
                            i32++;
                            i34 = i20;
                        }
                        fVar.T[i19] = ((i11 - fVar.V) - i34) - i33;
                    } else {
                        if (i28 != 3) {
                            throw ParserException.a(null, "Unexpected lacing value: " + i28);
                        }
                        int i36 = 0;
                        int i37 = 0;
                        int i38 = i12;
                        while (true) {
                            int i39 = fVar.S - 1;
                            if (i36 >= i39) {
                                i13 = i23;
                                i14 = i24;
                                fVar.T[i39] = ((i11 - fVar.V) - i38) - i37;
                                break;
                            }
                            fVar.T[i36] = i24;
                            int i40 = i38 + 1;
                            fVar.k(rVar, i40);
                            if (uVar2.f5182a[i38] == 0) {
                                throw ParserException.a(null, "No valid varint length mask found");
                            }
                            int i41 = i24;
                            while (true) {
                                if (i41 >= i27) {
                                    i15 = i27;
                                    i16 = i23;
                                    i17 = i24;
                                    j9 = 0;
                                    i18 = i40;
                                    break;
                                }
                                i15 = i27;
                                int i42 = 1 << (7 - i41);
                                i17 = i24;
                                if ((uVar2.f5182a[i38] & i42) != 0) {
                                    i18 = i40 + i41;
                                    fVar.k(rVar, i18);
                                    i16 = i23;
                                    j9 = (~i42) & uVar2.f5182a[i38] & 255;
                                    while (i40 < i18) {
                                        j9 = (j9 << i15) | ((long) (uVar2.f5182a[i40] & 255));
                                        i40++;
                                    }
                                    if (i36 <= 0) {
                                        break;
                                    }
                                    j9 -= (1 << ((i41 * 7) + 6)) - 1;
                                    break;
                                }
                                i41++;
                                i24 = i17;
                                i27 = i15;
                            }
                            if (j9 < -2147483648L || j9 > 2147483647L) {
                                throw ParserException.a(null, "EBML lacing sample size out of range.");
                            }
                            int i43 = (int) j9;
                            int[] iArr4 = fVar.T;
                            if (i36 != 0) {
                                i43 += iArr4[i36 - 1];
                            }
                            iArr4[i36] = i43;
                            i37 += i43;
                            i36++;
                            i38 = i18;
                            i24 = i17;
                            i27 = i15;
                            i23 = i16;
                        }
                    }
                    byte[] bArr6 = uVar2.f5182a;
                    fVar.P = fVar.m((bArr6[1] & 255) | (bArr6[i14] << 8)) + fVar.M;
                    if (eVar3.f13841e != 1 || (i10 == 163 && (uVar2.f5182a[i13] & 128) == 128)) {
                        i22 = 1;
                    } else {
                        i22 = i14;
                    }
                    fVar.W = i22;
                    fVar.O = i13;
                    fVar.R = i14;
                }
            }
            i13 = 2;
            i14 = 0;
            byte[] bArr7 = uVar2.f5182a;
            fVar.P = fVar.m((bArr7[1] & 255) | (bArr7[i14] << 8)) + fVar.M;
            if (eVar3.f13841e != 1) {
                i22 = 1;
            } else {
                i22 = 1;
            }
            fVar.W = i22;
            fVar.O = i13;
            fVar.R = i14;
        }
        if (i10 == 163) {
            while (true) {
                int i44 = fVar.R;
                if (i44 >= fVar.S) {
                    fVar.O = 0;
                    return;
                }
                fVar.h(eVar3, ((long) ((fVar.R * eVar3.f13842f) / 1000)) + fVar.P, fVar.W, fVar.n(rVar, eVar3, fVar.T[i44], false), 0);
                fVar.R++;
            }
        } else {
            while (true) {
                int i45 = fVar.R;
                if (i45 >= fVar.S) {
                    return;
                }
                int[] iArr5 = fVar.T;
                iArr5[i45] = fVar.n(rVar, eVar3, iArr5[i45], true);
                fVar.R++;
            }
        }
    }

    public long G(long j9) {
        e5.g gVar = (e5.g) this.B;
        gVar.getClass();
        if (y3.q.b(j9) <= 0.0f || y3.q.c(j9) <= 0.0f) {
            y2.a.c("maximumVelocity should be a positive value. You specified=" + ((Object) y3.q.g(j9)));
        }
        return p30.f.U(((w2.c) gVar.f5099c).b(y3.q.b(j9)), ((w2.c) gVar.f5097a).b(y3.q.c(j9)));
    }

    public boolean H(String str) {
        String strN = N(str);
        return "1".equals(strN) || Boolean.parseBoolean(strN);
    }

    public p2 I() {
        v5.g gVarA = v5.g.a();
        if (gVarA.c() == 1) {
            return new u3.j(true);
        }
        i1 i1VarZ = l1.q.z(Boolean.FALSE);
        gVarA.h(new u3.f(i1VarZ, this));
        return i1VarZ;
    }

    public int J(long j9) {
        ArrayList arrayList = (ArrayList) this.B;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (j9 < ((x8.a) arrayList.get(i10)).f16477b) {
                return i10;
            }
        }
        return arrayList.size();
    }

    public Integer K(String str) {
        String strN = N(str);
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strN));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + W(str) + "(" + strN + ") into an int");
            return null;
        }
    }

    public JSONArray L(String str) {
        String strN = N(str);
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        try {
            return new JSONArray(strN);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + W(str) + ": " + strN + ", falling back to default");
            return null;
        }
    }

    public String M(Resources resources, String str, String str2) {
        String[] strArr;
        String strN = N(str2);
        if (!TextUtils.isEmpty(strN)) {
            return strN;
        }
        String strN2 = N(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strN2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strN2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", W(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayL = L(str2.concat("_loc_args"));
        if (jSONArrayL == null) {
            strArr = null;
        } else {
            int length = jSONArrayL.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = jSONArrayL.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e3) {
            Log.w("NotificationParams", "Missing format argument for " + W(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e3);
            return null;
        }
    }

    public String N(String str) {
        Bundle bundle = (Bundle) this.B;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void O(int i10, long j9) throws ParserException {
        s8.f fVar = (s8.f) this.B;
        if (i10 == 240) {
            if (fVar.f13900z) {
                return;
            }
            fVar.f(i10);
            if (fVar.H == -1) {
                fVar.H = j9;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (fVar.f13900z) {
                return;
            }
            fVar.f(i10);
            if (fVar.G == -1) {
                fVar.G = j9;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j9 == 0) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingOrder " + j9 + " not supported");
        }
        if (i10 == 20530) {
            if (j9 == 1) {
                return;
            }
            throw ParserException.a(null, "ContentEncodingScope " + j9 + " not supported");
        }
        switch (i10) {
            case 131:
                int i11 = (int) j9;
                if (i11 == 1) {
                    fVar.g(i10);
                    fVar.f13899y.f13841e = 2;
                    return;
                }
                if (i11 == 2) {
                    fVar.g(i10);
                    fVar.f13899y.f13841e = 1;
                    return;
                } else if (i11 == 17) {
                    fVar.g(i10);
                    fVar.f13899y.f13841e = 3;
                    return;
                } else if (i11 != 33) {
                    fVar.g(i10);
                    fVar.f13899y.f13841e = -1;
                    return;
                } else {
                    fVar.g(i10);
                    fVar.f13899y.f13841e = 5;
                    return;
                }
            case 136:
                fVar.g(i10);
                fVar.f13899y.Y = j9 == 1;
                return;
            case ModuleDescriptor.MODULE_VERSION:
                fVar.Q = fVar.m(j9);
                return;
            case 159:
                fVar.g(i10);
                fVar.f13899y.Q = (int) j9;
                return;
            case 176:
                fVar.g(i10);
                fVar.f13899y.f13848n = (int) j9;
                return;
            case 179:
                if (fVar.f13900z) {
                    return;
                }
                fVar.f(i10);
                fVar.E = fVar.m(j9);
                return;
            case 186:
                fVar.g(i10);
                fVar.f13899y.f13849o = (int) j9;
                return;
            case 215:
                fVar.g(i10);
                fVar.f13899y.f13840d = (int) j9;
                return;
            case 231:
                fVar.M = fVar.m(j9);
                return;
            case 238:
                fVar.X = (int) j9;
                return;
            case 247:
                if (fVar.f13900z) {
                    return;
                }
                fVar.f(i10);
                fVar.F = (int) j9;
                return;
            case 251:
                fVar.Y = true;
                return;
            case 16871:
                fVar.g(i10);
                fVar.f13899y.f13844h = (int) j9;
                return;
            case 16980:
                if (j9 == 3) {
                    return;
                }
                throw ParserException.a(null, "ContentCompAlgo " + j9 + " not supported");
            case 17029:
                if (j9 < 1 || j9 > 2) {
                    throw ParserException.a(null, "DocTypeReadVersion " + j9 + " not supported");
                }
                return;
            case 17143:
                if (j9 == 1) {
                    return;
                }
                throw ParserException.a(null, "EBMLReadVersion " + j9 + " not supported");
            case 18401:
                if (j9 == 5) {
                    return;
                }
                throw ParserException.a(null, "ContentEncAlgo " + j9 + " not supported");
            case 18408:
                if (j9 == 1) {
                    return;
                }
                throw ParserException.a(null, "AESSettingsCipherMode " + j9 + " not supported");
            case 21420:
                fVar.B = j9 + fVar.f13893s;
                return;
            case 21432:
                int i12 = (int) j9;
                fVar.g(i10);
                if (i12 == 0) {
                    fVar.f13899y.f13859y = 0;
                    return;
                }
                if (i12 == 1) {
                    fVar.f13899y.f13859y = 2;
                    return;
                } else if (i12 == 3) {
                    fVar.f13899y.f13859y = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    fVar.f13899y.f13859y = 3;
                    return;
                }
            case 21680:
                fVar.g(i10);
                fVar.f13899y.f13851q = (int) j9;
                return;
            case 21682:
                fVar.g(i10);
                fVar.f13899y.f13853s = (int) j9;
                return;
            case 21690:
                fVar.g(i10);
                fVar.f13899y.f13852r = (int) j9;
                return;
            case 21930:
                fVar.g(i10);
                fVar.f13899y.X = j9 == 1;
                return;
            case 21938:
                fVar.g(i10);
                s8.e eVar = fVar.f13899y;
                eVar.f13860z = true;
                eVar.f13850p = (int) j9;
                return;
            case 21998:
                fVar.g(i10);
                fVar.f13899y.f13843g = (int) j9;
                return;
            case 22186:
                fVar.g(i10);
                fVar.f13899y.T = j9;
                return;
            case 22203:
                fVar.g(i10);
                fVar.f13899y.U = j9;
                return;
            case 25188:
                fVar.g(i10);
                fVar.f13899y.R = (int) j9;
                return;
            case 30114:
                fVar.Z = j9;
                return;
            case 30321:
                fVar.g(i10);
                int i13 = (int) j9;
                if (i13 == 0) {
                    fVar.f13899y.f13854t = 0;
                    return;
                }
                if (i13 == 1) {
                    fVar.f13899y.f13854t = 1;
                    return;
                } else if (i13 == 2) {
                    fVar.f13899y.f13854t = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    fVar.f13899y.f13854t = 3;
                    return;
                }
            case 2352003:
                fVar.g(i10);
                fVar.f13899y.f13842f = (int) j9;
                return;
            case 2807729:
                fVar.f13894t = j9;
                return;
            default:
                switch (i10) {
                    case 21945:
                        fVar.g(i10);
                        int i14 = (int) j9;
                        if (i14 == 1) {
                            fVar.f13899y.C = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            fVar.f13899y.C = 1;
                            return;
                        }
                    case 21946:
                        fVar.g(i10);
                        int iG = androidx.media3.common.i.g((int) j9);
                        if (iG != -1) {
                            fVar.f13899y.B = iG;
                            return;
                        }
                        return;
                    case 21947:
                        fVar.g(i10);
                        fVar.f13899y.f13860z = true;
                        int iF = androidx.media3.common.i.f((int) j9);
                        if (iF != -1) {
                            fVar.f13899y.A = iF;
                            return;
                        }
                        return;
                    case 21948:
                        fVar.g(i10);
                        fVar.f13899y.D = (int) j9;
                        return;
                    case 21949:
                        fVar.g(i10);
                        fVar.f13899y.E = (int) j9;
                        return;
                    default:
                        return;
                }
        }
    }

    public Bundle Q() {
        Bundle bundle = (Bundle) this.B;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public JSONObject R() throws Throwable {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.B;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(oi.g.i(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e3) {
                        e = e3;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        oi.g.b(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    oi.g.b(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            oi.g.b(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            oi.g.b(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public j10.e S(p10.o oVar) {
        b20.p pVar;
        kotlin.jvm.internal.m.e(oVar, "javaClass");
        n20.c cVarC = oVar.c();
        if (cVarC != null) {
            e20.f[] fVarArr = e20.f.A;
        }
        Class<?> declaringClass = oVar.a.getDeclaringClass();
        p10.o oVar2 = declaringClass != null ? new p10.o(declaringClass) : null;
        if (oVar2 != null) {
            j10.e eVarS = S(oVar2);
            x20.n nVarI0 = eVarS != null ? eVarS.i0() : null;
            j10.h hVarG = nVarI0 != null ? nVarI0.g(oVar.e(), r10.c.H) : null;
            if (hVarG instanceof j10.e) {
                return (j10.e) hVarG;
            }
        } else if (cVarC != null && (pVar = (b20.p) h00.q.N0(va.a.R(((a20.f) this.B).c(cVarC.b())))) != null) {
            b20.u uVar = pVar.K.d;
            uVar.getClass();
            return uVar.v(oVar.e(), oVar);
        }
        return null;
    }

    public void T(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Product list cannot be empty.");
        }
        HashSet hashSet = new HashSet();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            qd.v vVar = (qd.v) it.next();
            if (!"play_pass_subs".equals(vVar.f12972b)) {
                hashSet.add(vVar.f12972b);
            }
        }
        if (hashSet.size() > 1) {
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        this.B = com.google.android.gms.internal.play_billing.r.m(arrayList);
    }

    public void U(int i10, long j9, long j10) throws ParserException {
        s8.f fVar = (s8.f) this.B;
        fVar.f13886j0.getClass();
        if (i10 == 160) {
            fVar.Y = false;
            fVar.Z = 0L;
            return;
        }
        if (i10 == 174) {
            s8.e eVar = new s8.e();
            eVar.f13848n = -1;
            eVar.f13849o = -1;
            eVar.f13850p = -1;
            eVar.f13851q = -1;
            eVar.f13852r = -1;
            eVar.f13853s = 0;
            eVar.f13854t = -1;
            eVar.f13855u = 0.0f;
            eVar.f13856v = 0.0f;
            eVar.f13857w = 0.0f;
            eVar.f13858x = null;
            eVar.f13859y = -1;
            eVar.f13860z = false;
            eVar.A = -1;
            eVar.B = -1;
            eVar.C = -1;
            eVar.D = 1000;
            eVar.E = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
            eVar.F = -1.0f;
            eVar.G = -1.0f;
            eVar.H = -1.0f;
            eVar.I = -1.0f;
            eVar.J = -1.0f;
            eVar.K = -1.0f;
            eVar.L = -1.0f;
            eVar.M = -1.0f;
            eVar.N = -1.0f;
            eVar.O = -1.0f;
            eVar.Q = 1;
            eVar.R = -1;
            eVar.S = 8000;
            eVar.T = 0L;
            eVar.U = 0L;
            eVar.W = false;
            eVar.Y = true;
            eVar.Z = "eng";
            fVar.f13899y = eVar;
            eVar.f13834a = fVar.f13897w;
            return;
        }
        if (i10 == 183) {
            if (fVar.f13900z) {
                return;
            }
            fVar.f(i10);
            fVar.F = -1;
            fVar.G = -1L;
            fVar.H = -1L;
            return;
        }
        if (i10 == 187) {
            if (fVar.f13900z) {
                return;
            }
            fVar.f(i10);
            fVar.E = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            fVar.A = -1;
            fVar.B = -1L;
            return;
        }
        if (i10 == 20533) {
            fVar.g(i10);
            fVar.f13899y.f13845i = true;
            return;
        }
        if (i10 == 21968) {
            fVar.g(i10);
            fVar.f13899y.f13860z = true;
            return;
        }
        if (i10 == 408125543) {
            long j11 = fVar.f13893s;
            if (j11 != -1 && j11 != j9) {
                throw ParserException.a(null, "Multiple Segment elements not supported");
            }
            fVar.f13893s = j9;
            fVar.f13892r = j10;
            return;
        }
        if (i10 == 475249515) {
            if (fVar.f13900z) {
                return;
            }
            fVar.D = true;
        } else if (i10 == 524531317 && !fVar.f13900z) {
            if (fVar.f13873d && fVar.K != -1) {
                fVar.J = true;
            } else {
                fVar.f13886j0.b(new a8.v(fVar.f13896v));
                fVar.f13900z = true;
            }
        }
    }

    public void V(int i10, String str) throws ParserException {
        s8.f fVar = (s8.f) this.B;
        if (i10 == 134) {
            fVar.g(i10);
            fVar.f13899y.f13838c = str;
            return;
        }
        if (i10 == 17026) {
            if ("webm".equals(str) || "matroska".equals(str)) {
                fVar.f13897w = str.equals("webm");
                return;
            }
            throw ParserException.a(null, "DocType " + str + " not supported");
        }
        if (i10 == 21358) {
            fVar.g(i10);
            fVar.f13899y.f13836b = str;
        } else {
            if (i10 != 2274716) {
                return;
            }
            fVar.g(i10);
            fVar.f13899y.Z = str;
        }
    }

    public void X(j10.u uVar, StringBuilder sb2) {
        String strX;
        boolean z10;
        p20.h hVar = (p20.h) this.B;
        p20.l lVar = hVar.a;
        p20.l lVar2 = hVar.a;
        if (!hVar.r()) {
            p20.k kVar = lVar2.g;
            a10.w[] wVarArr = p20.l.Y;
            if (!((Boolean) kVar.a(wVarArr[5], lVar2)).booleanValue()) {
                List listB0 = uVar.b0();
                kotlin.jvm.internal.m.d(listB0, "getContextReceiverParameters(...)");
                hVar.C(sb2, listB0);
                hVar.y(sb2, uVar, (k10.d) null);
                j10.o visibility = uVar.getVisibility();
                kotlin.jvm.internal.m.d(visibility, "getVisibility(...)");
                hVar.g0(visibility, sb2);
                hVar.M(uVar, sb2);
                if (((Boolean) lVar2.T.a(wVarArr[44], lVar2)).booleanValue()) {
                    hVar.K(uVar, sb2);
                }
                hVar.S(uVar, sb2);
                if (((Boolean) lVar2.T.a(wVarArr[44], lVar2)).booleanValue()) {
                    boolean z11 = false;
                    if (uVar.isOperator()) {
                        Collection collectionM = uVar.m();
                        kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
                        Collection collection = collectionM;
                        if (!collection.isEmpty()) {
                            Iterator it = collection.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((j10.u) it.next()).isOperator()) {
                                        if (!((Boolean) lVar2.O.a(p20.l.Y[39], lVar2)).booleanValue()) {
                                            z10 = false;
                                        }
                                    }
                                }
                            }
                        }
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (uVar.isInfix()) {
                        Collection collectionM2 = uVar.m();
                        kotlin.jvm.internal.m.d(collectionM2, "getOverriddenDescriptors(...)");
                        Collection collection2 = collectionM2;
                        if (!collection2.isEmpty()) {
                            Iterator it2 = collection2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (((j10.u) it2.next()).isInfix()) {
                                        if (!((Boolean) lVar2.O.a(p20.l.Y[39], lVar2)).booleanValue()) {
                                            break;
                                        } else {
                                            break;
                                        }
                                    }
                                }
                                z11 = true;
                                break;
                            }
                        }
                        z11 = true;
                        break;
                    }
                    hVar.N(sb2, uVar.I(), "tailrec");
                    hVar.N(sb2, uVar.isSuspend(), "suspend");
                    hVar.N(sb2, uVar.isInline(), "inline");
                    hVar.N(sb2, z11, "infix");
                    hVar.N(sb2, z10, "operator");
                } else {
                    hVar.N(sb2, uVar.isSuspend(), "suspend");
                }
                hVar.J(uVar, sb2);
                if (hVar.u()) {
                    if (uVar.g0()) {
                        sb2.append("/*isHiddenToOvercomeSignatureClash*/ ");
                    }
                    if (uVar.l0()) {
                        sb2.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                    }
                }
            }
            sb2.append(hVar.I("fun"));
            sb2.append(" ");
            List typeParameters = uVar.getTypeParameters();
            kotlin.jvm.internal.m.d(typeParameters, "getTypeParameters(...)");
            hVar.c0(sb2, typeParameters, true);
            hVar.U(uVar, sb2);
        }
        hVar.P(uVar, sb2, true);
        List listO = uVar.O();
        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
        hVar.f0(sb2, listO, uVar.B());
        hVar.V(uVar, sb2);
        e30.w returnType = uVar.getReturnType();
        p20.k kVar2 = lVar.l;
        a10.w[] wVarArr2 = p20.l.Y;
        if (!((Boolean) kVar2.a(wVarArr2[10], lVar)).booleanValue()) {
            if (((Boolean) lVar.k.a(wVarArr2[9], lVar)).booleanValue() || returnType == null) {
                sb2.append(": ");
                if (returnType == null) {
                    strX = "[NULL]";
                } else {
                    strX = hVar.X(returnType);
                }
                sb2.append(strX);
            } else {
                n20.e eVar = g10.i.e;
                if (!g10.i.E(returnType, g10.o.d)) {
                    sb2.append(": ");
                    if (returnType == null) {
                        strX = "[NULL]";
                    } else {
                        strX = hVar.X(returnType);
                    }
                    sb2.append(strX);
                }
            }
        }
        List typeParameters2 = uVar.getTypeParameters();
        kotlin.jvm.internal.m.d(typeParameters2, "getTypeParameters(...)");
        hVar.h0(sb2, typeParameters2);
    }

    public void Y(m10.g0 g0Var, StringBuilder sb2, String str) throws NoWhenBranchMatchedException {
        p20.h hVar = (p20.h) this.B;
        p20.l lVar = hVar.a;
        int iOrdinal = ((p20.q) lVar.H.a(p20.l.Y[32], lVar)).ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                X(g0Var, sb2);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        hVar.K(g0Var, sb2);
        sb2.append(str.concat(" for "));
        j10.l0 l0VarY0 = g0Var.Y0();
        kotlin.jvm.internal.m.d(l0VarY0, "getCorrespondingProperty(...)");
        p20.h.n(hVar, l0VarY0, sb2);
    }

    public void Z() {
        j3 j3Var = (j3) this.B;
        j3Var.V0();
        h1 h1Var = (h1) j3Var.B;
        tf.w0 w0Var = h1Var.E;
        h1.e(w0Var);
        ve.b bVar = h1Var.K;
        bVar.getClass();
        if (w0Var.f1(System.currentTimeMillis())) {
            tf.w0 w0Var2 = h1Var.E;
            h1.e(w0Var2);
            w0Var2.M.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                tf.q0 q0Var = h1Var.F;
                h1.g(q0Var);
                q0Var.O.b("Detected application was in foreground");
                bVar.getClass();
                c0(System.currentTimeMillis());
            }
        }
    }

    @Override
    public ub.c a(ub.b bVar) {
        return null;
    }

    public void a0(long j9) {
        j3 j3Var = (j3) this.B;
        j3Var.V0();
        j3Var.Z0();
        h1 h1Var = (h1) j3Var.B;
        tf.w0 w0Var = h1Var.E;
        h1.e(w0Var);
        if (w0Var.f1(j9)) {
            h1.e(w0Var);
            w0Var.M.b(true);
            h1Var.l().a1();
        }
        h1.e(w0Var);
        w0Var.Q.f(j9);
        if (w0Var.M.a()) {
            c0(j9);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        xf.g gVar = (xf.g) obj2;
        com.google.android.gms.common.api.i iVar = se.b.f14140a;
        se.a aVar = (se.a) ((se.c) obj).getService();
        com.google.android.gms.common.internal.s sVar = (com.google.android.gms.common.internal.s) this.B;
        aVar.getClass();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(aVar.f3912g);
        int i10 = kf.b.f9656a;
        if (sVar == null) {
            parcelObtain.writeInt(0);
        } else {
            parcelObtain.writeInt(1);
            sVar.writeToParcel(parcelObtain, 0);
        }
        try {
            aVar.f3911f.transact(1, parcelObtain, null, 1);
            parcelObtain.recycle();
            gVar.b(null);
        } catch (Throwable th2) {
            parcelObtain.recycle();
            throw th2;
        }
    }

    @Override
    public void b(String str, String str2, Bundle bundle) {
        i2 i2Var = (i2) this.B;
        if (!TextUtils.isEmpty(str)) {
            i2Var.getClass();
            throw new IllegalStateException("Unexpected call on client side");
        }
        ((h1) i2Var.B).K.getClass();
        i2Var.a1("auto", "_err", bundle, true, true, System.currentTimeMillis());
    }

    @Override
    public void c(o.l lVar, boolean z10) {
        if (lVar instanceof o.d0) {
            ((o.d0) lVar).f11397z.k().c(false);
        }
        o.w wVar = ((p.j) this.B).E;
        if (wVar != null) {
            wVar.c(lVar, z10);
        }
    }

    public void c0(long j9) {
        j3 j3Var = (j3) this.B;
        j3Var.V0();
        h1 h1Var = (h1) j3Var.B;
        if (h1Var.a()) {
            tf.w0 w0Var = h1Var.E;
            h1.e(w0Var);
            w0Var.Q.f(j9);
            h1Var.K.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            tf.q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.O.c(Long.valueOf(jElapsedRealtime), "Session started, time");
            long j10 = j9 / 1000;
            Long lValueOf = Long.valueOf(j10);
            i2 i2Var = h1Var.M;
            h1.f(i2Var);
            i2Var.g1(j9, lValueOf, "auto", "_sid");
            h1.e(w0Var);
            w0Var.R.f(j10);
            w0Var.M.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j10);
            h1.f(i2Var);
            i2Var.d1(j9, bundle, "auto", "_s");
            String strP = w0Var.W.p();
            if (TextUtils.isEmpty(strP)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strP);
            h1.f(i2Var);
            i2Var.d1(j9, bundle2, "auto", "_ssr");
        }
    }

    @Override
    public void clear() {
        ((ArrayList) this.B).clear();
    }

    @Override
    public void d(int i10) {
    }

    public Object e(m10.c0 c0Var, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        p20.h hVar = (p20.h) this.B;
        hVar.getClass();
        n20.c cVar = c0Var.F;
        sb2.append(hVar.I("package-fragment"));
        n20.d dVar = cVar.a;
        kotlin.jvm.internal.m.e(dVar, "fqName");
        String strO = hVar.o(va.a.f0(n20.d.f(dVar)));
        if (strO.length() > 0) {
            sb2.append(" ");
            sb2.append(strO);
        }
        if (hVar.a.n()) {
            sb2.append(" in ");
            hVar.P(c0Var.Y0(), sb2, false);
        }
        return g00.b0.a;
    }

    @Override
    public long f(long j9) {
        ArrayList arrayList = (ArrayList) this.B;
        if (arrayList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j9 < ((x8.a) arrayList.get(0)).f16477b) {
            return ((x8.a) arrayList.get(0)).f16477b;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            x8.a aVar = (x8.a) arrayList.get(i10);
            long j10 = aVar.f16477b;
            long j11 = aVar.f16477b;
            if (j9 < j10) {
                long j12 = ((x8.a) arrayList.get(i10 - 1)).f16479d;
                return (j12 == -9223372036854775807L || j12 <= j9 || j12 >= j11) ? j11 : j12;
            }
        }
        long j13 = ((x8.a) fh.w.n(arrayList)).f16479d;
        if (j13 == -9223372036854775807L || j9 >= j13) {
            return Long.MIN_VALUE;
        }
        return j13;
    }

    @Override
    public void flush() {
    }

    @Override
    public void g(int i10, h7.c cVar, long j9, int i11) {
        ((MediaCodec) this.B).queueSecureInputBuffer(i10, 0, cVar.f6616i, j9, i11);
    }

    public Object h(m10.h hVar, Object obj) {
        ((p20.h) this.B).a0(hVar, (StringBuilder) obj, true);
        return g00.b0.a;
    }

    public Object i(m10.i0 i0Var, Object obj) {
        kotlin.jvm.internal.m.e(i0Var, "descriptor");
        p20.h.n((p20.h) this.B, i0Var, (StringBuilder) obj);
        return g00.b0.a;
    }

    @Override
    public void j(Bundle bundle) {
        ((MediaCodec) this.B).setParameters(bundle);
    }

    @Override
    public Task k(Object obj) {
        wi.a aVar = (wi.a) obj;
        oi.n nVar = ((oi.l) this.B).f12012e;
        if (aVar != null) {
            return Tasks.e(Arrays.asList(oi.n.a(nVar), nVar.m.A(null, nVar.f12021e.f12529a)));
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.d(null);
    }

    @Override
    public fh.t0 l(long j9) {
        int iJ = J(j9);
        if (iJ == 0) {
            fh.r0 r0Var = fh.t0.B;
            return d2.E;
        }
        x8.a aVar = (x8.a) ((ArrayList) this.B).get(iJ - 1);
        long j10 = aVar.f16479d;
        if (j10 == -9223372036854775807L || j9 < j10) {
            return aVar.f16476a;
        }
        fh.r0 r0Var2 = fh.t0.B;
        return d2.E;
    }

    @Override
    public void m(ub.b bVar, Bitmap bitmap, Map map) {
        ((ub.h) this.B).i(bVar, bitmap, map, a.a.x(bitmap));
    }

    public Object n(m10.i iVar, Object obj) {
        boolean z10;
        m10.t tVarJ;
        boolean z11 = iVar.e0;
        StringBuilder sb2 = (StringBuilder) obj;
        p20.h hVar = (p20.h) this.B;
        hVar.getClass();
        hVar.y(sb2, iVar, (k10.d) null);
        p20.l lVar = hVar.a;
        p20.k kVar = lVar.o;
        a10.w[] wVarArr = p20.l.Y;
        if (((Boolean) kVar.a(wVarArr[13], lVar)).booleanValue() || iVar.x().g() != j10.y.C) {
            j10.o visibility = iVar.getVisibility();
            kotlin.jvm.internal.m.d(visibility, "getVisibility(...)");
            if (hVar.g0(visibility, sb2)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        hVar.J(iVar, sb2);
        boolean z12 = ((Boolean) lVar.P.a(wVarArr[40], lVar)).booleanValue() || !z11 || z10;
        if (z12) {
            sb2.append(hVar.I("constructor"));
        }
        j10.e eVarK1 = iVar.k1();
        kotlin.jvm.internal.m.d(eVarK1, "getContainingDeclaration(...)");
        if (((Boolean) lVar.A.a(wVarArr[25], lVar)).booleanValue()) {
            if (z12) {
                sb2.append(" ");
            }
            hVar.P(eVarK1, sb2, true);
            hVar.c0(sb2, iVar.getTypeParameters(), false);
        }
        List listO = iVar.O();
        kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
        hVar.f0(sb2, listO, iVar.B());
        if (((Boolean) lVar.q.a(wVarArr[15], lVar)).booleanValue() && !z11 && (tVarJ = eVarK1.J()) != null) {
            List listO2 = tVarJ.O();
            kotlin.jvm.internal.m.d(listO2, "getValueParameters(...)");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listO2) {
                m10.r0 r0Var = (m10.r0) obj2;
                if (!r0Var.Z0() && r0Var.K == null) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                sb2.append(" : ");
                sb2.append(hVar.I("this"));
                sb2.append(h00.q.R0(arrayList, ", ", "(", ")", p20.d.N, 24));
            }
        }
        if (((Boolean) lVar.A.a(p20.l.Y[25], lVar)).booleanValue()) {
            hVar.h0(sb2, iVar.getTypeParameters());
        }
        return g00.b0.a;
    }

    public Object o(Object obj, m10.a0 a0Var) {
        ((p20.h) this.B).P(a0Var, (StringBuilder) obj, true);
        return g00.b0.a;
    }

    public void onError(PurchasesError purchasesError) {
        kotlin.jvm.internal.m.e(purchasesError, "error");
    }

    public void onSuccess(Offerings offerings) {
        kotlin.jvm.internal.m.e(offerings, "offerings");
        p1 p1Var = ((vp.x) this.B).d;
        p1Var.getClass();
        p1Var.k((Object) null, offerings);
    }

    @Override
    public void p(int i10, int i11, int i12, long j9) {
        ((MediaCodec) this.B).queueInputBuffer(i10, 0, i11, j9, i12);
    }

    public Object q(m10.j0 j0Var, Object obj) throws NoWhenBranchMatchedException {
        Y(j0Var, (StringBuilder) obj, "getter");
        return g00.b0.a;
    }

    @Override
    public void r(String str, int i10, Throwable th2, byte[] bArr, Map map) {
        ((y3) this.B).w(str, i10, th2, bArr, map);
    }

    public Object s(m10.f fVar, Object obj) {
        StringBuilder sb2 = (StringBuilder) obj;
        p20.h hVar = (p20.h) this.B;
        hVar.getClass();
        hVar.y(sb2, fVar, (k10.d) null);
        j10.o oVar = fVar.G;
        kotlin.jvm.internal.m.d(oVar, "getVisibility(...)");
        hVar.g0(oVar, sb2);
        hVar.K(fVar, sb2);
        sb2.append(hVar.I("typealias"));
        sb2.append(" ");
        hVar.P(fVar, sb2, true);
        hVar.c0(sb2, fVar.p(), false);
        hVar.A(fVar, sb2);
        sb2.append(" = ");
        sb2.append(hVar.X(((c30.u) fVar).a1()));
        return g00.b0.a;
    }

    @Override
    public void shutdown() {
    }

    @Override
    public void start() {
    }

    @Override
    public void t() {
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return "ProviderMetadata{ componentName=" + ((ComponentName) this.B).flattenToShortString() + " }";
            default:
                return super.toString();
        }
    }

    public Object u(m10.u uVar, Object obj) {
        ((StringBuilder) obj).append(uVar.getName());
        return g00.b0.a;
    }

    public Object v(m10.y yVar, Object obj) throws NoWhenBranchMatchedException {
        m10.t tVarJ;
        String str;
        StringBuilder sb2 = (StringBuilder) obj;
        p20.h hVar = (p20.h) this.B;
        p20.l lVar = hVar.a;
        boolean z10 = yVar.getKind() == j10.f.D;
        if (!hVar.r()) {
            List listS0 = yVar.s0();
            kotlin.jvm.internal.m.d(listS0, "getContextReceivers(...)");
            hVar.C(sb2, listS0);
            hVar.y(sb2, yVar, (k10.d) null);
            if (!z10) {
                j10.o visibility = yVar.getVisibility();
                kotlin.jvm.internal.m.d(visibility, "getVisibility(...)");
                hVar.g0(visibility, sb2);
            }
            if ((yVar.getKind() != j10.f.B || yVar.g() != j10.y.E) && (!yVar.getKind().a() || yVar.g() != j10.y.B)) {
                j10.y yVarG = yVar.g();
                kotlin.jvm.internal.m.d(yVarG, "getModality(...)");
                hVar.L(yVarG, sb2, p20.h.v(yVar));
            }
            hVar.K(yVar, sb2);
            hVar.N(sb2, hVar.q().contains(p20.i.H) && yVar.k(), "inner");
            hVar.N(sb2, hVar.q().contains(p20.i.J) && yVar.v0(), "data");
            hVar.N(sb2, hVar.q().contains(p20.i.K) && yVar.isInline(), "inline");
            hVar.N(sb2, hVar.q().contains(p20.i.Q) && yVar.j(), "value");
            hVar.N(sb2, hVar.q().contains(p20.i.P) && yVar.y(), "fun");
            if (yVar instanceof j10.q0) {
                str = "typealias";
            } else if (yVar.s()) {
                str = "companion object";
            } else {
                int iOrdinal = yVar.getKind().ordinal();
                if (iOrdinal == 0) {
                    str = "class";
                } else if (iOrdinal == 1) {
                    str = "interface";
                } else if (iOrdinal == 2) {
                    str = "enum class";
                } else if (iOrdinal == 3) {
                    str = "enum entry";
                } else if (iOrdinal == 4) {
                    str = "annotation class";
                } else {
                    if (iOrdinal != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str = "object";
                }
            }
            sb2.append(hVar.I(str));
        }
        if (q20.d.k(yVar)) {
            if (((Boolean) lVar.G.a(p20.l.Y[31], lVar)).booleanValue()) {
                if (hVar.r()) {
                    sb2.append("companion object");
                }
                p20.h.W(sb2);
                j10.k kVarL = yVar.l();
                if (kVarL != null) {
                    sb2.append("of ");
                    n20.e name = kVarL.getName();
                    kotlin.jvm.internal.m.d(name, "getName(...)");
                    sb2.append(hVar.O(name, false));
                }
            }
            if (hVar.u() || !kotlin.jvm.internal.m.a(yVar.getName(), n20.g.b)) {
                if (!hVar.r()) {
                    p20.h.W(sb2);
                }
                n20.e name2 = yVar.getName();
                kotlin.jvm.internal.m.d(name2, "getName(...)");
                sb2.append(hVar.O(name2, true));
            }
        } else {
            if (!hVar.r()) {
                p20.h.W(sb2);
            }
            hVar.P(yVar, sb2, true);
        }
        if (!z10) {
            List listP = yVar.p();
            kotlin.jvm.internal.m.d(listP, "getDeclaredTypeParameters(...)");
            hVar.c0(sb2, listP, false);
            hVar.A(yVar, sb2);
            if (!yVar.getKind().a() && ((Boolean) lVar.i.a(p20.l.Y[7], lVar)).booleanValue() && (tVarJ = yVar.J()) != null) {
                sb2.append(" ");
                hVar.y(sb2, tVarJ, (k10.d) null);
                m10.t tVar = tVarJ;
                j10.o visibility2 = tVar.getVisibility();
                kotlin.jvm.internal.m.d(visibility2, "getVisibility(...)");
                hVar.g0(visibility2, sb2);
                sb2.append(hVar.I("constructor"));
                List listO = tVar.O();
                kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                hVar.f0(sb2, listO, tVarJ.B());
            }
            if (!((Boolean) lVar.x.a(p20.l.Y[22], lVar)).booleanValue() && !g10.i.F(yVar.n())) {
                Collection collectionL = yVar.f().l();
                kotlin.jvm.internal.m.d(collectionL, "getSupertypes(...)");
                if (!collectionL.isEmpty() && (collectionL.size() != 1 || !g10.i.y((e30.w) collectionL.iterator().next()))) {
                    p20.h.W(sb2);
                    sb2.append(": ");
                    h00.q.Q0(collectionL, sb2, ", ", (String) null, (String) null, new p20.g(hVar, 1), 60);
                }
            }
            hVar.h0(sb2, listP);
        }
        return g00.b0.a;
    }

    @Override
    public boolean w(x8.a aVar, long j9) {
        boolean z10;
        ArrayList arrayList = (ArrayList) this.B;
        long j10 = aVar.f16477b;
        ta.c0.s(j10 != -9223372036854775807L);
        if (j10 <= j9) {
            long j11 = aVar.f16479d;
            if (j11 == -9223372036854775807L || j9 < j11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (j10 >= ((x8.a) arrayList.get(size)).f16477b) {
                arrayList.add(size + 1, aVar);
                return z10;
            }
            if (((x8.a) arrayList.get(size)).f16477b <= j9) {
                z10 = false;
            }
        }
        arrayList.add(0, aVar);
        return z10;
    }

    @Override
    public boolean x(o.l lVar) {
        p.j jVar = (p.j) this.B;
        if (lVar == jVar.C) {
            return false;
        }
        ((o.d0) lVar).A.getClass();
        jVar.getClass();
        o.w wVar = jVar.E;
        if (wVar != null) {
            return wVar.x(lVar);
        }
        return false;
    }

    public Object y(j10.u uVar, Object obj) {
        X(uVar, (StringBuilder) obj);
        return g00.b0.a;
    }

    @Override
    public long z(long j9) {
        ArrayList arrayList = (ArrayList) this.B;
        if (arrayList.isEmpty() || j9 < ((x8.a) arrayList.get(0)).f16477b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            long j10 = ((x8.a) arrayList.get(i10)).f16477b;
            if (j9 == j10) {
                return j10;
            }
            if (j9 < j10) {
                x8.a aVar = (x8.a) arrayList.get(i10 - 1);
                long j11 = aVar.f16479d;
                return (j11 == -9223372036854775807L || j11 > j9) ? aVar.f16477b : j11;
            }
        }
        x8.a aVar2 = (x8.a) fh.w.n(arrayList);
        long j12 = aVar2.f16479d;
        return (j12 == -9223372036854775807L || j9 < j12) ? aVar2.f16477b : j12;
    }
}
