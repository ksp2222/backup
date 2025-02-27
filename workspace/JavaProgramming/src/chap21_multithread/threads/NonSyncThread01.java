package chap21_multithread.threads;

public class NonSyncThread01 extends Thread {
	private PrintNumWithoutSync pnws;
	
	public void setPnws(PrintNumWithoutSync pnws) {
		this.pnws = pnws;
	}
	
	public PrintNumWithoutSync getPnws() {
		return this.pnws;
	}
	
	@Override
	public void run() {
		pnws.printNum1(10);
	}
	
}