package g30;

public final class k {
    EF1("Unresolved type for %s", true),
    EF2("Unresolved type parameter type", true),
    EF3("Unresolved class %s", true),
    C("Unresolved java class %s", true),
    EF5("Unresolved declaration %s", true),
    D("Unresolved type for %s (arrayDimensions=%s)", true),
    EF7("Unresolved type alias %s", false),
    EF8("Return type for %s cannot be resolved", false),
    E("Return type for function cannot be resolved", false),
    EF10("Return type for property %s cannot be resolved", false),
    EF11("Return type for constructor %s cannot be resolved", false),
    EF12("Implicit return type for function %s cannot be resolved", false),
    EF13("Implicit return type for property %s cannot be resolved", false),
    EF14("Implicit return type for property accessor %s cannot be resolved", false),
    EF15("%s() return type", false),
    EF1("Recursive type", false),
    F("Recursive type alias %s", false),
    EF1("Recursive annotation's type", false),
    G("Cyclic upper bounds", false),
    H("Cyclic supertypes", false),
    EF2("Cannot infer a lambda context receiver type", false),
    I("Cannot infer a lambda parameter type", false),
    J("Cannot infer a type variable %s", false),
    EF1("Resolution error type (%s)", false),
    EF2("Error expected type", false),
    EF1("Error type for data flow", false),
    EF2("Failed to reconstruct type %s", false),
    K("Unable to substitute type (%s)", false),
    L("Special DONT_CARE type", false),
    EF1("Stub type %s", false),
    EF2("Function placeholder type (arguments: %s)", false),
    EF1("Error type for a compiler exception while analyzing %s", false),
    M("Error java flexible type with id %s. (%s..%s)", false),
    N("Error raw type %s", false),
    EF2("Inconsistent type %s (parameters.size = %s, arguments.size = %s)", false),
    EF1("Illegal type range for dynamic type %s..%s", false),
    O("Unknown type parameter %s. Please try recompiling module containing \"%s\"", false),
    P("Couldn't deserialize type parameter %s in %s", false),
    Q("Inconsistent suspend function type in metadata with constructor %s", false),
    EF1("Unexpected id of a flexible type %s. (%s..%s)", false),
    R("Unknown type", false),
    EF1("No type specified for %s", false),
    EF2("Loop range has no type", false),
    EF1("Loop parameter has no type", false),
    EF2("Missed a type for a value parameter %s", false),
    S("Missed a type argument for a type parameter %s", false),
    EF2("Error type for parse error argument %s", false),
    EF1("Error type for star projection directly passing as a call type argument", false),
    EF2("Dynamic type in a not allowed context", false),
    EF1("Not an annotation type %s in the annotation context", false),
    EF2("Unit type returned by inc or dec", false),
    EF1("Return not allowed", false),
    EF2("Unresolved 'Parcel' type", true),
    EF0("Kapt error type", false),
    EF1("Error type for synthetic element", false),
    EF0("Error type in ad hoc resolve for lighter classes", false),
    EF1("Error expression type", false),
    EF0("Error receiver type for %s", false),
    T("Error constant value %s", false),
    EF0("Empty callable reference", false),
    EF1("Unsupported callable reference type %s", false),
    EF0("Error delegation type for %s", false),
    EF1("Type is unavailable for declaration %s", false),
    EF0("Error type parameter", false),
    EF1("Error type projection", false),
    EF0("Error super type", false),
    EF1("Supertype of error type %s", false),
    U("Error property type", false),
    V("Error class", false),
    W("Type for error type constructor (%s)", false),
    X("Intersection of error types %s", false),
    Y("Cannot compute erased upper bound of a type parameter %s", false),
    Z("Unsigned type %s not found", false),
    a0("Not found the corresponding enum class for given enum entry %s.%s", false),
    b0("Not found recorded type for %s", false),
    EF0("Descriptor not found for function %s", false),
    EF1("Cannot build class type, descriptor not found for builder %s", false),
    EF0("Cannot build type parameter type, descriptor not found for builder %s", false),
    c0("Type for unmapped Java annotation target to Kotlin one", false),
    d0("Unknown type for an array element of a java annotation argument", false),
    e0("No fqName for annotation %s", false),
    EF1100("No fqName for %s", false),
    EF1113("Type for generated error expression", false);

    public final String A;
    public final boolean B;

    static {
        f50.c.v(kVarArr);
    }

    public k(String str, boolean z) {
        super(str, i);
        this.A = str;
        this.B = z;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f0.clone();
    }
}
