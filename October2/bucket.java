public class bucket {
    private final long capacity;
    private long milk;

    public bucket() {
	capacity = 0;
	milk = 0;
    }
    public bucket(long c,long m) {
	capacity = c;
	milk = m;
    }
    public long milkIn() {
	return milk;
    }
    public void drainMilk(long amount) {
	milk -= amount;
    }
    public void pour(bucket from) {
	if(milk < capacity) {
	    if((from.milkIn() + milk) <= capacity) {
		milk += from.milkIn();
		from.drainMilk(from.milkIn());
	    }
	    else {
		from.drainMilk(capacity-milk);
		milk = capacity;
	    }
	}
    }
}
