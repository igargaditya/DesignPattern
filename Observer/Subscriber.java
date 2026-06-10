import java.util.ArrayList;
import java.util.List;

interface Subscriber {
    void update(TweeterChannel tweeterChannel);

    void addSubscribedTo(TweeterChannel tweeterChannel);

    void removeSubscribedTo(TweeterChannel tweeterChannel);

}

class User implements Subscriber {
    private String name;

    List<Channel> subscribedTo = new ArrayList<>();

    User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void subscribed(TweeterChannel channel) {
        Boolean subscribed = channel.subscribe(this);
        if (subscribed)
            System.out.println("User - " + name + " Subscring To Channel - " + channel.getName());

    }

    public void unsubscribed(TweeterChannel channel) {
        Boolean unsubscribed = channel.unsubscribe(this);
        if (unsubscribed)
            System.out.println("User - " + name + " UnSubscring To Channel - " + channel.getName());
    }

    @Override
    public void addSubscribedTo(TweeterChannel channel) {
        subscribedTo.add(channel);
    }

    @Override
    public void removeSubscribedTo(TweeterChannel channel) {
        subscribedTo.remove(channel);
    }

    @Override
    public void update(TweeterChannel channel) {
        System.out.println(
                "Notification for " + name + " - " + channel.getName() + " recently tweeted " + channel.getNewTweet());
    }

}