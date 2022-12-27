package data;

import exceptions.NifInvalidFormatException;

/**
 * Essential data classes
 */
final public class Nif {
    // The tax identification number in the Spanish state.
    private final String nif;

    public Nif(String code) throws NifInvalidFormatException {
        if (code == null) throw new NullPointerException("Nif can't be null");
        if (!validFormat(code)) throw new NifInvalidFormatException("Nif must consist of 8 digits + 1 letter");
        this.nif = code;
    }

    private boolean validFormat(String code) {
        if (code.length() != 9) return false;
        boolean validDigits = code.substring(0, code.length() - 1).chars().allMatch(Character::isDigit);
        return validDigits && Character.isLetter(code.charAt(code.length() - 1));
    }

    public String getNif() {
        return nif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif otherNiff = (Nif) o;
        return nif.equals(otherNiff.nif);
    }

    @Override
    public int hashCode() {
        return nif.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Nif{nif='%s'}", nif);
    }
}