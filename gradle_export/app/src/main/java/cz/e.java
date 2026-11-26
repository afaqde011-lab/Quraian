package cz;

import a40.z;
import g00.b0;
import g1.m6;
import ri.t1;

public final class e extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final m6 C;
    public final u00.a D;

    public e(m6 m6Var, u00.a aVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = m6Var;
        this.D = aVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new e(this.C, this.D, cVar, 0);
            case 1:
                return new e(this.C, this.D, cVar, 1);
            case 2:
                return new e(this.C, this.D, cVar, 2);
            case 3:
                return new e(this.C, this.D, cVar, 3);
            case 4:
                return new e(this.C, this.D, cVar, 4);
            case 5:
                return new e(this.C, this.D, cVar, 5);
            case 6:
                return new e(this.C, this.D, cVar, 6);
            case 7:
                return new e(this.C, this.D, cVar, 7);
            case 8:
                return new e(this.C, this.D, cVar, 8);
            case 9:
                return new e(this.C, this.D, cVar, 9);
            case 10:
                return new e(this.C, this.D, cVar, 10);
            case 11:
                return new e(this.C, this.D, cVar, 11);
            case 12:
                return new e(this.C, this.D, cVar, 12);
            case 13:
                return new e(this.C, this.D, cVar, 13);
            case 14:
                return new e(this.C, this.D, cVar, 14);
            case 15:
                return new e(this.C, this.D, cVar, 15);
            default:
                return new e(this.C, this.D, cVar, 16);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
        }
        return ((e) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 4:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 5:
                l00.a aVar6 = l00.a.A;
                int i6 = this.B;
                if (i6 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 6:
                l00.a aVar7 = l00.a.A;
                int i7 = this.B;
                if (i7 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 7:
                l00.a aVar8 = l00.a.A;
                int i8 = this.B;
                if (i8 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 8:
                l00.a aVar9 = l00.a.A;
                int i9 = this.B;
                if (i9 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar9) {
                        return aVar9;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 9:
                l00.a aVar10 = l00.a.A;
                int i11 = this.B;
                if (i11 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar10) {
                        return aVar10;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 10:
                l00.a aVar11 = l00.a.A;
                int i12 = this.B;
                if (i12 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar11) {
                        return aVar11;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 11:
                l00.a aVar12 = l00.a.A;
                int i13 = this.B;
                if (i13 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar12) {
                        return aVar12;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 12:
                l00.a aVar13 = l00.a.A;
                int i14 = this.B;
                if (i14 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar13) {
                        return aVar13;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 13:
                l00.a aVar14 = l00.a.A;
                int i15 = this.B;
                if (i15 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar14) {
                        return aVar14;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 14:
                l00.a aVar15 = l00.a.A;
                int i16 = this.B;
                if (i16 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            case 15:
                l00.a aVar16 = l00.a.A;
                int i17 = this.B;
                if (i17 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
            default:
                l00.a aVar17 = l00.a.A;
                int i18 = this.B;
                if (i18 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (this.C.c(this) == aVar17) {
                        return aVar17;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.D.invoke();
                return b0.a;
        }
    }
}
