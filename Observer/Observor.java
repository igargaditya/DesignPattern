public class Observor {
    public static void main(String[] args) {
        User user1 = new User("Aditya");
        User user2 = new User("Ashish");
        TweeterChannel sidemen = new TweeterChannel("Sidemen");
        TweeterChannel betaSquad = new TweeterChannel("Beta Squad");
        user1.subscribed(sidemen);
        user1.subscribed(sidemen);
        user1.subscribed(betaSquad);

        user2.subscribed(betaSquad);

        sidemen.newTweet("KSI has left the Sidemen");
        betaSquad.newTweet("Nico would like to join Sidemen");

        user1.unsubscribed(sidemen);
        sidemen.newTweet("No Niko you wont");
        user2.subscribed(sidemen);

        betaSquad.newTweet("Okay ya Fools");
        sidemen.newTweet("See ya");

    }
}
