package data;

final public class DigitalSignature {
    // The tax identification number in the Spanish state.
    private final Byte DigitalSignature;

    public DigitalSignature(Byte code) {
        if (code == null){
            throw new NullPointerException();
        }
        else this.DigitalSignature = code;
    }
    public Byte getDigitalSignature () { return DigitalSignature; }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DigitalSignature digitalSignatureeh = (DigitalSignature) o;
        return DigitalSignature.equals(digitalSignatureeh);
    }
    @Override
    public int hashCode () { return DigitalSignature.hashCode(); }
    @Override
    public String toString () {
        return "DigitalSignature{" + "DigitalSignature='" + DigitalSignature + '\'' + '}';
    }
}