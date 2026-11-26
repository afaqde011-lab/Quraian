package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.RuntimeVersion;

public final class j {

    public static final SparseIntArray f8085o0;
    public float A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;

    public boolean f8086a;

    public int f8087a0;

    public int f8088b;

    public int f8089b0;

    public int f8090c;

    public float f8091c0;

    public int f8092d;

    public float f8093d0;

    public int f8094e;

    public int f8095e0;

    public float f8096f;

    public int f8097f0;

    public int f8098g;

    public int f8099g0;

    public int f8100h;

    public int[] f8101h0;

    public int f8102i;

    public String f8103i0;

    public int f8104j;

    public String f8105j0;

    public int f8106k;

    public boolean f8107k0;
    public int l;

    public boolean f8108l0;
    public int m;

    public boolean f8109m0;

    public int f8110n;

    public int f8111n0;

    public int f8112o;

    public int f8113p;

    public int f8114q;

    public int f8115r;

    public int f8116s;

    public int f8117t;

    public int f8118u;

    public float f8119v;

    public float f8120w;

    public String f8121x;

    public int f8122y;

    public int f8123z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f8085o0 = sparseIntArray;
        sparseIntArray.append(42, 24);
        sparseIntArray.append(43, 25);
        sparseIntArray.append(45, 28);
        sparseIntArray.append(46, 29);
        sparseIntArray.append(51, 35);
        sparseIntArray.append(50, 34);
        sparseIntArray.append(23, 4);
        sparseIntArray.append(22, 3);
        sparseIntArray.append(18, 1);
        sparseIntArray.append(60, 6);
        sparseIntArray.append(61, 7);
        sparseIntArray.append(30, 17);
        sparseIntArray.append(31, 18);
        sparseIntArray.append(32, 19);
        sparseIntArray.append(0, 26);
        sparseIntArray.append(47, 31);
        sparseIntArray.append(48, 32);
        sparseIntArray.append(29, 10);
        sparseIntArray.append(28, 9);
        sparseIntArray.append(65, 13);
        sparseIntArray.append(68, 16);
        sparseIntArray.append(66, 14);
        sparseIntArray.append(63, 11);
        sparseIntArray.append(67, 15);
        sparseIntArray.append(64, 12);
        sparseIntArray.append(54, 38);
        sparseIntArray.append(40, 37);
        sparseIntArray.append(39, 39);
        sparseIntArray.append(53, 40);
        sparseIntArray.append(38, 20);
        sparseIntArray.append(52, 36);
        sparseIntArray.append(27, 5);
        sparseIntArray.append(41, 76);
        sparseIntArray.append(49, 76);
        sparseIntArray.append(44, 76);
        sparseIntArray.append(21, 76);
        sparseIntArray.append(17, 76);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(5, 27);
        sparseIntArray.append(7, 30);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(4, 33);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 22);
        sparseIntArray.append(2, 21);
        sparseIntArray.append(55, 41);
        sparseIntArray.append(33, 42);
        sparseIntArray.append(16, 41);
        sparseIntArray.append(15, 42);
        sparseIntArray.append(70, 97);
        sparseIntArray.append(24, 61);
        sparseIntArray.append(26, 62);
        sparseIntArray.append(25, 63);
        sparseIntArray.append(59, 69);
        sparseIntArray.append(37, 70);
        sparseIntArray.append(12, 71);
        sparseIntArray.append(10, 72);
        sparseIntArray.append(11, 73);
        sparseIntArray.append(13, 74);
        sparseIntArray.append(9, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f8160e);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            SparseIntArray sparseIntArray = f8085o0;
            int i11 = sparseIntArray.get(index);
            if (i11 == 80) {
                this.f8107k0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8107k0);
            } else if (i11 == 81) {
                this.f8108l0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8108l0);
            } else if (i11 != 97) {
                switch (i11) {
                    case 1:
                        this.f8112o = n.f(typedArrayObtainStyledAttributes, index, this.f8112o);
                        break;
                    case 2:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 3:
                        this.f8110n = n.f(typedArrayObtainStyledAttributes, index, this.f8110n);
                        break;
                    case 4:
                        this.m = n.f(typedArrayObtainStyledAttributes, index, this.m);
                        break;
                    case 5:
                        this.f8121x = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                        break;
                    case 7:
                        this.C = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                        break;
                    case 8:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 9:
                        this.f8118u = n.f(typedArrayObtainStyledAttributes, index, this.f8118u);
                        break;
                    case 10:
                        this.f8117t = n.f(typedArrayObtainStyledAttributes, index, this.f8117t);
                        break;
                    case 11:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 12:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 13:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 14:
                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                        break;
                    case 15:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 16:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 17:
                        this.f8092d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8092d);
                        break;
                    case TYPE_SINT64_VALUE:
                        this.f8094e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f8094e);
                        break;
                    case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                        this.f8096f = typedArrayObtainStyledAttributes.getFloat(index, this.f8096f);
                        break;
                    case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                        this.f8119v = typedArrayObtainStyledAttributes.getFloat(index, this.f8119v);
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                        this.f8090c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8090c);
                        break;
                    case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                        this.f8088b = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f8088b);
                        break;
                    case 23:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.E);
                        break;
                    case 24:
                        this.f8098g = n.f(typedArrayObtainStyledAttributes, index, this.f8098g);
                        break;
                    case 25:
                        this.f8100h = n.f(typedArrayObtainStyledAttributes, index, this.f8100h);
                        break;
                    case RuntimeVersion.MINOR:
                        this.D = typedArrayObtainStyledAttributes.getInt(index, this.D);
                        break;
                    case 27:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.F);
                        break;
                    case 28:
                        this.f8102i = n.f(typedArrayObtainStyledAttributes, index, this.f8102i);
                        break;
                    case 29:
                        this.f8104j = n.f(typedArrayObtainStyledAttributes, index, this.f8104j);
                        break;
                    case 30:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 31:
                        this.f8115r = n.f(typedArrayObtainStyledAttributes, index, this.f8115r);
                        break;
                    case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                        this.f8116s = n.f(typedArrayObtainStyledAttributes, index, this.f8116s);
                        break;
                    case 33:
                        this.G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.G);
                        break;
                    case 34:
                        this.l = n.f(typedArrayObtainStyledAttributes, index, this.l);
                        break;
                    case 35:
                        this.f8106k = n.f(typedArrayObtainStyledAttributes, index, this.f8106k);
                        break;
                    case 36:
                        this.f8120w = typedArrayObtainStyledAttributes.getFloat(index, this.f8120w);
                        break;
                    case 37:
                        this.T = typedArrayObtainStyledAttributes.getFloat(index, this.T);
                        break;
                    case 38:
                        this.S = typedArrayObtainStyledAttributes.getFloat(index, this.S);
                        break;
                    case 39:
                        this.U = typedArrayObtainStyledAttributes.getInt(index, this.U);
                        break;
                    case 40:
                        this.V = typedArrayObtainStyledAttributes.getInt(index, this.V);
                        break;
                    case 41:
                        n.g(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        n.g(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 54:
                                this.W = typedArrayObtainStyledAttributes.getInt(index, this.W);
                                break;
                            case 55:
                                this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                                break;
                            case 56:
                                this.Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                break;
                            case 57:
                                this.Z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                break;
                            case 58:
                                this.f8087a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8087a0);
                                break;
                            case 59:
                                this.f8089b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8089b0);
                                break;
                            default:
                                switch (i11) {
                                    case 61:
                                        this.f8122y = n.f(typedArrayObtainStyledAttributes, index, this.f8122y);
                                        break;
                                    case 62:
                                        this.f8123z = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8123z);
                                        break;
                                    case 63:
                                        this.A = typedArrayObtainStyledAttributes.getFloat(index, this.A);
                                        break;
                                    default:
                                        switch (i11) {
                                            case 69:
                                                this.f8091c0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 70:
                                                this.f8093d0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                break;
                                            case 71:
                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                break;
                                            case 72:
                                                this.f8095e0 = typedArrayObtainStyledAttributes.getInt(index, this.f8095e0);
                                                break;
                                            case 73:
                                                this.f8097f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f8097f0);
                                                break;
                                            case 74:
                                                this.f8103i0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            case 75:
                                                this.f8109m0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f8109m0);
                                                break;
                                            case 76:
                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                break;
                                            case 77:
                                                this.f8105j0 = typedArrayObtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                switch (i11) {
                                                    case 91:
                                                        this.f8113p = n.f(typedArrayObtainStyledAttributes, index, this.f8113p);
                                                        break;
                                                    case 92:
                                                        this.f8114q = n.f(typedArrayObtainStyledAttributes, index, this.f8114q);
                                                        break;
                                                    case 93:
                                                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                                        break;
                                                    case 94:
                                                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                                        break;
                                                    default:
                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                                                        break;
                                                }
                                                break;
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                this.f8111n0 = typedArrayObtainStyledAttributes.getInt(index, this.f8111n0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
