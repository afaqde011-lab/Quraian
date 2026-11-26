package wb;

import ab.a0;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.profileinstaller.ProfileInstallReceiver;
import coil.request.NullRequestDataException;
import com.google.protobuf.RuntimeVersion;
import java.util.List;
import java.util.Objects;
import s10.w0;
import sd.p1;
import x.b0;
import x.t1;
import x.v1;
import x.z;

public final class o implements x.p, v1, xf.e, zd.b, dh.n, z9.b, zh.n {
    public final Object A;

    public o() {
        this.A = new xf.n();
    }

    public o(float f3, float f10) {
        this.A = new b0(f3, f10, 0.01f);
    }

    public o(float f3, float f10, x.o oVar) {
        int[] iArr = t1.f16374a;
        this.A = new p10.a(oVar != null ? new wi.b(f3, f10, oVar) : new o(f3, f10));
    }

    public o(View view) {
        w0 w0Var = new w0(view);
        w0Var.C = view;
        this.A = w0Var;
    }

    public o(TextView textView) {
        this.A = new x5.g(textView);
    }

    public o(Object obj) {
        this.A = obj;
    }

    public o(lb.j jVar, bc.g gVar) {
        this.A = gVar;
    }

    public o(o oVar, wi.b bVar) {
        this.A = bVar;
        Objects.requireNonNull(oVar);
    }

    public o(int[] iArr, float[] fArr, float[][] fArr2) {
        int i10;
        int length = fArr.length - 1;
        x.q[][] qVarArr = new x.q[length][];
        int i11 = 1;
        int i12 = 1;
        int i13 = 0;
        while (i13 < length) {
            int i14 = iArr[i13];
            int i15 = 3;
            if (i14 == 0) {
                i10 = i15;
            } else if (i14 == 1) {
                i11 = 1;
                i10 = i11;
            } else {
                if (i14 != 2) {
                    if (i14 != 3) {
                        i15 = 4;
                        if (i14 != 4) {
                            i15 = 5;
                            if (i14 != 5) {
                                i10 = i12;
                            } else {
                                i10 = i15;
                            }
                        } else {
                            i10 = i15;
                        }
                    } else {
                        if (i11 != 1) {
                            i11 = 1;
                        }
                        i10 = i11;
                    }
                }
                i11 = 2;
                i10 = i11;
            }
            float[] fArr3 = fArr2[i13];
            int i16 = i13 + 1;
            float[] fArr4 = fArr2[i16];
            float f3 = fArr[i13];
            float f10 = fArr[i16];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            x.q[] qVarArr2 = new x.q[length2];
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17 * 2;
                x.q[] qVarArr3 = qVarArr2;
                int i19 = i17;
                int i20 = i18 + 1;
                qVarArr3[i19] = new x.q(i10, f3, f10, fArr3[i18], fArr3[i20], fArr4[i18], fArr4[i20]);
                i17 = i19 + 1;
                qVarArr2 = qVarArr3;
            }
            qVarArr[i13] = qVarArr2;
            i13 = i16;
            i12 = i10;
        }
        this.A = qVarArr;
    }

    public static e f(i iVar, Throwable th2) {
        if (th2 instanceof NullRequestDataException) {
            iVar.getClass();
            c cVar = iVar.B;
            cVar.getClass();
            c cVar2 = bc.c.f2479a;
            cVar.getClass();
        } else {
            iVar.B.getClass();
            c cVar3 = bc.c.f2479a;
        }
        return new e(null, iVar, th2);
    }

    @Override
    public boolean a() {
        ((p10.a) this.A).getClass();
        return false;
    }

    @Override
    public long b(x.o oVar, x.o oVar2, x.o oVar3) {
        return ((p10.a) this.A).b(oVar, oVar2, oVar3);
    }

    @Override
    public x.o c(long j9, x.o oVar, x.o oVar2, x.o oVar3) {
        return ((p10.a) this.A).c(j9, oVar, oVar2, oVar3);
    }

    @Override
    public Object d(String str) {
        return ((zh.p) this.A).b(str, null);
    }

    @Override
    public Object e() {
        return new yg.k((yg.g) ((dh.m) this.A).e());
    }

    public l g(i iVar, xb.g gVar) {
        Bitmap.Config config;
        List list = iVar.f15942h;
        Bitmap.Config config2 = iVar.f15940f;
        if ((!list.isEmpty() && !h00.n.m0(config2, bc.d.f2480a)) || (config2 == (config = Bitmap.Config.HARDWARE) && config2 == config && !iVar.m)) {
            config2 = Bitmap.Config.ARGB_8888;
        }
        a0 a0Var = gVar.f16513a;
        xb.b bVar = xb.b.f16511a;
        return new l(iVar.f15935a, config2, null, gVar, (a0Var.equals(bVar) || gVar.f16514b.equals(bVar)) ? xb.f.B : iVar.f15957y, bc.c.a(iVar), iVar.f15946n && iVar.f15942h.isEmpty() && config2 != Bitmap.Config.ALPHA_8, iVar.f15947o, iVar.f15939e, iVar.f15944j, iVar.f15945k, iVar.f15958z, iVar.f15948p, iVar.f15949q, iVar.f15950r);
    }

    public Object get() {
        return new p1((Context) ((a5.f) this.A).A, new sg.f(), new hb.f(), 26);
    }

    @Override
    public z get(int i10) {
        return (b0) this.A;
    }

    @Override
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public void i(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = RuntimeVersion.SUFFIX;
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.A).setResultCode(i10);
    }

    public l j(l lVar) {
        boolean z10;
        boolean z11;
        Bitmap.Config config = lVar.f15961b;
        b bVar = lVar.f15972o;
        Bitmap.Config config2 = Bitmap.Config.HARDWARE;
        if (bVar.A) {
            bc.g gVar = (bc.g) this.A;
            synchronized (gVar) {
                gVar.a();
                z11 = gVar.E;
            }
            if (z11) {
                z10 = false;
            } else {
                bVar = b.DISABLED;
                z10 = true;
            }
        } else {
            z10 = false;
        }
        return z10 ? new l(lVar.f15960a, config, lVar.f15962c, lVar.f15963d, lVar.f15964e, lVar.f15965f, lVar.f15966g, lVar.f15967h, lVar.f15968i, lVar.f15969j, lVar.f15970k, lVar.l, lVar.m, lVar.f15971n, bVar) : lVar;
    }

    @Override
    public x.o m(x.o oVar, x.o oVar2, x.o oVar3) {
        return ((p10.a) this.A).m(oVar, oVar2, oVar3);
    }

    @Override
    public void onSuccess(Object obj) {
        ((xf.g) ((wi.b) this.A).B).f16565a.t();
    }

    @Override
    public x.o r(long j9, x.o oVar, x.o oVar2, x.o oVar3) {
        return ((p10.a) this.A).r(j9, oVar, oVar2, oVar3);
    }
}
