package com.kodilla.patterns.factor.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("zakupy", "rower", 1.0);
            case PAINTING:
                return new PaintingTask("malowanie", "czarny", "samochod");
            case DRIVING:
                return new DrivingTask("jazda", "do pracy", "autobus");
            default:
                return null;
        }
    }
}
