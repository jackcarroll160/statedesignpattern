package statedesignpattern;

/**
 * Class for Netflix State implementing State interface
 * @author Jackson Carroll
 */
public class NetflixState implements State {
    private TV tv;

    /**
     * Parameterized Constructor taking in a TV then setting it to the local variable
     * @param tv a TV for the state
     */
    public NetflixState(TV tv) {
        this.tv = tv;
    }

    /**
     * Displays loading home screen message for pressing home button in netflix.
     * Assures state is in Home state
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    /**
     * Displays already in netflix message
     * Assures state is in Netflix state
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Displays loading Hulu button for switching state
     * Assures state switches to Hulu
     */
    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    /**
     * Loops and displays Netflix movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        String[] netflixMovieList = {"Sharknado", "Sharknado 2: The Second One", "Sharknado 3: Oh Hell No!", "Sharknado: The 4th Awakens", "Sharknado 5: Global Swarming"};
        for(int i = 0; i < netflixMovieList.length; i++)
            System.out.println(" - " + netflixMovieList[i]);
        System.out.println();
    }

    /**
     * Loops and displays Netflix TV shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        String[] netflixTVShowList = {"Breaking Bad", "Lucifer", "Shameless", "Outlander", "Better Call Saul"};
        for(int i = 0; i < netflixTVShowList.length; i++)
            System.out.println(" - " + netflixTVShowList[i]);
        System.out.println();
    }
}
