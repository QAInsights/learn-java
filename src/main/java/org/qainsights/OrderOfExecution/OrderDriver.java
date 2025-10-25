package org.qainsights.orderofexecution;

public class OrderDriver {
    static void main() {
        OrderOfExecutionTester orderOfExecutionTester = new OrderOfExecutionTester("Testing");
        System.out.println(orderOfExecutionTester.getName());
    }
}
