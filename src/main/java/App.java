public class App {
    public static void main(String[] args) {
    TowersOfHanoi towers = new TowersOfHanoi();
    int stepCount = 0;


    String stepsToSolution = towers.run(10, 1, 3);
        System.out.println("Steps:");
        for (String step: stepsToSolution.split("---")) {
            System.out.println("     " + step);
            stepCount++;
        }
        System.out.println();
        System.out.println("Num of Steps: " + stepCount);

    }
}
