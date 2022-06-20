package decorator;

public class ClientDecorator {
    public static void main(String[] args) {

        String comment = "\n--------------------";

        Watch basicWatch = new BasicWatch();
        basicWatch.createFunctionality();
        System.out.println(comment);

        Watch sportWatch = new SportWatchDecorator(new BasicWatch());
        sportWatch.createFunctionality();
        System.out.println(comment);

        Watch luxuryWatch = new LuxuryWatchDecorator(new BasicWatch());
        luxuryWatch.createFunctionality();
        System.out.println(comment);

        Watch test = new LuxuryWatchDecorator(new SportWatchDecorator(new BasicWatch()));
        test.createFunctionality();

    }
}
