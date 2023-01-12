public class GeoThree {
    public static void main(String[] args) {
        String family = Doughter.getFamily();
        System.out.println(family);
        RealDoughter<String, Integer, Integer> doughter = new RealDoughter<>("Щербакова Дарья", 1, 23);
        System.out.println(doughter.idPerson());
        System.out.println(doughter.getInfo());
        System.out.println(doughter.getName());
        System.out.println("Возраст: " + doughter.setAge());
        RealSon<String, Integer, Integer> son = new RealSon<>("Щербаков Максим", 2, 19);
        System.out.println(son.idPerson());
        System.out.println(son.getInfo());
        System.out.println(son.getName());
        System.out.println("Возраст: " + son.setAge());
    }
}