
package factura;

public class Cliente extends Persona {

    private String rtn;

    public Cliente() {
    }

    public Cliente(String rtn) {
        this.rtn = rtn;
    }

    public Cliente(String rtn, String nombre, String apellido) {
        super(nombre, apellido);
        this.rtn = rtn;
    }

    public String getRtn() {
        return rtn;
    }

    public void setRtn(String rtn) {
        this.rtn = rtn;
    }

}
