package uu;

import a40.c0;
import a40.z;
import android.os.Bundle;
import androidx.media3.common.q0;
import androidx.media3.common.t0;
import d40.p1;
import g00.b0;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public final int A = 1;
    public k9.u B;
    public int C;
    public final w D;

    public r(w wVar, k00.c cVar) {
        super(2, cVar);
        this.D = wVar;
    }

    public r(w wVar, k9.u uVar, k00.c cVar) {
        super(2, cVar);
        this.D = wVar;
        this.B = uVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new r(this.D, this.B, cVar);
            default:
                return new r(this.D, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((r) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        k9.u uVar;
        w wVar;
        q0 currentMediaItem;
        Bundle bundle;
        t0 t0Var;
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.C;
                if (i == 0) {
                    t1.O(obj);
                    this.C = 1;
                    if (c0.l(600L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                w.b(this.D, this.B.isPlaying());
                return b0.a;
            default:
                b0 b0Var = b0.a;
                l00.a aVar2 = l00.a.A;
                switch (this.C) {
                    case 0:
                        t1.O(obj);
                        uVar = this.D.r;
                        if (uVar == null || !uVar.d.isConnected() || !this.D.l()) {
                            return b0Var;
                        }
                        p1 p1Var = this.D.G;
                        Boolean boolValueOf = Boolean.valueOf(uVar.isPlaying());
                        this.B = uVar;
                        this.C = 1;
                        p1Var.emit(boolValueOf, this);
                        if (b0Var != aVar2) {
                            p1 p1Var2 = this.D.H;
                            Boolean boolValueOf2 = Boolean.valueOf(uVar.getPlayWhenReady());
                            this.B = uVar;
                            this.C = 2;
                            p1Var2.emit(boolValueOf2, this);
                            if (b0Var != aVar2) {
                                p1 p1Var3 = this.D.M;
                                Float f = new Float(uVar.getPlaybackParameters().a);
                                p1Var3.getClass();
                                p1Var3.k(null, f);
                                p1 p1Var4 = this.D.J;
                                Integer num = new Integer(uVar.getRepeatMode());
                                this.B = uVar;
                                this.C = 3;
                                p1Var4.emit(num, this);
                                if (b0Var != aVar2) {
                                    p1 p1Var5 = this.D.I;
                                    Boolean boolValueOf3 = Boolean.valueOf(uVar.getShuffleModeEnabled());
                                    this.B = uVar;
                                    this.C = 4;
                                    p1Var5.emit(boolValueOf3, this);
                                    if (b0Var != aVar2) {
                                        p1 p1Var6 = this.D.F;
                                        Float f2 = new Float(uVar.getVolume());
                                        p1Var6.getClass();
                                        p1Var6.k(null, f2);
                                        if (uVar.getDuration() > 0) {
                                            p1 p1Var7 = this.D.D;
                                            Long l = new Long(uVar.getDuration());
                                            this.B = uVar;
                                            this.C = 5;
                                            p1Var7.emit(l, this);
                                            if (b0Var != aVar2) {
                                                p1 p1Var8 = this.D.E;
                                                Long l2 = new Long(uVar.getCurrentPosition());
                                                this.B = uVar;
                                                this.C = 6;
                                                p1Var8.emit(l2, this);
                                                if (b0Var != aVar2) {
                                                    wVar = this.D;
                                                    currentMediaItem = uVar.getCurrentMediaItem();
                                                    if (currentMediaItem != null || (t0Var = currentMediaItem.d) == null) {
                                                        bundle = null;
                                                    } else {
                                                        bundle = t0Var.I;
                                                    }
                                                    this.B = null;
                                                    this.C = 7;
                                                    if (w.c(wVar, bundle, this) != aVar2) {
                                                        return b0Var;
                                                    }
                                                }
                                            }
                                        } else {
                                            p1 p1Var9 = this.D.E;
                                            Long l3 = new Long(uVar.getCurrentPosition());
                                            this.B = uVar;
                                            this.C = 6;
                                            p1Var9.emit(l3, this);
                                            if (b0Var != aVar2) {
                                                wVar = this.D;
                                                currentMediaItem = uVar.getCurrentMediaItem();
                                                if (currentMediaItem != null) {
                                                    bundle = null;
                                                } else {
                                                    bundle = null;
                                                }
                                                this.B = null;
                                                this.C = 7;
                                                if (w.c(wVar, bundle, this) != aVar2) {
                                                    return b0Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 1:
                        uVar = this.B;
                        t1.O(obj);
                        p1 p1Var10 = this.D.H;
                        Boolean boolValueOf4 = Boolean.valueOf(uVar.getPlayWhenReady());
                        this.B = uVar;
                        this.C = 2;
                        p1Var10.emit(boolValueOf4, this);
                        if (b0Var != aVar2) {
                            p1 p1Var11 = this.D.M;
                            Float f3 = new Float(uVar.getPlaybackParameters().a);
                            p1Var11.getClass();
                            p1Var11.k(null, f3);
                            p1 p1Var12 = this.D.J;
                            Integer num2 = new Integer(uVar.getRepeatMode());
                            this.B = uVar;
                            this.C = 3;
                            p1Var12.emit(num2, this);
                            if (b0Var != aVar2) {
                                p1 p1Var13 = this.D.I;
                                Boolean boolValueOf5 = Boolean.valueOf(uVar.getShuffleModeEnabled());
                                this.B = uVar;
                                this.C = 4;
                                p1Var13.emit(boolValueOf5, this);
                                if (b0Var != aVar2) {
                                    p1 p1Var14 = this.D.F;
                                    Float f4 = new Float(uVar.getVolume());
                                    p1Var14.getClass();
                                    p1Var14.k(null, f4);
                                    if (uVar.getDuration() > 0) {
                                        p1 p1Var15 = this.D.D;
                                        Long l4 = new Long(uVar.getDuration());
                                        this.B = uVar;
                                        this.C = 5;
                                        p1Var15.emit(l4, this);
                                        if (b0Var != aVar2) {
                                            p1 p1Var16 = this.D.E;
                                            Long l5 = new Long(uVar.getCurrentPosition());
                                            this.B = uVar;
                                            this.C = 6;
                                            p1Var16.emit(l5, this);
                                            if (b0Var != aVar2) {
                                                wVar = this.D;
                                                currentMediaItem = uVar.getCurrentMediaItem();
                                                if (currentMediaItem != null) {
                                                    bundle = null;
                                                } else {
                                                    bundle = null;
                                                }
                                                this.B = null;
                                                this.C = 7;
                                                if (w.c(wVar, bundle, this) != aVar2) {
                                                    return b0Var;
                                                }
                                            }
                                        }
                                    } else {
                                        p1 p1Var17 = this.D.E;
                                        Long l6 = new Long(uVar.getCurrentPosition());
                                        this.B = uVar;
                                        this.C = 6;
                                        p1Var17.emit(l6, this);
                                        if (b0Var != aVar2) {
                                            wVar = this.D;
                                            currentMediaItem = uVar.getCurrentMediaItem();
                                            if (currentMediaItem != null) {
                                                bundle = null;
                                            } else {
                                                bundle = null;
                                            }
                                            this.B = null;
                                            this.C = 7;
                                            if (w.c(wVar, bundle, this) != aVar2) {
                                                return b0Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 2:
                        uVar = this.B;
                        t1.O(obj);
                        p1 p1Var18 = this.D.M;
                        Float f5 = new Float(uVar.getPlaybackParameters().a);
                        p1Var18.getClass();
                        p1Var18.k(null, f5);
                        p1 p1Var19 = this.D.J;
                        Integer num3 = new Integer(uVar.getRepeatMode());
                        this.B = uVar;
                        this.C = 3;
                        p1Var19.emit(num3, this);
                        if (b0Var != aVar2) {
                            p1 p1Var110 = this.D.I;
                            Boolean boolValueOf6 = Boolean.valueOf(uVar.getShuffleModeEnabled());
                            this.B = uVar;
                            this.C = 4;
                            p1Var110.emit(boolValueOf6, this);
                            if (b0Var != aVar2) {
                                p1 p1Var111 = this.D.F;
                                Float f6 = new Float(uVar.getVolume());
                                p1Var111.getClass();
                                p1Var111.k(null, f6);
                                if (uVar.getDuration() > 0) {
                                    p1 p1Var112 = this.D.D;
                                    Long l7 = new Long(uVar.getDuration());
                                    this.B = uVar;
                                    this.C = 5;
                                    p1Var112.emit(l7, this);
                                    if (b0Var != aVar2) {
                                        p1 p1Var113 = this.D.E;
                                        Long l8 = new Long(uVar.getCurrentPosition());
                                        this.B = uVar;
                                        this.C = 6;
                                        p1Var113.emit(l8, this);
                                        if (b0Var != aVar2) {
                                            wVar = this.D;
                                            currentMediaItem = uVar.getCurrentMediaItem();
                                            if (currentMediaItem != null) {
                                                bundle = null;
                                            } else {
                                                bundle = null;
                                            }
                                            this.B = null;
                                            this.C = 7;
                                            if (w.c(wVar, bundle, this) != aVar2) {
                                                return b0Var;
                                            }
                                        }
                                    }
                                } else {
                                    p1 p1Var114 = this.D.E;
                                    Long l9 = new Long(uVar.getCurrentPosition());
                                    this.B = uVar;
                                    this.C = 6;
                                    p1Var114.emit(l9, this);
                                    if (b0Var != aVar2) {
                                        wVar = this.D;
                                        currentMediaItem = uVar.getCurrentMediaItem();
                                        if (currentMediaItem != null) {
                                            bundle = null;
                                        } else {
                                            bundle = null;
                                        }
                                        this.B = null;
                                        this.C = 7;
                                        if (w.c(wVar, bundle, this) != aVar2) {
                                            return b0Var;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 3:
                        uVar = this.B;
                        t1.O(obj);
                        p1 p1Var115 = this.D.I;
                        Boolean boolValueOf7 = Boolean.valueOf(uVar.getShuffleModeEnabled());
                        this.B = uVar;
                        this.C = 4;
                        p1Var115.emit(boolValueOf7, this);
                        if (b0Var != aVar2) {
                            p1 p1Var116 = this.D.F;
                            Float f7 = new Float(uVar.getVolume());
                            p1Var116.getClass();
                            p1Var116.k(null, f7);
                            if (uVar.getDuration() > 0) {
                                p1 p1Var117 = this.D.D;
                                Long l11 = new Long(uVar.getDuration());
                                this.B = uVar;
                                this.C = 5;
                                p1Var117.emit(l11, this);
                                if (b0Var != aVar2) {
                                    p1 p1Var118 = this.D.E;
                                    Long l12 = new Long(uVar.getCurrentPosition());
                                    this.B = uVar;
                                    this.C = 6;
                                    p1Var118.emit(l12, this);
                                    if (b0Var != aVar2) {
                                        wVar = this.D;
                                        currentMediaItem = uVar.getCurrentMediaItem();
                                        if (currentMediaItem != null) {
                                            bundle = null;
                                        } else {
                                            bundle = null;
                                        }
                                        this.B = null;
                                        this.C = 7;
                                        if (w.c(wVar, bundle, this) != aVar2) {
                                            return b0Var;
                                        }
                                    }
                                }
                            } else {
                                p1 p1Var119 = this.D.E;
                                Long l13 = new Long(uVar.getCurrentPosition());
                                this.B = uVar;
                                this.C = 6;
                                p1Var119.emit(l13, this);
                                if (b0Var != aVar2) {
                                    wVar = this.D;
                                    currentMediaItem = uVar.getCurrentMediaItem();
                                    if (currentMediaItem != null) {
                                        bundle = null;
                                    } else {
                                        bundle = null;
                                    }
                                    this.B = null;
                                    this.C = 7;
                                    if (w.c(wVar, bundle, this) != aVar2) {
                                        return b0Var;
                                    }
                                }
                            }
                        }
                        return aVar2;
                    case 4:
                        uVar = this.B;
                        t1.O(obj);
                        p1 p1Var1110 = this.D.F;
                        Float f8 = new Float(uVar.getVolume());
                        p1Var1110.getClass();
                        p1Var1110.k(null, f8);
                        if (uVar.getDuration() > 0) {
                            p1 p1Var1111 = this.D.D;
                            Long l14 = new Long(uVar.getDuration());
                            this.B = uVar;
                            this.C = 5;
                            p1Var1111.emit(l14, this);
                            if (b0Var != aVar2) {
                                p1 p1Var1112 = this.D.E;
                                Long l15 = new Long(uVar.getCurrentPosition());
                                this.B = uVar;
                                this.C = 6;
                                p1Var1112.emit(l15, this);
                                if (b0Var != aVar2) {
                                    wVar = this.D;
                                    currentMediaItem = uVar.getCurrentMediaItem();
                                    if (currentMediaItem != null) {
                                        bundle = null;
                                    } else {
                                        bundle = null;
                                    }
                                    this.B = null;
                                    this.C = 7;
                                    if (w.c(wVar, bundle, this) != aVar2) {
                                        return b0Var;
                                    }
                                }
                            }
                        } else {
                            p1 p1Var1113 = this.D.E;
                            Long l16 = new Long(uVar.getCurrentPosition());
                            this.B = uVar;
                            this.C = 6;
                            p1Var1113.emit(l16, this);
                            if (b0Var != aVar2) {
                                wVar = this.D;
                                currentMediaItem = uVar.getCurrentMediaItem();
                                if (currentMediaItem != null) {
                                    bundle = null;
                                } else {
                                    bundle = null;
                                }
                                this.B = null;
                                this.C = 7;
                                if (w.c(wVar, bundle, this) != aVar2) {
                                    return b0Var;
                                }
                            }
                        }
                        return aVar2;
                    case 5:
                        uVar = this.B;
                        t1.O(obj);
                        p1 p1Var1114 = this.D.E;
                        Long l17 = new Long(uVar.getCurrentPosition());
                        this.B = uVar;
                        this.C = 6;
                        p1Var1114.emit(l17, this);
                        if (b0Var != aVar2) {
                            wVar = this.D;
                            currentMediaItem = uVar.getCurrentMediaItem();
                            if (currentMediaItem != null) {
                                bundle = null;
                            } else {
                                bundle = null;
                            }
                            this.B = null;
                            this.C = 7;
                            if (w.c(wVar, bundle, this) != aVar2) {
                                return b0Var;
                            }
                        }
                        return aVar2;
                    case 6:
                        uVar = this.B;
                        t1.O(obj);
                        wVar = this.D;
                        currentMediaItem = uVar.getCurrentMediaItem();
                        if (currentMediaItem != null) {
                            bundle = null;
                        } else {
                            bundle = null;
                        }
                        this.B = null;
                        this.C = 7;
                        if (w.c(wVar, bundle, this) != aVar2) {
                            return b0Var;
                        }
                        return aVar2;
                    case 7:
                        t1.O(obj);
                        return b0Var;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }
}
