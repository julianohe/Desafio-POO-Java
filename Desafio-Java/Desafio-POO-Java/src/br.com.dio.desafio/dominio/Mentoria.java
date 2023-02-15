import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private static final double XP_PADRAO = 0;
    private LocalDate data ;

   public double calcularXp() {
    return XP_PADRAO + 20d;
   }
   public Mentoria(){

   }
    public LocalDate getData() {
        return data;
    }
    public String setData (LocalDate data) {
        this.data = data;
        
        public String toString () {
            return "Mentoria{" + 
                    "titulo" + getTitulo() + '\'' +
                    ", descricao ='" + getDescricao() + '\'' + 
                    ", data=" + data +
                    '}';
        }

    }


}