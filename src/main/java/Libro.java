public class Libro {

    private int numPages;

    public void setNumPages(int numPages) {
        numPages = this.numPages;
    }

    public void imprimir() {
        System.out.println(numPages);
    }

    public static void main(String[] args) {
        Libro libro = new Libro();

        libro.setNumPages(150);

        libro.imprimir();
    }
}
