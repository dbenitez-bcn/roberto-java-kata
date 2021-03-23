public class Main {

    /**
     *
     * El objetivo es tener un comparador de figuras que compara perimetro y areas
     */
    public static void main(String[] args) {
        FigureComparator comparator = new FigureComparator();

        // -1
        System.out.println(comparator.comparePerimeter(new Square(2), new Square(4)));

        // 0
        System.out.println(comparator.comparePerimeter(new Square(2), new Square(2)));

        // 1
        System.out.println(comparator.comparePerimeter(new Square(4), new Square(2)));
    }

}
