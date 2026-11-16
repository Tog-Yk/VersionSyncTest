public class DependentProject {
    public static void replacement(int version) {
        if (version <= 4) {
            throw new IllegalArgumentException();
        }
    }
}
