public class DependentProject {
    @Deprecated
    public void method(int version) {
        if (version > 4) {
            throw IllegalArgumentException();
        }
    }
    public void replacement(int version) {
        if (version <= 4) {
            throw IllegalArgumentException();
        }
    }
}
