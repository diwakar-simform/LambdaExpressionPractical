//  Lambda Expressions - Practical

@FunctionalInterface
interface Qoutes {
    String todaysQoutes(String s);
}

// Main Class
public class TodaysThoughts {

    public static void main(String[] args) {

        // Using Lambda expression to call the method by passing parameters
        Qoutes q = (myStr)->{
            String str = "Time is Precious";
            return myStr + str;
        };

        System.out.println(q.todaysQoutes("Today's Thought :  "));
    }

}