package objetos;

public class Copo {
    public String beber(String estado){
        try {
            if (estado.equals("cheio") || estado.equals("meio cheio")){
                return "Bebível";
            } else {
                return "Não bebível";
            }
        } catch (Exception e) {
            return "Erro";
        }
    }
}