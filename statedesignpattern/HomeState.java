package statedesignpattern;

/**
 * Class for the HomeState implementing from State interface
 * @author Jackson Carroll
 */
public class HomeState implements State {
    private TV tv;

    /**
     * Parameterized Constructor for HomeState class
     * @param tv a tv of type TV
     */
    public HomeState(TV tv) {
        this.tv = tv;
    }

    /**
     * Displays TV is already on home screen and sets the state
     */
    @Override
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * Displays that Netflix is loading and changes the state to Netflix
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Displays that Hulu is loading and changes the state to Hulu
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Display for home state printing an app must be selected to display movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");
    }

    /**
     * Display for TV state printing an app must be selected to display tv shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Home: You must pick an app to show tv shows.");
    }
}
