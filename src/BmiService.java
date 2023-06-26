public class BmiService {
    int calculate (double high, double weight) {
        double index = weight / (high * high);
        return (int) index;
    }

}
