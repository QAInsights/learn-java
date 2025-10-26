package org.qainsights.mathtable;

public class MathTable {

    private int tableNumber;
    private int numberOfRows;

    public MathTable(int tableNumber, int numberOfRows) {
        if (tableNumber > 0)
            this.tableNumber = tableNumber;
        if (numberOfRows > 0)
            this.numberOfRows = numberOfRows;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public void displayTables() {
        if (tableNumber > 0 && numberOfRows > 0)
            for (int i = 1; i <= numberOfRows; i++) {
                System.out.println((i) + "*" + tableNumber + "=" + (i * tableNumber));
            }
        else
            System.out.println("Invalid values.");
    }

}
