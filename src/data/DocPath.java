package data;
import java.io.File;

final public class DocPath {

    private final String DocPath;
    public DocPath(String code) throws Exception {
        if (code == null){
            throw new NullPointerException();
        } else{
                File path =  new File(code);
                if(path.isDirectory()){
                    this.DocPath=path.getAbsolutePath();
                }else {
                    throw new Exception();
                }

        }
    }
    public String getDocPath () { return DocPath; }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocPath docPathh = (DocPath) o;
        return DocPath.equals(docPathh.DocPath);
    }
    @Override
    public int hashCode () { return DocPath.hashCode(); }
    @Override
    public String toString () {
        return "DocPath{" + "DocPath='" + DocPath + '\'' + '}';
    }
}