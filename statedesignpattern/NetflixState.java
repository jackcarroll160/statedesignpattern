package statedesignpattern;

public class NetflixState implements State {
    private TV tv;

    public NetflixState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        tv.setState(tv.getHomeState());
    }

    @Override
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
        tv.setState(tv.getNetflixState());
    }

    @Override
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        tv.setState(tv.getHuluState());
    }

    @Override
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        String[] netflixMovieList = {"Sharknado", "Sharknado 2: The Second One", "Sharknado 3: Oh Hell No!", "Sharknado: The 4th Awakens", "Sharknado 5: Global Swarming"};
        for(int i = 0; i < netflixMovieList.length; i++)
            System.out.println(" - " + netflixMovieList[i]);
        System.out.println();
    }

    @Override
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        String[] netflixTVShowList = {"Breaking Bad", "Lucifer", "ADD ANOTHER SHOW", "ADD ANOTHER SHOW", "ADD ANOTHER SHOW"};
        for(int i = 0; i < netflixTVShowList.length; i++)
            System.out.println(" - " + netflixTVShowList[i]);
        System.out.println();
    }
}
