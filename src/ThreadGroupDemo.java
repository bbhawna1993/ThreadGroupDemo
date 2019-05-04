
public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//SSince this line of creating the thread group is executed by main thread
		//therefore,it becomes the child group of main thread group.
		ThreadGroup g=new ThreadGroup("first group");
		System.out.println(g.getParent().getName());
	}

}
