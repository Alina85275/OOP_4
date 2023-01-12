public interface Doughter<T, V, E> {

    public V idPerson();

    public T getName();

    public E setAge();

    default String getInfo() { // метод по умолчанию
        return "Ребёнок";
    }

    static String getFamily() { // статический метод
        return "Семья Щербаковых";
    }
}
