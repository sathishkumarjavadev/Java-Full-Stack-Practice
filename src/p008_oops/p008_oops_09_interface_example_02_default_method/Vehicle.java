package p008_oops.p008_oops_09_interface_example_02_default_method;

public interface Vehicle {

	void start();
	default void stop() {
		System.out.println("Vehicle Stopped");
	}
}
