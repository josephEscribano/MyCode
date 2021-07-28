package Clases.EjerciciosClases.Clases;

public class serie {
    private String Titulo;
    private int Temporadas;
    private boolean Entregado;
    private String Genero;
    private String Creador;


    // constructor


    public serie() {
        this.Titulo = "Padre de familia";
        this.Temporadas = 3;
        this.Entregado = false;
        this.Creador = "Seth Macfarlane";
        this.Genero = "Humor";
    }

    public serie(String titulo, String creador) {
        Titulo = titulo;
        Creador = creador;
        this.Temporadas = 3;
        this.Entregado = false;
        this.Creador = "Seth Macfarlane";
        this.Genero = "Humor";
    }

    public serie(String titulo, int temporadas, String genero, String creador) {
        Titulo = titulo;
        Temporadas = temporadas;
        Genero = genero;
        Creador = creador;
        this.Entregado = false;
    }

    //getter and setter


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public int getTemporadas() {
        return Temporadas;
    }

    public void setTemporadas(int temporadas) {
        Temporadas = temporadas;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCreador() {
        return Creador;
    }

    public void setCreador(String creador) {
        Creador = creador;
    }

    //metodo
    public void Entregar(){
        this.Entregado = true;

    }

    public void Devolver(){
        this.Entregado = false;
    }

    public int compareTo(Object a){
        serie ref = (serie) a;
        int max = 0;
        if (max < ref.getTemporadas()){
            max = ref.getTemporadas();

        }

        return max;
    }

    @Override
    public String toString() {
        return "Informacion de la serie: " + '\n' +
                "   Titulo='" + Titulo + '\n' +
                "   Temporadas=" + Temporadas +'\n'+
                "   Genero='" + Genero + '\n' +
                "   Creador='" + Creador + '\n';
    }
}
