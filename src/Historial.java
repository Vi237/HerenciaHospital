public class Historial {
    String codHisrorial;
    Paciente paciente;

    public Historial(String codHisrorial, Paciente paciente) {
        this.codHisrorial = codHisrorial;
        this.paciente = paciente;
    }

    public String getCodHisrorial() {
        return codHisrorial;
    }

    public void setCodHisrorial(String codHisrorial) {
        this.codHisrorial = codHisrorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
