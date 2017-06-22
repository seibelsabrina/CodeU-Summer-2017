// Where should this file go?

public class Threader {
	public static void main(String[] args) {
        Snapshotter snap = new Snapshotter();
        Thread thread = new Thread(snap);
        thread.start();
    }
}