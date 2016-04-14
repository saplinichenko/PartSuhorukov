package classColl;

public class WorkingHours {
	long timeStart;
	long timeEnd;
	long triceTimeIn;
	long triceTimeOut;
	String nameCollection;

	WorkingHours(long start, long end) {
		this.timeStart = start;
		this.timeEnd = end;
		this.triceTimeIn = 0;
		this.triceTimeOut = 0;
	}

	public void triceTimeIn() {
		triceTimeIn = timeEnd - timeStart;
	}

	public void triceTimeOut() {

		triceTimeOut = timeEnd - timeStart;

	}
}
