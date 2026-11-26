package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

public final class n {

    public static final int[] f8150d = {0, 4, 8};

    public static final SparseIntArray f8151e;

    public static final SparseIntArray f8152f;

    public final HashMap f8153a = new HashMap();

    public final boolean f8154b = true;

    public final HashMap f8155c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8151e = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f8152f = sparseIntArray2;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_NETWORK, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(MediaError.DetailedErrorCode.SOURCE_BUFFER_FAILURE, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(MediaError.DetailedErrorCode.MEDIA_SRC_NOT_SUPPORTED, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(MediaError.DetailedErrorCode.MEDIA_NETWORK, 83);
        sparseIntArray2.append(MediaError.DetailedErrorCode.MEDIA_DECODE, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int[] c(a aVar, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = aVar.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = q.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && aVar.isInEditMode() && (aVar.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) aVar.getParent();
                if (strTrim != null) {
                    HashMap map = constraintLayout.M;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.M.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static i d(Context context, AttributeSet attributeSet, boolean z10) {
        int i10;
        int i11;
        i iVar = new i();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? r.f8158c : r.f8156a);
        l lVar = iVar.f8080b;
        m mVar = iVar.f8083e;
        k kVar = iVar.f8081c;
        j jVar = iVar.f8082d;
        int[] iArr = f8150d;
        String[] strArr = f4.a.f5482a;
        SparseIntArray sparseIntArray = f8151e;
        if (z10) {
            h hVar = new h();
            hVar.f8068a = new int[10];
            hVar.f8069b = new int[10];
            hVar.f8070c = 0;
            hVar.f8071d = new int[10];
            hVar.f8072e = new float[10];
            hVar.f8073f = 0;
            hVar.f8074g = new int[5];
            hVar.f8075h = new String[5];
            hVar.f8076i = 0;
            hVar.f8077j = new int[4];
            hVar.f8078k = new boolean[4];
            hVar.l = 0;
            kVar.getClass();
            jVar.getClass();
            mVar.getClass();
            int i12 = 0;
            for (int indexCount = typedArrayObtainStyledAttributes.getIndexCount(); i12 < indexCount; indexCount = i11) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                int i13 = i12;
                switch (f8152f.get(index)) {
                    case 2:
                        i11 = indexCount;
                        hVar.b(2, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.H));
                        continue;
                        i12 = i13 + 1;
                        break;
                    case 3:
                    case 4:
                    case 9:
                    case 10:
                    case 25:
                    case RuntimeVersion.MINOR:
                    case 29:
                    case 30:
                    case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                    case 33:
                    case 35:
                    case 36:
                    case 61:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    default:
                        StringBuilder sb2 = new StringBuilder("Unknown attribute 0x");
                        i11 = indexCount;
                        sb2.append(Integer.toHexString(index));
                        sb2.append("   ");
                        sb2.append(sparseIntArray.get(index));
                        Log.w("ConstraintSet", sb2.toString());
                        break;
                    case 5:
                        i11 = indexCount;
                        hVar.c(5, typedArrayObtainStyledAttributes.getString(index));
                        continue;
                        i12 = i13 + 1;
                        break;
                    case 6:
                        i11 = indexCount;
                        hVar.b(6, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.B));
                        break;
                    case 7:
                        i11 = indexCount;
                        hVar.b(7, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.C));
                        break;
                    case 8:
                        i11 = indexCount;
                        hVar.b(8, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.I));
                        break;
                    case 11:
                        i11 = indexCount;
                        hVar.b(11, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.O));
                        break;
                    case 12:
                        i11 = indexCount;
                        hVar.b(12, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.P));
                        break;
                    case 13:
                        i11 = indexCount;
                        hVar.b(13, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.L));
                        break;
                    case 14:
                        i11 = indexCount;
                        hVar.b(14, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.N));
                        break;
                    case 15:
                        i11 = indexCount;
                        hVar.b(15, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Q));
                        break;
                    case 16:
                        i11 = indexCount;
                        hVar.b(16, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.M));
                        break;
                    case 17:
                        i11 = indexCount;
                        hVar.b(17, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f8092d));
                        break;
                    case TYPE_SINT64_VALUE:
                        i11 = indexCount;
                        hVar.b(18, typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, jVar.f8094e));
                        break;
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f8096f), 19);
                        break;
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f8119v), 20);
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        i11 = indexCount;
                        hVar.b(21, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f8090c));
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        i11 = indexCount;
                        hVar.b(22, iArr[typedArrayObtainStyledAttributes.getInt(index, lVar.f8134a)]);
                        break;
                    case 23:
                        i11 = indexCount;
                        hVar.b(23, typedArrayObtainStyledAttributes.getLayoutDimension(index, jVar.f8088b));
                        break;
                    case 24:
                        i11 = indexCount;
                        hVar.b(24, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.E));
                        break;
                    case 27:
                        i11 = indexCount;
                        hVar.b(27, typedArrayObtainStyledAttributes.getInt(index, jVar.D));
                        break;
                    case 28:
                        i11 = indexCount;
                        hVar.b(28, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.F));
                        break;
                    case 31:
                        i11 = indexCount;
                        hVar.b(31, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.J));
                        break;
                    case 34:
                        i11 = indexCount;
                        hVar.b(34, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.G));
                        break;
                    case 37:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.f8120w), 37);
                        break;
                    case 38:
                        i11 = indexCount;
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f8079a);
                        iVar.f8079a = resourceId;
                        hVar.b(38, resourceId);
                        break;
                    case 39:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.T), 39);
                        break;
                    case 40:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.S), 40);
                        break;
                    case 41:
                        i11 = indexCount;
                        hVar.b(41, typedArrayObtainStyledAttributes.getInt(index, jVar.U));
                        break;
                    case 42:
                        i11 = indexCount;
                        hVar.b(42, typedArrayObtainStyledAttributes.getInt(index, jVar.V));
                        break;
                    case 43:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f8136c), 43);
                        break;
                    case 44:
                        i11 = indexCount;
                        hVar.d(44, true);
                        hVar.a(typedArrayObtainStyledAttributes.getDimension(index, mVar.m), 44);
                        break;
                    case 45:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f8140b), 45);
                        break;
                    case 46:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f8141c), 46);
                        break;
                    case 47:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f8142d), 47);
                        break;
                    case 48:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f8143e), 48);
                        break;
                    case 49:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getDimension(index, mVar.f8144f), 49);
                        break;
                    case 50:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getDimension(index, mVar.f8145g), 50);
                        break;
                    case 51:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getDimension(index, mVar.f8147i), 51);
                        break;
                    case 52:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getDimension(index, mVar.f8148j), 52);
                        break;
                    case 53:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getDimension(index, mVar.f8149k), 53);
                        break;
                    case 54:
                        i11 = indexCount;
                        hVar.b(54, typedArrayObtainStyledAttributes.getInt(index, jVar.W));
                        break;
                    case 55:
                        i11 = indexCount;
                        hVar.b(55, typedArrayObtainStyledAttributes.getInt(index, jVar.X));
                        break;
                    case 56:
                        i11 = indexCount;
                        hVar.b(56, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Y));
                        break;
                    case 57:
                        i11 = indexCount;
                        hVar.b(57, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.Z));
                        break;
                    case 58:
                        i11 = indexCount;
                        hVar.b(58, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f8087a0));
                        break;
                    case 59:
                        i11 = indexCount;
                        hVar.b(59, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f8089b0));
                        break;
                    case 60:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, mVar.f8139a), 60);
                        break;
                    case 62:
                        i11 = indexCount;
                        hVar.b(62, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f8123z));
                        break;
                    case 63:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, jVar.A), 63);
                        break;
                    case 64:
                        i11 = indexCount;
                        hVar.b(64, f(typedArrayObtainStyledAttributes, index, kVar.f8125a));
                        break;
                    case 65:
                        i11 = indexCount;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            hVar.c(65, typedArrayObtainStyledAttributes.getString(index));
                        } else {
                            hVar.c(65, strArr[typedArrayObtainStyledAttributes.getInteger(index, 0)]);
                        }
                        break;
                    case 66:
                        i11 = indexCount;
                        hVar.b(66, typedArrayObtainStyledAttributes.getInt(index, 0));
                        break;
                    case 67:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f8129e), 67);
                        break;
                    case 68:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, lVar.f8137d), 68);
                        break;
                    case 69:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 69);
                        break;
                    case 70:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, 1.0f), 70);
                        break;
                    case 71:
                        i11 = indexCount;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i11 = indexCount;
                        hVar.b(72, typedArrayObtainStyledAttributes.getInt(index, jVar.f8095e0));
                        break;
                    case 73:
                        i11 = indexCount;
                        hVar.b(73, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.f8097f0));
                        break;
                    case 74:
                        i11 = indexCount;
                        hVar.c(74, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 75:
                        i11 = indexCount;
                        hVar.d(75, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f8109m0));
                        break;
                    case 76:
                        i11 = indexCount;
                        hVar.b(76, typedArrayObtainStyledAttributes.getInt(index, kVar.f8127c));
                        break;
                    case 77:
                        i11 = indexCount;
                        hVar.c(77, typedArrayObtainStyledAttributes.getString(index));
                        break;
                    case 78:
                        i11 = indexCount;
                        hVar.b(78, typedArrayObtainStyledAttributes.getInt(index, lVar.f8135b));
                        break;
                    case 79:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f8128d), 79);
                        break;
                    case 80:
                        i11 = indexCount;
                        hVar.d(80, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f8107k0));
                        break;
                    case 81:
                        i11 = indexCount;
                        hVar.d(81, typedArrayObtainStyledAttributes.getBoolean(index, jVar.f8108l0));
                        break;
                    case 82:
                        i11 = indexCount;
                        hVar.b(82, typedArrayObtainStyledAttributes.getInteger(index, kVar.f8126b));
                        break;
                    case 83:
                        i11 = indexCount;
                        hVar.b(83, f(typedArrayObtainStyledAttributes, index, mVar.f8146h));
                        break;
                    case 84:
                        i11 = indexCount;
                        hVar.b(84, typedArrayObtainStyledAttributes.getInteger(index, kVar.f8131g));
                        break;
                    case 85:
                        i11 = indexCount;
                        hVar.a(typedArrayObtainStyledAttributes.getFloat(index, kVar.f8130f), 85);
                        break;
                    case 86:
                        i11 = indexCount;
                        int i14 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i14 == 1) {
                            int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            kVar.f8133i = resourceId2;
                            hVar.b(89, resourceId2);
                            if (kVar.f8133i != -1) {
                                hVar.b(88, -2);
                            }
                        } else if (i14 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            kVar.f8132h = string;
                            hVar.c(90, string);
                            if (kVar.f8132h.indexOf("/") > 0) {
                                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                kVar.f8133i = resourceId3;
                                hVar.b(89, resourceId3);
                                hVar.b(88, -2);
                            } else {
                                hVar.b(88, -1);
                            }
                        } else {
                            hVar.b(88, typedArrayObtainStyledAttributes.getInteger(index, kVar.f8133i));
                        }
                        break;
                    case 87:
                        i11 = indexCount;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 93:
                        i11 = indexCount;
                        hVar.b(93, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.K));
                        break;
                    case 94:
                        i11 = indexCount;
                        hVar.b(94, typedArrayObtainStyledAttributes.getDimensionPixelSize(index, jVar.R));
                        break;
                    case 95:
                        i11 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        i11 = indexCount;
                        g(hVar, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        i11 = indexCount;
                        hVar.b(97, typedArrayObtainStyledAttributes.getInt(index, jVar.f8111n0));
                        break;
                    case 98:
                        i11 = indexCount;
                        int i15 = i4.a.S;
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            iVar.f8079a = typedArrayObtainStyledAttributes.getResourceId(index, iVar.f8079a);
                        }
                        break;
                }
                i12 = i13 + 1;
            }
        } else {
            int i16 = 0;
            for (int indexCount2 = typedArrayObtainStyledAttributes.getIndexCount(); i16 < indexCount2; indexCount2 = i10) {
                int index2 = typedArrayObtainStyledAttributes.getIndex(i16);
                if (index2 != 1 && 23 != index2) {
                    if (24 != index2) {
                        kVar.getClass();
                        jVar.getClass();
                        mVar.getClass();
                    }
                }
                switch (sparseIntArray.get(index2)) {
                    case 1:
                        i10 = indexCount2;
                        jVar.f8112o = f(typedArrayObtainStyledAttributes, index2, jVar.f8112o);
                        continue;
                        i16++;
                        break;
                    case 2:
                        i10 = indexCount2;
                        jVar.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.H);
                        continue;
                        i16++;
                        break;
                    case 3:
                        i10 = indexCount2;
                        jVar.f8110n = f(typedArrayObtainStyledAttributes, index2, jVar.f8110n);
                        continue;
                        i16++;
                        break;
                    case 4:
                        i10 = indexCount2;
                        jVar.m = f(typedArrayObtainStyledAttributes, index2, jVar.m);
                        continue;
                        i16++;
                        break;
                    case 5:
                        i10 = indexCount2;
                        jVar.f8121x = typedArrayObtainStyledAttributes.getString(index2);
                        continue;
                        i16++;
                        break;
                    case 6:
                        i10 = indexCount2;
                        jVar.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.B);
                        continue;
                        i16++;
                        break;
                    case 7:
                        i10 = indexCount2;
                        jVar.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.C);
                        continue;
                        i16++;
                        break;
                    case 8:
                        i10 = indexCount2;
                        jVar.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.I);
                        continue;
                        i16++;
                        break;
                    case 9:
                        i10 = indexCount2;
                        jVar.f8118u = f(typedArrayObtainStyledAttributes, index2, jVar.f8118u);
                        continue;
                        i16++;
                        break;
                    case 10:
                        i10 = indexCount2;
                        jVar.f8117t = f(typedArrayObtainStyledAttributes, index2, jVar.f8117t);
                        continue;
                        i16++;
                        break;
                    case 11:
                        i10 = indexCount2;
                        jVar.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.O);
                        continue;
                        i16++;
                        break;
                    case 12:
                        i10 = indexCount2;
                        jVar.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.P);
                        continue;
                        i16++;
                        break;
                    case 13:
                        i10 = indexCount2;
                        jVar.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.L);
                        continue;
                        i16++;
                        break;
                    case 14:
                        i10 = indexCount2;
                        jVar.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.N);
                        continue;
                        i16++;
                        break;
                    case 15:
                        i10 = indexCount2;
                        jVar.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Q);
                        continue;
                        i16++;
                        break;
                    case 16:
                        i10 = indexCount2;
                        jVar.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.M);
                        continue;
                        i16++;
                        break;
                    case 17:
                        i10 = indexCount2;
                        jVar.f8092d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f8092d);
                        continue;
                        i16++;
                        break;
                    case TYPE_SINT64_VALUE:
                        i10 = indexCount2;
                        jVar.f8094e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index2, jVar.f8094e);
                        continue;
                        i16++;
                        break;
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        i10 = indexCount2;
                        jVar.f8096f = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f8096f);
                        continue;
                        i16++;
                        break;
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        i10 = indexCount2;
                        jVar.f8119v = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f8119v);
                        continue;
                        i16++;
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        i10 = indexCount2;
                        jVar.f8090c = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f8090c);
                        continue;
                        i16++;
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        i10 = indexCount2;
                        int i17 = typedArrayObtainStyledAttributes.getInt(index2, lVar.f8134a);
                        lVar.f8134a = i17;
                        lVar.f8134a = iArr[i17];
                        continue;
                        i16++;
                        break;
                    case 23:
                        i10 = indexCount2;
                        jVar.f8088b = typedArrayObtainStyledAttributes.getLayoutDimension(index2, jVar.f8088b);
                        continue;
                        i16++;
                        break;
                    case 24:
                        i10 = indexCount2;
                        jVar.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.E);
                        continue;
                        i16++;
                        break;
                    case 25:
                        i10 = indexCount2;
                        jVar.f8098g = f(typedArrayObtainStyledAttributes, index2, jVar.f8098g);
                        continue;
                        i16++;
                        break;
                    case RuntimeVersion.MINOR:
                        i10 = indexCount2;
                        jVar.f8100h = f(typedArrayObtainStyledAttributes, index2, jVar.f8100h);
                        continue;
                        i16++;
                        break;
                    case 27:
                        i10 = indexCount2;
                        jVar.D = typedArrayObtainStyledAttributes.getInt(index2, jVar.D);
                        continue;
                        i16++;
                        break;
                    case 28:
                        i10 = indexCount2;
                        jVar.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.F);
                        continue;
                        i16++;
                        break;
                    case 29:
                        i10 = indexCount2;
                        jVar.f8102i = f(typedArrayObtainStyledAttributes, index2, jVar.f8102i);
                        continue;
                        i16++;
                        break;
                    case 30:
                        i10 = indexCount2;
                        jVar.f8104j = f(typedArrayObtainStyledAttributes, index2, jVar.f8104j);
                        continue;
                        i16++;
                        break;
                    case 31:
                        i10 = indexCount2;
                        jVar.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.J);
                        continue;
                        i16++;
                        break;
                    case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                        i10 = indexCount2;
                        jVar.f8115r = f(typedArrayObtainStyledAttributes, index2, jVar.f8115r);
                        continue;
                        i16++;
                        break;
                    case 33:
                        i10 = indexCount2;
                        jVar.f8116s = f(typedArrayObtainStyledAttributes, index2, jVar.f8116s);
                        continue;
                        i16++;
                        break;
                    case 34:
                        i10 = indexCount2;
                        jVar.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.G);
                        continue;
                        i16++;
                        break;
                    case 35:
                        i10 = indexCount2;
                        jVar.l = f(typedArrayObtainStyledAttributes, index2, jVar.l);
                        continue;
                        i16++;
                        break;
                    case 36:
                        i10 = indexCount2;
                        jVar.f8106k = f(typedArrayObtainStyledAttributes, index2, jVar.f8106k);
                        continue;
                        i16++;
                        break;
                    case 37:
                        i10 = indexCount2;
                        jVar.f8120w = typedArrayObtainStyledAttributes.getFloat(index2, jVar.f8120w);
                        continue;
                        i16++;
                        break;
                    case 38:
                        i10 = indexCount2;
                        iVar.f8079a = typedArrayObtainStyledAttributes.getResourceId(index2, iVar.f8079a);
                        continue;
                        i16++;
                        break;
                    case 39:
                        i10 = indexCount2;
                        jVar.T = typedArrayObtainStyledAttributes.getFloat(index2, jVar.T);
                        continue;
                        i16++;
                        break;
                    case 40:
                        i10 = indexCount2;
                        jVar.S = typedArrayObtainStyledAttributes.getFloat(index2, jVar.S);
                        continue;
                        i16++;
                        break;
                    case 41:
                        i10 = indexCount2;
                        jVar.U = typedArrayObtainStyledAttributes.getInt(index2, jVar.U);
                        continue;
                        i16++;
                        break;
                    case 42:
                        i10 = indexCount2;
                        jVar.V = typedArrayObtainStyledAttributes.getInt(index2, jVar.V);
                        continue;
                        i16++;
                        break;
                    case 43:
                        i10 = indexCount2;
                        lVar.f8136c = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f8136c);
                        continue;
                        i16++;
                        break;
                    case 44:
                        i10 = indexCount2;
                        mVar.l = true;
                        mVar.m = typedArrayObtainStyledAttributes.getDimension(index2, mVar.m);
                        continue;
                        i16++;
                        break;
                    case 45:
                        i10 = indexCount2;
                        mVar.f8140b = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f8140b);
                        continue;
                        i16++;
                        break;
                    case 46:
                        i10 = indexCount2;
                        mVar.f8141c = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f8141c);
                        continue;
                        i16++;
                        break;
                    case 47:
                        i10 = indexCount2;
                        mVar.f8142d = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f8142d);
                        continue;
                        i16++;
                        break;
                    case 48:
                        i10 = indexCount2;
                        mVar.f8143e = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f8143e);
                        continue;
                        i16++;
                        break;
                    case 49:
                        i10 = indexCount2;
                        mVar.f8144f = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f8144f);
                        continue;
                        i16++;
                        break;
                    case 50:
                        i10 = indexCount2;
                        mVar.f8145g = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f8145g);
                        continue;
                        i16++;
                        break;
                    case 51:
                        i10 = indexCount2;
                        mVar.f8147i = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f8147i);
                        continue;
                        i16++;
                        break;
                    case 52:
                        i10 = indexCount2;
                        mVar.f8148j = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f8148j);
                        continue;
                        i16++;
                        break;
                    case 53:
                        i10 = indexCount2;
                        mVar.f8149k = typedArrayObtainStyledAttributes.getDimension(index2, mVar.f8149k);
                        continue;
                        i16++;
                        break;
                    case 54:
                        i10 = indexCount2;
                        jVar.W = typedArrayObtainStyledAttributes.getInt(index2, jVar.W);
                        continue;
                        i16++;
                        break;
                    case 55:
                        i10 = indexCount2;
                        jVar.X = typedArrayObtainStyledAttributes.getInt(index2, jVar.X);
                        continue;
                        i16++;
                        break;
                    case 56:
                        i10 = indexCount2;
                        jVar.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Y);
                        continue;
                        i16++;
                        break;
                    case 57:
                        i10 = indexCount2;
                        jVar.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.Z);
                        continue;
                        i16++;
                        break;
                    case 58:
                        i10 = indexCount2;
                        jVar.f8087a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f8087a0);
                        continue;
                        i16++;
                        break;
                    case 59:
                        i10 = indexCount2;
                        jVar.f8089b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f8089b0);
                        continue;
                        i16++;
                        break;
                    case 60:
                        i10 = indexCount2;
                        mVar.f8139a = typedArrayObtainStyledAttributes.getFloat(index2, mVar.f8139a);
                        continue;
                        i16++;
                        break;
                    case 61:
                        i10 = indexCount2;
                        jVar.f8122y = f(typedArrayObtainStyledAttributes, index2, jVar.f8122y);
                        continue;
                        i16++;
                        break;
                    case 62:
                        i10 = indexCount2;
                        jVar.f8123z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f8123z);
                        continue;
                        i16++;
                        break;
                    case 63:
                        i10 = indexCount2;
                        jVar.A = typedArrayObtainStyledAttributes.getFloat(index2, jVar.A);
                        continue;
                        i16++;
                        break;
                    case 64:
                        i10 = indexCount2;
                        kVar.f8125a = f(typedArrayObtainStyledAttributes, index2, kVar.f8125a);
                        continue;
                        i16++;
                        break;
                    case 65:
                        i10 = indexCount2;
                        if (typedArrayObtainStyledAttributes.peekValue(index2).type == 3) {
                            typedArrayObtainStyledAttributes.getString(index2);
                            kVar.getClass();
                        } else {
                            String str = strArr[typedArrayObtainStyledAttributes.getInteger(index2, 0)];
                            kVar.getClass();
                        }
                        i16++;
                        break;
                    case 66:
                        i10 = indexCount2;
                        typedArrayObtainStyledAttributes.getInt(index2, 0);
                        kVar.getClass();
                        continue;
                        i16++;
                        break;
                    case 67:
                        i10 = indexCount2;
                        kVar.f8129e = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f8129e);
                        break;
                    case 68:
                        i10 = indexCount2;
                        lVar.f8137d = typedArrayObtainStyledAttributes.getFloat(index2, lVar.f8137d);
                        break;
                    case 69:
                        i10 = indexCount2;
                        jVar.f8091c0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 70:
                        i10 = indexCount2;
                        jVar.f8093d0 = typedArrayObtainStyledAttributes.getFloat(index2, 1.0f);
                        break;
                    case 71:
                        i10 = indexCount2;
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        i10 = indexCount2;
                        jVar.f8095e0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f8095e0);
                        break;
                    case 73:
                        i10 = indexCount2;
                        jVar.f8097f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.f8097f0);
                        break;
                    case 74:
                        i10 = indexCount2;
                        jVar.f8103i0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 75:
                        i10 = indexCount2;
                        jVar.f8109m0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f8109m0);
                        break;
                    case 76:
                        i10 = indexCount2;
                        kVar.f8127c = typedArrayObtainStyledAttributes.getInt(index2, kVar.f8127c);
                        break;
                    case 77:
                        i10 = indexCount2;
                        jVar.f8105j0 = typedArrayObtainStyledAttributes.getString(index2);
                        break;
                    case 78:
                        i10 = indexCount2;
                        lVar.f8135b = typedArrayObtainStyledAttributes.getInt(index2, lVar.f8135b);
                        break;
                    case 79:
                        i10 = indexCount2;
                        kVar.f8128d = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f8128d);
                        break;
                    case 80:
                        i10 = indexCount2;
                        jVar.f8107k0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f8107k0);
                        break;
                    case 81:
                        i10 = indexCount2;
                        jVar.f8108l0 = typedArrayObtainStyledAttributes.getBoolean(index2, jVar.f8108l0);
                        break;
                    case 82:
                        i10 = indexCount2;
                        kVar.f8126b = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f8126b);
                        break;
                    case 83:
                        i10 = indexCount2;
                        mVar.f8146h = f(typedArrayObtainStyledAttributes, index2, mVar.f8146h);
                        break;
                    case 84:
                        i10 = indexCount2;
                        kVar.f8131g = typedArrayObtainStyledAttributes.getInteger(index2, kVar.f8131g);
                        break;
                    case 85:
                        i10 = indexCount2;
                        kVar.f8130f = typedArrayObtainStyledAttributes.getFloat(index2, kVar.f8130f);
                        break;
                    case 86:
                        i10 = indexCount2;
                        int i18 = typedArrayObtainStyledAttributes.peekValue(index2).type;
                        if (i18 == 1) {
                            kVar.f8133i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                        } else if (i18 == 3) {
                            String string2 = typedArrayObtainStyledAttributes.getString(index2);
                            kVar.f8132h = string2;
                            if (string2.indexOf("/") > 0) {
                                kVar.f8133i = typedArrayObtainStyledAttributes.getResourceId(index2, -1);
                            }
                        } else {
                            typedArrayObtainStyledAttributes.getInteger(index2, kVar.f8133i);
                        }
                        break;
                    case 87:
                        i10 = indexCount2;
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index2) + "   " + sparseIntArray.get(index2));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        StringBuilder sb3 = new StringBuilder("Unknown attribute 0x");
                        i10 = indexCount2;
                        sb3.append(Integer.toHexString(index2));
                        sb3.append("   ");
                        sb3.append(sparseIntArray.get(index2));
                        Log.w("ConstraintSet", sb3.toString());
                        break;
                    case 91:
                        i10 = indexCount2;
                        jVar.f8113p = f(typedArrayObtainStyledAttributes, index2, jVar.f8113p);
                        break;
                    case 92:
                        i10 = indexCount2;
                        jVar.f8114q = f(typedArrayObtainStyledAttributes, index2, jVar.f8114q);
                        break;
                    case 93:
                        i10 = indexCount2;
                        jVar.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.K);
                        break;
                    case 94:
                        i10 = indexCount2;
                        jVar.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index2, jVar.R);
                        break;
                    case 95:
                        i10 = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 0);
                        continue;
                        i16++;
                        break;
                    case 96:
                        i10 = indexCount2;
                        g(jVar, typedArrayObtainStyledAttributes, index2, 1);
                        break;
                    case 97:
                        i10 = indexCount2;
                        jVar.f8111n0 = typedArrayObtainStyledAttributes.getInt(index2, jVar.f8111n0);
                        break;
                }
                i16++;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return iVar;
    }

    public static int f(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public static void g(Object obj, TypedArray typedArray, int i10, int i11) {
        int dimensionPixelSize;
        h hVar;
        j jVar;
        e eVar;
        if (obj == null) {
            return;
        }
        int i12 = typedArray.peekValue(i10).type;
        boolean z10 = true;
        int i13 = 0;
        if (i12 != 3) {
            if (i12 != 5) {
                dimensionPixelSize = typedArray.getInt(i10, 0);
                if (dimensionPixelSize == -4) {
                    i13 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z10 = false;
                }
                if (obj instanceof e) {
                    eVar = (e) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar).width = i13;
                        eVar.V = z10;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar).height = i13;
                        eVar.W = z10;
                        return;
                    }
                }
                if (obj instanceof j) {
                    jVar = (j) obj;
                    if (i11 == 0) {
                        jVar.f8088b = i13;
                        jVar.f8107k0 = z10;
                        return;
                    } else {
                        jVar.f8090c = i13;
                        jVar.f8108l0 = z10;
                        return;
                    }
                }
                if (obj instanceof h) {
                    hVar = (h) obj;
                    if (i11 == 0) {
                        hVar.b(23, i13);
                        hVar.d(80, z10);
                        return;
                    } else {
                        hVar.b(21, i13);
                        hVar.d(81, z10);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i10, 0);
            z10 = false;
            i13 = dimensionPixelSize;
            if (obj instanceof e) {
                eVar = (e) obj;
                if (i11 == 0) {
                    ((ViewGroup.MarginLayoutParams) eVar).width = i13;
                    eVar.V = z10;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) eVar).height = i13;
                    eVar.W = z10;
                    return;
                }
            }
            if (obj instanceof j) {
                jVar = (j) obj;
                if (i11 == 0) {
                    jVar.f8088b = i13;
                    jVar.f8107k0 = z10;
                    return;
                } else {
                    jVar.f8090c = i13;
                    jVar.f8108l0 = z10;
                    return;
                }
            }
            if (obj instanceof h) {
                hVar = (h) obj;
                if (i11 == 0) {
                    hVar.b(23, i13);
                    hVar.d(80, z10);
                    return;
                } else {
                    hVar.b(21, i13);
                    hVar.d(81, z10);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i10);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof e) {
                    e eVar2 = (e) obj;
                    if (i11 == 0) {
                        ((ViewGroup.MarginLayoutParams) eVar2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) eVar2).height = 0;
                    }
                    h(eVar2, strTrim2);
                    return;
                }
                if (obj instanceof j) {
                    ((j) obj).f8121x = strTrim2;
                    return;
                } else {
                    if (obj instanceof h) {
                        ((h) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f3 = Float.parseFloat(strTrim2);
                    if (obj instanceof e) {
                        e eVar3 = (e) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar3).width = 0;
                            eVar3.G = f3;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar3).height = 0;
                            eVar3.H = f3;
                            return;
                        }
                    }
                    if (obj instanceof j) {
                        j jVar2 = (j) obj;
                        if (i11 == 0) {
                            jVar2.f8088b = 0;
                            jVar2.T = f3;
                            return;
                        } else {
                            jVar2.f8090c = 0;
                            jVar2.S = f3;
                            return;
                        }
                    }
                    if (obj instanceof h) {
                        h hVar2 = (h) obj;
                        if (i11 == 0) {
                            hVar2.b(23, 0);
                            hVar2.a(f3, 39);
                            return;
                        } else {
                            hVar2.b(21, 0);
                            hVar2.a(f3, 40);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof e) {
                        e eVar4 = (e) obj;
                        if (i11 == 0) {
                            ((ViewGroup.MarginLayoutParams) eVar4).width = 0;
                            eVar4.Q = fMax;
                            eVar4.K = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) eVar4).height = 0;
                            eVar4.R = fMax;
                            eVar4.L = 2;
                            return;
                        }
                    }
                    if (obj instanceof j) {
                        j jVar3 = (j) obj;
                        if (i11 == 0) {
                            jVar3.f8088b = 0;
                            jVar3.f8091c0 = fMax;
                            jVar3.W = 2;
                            return;
                        } else {
                            jVar3.f8090c = 0;
                            jVar3.f8093d0 = fMax;
                            jVar3.X = 2;
                            return;
                        }
                    }
                    if (obj instanceof h) {
                        h hVar3 = (h) obj;
                        if (i11 == 0) {
                            hVar3.b(23, 0);
                            hVar3.b(54, 2);
                        } else {
                            hVar3.b(21, 0);
                            hVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void h(e eVar, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i10 = 0;
            int i11 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i10 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i11 = i10;
                i10 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i10);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i10, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f3 = Float.parseFloat(strSubstring3);
                        float f10 = Float.parseFloat(strSubstring4);
                        if (f3 > 0.0f && f10 > 0.0f) {
                            if (i11 == 1) {
                                Math.abs(f10 / f3);
                            } else {
                                Math.abs(f3 / f10);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        eVar.F = str;
    }

    public final void a(ConstraintLayout constraintLayout) {
        HashSet hashSet;
        int i10;
        HashMap map;
        String resourceEntryName;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map2 = nVar.f8155c;
        HashSet<Integer> hashSet2 = new HashSet(map2.keySet());
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            int id2 = childAt.getId();
            if (!map2.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder("id unknown ");
                try {
                    resourceEntryName = childAt.getContext().getResources().getResourceEntryName(childAt.getId());
                } catch (Exception unused) {
                    resourceEntryName = "UNKNOWN";
                }
                sb2.append(resourceEntryName);
                Log.w("ConstraintSet", sb2.toString());
            } else {
                if (nVar.f8154b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (map2.containsKey(Integer.valueOf(id2))) {
                        hashSet2.remove(Integer.valueOf(id2));
                        i iVar = (i) map2.get(Integer.valueOf(id2));
                        if (iVar != null) {
                            l lVar = iVar.f8080b;
                            j jVar = iVar.f8082d;
                            m mVar = iVar.f8083e;
                            if (childAt instanceof a) {
                                jVar.f8099g0 = 1;
                                a aVar = (a) childAt;
                                aVar.setId(id2);
                                aVar.setType(jVar.f8095e0);
                                aVar.setMargin(jVar.f8097f0);
                                aVar.setAllowsGoneWidget(jVar.f8109m0);
                                int[] iArr = jVar.f8101h0;
                                if (iArr != null) {
                                    aVar.setReferencedIds(iArr);
                                } else {
                                    String str = jVar.f8103i0;
                                    if (str != null) {
                                        int[] iArrC = c(aVar, str);
                                        jVar.f8101h0 = iArrC;
                                        aVar.setReferencedIds(iArrC);
                                    }
                                }
                            }
                            e eVar = (e) childAt.getLayoutParams();
                            eVar.a();
                            iVar.a(eVar);
                            HashMap map3 = iVar.f8084f;
                            Class<?> cls = childAt.getClass();
                            for (String str2 : map3.keySet()) {
                                b bVar = (b) map3.get(str2);
                                HashSet hashSet3 = hashSet2;
                                String strO = !bVar.f8008a ? a1.b.o("set", str2) : str2;
                                int i12 = i11;
                                try {
                                    int iB = e4.f.b(bVar.f8009b);
                                    Class cls2 = Float.TYPE;
                                    Class cls3 = Integer.TYPE;
                                    switch (iB) {
                                        case 0:
                                            map = map3;
                                            cls.getMethod(strO, cls3).invoke(childAt, Integer.valueOf(bVar.f8010c));
                                            break;
                                        case 1:
                                            map = map3;
                                            cls.getMethod(strO, cls2).invoke(childAt, Float.valueOf(bVar.f8011d));
                                            break;
                                        case 2:
                                            map = map3;
                                            cls.getMethod(strO, cls3).invoke(childAt, Integer.valueOf(bVar.f8014g));
                                            break;
                                        case 3:
                                            Method method = cls.getMethod(strO, Drawable.class);
                                            map = map3;
                                            try {
                                                ColorDrawable colorDrawable = new ColorDrawable();
                                                colorDrawable.setColor(bVar.f8014g);
                                                method.invoke(childAt, colorDrawable);
                                            } catch (IllegalAccessException e3) {
                                                e = e3;
                                                StringBuilder sbN = g4.c.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN.append(cls.getName());
                                                Log.e("TransitionLayout", sbN.toString());
                                                e.printStackTrace();
                                            } catch (NoSuchMethodException e10) {
                                                e = e10;
                                                Log.e("TransitionLayout", e.getMessage());
                                                Log.e("TransitionLayout", " Custom Attribute \"" + str2 + "\" not found on " + cls.getName());
                                                Log.e("TransitionLayout", cls.getName() + " must have a method " + strO);
                                            } catch (InvocationTargetException e11) {
                                                e = e11;
                                                StringBuilder sbN2 = g4.c.n(" Custom Attribute \"", str2, "\" not found on ");
                                                sbN2.append(cls.getName());
                                                Log.e("TransitionLayout", sbN2.toString());
                                                e.printStackTrace();
                                            }
                                            break;
                                        case 4:
                                            cls.getMethod(strO, CharSequence.class).invoke(childAt, bVar.f8012e);
                                            map = map3;
                                            break;
                                        case 5:
                                            cls.getMethod(strO, Boolean.TYPE).invoke(childAt, Boolean.valueOf(bVar.f8013f));
                                            map = map3;
                                            break;
                                        case 6:
                                            cls.getMethod(strO, cls2).invoke(childAt, Float.valueOf(bVar.f8011d));
                                            map = map3;
                                            break;
                                        case 7:
                                            cls.getMethod(strO, cls3).invoke(childAt, Integer.valueOf(bVar.f8010c));
                                            map = map3;
                                            break;
                                        default:
                                            map = map3;
                                            break;
                                    }
                                } catch (IllegalAccessException e12) {
                                    e = e12;
                                    map = map3;
                                } catch (NoSuchMethodException e13) {
                                    e = e13;
                                    map = map3;
                                } catch (InvocationTargetException e14) {
                                    e = e14;
                                    map = map3;
                                }
                                hashSet2 = hashSet3;
                                i11 = i12;
                                map3 = map;
                            }
                            hashSet = hashSet2;
                            i10 = i11;
                            childAt.setLayoutParams(eVar);
                            if (lVar.f8135b == 0) {
                                childAt.setVisibility(lVar.f8134a);
                            }
                            childAt.setAlpha(lVar.f8136c);
                            childAt.setRotation(mVar.f8139a);
                            childAt.setRotationX(mVar.f8140b);
                            childAt.setRotationY(mVar.f8141c);
                            childAt.setScaleX(mVar.f8142d);
                            childAt.setScaleY(mVar.f8143e);
                            if (mVar.f8146h != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(mVar.f8146h);
                                if (viewFindViewById != null) {
                                    float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                    float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float left = right - childAt.getLeft();
                                        float top = bottom - childAt.getTop();
                                        childAt.setPivotX(left);
                                        childAt.setPivotY(top);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(mVar.f8144f)) {
                                    childAt.setPivotX(mVar.f8144f);
                                }
                                if (!Float.isNaN(mVar.f8145g)) {
                                    childAt.setPivotY(mVar.f8145g);
                                }
                            }
                            childAt.setTranslationX(mVar.f8147i);
                            childAt.setTranslationY(mVar.f8148j);
                            childAt.setTranslationZ(mVar.f8149k);
                            if (mVar.l) {
                                childAt.setElevation(mVar.m);
                            }
                        }
                    } else {
                        hashSet = hashSet2;
                        i10 = i11;
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
                i11 = i10 + 1;
                nVar = this;
                hashSet2 = hashSet;
            }
            hashSet = hashSet2;
            i10 = i11;
            i11 = i10 + 1;
            nVar = this;
            hashSet2 = hashSet;
        }
        for (Integer num : hashSet2) {
            i iVar2 = (i) map2.get(num);
            if (iVar2 != null) {
                j jVar2 = iVar2.f8082d;
                if (jVar2.f8099g0 == 1) {
                    Context context = constraintLayout.getContext();
                    a aVar2 = new a(context);
                    aVar2.A = new int[32];
                    aVar2.G = new HashMap();
                    aVar2.C = context;
                    g4.a aVar3 = new g4.a();
                    aVar3.f6095r0 = 0;
                    aVar3.f6096s0 = true;
                    aVar3.f6097t0 = 0;
                    aVar3.f6098u0 = false;
                    aVar2.J = aVar3;
                    aVar2.D = aVar3;
                    aVar2.i();
                    aVar2.setVisibility(8);
                    aVar2.setId(num.intValue());
                    int[] iArr2 = jVar2.f8101h0;
                    if (iArr2 != null) {
                        aVar2.setReferencedIds(iArr2);
                    } else {
                        String str3 = jVar2.f8103i0;
                        if (str3 != null) {
                            int[] iArrC2 = c(aVar2, str3);
                            jVar2.f8101h0 = iArrC2;
                            aVar2.setReferencedIds(iArrC2);
                        }
                    }
                    aVar2.setType(jVar2.f8095e0);
                    aVar2.setMargin(jVar2.f8097f0);
                    e eVarA = ConstraintLayout.a();
                    aVar2.i();
                    iVar2.a(eVarA);
                    constraintLayout.addView(aVar2, eVarA);
                }
                if (jVar2.f8086a) {
                    View pVar = new p(constraintLayout.getContext());
                    pVar.setId(num.intValue());
                    e eVarA2 = ConstraintLayout.a();
                    iVar2.a(eVarA2);
                    constraintLayout.addView(pVar, eVarA2);
                }
            }
        }
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = constraintLayout.getChildAt(i13);
            if (childAt2 instanceof c) {
                ((c) childAt2).e(constraintLayout);
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        int i10;
        HashMap map;
        HashMap map2;
        n nVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map3 = nVar.f8155c;
        map3.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            e eVar = (e) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (nVar.f8154b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map3.containsKey(Integer.valueOf(id2))) {
                map3.put(Integer.valueOf(id2), new i());
            }
            i iVar = (i) map3.get(Integer.valueOf(id2));
            if (iVar == null) {
                i10 = childCount;
                map = map3;
            } else {
                l lVar = iVar.f8080b;
                j jVar = iVar.f8082d;
                m mVar = iVar.f8083e;
                HashMap map4 = new HashMap();
                Class<?> cls = childAt.getClass();
                HashMap map5 = nVar.f8153a;
                for (String str : map5.keySet()) {
                    b bVar = (b) map5.get(str);
                    int i12 = childCount;
                    try {
                        if (str.equals("BackgroundColor")) {
                            map2 = map3;
                            try {
                                map4.put(str, new b(bVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            } catch (IllegalAccessException e3) {
                                e = e3;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e10) {
                                e = e10;
                                e.printStackTrace();
                            } catch (InvocationTargetException e11) {
                                e = e11;
                                e.printStackTrace();
                            }
                        } else {
                            map2 = map3;
                            map4.put(str, new b(bVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                        }
                    } catch (IllegalAccessException e12) {
                        e = e12;
                        map2 = map3;
                    } catch (NoSuchMethodException e13) {
                        e = e13;
                        map2 = map3;
                    } catch (InvocationTargetException e14) {
                        e = e14;
                        map2 = map3;
                    }
                    childCount = i12;
                    map3 = map2;
                }
                i10 = childCount;
                map = map3;
                iVar.f8084f = map4;
                iVar.f8079a = id2;
                jVar.f8098g = eVar.f8022d;
                jVar.f8100h = eVar.f8024e;
                jVar.f8102i = eVar.f8026f;
                jVar.f8104j = eVar.f8028g;
                jVar.f8106k = eVar.f8030h;
                jVar.l = eVar.f8032i;
                jVar.m = eVar.f8034j;
                jVar.f8110n = eVar.f8036k;
                jVar.f8112o = eVar.l;
                jVar.f8113p = eVar.m;
                jVar.f8114q = eVar.f8040n;
                jVar.f8115r = eVar.f8046r;
                jVar.f8116s = eVar.f8047s;
                jVar.f8117t = eVar.f8048t;
                jVar.f8118u = eVar.f8049u;
                jVar.f8119v = eVar.D;
                jVar.f8120w = eVar.E;
                jVar.f8121x = eVar.F;
                jVar.f8122y = eVar.f8042o;
                jVar.f8123z = eVar.f8044p;
                jVar.A = eVar.f8045q;
                jVar.B = eVar.S;
                jVar.C = eVar.T;
                jVar.D = eVar.U;
                jVar.f8096f = eVar.f8020c;
                jVar.f8092d = eVar.f8016a;
                jVar.f8094e = eVar.f8018b;
                jVar.f8088b = ((ViewGroup.MarginLayoutParams) eVar).width;
                jVar.f8090c = ((ViewGroup.MarginLayoutParams) eVar).height;
                jVar.E = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                jVar.F = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                jVar.G = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                jVar.H = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                jVar.K = eVar.C;
                jVar.S = eVar.H;
                jVar.T = eVar.G;
                jVar.V = eVar.J;
                jVar.U = eVar.I;
                jVar.f8107k0 = eVar.V;
                jVar.f8108l0 = eVar.W;
                jVar.W = eVar.K;
                jVar.X = eVar.L;
                jVar.Y = eVar.O;
                jVar.Z = eVar.P;
                jVar.f8087a0 = eVar.M;
                jVar.f8089b0 = eVar.N;
                jVar.f8091c0 = eVar.Q;
                jVar.f8093d0 = eVar.R;
                jVar.f8105j0 = eVar.X;
                jVar.M = eVar.f8051w;
                jVar.O = eVar.f8053y;
                jVar.L = eVar.f8050v;
                jVar.N = eVar.f8052x;
                jVar.Q = eVar.f8054z;
                jVar.P = eVar.A;
                jVar.R = eVar.B;
                jVar.f8111n0 = eVar.Y;
                jVar.I = eVar.getMarginEnd();
                jVar.J = eVar.getMarginStart();
                lVar.f8134a = childAt.getVisibility();
                lVar.f8136c = childAt.getAlpha();
                mVar.f8139a = childAt.getRotation();
                mVar.f8140b = childAt.getRotationX();
                mVar.f8141c = childAt.getRotationY();
                mVar.f8142d = childAt.getScaleX();
                mVar.f8143e = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    mVar.f8144f = pivotX;
                    mVar.f8145g = pivotY;
                }
                mVar.f8147i = childAt.getTranslationX();
                mVar.f8148j = childAt.getTranslationY();
                mVar.f8149k = childAt.getTranslationZ();
                if (mVar.l) {
                    mVar.m = childAt.getElevation();
                }
                if (childAt instanceof a) {
                    a aVar = (a) childAt;
                    jVar.f8109m0 = aVar.getAllowsGoneWidget();
                    jVar.f8101h0 = aVar.getReferencedIds();
                    jVar.f8095e0 = aVar.getType();
                    jVar.f8097f0 = aVar.getMargin();
                }
            }
            i11++;
            nVar = this;
            childCount = i10;
            map3 = map;
        }
    }

    public final void e(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i iVarD = d(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        iVarD.f8082d.f8086a = true;
                    }
                    this.f8155c.put(Integer.valueOf(iVarD.f8079a), iVarD);
                }
            }
        } catch (IOException e3) {
            e3.printStackTrace();
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        }
    }
}
