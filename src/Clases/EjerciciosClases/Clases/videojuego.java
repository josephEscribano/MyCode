package Clases.EjerciciosClases.Clases;

public class videojuego {
    private String Titulo;
    private int Horas;
    private boolean Entregado;
    private String Genero;
    private String Compañia;

    //constructor


    public videojuego() {
        this.Titulo = "God of War";
        this.Horas = 10;
        this.Entregado = false;
        this.Genero = "Hack and Slash";
        this.Compañia = "Sony Santa Monica";
    }

    public videojuego(String titulo, int horas) {
        Titulo = titulo;
        Horas = horas;
        this.Entregado = false;
        this.Genero = "Shooter";
        this.Compañia = "Activision";
    }

    public videojuego(String titulo, int horas, String genero, String compañia) {
        Titulo = titulo;
        Horas = horas;
        Genero = genero;
        Compañia = compañia;
        this.Entregado = false;
    }

    // getter and setter


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int horas) {
        Horas = horas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCompañia() {
        return Compañia;
    }

    public void setCompañia(String compañia) {
        Compañia = compañia;
    }

    public boolean isEntregado() {
        return Entregado;
    }

    //metodos

    public void Entregar(){
        this.Entregado = true;

    }

    public void Devolver(){
        this.Entregado = false;
    }

    public int compareTo(Object a){
        videojuego ref = (videojuego) a;
        int max = 0;
        if (max < ref.getHoras()){
            max = ref.getHoras();

        }

        return max;
    }


    @Override
    public String toString() {
        return "Informacion del Videojuego: " + '\n' +
                "   Titulo=" + Titulo + '\n' +
                "   Horas=" + Horas + '\n' +
                "   Genero='" + Genero + '\n' +
                "   Compañia='" + Compañia;
    }
}
