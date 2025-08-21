package Com_PlayersGuide_KiersStefan.Challenge_22;

/*
Stefan Kiers
20-08-2025

wait # seconds method for countdown in hunting manticore run after clearing console.
 */

public class ThreadCountdown {
    public static void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        }catch (InterruptedException e){
            System.out.println("Thread interupted");
            Thread.currentThread().interrupt();
        }
    }
}
