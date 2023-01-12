public interface Son<T, V, E> {

    public V idPerson();

    public T getName();

    public E setAge();

    default String getInfo() { // метод по умолчанию
        return "Ребёнок";
    }
}
