public class BmiService {
    public float calculate(float w, float h) {
        float index = w / (h * h);
        return index;
    }

}
