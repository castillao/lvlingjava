package practices;

public class LoopingGasStations {
    public int getNextStation(int currentIndex, int arrayLength){
        if (currentIndex+1 >= arrayLength) {
            return 0;
        }
        return currentIndex+1;
    }
}
