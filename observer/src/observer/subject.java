package observer;

public abstract class subject {
	abstract void register(observer o);
	abstract void unregister(observer o);
	abstract void notifyobservers();

}
