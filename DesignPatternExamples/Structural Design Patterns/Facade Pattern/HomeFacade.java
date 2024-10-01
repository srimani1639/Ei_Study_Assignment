public class HomeFacade {
    private Lights lights;
    private AirConditioner ac;

    public HomeFacade() {
        lights = new Lights();
        ac = new AirConditioner();
    }

    public void leaveHome() {
        lights.off();
        ac.off();
        System.out.println("You have left the home.");
    }

    public void arriveHome() {
        lights.on();
        ac.on();
        System.out.println("Welcome home!");
    }
}
