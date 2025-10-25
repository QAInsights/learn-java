package org.qainsights.orderofexecution;

public class OrderOfExecutionTester {

    private final String name;

    public OrderOfExecutionTester(String name) {
        System.out.println("Constructors initializing");
        this.name = name;
        {
            System.out.println("Instantiating OrderOfExecutionTester");
        }
    }

    public String getName() {
        return name;
    }

}
