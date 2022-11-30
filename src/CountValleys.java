public class CountValleys {
    public static int countingValleys(int steps, String path) {
        int level = 0;
        int previousLevel = 0;
        int totalValleys = 0;
        boolean insideLevel = false;
        boolean outsideLevel = false;

        String[] arrPath = path.split("");

        for (int iCont = 0; iCont < arrPath.length; iCont++) {
            if (iCont != 0) {
                previousLevel = level;
            }

            if (arrPath[iCont].equals("D")) {
                level--;
            }
            if (arrPath[iCont].equals("U")) {
                level++;
            }

            if (level < 0 && previousLevel <= 0) {
                insideLevel = true;
            } else {
                if (level >= 0 && previousLevel < 0) {
                    outsideLevel = true;
                }
            }

            if (insideLevel && outsideLevel) {
                totalValleys++;
                insideLevel = false;
                outsideLevel = false;
            }
        }
        return totalValleys;
    }
}
