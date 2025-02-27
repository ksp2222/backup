package chap21_multithread.threads;

public class PrintThread extends Thread {
	private String threadName;
	private boolean isShutdown = false;
	
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	public boolean isShutdown() {
		return isShutdown;
	}
	public void setShutdown(boolean isShutdown) {
		this.isShutdown = isShutdown;
	} 
	
	@Override
	public void run() {
		while(true) {
			System.out.println(this.threadName + " 작업 진행");
			try {
				Thread.sleep(300);
			} catch(InterruptedException ie) {
				System.out.println(this.threadName + " shutdownNow() 호출");
				break;
			}
			
			if(isShutdown) {
				System.out.println(this.threadName + " shutdown() 호출");
				break;
			}
		}
		
	}

}
