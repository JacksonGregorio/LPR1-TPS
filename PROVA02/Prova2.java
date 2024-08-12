public class Prova2 {

    //Jackson de Lima Gregório
    
    //Bruno Souza
    public static void main(String[] args) {
        ConsultaAgendada p1 = new ConsultaAgendada(10, 30, 0, 15, 12, 2022, "Jaquison", "Dr.Tuler De Moraes" );

        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());
        System.out.println("Quantidade: " + ConsultaAgendada.getQuantidade());

        System.out.println("Digite os dados da nova consulta agendada: ");

        ConsultaAgendada p2 = new ConsultaAgendada();

        System.out.println("Data: " + p2.getData());
        System.out.println("Hora: " + p2.getHora());
        System.out.println("Nome do Paciente: " + p2.getNomePaciente());
        System.out.println("Nome do Médico: " + p2.getNomeMedico());


        System.out.println("Por favor insira os dados abaixo para completar as atualizações da consulta do: ");

        System.out.println("Paciente: " + p1.getNomePaciente() + " e "+" Médico: " + p1.getNomeMedico());
        System.out.println("No Dia: ");
        System.out.println("Data: " + p1.getData());
        System.out.println("No horário de: ");
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Digite os novos dados: ");
        p1.setData();
        p1.setHora();
        p1.setNomePaciente();
        p1.setNomeMedico();

        System.out.println("Data: " + p1.getData());
        System.out.println("Hora: " + p1.getHora());
        System.out.println("Nome do Paciente: " + p1.getNomePaciente());
        System.out.println("Nome do Médico: " + p1.getNomeMedico());

        System.out.println("Quantidade: " + ConsultaAgendada.getQuantidade());
    }
}