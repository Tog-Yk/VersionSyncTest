public class Main {
    public static void main(String[] args) {
        int projectVersion = 5;

        Build build = buildProject();

        System.out.println("Success");
    }

    public static Build buildProject() {
        return new Build();
    }
}