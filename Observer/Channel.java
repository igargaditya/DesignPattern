import java.util.ArrayList;
import java.util.List;

interface Channel {
    Boolean subscribe(Subscriber newSubscriber);

    Boolean unsubscribe(Subscriber remSubscriber);

    void notifySubs();

    String getName();
}

class TweeterChannel implements Channel {
    private String name;
    private String latestTweet;
    List<Subscriber> subscribers = new ArrayList<>();

    TweeterChannel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void newTweet(String s) {
        latestTweet = s;
        notifySubs();
    }

    public String getNewTweet() {
        return latestTweet;
    }

    @Override
    public Boolean subscribe(Subscriber newSubscriber) {
        if (!subscribers.contains(newSubscriber)) {
            subscribers.add(newSubscriber);
            newSubscriber.addSubscribedTo(this);
            return true;
        }
        return false;
    }

    @Override
    public Boolean unsubscribe(Subscriber remSubscriber) {
        if (subscribers.contains(remSubscriber)) {
            subscribers.remove(remSubscriber);
            remSubscriber.removeSubscribedTo(this);
            return true;
        }
        return false;
    }

    @Override
    public void notifySubs() {
        for (Subscriber s : subscribers) {
            s.update(this);
        }
    }

}