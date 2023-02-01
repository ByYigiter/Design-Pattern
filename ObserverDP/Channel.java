package BehavioralDP.ObserverDP;

public interface Channel {

    void update(String news); // yeni haber eklemek için kulanılacak

    void printNews();
}
