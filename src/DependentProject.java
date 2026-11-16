public class DependentProject {
    @Deprecated
    public static void method(int version) {
        if (version > 4) {
            throw new IllegalArgumentException();
        }
    }
}
