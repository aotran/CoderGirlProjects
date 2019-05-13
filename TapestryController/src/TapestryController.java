public class TapestryController {
    public TapestryController(Pattern pattern) {
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 8; i++) {
                pattern.pattern();
            }
            System.out.println();
        }

        System.out.println("\n\n");

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < 6; i++) {
                pattern.pattern();
            }
            System.out.println();
        }

        System.out.println("\n\n");
    }
}
