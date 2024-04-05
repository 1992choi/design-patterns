package org.example.designpatterns._03_behavioral._17_mediator._01_before;

public class Gym {

    private CleaningService cleaningService;

    public void clean() {
        cleaningService.clean(this);
    }

}
