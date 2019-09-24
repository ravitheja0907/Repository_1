package aug_12b;

public interface Bus {

	void move();
	default void turn()
	{
		System.out.println("Turning bus");
	}
	
	static void changeGear()
	{
		System.out.println("changing bus gear");

	}
}
