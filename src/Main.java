public class Main {
    public static void main(String[] args) {
        int projectVersion = 3;

        Build build = buildProject();
        build.select(2);

        DependentProject.method(projectVersion);

        System.out.println("Success");
    }

    public static Build buildProject() {
        return new Build();
    }
}