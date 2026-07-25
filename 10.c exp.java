class DataContainer<T> {
    private T data;

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

public class GenericContainer {

    public static <T> void display(T value) {
        System.out.println("Value : " + value);
    }

    public static <T extends Number> double square(T number) {
        return number.doubleValue() * number.doubleValue();
    }

    public static void main(String[] args) {

        DataContainer<Integer> intData = new DataContainer<>();
        intData.setData(25);

        DataContainer<String> strData = new DataContainer<>();
        strData.setData("Mukesh");

        System.out.println("Integer Data : " + intData.getData());
        System.out.println("String Data : " + strData.getData());

        display(intData.getData());
        display(strData.getData());

        System.out.println("Square of Integer : " + square(5));
        System.out.println("Square of Double : " + square(7.5));
    }
}
