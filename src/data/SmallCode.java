package data;

final public class SmallCode {
    // The tax identification number in the Spanish state.
    private final String smallCode;

    public SmallCode(String code) throws Exception {
        if (code == null ){
            throw new NullPointerException();
        }else if (!validoSmallCode(code)){
            throw new Exception("El SmallCode NO es valido .Tiene que contener 3 digitos.");
        } else this.smallCode = code;
    }
    public Boolean contieneSoloNumeros(String code){
        if(code.length() == 0)
            return false;
        else {
            for (int cont = 0;cont<code.length();cont++){
               char digit = code.charAt(cont);
                if(!(digit>='0' && digit<='9')){
                    return false;
                }
            }
        }
        return true;
    }
    public Boolean validoSmallCode(String code){
        if(code.length()!=3 || !contieneSoloNumeros(code)){
            return false;
        } else return true;
    }
    public String getSmallCode () { return smallCode; }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmallCode smallCodee = (SmallCode) o;
        return smallCode.equals(smallCodee.smallCode);
    }
    @Override
    public int hashCode () { return smallCode.hashCode(); }
    @Override
    public String toString () {
        return "SmallCode{" + "smallcode ciudadano='" + smallCode + '\'' + '}';
    }
}
