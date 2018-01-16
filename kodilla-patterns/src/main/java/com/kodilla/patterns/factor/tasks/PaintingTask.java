package com.kodilla.patterns.factor.tasks;

public class PaintingTask implements Task {
    private final String taskName;
    private final String colour;
    private final String whatToPaint;
    private boolean done = false;

    public PaintingTask(String taskName, String colour, String whatToPaint) {
        this.taskName = taskName;
        this.colour = colour;
        this.whatToPaint = whatToPaint;
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        done=true;
        return "Zadanie: " + taskName + ", Kolor: " + colour +", Malujemy: "+ whatToPaint;
    }

    @Override
    public boolean isTaskExecuted() {
        return done;
    }
}
