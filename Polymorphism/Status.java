public class Status {
    private String name;
    private int duration;

    public Status(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public void decreaseDuration() {
        if (duration > 0) {
            duration--;
        }
    }
}
