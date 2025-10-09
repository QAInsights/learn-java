package org.qainsights.OrderOfExecution;

public class OrderOfExecutionTester {

    private final String name;

    public OrderOfExecutionTester(String name) {
        IO.println("Constructors initializing");
        this.name = name;
        {
            IO.println("Instantiating OrderOfExecutionTester");
        }
    }

    public String getName() {
        return name;
    }

}
