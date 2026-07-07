package p008_oops.p008_oops_09_interface_example_02_default_method_overridden;



class Car implements Vehicle {

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}

