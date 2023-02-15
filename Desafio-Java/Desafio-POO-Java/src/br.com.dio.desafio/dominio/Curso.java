

public class Curso extends Coteudo{
   
    private int cargaHoraria;

    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

   
    public int getCargaHoraria() {
        return cargaHoraria;
    }
    public String setData (int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;

        public  String toString () {
            return "Curso{" + 
                    "titulo" + getTitulo() + '\'' +
                    ", descricao ='" + getDescricao() + '\'' + 
                    ", cargaHoraria=" + cargaHoraria +
                    '}';
        }
        
    }
    
}