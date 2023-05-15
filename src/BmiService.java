public class BmiService {
    public int calculate (double height, int weight){
        double index = weight / (height*height); // Формула расчета BIM индекса
        return (int) index;
    }
}
