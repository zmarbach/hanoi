public class TowersOfHanoi {

    public String run(int numDisks, int fromPeg, int toPeg) {
        //base case
        if (numDisks == 1){
            return "Top disk on peg " + fromPeg + " to peg " + toPeg + "---";
        }

        else {
            String solution1 = "";
            String solution2 = "";
            String solution3 = "";
            int otherPeg = 6 - toPeg - fromPeg;

            solution1 = run(numDisks - 1, fromPeg, otherPeg);
            solution2 = "Top disk on peg " + fromPeg + "to peg" + toPeg + "---";
            solution3 = run(numDisks - 1, otherPeg, toPeg);

            return solution1 + solution2 + solution3;
        }
    }
}
