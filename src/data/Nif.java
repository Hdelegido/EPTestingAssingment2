package data;
/**
 * Essential data classes
 */
final public class Nif {
    // The tax identification number in the Spanish state.
    private final String nif;
    public Nif(String code) {
     if (code == null){
         throw new NullPointerException("Parameter is null.");
     }else if(!isValidNif(code) ){
         throw new IllegalArgumentException();
     }else this.nif = code;
    }
    public boolean isValidNif(String nif){
        if (nif.length()!=9 || !Nif8Num1Letter(nif) ){
            return false;
        }else return true;
    }
    public boolean Nif8Num1Letter(String nif){
        if (nif.substring(0,7).matches("[0-9]*") & nif.substring(8).matches("[A-Z]*")){
            return true;
        }else return false;
    }
    public String getNif () { return nif; }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif niff = (Nif) o;
        return nif.equals(niff.nif);
    }
    @Override
    public int hashCode () { return nif.hashCode(); }
    @Override
    public String toString () {
        return "Nif{" + "nif ciudadano='" + nif + '\'' + '}';
    }
}
