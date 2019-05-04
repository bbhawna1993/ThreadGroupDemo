
public class ThreadGroupMethods {

	public static void main(String[] args)
	{
		ThreadGroup g=new ThreadGroup("Parent thread group");
		//t1 and t2's priority is 5 by default 
		Thread t1=new Thread(g,"thread-1");
		Thread t2=new Thread(g,"thread-2");

		System.out.println(g.getMaxPriority());
		g.setMaxPriority(3);

		/*after setting the priority of the thread group,
		the priority of newly added threads will change and previous
		thread's priority will remain as it was.
		 */

		Thread t3=new Thread(g,"thread-3");
		System.out.println(t3.getPriority());//3
		System.out.println(t1.getPriority());//5
		System.out.println(t2.getPriority());//5

		System.out.println(g.activeCount());
		ThreadGroup g1=new ThreadGroup(g,"child group");
		Thread t4=new Thread(g1,"thread-4");
		Thread t5=new Thread(g1,"thread-5");

		System.out.println(g.activeGroupCount());
		g.list();



	}
}
