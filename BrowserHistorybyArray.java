public class BrowserHistorybyArray {
    String[] history;
    int current;
    int last;

    public BrowserHistory(String homepage) {
        history = new String[5000];
        history[0] = homepage;
        current = 0;
        last = 0;
    }

    public void visit(String url) {
        current++;
        history[current] = url;
        last = current;
    }

    public String back(int steps) {
        while (steps > 0 && current > 0) {
            current--;
            steps--;
        }
        return history[current];
    }

    public String forward(int steps) {
        while (steps > 0 && current < last) {
            current++;
            steps--;
        }
        return history[current];
    }


