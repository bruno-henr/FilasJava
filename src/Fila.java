public class Fila {
    private No refEntrada;

    public Fila() {
        this.refEntrada = null;
    }

    public void enqueue(No novoNo) {
        novoNo.setRefNo(refEntrada);
        refEntrada = novoNo;
    }

    @Override
    public String toString() {
        String s = "";
        No aux = this.refEntrada;
        if(this.refEntrada != null) {
            while(true) {
                s += "[ No { objeto = "+ aux.getObject() + " } ]";

                if(aux.getRefNo() != null) {
                    aux = aux.getRefNo();
                } else {
                    s += "null";
                    break;
                }
            }
        } else {
            s = "null";
        }

        return s;
    }

    public No first() {
        if(!this.isEmpty()) {
            No aux = this.refEntrada;
            while(true) {
                if(aux.getRefNo() != null) {
                    aux = aux.getRefNo();
                } else {
                    break;
                }
            }
            return aux;
        }
        return null;
    }

    public No dequeue() {
        if(!this.isEmpty()) {
            No aux = this.refEntrada;
            No NoAuxiliar = this.refEntrada;
            while(true) {
                if(aux.getRefNo() != null) {
                    NoAuxiliar = aux;
                    aux = aux.getRefNo();
                } else {
                    NoAuxiliar.setRefNo(null);
                    break;
                }
            }
            return aux;
        }
        return null;
    }

    public boolean isEmpty() {
        return this.refEntrada == null;
    }
}
