public class RealDoughter<T, V, E> implements Doughter<T, V, E> {

    T name;
    V id;
    E age;

    RealDoughter(T o1, V o2, E o3) {
        name = o1;
        id = o2;
        age = o3;
    }

    @Override
    public V idPerson() {
        return id;
    }

    @Override
    public T getName() {
        return name;
    }

    @Override
    public E setAge() {
        return age;
    }

    @Override
    public String getInfo() {
        return "Дочь";
    }

}
