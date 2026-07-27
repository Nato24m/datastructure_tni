import java.util.LinkedList;

public class BrowserHistory {

    public static void main(String[] args) {

        LinkedList<String> history = new LinkedList<String>();

        // 1-3
        history.add("google.com");
        history.add("youtube.com");
        history.add("github.com");

        // 4
        System.out.println(history);

        // 5
        history.removeLast();

        // 6
        System.out.println(history);

        // 7-9
        history.add("shopee.com");
        history.add("wikipedia.org");
        history.add("claude.ai");

        // 10
        System.out.println(history);

        // 11
        history.remove("youtube.com");

        // 12
        System.out.println(history);

        // 13
        System.out.println("current page = " + history.getLast());

        // 14
        System.out.println("Visited youtube.com = " + history.contains("youtube.com"));

        // 15
        System.out.println("Go back to previous page = " + history.get(history.size() - 2));

        // 16
        System.out.println("Go back to previous page again = " + history.get(history.size() - 3));

        // 17
        history.clear();

        // 18
        System.out.println(history);

    }

}