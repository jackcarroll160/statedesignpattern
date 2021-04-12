package statedesignpattern;

/**
 * TV Class for State Design Pattern
 * @author Jackson Carroll
 */
public class TV {
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state;

    /**
     * Default Constructor
     * Sets the state variables and state
     */
    public TV() {
        this.HomeState = new HomeState(this);
        this.NetflixState = new NetflixState(this);
        this.HuluState = new HuluState(this);
        this.state = HomeState;
    }

    /**
     * Calls the press home button on the state variable
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * Calls the press Netflix button on the state variable
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Calls the press Hulu button on the state variable
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Calls the press movie button on the state variable
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * Calls the press tv button on the state variable
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * Sets the state
     * @param state State for the type of state 
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Returns the Home State
     * @return HomeState
     */
    public State getHomeState() {
        return this.HomeState;
    }

    /**
     * Returns the Netflix State
     * @return NetflixState
     */
    public State getNetflixState() {
        return this.NetflixState;
    }

    /**
     * Returns the Hulu State
     * @return HuluState
     */
    public State getHuluState() {
        return this.HuluState;
    }

}
