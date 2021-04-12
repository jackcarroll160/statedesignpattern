package statedesignpattern;

/**
 * Class for the Hulu State implementing State interface
 * @author Jackson Carroll
 */
public class HuluState implements State {
    private TV tv;

    /**
     * Parameterized Constructor for HuluState class
     * @param tv a TV for the states 
     */
    public HuluState(TV tv) {
        this.tv = tv;
    }

    /**
     * Displays loading home screen message for pressing home button
     */
    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        tv.setState(tv.getHomeState());
    }

    /**
     * Displays loading Netflix message for pressing Netflix button
     */
    @Override
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        tv.setState(tv.getNetflixState());
    }

    /**
     * Displays already in hulu message for pressing Hulu button
     */
    @Override
    public void pressHuluButton() {
        System.out.println("We are already in Hulu...");
        tv.setState(tv.getHuluState());
    }

    /**
     * Loops through and displays Hulu movies
     */
    @Override
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        String[] huluMovieList = {"Stuff"};
        for(int i = 0; i < huluMovieList.length; i++)
            System.out.println(" - " + huluMovieList[i]);
        System.out.println();
    }

    /**
     * Loops through and displays Hulu TV shows
     */
    @Override
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        String[] huluTVShowList = {"Rick and Morty", "The Big Bang Theory", "Solar Opposites", "Young Sheldon", "Guy's Grocery Games"};
        for(int i = 0; i < huluTVShowList.length; i++)
            System.out.println(" - " + huluTVShowList[i]);
        System.out.println();
    }
}
