public class Main {
    public static void main(String[] args) {
        String jewels = "aBC";
        String stones = "aaaAbbbBCCDDFF";
        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        String outputResult = "";
        int counter = 0;
        for (int i = 0; i < jewels.length(); i++) {
            for (int j = 0; j < stones.length(); j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    counter++;
                }

            }
            outputResult = outputResult + jewels.charAt(i) + counter;
            counter = 0;
        }
        return outputResult;
    }
}