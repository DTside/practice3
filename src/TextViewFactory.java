public class TextViewFactory implements ViewFactory {
    @Override
    public ResultView createView() {
        return new TextResultView();
    }
}