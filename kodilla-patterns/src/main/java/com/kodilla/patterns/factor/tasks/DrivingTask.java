package com.kodilla.patterns.factor.tasks;

public class DrivingTask implements Task {
    private final String taskName;
    private final String where;
    private final String using;
    private boolean done = false;

    public DrivingTask(final String taskName, final String where, final String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        done = true;
        return "Zadanie: " + taskName + ", Srodek transportu: " + using + ", Gdzie: " + where;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }
}
