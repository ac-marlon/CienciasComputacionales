package Mundo;

public class Gamer {

    private String nombre;
    private String campeon;
    private int asesinatos;
    private int muertes;
    private int asistencias;
    private int victorias;
    private int derrotas;

    public final int VICTORIA = 1;
    public final int DERROTA = 0;

    public Gamer() {

    }

    public Gamer(String nombre, String campeon) {
        this.nombre = nombre;
        this.campeon = campeon;
    }

    public String consultarNombre() {
        return nombre;
    }

    public void modificarNombre(String n) {
        nombre = n;
    }

    public String consultarCampeon() {
        return campeon;
    }

    public void modificarCampeon(String c) {
        campeon = c;
    }

    public int consultarAsesinatos() {
        return asesinatos;
    }

    public void modificarAsesinatos(int a) {
        asesinatos = a;
    }

    public int consultarMuertes() {
        return muertes;
    }

    public void modificarMuertes(int m) {
        muertes = m;
    }

    public int consultarAsistencias() {
        return asistencias;
    }

    public void modificarAsistencias(int as) {
        asistencias = as;
    }

    public int consultarVictorias() {
        return victorias;
    }

    public void modificarVictorias(int v) {
        victorias = v;
    }

    public int consultarDerrotas() {
        return derrotas;
    }

    public void modificarDerrotas(int d) {
        derrotas = d;
    }

    public void registrarPartida(int a, int m, int as, int g) {
        asesinatos = asesinatos + a;
        muertes = muertes + m;
        asistencias = asistencias + as;
        if (g == VICTORIA) {
            victorias = victorias + 1;
        } else {
            derrotas = derrotas + 1;
        }
    }

    public double determinarKDA() {
        double kda = 0;
        if ((double)muertes == 0) {
            return kda;
        } else {
            kda = ((double)asesinatos + (double)asistencias) / (double)muertes;
            return kda;
        }
    }

    public double calcularWinRate() {
        double wr = 0;
        if ((double)victorias == 0 && (double)derrotas == 0) {
            return wr;
        } else {
            wr = ((double)victorias / ((double)victorias + (double)derrotas)) * 100;
            return wr;
        }
    }

}
