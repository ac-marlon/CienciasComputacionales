package Mundo;

public class EquipoLoL {

    private String nombre;
    private String liga;
    private int victorias;
    private int derrotas;

    private Gamer gamer1;
    private Gamer gamer2;
    private Gamer gamer3;
    private Gamer gamer4;
    private Gamer gamer5;

    public final int VICTORIA = 1;
    public final int DERROTA = 0;

    public EquipoLoL(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
    }

    public String consultarNombre() {
        return nombre;
    }

    public void modificarNombre(String n) {
        nombre = n;
    }

    public String consultarLiga() {
        return liga;
    }

    public void modificarLiga(String l) {
        liga = l;
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

    public Gamer consultarGamer1() {
        return gamer1;
    }

    public Gamer consultarGamer2() {
        return gamer2;
    }

    public Gamer consultarGamer3() {
        return gamer3;
    }

    public Gamer consultarGamer4() {
        return gamer4;
    }

    public Gamer consultarGamer5() {
        return gamer5;
    }

    public boolean determinarEqCompleto() {
        boolean completo = false;
        if (gamer1 != null && gamer2 != null && gamer3 != null && gamer4 != null && gamer5 != null) {
            completo = true;
        }
        return completo;
    }

    public boolean determinarEqVacío() {
        boolean vacío = false;
        if (gamer1 == null && gamer2 == null && gamer3 == null && gamer4 == null && gamer5 == null) {
            vacío = true;
        }
        return vacío;
    }

    public int registrarGamer(String n, String c) {
        int reg = 0;
        if (determinarEqCompleto() == true) {
            return reg;
        } else if (gamer1 == null) {
            gamer1 = new Gamer(n, c);
            reg = 1;
        } else if (gamer2 == null) {
            gamer2 = new Gamer(n, c);
            reg = 2;
        } else if (gamer3 == null) {
            gamer3 = new Gamer(n, c);
            reg = 3;
        } else if (gamer4 == null) {
            gamer4 = new Gamer(n, c);
            reg = 4;
        } else if (gamer5 == null) {
            gamer5 = new Gamer(n, c);
            reg = 5;
        }
        return reg;
    }

    public Gamer retirarGamer(String n) {
        Gamer g = new Gamer();
        if (gamer1 != null && n.equals(gamer1.consultarNombre())) {
            g = gamer1;
            gamer1 = null;
        } else if (gamer2 != null && n.equals(gamer2.consultarNombre())) {
            g = gamer2;
            gamer2 = null;
        } else if (gamer3 != null && n.equals(gamer3.consultarNombre())) {
            g = gamer3;
            gamer3 = null;
        } else if (gamer4 != null && n.equals(gamer4.consultarNombre())) {
            g = gamer4;
            gamer4 = null;
        } else if (gamer5 != null && n.equals(gamer5.consultarNombre())) {
            g = gamer5;
            gamer5 = null;
        }
        return g;
    }

    public Gamer consultarGamer(String n) {
        Gamer g = new Gamer();
        if (gamer1 != null && n.equals(gamer1.consultarNombre())) {
            g = gamer1;
        } else if (gamer2 != null && n.equals(gamer2.consultarNombre())) {
            g = gamer2;
        } else if (gamer3 != null && n.equals(gamer3.consultarNombre())) {
            g = gamer3;
        } else if (gamer4 != null && n.equals(gamer4.consultarNombre())) {
            g = gamer4;
        } else if (gamer5 != null && n.equals(gamer5.consultarNombre())) {
            g = gamer5;
        }
        return g;
    }

    public void registrarPartida(String n, int a, int m, int as, int g) {
        if (consultarGamer1() != null && consultarGamer1().consultarNombre().equals(n)) {
            consultarGamer1().registrarPartida(a, m, as, g);
        } else if (consultarGamer2() != null && consultarGamer2().consultarNombre().equals(n)) {
            consultarGamer2().registrarPartida(a, m, as, g);
        } else if (consultarGamer3() != null && consultarGamer3().consultarNombre().equals(n)) {
            consultarGamer3().registrarPartida(a, m, as, g);
        } else if (consultarGamer4() != null && consultarGamer4().consultarNombre().equals(n)) {
            consultarGamer4().registrarPartida(a, m, as, g);
        } else if (consultarGamer5() != null && consultarGamer5().consultarNombre().equals(n)) {
            consultarGamer5().registrarPartida(a, m, as, g);
        }
        if (g == VICTORIA) {
            modificarVictorias(consultarVictorias() + 1);
        } else {
            modificarDerrotas(consultarDerrotas() + 1);
        }
    }

    public double calcularWinRate() {
        double wr = 0;
        if ((double) consultarVictorias() == 0 && (double) consultarDerrotas() == 0) {
            return wr;
        } else {
            wr = ((double) consultarVictorias() / ((double) consultarVictorias() + (double) consultarDerrotas())) * 100;
            return wr;
        }
    }

    public String mejorJugador(String j) {
        String jug = "";
        double mayorKda = 0;
        int mayorAsesinatos = 0;
        if ("Mejor por KDA".equals(j)) {
            if (consultarGamer1() != null && consultarGamer1().determinarKDA() > mayorKda) {
                mayorKda = consultarGamer1().determinarKDA();
                jug = consultarGamer1().consultarNombre();
            }
            if (consultarGamer2() != null && consultarGamer2().determinarKDA() > mayorKda) {
                mayorKda = consultarGamer2().determinarKDA();
                jug = consultarGamer2().consultarNombre();
            }
            if (consultarGamer3() != null && consultarGamer3().determinarKDA() > mayorKda) {
                mayorKda = consultarGamer3().determinarKDA();
                jug = consultarGamer3().consultarNombre();
            }
            if (consultarGamer4() != null && consultarGamer4().determinarKDA() > mayorKda) {
                mayorKda = consultarGamer4().determinarKDA();
                jug = consultarGamer4().consultarNombre();
            }
            if (consultarGamer5() != null && consultarGamer5().determinarKDA() > mayorKda) {
                jug = consultarGamer5().consultarNombre();
            }
        } else if ("Mejor por asesinatos".equals(j)) {
            if (consultarGamer1() != null && consultarGamer1().consultarAsesinatos() > mayorAsesinatos) {
                mayorAsesinatos = consultarGamer1().consultarAsesinatos();
                jug = consultarGamer1().consultarNombre();
            }
            if (consultarGamer2() != null && consultarGamer2().consultarAsesinatos() > mayorAsesinatos) {
                mayorAsesinatos = consultarGamer2().consultarAsesinatos();
                jug = consultarGamer2().consultarNombre();
            }
            if (consultarGamer3() != null && consultarGamer3().consultarAsesinatos() > mayorAsesinatos) {
                mayorAsesinatos = consultarGamer3().consultarAsesinatos();
                jug = consultarGamer3().consultarNombre();
            }
            if (consultarGamer4() != null && consultarGamer4().consultarAsesinatos() > mayorAsesinatos) {
                mayorAsesinatos = consultarGamer4().consultarAsesinatos();
                jug = consultarGamer4().consultarNombre();
            }
            if (consultarGamer5() != null && consultarGamer5().consultarAsesinatos() > mayorAsesinatos) {
                jug = consultarGamer5().consultarNombre();
            }
        }
        return jug;
    }
}
