public class ServerNameGenerator {
    private static String[] adj = {"radical", "tubular", "gnarly", "wicked", "groovy", "bland", "juicy", "wild", "spicy", "worked"};
    private static String[] noun = {"wombat", "panda", "kangaroo", "koala", "opossum", "birthday", "highway", "night", "recipe", "guitar"};

    private static String randomElement(String[] strings) {
        int randomNum = (int) (Math.random() * strings.length);
        return strings[randomNum];
    }

    public static String makeServerName(String[] arr1, String[] arr2) {
        String adj = randomElement(arr1);
        String noun = randomElement(arr2);
        return adj + "-" + noun;
    }

    public static void main(String[] args) {
        System.out.println("Your server name is: ");
        System.out.println(makeServerName(adj, noun));
        System.out.println("Here are a few more names you might like:");
        for (int i = 0; i < 3; i++) {
            System.out.println(makeServerName(adj, noun));
        }
    }
}
