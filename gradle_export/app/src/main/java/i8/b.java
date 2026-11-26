package i8;

import a8.i0;
import a8.l0;
import a8.m;
import a8.q;
import a8.r;
import a8.s;
import a8.v;
import androidx.media3.common.ParserException;
import androidx.media3.common.v0;
import androidx.media3.common.x0;
import e7.u;
import fh.d2;
import java.util.Objects;
import oi.k;
import org.xmlpull.v1.XmlPullParserException;
import u8.l;
import x8.i;

public final class b implements q {

    public s f7518b;

    public int f7519c;

    public int f7520d;

    public int f7521e;

    public j8.b f7523g;

    public r f7524h;

    public i0 f7525i;

    public l f7526j;

    public final u f7517a = new u(2);

    public long f7522f = -1;

    @Override
    public final void a(s sVar) {
        this.f7518b = sVar;
    }

    @Override
    public final void b(long j9, long j10) {
        if (j9 == 0) {
            this.f7519c = 0;
            this.f7526j = null;
        } else if (this.f7519c == 5) {
            l lVar = this.f7526j;
            lVar.getClass();
            lVar.b(j9, j10);
        }
    }

    @Override
    public final int d(r rVar, a8.u uVar) throws ParserException {
        String strV;
        i0 i0VarA;
        d2 d2Var;
        int i10;
        j8.b bVar;
        long j9;
        int i11 = this.f7519c;
        long j10 = -1;
        u uVar2 = this.f7517a;
        if (i11 == 0) {
            uVar2.K(2);
            rVar.readFully(uVar2.f5182a, 0, 2);
            int iH = uVar2.H();
            this.f7520d = iH;
            if (iH == 65498) {
                if (this.f7522f != -1) {
                    this.f7519c = 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((iH < 65488 || iH > 65497) && iH != 65281) {
                this.f7519c = 1;
            }
            return 0;
        }
        if (i11 == 1) {
            uVar2.K(2);
            rVar.a(0, 2, uVar2.f5182a);
            this.f7521e = uVar2.H() - 2;
            rVar.u(2);
            this.f7519c = 2;
            return 0;
        }
        if (i11 != 2) {
            if (i11 != 4) {
                if (i11 != 5) {
                    if (i11 == 6) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                if (this.f7525i == null || rVar != this.f7524h) {
                    this.f7524h = rVar;
                    this.f7525i = new i0(rVar, this.f7522f);
                }
                l lVar = this.f7526j;
                lVar.getClass();
                int iD = lVar.d(this.f7525i, uVar);
                if (iD == 1) {
                    uVar.f307a += this.f7522f;
                }
                return iD;
            }
            long position = rVar.getPosition();
            long j11 = this.f7522f;
            if (position != j11) {
                uVar.f307a = j11;
                return 1;
            }
            if (!rVar.i(uVar2.f5182a, 0, 1, true)) {
                f();
                return 0;
            }
            rVar.t();
            if (this.f7526j == null) {
                this.f7526j = new l(i.f16490z, 8);
            }
            i0 i0Var = new i0(rVar, this.f7522f);
            this.f7525i = i0Var;
            if (!this.f7526j.e(i0Var)) {
                f();
                return 0;
            }
            l lVar2 = this.f7526j;
            long j12 = this.f7522f;
            s sVar = this.f7518b;
            sVar.getClass();
            lVar2.a(new i0(j12, sVar, 1));
            j8.b bVar2 = this.f7523g;
            bVar2.getClass();
            s sVar2 = this.f7518b;
            sVar2.getClass();
            l0 l0VarW = sVar2.w(1024, 4);
            androidx.media3.common.s sVar3 = new androidx.media3.common.s();
            sVar3.l = x0.n("image/jpeg");
            sVar3.f1501k = new v0(bVar2);
            k.w(sVar3, l0VarW);
            this.f7519c = 5;
            return 0;
        }
        if (this.f7520d == 65505) {
            u uVar3 = new u(this.f7521e);
            rVar.readFully(uVar3.f5182a, 0, this.f7521e);
            if (this.f7523g == null && "http://ns.adobe.com/xap/1.0/".equals(uVar3.v()) && (strV = uVar3.v()) != null) {
                long length = rVar.getLength();
                if (length == -1) {
                    bVar = null;
                } else {
                    try {
                        i0VarA = d.a(strV);
                    } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
                        e7.a.m("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                        i0VarA = null;
                    }
                    if (i0VarA != null && (i10 = (d2Var = (d2) i0VarA.C).D) >= 2) {
                        int i12 = i10 - 1;
                        long j13 = -1;
                        long j14 = -1;
                        long j15 = -1;
                        long j16 = -1;
                        while (i12 >= 0) {
                            c cVar = (c) d2Var.get(i12);
                            String str = cVar.f7527a;
                            boolean z10 = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i12 == 0) {
                                length -= cVar.f7529c;
                                j9 = 0;
                            } else {
                                j9 = length - cVar.f7528b;
                            }
                            long j17 = length;
                            length = j9;
                            if (z10 && length != j17) {
                                j16 = j17 - length;
                                j15 = length;
                            }
                            if (i12 == 0) {
                                j14 = j17;
                                j13 = length;
                            }
                            i12--;
                            j10 = j10;
                        }
                        long j18 = j10;
                        if (j15 == j18 || j16 == j18 || j13 == j18 || j14 == j18) {
                            bVar = null;
                        } else {
                            bVar = new j8.b(j13, j14, i0VarA.B, j15, j16);
                        }
                    } else {
                        bVar = null;
                    }
                }
                this.f7523g = bVar;
                if (bVar != null) {
                    this.f7522f = bVar.f8254d;
                }
            }
        } else {
            rVar.u(this.f7521e);
        }
        this.f7519c = 0;
        return 0;
    }

    @Override
    public final boolean e(r rVar) {
        String strV;
        m mVar = (m) rVar;
        u uVar = this.f7517a;
        uVar.K(2);
        mVar.i(uVar.f5182a, 0, 2, false);
        if (uVar.H() == 65496) {
            while (true) {
                uVar.K(2);
                mVar.i(uVar.f5182a, 0, 2, false);
                int iH = uVar.H();
                this.f7520d = iH;
                if (iH == 65498) {
                    break;
                }
                uVar.K(2);
                mVar.a(0, 2, uVar.f5182a);
                int iH2 = uVar.H() - 2;
                if (iH2 < 0) {
                    break;
                }
                if (this.f7520d != 65505) {
                    mVar.b(iH2, false);
                } else {
                    uVar.K(iH2);
                    mVar.i(uVar.f5182a, 0, iH2, false);
                    if (Objects.equals(uVar.v(), "http://ns.adobe.com/xap/1.0/") && (strV = uVar.v()) != null) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (strV.contains(d.f7530a[i10] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void f() {
        s sVar = this.f7518b;
        sVar.getClass();
        sVar.q();
        this.f7518b.b(new v(-9223372036854775807L));
        this.f7519c = 6;
    }

    @Override
    public final void release() {
        l lVar = this.f7526j;
        if (lVar != null) {
            lVar.getClass();
        }
    }
}
