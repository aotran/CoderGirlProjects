public class BrokenWigglePattern extends Pattern {
    public BrokenWigglePattern() {
    }

    @Override
    public void pattern() {
        SmallCrossStitch s = new SmallCrossStitch();
        LargeCrossStitch l = new LargeCrossStitch();

        // 40% failure -- causes only half of pattern to print
        boolean needleJam = (Math.random() < 0.40d);

        for(int i = 0; i < (needleJam ? 3 : 5); i++) {
              s.sew();
              l.sew();
        }
    }
}

