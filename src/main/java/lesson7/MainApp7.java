package lesson7;

public class MainApp7 {


    public static void main (String[] args) throws IllegalAccessException {

        Graph cities = new Graph(10);

        cities.addVertex("Москва");
        cities.addVertex("Тула");
        cities.addVertex("Липецк");
        cities.addVertex("Воронеж");
        cities.addVertex("Рязань");
        cities.addVertex("Тамбов");
        cities.addVertex("Саратов");
        cities.addVertex("Калуга");
        cities.addVertex("Орел");
        cities.addVertex("Курск");

        cities.addEdge("Москва", "Тула", 182);
        cities.addEdge("Тула", "Липецк", 295);
        cities.addEdge("Липецк", "Воронеж", 124);
        cities.addEdge("Москва", "Рязань", 199);
        cities.addEdge("Рязань", "Тамбов", 291);
        cities.addEdge("Тамбов", "Саратов", 384);
        cities.addEdge("Саратов", "Воронеж", 515);
        cities.addEdge("Москва", "Калуга", 197);
        cities.addEdge("Калуга", "Орел", 210);
        cities.addEdge("Орел", "Курск", 161);
        cities.addEdge("Курск", "Воронеж", 222);

        System.out.println(cities.dfs("Москва", "Воронеж"));
    }
}
