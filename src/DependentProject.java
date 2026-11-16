public class DependentProject {
    @Deprecated
    public static void method(int version) {
        if (version > 4) {
            throw new IllegalArgumentException();
        }
    }
    public static void replacement(int version) {
        if (version <= 4) {
            throw new IllegalArgumentException();
        }
    }
}
