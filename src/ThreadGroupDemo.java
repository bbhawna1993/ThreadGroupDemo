
public class ThreadGroupDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		System.out.println(Thread.currentThread().getThreadGroup().getName());
		//		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		//SSince this line of creating the thread group is executed by main thread
		//therefore,it becomes the child group of main thread group.
		//creating thread group with its constructors.
		ThreadGroup g=new ThreadGroup("child thread group");
		System.out.println(g.getName());
		System.out.println(g.getParent().getName());

		//g1 is the child of g.
		//g's name is child thread group
		//g1's name is sub child group.
		ThreadGroup g1=new ThreadGroup(g,"sub child group");
		System.out.println(g1.getName());
		System.out.println(g1.getParent().getName());
	}

}
