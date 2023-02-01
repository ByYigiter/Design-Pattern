package BehavioralDP.ObserverDP;

public class ObserverRunner {

    public static void main(String[] args) {
        ObserverRunner runner = new ObserverRunner();
        runner.observerDemo();
    }

    void observerDemo() {
        Channel channel1  = new NewsChannel();
        Channel channel2  = new NewsChannel();
        Channel channel3  = new NewsChannel();

        NewsAgency agency   = new NewsAgency();

        agency.addObserver(channel2);
        agency.addObserver(channel1);
        agency.addObserver(channel3);

        agency.sendNews("Java dili artık kolay mı?");
        agency.sendNews("SpringBoot artık  kolay mı?");
        agency.sendNews("Spring Security sac beyazlatır");

        System.out.println("Channel 1 haberler :");
        channel1.printNews();
        System.out.println("**".repeat(50));
        System.out.println("Channel 2 haberler :");
        channel2.printNews();
        System.out.println("**".repeat(50));
        System.out.println("Channel 3 haberler :");
        channel3.printNews();
        System.out.println("**".repeat(50));


    }
}
