package org.example.enums;

public class GenderClassBasedEnum {

}

class JobType { // FREELANCE, FULLTIME
    private final String displayName;
    public static JobType FREELANCE = Freelance.INSTANCE;
    public static JobType FULLTIME = Fulltime.INSTANCE;

    public String getDisplayName() {
        return displayName;
    }

    JobType(String displayName) {this.displayName = displayName;}

    public static void main(String[] args) {
        System.out.println(JobType.FREELANCE);
        System.out.println(JobType.FULLTIME);
    }
}

class Freelance extends JobType {
    public static final Freelance INSTANCE = new Freelance();
    private Freelance() {
        super("Freelance");
    }
}
class Fulltime extends JobType {
    public static final Fulltime INSTANCE = new Fulltime();
    private Fulltime() {
        super("Full-time");
    }
}
