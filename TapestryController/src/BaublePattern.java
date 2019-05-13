public class BaublePattern extends Pattern {
    public BaublePattern() {
    }

    @Override
    public void pattern() {
        ShortLineStitch s = new ShortLineStitch();
        CircleStitch c = new CircleStitch();

        for (int i = 0; i < 5; i++) {
            s.sew();
            s.sew();
            c.sew();
        }
    }
}
