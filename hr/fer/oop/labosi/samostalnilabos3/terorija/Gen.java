package hr.fer.oop.labosi.samostalnilabos3.terorija;

public class Gen <T>{
    List<Gen<Integer>> lgi;
    //Integer <Gen> ig; -------- INTEGER NIJE PARAMETRIZIRAN
    //Gen<double> gd; ------ NE MOŽE BITI PRIMITIVNOG TIPA
    Gen<List<Integer>> gli;
    Gen<Integer> gi;


    Gen<Gen<Gen<Gen<Integer>>>> gggg;
    //List<Gen<int>> lgi; ----------- PRIMITIVAC
    Gen<List<Gen<List<Integer>>>> glgl;
    Map<Gen<Integer>, Gen<Double>> map;


    <V> void m4(T t, Gen<Gen<V>> v){}
    //static MyList<T> list; -------> ne može se referencirati iz non static contexta
    static <V> void m(MyList<V> list) {}
    MyList<MyList<T>> listOfList;
    T obj1;


    T m(T t){
        System.out.println(t.toString());
//        return (T[]) new Object[10]; ---------> vraća array umjesto T
//        t = (T[]) new Object[10]; --------> ---------> vraća array umjesto T
//        return new T(); ---------> ne može se direktno instancirati
        return t;
    }

    <V> void metoda(T t, Gen<Gen<V>> v){
        /*T[] arr = new T[50];
        T[] arr1 = new T[];
        T[] arr2 = new Object<T>[50];
        T[] arr3 = (Object[]) new T[50];*/
        T[] arr4 = (T[]) new Object[50];

    }
}
