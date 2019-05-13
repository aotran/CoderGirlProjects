public class BlockyBaublePattern extends Pattern {
    public BlockyBaublePattern() {
    }

    @Override
    public void pattern() {
        BlockStitch b = new BlockStitch();
        ShortLineStitch s = new ShortLineStitch();
        CircleStitch c = new CircleStitch();


        boolean needleJam = (Math.random() < 0.10d);

        for (int i = 0; i < (needleJam ? 1 : 3); i++) {
            b.sew();
            s.sew();
            s.sew();
            c.sew();
            s.sew();
            s.sew();
        }
    }
}
