package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Graph {

    private final List<Vertex> vertexList;
    private final int[][] adjMatrix;
    private Integer weight;

    public Graph(int maxVertexCount) {
        this.vertexList = new ArrayList<>(maxVertexCount);
        this.adjMatrix = new int[maxVertexCount][maxVertexCount];
    }

    public void addVertex(String label) {
        vertexList.add(new Vertex(label));
    }

    public Integer addEdge(String startLabel, String secondLabel, Integer weight) {
        int startIndex = indexOf(startLabel);
        int endIndex = indexOf(secondLabel);

        if (startIndex == -1 || endIndex == -1) {
            return weight = 0;
        }
        adjMatrix[startIndex][endIndex] = weight;
        return weight;
    }

    private int indexOf(String label) {
        for (int i = 0; i < vertexList.size(); i++) {
            if (vertexList.get(i).getLabel().equals(label)) {
                return i;
            }
        }
        return  -1;
    }

    public int getSize() {
        return vertexList.size();
    }
    public void display() {
        System.out.println(this);
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getSize(); i++) {
            sb.append(vertexList.get(i));
            for (int j = 0; j < getSize(); j++) {
               if (adjMatrix[i][j]) {// Idea подчеркивает как ошибку - код с урока
                    sb.append("->").append(weight).append("->").append(vertexList.get(j));
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

     public int dfs(String startLabel, String secondLabel) throws IllegalAccessException {//добавила конечную точку маршрута в параметры
        int startIndex = indexOf(startLabel);
        int endIndex = indexOf(secondLabel);
        int way = 0;//для хранения расстояния по пройденой ветке
        int minWay = 0;//для хранения минимального расстояния

        if (startIndex == -1) {
            throw new IllegalAccessException("Неверная вершина " + startLabel);
        }
        Stack<Vertex> stack = new Stack<>();
        Vertex vertex = vertexList.get(startIndex);

        visitVertex(stack, vertex);
        while (!stack.isEmpty()) {
            vertex = getNearUnvisitedVertex(stack.peek());
            way = way + weight;
            if (vertex == vertexList.get(endIndex)) {
                if(way < minWay) { minWay = way;}
                stack.pop();
            } else  {
                visitVertex(stack, vertex);
            }
        }
         return way;
     }

    private Vertex getNearUnvisitedVertex(Vertex vertex) {
        int currentIndex = vertexList.indexOf(vertex);

        for (int i = 0; i < getSize(); i++) {
            if(adjMatrix[currentIndex][i]  && !vertexList.get(i).isVisited()) {//трока из кода данного на уроке - почему ошибка?
                return vertexList.get(i);
            }
        }
        return null;
    }


    private void visitVertex(Stack<Vertex> stack, Vertex vertex) {
        System.out.println(vertex.getLabel() + " ");
        stack.push(vertex);
        vertex.setVisited(true);
    }
}
