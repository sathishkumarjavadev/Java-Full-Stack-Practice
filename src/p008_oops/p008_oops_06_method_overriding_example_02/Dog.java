package p008_oops.p008_oops_06_method_overriding_example_02;

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Bark");
    }
}